package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class GameButtonMainPanel extends GameComponent {
	public enum Type {PUSH_BUTTON, TOGGLE_BUTTON};
	protected BufferedImage imageNormal = null;
	protected BufferedImage imagePressed = null;
	private Boolean highlighted = false;
	private Boolean pressed = false;
	private Boolean canHighlight = false;
	private Boolean canPress = true;
	private Boolean isPushButton = false;
	protected Boolean enabled = true;
	protected Boolean isOn = false;
	private String testString = "";
	private AlphaComposite ac;

	public GameButtonMainPanel(GameGraphics grNormal, GameGraphics grPressed, Type buttonType){
		super();
		if (Type.PUSH_BUTTON == buttonType){
			this.isPushButton = true;
		} else {
			this.isPushButton = false;
		}
		imageNormal = GameUtils.classToImage(grNormal);
		imagePressed = GameUtils.classToImage(grPressed);

		Dimension size = new Dimension(grNormal.getOrigWidth(), grNormal.getOrigHeight());
		this.setSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		this.setLocation(grNormal.getOrigX(), grNormal.getOrigY());
		this.addMouseListener(new MouseEventListener());
	}

	public void setEnabledStatus(Boolean status){
		enabled = status;
		GraphicsEngine.repaint();
	}

	public boolean isEnabled(){
		return (boolean)enabled;
	}

	public void paintComponent(Graphics2D g){
		if (isOn){
			g.drawImage(imagePressed, 0, 0, null);
		} else {
			g.drawImage(imageNormal, 0, 0, null);
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
					repaintButton();
				}
				highlighted = true;
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
}


