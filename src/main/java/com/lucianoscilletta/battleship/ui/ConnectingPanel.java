package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class ConnectingPanel extends MessagePanel{
	private static final String msg = "Connecting...";
	public ConnectingPanel(){
		super(msg, MessagePanel.action.ESC_TO_CANCEL);
	}
}
