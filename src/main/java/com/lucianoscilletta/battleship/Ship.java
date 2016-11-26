package com.lucianoscilletta.battleship;

import java.util.*;
import java.io.*;
import java.awt.*;
import com.lucianoscilletta.battleship.graphics.*;

public class Ship implements Serializable{
	private int length = 0;
	private int x = 0;
	private int y = 0;
	private int health = 100;
	private int hits = 0;
	private int hitPoints = length;
	private Boolean sunk = false;
	private Boolean horizontal = true;
	private ArrayList<GameCoordinate> coords = new ArrayList<GameCoordinate>();
	public Ship(int x, int y, int length, Boolean horizontal){
		this.length = length;
		this.horizontal = horizontal;
		this.x = x;
		this.y = y;
		for (int i = 0; i < length; i++){
			if (horizontal){
				this.coords.add(new GameCoordinate(x + i, y));
			} else {
				this.coords.add(new GameCoordinate(x, y + i));
			}
		}
		this.hitPoints = length;
	}
	public void hit(){
		if (hits < length){
			hits++;
			health = (100 * (length - hits)) / length;
		}
		if (0 == health){
			sunk = true;
		}
		hitPoints = length - hits;
	}
	public Boolean isSunk(){
		return sunk;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getHealth(){
		return health;
	}
	public ArrayList<GameCoordinate> getCoords(){
		return coords;
	}
	public int getLength(){
		return length;
	}
	public int getHitPoints(){
		return hitPoints;
	}
	public Boolean isHorizontal(){
		return horizontal;
	}
	public void paint(Graphics2D g, float squareX, float squareY){
		float border = (float)0.2;
		int x0 = Math.round(coords.get(0).getX() * squareX);
		int y0 = Math.round(coords.get(0).getY() * squareY);
		int sx0 = Math.round(squareX*border);
		int sy0 = Math.round(squareY * border);
		g.setColor(GameColors.friendly[length-1][hitPoints]);
		if (horizontal){
			if (1 == length){
				g.fillRect(x0 + sx0, y0 + sy0, Math.round(squareX-(2*sx0)), Math.round(squareY-(2*sy0)));
			} else {
				g.fillRect(x0 + sx0, y0 + sy0, Math.round(squareX-sx0), Math.round(squareY-(2*sy0)));
				g.fillRect(x0 + Math.round(squareX * (length - 1)), y0 + sy0, Math.round(squareX-sx0), Math.round(squareY-(2*sy0)));
			}
			for (int i = 1; i < length-1; i++){
				g.fillRect(x0 + (int)Math.floor(i * squareX), y0 + sy0, (int)Math.ceil(squareX), Math.round(squareY-(2*sy0)));

			}
		} else {
			if (1 == length){
				g.fillRect(x0 + sx0, y0 + sy0, Math.round(squareX-(2*sx0)), Math.round(squareY-(2*sy0)));
			} else {
				g.fillRect(x0 + sx0, y0 + sy0, Math.round(squareX-(2*sx0)), Math.round(squareY-sy0));
				g.fillRect(x0 + sx0, y0 + Math.round(squareY * (length - 1)),  Math.round(squareX-(2*sx0)), Math.round(squareY-sy0));
			}
			for (int i = 1; i < length-1; i++){
				g.fillRect(x0 + sx0, y0 + (int)Math.floor(i * squareY), Math.round(squareX-(2*sx0)), (int)Math.ceil(squareY));

			}
		}

	}
}