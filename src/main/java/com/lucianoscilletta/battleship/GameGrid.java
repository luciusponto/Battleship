package com.lucianoscilletta.battleship;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.sound.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;
import java.util.*;
import java.io.*;

public class GameGrid implements Serializable{
	private final int maxSize = 20;
	private Ship lastSunk = null;
	private Ship tempShip = null;
	private ArrayList<Ship> shipsList = new ArrayList<Ship>();
	private ArrayList<GameCoordinate> coords = null;
	private int sizeX = 0; // 1-based
	private int sizeY = 0; // 1-based
	private int shipCount = 0;
	private GridStatus grid[][];
	private Ship ships[][];
	private Boolean gameOver = false;
	private int shipCountPerSize[] = {0, 0, 0, 0, 0};
	private Boolean maxShipsPerSizeReached[] = {false, false, false, false, false};
	private Boolean allShipsAllocated = false;
	public GameGrid(int sizeX, int sizeY){
		if ((sizeX > maxSize) || (sizeY > maxSize) || (sizeX < 1) || (sizeY < 1)){
			Err.msgExit("GameGrid: size out of range");
		}
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		reset();
	}
	public void reset(){
		allShipsAllocated = false;
		lastSunk = null;
		ArrayList<GameCoordinate> coords = null;
		gameOver = false;
		shipCount = 0;
		grid = new GridStatus[sizeX][sizeY];
		ships = new Ship[sizeX][sizeY];
		for (int i = 0; i < sizeX; i++){
			for (int j = 0; j < sizeY; j++){
				grid[i][j] = GridStatus.UNKNOWN;
				ships[i][j] = null;
			}
		}
		for (int i = 0; i < 5; i++){
			shipCountPerSize[i] = 0;
			maxShipsPerSizeReached[i] = false;
		}
		shipsList.clear();
	}
	public Boolean maxShipsPerSize(int size){
		return maxShipsPerSizeReached[size - 1];
	}
	public int shipsPerSize(int size){
		return shipCountPerSize[size - 1];
	}

	public GridStatus getStatus(int x, int y){
		return grid[x][y];
	}

	public int getLines(){
		return sizeX;
	}
	public int getCols(){
		return sizeY;
	}

	public Boolean isCellBusy(int x, int y){
		if (null != ships[x][y]){
			return true;
		} else {
			return false;
		}
	}

	public Boolean shipFits(int x, int y, int length, Boolean horizontal){
		if ((x < 0) || (y < 0)){
			return false;
		}
		//check if grid is big enough
		if (horizontal){
			if ((x + length > sizeX) || (y + 1 > sizeY)){
				return false;
			}
		}else{
			if ((x + 1 > sizeX) || (y + length > sizeY)){
				return false;
			}
		}
		//check if cells are empty
		for (int i = 0; i < length; i++){
			if (horizontal){
				if (null != ships[x + i][y]){
					return false;
				}
			} else {
				if (null != ships[x][y + i]){
					return false;
				}
			}
		}
		return true;
	}
	public void addShip(int x, int y, int length, Boolean horizontal){
		if (false == shipFits(x, y, length, horizontal)){
			Err.msg("GameGrid.addShip: ship does not fit");
		} else {
			if (!(length > 5 || length < 1)){
				if (!maxShipsPerSizeReached[length -1]){
					shipCount++;
					shipCountPerSize[length - 1]++;
					Ship newShip = new Ship(x, y, length, horizontal);
					for (int i = 0; i < length; i++){
						if (horizontal){
							ships[x + i][y] = newShip;
						} else {
							ships[x][y + i] = newShip;
						}
					}
					shipsList.add(newShip);
				}
			} else {
				Err.msgExit("GameGrid.addShip: invalid length");
			}
		}
		if (shipCountPerSize[length - 1] == GraphicsEngine.shipAmountPerType[length - 1]){
			maxShipsPerSizeReached[length - 1] = true;
		}
	}

