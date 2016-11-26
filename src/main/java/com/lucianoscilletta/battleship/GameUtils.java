package com.lucianoscilletta.battleship;

import java.awt.image.*;
import java.awt.geom.*;
import java.awt.*;
import com.lucianoscilletta.battleship.*;
import com.lucianoscilletta.battleship.graphics.*;

public abstract class GameUtils{
	private static RenderingHints defRenderHints = null;
	private static RenderingHints AARenderHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	public static String getClassName(Object obj){
		String name = obj.toString();
		name = name.replaceAll("([0-9a-zA-Z_\\.]*\\.)(.*?)([^0-9a-zA-Z_].*)","$2");
		return name;
	}
	public static BufferedImage classToImage(GameGraphics gr){
		return classToImage(gr, 0, 0, gr.getOrigWidth(), gr.getOrigHeight(), GameColors.transparent, 1, 1);
	}
	public static BufferedImage classToImage(GameGraphics gr, double scaleX, double scaleY){
		return classToImage(gr, 0, 0, (int)(gr.getOrigWidth() * scaleX), (int)(gr.getOrigHeight() * scaleY), GameColors.transparent, scaleX, scaleY);
	}
	public static BufferedImage classToImage(GameGraphics gr, int x, int y, int width, int height, Color bkgColor, double scaleX, double scaleY){
		BufferedImage imageTmp = new BufferedImage(gr.getOrigWidth(), gr.getOrigHeight(), Transparency.TRANSLUCENT);
		Graphics2D g = (Graphics2D)imageTmp.getGraphics();
		g.setColor(bkgColor);
		g.fillRect(x, y, width, height);
		AffineTransform atTranslate = g.getTransform();
		atTranslate.setToTranslation(-(int)(gr.getOrigX() * scaleX), -(int)(gr.getOrigY() * scaleY));
		atTranslate.scale(scaleX, scaleY);
		g.setTransform(atTranslate);
		defRenderHints = g.getRenderingHints();
		g.setRenderingHints(AARenderHints);
		gr.paint(g);
		g.setRenderingHints(defRenderHints);
		g.dispose();
		return imageTmp;
	}
	public static BufferedImage composeGameImages(BufferedImage lowerLayer, BufferedImage upperLayer){
		AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER);
		BufferedImage imageTmp = lowerLayer;
		Graphics2D g = (Graphics2D)imageTmp.getGraphics();
		g.setComposite(ac);
		g.drawImage(upperLayer, null, 0, 0);
		return imageTmp;
	}
}