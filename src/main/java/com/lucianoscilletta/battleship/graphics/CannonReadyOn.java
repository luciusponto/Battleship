package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class CannonReadyOn implements GameGraphics {
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
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(0.8501121997833252f, 0.0f, 0.0f, 0.8501121997833252f, 726.4257202148438f, -41.342002868652344f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(29.70871925354004, 640.3820190429688), new Point2D.Double(126.14856719970703, 736.8195190429688), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(122.20862, 686.63196);
((GeneralPath)shape).curveTo(122.20862, 712.1751, 101.50181, 732.8819, 75.958664, 732.8819);
((GeneralPath)shape).curveTo(50.415527, 732.8819, 29.708717, 712.1751, 29.708717, 686.63196);
((GeneralPath)shape).curveTo(29.708717, 661.0888, 50.415527, 640.382, 75.958664, 640.382);
((GeneralPath)shape).curveTo(101.50181, 640.382, 122.20862, 661.0888, 122.20862, 686.63196);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(0.7698721885681152f, 0.0f, 0.0f, 0.7698721885681152f, 732.5206298828125f, 13.753344535827637f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(121.6385269165039, 733.1229248046875), new Point2D.Double(29.75658416748047, 640.4022216796875), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(122.20862, 686.63196);
((GeneralPath)shape).curveTo(122.20862, 712.1751, 101.50181, 732.8819, 75.958664, 732.8819);
((GeneralPath)shape).curveTo(50.415527, 732.8819, 29.708717, 712.1751, 29.708717, 686.63196);
((GeneralPath)shape).curveTo(29.708717, 661.0888, 50.415527, 640.382, 75.958664, 640.382);
((GeneralPath)shape).curveTo(101.50181, 640.382, 122.20862, 661.0888, 122.20862, 686.63196);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(0.76987224817276f, 0.0f, 0.0f, 0.7698721885681152f, 732.5206298828125f, 13.753353118896484f));
// _0_0_3
paint = new Color(222, 0, 0, 127);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(122.20862, 686.63196);
((GeneralPath)shape).curveTo(122.20862, 712.1751, 101.50181, 732.8819, 75.958664, 732.8819);
((GeneralPath)shape).curveTo(50.415527, 732.8819, 29.708717, 712.1751, 29.708717, 686.63196);
((GeneralPath)shape).curveTo(29.708717, 661.0888, 50.415527, 640.382, 75.958664, 640.382);
((GeneralPath)shape).curveTo(101.50181, 640.382, 122.20862, 661.0888, 122.20862, 686.63196);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(0.7041757702827454f, 0.0f, 0.0f, 0.7041757702827454f, 737.7800903320312f, 59.13187026977539f));
// _0_0_4
paint = new RadialGradientPaint(new Point2D.Double(61.42067337036133, 669.065185546875), 46.24995f, new Point2D.Double(61.42067337036133, 669.065185546875), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 60, 60, 255),new Color(248, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(122.20862, 686.63196);
((GeneralPath)shape).curveTo(122.20862, 712.1751, 101.50181, 732.8819, 75.958664, 732.8819);
((GeneralPath)shape).curveTo(50.415527, 732.8819, 29.708717, 712.1751, 29.708717, 686.63196);
((GeneralPath)shape).curveTo(29.708717, 661.0888, 50.415527, 640.382, 75.958664, 640.382);
((GeneralPath)shape).curveTo(101.50181, 640.382, 122.20862, 661.0888, 122.20862, 686.63196);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public int getOrigX() {
        return  Math.round(752 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public int getOrigY() {
        return  Math.round(504 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * 
     * @return The width of the bounding box of the original SVG image.
     */
    public int getOrigWidth() {
        return  Math.round(79 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public int getOrigHeight() {
        return  Math.round(79 * GraphicsEngine.getScaleFactor());
    }
}

