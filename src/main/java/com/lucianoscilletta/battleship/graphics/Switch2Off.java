package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class Switch2Off implements GameGraphics {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 240.84707641601562f, -15.647825241088867f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0
g.setTransform(defaultTransform__0_0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_1 = g.getTransform();
g.transform(new AffineTransform(0.9575048089027405f, 0.0f, 0.0f, 0.9575048089027405f, 345.241455078125f, -364.6251220703125f));
// _0_0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_1_0_0 = g.getTransform();
g.transform(new AffineTransform(-0.3252354562282562f, 0.0f, 0.0f, -0.3252354562282562f, 336.62652587890625f, 1067.706298828125f));
// _0_0_0_1_0_0
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
g.setTransform(defaultTransform__0_0_0_1_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_1_0_1 = g.getTransform();
g.transform(new AffineTransform(0.20048761367797852f, 0.0f, 0.0f, 0.20048761367797852f, 395.05419921875f, 903.7058715820312f));
// _0_0_0_1_0_1
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
g.setTransform(defaultTransform__0_0_0_1_0_1);
g.setTransform(defaultTransform__0_0_0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1_1
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.11517877131700516f, 0.0f, 0.0f, 0.11517877131700516f, 386.03509521484375f, 928.7013549804688f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(384.4307, 932.8079);
((GeneralPath)shape).lineTo(364.6807, 932.9329);
((GeneralPath)shape).lineTo(366.77444, 964.6204);
((GeneralPath)shape).lineTo(366.77444, 964.8392);
((GeneralPath)shape).lineTo(366.80563, 964.8392);
((GeneralPath)shape).curveTo(366.9229, 968.29535, 369.75842, 971.0892, 373.24313, 971.0892);
((GeneralPath)shape).curveTo(376.72833, 971.0892, 379.56412, 968.296, 379.68063, 964.8392);
((GeneralPath)shape).lineTo(384.43063, 932.8079);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.46193933486938477f, 282.7453918457031f));
// _0_0_0_1_2
paint = new LinearGradientPaint(new Point2D.Double(364.1957702636719, 642.2259521484375), new Point2D.Double(384.0046081542969, 658.2161865234375), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(defaultTransform__0_0_0_1_2);
g.setTransform(defaultTransform__0_0_0_1);
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
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.1102842167019844f, 0.0f, 0.0f, 0.1102842167019844f, 891.9268798828125f, 508.5342712402344f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(890.3907, 512.4663);
((GeneralPath)shape).lineTo(871.48, 512.586);
((GeneralPath)shape).lineTo(873.48474, 542.92694);
((GeneralPath)shape).lineTo(873.48474, 543.1364);
((GeneralPath)shape).lineTo(873.51465, 543.1364);
((GeneralPath)shape).curveTo(873.62695, 546.4457, 876.342, 549.1208, 879.6786, 549.1208);
((GeneralPath)shape).curveTo(883.0157, 549.1208, 885.73096, 546.44635, 885.8425, 543.1364);
((GeneralPath)shape).lineTo(890.3907, 512.4663);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1_2 = g.getTransform();
g.transform(new AffineTransform(0.9575048089027405f, 0.0f, 0.0f, 0.9575048089027405f, 522.73876953125f, -109.97164154052734f));
// _0_0_1_1_2
paint = new LinearGradientPaint(new Point2D.Double(364.1957702636719, 642.2259521484375), new Point2D.Double(384.0046081542969, 658.2161865234375), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
        return  Math.round(36 * GraphicsEngine.getScaleFactor());
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

