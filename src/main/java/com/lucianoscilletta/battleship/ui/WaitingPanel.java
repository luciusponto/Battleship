package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.music.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class WaitingPanel extends MessagePanel{
	public WaitingPanel(int width, int height){
		super("Please wait", "The other player is getting ready", MessagePanel.action.NONE);
		(new Thread(new WaitForPlayer())).start();
	}
	class WaitForPlayer implements Runnable{
		public void run(){
			while (GraphicsEngine.isWaiting()){
				try {
				    Thread.sleep(200);
				} catch (Exception e) {

				}
			}
			GraphicsEngine.loadScreen(new MainPanel(GraphicsEngine.getWidth(), GraphicsEngine.getHeight()));
		}
	}
}
