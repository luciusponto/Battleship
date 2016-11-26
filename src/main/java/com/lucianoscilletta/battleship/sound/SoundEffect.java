package com.lucianoscilletta.battleship.sound;

import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.sound.*;

public class SoundEffect extends AudioPlayer{
	public static enum Effect { CANNON, CANNON_DISTANT, EXPLOSION, EXPLOSION_LONG, EXPLOSION_DISTANT, SPLASH, SPLASH_DISTANT, SWITCH, PUSH_BUTTON, AIRPLANE, BOAT }
	private static final String sep = System.getProperty("file.separator");
	private static final String userDir = System.getProperty("user.dir");
	private static final String soundDir = "com/lucianoscilletta/battleship/sound/";
//	private static final String soundDir = userDir + sep + "battleship" + sep + "com.lucianoscilletta.battleship.sound" + sep;
	//private static final String optionsDir = System.getProperty("user.home") + sep + ".battleship" + sep;
	//private static final String customMusicDir = optionsDir + "com.lucianoscilletta.battleship.music" + sep;
	//protected static final String mainMenuTrack = musicDir + "FailingDefense.mp3";
	//protected static final String waitingTrack = mainMenuTrack;
	private static String file[] = new String[Effect.values().length];
	private static long delay[] = new long[Effect.values().length];
	private static boolean loadCannon[] = new boolean[Effect.values().length];
	private static boolean repaintArray[] = new boolean[Effect.values().length];
	private static final long reactionDelay = 1200;
	static {
		file[Effect.CANNON.ordinal()] = "close_cannon.wav";
		file[Effect.CANNON_DISTANT.ordinal()] = "distant_cannon.wav";
		file[Effect.EXPLOSION.ordinal()] = "close_explosion.wav";
		file[Effect.EXPLOSION_LONG.ordinal()] = "close_explosion_long.wav";
		file[Effect.EXPLOSION_DISTANT.ordinal()] = "distant_explosion.wav";
		file[Effect.SPLASH.ordinal()] = "close_splash.wav";
		file[Effect.SPLASH_DISTANT.ordinal()] = "distant_splash.wav";
		file[Effect.SWITCH.ordinal()] = "metal_switch.wav";
		file[Effect.PUSH_BUTTON.ordinal()] = "push_button.wav";
		file[Effect.AIRPLANE.ordinal()] = "Jet_FA18_PassBy1.mp3";
		file[Effect.BOAT.ordinal()] = "Boat_Smallboat_Away.mp3";

		delay[Effect.CANNON.ordinal()] = 0;
		delay[Effect.CANNON_DISTANT.ordinal()] = 0;
		delay[Effect.EXPLOSION.ordinal()] = reactionDelay;
		delay[Effect.EXPLOSION_LONG.ordinal()] = reactionDelay;
		delay[Effect.EXPLOSION_DISTANT.ordinal()] = reactionDelay;
		delay[Effect.SPLASH.ordinal()] = reactionDelay;
		delay[Effect.SPLASH_DISTANT.ordinal()] = reactionDelay;
		delay[Effect.SWITCH.ordinal()] = 0;
		delay[Effect.PUSH_BUTTON.ordinal()] = 0;
		delay[Effect.AIRPLANE.ordinal()] = 0;
		delay[Effect.BOAT.ordinal()] = 0;

		loadCannon[Effect.CANNON.ordinal()] = false;
		loadCannon[Effect.CANNON_DISTANT.ordinal()] = false;
		loadCannon[Effect.EXPLOSION.ordinal()] = true;
		loadCannon[Effect.EXPLOSION_LONG.ordinal()] = false;
		loadCannon[Effect.EXPLOSION_DISTANT.ordinal()] = false;
		loadCannon[Effect.SPLASH.ordinal()] = true;
		loadCannon[Effect.SPLASH_DISTANT.ordinal()] = false;
		loadCannon[Effect.SWITCH.ordinal()] = false;
		loadCannon[Effect.PUSH_BUTTON.ordinal()] = false;
		loadCannon[Effect.AIRPLANE.ordinal()] = false;
		loadCannon[Effect.BOAT.ordinal()] = false;

		repaintArray[Effect.CANNON.ordinal()] = false;
		repaintArray[Effect.CANNON_DISTANT.ordinal()] = false;
		repaintArray[Effect.EXPLOSION.ordinal()] = true;
		repaintArray[Effect.EXPLOSION_LONG.ordinal()] = true;
		repaintArray[Effect.EXPLOSION_DISTANT.ordinal()] = true;
		repaintArray[Effect.SPLASH.ordinal()] = true;
		repaintArray[Effect.SPLASH_DISTANT.ordinal()] = true;
		repaintArray[Effect.SWITCH.ordinal()] = false;
		repaintArray[Effect.PUSH_BUTTON.ordinal()] = false;
		repaintArray[Effect.AIRPLANE.ordinal()] = false;
		repaintArray[Effect.BOAT.ordinal()] = false;

	}

	public SoundEffect(Effect effect){
		super(soundDir + file[effect.ordinal()], delay[effect.ordinal()], loadCannon[effect.ordinal()], repaintArray[effect.ordinal()]);
	}
}

