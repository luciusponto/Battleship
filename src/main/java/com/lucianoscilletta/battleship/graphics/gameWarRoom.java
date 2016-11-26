package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class gameWarRoom implements GameGraphics {
    float scaleFactor = BattleshipGame.getScaleFactor();
    AffineTransform atScale = null;
	/**
	 * Paints the transcoded SVG image on the specified com.lucianoscilletta.battleship.graphics context. You
	 * can install a custom transformation on the com.lucianoscilletta.battleship.graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
	public void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
        atScale = g.getTransform();
atScale.scale(GraphicsEngine.getScaleFactor(), GraphicsEngine.getScaleFactor());
g.setTransform(atScale);
AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
paint = new Color(0, 0, 0, 255);
shape = new Rectangle2D.Double(8.339377403259277, 9.339408874511719, 1007.3212280273438, 751.3212280273438);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(5.082830905914307f, 0.0f, 0.0f, 6.081058025360107f, -5579.40087890625f, -716.6755981445312f));
stroke = new BasicStroke(16.678755f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(8.339377403259277, 9.339408874511719, 1007.3212280273438, 751.3212280273438);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new Color(0, 0, 0, 255);
shape = new Rectangle2D.Double(0.0, -0.49211984872817993, 1024.9998779296875, 768.7214965820312);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3_0);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4_0);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_5_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_5_0_0);
g.setTransform(defaultTransform__0_0_5_0);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6_0);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_7_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7_0_0);
g.setTransform(defaultTransform__0_0_7_0);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_8
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_8_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_8_0_0);
g.setTransform(defaultTransform__0_0_8_0);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_9_0);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_10_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10_0_0);
g.setTransform(defaultTransform__0_0_10_0);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_11_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_11_0_0);
g.setTransform(defaultTransform__0_0_11_0);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_12
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_12_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_12_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_12_0_0_0);
g.setTransform(defaultTransform__0_0_12_0_0);
g.setTransform(defaultTransform__0_0_12_0);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_13
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_13_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_13_0_0);
g.setTransform(defaultTransform__0_0_13_0);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_14
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_14_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_14_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14_0_0_0);
g.setTransform(defaultTransform__0_0_14_0_0);
g.setTransform(defaultTransform__0_0_14_0);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_15
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_15_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_15_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_15_0_0_0);
g.setTransform(defaultTransform__0_0_15_0_0);
g.setTransform(defaultTransform__0_0_15_0);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_16
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_16_0);
g.setTransform(defaultTransform__0_0_16);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_17 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_17
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_17_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_17_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_17_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_17_0_0);
g.setTransform(defaultTransform__0_0_17_0);
g.setTransform(defaultTransform__0_0_17);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_18
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_18_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_18_0_0);
g.setTransform(defaultTransform__0_0_18_0);
g.setTransform(defaultTransform__0_0_18);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_19
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_19_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_19_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_19_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_19_0_0_0);
g.setTransform(defaultTransform__0_0_19_0_0);
g.setTransform(defaultTransform__0_0_19_0);
g.setTransform(defaultTransform__0_0_19);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_20 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_20
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_20_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_20_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_20_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_20_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_20_0_0);
g.setTransform(defaultTransform__0_0_20_0);
g.setTransform(defaultTransform__0_0_20);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_21 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_21
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_21_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_21_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_21_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_21_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_21_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_21_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_21_0_0_0);
g.setTransform(defaultTransform__0_0_21_0_0);
g.setTransform(defaultTransform__0_0_21_0);
g.setTransform(defaultTransform__0_0_21);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_22 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_22
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_22_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_22_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_22_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_22_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_22_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_22_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_22_0_0_0);
g.setTransform(defaultTransform__0_0_22_0_0);
g.setTransform(defaultTransform__0_0_22_0);
g.setTransform(defaultTransform__0_0_22);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_23 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_23
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_23_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_23_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_23_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_23_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_23_0_0);
g.setTransform(defaultTransform__0_0_23_0);
g.setTransform(defaultTransform__0_0_23);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_24 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_24
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_24_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_24_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_24_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_24_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_24_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_24_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_24_0_0_0);
g.setTransform(defaultTransform__0_0_24_0_0);
g.setTransform(defaultTransform__0_0_24_0);
g.setTransform(defaultTransform__0_0_24);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_25 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_25
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_25_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_25_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_25_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_25_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_25_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_25_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_25_0_0_0);
g.setTransform(defaultTransform__0_0_25_0_0);
g.setTransform(defaultTransform__0_0_25_0);
g.setTransform(defaultTransform__0_0_25);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_26 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_26
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_26_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_26_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_26_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_26_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_26_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_26_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_26_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_26_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_26_0_0_0_0);
g.setTransform(defaultTransform__0_0_26_0_0_0);
g.setTransform(defaultTransform__0_0_26_0_0);
g.setTransform(defaultTransform__0_0_26_0);
g.setTransform(defaultTransform__0_0_26);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_27 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_27
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_27_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_27_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_27_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_27_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_27_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_27_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_27_0_0_0);
g.setTransform(defaultTransform__0_0_27_0_0);
g.setTransform(defaultTransform__0_0_27_0);
g.setTransform(defaultTransform__0_0_27);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_28 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_28
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_28_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_28_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_28_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_28_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_28_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_28_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_28_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_28_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_28_0_0_0_0);
g.setTransform(defaultTransform__0_0_28_0_0_0);
g.setTransform(defaultTransform__0_0_28_0_0);
g.setTransform(defaultTransform__0_0_28_0);
g.setTransform(defaultTransform__0_0_28);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_29 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_29
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_29_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_29_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_29_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_29_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_29_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_29_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_29_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_29_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_29_0_0_0_0);
g.setTransform(defaultTransform__0_0_29_0_0_0);
g.setTransform(defaultTransform__0_0_29_0_0);
g.setTransform(defaultTransform__0_0_29_0);
g.setTransform(defaultTransform__0_0_29);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_30 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_30
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_30_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_30_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_30_0);
g.setTransform(defaultTransform__0_0_30);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_31 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_31
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_31_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_31_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_31_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_31_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_31_0_0);
g.setTransform(defaultTransform__0_0_31_0);
g.setTransform(defaultTransform__0_0_31);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_32 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_32
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_32_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_32_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_32_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_32_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_32_0_0);
g.setTransform(defaultTransform__0_0_32_0);
g.setTransform(defaultTransform__0_0_32);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_33 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_33
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_33_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_33_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_33_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_33_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_33_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_33_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_33_0_0_0);
g.setTransform(defaultTransform__0_0_33_0_0);
g.setTransform(defaultTransform__0_0_33_0);
g.setTransform(defaultTransform__0_0_33);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_34 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_34
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_34_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_34_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_34_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_34_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_34_0_0);
g.setTransform(defaultTransform__0_0_34_0);
g.setTransform(defaultTransform__0_0_34);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_35 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_35
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_35_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_35_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_35_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_35_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_35_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_35_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_35_0_0_0);
g.setTransform(defaultTransform__0_0_35_0_0);
g.setTransform(defaultTransform__0_0_35_0);
g.setTransform(defaultTransform__0_0_35);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_36 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_36
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_36_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_36_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_36_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_36_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_36_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_36_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_36_0_0_0);
g.setTransform(defaultTransform__0_0_36_0_0);
g.setTransform(defaultTransform__0_0_36_0);
g.setTransform(defaultTransform__0_0_36);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_37 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_37
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_37_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_37_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_37_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_37_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_37_0_0);
g.setTransform(defaultTransform__0_0_37_0);
g.setTransform(defaultTransform__0_0_37);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_38 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_38
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_38_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_38_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_38_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_38_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_38_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_38_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_38_0_0_0);
g.setTransform(defaultTransform__0_0_38_0_0);
g.setTransform(defaultTransform__0_0_38_0);
g.setTransform(defaultTransform__0_0_38);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_39 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_39
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_39_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_39_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_39_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_39_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_39_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_39_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_39_0_0_0);
g.setTransform(defaultTransform__0_0_39_0_0);
g.setTransform(defaultTransform__0_0_39_0);
g.setTransform(defaultTransform__0_0_39);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_40 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_40
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_40_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_40_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_40_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_40_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_40_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_40_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_40_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_40_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_40_0_0_0_0);
g.setTransform(defaultTransform__0_0_40_0_0_0);
g.setTransform(defaultTransform__0_0_40_0_0);
g.setTransform(defaultTransform__0_0_40_0);
g.setTransform(defaultTransform__0_0_40);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_41 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_41
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_41_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_41_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_41_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_41_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_41_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_41_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_41_0_0_0);
g.setTransform(defaultTransform__0_0_41_0_0);
g.setTransform(defaultTransform__0_0_41_0);
g.setTransform(defaultTransform__0_0_41);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_42 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_42
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_42_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_42_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_42_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_42_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_42_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_42_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_42_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_42_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_42_0_0_0_0);
g.setTransform(defaultTransform__0_0_42_0_0_0);
g.setTransform(defaultTransform__0_0_42_0_0);
g.setTransform(defaultTransform__0_0_42_0);
g.setTransform(defaultTransform__0_0_42);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_43 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_43
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_43_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_43_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_43_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_43_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_43_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_43_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_43_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_43_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_43_0_0_0_0);
g.setTransform(defaultTransform__0_0_43_0_0_0);
g.setTransform(defaultTransform__0_0_43_0_0);
g.setTransform(defaultTransform__0_0_43_0);
g.setTransform(defaultTransform__0_0_43);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_44 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_44
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_44_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_44_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_44_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_44_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_44_0_0);
g.setTransform(defaultTransform__0_0_44_0);
g.setTransform(defaultTransform__0_0_44);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_45 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_45
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_45_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_45_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_45_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_45_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_45_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_45_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_45_0_0_0);
g.setTransform(defaultTransform__0_0_45_0_0);
g.setTransform(defaultTransform__0_0_45_0);
g.setTransform(defaultTransform__0_0_45);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_46 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_46
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_46_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_46_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_46_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_46_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_46_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_46_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_46_0_0_0);
g.setTransform(defaultTransform__0_0_46_0_0);
g.setTransform(defaultTransform__0_0_46_0);
g.setTransform(defaultTransform__0_0_46);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_47 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_47
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_47_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_47_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_47_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_47_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_47_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_47_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_47_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_47_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_47_0_0_0_0);
g.setTransform(defaultTransform__0_0_47_0_0_0);
g.setTransform(defaultTransform__0_0_47_0_0);
g.setTransform(defaultTransform__0_0_47_0);
g.setTransform(defaultTransform__0_0_47);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_48 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_48
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_48_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_48_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_48_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_48_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_48_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_48_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_48_0_0_0);
g.setTransform(defaultTransform__0_0_48_0_0);
g.setTransform(defaultTransform__0_0_48_0);
g.setTransform(defaultTransform__0_0_48);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_49 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_49
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_49_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_49_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_49_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_49_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_49_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_49_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_49_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_49_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_49_0_0_0_0);
g.setTransform(defaultTransform__0_0_49_0_0_0);
g.setTransform(defaultTransform__0_0_49_0_0);
g.setTransform(defaultTransform__0_0_49_0);
g.setTransform(defaultTransform__0_0_49);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_50 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_50
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_50_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_50_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_50_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_50_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_50_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_50_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_50_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_50_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_50_0_0_0_0);
g.setTransform(defaultTransform__0_0_50_0_0_0);
g.setTransform(defaultTransform__0_0_50_0_0);
g.setTransform(defaultTransform__0_0_50_0);
g.setTransform(defaultTransform__0_0_50);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_51 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_51
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_51_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_51_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_51_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_51_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_51_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_51_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_51_0_0_0);
g.setTransform(defaultTransform__0_0_51_0_0);
g.setTransform(defaultTransform__0_0_51_0);
g.setTransform(defaultTransform__0_0_51);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_52 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_52
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_52_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_52_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_52_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_52_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_52_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_52_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_52_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_52_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_52_0_0_0_0);
g.setTransform(defaultTransform__0_0_52_0_0_0);
g.setTransform(defaultTransform__0_0_52_0_0);
g.setTransform(defaultTransform__0_0_52_0);
g.setTransform(defaultTransform__0_0_52);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_53 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_53
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_53_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_53_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_53_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_53_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_53_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_53_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_53_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_53_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_53_0_0_0_0);
g.setTransform(defaultTransform__0_0_53_0_0_0);
g.setTransform(defaultTransform__0_0_53_0_0);
g.setTransform(defaultTransform__0_0_53_0);
g.setTransform(defaultTransform__0_0_53);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_54 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_54
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_54_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_54_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_54_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_54_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_54_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_54_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_54_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_54_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_54_0_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_54_0_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_54_0_0_0_0_0);
g.setTransform(defaultTransform__0_0_54_0_0_0_0);
g.setTransform(defaultTransform__0_0_54_0_0_0);
g.setTransform(defaultTransform__0_0_54_0_0);
g.setTransform(defaultTransform__0_0_54_0);
g.setTransform(defaultTransform__0_0_54);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_55 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_55
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_55_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_55_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_55_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_55_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_55_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_55_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_55_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_55_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_55_0_0_0_0);
g.setTransform(defaultTransform__0_0_55_0_0_0);
g.setTransform(defaultTransform__0_0_55_0_0);
g.setTransform(defaultTransform__0_0_55_0);
g.setTransform(defaultTransform__0_0_55);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_56 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_56
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_56_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_56_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_56_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_56_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_56_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_56_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_56_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 146.5897979736328f, 0.0f));
// _0_0_56_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_56_0_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_56_0_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_56_0_0_0_0_0);
g.setTransform(defaultTransform__0_0_56_0_0_0_0);
g.setTransform(defaultTransform__0_0_56_0_0_0);
g.setTransform(defaultTransform__0_0_56_0_0);
g.setTransform(defaultTransform__0_0_56_0);
g.setTransform(defaultTransform__0_0_56);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_57 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.859741132648196E-5f, 384.7460632324219f));
// _0_0_57
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_57_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 9.29870566324098E-6f, 192.37303161621094f));
// _0_0_57_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_57_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.64935283162049E-6f, 96.18651580810547f));
// _0_0_57_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_57_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 586.3591918945312f, 0.0f));
// _0_0_57_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_57_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 293.1795959472656f, 0.0f));
// _0_0_57_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_57_0_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_57_0_0_0_0_0
paint = new Color(0, 49, 18, 255);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(1097.8363037109375, 117.8895492553711), new Point2D.Double(1299.0174560546875, 244.44061279296875), new float[] {0.0f,1.0f}, new Color[] {new Color(64, 64, 64, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7284095287322998f, 0.0f, 0.0f, 0.7604446411132812f, -799.3721923828125f, -90.16488647460938f));
stroke = new BasicStroke(2.2327642f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3948897123336792, 0.624262273311615, 144.35704040527344, 93.95375061035156);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_57_0_0_0_0_0);
g.setTransform(defaultTransform__0_0_57_0_0_0_0);
g.setTransform(defaultTransform__0_0_57_0_0_0);
g.setTransform(defaultTransform__0_0_57_0_0);
g.setTransform(defaultTransform__0_0_57_0);
g.setTransform(defaultTransform__0_0_57);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f));
// _0_1_0
paint = new LinearGradientPaint(new Point2D.Double(428.2454833984375, 16.884231567382812), new Point2D.Double(1006.9141235351562, 595.5528564453125), new float[] {0.0f,1.0f}, new Color[] {new Color(56, 19, 0, 255),new Color(94, 46, 21, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1410.600830078125f, -628.5507202148438f));
shape = new Rectangle2D.Double(-982.355224609375, -611.6663818359375, 578.6686401367188, 578.6686401367188);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_1 = g.getTransform();
g.transform(new AffineTransform(-0.9257294535636902f, 0.0f, 0.0f, -0.9257294535636902f, 1334.5709228515625f, 620.7244873046875f));
// _0_1_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_1_0 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f));
// _0_1_1_0
paint = new LinearGradientPaint(new Point2D.Double(428.2454833984375, 16.884231567382812), new Point2D.Double(1006.9141235351562, 595.5528564453125), new float[] {0.0f,1.0f}, new Color[] {new Color(56, 19, 0, 255),new Color(94, 46, 21, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1410.600830078125f, -628.5507202148438f));
shape = new Rectangle2D.Double(-982.355224609375, -611.6663818359375, 578.6686401367188, 578.6686401367188);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_1_0);
g.setTransform(defaultTransform__0_1_1);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
paint = new LinearGradientPaint(new Point2D.Double(428.2454833984375, 16.884231567382812), new Point2D.Double(1006.9141235351562, 595.5528564453125), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 249, 198, 255),new Color(202, 195, 124, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8830615282058716f, 0.0f, 0.0f, 0.8830615282058716f, 58.83280563354492f, 53.09008026123047f));
shape = new Rectangle2D.Double(437.0, 68.0, 511.0, 511.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setTransform(defaultTransform__0_2);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public int getOrigX() {
        return  Math.round(0 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public int getOrigY() {
        return  Math.round(0 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * 
     * @return The width of the bounding box of the original SVG image.
     */
    public int getOrigWidth() {
        return  Math.round(1025 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public int getOrigHeight() {
        return  Math.round(769 * GraphicsEngine.getScaleFactor());
    }
}

