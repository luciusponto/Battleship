package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class Sunk implements GameGraphics {
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
paint = new Color(0, 70, 0, 255);
shape = new Rectangle2D.Double(32.26347351074219, 316.6259460449219, 565.6527709960938, 565.6527709960938);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(0.11980839818716049f, 0.0f, 0.0f, 0.1264643669128418f, 53.42557144165039f, 417.4311828613281f));
// _0_0_1
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(0.14832912385463715f, 0.0f, 0.0f, 0.13844051957130432f, 349.896728515625f, 296.5306396484375f));
// _0_0_2
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(0.19354148209095f, 0.0f, 0.0f, 0.1767117828130722f, 114.774169921875f, 224.546875f));
// _0_0_3
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(0.07947409152984619f, 0.0f, 0.0f, 0.08477237075567245f, 482.4546813964844f, 180.09921264648438f));
// _0_0_4
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(0.09419400244951248f, 0.0f, 0.0f, 0.0994269996881485f, 312.60772705078125f, 438.9339599609375f));
// _0_0_5
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(0.12987840175628662f, 0.0f, 0.0f, 0.13552528619766235f, 171.1352996826172f, 86.35879516601562f));
// _0_0_6
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(0.1687982827425003f, 0.0f, 0.0f, 0.1575450599193573f, 516.214599609375f, 320.6424865722656f));
// _0_0_7
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(0.07766576111316681f, 0.0f, 0.0f, 0.08284349739551544f, 255.9580535888672f, 142.50778198242188f));
// _0_0_8
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(0.10294321179389954f, 0.0f, 0.0f, 0.10866224765777588f, 513.8418579101562f, 260.0869445800781f));
// _0_0_9
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(0.12467143684625626f, 0.0f, 0.0f, 0.13009192049503326f, 156.88038635253906f, 116.21350860595703f));
// _0_0_10
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(0.17087650299072266f, 0.0f, 0.0f, 0.15948474407196045f, 508.4857482910156f, 188.60238647460938f));
// _0_0_11
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(0.11001460999250412f, 0.0f, 0.0f, 0.11734890192747116f, 534.2212524414062f, 516.0142211914062f));
// _0_0_12
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(0.09235209226608276f, 0.0f, 0.0f, 0.09748280048370361f, 195.19439697265625f, 363.16033935546875f));
// _0_0_13
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(0.13968248665332794f, 0.0f, 0.0f, 0.14575567841529846f, 404.2359313964844f, 202.1115264892578f));
// _0_0_14
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(0.13071683049201965f, 0.0f, 0.0f, 0.12200237065553665f, 161.95750427246094f, 192.4181365966797f));
// _0_0_15
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(0.1604420244693756f, 0.0f, 0.0f, 0.14649054408073425f, 168.10707092285156f, 482.716064453125f));
// _0_0_16
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_17 = g.getTransform();
g.transform(new AffineTransform(0.09227012097835541f, 0.0f, 0.0f, 0.09842143952846527f, 356.0885009765625f, 156.5657958984375f));
// _0_0_17
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_17);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18 = g.getTransform();
g.transform(new AffineTransform(0.10315270721912384f, 0.0f, 0.0f, 0.10888338088989258f, 330.76019287109375f, 236.6497039794922f));
// _0_0_18
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_18);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19 = g.getTransform();
g.transform(new AffineTransform(0.13985708355903625f, 0.0f, 0.0f, 0.14593783020973206f, 49.024810791015625f, 16.124813079833984f));
// _0_0_19
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_19);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_20 = g.getTransform();
g.transform(new AffineTransform(0.17171037197113037f, 0.0f, 0.0f, 0.1602630317211151f, 46.8050422668457f, 274.6519470214844f));
// _0_0_20
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_20);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_21 = g.getTransform();
g.transform(new AffineTransform(0.19689805805683136f, 0.0f, 0.0f, 0.17977648973464966f, 465.7799072265625f, 42.202884674072266f));
// _0_0_21
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_21);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_22 = g.getTransform();
g.transform(new AffineTransform(0.07524164766073227f, 0.0f, 0.0f, 0.08025774359703064f, 492.35467529296875f, 399.70721435546875f));
// _0_0_22
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_22);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_23 = g.getTransform();
g.transform(new AffineTransform(0.08368480950593948f, 0.0f, 0.0f, 0.08833397179841995f, 252.7917022705078f, 274.79840087890625f));
// _0_0_23
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_23);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_24 = g.getTransform();
g.transform(new AffineTransform(0.13075785338878632f, 0.0f, 0.0f, 0.13644298911094666f, 422.07415771484375f, 463.6771240234375f));
// _0_0_24
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_24);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_25 = g.getTransform();
g.transform(new AffineTransform(0.14511698484420776f, 0.0f, 0.0f, 0.13544249534606934f, 432.040771484375f, 97.13237762451172f));
// _0_0_25
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_25);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_26 = g.getTransform();
g.transform(new AffineTransform(0.23158930242061615f, 0.0f, 0.0f, 0.21145111322402954f, 248.09986877441406f, 10.568422317504883f));
// _0_0_26
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_26);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_27 = g.getTransform();
g.transform(new AffineTransform(0.07564965635538101f, 0.0f, 0.0f, 0.08069296926259995f, 217.95957946777344f, 338.6475830078125f));
// _0_0_27
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_27);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_28 = g.getTransform();
g.transform(new AffineTransform(0.08178675919771194f, 0.0f, 0.0f, 0.08633048832416534f, 183.4501495361328f, 419.67852783203125f));
// _0_0_28
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_28);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_29 = g.getTransform();
g.transform(new AffineTransform(0.11891244351863861f, 0.0f, 0.0f, 0.124082550406456f, 425.56036376953125f, 437.4184875488281f));
// _0_0_29
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_29);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_30 = g.getTransform();
g.transform(new AffineTransform(0.2096676230430603f, 0.0f, 0.0f, 0.19143563508987427f, 419.89886474609375f, 310.6589050292969f));
// _0_0_30
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_30);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_31 = g.getTransform();
g.transform(new AffineTransform(0.07696051895618439f, 0.0f, 0.0f, 0.08209124207496643f, 331.3506164550781f, 364.78399658203125f));
// _0_0_31
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(397.33655, 285.12576);
((GeneralPath)shape).curveTo(397.33655, 350.65384, 344.21555, 403.77487, 278.68744, 403.77487);
((GeneralPath)shape).curveTo(213.15936, 403.77487, 160.03835, 350.65384, 160.03835, 285.12576);
((GeneralPath)shape).curveTo(160.03835, 219.59767, 213.15936, 166.47665, 278.68744, 166.47665);
((GeneralPath)shape).curveTo(344.21555, 166.47665, 397.33655, 219.59767, 397.33655, 285.12576);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_31);
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

