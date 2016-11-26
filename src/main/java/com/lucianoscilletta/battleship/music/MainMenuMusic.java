package com.lucianoscilletta.battleship.music;
import com.lucianoscilletta.battleship.music.*;
import com.lucianoscilletta.battleship.*;

public class MainMenuMusic extends BackgroundMusic{
	private static final double startTime  = 34.2;
	private static final double playTime  = 0;
	public MainMenuMusic(){
		super(BackgroundMusic.mainMenuTrack, startTime, playTime, 0, -1);
	}
}
