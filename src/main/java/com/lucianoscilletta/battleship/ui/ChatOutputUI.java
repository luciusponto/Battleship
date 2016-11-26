package com.lucianoscilletta.battleship.ui;

import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;
import com.lucianoscilletta.battleship.graphics.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
//import java.awt.text.*;
import javax.swing.text.*;

public class ChatOutputUI extends JScrollPane{
	private static JTextPane textArea;
	private static Document doc;
	private static SimpleAttributeSet attFriendlyText;
	private static SimpleAttributeSet attEnemyText;
	private static SimpleAttributeSet attFriendlyName;
	private static SimpleAttributeSet attEnemyName;
	private BufferedImage bkgImage;
	public ChatOutputUI(GameGraphics position){
		bkgImage = GameUtils.classToImage(position);
		Dimension size = new Dimension(position.getOrigWidth(), position.getOrigHeight());
		textArea = new JTextPane();
		textArea.setBackground(Color.black);
		textArea.setForeground(GameColors.brightGreen);
		doc = textArea.getDocument();

		attEnemyName = new SimpleAttributeSet();
		StyleConstants.setFontFamily(attEnemyName, "SansSerif");
		StyleConstants.setFontSize(attEnemyName, GraphicsEngine.getPrefFontSize());
		StyleConstants.setBold(attEnemyName, true);
		StyleConstants.setForeground(attEnemyName, GameColors.chatName);
		attFriendlyName = new SimpleAttributeSet(attEnemyName);

		attEnemyText = new SimpleAttributeSet();
		StyleConstants.setFontFamily(attEnemyText, "SansSerif");
		StyleConstants.setFontSize(attEnemyText, GraphicsEngine.getPrefFontSize());
		StyleConstants.setForeground(attEnemyText, GameColors.enemyText);
		attFriendlyText = new SimpleAttributeSet(attEnemyText);
		StyleConstants.setForeground(attFriendlyText, GameColors.friendlyText);

		this.setViewportView(textArea);
		this.setLocation(position.getOrigX(), position.getOrigY());
		//this.setSize(size);
		//this.setMinimumSize(size);
		//this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setBorder(GraphicsEngine.defBorder);
	}
	public static void append(String s, SimpleAttributeSet attrib){
		try {
		    doc.insertString(0, s, attrib);
		} catch (Exception e) {
		    Err.msgExit("ChatOutputUI: bad index in insertString");
		}
		textArea.setCaretPosition(0);
	}
	public static void appendFriendly(String s){
		append(s + "\n", attFriendlyText);
		append(GraphicsEngine.getPlayerName()+": ", attFriendlyName);
	}
	public static void appendEnemy(String s){
		append(s + "\n", attEnemyText);
		append(GraphicsEngine.getEnemyName()+": ", attEnemyName);
	}
}
