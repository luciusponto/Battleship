package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;
import java.util.*;

public class WarRoomGridUI extends GameComponent {
	private Graphics2D gr2DBkg;
	private BufferedImage bkgImage = null;
	private static BufferedImage shadowImage = null;
	private static Graphics2D grShadow;
	private static BufferedImage redShadowImage = null;
	private static Graphics2D grRedShadow;
	private static BufferedImage shipImage = null;
	private static Graphics2D grShip;
	private static Boolean greenShadow = true;
	private ArrayList<GameCoordinate> lastSunkCoords = null;
	private static float cellSizeX;
	private static float cellSizeY;
	private static int lines;
	private static int cols;
	private static int x0;
	private static int y0;
	private static int width;
	private static int height;
	private static int shadowX = -1;
	private static int shadowY = -1;
	private Boolean showGridLines = true;
	private RadarGrid radarGrid;
	private int hSpacing = 0;
	private int vSpacing = 0;
	private GameGrid grid;
	private int i;
	private int j;
	private BufferedImage elements[][];
	private int coordX[][];
	private int coordY[][];
	private GridStatus tempStatus;
	private AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
	private int drawStrategy = 1; //1 to add elements to bkgImage, 2 to redraw elements every time, 3 is like 1 but on a separate thread.
								  //1 causes a frame rate drop when element is added. 2 has a constant, slightly higher CPU usage.
								  //1 is recommended for static com.lucianoscilletta.battleship.graphics, 2 is recommended for animated com.lucianoscilletta.battleship.graphics.
	private static int shadowSize = 0;

	public WarRoomGridUI(GameGrid grid, GameGraphics grBkg){
		super();
		Dimension size = new Dimension(grBkg.getOrigWidth(), grBkg.getOrigHeight());
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(grBkg.getOrigX(), grBkg.getOrigY());
		x0 = grBkg.getOrigX();
		y0 = grBkg.getOrigY();
		this.lines = grid.getLines();
		this.cols = grid.getCols();
		this.cellSizeX = (float)grBkg.getOrigWidth() / (float)grid.getLines();
		this.cellSizeY = (float)grBkg.getOrigHeight() / (float)grid.getCols();
		bkgImage = GameUtils.classToImage(grBkg);
		gr2DBkg = (Graphics2D)bkgImage.getGraphics();
		shadowImage = new BufferedImage(grBkg.getOrigWidth(), grBkg.getOrigHeight(), BufferedImage.TYPE_INT_ARGB);
		grShadow = (Graphics2D)shadowImage.getGraphics();
		redShadowImage = new BufferedImage(grBkg.getOrigWidth(), grBkg.getOrigHeight(), BufferedImage.TYPE_INT_ARGB);
		grRedShadow = (Graphics2D)redShadowImage.getGraphics();
		shipImage = new BufferedImage((int)cellSizeX, (int)cellSizeY, BufferedImage.TYPE_INT_ARGB);
		grShip = (Graphics2D)shipImage.getGraphics();
		grShip.setColor(GameColors.transpBlue);
		grShip.fillRect(0, 0, (int)cellSizeX, (int)cellSizeY);
		width = grBkg.getOrigWidth();
		height = grBkg.getOrigHeight();
		if (showGridLines){
			radarGrid = new RadarGrid(0, 0, grBkg.getOrigWidth(), grBkg.getOrigHeight(), grid.getLines(), grid.getCols(), Color.black);
		}
		//imageWater = GameUtils.classToImage(grWater, (double)cellSizeX/(double)grWater.getOrigWidth(), (double)cellSizeY/(double)grWater.getOrigHeight());
		//imageHit = GameUtils.classToImage(grHit, (double)cellSizeX/(double)grHit.getOrigWidth(), (double)cellSizeY/(double)grHit.getOrigHeight());
		//imageSunk = GameUtils.classToImage(grSunk, (double)cellSizeX/(double)grSunk.getOrigWidth(), (double)cellSizeY/(double)grSunk.getOrigHeight());
		this.grid = grid;
		this.addMouseListener(new MouseEventListener());
		//GraphicsEngine.frame.addKeyListener(new ButtonKeyAdapter());
		this.coordX = new int[lines][cols];
		this.coordY = new int[lines][cols];
		for (int i = 0; i < lines; i++){
			for (int j = 0; j < cols; j++){
				coordX[i][j] = Math.round(i * cellSizeX);
				coordY[i][j] = Math.round(j * cellSizeY);
				//coordX[i][j] = i * Math.round(cellSizeX);
				//coordY[i][j] = j * Math.round(cellSizeY);
			}
		}
	}

	public static int getLines(){
		return lines;
	}
	public static int getCols(){
		return cols;
	}
	public static float getCellSizeX(){
		return cellSizeX;
	}
	public static float getCellSizeY(){
		return cellSizeY;
	}
	public static int getx0(){
		return x0;
	}
	public static int gety0(){
		return y0;
	}
	public static int getWidthS(){
		return width;
	}
	public static int getHeightS(){
		return height;
	}

