package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class CreditsPanel extends MessagePanel{
	public CreditsPanel(){
		super();
		this.addComponent(new CreditsUI());
	}
	public void continueAction(){
		GraphicsEngine.loadScreen(new MainMenuPanel());
	}
}
