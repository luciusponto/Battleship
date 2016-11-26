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

public class GridGameUI extends GameComponent {
	private Graphics2D gr2DBkg;
	private BufferedImage bkgImage = null;
	private BufferedImage imageWater = null;
	private BufferedImage imageHit = null;
	private BufferedImage imageSunk = null;
	private ArrayList<GameCoordinate> lastSunkCoords = null;
	private float cellSizeX;
	private float cellSizeY;
	private int lines;
	private int cols;
	private Boolean showGridLines = true;
	private Boolean showRadarEffect = true;
	private RadarGrid radarGrid;
	private RadarEffect radarEffect;
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
	private static int resolutionIndex = GraphicsEngine.getOptions().getGraphOptRes();
	private String statusString = null;
	private int statusI = -1;
	private int statusJ = -1;
	private ArrayList<GameCoordinate> updateCoords = null;
	//private RoundTimerUI timer;


	public GridGameUI(GameGrid grid, GameGraphics grBkg, GameGraphics grWater, GameGraphics grHit, GameGraphics grSunk){
		super();
		Dimension size = new Dimension(grBkg.getOrigWidth(), grBkg.getOrigHeight());
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(grBkg.getOrigX(), grBkg.getOrigY());
		this.lines = grid.getLines();
		this.cols = grid.getCols();
		this.cellSizeX = (float)grBkg.getOrigWidth() / (float)grid.getLines();
		this.cellSizeY = (float)grBkg.getOrigHeight() / (float)grid.getCols();
		this.setBorder(GraphicsEngine.defBorder);

		bkgImage = GameUtils.classToImage(grBkg);
		gr2DBkg = (Graphics2D)bkgImage.getGraphics();
		if (showGridLines){
			radarGrid = new RadarGrid(0, 0, grBkg.getOrigWidth(), grBkg.getOrigHeight(), grid.getLines(), grid.getCols());
		}
		if (!GraphicsEngine.animatedMode){
			showRadarEffect = false;
		}
		if (showRadarEffect){
			radarEffect = new RadarEffect(0, 0, grBkg.getOrigWidth(), grBkg.getOrigHeight());
		}
		imageWater = GameUtils.classToImage(grWater, (double)cellSizeX/(double)grWater.getOrigWidth(), (double)cellSizeY/(double)grWater.getOrigHeight());
		imageHit = GameUtils.classToImage(grHit, (double)cellSizeX/(double)grHit.getOrigWidth(), (double)cellSizeY/(double)grHit.getOrigHeight());
		imageSunk = GameUtils.classToImage(grSunk, (double)cellSizeX/(double)grSunk.getOrigWidth(), (double)cellSizeY/(double)grSunk.getOrigHeight());
		this.grid = grid;
		this.addMouseListener(new MouseEventListener());
		if (!(GraphicsEngine.getOptions().getGraphOptRes() == resolutionIndex)){ // in case of resolution change, screen must be restored
			resolutionIndex = GraphicsEngine.getOptions().getGraphOptRes();
			for (int i = 0; i < lines; i++){
				for (int j = 0; j < cols; j++){
					updateBkg(grid.getStatus(i, j).toString(), i, j);
				}
			}
			GraphicsEngine.repaint();
		} else { // Only execute in case the object was not recreated due to a screen resolution change
			grid.reset();
			if ((GraphicsEngine.getMatchCounter() % 2) == 1){
				if (GraphicsEngine.getShootFirst()){
					GraphicsEngine.setCanonLoaded(true);
				} else {
					GraphicsEngine.setCanonLoaded(false);
				}
			} else {
				if (GraphicsEngine.getShootFirst()){
					GraphicsEngine.setCanonLoaded(false);
				} else {
					GraphicsEngine.setCanonLoaded(true);
				}
			}
		}
	}

	public void paintComponent(Graphics2D g){
		g.drawImage(bkgImage, 0, 0, null);
		if (showRadarEffect){
			radarEffect.paintComponent(g);
		}
		if (showGridLines){
			radarGrid.paintComponent(g);
		}
	}

	public void drawGrid(Graphics2D g){
		g.drawImage(bkgImage, 0, 0, null);
	}

	public void updateBkg(String status, int i, int j){
		statusString = status;
		statusI = i;
		statusJ = j;
		updateBkg();
	}

	public void updateBkg(){
		if (statusString.equals(GridStatus.WATER.toString())){
			gr2DBkg.drawImage(imageWater, Math.round(statusI * cellSizeX), Math.round(statusJ * cellSizeY), null);
		} else if (statusString.equals(GridStatus.HIT.toString())) {
			gr2DBkg.drawImage(imageHit, Math.round(statusI * cellSizeX), Math.round(statusJ * cellSizeY), null);
		} else if (statusString.equals(GridStatus.SUNK.toString())){
			for (int i = 0; i < lines; i++){
				for (int j = 0; j < cols; j++){
					if (grid.getStatus(i, j).toString().equals(GridStatus.SUNK.toString())){
						gr2DBkg.drawImage(imageSunk, Math.round(i * cellSizeX), Math.round(j * cellSizeY), null);
					}
				}
			}
		}
	}

	public void updateStatus(String status, int i, int j){
		if ((i < lines) && (j < cols)){
			if (status.equals(GridStatus.HIT.toString())) {
				(new SoundEffect(SoundEffect.Effect.EXPLOSION_DISTANT)).start();
				GraphicsEngine.incFriendlyHits();
			}
			if (status.equals(GridStatus.WATER.toString())) {
				(new SoundEffect(SoundEffect.Effect.SPLASH_DISTANT)).start();
			}
			grid.setStatus(i, j, status);
			statusString = status;
			statusI = i;
			statusJ = j;
			//updateBkg(status, i, j);
			//GraphicsEngine.repaint();
		}
	}

	public void shoot(int i, int j){
		(new SoundEffect(SoundEffect.Effect.CANNON)).start();
		GraphicsEngine.netSend(GraphicsEngine.stShot + GraphicsEngine.stSep + Integer.toString(i) + GraphicsEngine.stSep + Integer.toString(j));
		GraphicsEngine.setCanonLoaded(false);
		//GraphicsEngine.repaint();
		GraphicsEngine.incFriendlyShots();
	}

	class MouseEventListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
			i = (int)((float)e.getX()/cellSizeX);
			j = (int)((float)e.getY()/cellSizeY);
			if ((GraphicsEngine.isCanonLoaded()) && (grid.isPristine(i, j))){
				shoot(i, j);
			}
		}
	}
}


