package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.sound.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class SwitchMusic extends GameButtonMainPanel {
	public SwitchMusic(){
		super(new Switch1Off(), new Switch1On(), GameButtonMainPanel.Type.TOGGLE_BUTTON);
		isOn = GraphicsEngine.getOptions().getSndOptPlayMusic();
	}
	public void buttonActionToggleOn(){
		GraphicsEngine.getOptions().setSndOptPlayMusic(true);
		GraphicsEngine.saveOptions();
		(new SoundEffect(SoundEffect.Effect.SWITCH)).start();
	}
	public void buttonActionToggleOff(){
		GraphicsEngine.getOptions().setSndOptPlayMusic(false);
		GraphicsEngine.saveOptions();
		(new SoundEffect(SoundEffect.Effect.SWITCH)).start();
	}
}