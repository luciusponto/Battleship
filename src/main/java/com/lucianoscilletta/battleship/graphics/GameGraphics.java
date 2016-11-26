package com.lucianoscilletta.battleship.graphics;

import java.awt.*;

public interface GameGraphics {
	public void paint(Graphics2D g);

    public int getOrigX();

    public int getOrigY();

    public int getOrigWidth();

    public int getOrigHeight();
}