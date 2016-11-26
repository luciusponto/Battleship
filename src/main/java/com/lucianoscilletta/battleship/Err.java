package com.lucianoscilletta.battleship;

import javax.swing.*;

public class Err{
	public static void msgException(Exception e){
		e.printStackTrace();
		String msgText = e.getMessage();
		msg(msgText);
		/*
		StackTraceElement[] elem = e.getStackTrace();
		for (int i = 0; i < elem.length; i++){
		*/
	}
	public static void msgExceptionExit(Exception e){
		msgException(e);
		System.exit(0);
	}
	public static void msg(String msgText){
		JOptionPane.showMessageDialog(null, msgText, "Battleship: Error", JOptionPane.ERROR_MESSAGE);
	}
	public static void msgExit(String msgText){
		msg(msgText);
		System.exit(0);
	}
}
