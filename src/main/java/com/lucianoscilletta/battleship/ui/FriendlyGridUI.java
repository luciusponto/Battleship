package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.sound.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;
import java.util.*;

public class FriendlyGridUI extends GameComponent {
	private Graphics2D gr2DBkg;
	private Graphics2D grFg;
	private BufferedImage bkgImage = null;
	private BufferedImage fgImage = null;
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
	private Boolean showCircles = true;
	private int circles = 3;
	private RadarCircles radarCircles;
	private int hSpacing = 0;
	private int vSpacing = 0;
	private GameGrid grid;
	private int i;
	private int j;
	private int green[][];
	private int red[][];
	private int coordX[][];
	private int coordY[][];
	private Ship tempShip;
	private GridStatus tempStatus;
	private AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);

	public FriendlyGridUI(GameGrid grid, GameGraphics grBkg){
		super();
		this.grid = grid;
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
		this.setBorder(GraphicsEngine.defBorder);

		bkgImage = GameUtils.classToImage(grBkg);
		fgImage = new BufferedImage(grBkg.getOrigWidth(), grBkg.getOrigHeight(), BufferedImage.TYPE_INT_ARGB);
		grFg = (Graphics2D)fgImage.getGraphics();
		gr2DBkg = (Graphics2D)bkgImage.getGraphics();
		width = grBkg.getOrigWidth();
		height = grBkg.getOrigHeight();
		updateBkg();
		if (showCircles){
			radarCircles = new RadarCircles(0, 0, grBkg.getOrigWidth(), grBkg.getOrigHeight(), circles, 0.025f, 0.0f, true, GameColors.mediumGreen);
		}
		this.addMouseListener(new MouseEventListener());
		this.coordX = new int[lines][cols];
		this.coordY = new int[lines][cols];
		green = new int[lines][cols];
		red =  new int[lines][cols];
		for (int i = 0; i < lines; i++){
			for (int j = 0; j < cols; j++){
				coordX[i][j] = Math.round(i * cellSizeX);
				coordY[i][j] = Math.round(j * cellSizeY);
				green[i][j] = -1;
				red[i][j] = -1;
			}
		}
	}

	public static int getLines(){
		return lines;
	}
	public static int getCols(){
		return cols;
	}
	public static int getCellSizeX(){
		return (int)cellSizeX;
	}
	public static int getCellSizeY(){
		return (int)cellSizeY;
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

	public void paintComponent(Graphics2D g){
		g.drawImage(bkgImage, 0, 0, null);
		g.drawImage(fgImage, 0, 0, null);
		if (showCircles){
			radarCircles.paintComponent(g);
		}
	}

	public void updateBkg(){
		//grFg.setColor(new Color(0, 0, 0, 0));
		grFg.setColor(GameColors.darkGreen);
		grFg.fillRect(0, 0, width, height);
		for (i = 0; i < grid.getShipsListSize(); i++){
			tempShip = grid.getShip(i);
			tempShip.paint(grFg, cellSizeX, cellSizeY);
		}
	}

	public void shoot(int i, int j){
		grid.shootCell(i, j);
		if (grid.isGameOver()){
			GraphicsEngine.incEnemyScore();
			GraphicsEngine.postMatch(false);
			GraphicsEngine.netSend(GraphicsEngine.stMatchOver);
		}
		//GraphicsEngine.repaint();
	}

	public void drawGrid(Graphics2D g){
		g.drawImage(bkgImage, 0, 0, null);
	}

	class MouseEventListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
	}
}


