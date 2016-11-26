package com.lucianoscilletta.battleship.music;

import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.music.*;

public class BackgroundMusic extends AudioPlayer{
	//public static final String mainMenuTrack = "file:///C://Failing Defense.mp3";
	private static final String sep = System.getProperty("file.separator");
	private static final String userDir = System.getProperty("user.dir");
	//private static final String musicDir = userDir + sep + "battleship" + sep + "music" + sep;
	private static final String musicDir = "com/lucianoscilletta/battleship/music/";
	private static final String optionsDir = System.getProperty("user.home") + sep + ".battleship" + sep;
	private static final String customMusicDir = optionsDir + "/music" + sep;
	private static final float bkgMusicVolLevel = 0.2f;
	private static final float menuMusicVolLevel = 0.3f;
	protected static final String mainMenuTrack = musicDir + "Failing Defense.mp3";
	protected static final String waitingTrack = musicDir + "Army Angels.mp3";
	public BackgroundMusic(boolean shuffleCustom){
		super(customMusicDir, shuffleCustom, bkgMusicVolLevel);
	}
	public BackgroundMusic(String file, double startTime, double playTime, long delay, int loops){
		super(file, startTime, playTime, delay, loops, menuMusicVolLevel);
	}
}

