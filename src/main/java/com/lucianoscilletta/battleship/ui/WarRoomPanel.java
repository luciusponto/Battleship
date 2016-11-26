package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.music.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class WarRoomPanel extends GamePanel{
	private static int currentI = 0;
	private static int currentJ = 0;
	private static int currentX0 = 0;
	private static int currentY0 = 0;
	private static int c;
	private static Boolean allChosen;
	private static GameButtonShipSelector buttonsSel[] = { null, null, null, null, null };
	private static GameButtonNext gameButtonNext = new GameButtonNext();
	private static GameButtonReset gameButtonReset = new GameButtonReset();
	private static int resolutionIndex = GraphicsEngine.getOptions().getGraphOptRes();

	static {
		buttonsSel[0] = new GameButtonShipSelector(new ButtonPatrol(), 1);
		buttonsSel[1] = new GameButtonShipSelector(new ButtonSub(), 2);
		buttonsSel[2] = new GameButtonShipSelector(new ButtonDestroyer(), 3);
		buttonsSel[3] = new GameButtonShipSelector(new ButtonBattleship(), 4);
		buttonsSel[4] = new GameButtonShipSelector(new ButtonAircraft(), 5);
		gameButtonNext = new GameButtonNext();
		gameButtonReset = new GameButtonReset();
	}

	public WarRoomPanel(){
		this(GraphicsEngine.getWidth(), GraphicsEngine.getHeight());
	}
	public WarRoomPanel(int width, int height){
		super(width, height, new WaitingMusic());
		/*
		buttonsSel[0] = new GameButtonShipSelector(new ButtonPatrol(), 1);
		buttonsSel[1] = new GameButtonShipSelector(new ButtonSub(), 2);
		buttonsSel[2] = new GameButtonShipSelector(new ButtonDestroyer(), 3);
		buttonsSel[3] = new GameButtonShipSelector(new ButtonBattleship(), 4);
		buttonsSel[4] = new GameButtonShipSelector(new ButtonAircraft(), 5);
		gameButtonNext = new GameButtonNext();
		gameButtonReset = new GameButtonReset();
		*/
		//if (!(GraphicsEngine.getOptions().getGraphOptRes() == resolutionIndex)){
		if (true){
			resolutionIndex = GraphicsEngine.getOptions().getGraphOptRes();
			GameButtonComposite.initStatics();
			gameButtonNext.initGraphics();
			gameButtonReset.initGraphics();
			for (int i = 0; i < buttonsSel.length; i++){
				buttonsSel[i].initGraphics();
			}
		}
		this.addComponent(new GameBackground(new gameWarRoom()), Layer.BACKGROUND);
		this.addComponent(new WarRoomGridUI(GraphicsEngine.friendlyGrid, new WarRoomTableTop()), Layer.FX2);
		//resetButtons();
		this.addComponent(gameButtonNext);
		this.addComponent(gameButtonReset);
		this.addComponent(buttonsSel[4]);
		this.addComponent(buttonsSel[3]);
		this.addComponent(buttonsSel[2]);
		this.addComponent(buttonsSel[1]);
		this.addComponent(buttonsSel[0]);
		for (int i = 0; i < WarRoomGridUI.getLines(); i++){
			for (int j = 0; j < WarRoomGridUI.getCols(); j++){
				this.addComponent(new GridSquare(i, j, WarRoomGridUI.getx0() + Math.round(WarRoomGridUI.getCellSizeX() * i), WarRoomGridUI.gety0() + Math.round(j * WarRoomGridUI.getCellSizeY()), Math.round(WarRoomGridUI.getCellSizeX()), Math.round(WarRoomGridUI.getCellSizeY())));
			}
		}
		//this.setKeyListener(new WarRoomKeyAdapter());
		this.setAction("LEFT", "rotateShipAction", new RotateShipAction());
		this.setAction("RIGHT", "rotateShipAction", new RotateShipAction());
	}

	public static void resetButtons(){
		allChosen = false;
		for (c = 0; c < 5; c++){
			if (GraphicsEngine.friendlyGrid.shipsPerSize(c+1) < GraphicsEngine.shipAmountPerType[c]){
				buttonsSel[c].setEnabledStatus(true);
			} else {
				buttonsSel[c].setEnabledStatus(false);
			}
		}
		gameButtonNext.setEnabledStatus(false);
		selNextButton();
	}

	public static void next(){
	}

	public static void hideShadow(){
		WarRoomGridUI.setShadowPos(-1, -1);
		GraphicsEngine.repaint();
	}

	public static void showShadow(){
		WarRoomGridUI.setShadowPos(currentI, currentJ);
		GraphicsEngine.repaint();
	}

	public static void calcShadowColor(){
		if ((GameButtonShipSelector.getSelectedSize() > 0) &&
				(GraphicsEngine.friendlyGrid.shipFits(currentI, currentJ, GameButtonShipSelector.getSelectedSize(), GameButtonShipSelector.isHorizontal())) ){
			WarRoomGridUI.setGreenShadow(true);
		} else {
			WarRoomGridUI.setGreenShadow(false);
		}
	}

	public static void selNextButton(){
		for (c = 4; c > -1; c--){
			if (buttonsSel[c].isEnabled() && (GraphicsEngine.friendlyGrid.shipsPerSize(c+1) < GraphicsEngine.shipAmountPerType[c])){
				buttonsSel[c].buttonPress();
				break;
			}
		}
	}

	class GridSquare extends GameComponent{
		private int i;
		private int j;
		private int x0;
		private int y0;
		public GridSquare(int cellX, int cellY, int posX, int posY, int sizeX, int sizeY){
			super();
			Dimension size = new Dimension(sizeX, sizeY);
			this.setSize(size);
			this.setMinimumSize(size);
			this.setMaximumSize(size);
			this.setPreferredSize(size);
			this.setLocation(posX, posY);
			this.addMouseListener(new SquareMouseEventListener());
			i = cellX;
			j = cellY;
			x0 = posX;
			y0 = posY;
		}
		class SquareMouseEventListener extends MouseAdapter {
			//public static Boolean newTile = false;
			public void mouseEntered(MouseEvent e) {
				currentI = i;
				currentJ = j;
				currentX0 = x0;
				currentY0 = y0;
				showShadow();
				calcShadowColor();
			}
			public void mouseExited(MouseEvent e) {
				hideShadow();
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
				if (MouseEvent.BUTTON1 == e.getButton()){
					if ( ((GameButtonShipSelector.getSelectedSize() > 0) && (GameButtonShipSelector.getSelectedSize() <= 5)) &&
							(GraphicsEngine.friendlyGrid.shipFits(i, j, GameButtonShipSelector.getSelectedSize(), GameButtonShipSelector.isHorizontal())) ){
						GraphicsEngine.friendlyGrid.addShip(i, j, GameButtonShipSelector.getSelectedSize(), GameButtonShipSelector.isHorizontal());
						hideShadow();
					} else {
						/*
						GraphicsEngine.friendlyGrid.removeShip(i, j);
						if (GraphicsEngine.friendlyGrid.shipFits(i, j, GameButtonShipSelector.getSelectedSize(), GameButtonShipSelector.isHorizontal())){
							showShadow();
							calcShadowColor();
						}
						*/
					}
					if ((GameButtonShipSelector.getSelectedSize() > 0) && (GameButtonShipSelector.getSelectedSize() <= 5)){
						//if (GraphicsEngine.friendlyGrid.maxShipsPerSize(GameButtonShipSelector.getSelectedSize())){
						if (GraphicsEngine.friendlyGrid.shipsPerSize(GameButtonShipSelector.getSelectedSize()) >= GraphicsEngine.shipAmountPerType[GameButtonShipSelector.getSelectedSize() - 1]){
							buttonsSel[GameButtonShipSelector.getSelectedSize() - 1].setEnabledStatus(false);
							selNextButton();
						} else {
							buttonsSel[GameButtonShipSelector.getSelectedSize() - 1].setEnabledStatus(true);
						}
					}
					allChosen = true;
					for (c = 0; c < 5; c++){
						if (buttonsSel[c].isEnabled()){
							allChosen = false;
						}
					}
					if (allChosen){
						gameButtonNext.setEnabledStatus(true);
						if ((GameButtonShipSelector.getSelectedSize() > 0) && (GameButtonShipSelector.getSelectedSize() <= 5)){
							buttonsSel[GameButtonShipSelector.getSelectedSize() - 1].buttonActionToggleOff();
						}
						// TO do: enable Next button
						//JComponent
					} else {
						gameButtonNext.setEnabledStatus(false);
					}
				}
				if (MouseEvent.BUTTON2 == e.getButton()){
					rotateShip();
				}
				if (MouseEvent.BUTTON3 == e.getButton()){
					rotateShip();
				}
			}
		}
	}

	/*
	class WarRoomKeyAdapter extends KeyAdapter{
	    public void keyPressed(KeyEvent e) {
			char keyChar = e.getKeyChar();
			String keyText = e.getKeyText(e.getKeyCode());
			if (("Left" == keyText) || ("Right" == keyText)){
				GameButtonShipSelector.toggleHorizontal();
				showShadow();
				calcShadowColor();
			}
		}
	}
	*/

	class RotateShipAction extends AbstractAction{
		public RotateShipAction(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			rotateShip();
		}
	}

	private void rotateShip(){
		GameButtonShipSelector.toggleHorizontal();
		showShadow();
		calcShadowColor();
	}
}
