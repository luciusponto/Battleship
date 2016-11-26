package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class Switch2On implements GameGraphics {
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
paint = new Color(51, 51, 51, 1);
shape = new Rectangle2D.Double(925.8781127929688, 505.4521789550781, 34.84858322143555, 77.89895629882812);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 64.07451629638672f, 0.4908788800239563f));
// _0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_0
paint = new Color(51, 51, 51, 1);
shape = new Rectangle2D.Double(861.8035888671875, 504.9613037109375, 34.84858322143555, 77.89895629882812);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_0 = g.getTransform();
g.transform(new AffineTransform(0.9575048089027405f, 0.0f, 0.0f, 0.9575048089027405f, 522.2964477539062f, -380.7016906738281f));
// _0_0_1_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_0_0 = g.getTransform();
g.transform(new AffineTransform(-0.3252354562282562f, 0.0f, 0.0f, -0.3252354562282562f, 336.62652587890625f, 1067.706298828125f));
// _0_0_1_1_0_0
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_0_1 = g.getTransform();
g.transform(new AffineTransform(0.20048761367797852f, 0.0f, 0.0f, 0.20048761367797852f, 395.05419921875f, 903.7058715820312f));
// _0_0_1_1_0_1
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1_0_1);
g.setTransform(defaultTransform__0_0_1_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1_1
paint = new LinearGradientPaint(new Point2D.Double(-67.66516876220703, 201.8357696533203), new Point2D.Double(-185.40231323242188, 140.4672393798828), new float[] {0.0f,1.0f}, new Color[] {new Color(221, 221, 221, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.1102842167019844f, 0.0f, 0.0f, -0.1102842167019844f, 867.3021850585938f, 580.1976928710938f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(868.83844, 576.2656);
((GeneralPath)shape).lineTo(887.74915, 576.14594);
((GeneralPath)shape).lineTo(885.7444, 545.80505);
((GeneralPath)shape).lineTo(885.7444, 545.5956);
((GeneralPath)shape).lineTo(885.7145, 545.5956);
((GeneralPath)shape).curveTo(885.6022, 542.2863, 882.88715, 539.6112, 879.55054, 539.6112);
((GeneralPath)shape).curveTo(876.21344, 539.6112, 873.49817, 542.28564, 873.3866, 545.5956);
((GeneralPath)shape).lineTo(868.83844, 576.2656);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_2 = g.getTransform();
g.transform(new AffineTransform(-0.9575047492980957f, 0.0f, 0.0f, 0.9575048089027405f, 1236.4903564453125f, -47.384891510009766f));
// _0_0_1_1_2
paint = new LinearGradientPaint(new Point2D.Double(384.0046081542969, 642.2259521484375), new Point2D.Double(364.1957702636719, 658.2161865234375), new float[] {0.0f,1.0f}, new Color[] {new Color(160, 160, 160, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(384.0046, 650.22107);
((GeneralPath)shape).curveTo(384.0073, 653.0789, 382.12012, 655.7206, 379.0546, 657.1501);
((GeneralPath)shape).curveTo(375.98904, 658.57965, 372.21136, 658.57965, 369.1458, 657.1501);
((GeneralPath)shape).curveTo(366.0803, 655.7206, 364.1931, 653.0789, 364.1958, 650.22107);
((GeneralPath)shape).curveTo(364.1931, 647.3632, 366.0803, 644.72156, 369.1458, 643.29205);
((GeneralPath)shape).curveTo(372.21136, 641.8625, 375.98904, 641.8625, 379.0546, 643.29205);
((GeneralPath)shape).curveTo(382.12012, 644.72156, 384.0073, 647.3632, 384.0046, 650.22107);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1_2);
g.setTransform(defaultTransform__0_0_1_1);
g.setTransform(defaultTransform__0_0_1);
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
        return  Math.round(926 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public int getOrigY() {
        return  Math.round(506 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * 
     * @return The width of the bounding box of the original SVG image.
     */
    public int getOrigWidth() {
        return  Math.round(35 * GraphicsEngine.getScaleFactor());
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