	public void removeShip(int x, int y){
		Ship tempShip = ships[x][y];
		if (null != tempShip){
			shipCountPerSize[ships[x][y].getLength() - 1]--;
			GameCoordinate coord = null;
			ArrayList<GameCoordinate> coords = ships[x][y].getCoords();
			for (int i = 0; i < coords.size(); i++){
				coord = coords.get(i);
				ships[coord.getX()][coord.getY()] = null;
				grid[coord.getX()][coord.getY()] = GridStatus.UNKNOWN;
			}
			shipCount--;
			maxShipsPerSizeReached[ships[x][y].getLength() - 1] = false;
			shipsList.remove(tempShip);
		}
	}

	public Boolean isPristine(int x, int y){
		if (GridStatus.UNKNOWN == grid[x][y]){
			return true;
		} else {
			return false;
		}
	}

	public Boolean shootCell(int x, int y){
		if ((x >= sizeX) || (y >= sizeY)){
			Err.msgExit("GameGrid.checkCell: coordinates out of range");
		}
		//if cell was already shot at, do not allow a new shot
		if (!isPristine(x, y)){
			alreadyShot(x, y);
			return false;
		}
		//when a ship is hit
		if (null != ships[x][y]){
			hit(x, y);
		} else {
			//when water is hit
			water(x, y);
		}
		return true;
	}

	public void hit(int x, int y){
		(new SoundEffect(SoundEffect.Effect.EXPLOSION)).start();
		ships[x][y].hit();
		grid[x][y] = GridStatus.HIT;
		notifyEnemy(x, y, GridStatus.HIT);
		//Err.msg("Hit");
		//when a ship sinks
		if (ships[x][y].isSunk()){
			sunk(x, y);
		}
		GraphicsEngine.incEnemyHits();
	}
	public Ship getShip(int x, int y){
		return ships[x][y];
	}
	public Ship getShip(int index){
		return shipsList.get(index);
	}
	public void notifyEnemy(int i, int j, GridStatus status){
		GraphicsEngine.netSend(GraphicsEngine.stStatus + GraphicsEngine.stSep + status.toString() + GraphicsEngine.stSep + Integer.toString(i) + GraphicsEngine.stSep + Integer.toString(j));
	}
	public void sunk(int x, int y){
		coords = ships[x][y].getCoords();
		for (GameCoordinate coord : coords){
			grid[coord.getX()][coord.getY()] = GridStatus.SUNK;
			notifyEnemy(coord.getX(), coord.getY(), GridStatus.SUNK);
		}
		lastSunk = ships[x][y];
		shipCount--;
		//Err.msg("Sunk");
		if (1 == shipCount){
			lastShip();
		}
		if (0 == shipCount){
			gameOver();
		}
	}
	public void alreadyShot(int x, int y){
		//Err.msg("Already shot here");
	}
	public void water(int x, int y){
		(new SoundEffect(SoundEffect.Effect.SPLASH)).start();
		grid[x][y] = GridStatus.WATER;
		notifyEnemy(x, y, GridStatus.WATER);
		//Err.msg("Water");
	}
	public void setStatus(int x, int y, String status){
		if (GridStatus.WATER.toString().equals(status)){
			grid[x][y] = GridStatus.WATER;
		} else if (GridStatus.HIT.toString().equals(status)){
			grid[x][y] = GridStatus.HIT;
		} else if (GridStatus.SUNK.toString().equals(status)){
			grid[x][y] = GridStatus.SUNK;
		}
	}
	public void lastShip(){
		GameEmergencyLight.light();
		//Err.msg("Emergency");
	}
	public void gameOver(){
		//Err.msgExit("Game Over");
		(new SoundEffect(SoundEffect.Effect.EXPLOSION_LONG)).start();
		gameOver = true;
	}
	public ArrayList<GameCoordinate> getLastSunkCoords(){
		return coords;
	}
	public Boolean getGameOver(){
		return gameOver;
	}
	public Boolean isGameOver(){
		return gameOver;
	}
	public void resetGameOver(){
		gameOver = false;
	}
	public int getShipCount(){
		return shipCount;
	}
	public int getShipsListSize(){
		return shipsList.size();
	}
}
