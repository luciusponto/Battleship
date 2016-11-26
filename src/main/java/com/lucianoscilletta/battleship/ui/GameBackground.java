package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class GameBackground extends GameComponent {
	BufferedImage bkgImage = null;
	BufferedImage tmpImage = null;

	public GameBackground(GameGraphics gr){
		this(gr, GraphicsEngine.getWidth(), GraphicsEngine.getHeight(), Color.black);
	}

	public GameBackground(BufferedImage im, int width, int height){
		super();
		bkgImage = im;
		Dimension size = new Dimension(width, height);
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(0, 0);
	}

	public GameBackground(GameGraphics gr, int width, int height, Color bkgColor){
		super();
		bkgImage = new BufferedImage(width, height, Transparency.OPAQUE);
		Graphics2D g = (Graphics2D)bkgImage.getGraphics();
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER)); // sets composite as SRC_OVER
		g.setColor(bkgColor);
		g.fillRect(0, 0, width, height);
		Dimension size = new Dimension(width, height);
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(0, 0);
		g.drawImage(GameUtils.classToImage(gr), null, GraphicsEngine.getHorOffset(), 0);
	}

	public void paintComponent(Graphics2D g){
		g.drawImage(bkgImage, null, 0, 0);
	}
}

