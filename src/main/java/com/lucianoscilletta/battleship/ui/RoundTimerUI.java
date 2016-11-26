package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class RoundTimerUI extends JTextField{
	private boolean timerActive;
	private int remainingTime;
	private String prefix = "Time to shoot: ";
	private String msg = "";
	RoundTimer roundTimer;
	public RoundTimerUI(GameGraphics position){
		super();
		Dimension size = new Dimension(position.getOrigWidth(), position.getOrigHeight());
		this.setLocation(position.getOrigX(), position.getOrigY());
		this.setPreferredSize(size);
		this.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, GraphicsEngine.getPrefFontSize()));
		this.setBackground(GameColors.darkGreen);
		this.setForeground(GameColors.mediumGreen);
		this.setHorizontalAlignment(JTextField.CENTER);
		this.setEditable(false);
		this.setBorder(GraphicsEngine.defBorder);

		roundTimer = new RoundTimer();
		timerActive = false;
	}
	public void start(){
		reset();
		timerActive = true;
		roundTimer.start();
	}
	public void stop(){
		timerActive = false;
	}
	public void reset(){
		remainingTime = 0;
		updateInfo();
	}
	public void updateInfo(){
		if ((GraphicsEngine.isCanonLoaded()) && (remainingTime > 0)){
			msg = prefix + Integer.toString(remainingTime);
		} else {
			msg = "Loading cannon...";
		}
		this.setText(msg);
	}
	class RoundTimer extends Thread{
		private long targetTime100;
		private long targetTime1000;
		private long currentTime;
		private final long sleepTime = 50;
		public RoundTimer(){
			currentTime = System.currentTimeMillis();
			targetTime100 = currentTime + 100;
			targetTime1000 = currentTime + 1000;
		}
		public void run(){
			while (timerActive){
				currentTime = System.currentTimeMillis();
				if (currentTime >= targetTime100){
					action100();
					targetTime100 += 100;
				}
				if ((currentTime >= targetTime1000) && (remainingTime > 0)){
					action1000();
					targetTime1000 += 1000;
				}
				try {
					sleep(sleepTime);
				} catch (Exception e) {

				}
			}
		}
		public void action100(){
			if (false == GraphicsEngine.isCanonLoaded()){
				remainingTime = 0;
				updateInfo();
			}
			if ((0 == remainingTime) && GraphicsEngine.isCanonLoaded()){
				remainingTime = GraphicsEngine.getRoundLength();
				targetTime1000 = currentTime + 1000;
				updateInfo();
			}
		}
		public void action1000(){
			remainingTime--;
			updateInfo();
			if (0 == remainingTime){
				if (GraphicsEngine.isCanonLoaded()){
					GraphicsEngine.setCanonLoaded(false);
					GraphicsEngine.netSend(GraphicsEngine.stShotTimeout);
				}
				updateInfo();
			}
			if (remainingTime < 0){
				Err.msgExit("RoundTimerUI: impossible time");
			}
			//System.out.println("Timer "+Integer.toString(GraphicsEngine.getMatchCounter()));
		}
	}
}