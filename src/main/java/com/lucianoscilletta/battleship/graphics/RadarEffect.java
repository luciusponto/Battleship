//This class can be used or not, depending on com.lucianoscilletta.battleship.graphics settings.
//Therefore, it needs an Image object which should not be static,
//so that no memory is wasted in case the class is not used.

package com.lucianoscilletta.battleship.graphics;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import com.lucianoscilletta.battleship.*;

public class RadarEffect implements GameGraphics{
	long timeInit = 0;
	long timeCurrent = 0;
	int timeDiff = 0;
	Boolean firstPaint = true;
	BufferedImage image = null;
	float scaleFactor = GraphicsEngine.getScaleFactor();
	int x0;
	int y0;
	int width;
	int height;
	float beamAngSpeed = 90.0f / 1000; //degrees per ms
	int period = Math.round(360.0f / beamAngSpeed); //period in ms
	int initialAngle = 0;
	AffineTransform rotateAt = new AffineTransform();
	int boardSize[] = new int[2];
	int radarSize[] = new int[2];
	Rectangle rectClip = null;
	Rectangle rectFullScreen = new Rectangle(0, 0, GraphicsEngine.getWidth(),GraphicsEngine.getHeight());

	public RadarEffect(int x0, int y0, int width, int height){
		this.x0 = x0 + GraphicsEngine.corrConst;
		this.y0 = y0 + GraphicsEngine.corrConst;
		this.width = width;
		this.height = height;
		boardSize[0] = width;
		boardSize[1] = height;
		radarSize[0] = (int)(1.4142*boardSize[0]);
		radarSize[1] = (int)(1.4142*boardSize[1]);
		rectClip = new Rectangle(x0, y0, boardSize[0], boardSize[1]);
		image = new BufferedImage(radarSize[0], radarSize[1], BufferedImage.TYPE_INT_ARGB);
		Graphics2D gRadar = (Graphics2D)image.getGraphics();
		int arcAngle = 120;
		int arcIncrement = 2;
		AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER);
		gRadar.setComposite(ac);
		gRadar.setColor(GameColors.transparent);
		gRadar.fillRect(0,0,radarSize[0],radarSize[1]);
		int maxTrail = 20;
		int maxAngle = 320;
		int beamAngle = 2;
		Boolean beamArc = false;
		Boolean beamLine = true;
		float beamLineWidth = Math.max(1.0f, 2.0f * scaleFactor);
		int beamCenterWidth = Math.round(2*beamLineWidth);
		BasicStroke radarBeamStroke = new BasicStroke(beamLineWidth, BasicStroke.JOIN_BEVEL, BasicStroke.CAP_ROUND);
		BasicStroke defBasicStroke = (BasicStroke)gRadar.getStroke();
		RenderingHints defRenderHints = null;
		defRenderHints = gRadar.getRenderingHints();
		RenderingHints AARenderHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		int maxAngleTransp = 200;
		int maxTransp = 254;
		int minTransp = 0;
		int maxGreen = 255;
		int minGreen = 70;
		int steps = 360;
		int stepSize = Math.max(1,(int)Math.round(360 / steps));
		int angle = 0;
		int transp = 0;
		int green = 0;
		int step = 0;
		Boolean showBeam = true;
		Boolean showTrail = true;
		try{
			gRadar.setStroke((Stroke)radarBeamStroke);
			for (step = 0; step < steps; step++){
				float frac = step / steps;
				angle = (int)Math.round((360 * step) / steps);
				transp = minTransp + Math.min(maxTransp, (int)Math.round((maxTransp * angle) / maxAngle));
				green = minGreen;
				if ((angle < maxTrail) && showTrail){
					green = 180;
					transp = maxTransp - Math.min(maxTransp, (int)Math.round((maxTransp * angle) / maxTrail));
				}
				if (beamArc){
					if ((angle < beamAngle) && showBeam){
						green = maxGreen;
						transp = maxTransp;
					}
				}
				gRadar.setColor(new Color(0, green, 0, transp));
				gRadar.fillArc(0, 0, radarSize[0], radarSize[1], angle, stepSize);
				if (beamLine){
					gRadar.setColor(GameColors.brightGreen);
					gRadar.drawLine((int)(radarSize[0]/2), (int)(radarSize[1]/2), radarSize[0], (int)(radarSize[1]/2));
					gRadar.fillArc((int)(radarSize[0]/2)-(int)(beamCenterWidth/2), (int)(radarSize[1]/2)-(int)(beamCenterWidth/2), (int)(beamCenterWidth), (int)(beamCenterWidth), 0, 360);
				}
			}
			gRadar.setRenderingHints(defRenderHints);
			gRadar.setStroke((Stroke)defBasicStroke);
		} catch (Exception e){
			//Err.msgExit(e.getMessage() + "\n Step: " + Integer.toString(step)+ "\n Angle: " + Integer.toString(angle)+ "\n Green: " + Integer.toString(green)+ "\n Alpha: " + Integer.toString(transp));
		}
	}
	public void paintComponent(Graphics2D g){
		if (firstPaint){
			timeInit = System.currentTimeMillis();
			firstPaint = false;
		}
		timeCurrent = System.currentTimeMillis();
		timeDiff = (int)(timeCurrent - timeInit);
		initialAngle = timeDiff % period;
		initialAngle = Math.round(beamAngSpeed*timeDiff);
		//initialAngle = arcIncr(initialAngle, Math.max(1,Math.round((float)(beamAngSpeed*timeDiff)/1000)));
		//initialAngle = arcIncr(initialAngle, 5);
		rotateAt.setToIdentity();
		rotateAt.translate(x0-(int)((radarSize[0]-boardSize[0])/2), y0-(int)((radarSize[0]-boardSize[0])/2));
		rotateAt.rotate(Math.toRadians(initialAngle), (int)(radarSize[0]/2), (int)(radarSize[1]/2));
		g.setClip(rectClip);
		//g.setRenderingHints(AARenderHints);
		g.drawImage(image, rotateAt, null);
		g.setColor(Color.red);
		g.drawString(Integer.toString(image.getHeight()), 800,20);
		g.drawString(Integer.toString(image.getWidth()), 800,40);
		g.drawString(Integer.toString(radarSize[0]), 800,60);
		g.drawString(Integer.toString(radarSize[0]), 800,80);
		/*
		g.drawString(Integer.toString(boardSize[0]), 800,20);
		g.drawString(Integer.toString(boardSize[1]), 800,40);
		g.drawString(Integer.toString(radarSize[0]), 800,60);
		g.drawString(Integer.toString(radarSize[0]), 800,80);
		*/
		//g.setRenderingHints(defRenderHints);
		g.setClip(rectFullScreen);
	}
	public void paint(Graphics2D g){
		paintComponent(g);
	}
    public int getOrigX(){
		return x0;
	}
	public int arcIncr(int arc, int increment){
		arc += increment;
		if (arc > 360){
			arc -= 360;
		}
		return arc;
	}
    public int getOrigY(){
		return y0;
    }

    public int getOrigWidth(){
		return width;
    }

    public int getOrigHeight(){
		return height;
    }
}

