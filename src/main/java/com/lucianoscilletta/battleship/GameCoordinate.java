package com.lucianoscilletta.battleship;

import java.io.*;

public class GameCoordinate implements Serializable{
	private int x;
	private int y;
	public GameCoordinate(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}