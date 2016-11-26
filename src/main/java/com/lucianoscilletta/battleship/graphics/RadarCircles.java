//This class can be used or not, depending on com.lucianoscilletta.battleship.graphics settings.
//Therefore, it needs an Image object which should not be static,
//so that no memory is wasted in case the class is not used.

package com.lucianoscilletta.battleship.graphics;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.*;

public class RadarCircles implements GameGraphics{
	int x0;
	int y0;
	int x1;
	int y1;
	int chx0;
	int chx1;
	int chy0;
	int chy1;
	int cvx0;
	int cvx1;
	int cvy0;
	int cvy1;
	int width;
	int height;
	float radius;
	int circles;
	int i = 0;
	Color color;
	Boolean showCross;
	float crossBorder;
	public RadarCircles(int x0, int y0, int width, int height, int circles, float border, float crossBorder, Boolean showCross, Color color){
		this.color = color;
		this.x0 = Math.round((x0 - GraphicsEngine.corrConst) + (width * border));
		this.y0 = Math.round((y0 - GraphicsEngine.corrConst) + (height * border));
		this.width = Math.round(x0 + (width * (1 - 2*border)));
		this.height = Math.round(y0 + (height * (1 - 2*border)));
		this.circles = circles;
		this.radius = width / ( 2 * circles);
		this.crossBorder = crossBorder;
		this.showCross = showCross;
		this.chx0 = Math.round((float)width / 2);
		this.chx1 = chx0;
		this.chy0 = Math.round((y0 - GraphicsEngine.corrConst) + (height * crossBorder));
		this.chy1 = chy0 + Math.round(chy0 + (height * (1 - (2 * crossBorder))));
		this.cvx0 = Math.round((x0 - GraphicsEngine.corrConst) + (width * crossBorder));
		this.cvx1 = cvx0 + Math.round(cvx0 + (width * (1 - (2 * crossBorder))));
		this.cvy0 = Math.round((float)height / 2);
		this.cvy1 = cvy0;
	}
	public void paintComponent(Graphics2D g){
		//g.setColor(GameColors.brightGreen);
		g.setColor(color);
		for (i = 0; i < circles; i++){
			g.drawOval(x0 + Math.round(i * radius), y0 + Math.round(i * radius), width - Math.round(2 * (i * radius)), height - Math.round(2 * (i * radius)));
		}
		if (showCross){
			g.drawLine(chx0, chy0, chx1, chy1);
			g.drawLine(cvx0, cvy0, cvx1, cvy1);
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