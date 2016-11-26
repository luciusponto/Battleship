package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import java.util.*;
import com.lucianoscilletta.battleship.ui.*;

public class MainMenu extends GameComponent{
	static int minGrid = 10;
	static int defGrid = 10;
	static int maxGrid = 12;
	JPanel menuPanel = null;
	JTabbedPane tabs = null;
	Box gameOptBox = null;
	Box graphicsOptBox = null;
	Box soundOptBox = null;
	JSpinner gridSize = null;
	JLabel gridSizeLabel = null;
	public MainMenu(int width, int height){
		Dimension size = new Dimension(width, height);
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(0,0);
		menuPanel = new JPanel();
		gameOptBox = Box.createVerticalBox();
		graphicsOptBox = Box.createVerticalBox();
		soundOptBox = Box.createVerticalBox();
		tabs = new JTabbedPane();
		gridSize = new JSpinner(new SpinnerNumberModel(defGrid, minGrid, maxGrid, 1));
		gridSizeLabel = new JLabel("Grid size:");
		gridSizeLabel.setLabelFor(gridSize);
		gameOptBox.add(gridSize);
		tabs.addTab("Game options", gridSize);
	}

	public void boxAddComponent(Box box, JComponent component, Boolean newLine){
		//Spinner
	}

	public static void main(String[] args){
		MainMenu menu = new MainMenu(600, 600);
		JFrame frame = new JFrame();
		frame.add(menu);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
