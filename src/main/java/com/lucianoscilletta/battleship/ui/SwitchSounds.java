package com.lucianoscilletta.battleship.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.graphics.*;
import com.lucianoscilletta.battleship.sound.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.ui.*;

public class SwitchSounds extends GameButtonMainPanel {
	public SwitchSounds(){
		super(new Switch2Off(), new Switch2On(), GameButtonMainPanel.Type.TOGGLE_BUTTON);
		isOn = GraphicsEngine.getOptions().getSndOptPlaySounds();
	}
	public void buttonActionToggleOn(){
		GraphicsEngine.getOptions().setSndOptPlaySounds(true);
		GraphicsEngine.saveOptions();
		(new SoundEffect(SoundEffect.Effect.SWITCH)).start();
	}
	public void buttonActionToggleOff(){
		GraphicsEngine.getOptions().setSndOptPlaySounds(false);
		GraphicsEngine.saveOptions();
		(new SoundEffect(SoundEffect.Effect.SWITCH)).start();
	}
}