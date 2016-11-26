package com.lucianoscilletta.battleship.graphics;
import java.awt.*;
import com.lucianoscilletta.battleship.*;
public class GameColors{
	public static final Color brightGreen = new Color (0, 255, 0);
	public static final Color brightRed = new Color (255, 0, 0);
	public static final Color transpGreen = new Color (0, 255, 0, 100);
	public static final Color transpRed = new Color (255, 0, 0, 100);
	public static final Color transpBlue = new Color (0, 0, 255, 100);
	public static final Color darkGreen = new Color (0, 70, 0);
	public static final Color mediumGreen = new Color (0, 200, 0);
	public static final Color tempGreen = new Color (0, 255, 0);
	public static final Color transparent = new Color (0, 0, 0, 0);
	public static final Color friendlyText = brightGreen;
	public static final Color enemyText = Color.magenta;
	public static final Color chatName = new Color (180, 180, 180);
	public static final Color infoBkg = new Color (0, 0, 0, 80);
	public static final Color menuBkg = new Color (60, 60, 60, 255);
	public static final Color infoTitle = new Color (230, 230, 0);
	public static final Color infoFriendly = new Color (230, 230, 0);
	public static final Color infoEnemy = new Color (190, 190, 0);
	public static final Color infoCategory = infoFriendly;
	public static final Color infoVictory = new Color (80, 112, 0);
	public static final Color infoDefeat = new Color (200, 0, 0);
	public static final Color infoHTML = infoTitle;
	public static final Color infoKey = infoTitle;
	public static final Color infoExit = new Color (230, 0, 0);
	public static final Color infoContinue = new Color (230, 230, 0);
	public static final Color menuTitle = new Color (240, 240, 0);
	public static final Color menuButton = new Color (0, 0, 0);
	public static final Color menuInput = new Color (0, 0, 0);
	public static final Color menuPrec = new Color (230, 230, 230);
	public static final Color menuOther = new Color (230, 230, 230);
	public static final Color friendly[][] = new Color[5][6]; // first index is ship size -1, 2nd index is ship remaining hitpoints
	public static final int friendlyMaxGreen = 255;
	public static final int friendlyMaxRed = 255;
	public static final int friendlyTransp = 0;

	static{
		for (int i = 0; i < 5; i++){
			int steps = i+1-2;
			for (int j = 0; j < i+2; j++){
				if (0 == j){
					friendly[i][j] = transparent;
					continue;
				}
				if (i+1 == j){
					friendly[i][j] = new Color (0, friendlyMaxGreen, friendlyTransp); //green
					continue;
				}
				if (1 == j){
					friendly[i][j] = new Color (friendlyMaxRed, 0, friendlyTransp); //red
					continue;
				}
				if (i == j){
					friendly[i][j] = new Color (friendlyMaxRed, friendlyMaxGreen, friendlyTransp); //yellow
					continue;
				}
				else {
					friendly[i][j] = new Color (friendlyMaxRed, Math.round(friendlyMaxGreen * Math.min(1,(float)(j)/(i+1))), friendlyTransp);
				}
			}
		}
	}
}

