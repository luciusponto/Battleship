package com.lucianoscilletta.battleship.music;
import com.lucianoscilletta.battleship.music.*;
import com.lucianoscilletta.battleship.*;

public class WaitingMusic extends BackgroundMusic{
	private static final double startTime  = 0;
	private static final double playTime  = 0;
	public WaitingMusic(){
		super(BackgroundMusic.waitingTrack, startTime, playTime, 0, -1);
	}
}