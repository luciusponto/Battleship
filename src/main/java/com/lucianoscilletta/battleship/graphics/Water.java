package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class Water implements GameGraphics {
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
g.transform(new AffineTransform(0.9575048089027405f, 0.0f, 0.0f, 0.9575048089027405f, 21.76285171508789f, -270.57281494140625f));
// _0_0_0
paint = new Color(0, 70, 0, 0);
shape = new Rectangle2D.Double(32.26347351074219, 316.6259460449219, 565.6527709960938, 565.6527709960938);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(0.9575048089027405f, 0.0f, 0.0f, 0.9575048089027405f, 21.76285171508789f, -270.57281494140625f));
// _0_0_1
paint = new Color(0, 70, 0, 255);
shape = new Rectangle2D.Double(32.26347351074219, 316.6259460449219, 565.6527709960938, 565.6527709960938);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(471.7591, 154.3493);
((GeneralPath)shape).curveTo(470.99893, 155.7967, 470.2364, 157.24284, 469.47867, 158.69153);
((GeneralPath)shape).curveTo(464.7743, 167.68599, 465.15967, 167.60059, 458.24765, 177.3362);
((GeneralPath)shape).curveTo(455.3474, 181.4212, 452.1209, 185.2655, 449.14438, 189.29527);
((GeneralPath)shape).curveTo(423.52567, 223.97922, 453.34024, 184.78372, 423.90475, 223.11151);
((GeneralPath)shape).curveTo(397.25137, 255.33752, 371.1324, 288.097, 341.76212, 317.94324);
((GeneralPath)shape).curveTo(319.07565, 340.99734, 309.68448, 348.53513, 285.64514, 369.72726);
((GeneralPath)shape).curveTo(263.7761, 387.79413, 241.69707, 405.6078, 219.19423, 422.8807);
((GeneralPath)shape).curveTo(213.60742, 427.16907, 201.22293, 436.70996, 194.39966, 441.0645);
((GeneralPath)shape).curveTo(192.61534, 442.20325, 190.65254, 443.03458, 188.77898, 444.01962);
((GeneralPath)shape).curveTo(188.55191, 443.0606, 188.32483, 442.10156, 188.09775, 441.14255);
((GeneralPath)shape).curveTo(187.45866, 443.2649, 157.44388, 434.22687, 158.08296, 432.10452);
((GeneralPath)shape).lineTo(158.08296, 432.10452);
((GeneralPath)shape).curveTo(158.36601, 429.74014, 158.64905, 427.37576, 158.9321, 425.01138);
((GeneralPath)shape).curveTo(159.96535, 422.36557, 160.67758, 419.5707, 162.03183, 417.0739);
((GeneralPath)shape).curveTo(167.07277, 407.78003, 174.36198, 399.2356, 181.20224, 391.3582);
((GeneralPath)shape).curveTo(199.53499, 370.24573, 219.33917, 350.43054, 238.95529, 330.53296);
((GeneralPath)shape).curveTo(261.00824, 309.70755, 270.8777, 300.1272, 293.65112, 279.6994);
((GeneralPath)shape).curveTo(324.24347, 252.25806, 356.1752, 226.0243, 383.6048, 195.28473);
((GeneralPath)shape).curveTo(438.92026, 139.7364, 364.95755, 213.75748, 414.08258, 165.32639);
((GeneralPath)shape).curveTo(417.7833, 161.67795, 421.19055, 157.73257, 424.98938, 154.1864);
((GeneralPath)shape).curveTo(431.35648, 148.24277, 438.48907, 142.82043, 445.471, 137.61856);
((GeneralPath)shape).curveTo(446.65405, 135.7597, 472.9422, 152.49048, 471.75916, 154.34933);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(243.47379, 151.2031);
((GeneralPath)shape).curveTo(282.76483, 189.2436, 314.24, 234.35822, 346.50952, 278.2548);
((GeneralPath)shape).curveTo(367.52917, 308.13315, 387.94183, 338.50552, 406.09595, 370.2324);
((GeneralPath)shape).curveTo(414.06717, 384.16324, 422.74915, 400.35635, 428.67148, 415.47986);
((GeneralPath)shape).curveTo(430.7139, 420.6955, 432.04962, 426.16098, 433.73868, 431.50153);
((GeneralPath)shape).curveTo(434.3468, 435.76636, 436.69614, 446.00412, 434.5586, 450.92715);
((GeneralPath)shape).curveTo(432.16385, 456.4426, 428.2494, 461.16498, 425.0948, 466.28387);
((GeneralPath)shape).curveTo(423.27765, 467.4965, 406.1285, 441.79816, 407.94565, 440.5855);
((GeneralPath)shape).lineTo(407.94565, 440.5855);
((GeneralPath)shape).curveTo(400.83075, 456.39563, 403.67734, 459.22632, 394.4655, 447.96506);
((GeneralPath)shape).curveTo(358.80905, 402.5161, 322.83463, 357.16083, 292.32428, 307.99622);
((GeneralPath)shape).curveTo(285.63013, 297.3397, 278.95233, 286.6729, 272.24185, 276.02664);
((GeneralPath)shape).curveTo(266.07236, 266.23868, 259.61118, 256.63046, 253.68445, 246.69363);
((GeneralPath)shape).curveTo(242.9662, 228.72333, 236.05096, 215.05037, 226.9902, 196.68274);
((GeneralPath)shape).curveTo(224.31108, 191.2517, 221.51404, 185.86993, 219.13707, 180.30003);
((GeneralPath)shape).curveTo(217.84656, 177.27603, 217.0504, 174.06418, 216.00706, 170.94626);
((GeneralPath)shape).curveTo(214.61101, 169.00407, 242.0777, 149.26088, 243.47374, 151.20306);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
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
        return  Math.round(53 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public int getOrigY() {
        return  Math.round(33 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * 
     * @return The width of the bounding box of the original SVG image.
     */
    public int getOrigWidth() {
        return  Math.round(542 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public int getOrigHeight() {
        return  Math.round(542 * GraphicsEngine.getScaleFactor());
    }
}

