package com.lucianoscilletta.battleship;

import com.lucianoscilletta.battleship.*;
import java.io.*;
import java.awt.*;

public class GameOptions implements Serializable{
	private String ServerGameName = "Game";
	private String ServerPassword = "";
	private String ServerPlayerName = "Server player";
	private int ServerPort = 5010;
	private int ServerTimeout = 60;
	private int ServerMatches = 3;
	private int ServerRoundLength = 5;
	private String ClientPlayerName = "Client player";
	private String ClientIP = "192.168.0.100";
	private int ClientPort = 5010;
	private int ClientTimeout = 60;
	private int GraphOptRes = -1;
	//private DisplayMode GraphOptRes = new DisplayMode(640, 480, 32, 60);
	private boolean GraphOptAnimated = false;
	private boolean GraphOptOpenGL = false;
	private boolean GraphOptFullscreen = false;
	private boolean SndOptPlaySounds = true;
	private boolean SndOptPlayMusic = true;
	public String getServerGameName(){
		return ServerGameName;
	}
	public void setServerGameName(String value){
		ServerGameName = value;
	}
	public String getServerPassword(){
		return ServerPassword;
	}
	public void setServerPassword(String value){
		ServerPassword = value;
	}
	public String getServerPlayerName(){
		return ServerPlayerName;
	}
	public void setServerPlayerName(String value){
		ServerPlayerName = value;
	}
	public int getServerPort(){
		return ServerPort;
	}
	public void setServerPort(int value){
		ServerPort = value;
	}
	public int getServerTimeout(){
		return ServerTimeout;
	}
	public void setServerTimeout(int value){
		ServerTimeout = value;
	}
	public int getServerMatches(){
		return ServerMatches;
	}
	public void setServerMatches(int value){
		ServerMatches = value;
	}
	public int getServerRoundLength(){
		return ServerRoundLength;
	}
	public void setServerRoundLength(int value){
		ServerRoundLength = value;
	}
	public String getClientPlayerName(){
		return ClientPlayerName;
	}
	public void setClientPlayerName(String value){
		ClientPlayerName = value;
	}
	public String getClientIP(){
		return ClientIP;
	}
	public void setClientIP(String value){
		ClientIP = value;
	}
	public int getClientPort(){
		return ClientPort;
	}
	public void setClientPort(int value){
		ClientPort = value;
	}
	public int getClientTimeout(){
		return ClientTimeout;
	}
	public void setClientTimeout(int value){
		ClientTimeout = value;
	}
	/*
	public DisplayMode getGraphOptRes(){
		return GraphOptRes;
	}
	public void setGraphOptRes(DisplayMode value){
		GraphOptRes = value;
	}
	*/
	public int getGraphOptRes(){
		return GraphOptRes;
	}
	public void setGraphOptRes(int value){
		GraphOptRes = value;
	}
	public boolean getGraphOptAnimated(){
		return GraphOptAnimated;
	}
	public void setGraphOptAnimated(boolean value){
		GraphOptAnimated = value;
	}
	public boolean getGraphOptOpenGL(){
		return GraphOptOpenGL;
	}
	public void setGraphOptOpenGL(boolean value){
		GraphOptOpenGL = value;
	}
	public boolean getGraphOptFullscreen(){
		return GraphOptFullscreen;
	}
	public void setGraphOptFullscreen(boolean value){
		GraphOptFullscreen = value;
	}
	public boolean getSndOptPlaySounds(){
		return SndOptPlaySounds;
	}
	public void setSndOptPlaySounds(boolean value){
		SndOptPlaySounds = value;
	}
	public boolean getSndOptPlayMusic(){
		return SndOptPlayMusic;
	}
	public void setSndOptPlayMusic(boolean value){
		SndOptPlayMusic = value;
	}
}
