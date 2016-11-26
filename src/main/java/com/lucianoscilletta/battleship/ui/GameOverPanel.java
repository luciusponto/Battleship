package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.text.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;


public class GameOverPanel extends PostMatchPanel{
	public GameOverPanel(){
		super(winner(), stats(), MessagePanel.action.CONTINUE);
	}
	public static String winner(){
		if (GraphicsEngine.getFriendlyScore() > GraphicsEngine.getEnemyScore()){
			return vicColor + "Overall victory" + closeHtm;
		} else if (GraphicsEngine.getFriendlyScore() < GraphicsEngine.getEnemyScore()){
			return defColor + "Overall defeat" + closeHtm;
		} else {
			return tColor + "Draw" + closeHtm;
		}
	}

	public void continueAction(){
		//GraphicsEngine.exit();
		GraphicsEngine.loadScreen(new MainMenuPanel());
	}

	public static String stats(){
		getStats();
		return statsToString();
	}

	private static void getStats() {
		fShots = GraphicsEngine.getFriendlyShotsTotal();
		fHits = GraphicsEngine.getFriendlyHitsTotal();
		eShots = GraphicsEngine.getEnemyShotsTotal();
		eHits = GraphicsEngine.getEnemyHitsTotal();
	}
}
