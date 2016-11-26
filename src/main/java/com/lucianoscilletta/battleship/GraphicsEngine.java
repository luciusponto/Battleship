package com.lucianoscilletta.battleship;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.datatransfer.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.sound.*;
import com.lucianoscilletta.battleship.ui.*;
import java.io.*;
import java.net.*;
import java.util.regex.*;
import javax.swing.border.*;

public class GraphicsEngine{
	public static final boolean testMode = false; //As the compiler removes blocks of unreachable code, setting this to false
												//will eliminate various test loops from the compiled code
	public static Boolean animatedMode = false;
	public static Boolean fullScreenMode = false;
	public static boolean showingInfo = true;
	public static boolean ignoreCommandLineArguments = false;
	private static Boolean connected = false;
	private static Boolean connecting = true;
	private static boolean initializingGraphics = false;
	private static final int baseFontSize = 18;
	public static final int baseBorderSize = 5;
	private static final int br[] = { 235, 200, 100, 125 };
	public static final Border defBorder = new BevelBorder(BevelBorder.LOWERED, new Color(br[0], br[0], br[0]), new Color(br[1], br[1], br[1]), new Color(br[2], br[2], br[2]), new Color(br[3], br[3], br[3]));
	private static int preferredFontSize;
	//private static int width = 1280;
	//private static int height = 800;
	private static int repaintCounter = 0;
	private static int width = 1280;
	private static int height = 800;
	private static float scaleFactor = (float)height/768.0f; //the original scale factor of 1 is calculated for 1024 x 768
	private static int componentHorOffset = (width - ((height * 4) / 3))/2;
	private static int gridSize = 10;
	public static int[] shipAmountPerType = { 2, 2, 1, 1, 1 };
	//public static int[] shipAmountPerType = { 1, 1, 0, 0, 0 };
	public static GameGrid friendlyGrid = null;
	public static GameGrid enemyGrid = null;
	public static FriendlyGridUI friendlyGridUI = null;
	public static GridGameUI enemyGridUI = null;
	private static Boolean loading = false;
	public static int corrConst = 0;
	public static JFrame frame = null;
	public static GraphicsDevice device = null;
	public static GraphicsConfiguration gc = null;
	public static Rectangle bounds = null;
	public static BufferStrategy backBuffer = null;
	public static DisplayMode displayMode = null;
	public static Draw draw = null;
	public static GamePanel currentScreen = null;
	public static Boolean running = false;
	public static Boolean vSync = true;
	public static int maxFPS = 60;
	public static int minUpdatePeriod = (int)(1000/maxFPS);
	private static DisplayMode origDisplayMode;
	private static int repaintCount = 1;
	private static boolean isServer = false;
	private static final int serverArgs = 7;
	private static final int clientArgs = 7;
	private static boolean autoDetectIP = false;
	private static String playerName = "";
	private static String enemyName = "";
	private static int serverPort = 5000;
	private static int serverTimeout = 1;
	private static int roundLength = -1;
	private static int clientPort = 5000;
	private static String clientIP = "127.0.0.1";
	private static int clientTimeout = 5000;
	private static BufferedReader reader = null;
	private static PrintWriter writer = null;
	public static final String stSep = ":"; // separator
	public static final String stPlayerName = "playerName";
	public static final String stRoundLength = "roundLength";
	public static final String stMatches = "matches";
	public static final String stChat = "chat";
	public static final String stShipsReady = "shipsReady";
	public static final String stStatus = "status";
	public static final String stShot = "shot";
	public static final String stShotTimeout = "shotTimeout";
	public static final String stWhoStarts = "whoStarts";
	public static final String stMatchOver = "matchOver";
	public static final String stMainPanelLoaded = "mainPanelLoaded";
	public static final String stShootFirst = "shootFirst";
	public static final String stExiting = "exiting";
	public static final String stDisconnecting = "disconnecting";
	private static boolean waiting = false;
	private static boolean mainPanelLoaded = false;
	private static String lastMsg = "";
	private int lastMsgParts = 0;
	private static String lastShotReceived = "";
	private static int totalMatches = 2;
//	private static int winsCounter = 0;
	private static int matchCounter = 0;
	private static int friendlyScore = 0;
	private static int enemyScore = 0;
	private static int friendlyShotsMatch = 0;
	private static int enemyShotsMatch = 0;
	private static int friendlyShotsTotal = 0;
	private static int enemyShotsTotal = 0;
	private static int friendlyHitsMatch = 0;
	private static int enemyHitsMatch = 0;
	private static int friendlyHitsTotal = 0;
	private static int enemyHitsTotal = 0;
	private static boolean gameOver = false;
	private static Boolean canonLoaded = false;
	private static Boolean shootFirst = false;
	private static Boolean ongoingMatch = false;
	public static String lastScreenName = "";
	private static int delayToPostMatch = 0;
	private static boolean firstToExit = true;
	public static final String optionsDir = System.getProperty("user.home") + System.getProperty("file.separator") + ".battleship";
	public static final String optionsFile = optionsDir + System.getProperty("file.separator") + "options.dat";
	public static final String musicDir = System.getProperty("user.home") + System.getProperty("file.separator") + ".battleship" + System.getProperty("file.separator") + "com/lucianoscilletta/battleship/music";
	private static GraphicsEngine engine;
	private static volatile boolean drawThreadActive = false;
	private static volatile boolean stopDrawThread = false;
	private static boolean openGLmode = false;
	private static GameOptions options;
	private static DisplayMode displayModes[];
	private static MenuPanel menuPanel;
	private static Socket socket = null;
	private static ServerSocket serverSocket = null;
	private static String winTitle = "Battleship game";

