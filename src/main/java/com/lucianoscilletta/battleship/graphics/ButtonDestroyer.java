package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class ButtonDestroyer implements GameGraphics {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 244.82139587402344f));
// _0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0
paint = new LinearGradientPaint(new Point2D.Double(58.60942077636719, 83.05278778076172), new Point2D.Double(364.6808166503906, 157.94259643554688), new float[] {0.0f,1.0f}, new Color[] {new Color(191, 191, 191, 255),new Color(71, 71, 71, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9998186826705933f, 0.0f, 0.0f, 1.0375310182571411f, -15.90113353729248f, -48.483848571777344f));
shape = new Rectangle2D.Double(44.867977142333984, 35.43381118774414, 306.015869140625, 83.33096313476562);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(157.71102905273438, 11.058775901794434), new Point2D.Double(195.08297729492188, 150.60728454589844), new float[] {0.0f,0.5f,0.52273077f,1.0f}, new Color[] {new Color(224, 224, 224, 255),new Color(176, 176, 176, 255),new Color(102, 102, 102, 255),new Color(35, 35, 35, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(3.056f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(44.867977142333984, 35.43381118774414, 306.015869140625, 83.33096313476562);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0);
g.setTransform(defaultTransform__0_0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(75.373665, 340.7071);
((GeneralPath)shape).curveTo(74.14359, 338.94833, 71.915146, 336.22855, 70.421555, 334.66315);
((GeneralPath)shape).lineTo(67.70594, 331.81696);
((GeneralPath)shape).lineTo(82.30341, 331.97028);
((GeneralPath)shape).lineTo(96.90088, 332.1236);
((GeneralPath)shape).lineTo(96.90288, 332.6285);
((GeneralPath)shape).curveTo(96.90386, 332.90622, 97.35948, 333.13342, 97.91489, 333.13342);
((GeneralPath)shape).lineTo(98.924706, 333.13342);
((GeneralPath)shape).lineTo(98.924706, 332.4602);
((GeneralPath)shape).lineTo(98.924706, 331.787);
((GeneralPath)shape).lineTo(101.56146, 331.787);
((GeneralPath)shape).lineTo(104.19824, 331.787);
((GeneralPath)shape).lineTo(104.42266, 332.40237);
((GeneralPath)shape).lineTo(104.647064, 333.01776);
((GeneralPath)shape).lineTo(107.339935, 333.1408);
((GeneralPath)shape).curveTo(108.821014, 333.2085, 110.94166, 333.2105, 112.05247, 333.1458);
((GeneralPath)shape).lineTo(114.072105, 333.02744);
((GeneralPath)shape).lineTo(113.2306, 332.6879);
((GeneralPath)shape).lineTo(112.38906, 332.34833);
((GeneralPath)shape).lineTo(112.38906, 331.05798);
((GeneralPath)shape).lineTo(112.38906, 329.76767);
((GeneralPath)shape).lineTo(108.518074, 329.6618);
((GeneralPath)shape).lineTo(104.64707, 329.55594);
((GeneralPath)shape).lineTo(109.073204, 329.15695);
((GeneralPath)shape).lineTo(113.499306, 328.75797);
((GeneralPath)shape).lineTo(114.675316, 327.57983);
((GeneralPath)shape).lineTo(115.85133, 326.4017);
((GeneralPath)shape).lineTo(117.795876, 326.4017);
((GeneralPath)shape).lineTo(119.74042, 326.4017);
((GeneralPath)shape).lineTo(120.551186, 329.10785);
((GeneralPath)shape).lineTo(121.36198, 331.81396);
((GeneralPath)shape).lineTo(120.0733, 332.78912);
((GeneralPath)shape).lineTo(118.78463, 333.76425);
((GeneralPath)shape).lineTo(121.6458, 333.78564);
((GeneralPath)shape).lineTo(124.50698, 333.80704);
((GeneralPath)shape).lineTo(124.50698, 333.13382);
((GeneralPath)shape).lineTo(124.50698, 332.4606);
((GeneralPath)shape).lineTo(126.4869, 332.4606);
((GeneralPath)shape).lineTo(128.46683, 332.4606);
((GeneralPath)shape).lineTo(128.8829, 333.13382);
((GeneralPath)shape).lineTo(129.29895, 333.80704);
((GeneralPath)shape).lineTo(132.70776, 333.80704);
((GeneralPath)shape).lineTo(136.11655, 333.80704);
((GeneralPath)shape).lineTo(135.27847, 332.7972);
((GeneralPath)shape).lineTo(134.44038, 331.7874);
((GeneralPath)shape).lineTo(137.00775, 331.7874);
((GeneralPath)shape).lineTo(139.57513, 331.7874);
((GeneralPath)shape).lineTo(138.32959, 332.69815);
((GeneralPath)shape).lineTo(137.08406, 333.60892);
((GeneralPath)shape).lineTo(141.20038, 334.07462);
((GeneralPath)shape).lineTo(145.3167, 334.54034);
((GeneralPath)shape).lineTo(146.69316, 333.16388);
((GeneralPath)shape).curveTo(147.45023, 332.40683, 148.06963, 331.48447, 148.06963, 331.1142);
((GeneralPath)shape).lineTo(148.06963, 330.44098);
((GeneralPath)shape).lineTo(146.38658, 330.44098);
((GeneralPath)shape).lineTo(144.70354, 330.44098);
((GeneralPath)shape).lineTo(144.70354, 329.84076);
((GeneralPath)shape).lineTo(144.70354, 329.2405);
((GeneralPath)shape).lineTo(146.32082, 328.8346);
((GeneralPath)shape).lineTo(147.93811, 328.42868);
((GeneralPath)shape).lineTo(150.02351, 328.84576);
((GeneralPath)shape).lineTo(152.10892, 329.26285);
((GeneralPath)shape).lineTo(152.10892, 329.85193);
((GeneralPath)shape).lineTo(152.10892, 330.44098);
((GeneralPath)shape).lineTo(151.09909, 330.44098);
((GeneralPath)shape).curveTo(149.88487, 330.44098, 149.87183, 330.5736, 150.87054, 332.76556);
((GeneralPath)shape).lineTo(151.65182, 334.4803);
((GeneralPath)shape).lineTo(155.26758, 334.4803);
((GeneralPath)shape).lineTo(158.88333, 334.4803);
((GeneralPath)shape).lineTo(159.28792, 333.42593);
((GeneralPath)shape).curveTo(159.51044, 332.84604, 159.72815, 330.3467, 159.77171, 327.8719);
((GeneralPath)shape).lineTo(159.8509, 323.3722);
((GeneralPath)shape).lineTo(160.52412, 322.8776);
((GeneralPath)shape).lineTo(161.19733, 322.383);
((GeneralPath)shape).lineTo(164.64568, 322.37268);
((GeneralPath)shape).lineTo(168.09404, 322.36237);
((GeneralPath)shape).lineTo(168.5129, 319.74298);
((GeneralPath)shape).lineTo(168.93175, 317.1236);
((GeneralPath)shape).lineTo(170.00043, 316.7135);
((GeneralPath)shape).curveTo(170.5882, 316.48795, 171.94252, 316.3034, 173.01001, 316.3034);
((GeneralPath)shape).lineTo(174.95091, 316.3034);
((GeneralPath)shape).lineTo(175.64781, 317.6056);
((GeneralPath)shape).lineTo(176.3447, 318.90778);
((GeneralPath)shape).lineTo(176.3447, 321.0132);
((GeneralPath)shape).lineTo(176.3447, 323.11865);
((GeneralPath)shape).lineTo(178.86928, 322.73703);
((GeneralPath)shape).curveTo(180.25778, 322.52713, 182.22696, 322.18143, 183.2452, 321.96878);
((GeneralPath)shape).lineTo(185.09654, 321.58218);
((GeneralPath)shape).lineTo(185.09654, 320.67123);
((GeneralPath)shape).lineTo(185.09654, 319.76025);
((GeneralPath)shape).lineTo(183.7501, 319.33292);
((GeneralPath)shape).lineTo(182.40367, 318.90558);
((GeneralPath)shape).lineTo(182.40367, 317.60452);
((GeneralPath)shape).lineTo(182.40367, 316.30347);
((GeneralPath)shape).lineTo(183.07689, 316.30347);
((GeneralPath)shape).lineTo(183.7501, 316.30347);
((GeneralPath)shape).lineTo(183.7501, 317.3133);
((GeneralPath)shape).lineTo(183.7501, 318.32312);
((GeneralPath)shape).lineTo(184.25502, 318.30173);
((GeneralPath)shape).curveTo(184.53271, 318.28992, 185.299, 317.87137, 185.95784, 317.37152);
((GeneralPath)shape).lineTo(187.15576, 316.46274);
((GeneralPath)shape).lineTo(186.12614, 316.06763);
((GeneralPath)shape).curveTo(185.55986, 315.85034, 185.09653, 315.38843, 185.09653, 315.0412);
((GeneralPath)shape).lineTo(185.09653, 314.40988);
((GeneralPath)shape).lineTo(186.36697, 314.74213);
((GeneralPath)shape).lineTo(187.63742, 315.07437);
((GeneralPath)shape).lineTo(188.14684, 314.25012);
((GeneralPath)shape).lineTo(188.65625, 313.42587);
((GeneralPath)shape).lineTo(187.0447, 312.1868);
((GeneralPath)shape).lineTo(185.43314, 310.9477);
((GeneralPath)shape).lineTo(186.44296, 310.95468);
((GeneralPath)shape).curveTo(186.99837, 310.95767, 187.98296, 311.36356, 188.63092, 311.85544);
((GeneralPath)shape).lineTo(189.80905, 312.74976);
((GeneralPath)shape).lineTo(189.80905, 313.71902);
((GeneralPath)shape).curveTo(189.80905, 314.25214, 189.43037, 315.0722, 188.96751, 315.54147);
((GeneralPath)shape).lineTo(188.126, 316.39465);
((GeneralPath)shape).lineTo(189.30586, 317.26633);
((GeneralPath)shape).lineTo(190.48573, 318.13803);
((GeneralPath)shape).lineTo(190.06322, 320.2505);
((GeneralPath)shape).lineTo(189.64073, 322.36295);
((GeneralPath)shape).lineTo(190.39809, 322.36295);
((GeneralPath)shape).lineTo(191.15546, 322.36295);
((GeneralPath)shape).lineTo(191.15546, 319.67007);
((GeneralPath)shape).lineTo(191.15546, 316.9772);
((GeneralPath)shape).lineTo(191.69705, 316.9772);
((GeneralPath)shape).lineTo(192.23865, 316.9772);
((GeneralPath)shape).lineTo(192.40628, 319.8183);
((GeneralPath)shape).curveTo(192.60773, 323.2325, 192.69173, 323.34222, 194.40315, 322.4263);
((GeneralPath)shape).lineTo(195.74652, 321.70734);
((GeneralPath)shape).lineTo(195.37436, 320.28418);
((GeneralPath)shape).lineTo(195.00218, 318.86105);
((GeneralPath)shape).lineTo(196.2766, 319.12167);
((GeneralPath)shape).lineTo(197.55101, 319.3823);
((GeneralPath)shape).lineTo(197.35318, 320.536);
((GeneralPath)shape).lineTo(197.15536, 321.68973);
((GeneralPath)shape).lineTo(197.85811, 321.68973);
((GeneralPath)shape).lineTo(198.56085, 321.68973);
((GeneralPath)shape).lineTo(198.56685, 317.1455);
((GeneralPath)shape).curveTo(198.56985, 314.64618, 198.76373, 311.0108, 198.99722, 309.0669);
((GeneralPath)shape).lineTo(199.42175, 305.5325);
((GeneralPath)shape).lineTo(198.43036, 305.5325);
((GeneralPath)shape).lineTo(197.43896, 305.5325);
((GeneralPath)shape).lineTo(197.43896, 304.55164);
((GeneralPath)shape).lineTo(197.43896, 303.5708);
((GeneralPath)shape).lineTo(198.39735, 303.20303);
((GeneralPath)shape).curveTo(198.92445, 303.00076, 199.58075, 302.97433, 199.85579, 303.14435);
((GeneralPath)shape).lineTo(200.35585, 303.45343);
((GeneralPath)shape).lineTo(200.30005, 300.9586);
((GeneralPath)shape).lineTo(200.24385, 298.46375);
((GeneralPath)shape).lineTo(200.91708, 298.46375);
((GeneralPath)shape).lineTo(201.59029, 298.46375);
((GeneralPath)shape).lineTo(201.5064, 300.90326);
((GeneralPath)shape).lineTo(201.4224, 303.34277);
((GeneralPath)shape).lineTo(202.85289, 303.00708);
((GeneralPath)shape).lineTo(204.28336, 302.67142);
((GeneralPath)shape).lineTo(202.93692, 303.70972);
((GeneralPath)shape).lineTo(201.59048, 304.74802);
((GeneralPath)shape).lineTo(201.3701, 313.0871);
((GeneralPath)shape).lineTo(201.14969, 321.42618);
((GeneralPath)shape).lineTo(202.9165, 322.23117);
((GeneralPath)shape).curveTo(203.88828, 322.67395, 205.12349, 323.0362, 205.66148, 323.0362);
((GeneralPath)shape).lineTo(206.63963, 323.0362);
((GeneralPath)shape).lineTo(206.63963, 326.78824);
((GeneralPath)shape).lineTo(206.63963, 330.5403);
((GeneralPath)shape).lineTo(207.80753, 330.3154);
((GeneralPath)shape).lineTo(208.9754, 330.09048);
((GeneralPath)shape).lineTo(209.45177, 327.40485);
((GeneralPath)shape).curveTo(209.71376, 325.92776, 209.94557, 323.16116, 209.96692, 321.25687);
((GeneralPath)shape).lineTo(210.00562, 317.7945);
((GeneralPath)shape).lineTo(211.07051, 317.38586);
((GeneralPath)shape).curveTo(211.6562, 317.1611, 214.363, 316.97723, 217.08565, 316.97723);
((GeneralPath)shape).lineTo(222.0359, 316.97723);
((GeneralPath)shape).lineTo(223.63562, 317.58545);
((GeneralPath)shape).lineTo(225.23535, 318.19366);
((GeneralPath)shape).lineTo(226.86559, 322.29797);
((GeneralPath)shape).lineTo(228.49582, 326.40225);
((GeneralPath)shape).lineTo(232.56847, 326.40225);
((GeneralPath)shape).lineTo(236.64111, 326.40225);
((GeneralPath)shape).lineTo(236.82643, 317.48212);
((GeneralPath)shape).lineTo(237.01173, 308.56198);
((GeneralPath)shape).lineTo(237.91463, 306.744);
((GeneralPath)shape).lineTo(238.8175, 304.926);
((GeneralPath)shape).lineTo(238.04422, 304.6092);
((GeneralPath)shape).lineTo(237.27094, 304.29236);
((GeneralPath)shape).lineTo(238.16054, 304.23926);
((GeneralPath)shape).lineTo(239.05014, 304.18607);
((GeneralPath)shape).lineTo(238.04031, 303.17624);
((GeneralPath)shape).curveTo(237.48491, 302.62085, 236.70589, 302.1664, 236.30919, 302.1664);
((GeneralPath)shape).lineTo(235.58788, 302.1664);
((GeneralPath)shape).lineTo(235.58788, 301.4932);
((GeneralPath)shape).lineTo(235.58788, 300.81998);
((GeneralPath)shape).lineTo(239.29057, 300.81998);
((GeneralPath)shape).lineTo(242.99326, 300.81998);
((GeneralPath)shape).lineTo(242.99326, 301.4932);
((GeneralPath)shape).lineTo(242.99326, 302.1664);
((GeneralPath)shape).lineTo(241.26979, 302.1664);
((GeneralPath)shape).lineTo(239.54633, 302.1664);
((GeneralPath)shape).lineTo(239.96861, 304.35437);
((GeneralPath)shape).curveTo(240.20087, 305.55774, 240.56093, 308.89017, 240.76875, 311.75977);
((GeneralPath)shape).curveTo(240.97656, 314.62936, 241.28635, 316.9772, 241.4571, 316.9772);
((GeneralPath)shape).curveTo(241.62788, 316.9772, 242.38118, 316.29556, 243.1311, 315.46246);
((GeneralPath)shape).lineTo(244.4946, 313.94772);
((GeneralPath)shape).lineTo(242.74799, 316.40915);
((GeneralPath)shape).lineTo(241.00139, 318.87057);
((GeneralPath)shape).lineTo(241.36707, 325.4976);
((GeneralPath)shape).curveTo(241.56819, 329.14243, 241.87067, 332.8062, 242.03923, 333.6393);
((GeneralPath)shape).lineTo(242.3457, 335.15405);
((GeneralPath)shape).lineTo(243.67929, 335.15405);
((GeneralPath)shape).lineTo(245.01291, 335.15405);
((GeneralPath)shape).lineTo(245.01291, 331.11475);
((GeneralPath)shape).lineTo(245.01291, 327.07547);
((GeneralPath)shape).lineTo(247.70576, 327.07547);
((GeneralPath)shape).lineTo(250.39865, 327.07547);
((GeneralPath)shape).lineTo(250.46956, 328.92682);
((GeneralPath)shape).lineTo(250.54047, 330.77817);
((GeneralPath)shape).lineTo(251.33133, 325.57495);
((GeneralPath)shape).lineTo(252.12218, 320.37173);
((GeneralPath)shape).lineTo(253.44843, 319.36908);
((GeneralPath)shape).curveTo(255.06746, 318.1451, 255.89708, 318.09705, 258.0979, 319.09982);
((GeneralPath)shape).lineTo(259.80142, 319.876);
((GeneralPath)shape).lineTo(260.19766, 322.2976);
((GeneralPath)shape).curveTo(260.4156, 323.6295, 260.92624, 325.40085, 261.33243, 326.23395);
((GeneralPath)shape).lineTo(262.07095, 327.7487);
((GeneralPath)shape).lineTo(264.65005, 327.7487);
((GeneralPath)shape).lineTo(267.22916, 327.7487);
((GeneralPath)shape).lineTo(267.22916, 326.40225);
((GeneralPath)shape).lineTo(267.22916, 325.05582);
((GeneralPath)shape).lineTo(271.26846, 325.05582);
((GeneralPath)shape).lineTo(275.30777, 325.05582);
((GeneralPath)shape).lineTo(275.30777, 326.3715);
((GeneralPath)shape).lineTo(275.30777, 327.68716);
((GeneralPath)shape).lineTo(279.852, 327.88623);
((GeneralPath)shape).lineTo(284.3962, 328.0853);
((GeneralPath)shape).lineTo(284.59937, 331.233);
((GeneralPath)shape).lineTo(284.8025, 334.3807);
((GeneralPath)shape).lineTo(298.70425, 334.4542);
((GeneralPath)shape).curveTo(306.35022, 334.4947, 312.7451, 334.66678, 312.91504, 334.83676);
((GeneralPath)shape).curveTo(313.08502, 335.0067, 312.721, 335.70166, 312.10617, 336.38107);
((GeneralPath)shape).curveTo(311.49133, 337.06046, 310.98828, 337.90082, 310.98828, 338.24857);
((GeneralPath)shape).curveTo(310.98828, 338.59628, 310.22, 340.01144, 309.28098, 341.39334);
((GeneralPath)shape).lineTo(307.57367, 343.90588);
((GeneralPath)shape).lineTo(192.59189, 343.90588);
((GeneralPath)shape).lineTo(77.61011, 343.90588);
((GeneralPath)shape).lineTo(75.37362, 340.70807);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(245.83852, 313.22052);
((GeneralPath)shape).curveTo(246.47768, 312.5532, 247.14552, 312.15213, 247.32263, 312.32925);
((GeneralPath)shape).curveTo(247.49974, 312.50638, 246.9768, 313.05234, 246.16054, 313.54254);
((GeneralPath)shape).lineTo(244.67642, 314.4338);
((GeneralPath)shape).lineTo(245.83852, 313.22052);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_1);
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
        return  Math.round(279 * GraphicsEngine.getScaleFactor());
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

