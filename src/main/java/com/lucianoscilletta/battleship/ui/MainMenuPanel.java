package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.music.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class MainMenuPanel extends GamePanel{
	public MainMenuPanel(){
		super(GraphicsEngine.getWidth(), GraphicsEngine.getHeight(), new MainMenuMusic());
		GraphicsEngine.closeSockets();
		this.addComponent(new GameBackground(new MainMenuBkg()), Layer.BACKGROUND);
		this.setMainMenuEnabled(true);
	}
}
