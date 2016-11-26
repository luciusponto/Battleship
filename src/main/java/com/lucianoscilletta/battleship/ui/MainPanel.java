package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.music.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class MainPanel extends GamePanel{
	private RoundTimerUI timer;
	public MainPanel(){
		this(GraphicsEngine.getWidth(), GraphicsEngine.getHeight());
	}
	public MainPanel(int width, int height){
		super(width, height, new BackgroundMusic(true));
		GraphicsEngine.incMatchCounter();
		timer = new RoundTimerUI(new ShotInfo());
		//GameButton button1 = new GameButton(new ButtonTestPosition(), new ButtonTestNormal(), new ButtonTestHighlighted(), new ButtonTestPressed(), new ButtonTestPressedHighlighted(), true);
		//GameButton button2 = new GameButton(new RadarScreen(), new ButtonTestNormal2(), new ButtonTestHighlight2(), new ButtonTestNormal2(), new ButtonTestNormal2(), true);
		//ChatInput chatInput = new ChatInput(new chatInputGfx());
		//JTextAreaGame chatOutput = new JTextAreaGame(new chatOutputPosition());
		//ChatOutput chatOutput = new ChatOutput(new chatOutputGfx(), new JTextAreaGame(new chatOutputGfx()));
		//ChatOutputUI chatOutputUI = new ChatOutputUI(new chatOutputGfx());

		/*
		//this.addComponent(new GameBackground(new gameMainWide2(), width, height, Color.black), Layer.BACKGROUND, 0, 0);
		this.addComponent(new GameBackground(new gameMainMockup7(), width, height, Color.black), Layer.BACKGROUND, 0, 0);
		//this.addComponent(button1, Layer.BUTTONS, button1.getX(), button1.getY());
		//this.addComponent(button2, Layer.BUTTONS, button2.getX(), button2.getY());
		this.addComponent(new GameBackground(new blackBkg(), width, height, Color.black), Layer.BACKGROUND, 0, 0);
		this.addComponent(chatInput, Layer.BUTTONS, chatInput.getX(), chatInput.getY());
		this.addComponent(gridUI, Layer.BUTTONS, gridUI.getX(), gridUI.getY());
		//this.addComponent(chatOutput, Layer.BUTTONS, chatOutput.getX(), chatOutput.getY());
		*/

		this.addComponent(new GameBackground(new gameMainMockup9d()), Layer.BACKGROUND);
		this.addComponent(new ChatInputUI(new chatInputGfx()));
		//this.addComponent(chatOutputUI, Layer.BUTTONS, chatOutput.getX(), chatOutput.getY());
		this.addComponent(new ChatOutputUI(new chatOutputGfx()));
		this.addComponent(new GameEmergencyLight(new EmergencyLight()));
		this.addComponent(new SwitchMusic());
		this.addComponent(new SwitchSounds());
		this.addComponent(new CannonLight());
		GraphicsEngine.friendlyGridUI = new FriendlyGridUI(GraphicsEngine.friendlyGrid, new FriendlyRadar());
		GraphicsEngine.enemyGrid.reset();
		GraphicsEngine.enemyGridUI = new GridGameUI(GraphicsEngine.enemyGrid, new RadarScreen(), new Water(), new Hit(), new Sunk());
		this.addComponent(GraphicsEngine.enemyGridUI);
		this.addComponent(GraphicsEngine.friendlyGridUI);
		GraphicsEngine.setOngoingMatch(true); // this line has to be before the creation of the RoundTimerUI object
		this.addComponent(timer);
		GraphicsEngine.setWaiting(true);
		timer.start();
	}
	public void shutdown(){
		timer.stop();
	}

}
