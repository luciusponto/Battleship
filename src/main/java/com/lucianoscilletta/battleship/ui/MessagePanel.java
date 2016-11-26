package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.text.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.music.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class MessagePanel extends GamePanel{
	public enum action { CONTINUE, ESC_TO_CANCEL, NONE };
	private action actionType;
	private InfoPanel infoPanel;
	private final String anyMsg = "Click to continue";
	public MessagePanel(){
		super(GraphicsEngine.getWidth(), GraphicsEngine.getHeight());
		this.addComponent(new GameBackground(new InfoBkg()), Layer.BACKGROUND);
	}
	public MessagePanel(String title, action actionType){
		this(title, "", actionType);
	}
	public MessagePanel(String title, String info, action actionType){
		this(title, info, actionType, null);
	}
	public MessagePanel(String title, String info, action actionType, BackgroundMusic music){
		super(GraphicsEngine.getWidth(), GraphicsEngine.getHeight(), music);
		this.addComponent(new GameBackground(new InfoBkg()), Layer.BACKGROUND);
		String keyMsg = "";
		this.actionType = actionType;
		if (action.ESC_TO_CANCEL == actionType){
			//keyMsg = "Press ESC to cancel";
			keyMsg = "";
			infoPanel = new InfoPanel(title, info, keyMsg);
		} else if (action.CONTINUE == actionType){
			//keyMsg = "Press any key to continue";
			keyMsg = anyMsg;
			infoPanel = new InfoPanel(GameColors.infoContinue, title, info, keyMsg);
		} else if (action.NONE == actionType){
			keyMsg = "";
			infoPanel = new InfoPanel(title, info, keyMsg);
		}
		this.addComponent(infoPanel);
		if ( action.CONTINUE == actionType ){
			//this.setKeyListener(new AnyKeyAdapter());
			this.addMouseListener(new AnyMouseAdapter());
		} else if (action.ESC_TO_CANCEL == actionType){
			this.setAction("ESC", "escPressedAction", new EscPressedAction());
		}
	}
	public void anyKeyAction(){
		continueAction();
	}
	public void EscAction(){
		GraphicsEngine.exit();
	}
	public void ExitToMenuAction(){
		GraphicsEngine.loadScreen(new MainMenuPanel());
	}
	public void setTitleColor(Color color){
		infoPanel.setColor(InfoPanel.components.TITLE, color);
	}
	public void setInfoColor(Color color){
		infoPanel.setColor(InfoPanel.components.INFO, color);
	}
	public void setKeyColor(Color color){
		infoPanel.setColor(InfoPanel.components.MSG, color);
	}
	public void continueAction(){
		//to be overriden
	}
	class AnyMouseAdapter extends MouseAdapter {
		public void mouseReleased(MouseEvent e) {
			anyKeyAction();
		}
	}
	class EscPressedAction extends AbstractAction{
		public EscPressedAction(){
			super();
		}
		public void actionPerformed(ActionEvent e){
			EscAction();
		}
	}
}
