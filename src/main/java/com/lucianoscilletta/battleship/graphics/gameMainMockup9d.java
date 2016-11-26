package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class gameMainMockup9d implements GameGraphics {
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
paint = new LinearGradientPaint(new Point2D.Double(1024.0, 768.0), new Point2D.Double(0.0, 0.0), new float[] {0.0f,1.0f}, new Color[] {new Color(80, 80, 80, 255),new Color(208, 208, 208, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new Rectangle2D.Double(1.1368683772161603E-13, 0.0, 1024.0, 768.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -284.3621826171875f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0 = g.getTransform();
g.transform(new AffineTransform(0.16085189580917358f, 0.0f, 0.0f, 0.16085189580917358f, 28.8767147064209f, 217.4438934326172f));
// _0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0_0 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, -222.2754669189453f, 796.3621826171875f));
// _0_1_0_0
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0_1 = g.getTransform();
g.transform(new AffineTransform(0.6164383292198181f, 0.0f, 0.0f, 0.6164383292198181f, -42.628173828125f, 292.11083984375f));
// _0_1_0_1
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.0f * origAlpha));
AffineTransform defaultTransform__0_1_0_2 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, -222.2754669189453f, 796.3621826171875f));
// _0_1_0_2
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_0_2);
g.setTransform(defaultTransform__0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_1 = g.getTransform();
g.transform(new AffineTransform(0.16085189580917358f, 0.0f, 0.0f, 0.16085189580917358f, 1031.1097412109375f, 217.4438934326172f));
// _0_1_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_1_0 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, -222.2754669189453f, 796.3621826171875f));
// _0_1_1_0
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_1_1 = g.getTransform();
g.transform(new AffineTransform(0.6164383292198181f, 0.0f, 0.0f, 0.6164383292198181f, -42.628173828125f, 292.11083984375f));
// _0_1_1_1
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_1_1);
g.setComposite(AlphaComposite.getInstance(3, 0.25f * origAlpha));
AffineTransform defaultTransform__0_1_1_2 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, -222.2754669189453f, 796.3621826171875f));
// _0_1_1_2
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_1_2);
g.setTransform(defaultTransform__0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2 = g.getTransform();
g.transform(new AffineTransform(0.16085189580917358f, 0.0f, 0.0f, 0.16085189580917358f, 1030.876708984375f, 963.4439086914062f));
// _0_1_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2_0 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, -222.2754669189453f, 796.3621826171875f));
// _0_1_2_0
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2_1 = g.getTransform();
g.transform(new AffineTransform(0.6164383292198181f, 0.0f, 0.0f, 0.6164383292198181f, -42.628173828125f, 292.11083984375f));
// _0_1_2_1
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_2_1);
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_1_2_2 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, -222.2754669189453f, 796.3621826171875f));
// _0_1_2_2
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_2_2);
g.setTransform(defaultTransform__0_1_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_3 = g.getTransform();
g.transform(new AffineTransform(0.16085189580917358f, 0.0f, 0.0f, 0.16085189580917358f, 28.8767147064209f, 963.4439086914062f));
// _0_1_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_3_0 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, -222.2754669189453f, 796.3621826171875f));
// _0_1_3_0
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_3_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_3_1 = g.getTransform();
g.transform(new AffineTransform(0.6164383292198181f, 0.0f, 0.0f, 0.6164383292198181f, -42.628173828125f, 292.11083984375f));
// _0_1_3_1
paint = new LinearGradientPaint(new Point2D.Double(-55.185638427734375, 367.9041748046875), new Point2D.Double(-167.08982849121094, 256.0), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_3_1);
g.setComposite(AlphaComposite.getInstance(3, 0.25f * origAlpha));
AffineTransform defaultTransform__0_1_3_2 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, -222.2754669189453f, 796.3621826171875f));
// _0_1_3_2
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-55.18564, 311.9521);
((GeneralPath)shape).curveTo(-55.18564, 342.85358, -80.236244, 367.90417, -111.13773, 367.90417);
((GeneralPath)shape).curveTo(-142.03922, 367.90417, -167.08983, 342.85358, -167.08983, 311.9521);
((GeneralPath)shape).curveTo(-167.08983, 281.0506, -142.03922, 256.0, -111.13773, 256.0);
((GeneralPath)shape).curveTo(-80.236244, 256.0, -55.18564, 281.0506, -55.18564, 311.9521);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_3_2);
g.setTransform(defaultTransform__0_1_3);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -284.3621826171875f));
// _0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_0 = g.getTransform();
g.transform(new AffineTransform(0.3152015805244446f, 0.0f, 0.0f, 0.31520161032676697f, 524.9951171875f, 356.8011169433594f));
// _0_2_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_0
paint = new LinearGradientPaint(new Point2D.Double(362.4137268066406, 1314.302001953125), new Point2D.Double(620.8383178710938, 1628.7454833984375), new float[] {0.0f,1.0f}, new Color[] {new Color(221, 221, 221, 255),new Color(112, 112, 112, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(620.8383, 1342.0868);
((GeneralPath)shape).lineTo(620.8383, 1628.7455);
((GeneralPath)shape).lineTo(334.1796, 1342.0868);
((GeneralPath)shape).lineTo(620.8383, 1342.0868);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_1
paint = new LinearGradientPaint(new Point2D.Double(364.2193298339844, 1407.1026611328125), new Point2D.Double(620.8383178710938, 1628.7454833984375), new float[] {0.0f,1.0f}, new Color[] {new Color(233, 233, 233, 255),new Color(106, 106, 106, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(334.17963, 1628.7455);
((GeneralPath)shape).lineTo(334.17963, 1342.0868);
((GeneralPath)shape).lineTo(620.8384, 1628.7455);
((GeneralPath)shape).lineTo(334.17966, 1628.7455);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2
paint = new LinearGradientPaint(new Point2D.Double(605.5113525390625, 1615.5057373046875), new Point2D.Double(455.9844055175781, 1471.419189453125), new float[] {0.0f,1.0f}, new Color[] {new Color(77, 77, 77, 255),new Color(77, 77, 77, 73)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(620.8383, 1628.7455);
((GeneralPath)shape).lineTo(334.17963, 1628.7455);
((GeneralPath)shape).lineTo(620.8383, 1342.0868);
((GeneralPath)shape).lineTo(620.8383, 1628.7455);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_0_2);
g.setTransform(defaultTransform__0_2_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_1 = g.getTransform();
g.transform(new AffineTransform(-0.1419927030801773f, 0.0f, 0.0f, -0.2256043553352356f, 767.5206298828125f, 911.7501220703125f));
// _0_2_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_0
paint = new Color(0, 0, 0, 255);
shape = new Rectangle2D.Double(365.904541015625, 206.53125, 564.720458984375, 355.6055603027344);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_1
paint = new Color(255, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(365.90625, 206.53125);
((GeneralPath)shape).lineTo(365.90625, 234.53125);
((GeneralPath)shape).lineTo(389.125, 206.53125);
((GeneralPath)shape).lineTo(365.90625, 206.53125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(424.65625, 206.53125);
((GeneralPath)shape).lineTo(365.90625, 277.375);
((GeneralPath)shape).lineTo(365.90625, 320.21875);
((GeneralPath)shape).lineTo(460.1875, 206.53125);
((GeneralPath)shape).lineTo(424.65625, 206.53125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(495.71875, 206.53125);
((GeneralPath)shape).lineTo(365.90625, 363.0625);
((GeneralPath)shape).lineTo(365.90625, 405.875);
((GeneralPath)shape).lineTo(531.25, 206.53125);
((GeneralPath)shape).lineTo(495.71875, 206.53125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(566.75, 206.53125);
((GeneralPath)shape).lineTo(365.90625, 448.71875);
((GeneralPath)shape).lineTo(365.90625, 491.5625);
((GeneralPath)shape).lineTo(602.3125, 206.53125);
((GeneralPath)shape).lineTo(566.75, 206.53125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(637.84375, 206.53125);
((GeneralPath)shape).lineTo(365.90625, 534.40625);
((GeneralPath)shape).lineTo(365.90625, 562.125);
((GeneralPath)shape).lineTo(378.4375, 562.125);
((GeneralPath)shape).lineTo(673.34375, 206.53125);
((GeneralPath)shape).lineTo(637.84375, 206.53125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(708.90625, 206.53125);
((GeneralPath)shape).lineTo(413.96875, 562.125);
((GeneralPath)shape).lineTo(449.53125, 562.125);
((GeneralPath)shape).lineTo(744.40625, 206.53125);
((GeneralPath)shape).lineTo(708.90625, 206.53125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(779.9375, 206.53125);
((GeneralPath)shape).lineTo(485.03125, 562.125);
((GeneralPath)shape).lineTo(520.5625, 562.125);
((GeneralPath)shape).lineTo(815.5, 206.53125);
((GeneralPath)shape).lineTo(779.9375, 206.53125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(850.96875, 206.53125);
((GeneralPath)shape).lineTo(556.09375, 562.125);
((GeneralPath)shape).lineTo(591.625, 562.125);
((GeneralPath)shape).lineTo(886.53125, 206.53125);
((GeneralPath)shape).lineTo(850.96875, 206.53125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(922.0625, 206.53125);
((GeneralPath)shape).lineTo(627.15625, 562.125);
((GeneralPath)shape).lineTo(662.65625, 562.125);
((GeneralPath)shape).lineTo(930.625, 239.03125);
((GeneralPath)shape).lineTo(930.625, 206.53125);
((GeneralPath)shape).lineTo(922.0625, 206.53125);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(930.625, 281.90625);
((GeneralPath)shape).lineTo(698.21875, 562.125);
((GeneralPath)shape).lineTo(733.75, 562.125);
((GeneralPath)shape).lineTo(930.625, 324.6875);
((GeneralPath)shape).lineTo(930.625, 281.90625);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(930.625, 367.5625);
((GeneralPath)shape).lineTo(769.25, 562.125);
((GeneralPath)shape).lineTo(804.8125, 562.125);
((GeneralPath)shape).lineTo(930.625, 410.40625);
((GeneralPath)shape).lineTo(930.625, 367.5625);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(930.625, 453.21875);
((GeneralPath)shape).lineTo(840.3125, 562.125);
((GeneralPath)shape).lineTo(875.84375, 562.125);
((GeneralPath)shape).lineTo(930.625, 496.0625);
((GeneralPath)shape).lineTo(930.625, 453.21875);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(930.625, 538.90625);
((GeneralPath)shape).lineTo(911.375, 562.125);
((GeneralPath)shape).lineTo(930.625, 562.125);
((GeneralPath)shape).lineTo(930.625, 538.90625);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_1_1);
g.setTransform(defaultTransform__0_2_0_1);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -131.29666137695312f, -297.4568786621094f));
// _0_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1_0 = g.getTransform();
g.transform(new AffineTransform(0.27958184480667114f, 0.0f, 0.0f, 0.27958184480667114f, 785.72802734375f, 645.6293334960938f));
// _0_2_1_0
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
g.setTransform(defaultTransform__0_2_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1_1 = g.getTransform();
g.transform(new AffineTransform(0.23718120157718658f, 0.0f, 0.0f, 0.23718120157718658f, 788.9486694335938f, 674.7429809570312f));
// _0_2_1_1
paint = new RadialGradientPaint(new Point2D.Double(61.42067337036133, 669.065185546875), 46.24995f, new Point2D.Double(61.42067337036133, 669.065185546875), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 136, 136, 255),new Color(177, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(122.20862, 686.63196);
((GeneralPath)shape).curveTo(122.20862, 712.1751, 101.50181, 732.8819, 75.958664, 732.8819);
((GeneralPath)shape).curveTo(50.415527, 732.8819, 29.708717, 712.1751, 29.708717, 686.63196);
((GeneralPath)shape).curveTo(29.708717, 661.0888, 50.415527, 640.382, 75.958664, 640.382);
((GeneralPath)shape).curveTo(101.50181, 640.382, 122.20862, 661.0888, 122.20862, 686.63196);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_1_1);
g.setTransform(defaultTransform__0_2_1);
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
        return  Math.round(1 * GraphicsEngine.getScaleFactor());
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
        return  Math.round(1024 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public int getOrigHeight() {
        return  Math.round(768 * GraphicsEngine.getScaleFactor());
    }
}

