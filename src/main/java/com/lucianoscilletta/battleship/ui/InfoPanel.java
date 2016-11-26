package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import java.util.*;
import com.lucianoscilletta.battleship.ui.*;

public class InfoPanel extends JPanel{
	enum components { TITLE, INFO, MSG };
	private static GameGraphics position;
	private static final int compNumber = components.MSG.ordinal();
	private static final int defFontSize[] = { 72, 30, 36 };
	private static final Color defFontColor[] = { GameColors.infoTitle, GameColors.infoHTML, GameColors.infoKey };
	private static final String defFontName[] = { Font.SANS_SERIF, Font.SANS_SERIF, Font.SANS_SERIF };
	private static final int defFontStyle[] = { Font.BOLD, Font.BOLD, Font.BOLD };
	private float titleFraction = 0.3f;
	private float msgFraction = 0.2f;
	protected int FontSize[] = { defFontSize[components.TITLE.ordinal()], defFontSize[components.INFO.ordinal()], defFontSize[components.MSG.ordinal()]};
	protected Color FontColor[] = { defFontColor[components.TITLE.ordinal()], defFontColor[components.INFO.ordinal()], defFontColor[components.MSG.ordinal()]};
	private JLabel title;
	private JLabel HTMLInfo;
	private JLabel actionMsg;
	private String sTitle;
	private String sInfo;
	private String sMsg;

	public InfoPanel(String sTitle, String sInfo, String sMsg){
		this(defFontColor[components.TITLE.ordinal()], sTitle, defFontColor[components.INFO.ordinal()], sInfo, defFontColor[components.MSG.ordinal()], sMsg);
	}

	public InfoPanel(Color titleColor, String sTitle, String sInfo, String sMsg){
		this(titleColor, sTitle, defFontColor[components.INFO.ordinal()], sInfo, defFontColor[components.MSG.ordinal()], sMsg);
	}

	public InfoPanel(Color titleColor, String sTitle, Color infoColor, String sInfo, Color keyColor, String sMsg){
		super();
		position = new InfoPosition();
		Dimension size = new Dimension(position.getOrigWidth(), position.getOrigHeight());
		this.setLocation(position.getOrigX(), position.getOrigY());
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLayout(new BorderLayout());
		this.FontColor[components.TITLE.ordinal()] = titleColor;
		this.FontColor[components.INFO.ordinal()] = infoColor;
		this.FontColor[components.MSG.ordinal()] = keyColor;
		this.sTitle = sTitle;
		this.sInfo = sInfo;
		this.sMsg = sMsg;
		initAll();
		this.add(title, BorderLayout.NORTH);
		this.add(HTMLInfo, BorderLayout.CENTER);
		this.add(actionMsg, BorderLayout.SOUTH);
		this.setBackground(GameColors.transparent);
	}
	private void initAll(){
		if (0 == sInfo.length()){
			titleFraction = 1 - msgFraction;
		}
		title = init(components.TITLE, sTitle);
		title.setPreferredSize(new Dimension(title.getWidth(), (int)Math.round(position.getOrigHeight() * titleFraction)));
		HTMLInfo = init(components.INFO, sInfo);
		actionMsg = init(components.MSG, sMsg);
		actionMsg.setPreferredSize(new Dimension(actionMsg.getWidth(), (int)Math.round(position.getOrigHeight() * msgFraction)));
	}
	public void setColor(components comp, Color color){
		FontColor[comp.ordinal()] = color;
		initAll();
	}
	public void setTitleColor(Color color){
		FontColor[components.TITLE.ordinal()] = color;
		initAll();
	}
	private JLabel init(components comp, String st){
		JLabel newLabel;
		newLabel = new JLabel(st, JLabel.CENTER);
		newLabel.setFont(new Font(defFontName[comp.ordinal()], defFontStyle[comp.ordinal()], Math.round(GraphicsEngine.getScaleFactor() * FontSize[comp.ordinal()])));
		newLabel.setForeground(FontColor[comp.ordinal()]);
		newLabel.setBackground(GameColors.transparent);
		return newLabel;
	}
}