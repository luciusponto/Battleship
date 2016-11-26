package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;
import java.io.*;

public class MenuPanel extends JPanel implements Serializable{
	private enum textType { TITLE, BUTTON, BUTTON_PANEL, INPUT, PREC, CHECKBOX, COMBO, OTHER };
	private String fontName[] = { Font.SANS_SERIF, Font.SANS_SERIF, Font.SANS_SERIF, Font.SANS_SERIF, Font.SANS_SERIF, Font.SANS_SERIF, Font.SANS_SERIF, Font.SANS_SERIF};
	private int fontStyle[] = { Font.PLAIN, Font.PLAIN, Font.PLAIN, Font.BOLD, Font.BOLD, Font.BOLD, Font.PLAIN, Font.BOLD};
	private int fontSize[] = { Math.round(30 * GraphicsEngine.getScaleFactor()),
		Math.round(26 * GraphicsEngine.getScaleFactor()),
		Math.round(26 * GraphicsEngine.getScaleFactor()),
		Math.round(16 * GraphicsEngine.getScaleFactor()),
		Math.round(16 * GraphicsEngine.getScaleFactor()),
		Math.round(16 * GraphicsEngine.getScaleFactor()),
		Math.round(16 * GraphicsEngine.getScaleFactor()),
		Math.round(16 * GraphicsEngine.getScaleFactor())
	};
	private Color fontColor[] = { GameColors.menuTitle, GameColors.menuButton, GameColors.menuButton, GameColors.menuInput, GameColors.menuPrec, GameColors.menuPrec, GameColors.menuButton, GameColors.menuOther };
	private Font font[] = { new Font(fontName[0], fontStyle[0], fontSize[0]),
		new Font(fontName[1], fontStyle[1], fontSize[1]),
		new Font(fontName[2], fontStyle[2], fontSize[2]),
		new Font(fontName[3], fontStyle[3], fontSize[3]),
		new Font(fontName[4], fontStyle[4], fontSize[4]),
		new Font(fontName[5], fontStyle[5], fontSize[5]),
		new Font(fontName[6], fontStyle[6], fontSize[6]),
		new Font(fontName[7], fontStyle[7], fontSize[7]),
	};
	private int alignment[] = { JLabel.CENTER, JLabel.CENTER, JLabel.CENTER, JLabel.CENTER, JLabel.RIGHT, JLabel.LEFT, JLabel.LEFT, JLabel.CENTER };
	private CardLayout cl;
	private ArrayList<String> cards;
	private String filename = GraphicsEngine.optionsFile;
	private boolean mainEnabled = false;
	private DisplayMode modes[] = GraphicsEngine.getDevice().getDisplayModes();
	private JPanel panelMain;
	private JButton buttonPanelServer;
	private JButton buttonPanelClient;
	private JButton buttonPanelOptions;
	private JButton buttonCredits;
	private JButton buttonMainExit;
	private JLabel labelMainTitle;
	private JPanel panelServer;
	private JTextField inputServerGameName;
	private JTextField inputServerPlayerName;
	private JSpinner spinnerServerPort;
	private JSpinner spinnerServerTimeout;
	private JSpinner spinnerServerMatches;
	private JSpinner spinnerServerRoundLength;
	private JButton buttonStartServer;
	private JButton buttonCancelServer;
	private JLabel labelServerTitle;
	private JLabel labelServerTimeout;
	private JLabel labelServerPort;
	private JLabel labelServerPlayerName;
	private JLabel labelServerMatches;
	private JLabel labelServerRoundLength;
	private JLabel labelServerGameName;
	private JPanel panelClient;
	private JLabel labelClientPlayerName;
	private JLabel labelClientTitle;
	private JTextField inputClientPlayerName;
	private JTextField inputClientIP;
	private JLabel labelClientIP;
	private JSpinner spinnerClientPort;
	private JLabel labelClientPort;
	private JSpinner spinnerClientTimeout;
	private JButton buttonCancelClient;
	private JButton buttonJoinClient;
	private JLabel labelClientTimeout;
	private JPanel panelOptions;
	private JButton buttonPanelGraphOpt;
	private JLabel labelOptionsTitle;
	private JButton buttonPanelSndOpt;
	private JButton buttonPanelQuitMain;
	private JPanel panelGraphOpt;
	private JComboBox<String> comboGraphOptRes;
	private JLabel labelGraphOptTitle;
	private JCheckBox checkboxGraphOptFullscreen;
	private JButton buttonCancelGraphOpt;
	private JButton buttonOKGraphOpt;
	private JLabel labelGraphOptRes;
	private JPanel panelSndOpt;
	private JLabel labelSndOptTitle;
	private JButton buttonCancelSndOpt;
	private JButton buttonOKSndOpt;
	private JCheckBox checkboxSndOptPlaySounds;
	private JCheckBox checkboxSndOptPlayMusic;
	private JPanel panelQuitMain;
	private JLabel labelQuitMainTitle;
	private JButton buttonCancelQuitMain;
	private JButton buttonOKQuitMain;
	public MenuPanel(){
		super();
		this.addKeyListener(new AnyKeyAdapter());
		this.addMouseListener(new AnyMouseAdapter());
		cards = new ArrayList<String>();
		this.setVisible(true);
		cl = new CardLayout();
		this.setLayout(cl);
		this.setBackground(GameColors.menuBkg);
		String stModes[];
		stModes = new String[modes.length];
		for (int i = 0; i < stModes.length; i++){
			stModes[i] = ((Integer)(modes[i].getWidth())).toString() + " x " + ((Integer)(modes[i].getHeight())).toString() + " x " + ((Integer)(modes[i].getBitDepth())).toString() + " " + ((Integer)(modes[i].getRefreshRate())).toString() + "Hz";
		}
		int width = Math.round(GraphicsEngine.getScaleFactor() * 433);
		int height = Math.round(GraphicsEngine.getScaleFactor() * 473);
		int origX = Math.round(((GraphicsEngine.getWidth() -  width) * ((float)1/2)));
		int origY = Math.round(((GraphicsEngine.getHeight() - height) * ((float)5/7)));
		Dimension size = new Dimension(width, height);

		panelMain = new JPanel(new SpringLayout());
		addPanel(panelMain, "panelMain", this);
		buttonPanelServer = new JButton("Start Lan / Internet game");
		addComponent(buttonPanelServer, panelMain, "panelServer", 55, 89, 330, 50, textType.BUTTON_PANEL, null);
		buttonPanelClient = new JButton("Join Lan / Internet game");
		addComponent(buttonPanelClient, panelMain, "panelClient", 55, 161, 330, 50, textType.BUTTON_PANEL, null);
		buttonPanelOptions = new JButton("Options");
		addComponent(buttonPanelOptions, panelMain, "panelOptions", 55, 234, 330, 50, textType.BUTTON_PANEL, null);
		buttonCredits = new JButton("Credits");
		addComponent(buttonCredits, panelMain, "", 55, 307, 330, 50, textType.BUTTON, new ActionCredits());
		buttonMainExit = new JButton("Exit");
		addComponent(buttonMainExit, panelMain, "", 55, 379, 330, 50, textType.BUTTON, new ActionMainExit());
		labelMainTitle = new JLabel("Main menu");
		addComponent(labelMainTitle, panelMain, "", 32, 16, 371, 33, textType.TITLE, null);

		panelServer = new JPanel(new SpringLayout());
		addPanel(panelServer, "panelServer", this);
		inputServerGameName = new JTextField("Game1");
		addComponent(inputServerGameName, panelServer, "", 208, 78, 192, 28, textType.INPUT, null);
		inputServerPlayerName = new JTextField("Server player");
		addComponent(inputServerPlayerName, panelServer, "", 208, 120, 192, 28, textType.INPUT, null);
		spinnerServerPort = new JSpinner(new SpinnerNumberModel(1024, 1024, 32767, 1));
		addComponent(spinnerServerPort, panelServer, "", 208, 178, 96, 28, textType.OTHER, null);
		spinnerServerTimeout = new JSpinner(new SpinnerNumberModel(5, 5, 120, 1));
		addComponent(spinnerServerTimeout, panelServer, "", 208, 215, 96, 28, textType.OTHER, null);
		spinnerServerMatches = new JSpinner(new SpinnerNumberModel(1, 1, 1000, 1));
		addComponent(spinnerServerMatches, panelServer, "", 208, 271, 96, 28, textType.OTHER, null);
		spinnerServerRoundLength = new JSpinner(new SpinnerNumberModel(1, 1, 300, 1));
		addComponent(spinnerServerRoundLength, panelServer, "", 208, 309, 96, 28, textType.OTHER, null);
		buttonStartServer = new JButton("Start");
		addComponent(buttonStartServer, panelServer, "", 230, 397, 172, 50, textType.BUTTON, new ActionStartServer());
		buttonCancelServer = new JButton("Cancel");
		addComponent(buttonCancelServer, panelServer, "", 30, 397, 172, 50, textType.BUTTON, new MenuAction());
		labelServerTitle = new JLabel("Start LAN / Internet game");
		addComponent(labelServerTitle, panelServer, "", 32, 16, 371, 33, textType.TITLE, null);
		labelServerTimeout = new JLabel("Timeout (s):");
		addComponent(labelServerTimeout, panelServer, "", 32, 217, 168, 24, textType.PREC, null);
		labelServerPort = new JLabel("Port:");
		addComponent(labelServerPort, panelServer, "", 32, 180, 168, 24, textType.PREC, null);
		labelServerPlayerName = new JLabel("Player name:");
		addComponent(labelServerPlayerName, panelServer, "", 32, 122, 168, 24, textType.PREC, null);
		labelServerMatches = new JLabel("Total matches:");
		addComponent(labelServerMatches, panelServer, "", 32, 273, 168, 24, textType.PREC, null);
		labelServerRoundLength = new JLabel("Round length (sec):");
		addComponent(labelServerRoundLength, panelServer, "", 32, 311, 168, 24, textType.PREC, null);
		labelServerGameName = new JLabel("Game name:");
		addComponent(labelServerGameName, panelServer, "", 32, 80, 168, 24, textType.PREC, null);

		panelClient = new JPanel(new SpringLayout());
		addPanel(panelClient, "panelClient", this);
		labelClientPlayerName = new JLabel("Player name:");
		addComponent(labelClientPlayerName, panelClient, "", 32, 82, 168, 24, textType.PREC, null);
		labelClientTitle = new JLabel("Join LAN / Internet game");
		addComponent(labelClientTitle, panelClient, "", 32, 16, 371, 33, textType.TITLE, null);
		inputClientPlayerName = new JTextField("Server player");
		addComponent(inputClientPlayerName, panelClient, "", 208, 80, 192, 28, textType.INPUT, null);
		inputClientIP = new JTextField("000.000.000.000");
		addComponent(inputClientIP, panelClient, "", 208, 141, 193, 28, textType.INPUT, null);
		labelClientIP = new JLabel("IP:");
		addComponent(labelClientIP, panelClient, "", 32, 143, 168, 24, textType.PREC, null);
		spinnerClientPort = new JSpinner(new SpinnerNumberModel(1024, 1024, 32767, 1));
		addComponent(spinnerClientPort, panelClient, "", 208, 178, 96, 28, textType.OTHER, null);
		labelClientPort = new JLabel("Port:");
		addComponent(labelClientPort, panelClient, "", 32, 180, 168, 24, textType.PREC, null);
		spinnerClientTimeout = new JSpinner(new SpinnerNumberModel(5, 5, 120, 1));
		addComponent(spinnerClientTimeout, panelClient, "", 208, 215, 96, 28, textType.OTHER, null);
		buttonCancelClient = new JButton("Cancel");
		addComponent(buttonCancelClient, panelClient, "", 30, 397, 172, 50, textType.BUTTON, new MenuAction());
		buttonJoinClient = new JButton("Join");
		addComponent(buttonJoinClient, panelClient, "", 222, 397, 172, 50, textType.BUTTON, new ActionJoinClient());
		labelClientTimeout = new JLabel("Timeout (s):");
		addComponent(labelClientTimeout, panelClient, "", 32, 217, 168, 24, textType.PREC, null);

		panelOptions = new JPanel(new SpringLayout());
		addPanel(panelOptions, "panelOptions", this);
		buttonPanelGraphOpt = new JButton("Graphics options");
		addComponent(buttonPanelGraphOpt, panelOptions, "panelGraphOpt", 55, 85, 330, 50, textType.BUTTON_PANEL, null);
		labelOptionsTitle = new JLabel("Options");
		addComponent(labelOptionsTitle, panelOptions, "", 32, 16, 371, 33, textType.TITLE, null);
		buttonPanelSndOpt = new JButton("Sound options");
		addComponent(buttonPanelSndOpt, panelOptions, "panelSndOpt", 55, 159, 330, 50, textType.BUTTON_PANEL, null);
		buttonPanelQuitMain = new JButton("Exit to main menu");
		addComponent(buttonPanelQuitMain, panelOptions, "panelQuitMain", 54, 229, 332, 50, textType.BUTTON_PANEL, null);

		panelGraphOpt = new JPanel(new SpringLayout());
		addPanel(panelGraphOpt, "panelGraphOpt", this);
		comboGraphOptRes = new JComboBox<String>(stModes);
		addComponent(comboGraphOptRes, panelGraphOpt, "", 32, 102, 369, 25, textType.COMBO, null);
		labelGraphOptTitle = new JLabel("Graphics options");
		addComponent(labelGraphOptTitle, panelGraphOpt, "", 32, 16, 371, 33, textType.TITLE, null);
		checkboxGraphOptFullscreen = new JCheckBox("Fullscreen mode");
		if (!GraphicsEngine.getDevice().isFullScreenSupported()) {checkboxGraphOptFullscreen.setEnabled(false);}
		addComponent(checkboxGraphOptFullscreen, panelGraphOpt, "", 32, 157, 371, 33, textType.CHECKBOX, null);
		buttonCancelGraphOpt = new JButton("Cancel");
		addComponent(buttonCancelGraphOpt, panelGraphOpt, "", 30, 397, 172, 50, textType.BUTTON, new MenuAction());
		buttonOKGraphOpt = new JButton("OK");
		addComponent(buttonOKGraphOpt, panelGraphOpt, "", 230, 397, 172, 50, textType.BUTTON, new ActionOKGraphOpt());
		labelGraphOptRes = new JLabel("Display mode:");
		addComponent(labelGraphOptRes, panelGraphOpt, "", 32, 78, 136, 24, textType.PREC, null);

		panelSndOpt = new JPanel(new SpringLayout());
		addPanel(panelSndOpt, "panelSndOpt", this);
		labelSndOptTitle = new JLabel("Sound Options");
		addComponent(labelSndOptTitle, panelSndOpt, "", 32, 16, 371, 33, textType.TITLE, null);
		buttonCancelSndOpt = new JButton("Cancel");
		addComponent(buttonCancelSndOpt, panelSndOpt, "", 30, 397, 172, 50, textType.BUTTON, new MenuAction());
		buttonOKSndOpt = new JButton("OK");
		addComponent(buttonOKSndOpt, panelSndOpt, "", 230, 397, 172, 50, textType.BUTTON, new ActionOKSndOpt());
		checkboxSndOptPlaySounds = new JCheckBox("Play sound effects");
		addComponent(checkboxSndOptPlaySounds, panelSndOpt, "", 32, 77, 371, 33, textType.CHECKBOX, null);
		checkboxSndOptPlayMusic = new JCheckBox("Play music");
		addComponent(checkboxSndOptPlayMusic, panelSndOpt, "", 32, 118, 371, 33, textType.CHECKBOX, null);

		panelQuitMain = new JPanel(new SpringLayout());
		addPanel(panelQuitMain, "panelQuitMain", this);
		labelQuitMainTitle = new JLabel("Are you sure?");
		addComponent(labelQuitMainTitle, panelQuitMain, "", 32, 16, 371, 33, textType.TITLE, null);
		buttonCancelQuitMain = new JButton("No");
		addComponent(buttonCancelQuitMain, panelQuitMain, "", 30, 85, 172, 50, textType.BUTTON, new MenuAction());
		buttonOKQuitMain = new JButton("Yes");
		addComponent(buttonOKQuitMain, panelQuitMain, "", 230, 85, 172, 50, textType.BUTTON, new ActionOKQuitMain());
		this.setLocation(origX, origY);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		//showMainMenu();
	}
	public void panelServerSave(){
		GraphicsEngine.getOptions().setServerGameName(inputServerGameName.getText());
		GraphicsEngine.getOptions().setServerPlayerName(inputServerPlayerName.getText());
		GraphicsEngine.getOptions().setServerPort((Integer)spinnerServerPort.getValue());
		GraphicsEngine.getOptions().setServerTimeout((Integer)spinnerServerTimeout.getValue());
		GraphicsEngine.getOptions().setServerMatches((Integer)spinnerServerMatches.getValue());
		GraphicsEngine.getOptions().setServerRoundLength((Integer)spinnerServerRoundLength.getValue());
		GraphicsEngine.saveOptions();
	}
	public void panelClientSave(){
		GraphicsEngine.getOptions().setClientPlayerName(inputClientPlayerName.getText());
		GraphicsEngine.getOptions().setClientIP(inputClientIP.getText());
		GraphicsEngine.getOptions().setClientPort((Integer)spinnerClientPort.getValue());
		GraphicsEngine.getOptions().setClientTimeout((Integer)spinnerClientTimeout.getValue());
		GraphicsEngine.saveOptions();
	}
	public void panelGraphOptSave(){
		GraphicsEngine.getOptions().setGraphOptRes(comboGraphOptRes.getSelectedIndex());
		GraphicsEngine.getOptions().setGraphOptFullscreen(checkboxGraphOptFullscreen.isSelected());
		GraphicsEngine.saveOptions();
	}
	public void panelSndOptSave(){
		GraphicsEngine.getOptions().setSndOptPlaySounds(checkboxSndOptPlaySounds.isSelected());
		GraphicsEngine.getOptions().setSndOptPlayMusic(checkboxSndOptPlayMusic.isSelected());
		GraphicsEngine.saveOptions();
	}
	public void panelServerLoad(){
		inputServerGameName.setText(GraphicsEngine.getOptions().getServerGameName());
		inputServerPlayerName.setText(GraphicsEngine.getOptions().getServerPlayerName());
		spinnerServerPort.setValue(GraphicsEngine.getOptions().getServerPort());
		spinnerServerTimeout.setValue(GraphicsEngine.getOptions().getServerTimeout());
		spinnerServerMatches.setValue(GraphicsEngine.getOptions().getServerMatches());
		spinnerServerRoundLength.setValue(GraphicsEngine.getOptions().getServerRoundLength());
	}
	public void panelClientLoad(){
		inputClientPlayerName.setText(GraphicsEngine.getOptions().getClientPlayerName());
		inputClientIP.setText(GraphicsEngine.getOptions().getClientIP());
		spinnerClientPort.setValue(GraphicsEngine.getOptions().getClientPort());
		spinnerClientTimeout.setValue(GraphicsEngine.getOptions().getClientTimeout());
	}
	public void panelGraphOptLoad(){
		comboGraphOptRes.setSelectedIndex(GraphicsEngine.getOptions().getGraphOptRes());
		checkboxGraphOptFullscreen.setSelected(GraphicsEngine.getOptions().getGraphOptFullscreen());
	}
	public void panelSndOptLoad(){
		checkboxSndOptPlaySounds.setSelected(GraphicsEngine.getOptions().getSndOptPlaySounds());
		checkboxSndOptPlayMusic.setSelected(GraphicsEngine.getOptions().getSndOptPlayMusic());
	}
	class ActionCredits extends AbstractAction{
		public ActionCredits(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			GraphicsEngine.loadScreen(new CreditsPanel());
			setMainEnabled(false);
			showPreviousMenu();
		}
	}
	class ActionMainExit extends AbstractAction{
		public ActionMainExit(){
			super();
		}
		public void actionPerformed(ActionEvent e){
				//saveMenuState();
			GraphicsEngine.exit();
		}
	}
	class ActionStartServer extends AbstractAction{
		public ActionStartServer(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			panelServerSave();
			closeMenu();
			GraphicsEngine.getInstance().connectServer();
		}
	}
	class ActionJoinClient extends AbstractAction{
		public ActionJoinClient(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			panelClientSave();
			closeMenu();
			GraphicsEngine.getInstance().connectClient();
		}
	}
	class ActionOKGraphOpt extends AbstractAction{
		public ActionOKGraphOpt(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			if (modes[comboGraphOptRes.getSelectedIndex()].getWidth() > modes[comboGraphOptRes.getSelectedIndex()].getHeight()){
			    panelGraphOptSave();
			    GraphicsEngine.getInstance().initGraphics();
			}
			showPreviousMenu();
		}
	}
	class ActionOKSndOpt extends AbstractAction{
		public ActionOKSndOpt(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			panelSndOptSave();
			GraphicsEngine.setBkgMusicMuted();
			showPreviousMenu();
		}
	}
	class ActionOKQuitMain extends AbstractAction{
		public ActionOKQuitMain(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			GraphicsEngine.loadScreen(new MainMenuPanel());
		}
	}
	class CardListener implements ActionListener{
		private String card;
		public CardListener(String card){
			this.card = card;
		}
		public void actionPerformed(ActionEvent e){
			if ("panelServer" == card){
				panelServerLoad();
			}
			if ("panelClient" == card){
				panelClientLoad();
			}
			if ("panelGraphOpt" == card){
				panelGraphOptLoad();
			}
			if ("panelSndOpt" == card){
				panelSndOptLoad();
			}
			showCard(card);
		}
	}
	public void saveMenuState(){
		try
		{
			(new File(GraphicsEngine.optionsDir)).mkdirs();
			(new File(filename)).createNewFile();
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(this);
			out.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
			Err.msg("It was not possible to save the options");
		}
	}
	public void addComponent(JComponent comp, JPanel panel, String destPanel, int x, int y, int width, int height, textType type, Action action){
		int x0 = Math.round( GraphicsEngine.getScaleFactor() * x);
		int y0 = Math.round( GraphicsEngine.getScaleFactor() * y);
		int widthC = Math.round( GraphicsEngine.getScaleFactor() * width);
		int heightC = Math.round( GraphicsEngine.getScaleFactor() * height);
		Dimension size = new Dimension(widthC, heightC);
		comp.setPreferredSize(size);
		comp.setMinimumSize(size);
		comp.setMaximumSize(size);
		panel.add(comp);
		SpringLayout layout = (SpringLayout)panel.getLayout();
		layout.putConstraint(SpringLayout.WEST, comp, x0, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, comp, y0, SpringLayout.NORTH, this);
		comp.setFont(font[type.ordinal()]);
		comp.setForeground(fontColor[type.ordinal()]);
		if ((textType.PREC == type) || (textType.TITLE == type)){
			((JLabel)comp).setHorizontalAlignment(alignment[type.ordinal()]);
		}
		if (textType.CHECKBOX == type){
			((JCheckBox)comp).setHorizontalAlignment(alignment[type.ordinal()]);
			((JCheckBox)comp).setContentAreaFilled(false);
			//((JCheckBox)comp).setFocusPainted(false);
			//((JCheckBox)comp).setRolloverEnabled(false);
			//((JCheckBox)comp).setBackground(GameColors.transparent);
		}
		if (textType.BUTTON_PANEL == type){
			if (destPanel.length() > 0){
				((JButton)comp).addActionListener(new CardListener(destPanel));
			}
		}
		if (textType.BUTTON == type){
			if (null != action){
				((JButton)comp).addActionListener(action);
			}
		}
	}
	public void showCard(String card){
		cards.add(card);
		cl.show(this, card);
		this.setVisible(true);
	}
	public void showMainMenu(){
		cards.clear();
		showCard("panelMain");
		this.setVisible(true);
	}
	public void setMainEnabled(boolean value){
		mainEnabled = value;
		if (mainEnabled){
			showMainMenu();
		}
	}
	public void previousCard(){
		if (this.isVisible()){
			if (cards.size() > 1){
				cl.show(this, cards.get(cards.size()-2));
				cards.remove(cards.size()-1);
			} else {
				if (!mainEnabled){
					cards.clear();
					this.setVisible(false);
				}
			}
		} else {
			showCard("panelOptions");
		}
	}
	public void addPanel(JPanel panel, String name, JPanel cardsPanel){
		panel.setOpaque(false);
		cardsPanel.add(panel, name);
	}
	public void showPreviousMenu(){
		previousCard();
	}
	public void closeMenu(){
		this.setVisible(false);
		cards.clear();
	}
	public void showOptionsMenu(){
		cards.clear();
		showCard("panelOptions");
		this.setVisible(true);
	}
	class MenuAction extends AbstractAction{
		public MenuAction(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			showPreviousMenu();
		}
	}
	class AnyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
		}
	}
	class AnyMouseAdapter extends MouseAdapter {
		public void mouseReleased(MouseEvent e) {
		}
	}
}