package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class ConnectionFailedPanel extends MessagePanel{
	private static final String msg = "The connection failed";
	public ConnectionFailedPanel(){
		super(msg, MessagePanel.action.CONTINUE);
		GraphicsEngine.closeSockets();
	}
	public void continueAction(){
		GraphicsEngine.loadScreen(new MainMenuPanel());
	}
}
