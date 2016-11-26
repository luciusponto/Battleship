package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class GameButtonReset extends GameButtonWarRoom{
	protected static Boolean pressed = false;
	protected static Boolean isOn = false;

	public GameButtonReset(){
		super(new ButtonReset(), GameButtonComposite.Type.PUSH_BUTTON);
	}
	public void buttonAction(){
		GraphicsEngine.friendlyGrid.reset();
		WarRoomPanel.resetButtons();
	}
}


