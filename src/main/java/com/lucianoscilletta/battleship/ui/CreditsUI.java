package com.lucianoscilletta.battleship.ui;

import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;
import com.lucianoscilletta.battleship.graphics.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
//import java.awt.text.*;
import javax.swing.text.*;

public class CreditsUI extends JScrollPane implements AdjustmentListener{
	private static JTextPane textArea;
	private static StyledDocument doc;
	private static SimpleAttributeSet attCredits;
	private BufferedImage bkgImage;
	private static final String msg = "Game design, programming and graphics:\n" +
										"Lucius\n\n" +
										"Publishing and senior consulting:\n" +
										"Derso\n\n" +
										"Sound effects:\n" +
										"www.therecordist.com\n\n" +
										"Sound effects re-mixing:\n" +
										"Lucius\n\n" +
										"Soundtrack:\n" +
										"incompetech.com\n" +
										"freeolaymusic.com\n" +
										"\n" +
										"\n" +
										"2010, Republica dos Reis\n";
	public CreditsUI(){
		super(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GameGraphics position = new InfoPosition();
		bkgImage = GameUtils.classToImage(position);
		Dimension size = new Dimension(position.getOrigWidth(), position.getOrigHeight());
		textArea = new JTextPane();
		textArea.addMouseListener(new CreditsMouseAdapter());
		this.setBackground(GameColors.transparent);
		textArea.setBackground(GameColors.transparent);
		textArea.setForeground(GameColors.infoTitle);
		textArea.setHighlighter(null);
		textArea.setSelectedTextColor(textArea.getForeground());
		textArea.setCaretColor(null);
		textArea.setEditable(false);
		doc = textArea.getStyledDocument();

		attCredits = new SimpleAttributeSet();
		StyleConstants.setFontFamily(attCredits, "SansSerif");
		StyleConstants.setAlignment(attCredits, StyleConstants.ALIGN_CENTER);
		StyleConstants.setFontSize(attCredits, Math.round(GraphicsEngine.getScaleFactor() * 30));
		StyleConstants.setBold(attCredits, true);
		StyleConstants.setForeground(attCredits, GameColors.infoTitle);
		doc.setParagraphAttributes(0, 0, attCredits, true);

		this.setViewportView(textArea);
		this.setLocation(position.getOrigX(), position.getOrigY());
		//this.setSize(size);
		//this.setMinimumSize(size);
		//this.setMaximumSize(size);
		this.setPreferredSize(size);
		//this.setBorder(GraphicsEngine.defBorder);
		this.setBorder(BorderFactory.createEmptyBorder());
		this.getVerticalScrollBar().addAdjustmentListener(this);
		append(msg, attCredits);
	}
	public static void append(String s, SimpleAttributeSet attrib){
		try {
		    doc.insertString(0, s, attrib);
		} catch (Exception e) {
		    Err.msgExit("CreditsUI: bad index in insertString");
		}
		textArea.setCaretPosition(0);
	}
	public void adjustmentValueChanged(AdjustmentEvent evt){
		GraphicsEngine.repaint();
	}
	class CreditsMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			GraphicsEngine.loadScreen(new MainMenuPanel());
		}
	}
}
