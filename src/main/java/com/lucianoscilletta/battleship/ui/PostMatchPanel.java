package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.text.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class PostMatchPanel extends MessagePanel{
	private static final int nameSizeLimit = 30;
	protected static Integer fShots = null;
	protected static Integer fHits = null;
	protected static Integer eShots = null;
	protected static Integer eHits = null;
	protected static String fColor = colorToTag(GameColors.infoFriendly);
	protected static String eColor = colorToTag(GameColors.infoEnemy);
	protected static String cColor = colorToTag(GameColors.infoCategory);
	protected static String vicColor = colorToHtm(GameColors.infoVictory);
	protected static String defColor = colorToHtm(GameColors.infoDefeat);
	protected static String tColor = colorToHtm(GameColors.infoTitle);
	protected static String closeColor = "</font>";
	protected static String closeHtm = "</font></body></html>";

	private static String colorToHtm(Color c){
		return "<html><body><font color =\"#" + colorToHex(c) + "\">";
	}

	private static String colorToTag(Color c){
		return "<font color =\"#" + colorToHex(c) + "\">";
	}

	private static String colorToHex(Color c){
		String temp = Integer.toHexString(c.getRGB());
		if (8 == temp.length()){
			temp = temp.substring(2,8);
		}
		return temp;
	}

	public PostMatchPanel(String title, String msg, MessagePanel.action action){
		super(title, msg, action);
	}

	public PostMatchPanel(boolean wonMatch){
		super(winnerColor(winner(wonMatch), wonMatch), stats(), MessagePanel.action.CONTINUE);
	}

	private static String stats(){
		getStats();
		return statsToString();
	}

	private static String winnerColor(String s, boolean won){
		if (won){
			return vicColor + s + closeHtm;
		} else {
			return defColor + s + closeHtm;
		}
	}

	protected static String statsToString(){
		double fPerc;
		double ePerc;
		if (fHits > 0.0){
			fPerc = (double)fHits / fShots;
		} else {
			fPerc = 0.0;
		}
		if (eHits > 0.0){
			ePerc = (double)eHits / eShots;
		} else {
			ePerc = 0.0;
		}
		int fNameSize = Math.max(0, GraphicsEngine.getPlayerName().length());
		int eNameSize = Math.max(0, GraphicsEngine.getEnemyName().length());
		String stats = "<html><body>" +
				"<table border=\"0\">" +
				"<tr>" +
				"<td></td>" +
				"<td valign=\"top\"><center>" + fColor + GraphicsEngine.getPlayerName().substring(0, Math.min(fNameSize, nameSizeLimit)) + closeColor + "</center></td>" +
				"<td valign=\"top\"><center>" + eColor + GraphicsEngine.getEnemyName().substring(0, Math.min(eNameSize, nameSizeLimit)) + closeColor + "</center></td>" +
				"</tr>" +
				"<tr>" +
				"<td><p ALIGN=\"right\">" + cColor + "Shots" + closeColor + "</p></td>" +
				"<td><center>" + fColor + fShots.toString() + closeColor + "</center></td>" +
				"<td><center>" + eColor + eShots.toString() + closeColor + "</center></td>" +
				"</tr>" +
				"<tr>" +
				"<td><p ALIGN=\"right\">" + cColor + "Hits" + closeColor + "</p></td>" +
				"<td><center>" + fColor + fHits.toString() + closeColor + "</center></td>" +
				"<td><center>" + eColor + eHits.toString() + closeColor + "</center></td>" +
				"</tr>" +
				"<tr>" +
				"<td><p ALIGN=\"right\">" + cColor + "Hit%" + closeColor + "</p></td>" +
				"<td><center>" + fColor + NumberFormat.getPercentInstance().format(fPerc) + closeColor + "</center></td>" +
				"<td><center>" + eColor + NumberFormat.getPercentInstance().format(ePerc) + closeColor + "</center></td>" +
				"</tr>" +
				"<tr>" +
				"<td><p ALIGN=\"right\">" + cColor + "Wins" + closeColor + "</p></td>" +
				"<td><center><bold>" + fColor + Integer.toString(GraphicsEngine.getFriendlyScore()) + closeColor + "</bold></center></td>" +
				"<td><center>" + eColor + Integer.toString(GraphicsEngine.getEnemyScore()) + closeColor + "</center></td>" +
				"</tr>" +
				"</table>";
		return stats;
	}

	private static void getStats() {
		fShots = GraphicsEngine.getFriendlyShotsMatch();
		fHits = GraphicsEngine.getFriendlyHitsMatch();
		eShots = GraphicsEngine.getEnemyShotsMatch();
		eHits = GraphicsEngine.getEnemyHitsMatch();
	}

	private static String winner(boolean wonMatch){
		if (wonMatch){
			return "Victory";
		} else {
			return "Defeat";
		}
	}

	public void continueAction(){
		if (GraphicsEngine.isGameOver()){
			GraphicsEngine.loadScreen(new GameOverPanel());
		} else {
			//GraphicsEngine.loadScreen(new WarRoomPanel(GraphicsEngine.getWidth(), GraphicsEngine.getHeight()));
			GraphicsEngine.loadWarRoom();
		}
	}
}