	public static void genShadow(int size, Boolean horizontal){
		shadowImage = new BufferedImage(Math.round(cellSizeX * 5), Math.round(cellSizeY * 5), BufferedImage.TYPE_INT_ARGB);
		grShadow = (Graphics2D)shadowImage.getGraphics();
		grShadow.setColor(GameColors.transpGreen);
		redShadowImage = new BufferedImage(Math.round(cellSizeX * 5), Math.round(cellSizeY * 5), BufferedImage.TYPE_INT_ARGB);
		grRedShadow = (Graphics2D)redShadowImage.getGraphics();
		grRedShadow.setColor(GameColors.transpRed);
		if (horizontal){
			grShadow.fillRect(0, 0, Math.round( size * cellSizeX), Math.round(cellSizeY));
			grRedShadow.fillRect(0, 0, Math.round( size * cellSizeX), Math.round(cellSizeY));
		} else {
			grShadow.fillRect(0, 0, Math.round(cellSizeX), Math.round( size * cellSizeY));
			grRedShadow.fillRect(0, 0, Math.round(cellSizeX), Math.round( size * cellSizeY));
		}
	}

	public static void paintShadowB(Graphics2D g){
		if (greenShadow){
			g.setColor(GameColors.transpGreen);
		} else {
			g.setColor(GameColors.transpRed);
		}
		if (GameButtonShipSelector.isHorizontal()){
			g.fillRect(shadowX, shadowY, Math.round( GameButtonShipSelector.getSelectedSize() * cellSizeX), Math.round(cellSizeY));
		} else {
			g.fillRect(shadowX, shadowY, Math.round(cellSizeX), Math.round( GameButtonShipSelector.getSelectedSize() * cellSizeY));
		}
	}

	public static void paintShadow(int x0, int y0, int shipSize, Boolean horizontal){
		shadowImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		grShadow = (Graphics2D)shadowImage.getGraphics();
		grShadow.setColor(GameColors.transpBlue);
		if (horizontal){
			grShadow.fillRect(x0, y0, Math.round( shipSize * cellSizeX), Math.round(cellSizeY));
		} else {
		}
	}

	public static void setShadowPos(int line, int col){
		if (line > -1 && col > -1){
			shadowX = Math.round(line * cellSizeX);
			shadowY = Math.round(col * cellSizeY);
		} else {
			shadowX = -1;
			shadowY = -1;
		}
	}

	public static void setGreenShadow(Boolean isGreen){
		greenShadow = isGreen;
	}

	public void paintComponent(Graphics2D g){

		if ((1 == drawStrategy) || (3 == drawStrategy)){
			g.drawImage(bkgImage, 0, 0, null);
		}
		for (i = 0; i < lines; i++){
			for (j =0; j < cols; j++){
				if (GraphicsEngine.friendlyGrid.isCellBusy(i,j)){
					g.drawImage(shipImage, coordX[i][j], coordY[i][j], null);
				}
				if (2 == drawStrategy){
					if (null != elements[i][j]){
						g.drawImage(elements[i][j], coordX[i][j], coordY[i][j], null);
					}
				}
			}
		}
		if (showGridLines){
			radarGrid.paintComponent(g);
		}
		if ((shadowX > -1) && (shadowY > -1)){
			if (greenShadow){
				//g.drawImage(shadowImage, shadowX, shadowY, null);
				paintShadowB(g);
			} else {
				//g.drawImage(redShadowImage, shadowX, shadowY, null);
				paintShadowB(g);
			}
		}
	}

	public void drawGrid(Graphics2D g){
		g.drawImage(bkgImage, 0, 0, null);
	}

	public void updateBkg(int i, int j){
		/*
		switch (tempStatus){
			case WATER: gr2DBkg.drawImage(imageWater, Math.round(i * cellSizeX), Math.round(j * cellSizeY), null); break;
			case HIT: gr2DBkg.drawImage(imageHit, Math.round(i * cellSizeX), Math.round(j * cellSizeY), null);
				break;
			case SUNK:
				this.lastSunkCoords = grid.getLastSunkCoords();
				for (GameCoordinate coord: lastSunkCoords){
					gr2DBkg.drawImage(imageSunk, Math.round(coord.getX() * cellSizeX), Math.round(coord.getY() * cellSizeY), null);
				}
				break;
		}
		*/
	}

	public void shipsOnBkg(){

	}

	class MouseEventListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
			System.out.println("click");
			i = (int)((float)e.getX()/cellSizeX);
			j = (int)((float)e.getY()/cellSizeY);
			if (grid.shipFits(i, j, GameButtonShipSelector.getSelectedSize(), true)){

			}
			if ((i < lines) && (j < cols)){
				if (grid.isPristine(i, j)){
					tempStatus = grid.getStatus(i, j);
					if (1 == drawStrategy){
						updateBkg(i, j);
					}
					if (grid.getGameOver()){
						bkgImage = GameUtils.classToImage(new GameOver());
					}
					GraphicsEngine.repaint();
				}
			}
		}
	}
}


