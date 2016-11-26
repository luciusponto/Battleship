package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;
import com.lucianoscilletta.battleship.graphics.*;

public abstract class GameComponent extends JComponent{
	public void update(Graphics g){
		paintComponent((Graphics2D)g);
	}

	public void update(Graphics2D g){
		paintComponent(g);
	}

	public void updateSpecial(Graphics2D g){
		paintComponent(g);
	}

	public void paintComponent(Graphics g){
		paintComponent((Graphics2D)g);
	}
	public void paintComponent(Graphics2D g){
		//To be overriden by subclasses
	}
	public void setSizes(Dimension size){
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
	}
}
