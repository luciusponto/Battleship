package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public abstract class GameButtonWarRoom extends GameButtonComposite{
	/*
	private GameGraphics pressGr = new ButtonWarRoomHighlight();
	private GameGraphics highlightGr = new ButtonWarRoomPress();
	private GameGraphics disabledGr = new ButtonWarRoomDisable();
	*/
	public GameButtonWarRoom(GameGraphics buttonGr, GameButtonComposite.Type type){
		//super(buttonGr, pressGr, highlightGr, disabledGr, type);
		super(buttonGr, type);
	}
}


