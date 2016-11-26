package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class CannonLight extends GameComponent {
	private BufferedImage imageOn = null;
	private BufferedImage imageOff = null;
	private static boolean lit = false;

	public CannonLight(){
		super();
		GameGraphics gr = new CannonReadyOn();
		imageOn = GameUtils.classToImage(gr);
		imageOff = GameUtils.classToImage(new CannonReadyOff());
		lit = false;
		Dimension size = new Dimension(gr.getOrigWidth(), gr.getOrigHeight());
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(gr.getOrigX(), gr.getOrigY());
	}

	public void paintComponent(Graphics2D g){
		if (lit){
			g.drawImage(imageOn, 0, 0, null);
		} else {
			g.drawImage(imageOff, 0, 0, null);
		}
	}

	public static void light(boolean value){
		lit = value;
		GraphicsEngine.repaint();
	}
}


