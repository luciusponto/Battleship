package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class ButtonWarRoomDisable implements GameGraphics {
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
paint = new Color(242, 242, 242, 150);
shape = new Rectangle2D.Double(43.3399772644043, 33.13520050048828, 309.0718688964844, 86.386962890625);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
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
        return  Math.round(44 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public int getOrigY() {
        return  Math.round(34 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * 
     * @return The width of the bounding box of the original SVG image.
     */
    public int getOrigWidth() {
        return  Math.round(310 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public int getOrigHeight() {
        return  Math.round(87 * GraphicsEngine.getScaleFactor());
    }
}

