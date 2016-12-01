package com.lucianoscilletta.battleship;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AudioPlayer{
	private URL url;
	private MediaPlayer player;
	private long delay;
	private double startPosition = 0;
	private double playTime = 0;
	private int loopCount;
	private int maxLoops;
	private String customDir;
	private boolean customMode = false;
	private boolean shuffleCustom;
	private int customIndex = 0;
	private File[] customFiles;
	private float level;
	private boolean loadCannon = false;
	private boolean repaint = false;
	private boolean isMusic = false;

	// initialise Java FX
	static JFXPanel jfxPanel = new JFXPanel();

	public AudioPlayer(String customDir, boolean shuffleCustom, float level){
		this.customDir = customDir;
		this.shuffleCustom = shuffleCustom;
		this.customMode = true;
		this.customFiles = (new File(customDir)).listFiles(new AudioFileFilter());
		this.delay = 0;
		this.startPosition = 0;
		this.playTime = 0;
		this.maxLoops = 0;
		this.loopCount = 0;
		this.level = level;
	}
	public AudioPlayer(String file, long delay, boolean loadCannon, boolean repaint){
		this(file, 0, 0, delay);
		this.loadCannon = loadCannon;
		this.repaint = repaint;
		this.isMusic = false;
	}
	public AudioPlayer(String audioFile, double startPosition, double playTime, long delay){
		this(audioFile, startPosition, playTime, delay, 1);
	}
	public AudioPlayer(String audioFile, double startPosition, double playTime, long delay, int loops){
		this(audioFile, startPosition, playTime, delay, loops, 1.0f);
	}
	public AudioPlayer(String audioFile, double startPosition, double playTime, long delay, int loops, float level){
		this.delay = delay;
		this.startPosition = startPosition;
		this.playTime = playTime;
		this.maxLoops = loops;
		this.loopCount = 0;
		this.level = level;
		if (null != audioFile){
			try {
				this.url = this.getClass().getClassLoader().getResource(audioFile);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		this.customMode = false;
		this.loadCannon = false;
		this.repaint = false;
		this.isMusic = true;
	}

	public void stopPlaying(){
		if (null != player){
			player.stop();
			player.dispose();
		}
	}

	private Media getCustomMedia(){
		File path;
		Media media = null;
		if (shuffleCustom){
			path = customFiles[(int)Math.round(Math.random() * (customFiles.length - 1))];
		} else {
			path = customFiles[customIndex];
			customIndex++;
			if (customIndex >= customFiles.length){
				customIndex = 0;
			}
		}
		try {
		    media =  new Media(path.toURI().toString());
		} catch (Exception e) {
		    System.out.println("AudioPlayer: getCustomMedia: could not create mediaLocator");
			e.printStackTrace();
		}
		if (GraphicsEngine.isTestMode()){
			System.out.println("path: " + path);
		}
		return media;
	}

	private void timeOver(){
		/*
		if (loadCannon){
			GraphicsEngine.setCanonLoaded(true);
		}
		*/
		if (customMode){
			try {
			   this.start();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("error AudioPlayer.timeOver()");
			}
		} else {
			if (maxLoops >= 0){
				loopCount++;
				if (loopCount >= maxLoops){
					stopPlaying();
				} else {
					resetPlayer();
				}
			} else {
				resetPlayer();
			}
		}
	}

	private void resetPlayer(){
		try {
			player.setStartTime(new Duration(startPosition * 1000));
			player.play();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error: AudioPlayer.resetPlayer(): media time could not be set.");
			e.printStackTrace();
		}
	}

	public void start(){
		(new InitPlayer()).start();
	}

	private class InitPlayer extends Thread{
		public void run(){
			try {
				if (delay > 0){
					sleep(delay);
				}
				if (loadCannon){
					GraphicsEngine.setCanonLoaded(true);
				}
				if (repaint){
					GraphicsEngine.enemyGridUI.updateBkg();
					GraphicsEngine.friendlyGridUI.updateBkg();
					GraphicsEngine.repaint();
				}
			} catch (Exception e){
				System.out.println("Error: AudioPlayer.run(): Error updating UI.");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			Media media = null;
			try{
				if (!customMode){
					media = new Media(url.toURI().toString());
				} else {
					media = getCustomMedia();
				}
			}catch (Exception e){
				System.out.println(e.getMessage());
				System.out.println("Error: AudioPlayer.run(): MediaLocator could not be obtained.");
				e.printStackTrace();
			}
			try {
				player = new MediaPlayer(media);
			} catch (javafx.scene.media.MediaException e) {
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Error: AudioPlayer.run(): player could not be created. Exception.");
				e.printStackTrace();
			}
			player.setOnEndOfMedia(new Runnable() {
				@Override
				public void run() {
				   timeOver();
				}
			});
			player.setOnStopped(new Runnable() {
				@Override
				public void run() {
					stopPlaying();
				}
			});

			// replacing jmf player.realize() and jmf's event triggered when player is fully realized
			player.setOnReady(new Runnable() {
				@Override
				public void run() {
					startPlayer();
				}
			});
        }
	}

	private void startPlayer(){
		try {
			player.setStartTime(new Duration(startPosition * 1000));
			/*
			if (playTime > 0.0001){
				player.setStopTime(new Time(startPosition + playTime));
			}
			*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error: AudioPlayer.startPlayer(): media time could not be set.");
			e.printStackTrace();
		}
		GraphicsEngine.setBkgMusicMuted();
		if ( ((!isMusic) && (!GraphicsEngine.getOptions().getSndOptPlaySounds())) || ((isMusic) && (!GraphicsEngine.getOptions().getSndOptPlayMusic())) ){
			player.setVolume(0);
		} else {
			player.setVolume(level);
		}
		if ((GraphicsEngine.isTestMode()) && (!GraphicsEngine.isServer())){ // in test mode play sounds only on server
			player.setVolume(0);
		}
		player.play();
		if (playTime > 0.0001){
			(new StopTimer(playTime)).start();
		}
	}
	public void setMute(boolean value){
		if (null != player){
			player.setMute(value);
		}
	}

	private class StopTimer extends Thread{
		long waitTime;
		public StopTimer(double seconds){
			waitTime = Math.round(seconds * 1000);
		}
		public void run(){
			try {
			    sleep(waitTime);
			} catch (Exception e) {
				System.out.println("Error: AudioPlayer.StopTimer.run(): could not sleep.");
				e.printStackTrace();
			}
			stopPlaying();
		}
	}
	private class AudioFileFilter implements java.io.FileFilter{
		private String[] extensions = { "wav", "mp3" };
		private Pattern pattern;
		private Matcher matcher;
		public boolean accept(File pathname){
			String path = "";
			try {
			    path = pathname.getCanonicalPath();
			} catch (Exception e) {
			    Err.msgExit("AudioPlayer: it was not possible to get custom path");
				e.printStackTrace();
			}
			for (int i = 0; i < extensions.length; i++){
				pattern = Pattern.compile(Pattern.quote(".") + extensions[i] + "$");
				matcher = pattern.matcher(path);
				while(matcher.find()){
					return true;
				}
			}
			return false;
		}
	}

}
