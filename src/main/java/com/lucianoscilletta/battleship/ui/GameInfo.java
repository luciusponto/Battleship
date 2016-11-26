package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public abstract class GameInfo extends JComponent{
	private long targetTimeUpdateInfo = 0;
	private long currentTime = 0;
	private int updateInfoPeriod = 1000; //update after 1000 ms
	private int x0 = 20;
	private int y0 = 20;
	private int y = y0;
	private int ySpacing = 20;

	public GameInfo(int width, int height){
		this(width, height, 0, 0);
	}
	public GameInfo(int width, int height, int x0, int y0){
		super();
		Dimension size = new Dimension(width, height);
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(x0, y0);
		targetTimeUpdateInfo = System.currentTimeMillis() + updateInfoPeriod;
	}
	public void setX0(int x){
		x0 = x;
	}
	public void setY0(int y){
		y0 = y;
	}
	public void setYSpacing(int yS){
		ySpacing = yS;
	}
	public void setUpdatePeriod(int ms){
		updateInfoPeriod = ms;
	}
	public long getCurrentTime(){
		return currentTime;
	}
	public void paintComponent(Graphics g){
		paintComponent((Graphics2D)g);
	}
	public void drawNextString(Graphics2D g, String s){
		g.drawString(s, x0, y);
		y += ySpacing;
	}
	public abstract void drawStrings(Graphics2D g); //Override with code to draw strings. The provided method is drawNextString(g, String s).
	public void paintComponent(Graphics2D g){
		y = y0;
		currentTime = System.currentTimeMillis();
		if (currentTime >= targetTimeUpdateInfo){
			updateInfo();
			targetTimeUpdateInfo += updateInfoPeriod;
		}
		drawStrings(g);
		// Draw strings here. The default method is drawNextString(g, String s)
	}
	public abstract void updateInfo();// Update strings to be displayed
}
