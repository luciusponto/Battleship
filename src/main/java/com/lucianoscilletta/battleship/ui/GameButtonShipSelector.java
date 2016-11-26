package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class GameButtonShipSelector extends GameButtonWarRoom{
	private static int selectedSize = 0;
	private static Boolean horizontal = true;
	private int shipSize;
	public GameButtonShipSelector(GameGraphics shipGr, int shipSize){
		super(shipGr, GameButtonComposite.Type.TOGGLE_BUTTON);
		this.shipSize = shipSize;
	}
	public void releaseButton(){
		this.buttonMouseReleased();
		GraphicsEngine.repaint();
	}
	public void buttonActionToggleOn(){
		selectedSize = shipSize;
	}
	public void buttonActionToggleOff(){
		selectedSize = 0;
		WarRoomGridUI.setShadowPos(-1, -1);
	}
	public static void setHorizontal(Boolean isHorizontal){
		horizontal = isHorizontal;
	}
	public static Boolean isHorizontal(){
		return horizontal;
	}
	public static int getSelectedSize(){
		return selectedSize;
	}

	public void buttonToggle(){
		if (this.shipSize == selectedSize){
			buttonActionToggleOff();
		} else {
			buttonActionToggleOn();
		}
		if (selectedSize > 0){
			WarRoomGridUI.genShadow(selectedSize, horizontal);
		}
	}
	public void buttonPress(){
		buttonActionToggleOn();
		if (selectedSize > 0){
			//WarRoomGridUI.genShadow(selectedSize, horizontal);
			GraphicsEngine.repaint();
		}
	}
	public static void toggleHorizontal(){
		if(horizontal){
			horizontal = false;
		} else {
			horizontal = true;
		}
		if (selectedSize > 0){
			WarRoomGridUI.genShadow(selectedSize, horizontal);
		}
	}

	public void paintComponent(Graphics2D g){
		if (enabled){
			if (this.shipSize == selectedSize){
				if (isHighlighted()){
					g.drawImage(imagePressedHighlighted, 0, 0, null);
				} else {
					g.drawImage(imagePressed, 0, 0, null);
				}
			} else {
				if (isHighlighted()){
					g.drawImage(imageHighlighted, 0, 0, null);
				} else {
					g.drawImage(imageNormal, 0, 0, null);
				}
			}
		} else {
			g.drawImage(imageDisabled, 0, 0, null);
		}
	}

}


