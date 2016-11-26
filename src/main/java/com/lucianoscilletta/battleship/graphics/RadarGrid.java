//This class can be used or not, depending on com.lucianoscilletta.battleship.graphics settings.
//Therefore, it needs an Image object which should not be static,
//so that no memory is wasted in case the class is not used.

package com.lucianoscilletta.battleship.graphics;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.*;

public class RadarGrid implements GameGraphics{
	int x0;
	int y0;
	int x1;
	int y1;
	int width;
	int height;
	float widthPerCol;
	float heightPerLine;
	int lines;
	int cols;
	int i = 0;
	Color color;
	public RadarGrid(int x0, int y0, int width, int height, int lines, int cols){
		this(x0, y0, width, height, lines, cols, GameColors.mediumGreen);
	}
	public RadarGrid(int x0, int y0, int width, int height, int lines, int cols, Color color){
		this.color = color;
		this.x0 = x0 - GraphicsEngine.corrConst;
		this.y0 = y0 - GraphicsEngine.corrConst;
		this.x1 = x0 + width;
		this.y1 = y0 + height;
		this.widthPerCol = (float)width/(float)cols;
		this.heightPerLine = (float)height/(float)lines;
		this.width = width;
		this.height = height;
		this.lines = lines;
		this.cols = cols;
	}
	public void paintComponent(Graphics2D g){
		//g.setColor(GameColors.brightGreen);
		g.setColor(color);
		for (i = 1; i < lines; i++){
			g.drawLine(x0, y0+Math.round(i*heightPerLine), x0+width, y0+Math.round(i*heightPerLine));
			g.drawLine(x0+Math.round(i*widthPerCol), y0, x0+Math.round(i*widthPerCol), y0+height);
		}
	}
	public void paint(Graphics2D g){
		paintComponent(g);
	}
    public int getOrigX(){
		return x0;
	}
    public int getOrigY(){
		return y0;
    }

    public int getOrigWidth(){
		return width;
    }

    public int getOrigHeight(){
		return height;
    }
}