	static{
		options = new GameOptions();
		origDisplayMode = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
		displayModes = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayModes();
	}

	public GraphicsEngine(){
		openGLmode = getOptions().getGraphOptOpenGL();
	}

	class Draw extends Thread{
		private Graphics2D gBuffer = null;
		private Graphics2D g1 = null;
		private Graphics2D g2 = null;
		private int frameCounter = 0;
		private long timestampFrames = 0;
		private long timestampFrames2 = 0;
		private long timeDiff = 0;
		private Boolean repaint2 = false;
		long diff = 0;
		int fps = 0;
		int avgDelay = 0;
		int refreshRate;
		double refreshPeriod;
		long timestampVsynch;
		long timestampReg;
		long timestampReg2;
		int refreshDelay;
		double quot;
		double divRest;

		public Draw(){
			timestampFrames = System.currentTimeMillis();
			refreshRate = (int)(displayMode.getRefreshRate() * 1);
			refreshPeriod = 1000000000.0 / refreshRate;
			timestampVsynch = System.nanoTime();
			timestampReg = System.nanoTime();
			timestampReg2 = System.nanoTime();
			refreshDelay = 0;
			quot = 0;
			divRest = 0;
			running = true;
		}

		public void drawFrame(){
			try{
				if (fullScreenMode){
					gBuffer = (Graphics2D)backBuffer.getDrawGraphics();
				} else {
					gBuffer = (Graphics2D)frame.getGraphics();
				}
				if ((null != currentScreen) && (false == loading)){
					//currentScreen.update((Graphics)gBuffer);
					frame.repaint();
				}
				if (vSync){
					diff = System.nanoTime();
					diff -= timestampVsynch;
					quot = (double)(diff)/refreshPeriod;
					quot = ((1 - (quot - Math.round(quot))) * refreshPeriod);
					diff = (long)quot/1000000;
					refreshDelay = (int)(int)quot%1000000;
					if (!repaint2) {
						sleep(diff, refreshDelay);
					}
				}
				else {
					timestampReg2 = System.nanoTime();
					diff = timestampReg2 - timestampReg;
					diff = (long)diff/1000000;
					diff = Math.max(1,(minUpdatePeriod - diff));
					timestampReg = timestampReg2;
					if (!repaint2){
						sleep(diff);
					}
					//sleep(14);
				}
			} catch (Exception e){
				Err.msgExceptionExit(e);
			}
		}

