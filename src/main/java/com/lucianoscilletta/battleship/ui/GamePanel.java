package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import java.util.*;
import java.io.*;
import com.lucianoscilletta.battleship.ui.*;
import com.lucianoscilletta.battleship.music.*;

public class GamePanel extends JLayeredPane{
	private MainInfo mainInfo;
	private SpringLayout layout = null;
	private ArrayList<JComponent> comps = new ArrayList<JComponent>();
	private KeyListener keyListener;
	private static BackgroundMusic music;

	static {
		music = null;
	}

// the top-most on JLayeredPane has the index 0, and the indexes increase as the layers go deeper. Values to be used with setLayer method
	public enum Layer {
		BACKGROUND,
		FX1,
		FX2,
		BUTTONS,
		MENU,
		FADE,
		INFO,
		HIGHEST
	}
	public GamePanel(int width, int height){
		this(width, height, null);
	}
	public GamePanel(int width, int height, BackgroundMusic music){
		super();
		Dimension size = new Dimension(width, height);
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(0, 0);
		this.layout = new SpringLayout();
		this.setLayout(this.layout);
		this.mainInfo = new MainInfo(200, 300);
		mainInfo.setVisible(false);
		this.addComponent(mainInfo, Layer.INFO, 0, 0);
		this.setAction("F1", "showInfo", new ShowInfoAction());
		this.addComponent(GraphicsEngine.getMenuPanel(), Layer.HIGHEST, GraphicsEngine.getMenuPanel().getX(), GraphicsEngine.getMenuPanel().getY());
		this.setAction("ESCAPE", "showPreviousMenuAction", new ShowPreviousMenuAction());
		this.setMainMenuEnabled(false);
		if (null != music){
			changeBackgroundMusic(music);
		}
	}
	public void addComponent(JComponent component){
		addComponent(component, Layer.BUTTONS, component.getX() + GraphicsEngine.getHorOffset(), component.getY());
	}
	public void addComponent(JComponent component, Layer layer){
		if (Layer.BACKGROUND == layer){
			addComponent(component, layer, 0, 0);
		} else {
			addComponent(component, layer, component.getX() + GraphicsEngine.getHorOffset(), component.getY());
		}
	}

	public void addComponent(JComponent component, Layer layer, int x, int y){
		this.add(component, new Integer(layer.ordinal()));
		this.layout.putConstraint(SpringLayout.WEST, component, x, SpringLayout.WEST, this);
		this.layout.putConstraint(SpringLayout.NORTH, component, y, SpringLayout.NORTH, this);
		comps.add(component);
	}
	public void setAction(String keyStrokeSt, String actionName, Action action){
		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(keyStrokeSt), actionName);
		this.getActionMap().put(actionName, action);
	}
	public KeyListener getKeyListener(){
		return keyListener;
	}

	public void setKeyListener(KeyListener kl){
		this.keyListener = kl;
	}
	public void ToggleComponent(JComponent comp){
		if (comp.isVisible()){
			comp.setVisible(false);
		} else {
			comp.setVisible(true);
		}
	}
	class ShowInfoAction extends AbstractAction{
		public ShowInfoAction(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			ToggleComponent(mainInfo);
		}
	}
	class ShowPreviousMenuAction extends AbstractAction{
		public ShowPreviousMenuAction(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			GraphicsEngine.getMenuPanel().showPreviousMenu();
		}
	}
	public static void setMainMenuEnabled(boolean value){
		GraphicsEngine.getMenuPanel().setMainEnabled(value);
	}
	public void finalizePanel(){
	}
	public void changeBackgroundMusic(BackgroundMusic newMusic){
		if (null != music){
			if ( ! newMusic.getClass().equals(music.getClass())){
				music.stopPlaying();
				music = newMusic;
				music.start();
			}
		} else {
			music = newMusic;
			music.start();
		}
	}
	public void setMute(boolean value){
		music.setMute(value);
	}
}
