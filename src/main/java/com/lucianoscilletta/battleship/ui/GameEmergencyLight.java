package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class GameEmergencyLight extends GameComponent {
	private static BufferedImage image = null;
	private static boolean lit = false;

	public GameEmergencyLight(GameGraphics gr){
		super();
		lit = false;
		image = GameUtils.classToImage(gr);
		Dimension size = new Dimension(gr.getOrigWidth(), gr.getOrigHeight());
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(gr.getOrigX(), gr.getOrigY());
	}

	public void paintComponent(Graphics2D g){
		if (lit){
			g.drawImage(image, 0, 0, null);
		}
	}

	public static void light(){
		lit = true;
	}
}


