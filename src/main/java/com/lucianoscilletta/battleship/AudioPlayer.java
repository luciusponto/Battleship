package com.lucianoscilletta.battleship;
import javax.media.*;
import java.io.*;
import java.net.URL;
import java.util.regex.*;

public class AudioPlayer{
	private URL url;
	private MediaLocator mediaLocator;
	private Player player;
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
	public AudioPlayer(String file){
		this(file, 0, 0, 0);
	}
	public AudioPlayer(String file, double startPosition){
		this(file, startPosition, 0, 0);
	}
	public AudioPlayer(String file, long delay){
		this(file, 0, 0, delay);
		this.isMusic = false;
	}
	public AudioPlayer(String file, long delay, boolean loadCannon, boolean repaint){
		this(file, 0, 0, delay);
		this.loadCannon = loadCannon;
		this.repaint = repaint;
		this.isMusic = false;
	}
	public AudioPlayer(String file, double startPosition, double playTime){
		this(file, startPosition, playTime, 0);
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
				//this.url = (new File(audioFile)).toURI().toURL();
				this.url = this.getClass().getClassLoader().getResource(audioFile);
				//System.out.println(url);
			//}catch(java.net.MalformedURLException e){
			}catch(Exception e){
				System.out.println(e.getMessage());
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
			player.close();
		}
	}

	private MediaLocator getCustomMedia(){
		File path;
		MediaLocator mediaLocator = null;
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
		    mediaLocator =  new MediaLocator(path.toURI().toURL());
		} catch (Exception e) {
		    System.out.println("AudioPlayer: getCustomMedia: could not create mediaLocator");
		}
		if (GraphicsEngine.isTestMode()){
			System.out.println("path: " + path);
		}
		return mediaLocator;
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
			player.setMediaTime(new Time(startPosition));
			player.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error: AudioPlayer.resetPlayer(): media time could not be set.");
		}
	}

	public void start(){
		(new InitPlayer()).start();
	}

	class InitPlayer extends Thread{
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
			}
			try{
				if (!customMode){
					mediaLocator = new MediaLocator(url);
				} else {
					mediaLocator = getCustomMedia();
				}
			}catch (Exception e){
				System.out.println(e.getMessage());
				System.out.println("Error: AudioPlayer.run(): MediaLocator could not be obtained.");
			}
			try{
				player = Manager.createPlayer(mediaLocator);
			}catch(java.io.IOException e){
				System.out.println(e.getMessage());
				System.out.println("Error: AudioPlayer.run(): player could not be created. IOException.");
			}catch(javax.media.NoPlayerException e){
				System.out.println(e.getMessage());
				System.out.println("Error: AudioPlayer.run(): player could not be created. NoPlayerException.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Error: AudioPlayer.run(): player could not be created. Exception.");
			}
			player.addControllerListener(new ControllerListener(){
				public void controllerUpdate(ControllerEvent e){
					if (e instanceof EndOfMediaEvent){
						timeOver();
					} else if (e instanceof StopAtTimeEvent){
						stopPlaying();
					} else if (e instanceof RealizeCompleteEvent){
						startPlayer();
					}
				}
			});
			player.realize();
		}
	}

	private void startPlayer(){
		try {
			player.setMediaTime(new Time(startPosition));
			/*
			if (playTime > 0.0001){
				player.setStopTime(new Time(startPosition + playTime));
			}
			*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error: AudioPlayer.startPlayer(): media time could not be set.");
		}
		GraphicsEngine.setBkgMusicMuted();
		if ( ((!isMusic) && (!GraphicsEngine.getOptions().getSndOptPlaySounds())) || ((isMusic) && (!GraphicsEngine.getOptions().getSndOptPlayMusic())) ){
			player.getGainControl().setLevel(0.0f);
		} else {
			player.getGainControl().setLevel(level);
		}
		if ((GraphicsEngine.isTestMode()) && (!GraphicsEngine.isServer())){ // in test mode play sounds only on server
			player.getGainControl().setLevel(0.0f);
		}
		player.start();
		if (playTime > 0.0001){
			(new StopTimer(playTime)).start();
		}
	}
	public void setMute(boolean value){
		if (null != player){
			player.getGainControl().setMute(value);
		}
	}

	class StopTimer extends Thread{
		long waitTime;
		public StopTimer(double seconds){
			waitTime = Math.round(seconds * 1000);
		}
		public void run(){
			try {
			    sleep(waitTime);
			} catch (Exception e) {
				System.out.println("Error: AudioPlayer.StopTimer.run(): could not sleep.");
			}
			stopPlaying();
		}
	}
	class AudioFileFilter implements java.io.FileFilter{
		private String[] extensions = { "wav", "mp3" };
		private Pattern pattern;
		private Matcher matcher;
		public boolean accept(File pathname){
			String path = "";
			try {
			    path = pathname.getCanonicalPath();
			} catch (Exception e) {
			    Err.msgExit("AudioPlayer: it was not possible to get custom path");
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
