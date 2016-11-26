package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class GameButtonComposite extends GameComponent {
	public enum Type {PUSH_BUTTON, TOGGLE_BUTTON};
	protected BufferedImage imageNormal = null;
	protected BufferedImage imageHighlighted = null;
	protected BufferedImage imagePressed = null;
	protected BufferedImage imagePressedHighlighted = null;
	protected BufferedImage imageDisabled = null;
	protected BufferedImage imageTempBack = null;
	protected BufferedImage imageTempFore = null;
	private static GameGraphics grHighlighted = new ButtonWarRoomHighlight();
	private static GameGraphics grPressed = new ButtonWarRoomPress();
	private static GameGraphics grDisabled = new ButtonWarRoomDisable();
	private GameGraphics grNormal = null;
	private Graphics2D tempGraph = null;
	private Boolean highlighted = false;
	protected Boolean pressed = false;
	private Boolean canHighlight = true;
	private Boolean canPress = true;
	private Boolean isPushButton = false;
	protected Boolean enabled = true;
	protected Boolean isOn = false;
	private String testString = "";
	private AlphaComposite ac;

	public GameButtonComposite(GameGraphics grNormal, Type buttonType){
		super();
		if (Type.PUSH_BUTTON == buttonType){
			this.isPushButton = true;
		} else {
			this.isPushButton = false;
		}
		this.grNormal = grNormal;
		initGraphics();
		this.addMouseListener(new MouseEventListener());
		//GraphicsEngine.frame.addKeyListener(new ButtonKeyAdapter());

	}

	public void initGraphics(){
		ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER);
		imageNormal = GameUtils.classToImage(grNormal);

		imageDisabled = imageCompose(grNormal, grDisabled);

		imageHighlighted = imageCompose(grNormal, grHighlighted);

		imagePressed = imageCompose(grNormal, grPressed);

		imagePressedHighlighted = imageCompose(grNormal, grPressed, grHighlighted);

		imageTempBack = null;
		imageTempFore = null;
		tempGraph = null;

		Dimension size = new Dimension(grNormal.getOrigWidth(), grNormal.getOrigHeight());
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(grNormal.getOrigX(), grNormal.getOrigY());
	}

	public static void initStatics(){
		GameGraphics grHighlighted = new ButtonWarRoomHighlight();
		GameGraphics grPressed = new ButtonWarRoomPress();
		GameGraphics grDisabled = new ButtonWarRoomDisable();
	}


	public BufferedImage imageCompose(GameGraphics grBackground, GameGraphics grForeground){
		return imageCompose(grBackground, null, grForeground);
	}
	public void setEnabledStatus(Boolean status){
		enabled = status;
		GraphicsEngine.repaint();
	}
	public boolean isEnabled(){
		return (boolean)enabled;
	}

	public BufferedImage imageCompose(GameGraphics grBackground, GameGraphics grMiddle, GameGraphics grForeground){
		imageTempBack = GameUtils.classToImage(grBackground);
		tempGraph = (Graphics2D)imageTempBack.getGraphics();
		tempGraph.setComposite(ac);
		if (null != grMiddle){
			imageTempFore = GameUtils.classToImage(grMiddle);
			tempGraph.drawImage(imageTempFore, null, 0, 0);
		}
		imageTempFore = GameUtils.classToImage(grForeground);
		tempGraph.drawImage(imageTempFore, null, 0, 0);
		return imageTempBack;
	}

	public void paintComponent(Graphics2D g){
		if (enabled){
			if (pressed || (!isPushButton && isOn)){
				if (highlighted){
					g.drawImage(imagePressedHighlighted, 0, 0, null);
				} else {
					g.drawImage(imagePressed, 0, 0, null);
				}
			} else {
				if (highlighted){
					g.drawImage(imageHighlighted, 0, 0, null);
				} else {
					g.drawImage(imageNormal, 0, 0, null);
				}
			}
		}
		else {
			g.drawImage(imageDisabled, 0, 0, null);
		}
	}

	public void buttonMouseEntered(){
	}

	public void buttonMouseExited(){
	}

	public void buttonMousePressed(){
	}

	public void buttonMouseReleased(){
	}

	public void buttonAction(){
	}

	public void buttonActionToggleOn(){
	}

	public void buttonActionToggleOff(){
	}

	public void buttonToggle(){
		if (isOn){
			isOn = false;
			buttonActionToggleOff();
		} else {
			isOn = true;
			buttonActionToggleOn();
		}
	}

	public void repaintButton(){
		//repaint(0, 0, getWidth(), 19 * (getHeight()/20));
		GraphicsEngine.repaint();
	}

	public Boolean isHighlighted(){
		return highlighted;
	}

	class MouseEventListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			if (enabled){
				if (canHighlight){
					highlighted = true;
					repaintButton();
				}
				buttonMouseEntered();
			}
		}

		public void mouseExited(MouseEvent e) {
			if (enabled){
				highlighted = false;
				//pressed = false;
				if (canHighlight){
					repaintButton();
				}
				buttonMouseExited();
			}
		}
		public void mousePressed(MouseEvent e) {
			if (enabled){
				if (canPress){
					pressed = true;
					repaintButton();
				}
				buttonMousePressed();
			}
		}

		public void mouseReleased(MouseEvent e) {
			if (enabled){
				if (pressed && highlighted){
					if (isPushButton){
						buttonAction();
					} else {
						buttonToggle();
					}
				}
				pressed = false;
				if (canPress){
					repaintButton();
				}
				buttonMouseReleased();
			}
		}
	}

	/*
	class ButtonKeyAdapter extends KeyAdapter{
	    public void keyPressed(KeyEvent e) {
			char keyChar = e.getKeyChar();
			String keyText = e.getKeyText(e.getKeyCode());
			testString += keyText;
			//testString += keyChar;
			if ("Backspace" == keyText){
				testString = "";
			}
			if ("Left" == keyText){
				Err.msg("Left pressed " + testString);
			}
			if ('=' == keyChar){
			}
		}
	}

	public void updateSpecial(Graphics2D g){
		paintComponent(g);
	}
	*/
}


