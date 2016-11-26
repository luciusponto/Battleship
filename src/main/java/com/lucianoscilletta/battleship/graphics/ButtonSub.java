package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class ButtonSub implements GameGraphics {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 367.2320251464844f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0
paint = new LinearGradientPaint(new Point2D.Double(58.60942077636719, 83.05278778076172), new Point2D.Double(364.6808166503906, 157.94259643554688), new float[] {0.0f,1.0f}, new Color[] {new Color(191, 191, 191, 255),new Color(71, 71, 71, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9998186826705933f, 0.0f, 0.0f, 1.0375310182571411f, -15.90113353729248f, -48.483848571777344f));
shape = new Rectangle2D.Double(44.867977142333984, 35.43381118774414, 306.015869140625, 83.33096313476562);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(129.78172302246094, 18.947511672973633), new Point2D.Double(197.87591552734375, 169.69232177734375), new float[] {0.0f,1.0f}, new Color[] {new Color(224, 224, 224, 255),new Color(35, 35, 35, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(3.056f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(44.867977142333984, 35.43381118774414, 306.015869140625, 83.33096313476562);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(95.4239, 466.1301);
((GeneralPath)shape).curveTo(95.302345, 464.54037, 95.14412, 462.42886, 95.072235, 461.43787);
((GeneralPath)shape).curveTo(94.96506, 459.9604, 94.93685, 459.83377, 94.91538, 460.73453);
((GeneralPath)shape).curveTo(94.87938, 462.2409, 94.572464, 462.70734, 93.61387, 462.71185);
((GeneralPath)shape).curveTo(92.841835, 462.71585, 92.71097, 462.21133, 92.951836, 460.16156);
((GeneralPath)shape).curveTo(93.06345, 459.21185, 93.1878, 458.29547, 93.22819, 458.12512);
((GeneralPath)shape).curveTo(93.28899, 457.86826, 93.145386, 457.76764, 92.38615, 457.5353);
((GeneralPath)shape).curveTo(91.43471, 457.2442, 89.81268, 456.46414, 89.58881, 456.19006);
((GeneralPath)shape).curveTo(89.517914, 456.10336, 89.4588, 455.88846, 89.45732, 455.7126);
((GeneralPath)shape).curveTo(89.45432, 455.33295, 90.866585, 454.36917, 92.32231, 453.75766);
((GeneralPath)shape).curveTo(93.17333, 453.40018, 93.28171, 453.30453, 93.22036, 452.965);
((GeneralPath)shape).curveTo(92.85751, 450.9569, 92.76956, 449.56027, 92.96777, 448.95392);
((GeneralPath)shape).curveTo(93.15438, 448.38303, 93.24365, 448.29956, 93.667496, 448.29956);
((GeneralPath)shape).curveTo(94.04284, 448.29956, 94.241844, 448.4276, 94.54253, 448.86264);
((GeneralPath)shape).curveTo(94.908226, 449.39166, 94.92438, 449.53452, 94.80978, 451.22617);
((GeneralPath)shape).curveTo(94.742775, 452.21643, 94.73298, 452.988, 94.78808, 452.94077);
((GeneralPath)shape).curveTo(94.84318, 452.89355, 95.00969, 450.8671, 95.158, 448.43756);
((GeneralPath)shape).curveTo(95.54124, 442.15964, 95.53714, 442.19073, 95.996956, 442.0851);
((GeneralPath)shape).curveTo(96.20724, 442.0368, 97.504166, 441.9963, 98.87903, 441.9952);
((GeneralPath)shape).lineTo(101.37876, 441.9932);
((GeneralPath)shape).lineTo(101.904724, 442.4237);
((GeneralPath)shape).curveTo(102.39324, 442.82358, 102.49689, 443.12006, 103.36135, 446.59042);
((GeneralPath)shape).lineTo(104.29203, 450.32663);
((GeneralPath)shape).lineTo(104.80601, 450.30804);
((GeneralPath)shape).curveTo(105.41038, 450.28625, 110.412636, 449.36584, 113.29649, 448.74585);
((GeneralPath)shape).curveTo(116.626915, 448.02982, 117.72647, 447.87228, 123.814964, 447.23877);
((GeneralPath)shape).curveTo(126.57524, 446.95157, 140.15668, 445.89713, 141.09587, 445.89713);
((GeneralPath)shape).lineTo(142.0264, 445.89713);
((GeneralPath)shape).lineTo(142.60645, 444.96124);
((GeneralPath)shape).curveTo(143.57654, 443.396, 145.09967, 442.38196, 147.65889, 441.5975);
((GeneralPath)shape).curveTo(148.77547, 441.25525, 149.39076, 441.17807, 151.77657, 441.08102);
((GeneralPath)shape).curveTo(153.31927, 441.01822, 169.07576, 440.96133, 186.79095, 440.95453);
((GeneralPath)shape).lineTo(219.00043, 440.94214);
((GeneralPath)shape).lineTo(219.09093, 440.6043);
((GeneralPath)shape).curveTo(219.14062, 440.4185, 219.65718, 437.8091, 220.23872, 434.8057);
((GeneralPath)shape).curveTo(220.82024, 431.80228, 221.37549, 429.21777, 221.47258, 429.0624);
((GeneralPath)shape).curveTo(221.63612, 428.80066, 221.90012, 428.77988, 225.06145, 428.77988);
((GeneralPath)shape).lineTo(228.47377, 428.77988);
((GeneralPath)shape).lineTo(228.47377, 424.27533);
((GeneralPath)shape).lineTo(228.47377, 419.77078);
((GeneralPath)shape).lineTo(229.08736, 419.77078);
((GeneralPath)shape).lineTo(229.70094, 419.77078);
((GeneralPath)shape).lineTo(229.70094, 424.27533);
((GeneralPath)shape).lineTo(229.70094, 428.77988);
((GeneralPath)shape).lineTo(231.2787, 428.77988);
((GeneralPath)shape).lineTo(232.85648, 428.77988);
((GeneralPath)shape).lineTo(232.85648, 422.32336);
((GeneralPath)shape).lineTo(232.85648, 415.86685);
((GeneralPath)shape).lineTo(233.4633, 415.86685);
((GeneralPath)shape).curveTo(234.02544, 415.86685, 234.08437, 415.91214, 234.2638, 416.48288);
((GeneralPath)shape).curveTo(234.38109, 416.85596, 234.41682, 417.67023, 234.3544, 418.54745);
((GeneralPath)shape).curveTo(234.2978, 419.34415, 234.20923, 421.97238, 234.15775, 424.38794);
((GeneralPath)shape).lineTo(234.06415, 428.77988);
((GeneralPath)shape).lineTo(234.7751, 428.77988);
((GeneralPath)shape).lineTo(235.48608, 428.77988);
((GeneralPath)shape).lineTo(235.48608, 428.1042);
((GeneralPath)shape).lineTo(235.48608, 427.4285);
((GeneralPath)shape).lineTo(236.36263, 427.4285);
((GeneralPath)shape).lineTo(237.23915, 427.4285);
((GeneralPath)shape).lineTo(237.23915, 428.1042);
((GeneralPath)shape).curveTo(237.23915, 428.59775, 237.30835, 428.77988, 237.49617, 428.77988);
((GeneralPath)shape).curveTo(237.63753, 428.77988, 238.01224, 428.87708, 238.32887, 428.99594);
((GeneralPath)shape).curveTo(238.64551, 429.11478, 239.12395, 429.2517, 239.3921, 429.30026);
((GeneralPath)shape).curveTo(239.68594, 429.35345, 240.01651, 429.5808, 240.22417, 429.8725);
((GeneralPath)shape).curveTo(240.55319, 430.3347, 240.56871, 430.66122, 240.56934, 437.1318);
((GeneralPath)shape).lineTo(240.57004, 443.90714);
((GeneralPath)shape).lineTo(246.22372, 444.00964);
((GeneralPath)shape).curveTo(251.68123, 444.10864, 257.73087, 444.4008, 260.6428, 444.70602);
((GeneralPath)shape).curveTo(261.41415, 444.78693, 263.18912, 444.91644, 264.58722, 444.994);
((GeneralPath)shape).curveTo(265.98532, 445.0715, 267.58667, 445.23886, 268.14575, 445.3659);
((GeneralPath)shape).curveTo(268.70486, 445.49295, 269.3521, 445.59686, 269.58408, 445.59686);
((GeneralPath)shape).curveTo(269.81604, 445.59686, 270.5419, 445.7701, 271.1971, 445.98187);
((GeneralPath)shape).curveTo(271.85233, 446.19363, 272.7621, 446.45755, 273.2188, 446.56836);
((GeneralPath)shape).curveTo(273.67554, 446.67917, 274.66162, 447.05685, 275.41016, 447.40765);
((GeneralPath)shape).curveTo(276.15866, 447.75845, 277.07587, 448.17548, 277.44833, 448.33438);
((GeneralPath)shape).curveTo(278.47647, 448.773, 280.9522, 450.94373, 281.51862, 451.90323);
((GeneralPath)shape).curveTo(281.98264, 452.68924, 282.00552, 452.82678, 281.99365, 454.7561);
((GeneralPath)shape).lineTo(281.98114, 456.78314);
((GeneralPath)shape).lineTo(281.0843, 458.41483);
((GeneralPath)shape).curveTo(279.48282, 461.32846, 277.06516, 463.13965, 273.46967, 464.1192);
((GeneralPath)shape).curveTo(271.33078, 464.70193, 267.9537, 465.41684, 267.33994, 465.41684);
((GeneralPath)shape).curveTo(267.0428, 465.41684, 266.36102, 465.48285, 265.82492, 465.56348);
((GeneralPath)shape).curveTo(264.8366, 465.71216, 262.7366, 465.8969, 258.45142, 466.21216);
((GeneralPath)shape).curveTo(256.71512, 466.3399, 239.88199, 466.38715, 195.25296, 466.38956);
((GeneralPath)shape).lineTo(134.42114, 466.39255);
((GeneralPath)shape).lineTo(129.86314, 465.9127);
((GeneralPath)shape).curveTo(127.35625, 465.64877, 124.95014, 465.4053, 124.51624, 465.37164);
((GeneralPath)shape).curveTo(122.83033, 465.24084, 115.48113, 463.68637, 111.89409, 462.70184);
((GeneralPath)shape).curveTo(108.39876, 461.7425, 106.316795, 461.2374, 104.93541, 461.01358);
((GeneralPath)shape).curveTo(104.2619, 460.90448, 104.43312, 460.4914, 103.29717, 464.9661);
((GeneralPath)shape).curveTo(102.56182, 467.86276, 102.333115, 468.5411, 102.01999, 468.7541);
((GeneralPath)shape).curveTo(101.69271, 468.97668, 101.2133, 469.01398, 98.64172, 469.01685);
((GeneralPath)shape).lineTo(95.644806, 469.01984);
((GeneralPath)shape).lineTo(95.423836, 466.12943);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(94.837616, 458.62253);
((GeneralPath)shape).curveTo(94.795815, 458.4367, 94.76162, 458.5887, 94.76162, 458.96036);
((GeneralPath)shape).curveTo(94.76162, 459.332, 94.79582, 459.484, 94.837616, 459.2982);
((GeneralPath)shape).curveTo(94.87942, 459.11237, 94.87942, 458.80832, 94.837616, 458.6225);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
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
        return  Math.round(44 * GraphicsEngine.getScaleFactor());
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public int getOrigY() {
        return  Math.round(402 * GraphicsEngine.getScaleFactor());
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

