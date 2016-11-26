package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class GameButtonNext extends GameButtonWarRoom{
	protected static Boolean pressed = false;
	protected static Boolean isOn = false;

	public GameButtonNext(){
		super(new ButtonNext(), GameButtonComposite.Type.PUSH_BUTTON);
	}
	public void buttonAction(){
		//GraphicsEngine.enemyGrid = GraphicsEngine.friendlyGrid; // remove on final version!!!
		GraphicsEngine.netSend(GraphicsEngine.stShipsReady);
		GraphicsEngine.loadScreen(new WaitingPanel(GraphicsEngine.getWidth(), GraphicsEngine.getHeight()));
	}
}