		public void run(){
			/*
			while(animatedMode){
				drawFrame();
			}
			*/
			//while (true){
			drawThreadActive = true;
			while (!stopDrawThread){
				if (animatedMode){
					drawFrame();
				} else {
					try {
					    sleep(200);
					} catch (Exception e) {

					}
				}
			}
			drawThreadActive = false;
		}
	}
	public static void closeSockets(){
		if (connected){
			netSend(stDisconnecting);
			connected = false;
		}
		try {
			if (null != serverSocket){
				serverSocket.close();
				serverSocket = null;
			}
			if (null != socket){
				socket.close();
				socket = null;
			}
		} catch (Exception e) {
			Err.msgExit("GraphicsEngine.closeSockets: it was not possible to close the sockets");
		}
	}
	public static GraphicsEngine getInstance(){
		return engine;
	}

	public static GraphicsDevice getDevice(){
		return device;
	}
	public static GameOptions getOptions(){
		return options;
	}
	public static MenuPanel getMenuPanel(){
		return menuPanel;
	}
	public static void saveOptions(){
		try
		{
			(new File(optionsDir)).mkdirs();
			(new File(optionsFile)).createNewFile();
			FileOutputStream fos = new FileOutputStream(optionsFile);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(options);
			out.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
			Err.msg("It was not possible to save the options");
		}
	}
	public static void loadOptions(){
		final String msg = "It was not possible to load the options";
		if (new File(optionsFile).exists()){
			try
			{
				FileInputStream fis = new FileInputStream(optionsFile);
				ObjectInputStream in = new ObjectInputStream(fis);
				options = (GameOptions)in.readObject();
				in.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
				Err.msg(msg);
			}
			catch(ClassNotFoundException ex)
			{
				ex.printStackTrace();
				Err.msg(msg);
			}
		}
	}
	public static void setBkgMusicMuted(){
		currentScreen.setMute(!getOptions().getSndOptPlayMusic());
	}
	public static synchronized void netSend(String st){
		if (null != writer){
			writer.println(st);
			writer.flush();
		}
	}
	public static void setOngoingMatch(Boolean status){
		ongoingMatch = status;
	}
	public static Boolean isOngoingMatch(){
		return ongoingMatch;
	}
	public static void setCanonLoaded(Boolean status){
		canonLoaded = status;
		CannonLight.light(status);
		if (testMode){
			if ((true == status) && (isServer())){
				clipPut("server playing");
			}
			if ((true == status) && (!isServer())){
				clipPut("client playing");
			}
		}
	}
	public static boolean isTestMode(){
		return testMode;
	}
	public static Boolean isCanonLoaded(){
		return canonLoaded;
	}
	public static void setGameOver(boolean status){
		gameOver = status;
	}
	public static int getRoundLength(){
		return roundLength;
	}
	public static Boolean getShootFirst(){
		return shootFirst;
	}
	public static int getMatches(){
		return totalMatches;
	}
	public static void incMatchCounter(){
		matchCounter++;
	}
	public static int getMatchCounter(){
		return matchCounter;
	}
	public static boolean isGameOver(){
		//return gameOver;
		if (matchCounter >= totalMatches){
			return true;
		} else {
			return false;
		}
	}
	public static synchronized boolean isWaiting(){
		return waiting;
	}
	public static synchronized void setWaiting(boolean status){
		waiting = status;
	}
	public static boolean isMainPanelLoaded(){
		return mainPanelLoaded;
	}
	public static void incFriendlyScore(){
		friendlyScore++;
	}
	public static void incEnemyScore(){
		enemyScore++;
	}
	public static void incFriendlyShots(){
		friendlyShotsMatch++;
		friendlyShotsTotal++;
	}
	public static void incEnemyShots(){
		enemyShotsMatch++;
		enemyShotsTotal++;
	}
	public static void incFriendlyHits(){
		friendlyHitsMatch++;
		friendlyHitsTotal++;
	}
	public static void incEnemyHits(){
		enemyHitsMatch++;
		enemyHitsTotal++;
	}

