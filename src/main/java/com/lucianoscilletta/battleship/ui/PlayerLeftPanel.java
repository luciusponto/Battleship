package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class PlayerLeftPanel extends MessagePanel{
	private static final String msg = "The other player left";
	public PlayerLeftPanel(){
		super(msg, MessagePanel.action.CONTINUE);
	}
	public void continueAction(){
		GraphicsEngine.loadScreen(new MainMenuPanel());
	}
}
