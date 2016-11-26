package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class MainInfo extends GameInfo{
	private boolean varyingColor = false;
	private boolean showAccelInfo = false;
	private boolean showNetworkInfo = true;
	private boolean showGameInfo = true;
	private String imageAccelerated;
	private String imageTrueVolatile;
	private String flipping;
	private String fullScreen;
	private String multiBuffer;
	private String fbAccelerated;
	private String fbTrueVolatile;
	private String bbAccelerated;
	private String bbTrueVolatile;
	private String fpsString = "";
	private String loadSt = "";
	private String shootFirstSt = "";
	private String canonLoadedSt = "";
	private long targetTimeFPS = 0;
	private int frameCounter = 0;
	private int fps = 0;

	public MainInfo(int width, int height){
		super(width, height, 0, 0);
		GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		GraphicsConfiguration gc = device.getDefaultConfiguration();
		ImageCapabilities imageCaps = gc.getImageCapabilities();
		imageAccelerated = "Image accelerated: " + Boolean.toString(imageCaps.isAccelerated());
		imageTrueVolatile = "True volatile: " + Boolean.toString(imageCaps.isTrueVolatile());
		// Buffer Caps
		BufferCapabilities bufferCaps = gc.getBufferCapabilities();
		flipping = "Buffer page flipping: " + Boolean.toString(bufferCaps.isPageFlipping());
		fullScreen = "Buffer fullScreen: " + Boolean.toString(bufferCaps.isFullScreenRequired());
		multiBuffer = "Multibuffer: " + Boolean.toString(bufferCaps.isMultiBufferAvailable());
		// Front buffer caps
		imageCaps = bufferCaps.getFrontBufferCapabilities();
		fbAccelerated = "Front buffer accelerated: " + Boolean.toString(imageCaps.isAccelerated());
		fbTrueVolatile = "Front buffer true volatile: " + Boolean.toString(imageCaps.isTrueVolatile());
		imageCaps = bufferCaps.getFrontBufferCapabilities();
		// Back buffer caps
		imageCaps = bufferCaps.getBackBufferCapabilities();
		bbAccelerated = "Front buffer accelerated: " + Boolean.toString(imageCaps.isAccelerated());
		bbTrueVolatile = "Back buffer true volatile: " + Boolean.toString(imageCaps.isTrueVolatile());
		targetTimeFPS = System.currentTimeMillis() + 1000;
		shootFirstSt = "Shoot first: "+GraphicsEngine.getShootFirst().toString();
	}
	public void updateInfo(){
		if (GraphicsEngine.isLoading()) {
			loadSt = "Loading screen";
		} else {
			loadSt = "Screen loaded";
			shootFirstSt = "Shoot first: "+GraphicsEngine.getShootFirst().toString();
			canonLoadedSt = "Canon loaded: "+GraphicsEngine.isCanonLoaded().toString();
		}
	}
	public void drawStrings(Graphics2D g){
		g.setColor(Color.red);
		if (varyingColor){
			if (fps >= 60){
				g.setColor(GameColors.brightGreen);
			} else {
				g.setColor(Color.red);
			}
		}
		if (!GraphicsEngine.isLoading()){
			drawNextString(g, fpsString);
			drawNextString(g, loadSt);
			if (showAccelInfo){
				drawNextString(g, imageAccelerated);
				drawNextString(g, imageTrueVolatile);
				drawNextString(g, flipping);
				drawNextString(g, fullScreen);
				drawNextString(g, multiBuffer);
				drawNextString(g, fbAccelerated);
				drawNextString(g, fbTrueVolatile);
				drawNextString(g, bbAccelerated);
				drawNextString(g, bbTrueVolatile);
				drawNextString(g, "");
			}
			/*
			drawNextString(g, "Refresh rate: "+Integer.toString(refreshRate)+" Hz");
			drawNextString(g, "Refresh delay ms: "+Integer.toString((int)diff)+" ms");
			drawNextString(g, "Refresh delay ns: "+Integer.toString(refreshDelay)+" ns");
			drawNextString(g, "Ship size: "+Integer.toString(GameButtonShipSelector.getSelectedSize()));
			drawNextString(g, "Repaint: "+Integer.toString(repaintCount));
			drawNextString(g, "Matches: "+Integer.toString(totalMatches));
			drawNextString(g, "pl: "+playerName);
			drawNextString(g, "sTOut: "+Integer.toString(serverTimeout));
			drawNextString(g, "cTOut: "+Integer.toString(clientTimeout));
			drawNextString(g, "waiting: "+Boolean.toString(isWaiting()));
			drawNextString(g, "LastMsg: "+lastMsg);
			drawNextString(g, "LMParts: "+Integer.toString(lastMsgParts));
			drawNextString(g, "LSR: "+lastShotReceived);
			drawNextString(g, "enemy: "+enemyName);
			*/
			if (showNetworkInfo){
				drawNextString(g, "pl: "+GraphicsEngine.getPlayerName());
				drawNextString(g, "enemy: "+GraphicsEngine.getEnemyName());
				drawNextString(g, "sTOut: "+Integer.toString(GraphicsEngine.getServerTimeout()));
				drawNextString(g, "cTOut: "+Integer.toString(GraphicsEngine.getClientTimeout()));
				drawNextString(g, "LastMsg: "+GraphicsEngine.getLastMsg());
				drawNextString(g, "LSR: "+GraphicsEngine.getLastShotReceived());
				drawNextString(g, "Screen: "+GraphicsEngine.lastScreenName);
				drawNextString(g, "waiting: "+Boolean.toString(GraphicsEngine.isWaiting()));
				drawNextString(g, shootFirstSt);
				drawNextString(g, "");
			}
			if (showGameInfo){
				drawNextString(g, "Ongoing match: "+GraphicsEngine.isOngoingMatch().toString());
				drawNextString(g, "Match: "+Integer.toString(GraphicsEngine.getMatchCounter())+"/"+Integer.toString(GraphicsEngine.getTotalMatches()));
				drawNextString(g, canonLoadedSt);
			}
		} else {
			drawNextString(g, loadSt);
		}
	}
	public void paintComponent(Graphics2D g){
		if (GraphicsEngine.isShowingInfo()){
			super.paintComponent(g);
			frameCounter++;
			if (super.getCurrentTime() >= targetTimeFPS){
				fps = frameCounter;
				targetTimeFPS += 1000;
				frameCounter = 0;
				fpsString = "FPS: " + Integer.toString(fps);
			}
		}
	}
}