	public static boolean isServer(){
		return isServer;
	}
	public static int getFriendlyScore(){
		return friendlyScore;
	}
	public static int getFriendlyShotsMatch(){
		return friendlyShotsMatch;
	}
	public static int getFriendlyShotsTotal(){
		return friendlyShotsTotal;
	}
	public static int getFriendlyHitsMatch(){
		return friendlyHitsMatch;
	}
	public static int getFriendlyHitsTotal(){
		return friendlyHitsTotal;
	}
	public static int getEnemyScore(){
		return enemyScore;
	}
	public static int getEnemyShotsMatch(){
		return enemyShotsMatch;
	}
	public static int getEnemyShotsTotal(){
		return enemyShotsTotal;
	}
	public static int getEnemyHitsMatch(){
		return enemyHitsMatch;
	}
	public static int getEnemyHitsTotal(){
		return enemyHitsTotal;
	}
	public static void setTitle(String s){
		frame.setTitle(s);
	}
	public void initGame(){
		waiting = true;
		matchCounter = 0;
		friendlyScore = 0;
		enemyScore = 0;
		friendlyShotsMatch = 0;
		enemyShotsMatch = 0;
		friendlyShotsTotal = 0;
		enemyShotsTotal = 0;
		friendlyHitsMatch = 0;
		enemyHitsMatch = 0;
		friendlyHitsTotal = 0;
		enemyHitsTotal = 0;
		gameOver = false;
		Boolean canonLoaded = false;
		Boolean shootFirst = false;
		Boolean ongoingMatch = false;
		friendlyGrid = new GameGrid(gridSize, gridSize);
		enemyGrid = new GameGrid(gridSize, gridSize);
	}
	public void connect(){
		initGame();
		loadScreen(new ConnectingPanel());
		if (isServer){
			serverPort = getOptions().getServerPort();
			serverTimeout = getOptions().getServerTimeout();
			totalMatches = getOptions().getServerMatches();
			roundLength = getOptions().getServerRoundLength();
			playerName = getOptions().getServerPlayerName();
			(new Thread(new ServerListener())).start();
		} else {
			playerName = getOptions().getClientPlayerName();
			clientIP = getOptions().getClientIP();
			clientPort = getOptions().getClientPort();
			clientTimeout = getOptions().getClientTimeout();
			(new Thread(new ClientConnection())).start();
		}
	}
	public void connectServer(){
		if (Math.random() * 2 >= 1.0f){
			shootFirst = true;
		} else {
			shootFirst = false;
		}
		isServer = true;
		connect();
	}
	public void connectClient(){
		isServer = false;
		connect();
	}
	public static void loadWarRoom(){
		friendlyHitsMatch = 0;
		enemyHitsMatch = 0;
		friendlyShotsMatch = 0;
		enemyShotsMatch = 0;
		GraphicsEngine.friendlyGrid.reset();
		WarRoomPanel.resetButtons();
		loadScreen(new WarRoomPanel());
	}
	public void initGraphics(){
		if ((openGLmode) && (null != currentScreen)){
			return; // Execute OpenGL mode changes only when game is restarted
		}
		initializingGraphics = true;
		stopDrawThread = true;
		while (drawThreadActive){
			try {
				Thread.sleep(200);
			} catch (Exception e) {
			}
		}
		stopDrawThread = false;
		//animatedMode = false; // stops animation until com.lucianoscilletta.battleship.graphics are reconfigured
		if (null != frame){
			frame.dispose();
		}
		if ( -1 == getOptions().getGraphOptRes()){
			DisplayMode orig = origDisplayMode;
			for (int i = 0; i < displayModes.length; i++){
				DisplayMode curr = displayModes[i];
				if (orig.equals(curr)){
					getOptions().setGraphOptRes(i);
				}
			}
		}
		if ( -1 == getOptions().getGraphOptRes()){
			Err.msgExit("Invalid display mode " + Integer.toString(getOptions().getGraphOptRes()));
		}
		width = displayModes[getOptions().getGraphOptRes()].getWidth();
		height = displayModes[getOptions().getGraphOptRes()].getHeight();
		scaleFactor = (float)height/768.0f; //the original scale factor of 1 is calculated for 1024 x 768
		componentHorOffset = (width - ((height * 4) / 3))/2;
		preferredFontSize = Math.round(baseFontSize * GraphicsEngine.getScaleFactor());
		if (openGLmode){
			fullScreenMode = true;
			animatedMode = true;
			System.setProperty("sun.java2d.opengl", "true");
		} else {
			fullScreenMode = getOptions().getGraphOptFullscreen();
			animatedMode = getOptions().getGraphOptAnimated();
			System.setProperty("sun.java2d.opengl", "false");
		}
		if (null == device){
			device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			origDisplayMode = device.getDisplayMode();
		} else {
			device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		}
		gc = device.getDefaultConfiguration();
		if (fullScreenMode){
			frame = new JFrame(gc);
			frame.setUndecorated(true);
			frame.setResizable(false);
			frame.setIgnoreRepaint(true);
			device.setFullScreenWindow(frame);
			//device.setDisplayMode(new DisplayMode(width, height, 32, 0));
			device.setDisplayMode(displayModes[getOptions().getGraphOptRes()]);
			displayMode = device.getDisplayMode();
			bounds = frame.getBounds();
			frame.createBufferStrategy(2);
			backBuffer = frame.getBufferStrategy();
			enterFullScreenMode();
		} else {
			frame = new JFrame();
			if (animatedMode){
				frame.setIgnoreRepaint(true);
			}
			frame.setResizable(false);
			frame.setSize(width+50, height+50);
			frame.setVisible(true);
			displayMode = device.getDisplayMode();
		}
		frame.setTitle(winTitle);
		frame.addWindowListener(new GraphicsEngineWindowListener());
		menuPanel = new MenuPanel();
		if (null == currentScreen){
			loadScreen(new MainMenuPanel());
		} else {
			try {
			    loadScreen((currentScreen.getClass()).newInstance());
			} catch (Exception e) {
			    Err.msgExit("GraphicsEngine.initGraphics: error loading screen");
			}
		}
		try {
			UIManager.setLookAndFeel(
				UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e){}
			draw = null;
		if ((animatedMode) && (null == draw)) {
			draw = new Draw();
			draw.setPriority(Thread.MAX_PRIORITY);
			draw.start();
		}
		initializingGraphics = false;
	}

	public void init(){
		loadOptions();
		initGame();
		initGraphics();
	}
	public static void exit(){
		if (firstToExit){
			netSend(stExiting);
		}
		//(new Exception()).printStackTrace();
		if (testMode){
			if (isServer){
				System.out.println("Server exiting");
			} else {
				System.out.println("Client exiting");
			}
		}
		if (fullScreenMode){
			exitFullScreenMode();
		}
		System.exit(0);
	}
	public static void enterFullScreenMode(){
		device.setFullScreenWindow(frame);
		//device.setDisplayMode(new DisplayMode(width, height, 32, 0));
		device.setDisplayMode(displayModes[getOptions().getGraphOptRes()]);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		repaint();
	}

	public static void exitFullScreenMode(){
		System.setProperty("sun.java2d.opengl", "false");
		animatedMode = false;
		GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(null);
		frame.repaint();
		frame.setExtendedState(Frame.ICONIFIED);
	}

	public static synchronized void loadScreen(GamePanel screen){
		loading = true;
		lastScreenName = GameUtils.getClassName(screen);
		if (testMode){
			System.out.println("loading "+lastScreenName);
			System.out.println("loading 1");
		}
		if (null != currentScreen) {
			//synchronized(currentScreen) {
				currentScreen.finalizePanel();
				frame.remove(currentScreen);
				//frame.removeAll(); - doesnt work because the content pane is also removed
			//}
			if (testMode){
				System.out.println("loading 1.5");
			}
			KeyListener[] kla = frame.getKeyListeners();
			if (testMode){
				System.out.println(Integer.toString(kla.length)+" keyListeners found.");
			}
			for (int i = 1; i < kla.length; i++){
				if (testMode){
					System.out.println("Removing keyList "+Integer.toString(i)+" of "+Integer.toString(kla.length));
				}
				frame.removeKeyListener(kla[i]);
			}
		}
		if (testMode){
			System.out.println("loading 2");
		}
		if (null != screen.getKeyListener()){
			frame.addKeyListener(screen.getKeyListener());
		}
		if (testMode){
			System.out.println("loading 3");
		}
		frame.getContentPane().add(screen);
		if (testMode){
			System.out.println("loading 4");
		}
		frame.validate();
		if (testMode){
			System.out.println("loading 5");
		}
		if (!fullScreenMode){
			frame.pack();
		}
		if (testMode){
			System.out.println("loading 6");
		}
		currentScreen = screen;
		if (testMode){
			System.out.println("loading 7");
		}
		if (testMode){
			System.out.println("loading 8");
		}
		frame.repaint();
		if (testMode){
			System.out.println("loading 9");
		}
		if (testMode){
		System.out.println("loading finished");
		System.out.println("");
		}
		loading = false;
	}
	public static boolean isShowingInfo(){
		return showingInfo;
	}
	public static boolean isLoading(){
		return loading;
	}
	public static String getPlayerName(){
		return playerName;
	}
	public static String getEnemyName(){
		return enemyName;
	}
	public static void setPlayerName(String name){
		if (!name.equals("")){
			playerName = name;
		} else {
			if (isServer){
				playerName = "Player server";
			} else {
				playerName = "Player client";
			}
		}
	}
	public static void main(String[] args2){
		/*
		String[] args = { "server", "5010", "30", "3", "30", "Server player", "true" };
		if (!ignoreCommandLineArguments){
			System.arraycopy(args2, 0, args, 0, args2.length);
		}
		if (args.length < 1){
			Err.msgExit("Wrong number of arguments");
			if ((!args[0].equals("server")) && (!args[0].equals("client"))){
				Err.msgExit("First argument must be either \"server\" or \"client\"");
			}
		}
		if (args[0].equals("server")){
			if (args.length < serverArgs){
				Err.msgExit("Server: wrong number of arguments");
			}
			isServer = true;
			try {
				serverPort = Integer.parseInt(args[1]);
				serverTimeout = Integer.parseInt(args[2]);
				totalMatches = Integer.parseInt(args[3]);
				roundLength = Integer.parseInt(args[4]);
				setPlayerName(args[5]);
				if (args[6].equals("true")){
					fullScreenMode = true;
				} else {
					fullScreenMode = false;
				}
				if (Math.random() * 2 >= 1.0f){
					shootFirst = true;
				} else {
					shootFirst = false;
				}
			} catch (Exception e) {
			    Err.msgExit("Integer command-line argument expected");
			}
		} else {
			if (args.length < clientArgs){
				Err.msgExit("Client: wrong number of arguments");
			}
			try {
				clientIP = args[1];
				clientPort = Integer.parseInt(args[2]);
				clientTimeout = Integer.parseInt(args[3]) * 1000;
				if (args[4].equals("true")){
					autoDetectIP = true;
				} else {
					autoDetectIP = false;
				}
				setPlayerName(args[5]);
				if (args[6].equals("true")){
					fullScreenMode = true;
				} else {
					fullScreenMode = false;
				}
			} catch (Exception e) {
			    Err.msgExit("Integer command-line argument expected");
			}
		}
		*/
		engine = new GraphicsEngine();
		engine.init();
		//engine.connect();
	}

	public static int getWidth(){
		return width;
	}

	public static int getHeight(){
		return height;
	}
	public static int getPrefFontSize(){
		return preferredFontSize;
	}
	public static Boolean isConnected(){
		return connected;
	}
	public static float getScaleFactor(){
		return scaleFactor;
	}

	public static void repaint(){
		if (!animatedMode){
			/*
			repaintCounter++;
			if (repaintCounter > 22){
				System.out.println(repaintCounter);
				(new Exception()).printStackTrace();
				System.out.println("\n");
			}
			*/
			frame.repaint();
		}
	}

	public static int getHorOffset(){
		return componentHorOffset;
	}

	public static int getServerTimeout(){
		return serverTimeout;
	}
	public static int getClientTimeout(){
		return clientTimeout;
	}
	public static String getLastMsg(){
		return lastMsg;
	}
	public static String getLastShotReceived(){
		return lastShotReceived;
	}
	public static int getMatchesPlayed(){
		return matchCounter;
	}
	public static int getTotalMatches(){
		return totalMatches;
	}
	public static void postMatch(boolean win){
		setOngoingMatch(false);
		(new PostMatchPending(delayToPostMatch, win)).start();
	}
	static class PostMatchPending extends Thread{
		private long targetTime = 0;
		private static boolean win;
		public PostMatchPending(int timeSecs, boolean winS){
			targetTime = System.currentTimeMillis() + (timeSecs*1000);
			win = winS;
		}
		public void run(){
			while (System.currentTimeMillis() < targetTime){
				try {
					sleep(200);
				} catch (Exception e) {

				}
			}
			GraphicsEngine.loadScreen(new PostMatchPanel(win));
		}
	}
	public static void clipPut(String s){
		class CO implements ClipboardOwner{
			public void lostOwnership(Clipboard c, Transferable t){
			}
		}
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents((new StringSelection(s)), (new CO()));
	}
	class ServerListener implements Runnable{
		public void run(){
			serverSocket = null;
			Socket clientSocket = null;
			try{
				serverSocket = new ServerSocket();
				serverSocket.setSoTimeout(serverTimeout * 1000);
				serverSocket.setReuseAddress(true);
				serverSocket.bind(new InetSocketAddress(serverPort));
			} catch (Exception e){
					Err.msgExit("Could not start server: "+e.getMessage());
			}
			try{
				clientSocket = serverSocket.accept();
				writer = new PrintWriter(clientSocket.getOutputStream());
				InputStreamReader streamReader = new InputStreamReader(clientSocket.getInputStream());
				reader = new BufferedReader(streamReader);
				netSend(stMatches + stSep + Integer.toString(totalMatches));
			} catch (Exception e){
				loadScreen(new ConnectionFailedPanel());
			}
			if (null != clientSocket) {
				//Err.msg("IncomingReaderServer initialized");
				//(new Thread(new IncomingReaderServer())).start();
				connected = true;
				(new Thread(new IncomingReader())).start();
				//loadScreen(new WarRoomPanel());
				loadWarRoom();
			} else {
				loadScreen(new ConnectionFailedPanel());
			}
		}
	}

	class ClientConnection implements Runnable{
		public void run(){
			long targetTime = System.currentTimeMillis() + clientTimeout;
			while (System.currentTimeMillis() < targetTime){
				try {
					Thread.sleep(500);
					socket = new Socket(clientIP, clientPort);
					InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
					reader = new BufferedReader(streamReader);
					writer = new PrintWriter(socket.getOutputStream());
				} catch (Exception e) {
					//e.printStackTrace();
					//Err.msgExit("Could not connect to server: "+e.getMessage());
				}
				if (null != reader){
					//Err.msg("IncomingReaderClient initialized");
					//(new Thread(new IncomingReaderClient())).start();
					connected = true;
					(new Thread(new IncomingReader())).start();
					break;
				}
			}
			if (null != reader) {
				//loadScreen(new WarRoomPanel());
				loadWarRoom();
			} else {
				//Err.msgExit("Could not connect to server: timeout");
				loadScreen(new ConnectionFailedPanel());
			}
		}
	}

	class IncomingReader implements Runnable{
		/*
		public static final String stSep = ":"; // separator
		public static final String stShot = "shot";
		public static final String stStatus = "status";
		public static final String stChat = "chat";
		public static final String stMatchOver = "matchOver";
		public static final String stPlayerName = "playerName";
		public static final String stRoundLength = "roundLength";
		public static final String stMatches = "matches";
		public static final String stShipsReady = "shipsReady";
		public static final String stWhoStarts = "whoStarts";
		public static final String stMainPanelLoaded = "mainPanelLoaded";

		*/
		public void run(){
			String msg;
			String[] parts;
			Pattern p = Pattern.compile(stSep);
			netSend(stPlayerName + stSep + playerName);
			if (isServer()){
				netSend(stRoundLength + stSep + Integer.toString(getRoundLength()));
				netSend(stShootFirst + stSep + shootFirst.toString());
			}
			try {
			    while (null != (msg = reader.readLine())){
					if (!connected){
						return;
					}
					parts = p.split(msg);
					lastMsg = msg;
					lastMsgParts = parts.length;
					try{
						if (parts.length > 0){
							if (parts[0].equals(stShot)){
								(new SoundEffect(SoundEffect.Effect.CANNON_DISTANT)).start();
								friendlyGridUI.shoot(Integer.parseInt(parts[1]),Integer.parseInt(parts[2]));
								lastShotReceived = parts[1] + " " + parts[2];
								//GraphicsEngine.setCanonLoaded(true);
								incEnemyShots();
							} else if (parts[0].equals(stShotTimeout)){
								if (!(friendlyGrid.isGameOver())){
									GraphicsEngine.setCanonLoaded(true);
								}
							} else if (parts[0].equals(stStatus)){
								try{
									enemyGridUI.updateStatus(parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
								} catch (Exception e){
									//Err.msg(Integer.toString(parts.length));
									System.out.println(parts[0]);
									e.printStackTrace();
								}
							} else if (parts[0].equals(stMainPanelLoaded)){
								mainPanelLoaded = true;
							} else if (parts[0].equals(stChat)){
								ChatOutputUI.appendEnemy(parts[1]);
							} else if (parts[0].equals(stMatchOver)){
								GraphicsEngine.incFriendlyScore();
								GraphicsEngine.postMatch(true);
							} else if (parts[0].equals(stShipsReady)){
								setWaiting(false);
							} else if (parts[0].equals(stMatches)){
								totalMatches = Integer.parseInt(parts[1]);
							} else if (parts[0].equals(stPlayerName)){
								enemyName = parts[1];
							} else if (parts[0].equals(stShootFirst)){
								if (parts[1].equals("false")){
									shootFirst = true;
								} else {
									shootFirst = false;
								}
							} else if (parts[0].equals(stExiting)){
								firstToExit = false;
								if (!isGameOver()){
									loadScreen(new PlayerLeftPanel());
									return;
								}
							} else if (parts[0].equals(stDisconnecting)){
								connected = false;
								if (!isGameOver()){
									loadScreen(new PlayerLeftPanel());
									return;
								}
							} else if (parts[0].equals(stRoundLength)){
								if (!isServer()){
									roundLength = Integer.parseInt(parts[1]);
								}
							} else {
							}
						}
					} catch (Exception e){
						Err.msgExit("Error decoding network message");
					}
					Thread.sleep(100);
				}
			} catch (Exception e) {
				e.printStackTrace();
				if ((connected) && (!isGameOver())){
					if(isServer){
						loadScreen(new ConnectionFailedPanel());
					} else {
						loadScreen(new ConnectionFailedPanel());
					}
				}
			}
		}
	}
	class GraphicsEngineWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			GraphicsEngine.exit();
		}
		public void windowGainedFocus(WindowEvent e) {
			if (fullScreenMode){
				enterFullScreenMode();
			}
		}
		public void windowLostFocus(WindowEvent e) {
			//GraphicsEngine.exit();
		}
		public void windowDeactivated(WindowEvent e) {
			if (fullScreenMode){
				if (!initializingGraphics){
					//exitFullScreenMode();
				}
			}
		}
		public void windowActivated(WindowEvent e) {
			if (fullScreenMode){
				enterFullScreenMode();
			}
		}
	}
	/*
	class KL extends KeyAdapter{
	    public void keyPressed(KeyEvent e) {
			char keyChar = e.getKeyChar();
			String keyText = e.getKeyText(e.getKeyCode());
			System.out.println(keyText);
			if ("Equals" == keyText){
			}
			if ("Minus" == keyText){
			}
			if ("F2" == keyText){
				if (showingInfo){
					showingInfo = false;
				} else {
					showingInfo = true;
				}
				frame.repaint();
			}
		}
	}
	*/
}

