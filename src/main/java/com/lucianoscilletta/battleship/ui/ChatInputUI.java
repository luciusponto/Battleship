package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.image.*;
import javax.swing.text.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class ChatInputUI extends JTextField{
	public ChatInputUI(GameGraphics position){
		super();
		Dimension size = new Dimension(position.getOrigWidth(), position.getOrigHeight());
		this.setLocation(position.getOrigX(), position.getOrigY());
		this.setPreferredSize(size);
		this.addActionListener(new chatInputListener());
		this.setBorder(GraphicsEngine.defBorder);
		this.setBackground(Color.black);
		this.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, GraphicsEngine.getPrefFontSize()));
		this.setForeground(GameColors.brightGreen);
		this.setCaretColor(new Color(0, 255, 0, 255));
		this.getCaret().setBlinkRate(0);
	}
	class chatInputListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("input action");
			ChatOutputUI.appendFriendly(getText());
			GraphicsEngine.netSend(GraphicsEngine.stChat+GraphicsEngine.stSep+getText());
			setText("");
		}
	}
}

