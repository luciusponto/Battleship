package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class ButtonBattleship implements GameGraphics {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 122.4106674194336f));
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
((GeneralPath)shape).moveTo(62.008335, 221.4507);
((GeneralPath)shape).curveTo(60.863304, 219.70459, 60.286606, 215.78972, 60.94151, 214.20865);
((GeneralPath)shape).curveTo(61.426258, 213.03836, 61.583244, 212.92958, 61.818703, 213.60081);
((GeneralPath)shape).curveTo(62.073463, 214.32709, 62.188972, 214.29094, 62.85317, 213.27725);
((GeneralPath)shape).curveTo(63.264397, 212.64964, 64.04408, 210.67691, 64.5858, 208.89345);
((GeneralPath)shape).curveTo(65.54267, 205.74316, 65.61924, 205.64331, 67.27221, 205.39021);
((GeneralPath)shape).curveTo(72.11175, 204.6492, 74.73993, 204.51926, 74.73993, 205.02103);
((GeneralPath)shape).curveTo(74.73993, 205.30751, 74.27286, 205.54918, 73.702, 205.55809);
((GeneralPath)shape).curveTo(73.13114, 205.5671, 71.31477, 205.94421, 69.665634, 206.39632);
((GeneralPath)shape).curveTo(66.85326, 207.1673, 66.60631, 207.3452, 65.68613, 209.26323);
((GeneralPath)shape).curveTo(63.947277, 212.88766, 63.940674, 213.17703, 65.57871, 213.97035);
((GeneralPath)shape).curveTo(66.971344, 214.64482, 67.093315, 214.62978, 67.87231, 213.68738);
((GeneralPath)shape).lineTo(68.69506, 212.69203);
((GeneralPath)shape).lineTo(69.46589, 213.771);
((GeneralPath)shape).curveTo(70.12675, 214.69601, 70.475716, 214.80263, 71.911705, 214.51826);
((GeneralPath)shape).curveTo(72.83293, 214.33583, 73.84615, 214.17897, 74.16329, 214.1697);
((GeneralPath)shape).curveTo(74.48043, 214.1597, 74.73992, 213.97739, 74.73992, 213.76297);
((GeneralPath)shape).curveTo(74.73992, 213.54855, 73.90958, 213.47745, 72.89472, 213.60497);
((GeneralPath)shape).curveTo(71.80319, 213.74211, 71.04952, 213.64586, 71.04952, 213.36925);
((GeneralPath)shape).curveTo(71.04952, 213.06703, 74.352745, 212.92046, 80.39083, 212.95471);
((GeneralPath)shape).curveTo(85.52855, 212.98392, 90.28034, 212.8679, 90.950386, 212.69716);
((GeneralPath)shape).curveTo(92.316154, 212.34901, 93.15387, 213.14519, 92.30983, 213.98924);
((GeneralPath)shape).curveTo(91.91752, 214.38155, 91.55641, 214.3714, 90.88013, 213.94904);
((GeneralPath)shape).curveTo(90.38248, 213.63824, 89.713005, 213.39854, 89.39241, 213.41638);
((GeneralPath)shape).curveTo(89.07183, 213.43428, 89.2247, 213.61711, 89.732124, 213.82281);
((GeneralPath)shape).curveTo(90.433426, 214.10713, 90.24102, 214.18811, 88.92999, 214.16042);
((GeneralPath)shape).curveTo(87.98139, 214.14041, 87.44235, 213.97746, 87.73212, 213.79839);
((GeneralPath)shape).curveTo(88.02189, 213.6193, 87.4023, 213.51651, 86.35524, 213.56996);
((GeneralPath)shape).curveTo(85.30819, 213.62337, 84.290764, 213.8279, 84.09432, 214.02434);
((GeneralPath)shape).curveTo(83.89787, 214.2208, 84.307556, 214.23837, 85.00475, 214.06343);
((GeneralPath)shape).curveTo(85.816315, 213.85974, 86.27238, 213.92923, 86.27238, 214.25659);
((GeneralPath)shape).curveTo(86.27238, 214.5907, 87.63126, 214.7679, 90.19342, 214.7679);
((GeneralPath)shape).curveTo(93.371254, 214.7679, 94.11446, 214.63675, 94.11446, 214.07596);
((GeneralPath)shape).curveTo(94.11446, 213.69537, 94.42584, 213.384, 94.806404, 213.384);
((GeneralPath)shape).curveTo(95.18698, 213.384, 95.49836, 213.72255, 95.49836, 214.1363);
((GeneralPath)shape).curveTo(95.49836, 214.7377, 95.82053, 214.83633, 97.104454, 214.62798);
((GeneralPath)shape).curveTo(97.9878, 214.48462, 98.809395, 214.5273, 98.93023, 214.72278);
((GeneralPath)shape).curveTo(99.05105, 214.91827, 99.881355, 215.10573, 100.77534, 215.13933);
((GeneralPath)shape).curveTo(101.94281, 215.18323, 102.533195, 214.95299, 102.8708, 214.32217);
((GeneralPath)shape).curveTo(103.296234, 213.52724, 103.72836, 213.46901, 107.42557, 213.70856);
((GeneralPath)shape).curveTo(110.242935, 213.89108, 111.61104, 213.8102, 111.83494, 213.44794);
((GeneralPath)shape).curveTo(112.05069, 213.09885, 111.68629, 212.92268, 110.74845, 212.92268);
((GeneralPath)shape).curveTo(109.97234, 212.92268, 109.33733, 212.74466, 109.33733, 212.5271);
((GeneralPath)shape).curveTo(109.33733, 212.01933, 113.94083, 211.53877, 118.80515, 211.53877);
((GeneralPath)shape).curveTo(121.6174, 211.53877, 122.75096, 211.35934, 123.1763, 210.84683);
((GeneralPath)shape).curveTo(123.52672, 210.42459, 124.53771, 210.15488, 125.76993, 210.15488);
((GeneralPath)shape).curveTo(126.88058, 210.15488, 127.7893, 209.94728, 127.7893, 209.69357);
((GeneralPath)shape).curveTo(127.7893, 209.43985, 128.10066, 209.23227, 128.48123, 209.23227);
((GeneralPath)shape).curveTo(128.86182, 209.23227, 129.17319, 209.43985, 129.17319, 209.69357);
((GeneralPath)shape).curveTo(129.17319, 209.94728, 130.14699, 210.15488, 131.3372, 210.15488);
((GeneralPath)shape).curveTo(133.31836, 210.15488, 133.42561, 210.09958, 132.60649, 209.50064);
((GeneralPath)shape).curveTo(131.52158, 208.70732, 131.73737, 208.43044, 133.55553, 208.28287);
((GeneralPath)shape).curveTo(136.41821, 208.05052, 136.88423, 208.24287, 137.2527, 209.8089);
((GeneralPath)shape).curveTo(137.59454, 211.26173, 137.65472, 211.93251, 137.53423, 212.94667);
((GeneralPath)shape).curveTo(137.50253, 213.21358, 136.85382, 213.64905, 136.09267, 213.91438);
((GeneralPath)shape).curveTo(134.18336, 214.57997, 134.36151, 214.99852, 136.55411, 214.99852);
((GeneralPath)shape).lineTo(138.3992, 214.99852);
((GeneralPath)shape).lineTo(138.39919, 211.65408);
((GeneralPath)shape).curveTo(138.39919, 208.98882, 138.25867, 208.30968, 137.70723, 208.30968);
((GeneralPath)shape).curveTo(137.32281, 208.30968, 137.01527, 207.89964, 137.01527, 207.38707);
((GeneralPath)shape).curveTo(137.01527, 206.87451, 137.3228, 206.46448, 137.70723, 206.46448);
((GeneralPath)shape).curveTo(138.0878, 206.46448, 138.39919, 206.15788, 138.39919, 205.78316);
((GeneralPath)shape).curveTo(138.39919, 205.40843, 138.9164, 204.76295, 139.54854, 204.34875);
((GeneralPath)shape).curveTo(140.44687, 203.76013, 140.63478, 203.34416, 140.40887, 202.44414);
((GeneralPath)shape).curveTo(140.12375, 201.30814, 140.13313, 201.30397, 141.10472, 202.13586);
((GeneralPath)shape).curveTo(141.7906, 202.72314, 142.08957, 203.51292, 142.08957, 204.73758);
((GeneralPath)shape).curveTo(142.08957, 206.29868, 142.20605, 206.47897, 143.12749, 206.34402);
((GeneralPath)shape).curveTo(145.38177, 206.01384, 146.09677, 205.20485, 146.6587, 202.34854);
((GeneralPath)shape).curveTo(147.06276, 200.29486, 147.51833, 199.33313, 148.42494, 198.61998);
((GeneralPath)shape).lineTo(149.64668, 197.65897);
((GeneralPath)shape).lineTo(150.23412, 198.7173);
((GeneralPath)shape).curveTo(150.5572, 199.29941, 150.8289, 200.4503, 150.8379, 201.27487);
((GeneralPath)shape).curveTo(150.849, 202.29799, 151.07573, 202.7741, 151.55165, 202.7741);
((GeneralPath)shape).curveTo(152.10692, 202.7741, 152.18893, 203.15013, 151.95398, 204.6193);
((GeneralPath)shape).lineTo(151.65894, 206.4645);
((GeneralPath)shape).lineTo(155.39723, 206.4645);
((GeneralPath)shape).lineTo(159.13553, 206.4645);
((GeneralPath)shape).lineTo(158.9342, 201.80545);
((GeneralPath)shape).curveTo(158.82347, 199.24298, 158.50699, 196.87424, 158.23091, 196.54158);
((GeneralPath)shape).curveTo(157.95483, 196.20892, 157.9027, 195.82936, 158.11507, 195.6981);
((GeneralPath)shape).curveTo(158.32742, 195.56685, 158.46263, 194.76993, 158.4155, 193.92717);
((GeneralPath)shape).curveTo(158.3684, 193.0844, 158.27545, 191.30154, 158.20898, 189.96527);
((GeneralPath)shape).curveTo(158.10559, 187.88535, 157.97153, 187.5727, 157.27783, 187.79286);
((GeneralPath)shape).curveTo(156.83214, 187.93433, 156.33397, 187.83397, 156.17079, 187.56999);
((GeneralPath)shape).curveTo(155.99248, 187.28145, 156.39107, 187.08711, 157.16989, 187.08287);
((GeneralPath)shape).curveTo(158.17604, 187.07787, 158.31102, 186.97578, 157.77374, 186.62863);
((GeneralPath)shape).curveTo(157.31245, 186.33052, 157.27402, 186.17911, 157.65842, 186.17441);
((GeneralPath)shape).curveTo(157.97556, 186.17041, 158.23505, 185.76442, 158.23505, 185.27197);
((GeneralPath)shape).curveTo(158.23505, 184.12827, 159.14668, 183.52596, 159.19022, 184.6409);
((GeneralPath)shape).curveTo(159.20811, 185.09987, 159.19821, 187.03229, 159.16652, 188.93513);
((GeneralPath)shape).curveTo(159.12842, 191.27588, 159.3222, 192.68307, 159.76562, 193.28593);
((GeneralPath)shape).curveTo(160.41063, 194.16283, 160.46713, 194.16019, 163.31813, 193.12065);
((GeneralPath)shape).curveTo(166.1169, 192.10017, 166.23212, 192.09341, 166.71368, 192.92155);
((GeneralPath)shape).curveTo(167.70792, 194.63132, 168.28975, 196.86223, 168.08322, 198.17273);
((GeneralPath)shape).curveTo(167.96713, 198.90929, 168.10542, 199.94781, 168.39056, 200.48058);
((GeneralPath)shape).curveTo(168.78055, 201.20924, 168.77048, 201.61606, 168.34987, 202.1228);
((GeneralPath)shape).curveTo(167.5015, 203.14507, 168.08803, 203.35059, 170.21745, 202.77718);
((GeneralPath)shape).curveTo(171.66988, 202.38608, 172.30481, 202.3914, 172.7957, 202.79887);
((GeneralPath)shape).curveTo(173.30658, 203.22287, 173.50851, 203.17903, 173.73244, 202.59549);
((GeneralPath)shape).curveTo(174.1519, 201.5023, 175.76436, 201.6441, 175.76436, 202.77419);
((GeneralPath)shape).curveTo(175.76436, 203.28162, 175.55676, 203.6968, 175.30305, 203.6968);
((GeneralPath)shape).curveTo(175.04933, 203.6968, 174.84175, 204.00818, 174.84175, 204.38875);
((GeneralPath)shape).curveTo(174.84175, 205.16927, 175.81004, 205.31178, 176.49042, 204.63141);
((GeneralPath)shape).curveTo(176.75198, 204.36984, 177.51335, 204.33447, 178.31255, 204.5467);
((GeneralPath)shape).curveTo(179.57982, 204.88332, 179.70314, 205.10379, 179.91603, 207.41382);
((GeneralPath)shape).curveTo(180.09158, 209.31834, 180.33958, 209.95287, 180.95396, 210.06944);
((GeneralPath)shape).curveTo(181.57489, 210.18723, 181.76123, 209.90863, 181.76123, 208.86252);
((GeneralPath)shape).curveTo(181.76123, 205.91309, 182.27377, 204.61934, 183.44223, 204.61934);
((GeneralPath)shape).curveTo(184.37643, 204.61934, 184.50395, 204.4494, 184.26978, 203.51642);
((GeneralPath)shape).curveTo(184.11754, 202.90982, 184.21347, 202.27718, 184.48314, 202.11055);
((GeneralPath)shape).curveTo(184.7703, 201.93307, 184.9615, 200.19917, 184.94482, 197.92435);
((GeneralPath)shape).curveTo(184.91472, 193.8291, 185.10085, 193.08687, 186.15764, 193.08687);
((GeneralPath)shape).curveTo(186.51599, 193.08687, 187.95587, 192.57976, 189.35736, 191.95995);
((GeneralPath)shape).lineTo(191.90552, 190.83304);
((GeneralPath)shape).lineTo(192.44905, 191.84462);
((GeneralPath)shape).curveTo(192.74799, 192.40102, 193.14288, 193.47897, 193.32655, 194.24011);
((GeneralPath)shape).curveTo(193.61562, 195.43787, 193.67084, 195.31378, 193.7372, 193.3175);
((GeneralPath)shape).curveTo(193.7793, 192.04893, 193.88046, 190.33383, 193.96187, 189.50615);
((GeneralPath)shape).curveTo(194.04327, 188.67847, 193.92278, 187.88568, 193.69424, 187.74438);
((GeneralPath)shape).curveTo(193.46564, 187.60312, 193.40326, 187.28583, 193.55559, 187.03935);
((GeneralPath)shape).curveTo(193.90952, 186.46669, 193.98863, 181.6343, 193.64958, 181.29529);
((GeneralPath)shape).curveTo(193.23781, 180.88351, 193.81892, 179.233, 194.27618, 179.5156);
((GeneralPath)shape).curveTo(194.50519, 179.65714, 194.57312, 179.96617, 194.42715, 180.20236);
((GeneralPath)shape).curveTo(194.28119, 180.43855, 194.52695, 180.63179, 194.97319, 180.63179);
((GeneralPath)shape).curveTo(195.60431, 180.63179, 195.6616, 180.7548, 195.23106, 181.18535);
((GeneralPath)shape).curveTo(194.92548, 181.49095, 194.67752, 182.9595, 194.67752, 184.46379);
((GeneralPath)shape).curveTo(194.67752, 186.75902, 194.79257, 187.14455, 195.4072, 186.90868);
((GeneralPath)shape).curveTo(195.80852, 186.75468, 196.63885, 186.62868, 197.2524, 186.62868);
((GeneralPath)shape).curveTo(198.14236, 186.62868, 198.3679, 186.38937, 198.3679, 185.44511);
((GeneralPath)shape).curveTo(198.3679, 184.13907, 199.11241, 182.47699, 199.69745, 182.47699);
((GeneralPath)shape).curveTo(199.90341, 182.47699, 200.54414, 182.88654, 201.12128, 183.38708);
((GeneralPath)shape).curveTo(201.86365, 184.03093, 202.10544, 184.63821, 201.94778, 185.46292);
((GeneralPath)shape).curveTo(201.76033, 186.44351, 201.89789, 186.62868, 202.81421, 186.62868);
((GeneralPath)shape).curveTo(204.27373, 186.62868, 204.23215, 187.88261, 202.75021, 188.5578);
((GeneralPath)shape).curveTo(201.5794, 189.09125, 201.23676, 190.042, 202.03705, 190.5366);
((GeneralPath)shape).curveTo(202.67288, 190.92958, 204.86723, 190.29759, 204.56499, 189.80856);
((GeneralPath)shape).curveTo(204.42491, 189.58191, 204.53009, 189.39647, 204.79883, 189.39647);
((GeneralPath)shape).curveTo(205.56381, 189.39647, 205.37073, 190.64966, 204.55766, 190.96165);
((GeneralPath)shape).curveTo(204.15636, 191.11566, 203.31285, 191.24165, 202.68324, 191.24165);
((GeneralPath)shape).curveTo(201.66962, 191.24165, 201.55505, 191.41338, 201.68306, 192.74089);
((GeneralPath)shape).curveTo(201.80824, 194.0392, 201.9976, 194.23767, 203.09618, 194.22192);
((GeneralPath)shape).curveTo(204.09494, 194.20772, 204.36476, 194.41609, 204.36476, 195.20218);
((GeneralPath)shape).curveTo(204.36476, 195.9397, 204.00764, 196.27205, 202.99825, 196.47392);
((GeneralPath)shape).curveTo(201.789, 196.71579, 201.643, 196.9215, 201.72966, 198.26147);
((GeneralPath)shape).curveTo(201.84364, 200.02385, 202.2837, 200.45088, 203.99585, 200.46059);
((GeneralPath)shape).curveTo(204.68965, 200.46458, 205.44981, 200.8253, 205.71169, 201.27493);
((GeneralPath)shape).curveTo(205.97264, 201.72295, 206.18813, 201.82559, 206.1959, 201.50557);
((GeneralPath)shape).curveTo(206.2039, 201.18843, 206.41753, 200.92896, 206.67123, 200.92896);
((GeneralPath)shape).curveTo(206.92494, 200.92896, 207.08064, 201.08466, 207.0172, 201.27493);
((GeneralPath)shape).curveTo(206.9538, 201.46521, 207.0575, 201.6728, 207.24785, 201.73624);
((GeneralPath)shape).curveTo(208.31194, 202.09094, 208.554, 201.67534, 208.4617, 199.6525);
((GeneralPath)shape).curveTo(208.3792, 197.84496, 208.57394, 197.22406, 209.55539, 196.16504);
((GeneralPath)shape).curveTo(210.68263, 194.9487, 211.05217, 195.30656, 210.15459, 196.74529);
((GeneralPath)shape).curveTo(209.86497, 197.20949, 210.03984, 197.60246, 210.74417, 198.07011);
((GeneralPath)shape).curveTo(211.2949, 198.4358, 211.74551, 199.12483, 211.74551, 199.60132);
((GeneralPath)shape).curveTo(211.74551, 200.0778, 211.95308, 200.46765, 212.2068, 200.46765);
((GeneralPath)shape).curveTo(212.46051, 200.46765, 212.6681, 200.15627, 212.6681, 199.7757);
((GeneralPath)shape).curveTo(212.6681, 198.71922, 213.90994, 198.95195, 214.20044, 200.06288);
((GeneralPath)shape).curveTo(214.41368, 200.87836, 214.71184, 201.00323, 215.98412, 200.81007);
((GeneralPath)shape).curveTo(218.07303, 200.49289, 219.12628, 201.14017, 219.12628, 202.74104);
((GeneralPath)shape).curveTo(219.12628, 203.46611, 219.42119, 204.1725, 219.7816, 204.31082);
((GeneralPath)shape).curveTo(220.56458, 204.61127, 220.45943, 205.9257, 219.61041, 206.45044);
((GeneralPath)shape).curveTo(219.17099, 206.72202, 219.09267, 207.43527, 219.32318, 209.06602);
((GeneralPath)shape).curveTo(219.87463, 212.96712, 219.83673, 212.92273, 222.61711, 212.92273);
((GeneralPath)shape).curveTo(223.99544, 212.92273, 225.12318, 212.73735, 225.12318, 212.51077);
((GeneralPath)shape).curveTo(225.12318, 212.00674, 223.98123, 211.53882, 222.7511, 211.53882);
((GeneralPath)shape).curveTo(221.98058, 211.53882, 221.86069, 211.27338, 221.98155, 209.83496);
((GeneralPath)shape).curveTo(222.11154, 208.28807, 222.25223, 208.12871, 223.50862, 208.10509);
((GeneralPath)shape).curveTo(224.26976, 208.09079, 225.15201, 207.91112, 225.46915, 207.70587);
((GeneralPath)shape).curveTo(225.78629, 207.50061, 226.04578, 207.50252, 226.04578, 207.70987);
((GeneralPath)shape).curveTo(226.04578, 207.91747, 227.69641, 208.01329, 229.71387, 207.92285);
((GeneralPath)shape).curveTo(232.41518, 207.80173, 233.77126, 207.95255, 234.85902, 208.49524);
((GeneralPath)shape).curveTo(236.02063, 209.07472, 237.85944, 209.23209, 243.46915, 209.23209);
((GeneralPath)shape).curveTo(250.37509, 209.23209, 250.59453, 209.26149, 250.36096, 210.1547);
((GeneralPath)shape).curveTo(250.13466, 211.02007, 250.34676, 211.07729, 253.78136, 211.07729);
((GeneralPath)shape).curveTo(256.61066, 211.07729, 257.50342, 211.23459, 257.7086, 211.76924);
((GeneralPath)shape).curveTo(257.92825, 212.34169, 259.16727, 212.4612, 264.8827, 212.4612);
((GeneralPath)shape).curveTo(270.20355, 212.4612, 271.74753, 212.59372, 271.6009, 213.03781);
((GeneralPath)shape).curveTo(271.48303, 213.39484, 270.3265, 213.66673, 268.56403, 213.75177);
((GeneralPath)shape).curveTo(264.7979, 213.93347, 264.9106, 214.61166, 268.72437, 214.7166);
((GeneralPath)shape).curveTo(271.0551, 214.7807, 271.7923, 214.6402, 272.0028, 214.09155);
((GeneralPath)shape).curveTo(272.1522, 213.70229, 272.56357, 213.38379, 272.91702, 213.38379);
((GeneralPath)shape).curveTo(273.27045, 213.38379, 273.5596, 213.1762, 273.5596, 212.92249);
((GeneralPath)shape).curveTo(273.5596, 212.66876, 273.87097, 212.4612, 274.25156, 212.4612);
((GeneralPath)shape).curveTo(274.63214, 212.4612, 274.94348, 212.66876, 274.94348, 212.92249);
((GeneralPath)shape).curveTo(274.94348, 213.17621, 275.9295, 213.3806, 277.13464, 213.37674);
((GeneralPath)shape).curveTo(278.71942, 213.37173, 279.13434, 213.24591, 278.63388, 212.92249);
((GeneralPath)shape).curveTo(278.03757, 212.53712, 278.04974, 212.47433, 278.7219, 212.46826);
((GeneralPath)shape).curveTo(279.1509, 212.46426, 279.6182, 212.64929, 279.76028, 212.8792);
((GeneralPath)shape).curveTo(279.90237, 213.1091, 280.41016, 213.1948, 280.8887, 213.06964);
((GeneralPath)shape).curveTo(281.36725, 212.9445, 281.89825, 213.06764, 282.06873, 213.3436);
((GeneralPath)shape).curveTo(282.47476, 214.0006, 284.1694, 213.99321, 284.1694, 213.3346);
((GeneralPath)shape).curveTo(284.1694, 213.05249, 284.5053, 212.95285, 284.91995, 213.11195);
((GeneralPath)shape).curveTo(285.35767, 213.2799, 285.90036, 213.08556, 286.222, 212.64583);
((GeneralPath)shape).curveTo(286.72998, 211.95108, 286.89798, 211.95793, 288.35455, 212.73273);
((GeneralPath)shape).curveTo(289.22415, 213.19528, 290.1327, 213.51724, 290.3735, 213.44824);
((GeneralPath)shape).curveTo(290.61435, 213.37924, 293.41672, 213.23802, 296.60104, 213.13445);
((GeneralPath)shape).curveTo(301.83563, 212.96417, 311.4041, 212.20067, 321.9959, 211.10811);
((GeneralPath)shape).curveTo(326.13043, 210.68164, 326.65436, 210.75528, 325.77087, 211.63878);
((GeneralPath)shape).curveTo(325.47064, 211.93901, 325.225, 212.4773, 325.225, 212.83498);
((GeneralPath)shape).curveTo(325.225, 213.19267, 324.21924, 214.5858, 322.98993, 215.93083);
((GeneralPath)shape).curveTo(321.54288, 217.51416, 320.5427, 219.13408, 320.15314, 220.52556);
((GeneralPath)shape).lineTo(319.55142, 222.67476);
((GeneralPath)shape).lineTo(191.08423, 222.52705);
((GeneralPath)shape).curveTo(62.931023, 222.37956, 62.615788, 222.37694, 62.008335, 221.4506);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(116.98259, 213.84528);
((GeneralPath)shape).curveTo(117.34457, 213.84528, 117.64072, 214.15665, 117.64072, 214.53723);
((GeneralPath)shape).curveTo(117.64072, 215.62994, 120.6988, 215.47163, 120.98848, 214.36394);
((GeneralPath)shape).curveTo(121.18174, 213.6249, 120.87003, 213.45728, 118.8511, 213.21469);
((GeneralPath)shape).curveTo(117.55111, 213.05849, 115.55334, 212.93958, 114.41163, 212.95045);
((GeneralPath)shape).lineTo(112.335785, 212.97015);
((GeneralPath)shape).lineTo(114.06566, 213.68767);
((GeneralPath)shape).curveTo(115.01709, 214.08229, 115.819595, 214.64246, 115.84903, 214.93246);
((GeneralPath)shape).curveTo(115.87853, 215.22246, 115.99748, 215.09648, 116.11352, 214.65248);
((GeneralPath)shape).curveTo(116.22953, 214.20847, 116.62062, 213.84518, 116.98259, 213.84518);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(246.08943, 214.81265);
((GeneralPath)shape).curveTo(245.8484, 214.58357, 245.23602, 214.32239, 244.72859, 214.23225);
((GeneralPath)shape).curveTo(244.06895, 214.11508, 243.76482, 213.64215, 243.66145, 212.57294);
((GeneralPath)shape).lineTo(243.5169, 211.07748);
((GeneralPath)shape).lineTo(240.50923, 211.07748);
((GeneralPath)shape).curveTo(238.3057, 211.07748, 237.5542, 211.23166, 237.69836, 211.65411);
((GeneralPath)shape).curveTo(237.80653, 211.97125, 238.60234, 212.23314, 239.46669, 212.23605);
((GeneralPath)shape).curveTo(241.50246, 212.24205, 242.19147, 212.71509, 242.19147, 214.10315);
((GeneralPath)shape).curveTo(242.19147, 215.13725, 242.36845, 215.22917, 244.35957, 215.22917);
((GeneralPath)shape).curveTo(245.66563, 215.22917, 246.35344, 215.06355, 246.08945, 214.81265);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(262.94992, 214.30658);
((GeneralPath)shape).curveTo(262.94992, 214.05287, 262.22336, 213.84529, 261.3354, 213.84529);
((GeneralPath)shape).curveTo(260.4474, 213.84529, 259.72083, 214.05287, 259.72083, 214.30658);
((GeneralPath)shape).curveTo(259.72083, 214.5603, 260.4474, 214.76788, 261.3354, 214.76788);
((GeneralPath)shape).curveTo(262.22336, 214.76788, 262.94992, 214.56029, 262.94992, 214.30658);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(76.677376, 213.753);
((GeneralPath)shape).curveTo(76.24683, 213.32246, 76.0008, 213.32246, 75.57026, 213.753);
((GeneralPath)shape).curveTo(75.13971, 214.18356, 75.262726, 214.30656, 76.12382, 214.30656);
((GeneralPath)shape).curveTo(76.98491, 214.30656, 77.10792, 214.18355, 76.677376, 213.753);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(80.73681, 213.8453);
((GeneralPath)shape).curveTo(80.73681, 213.59158, 80.52922, 213.384, 80.27551, 213.384);
((GeneralPath)shape).curveTo(80.0218, 213.384, 79.81421, 213.59157, 79.81421, 213.8453);
((GeneralPath)shape).curveTo(79.81421, 214.09903, 80.0218, 214.3066, 80.27551, 214.3066);
((GeneralPath)shape).curveTo(80.52922, 214.3066, 80.73681, 214.09903, 80.73681, 213.8453);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(82.58201, 214.1253);
((GeneralPath)shape).curveTo(82.58201, 214.0256, 82.27063, 213.82452, 81.89005, 213.67848);
((GeneralPath)shape).curveTo(81.50948, 213.53244, 81.19811, 213.61407, 81.19811, 213.85979);
((GeneralPath)shape).curveTo(81.19811, 214.10553, 81.50948, 214.3066, 81.89005, 214.3066);
((GeneralPath)shape).curveTo(82.27063, 214.3066, 82.58201, 214.22499, 82.58201, 214.1253);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(184.15428, 205.2268);
((GeneralPath)shape).curveTo(183.82127, 205.09354, 183.42342, 205.10992, 183.27013, 205.26321);
((GeneralPath)shape).curveTo(183.11685, 205.41649, 183.3893, 205.52553, 183.87558, 205.5055);
((GeneralPath)shape).curveTo(184.41296, 205.4834, 184.52226, 205.37405, 184.15428, 205.22678);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(195.00868, 192.28592);
((GeneralPath)shape).curveTo(194.9027, 191.58472, 194.81306, 192.04893, 194.8096, 193.3175);
((GeneralPath)shape).curveTo(194.8056, 194.58607, 194.8928, 195.15979, 195.0024, 194.5924);
((GeneralPath)shape).curveTo(195.1119, 194.02504, 195.11472, 192.9871, 195.00839, 192.2859);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(159.8299, 193.97757);
((GeneralPath)shape).curveTo(159.43445, 193.33774, 159.15765, 193.45705, 159.15765, 194.26733);
((GeneralPath)shape).curveTo(159.15765, 194.66287, 159.3686, 194.85611, 159.62646, 194.69675);
((GeneralPath)shape).curveTo(159.88431, 194.53738, 159.97586, 194.21376, 159.8299, 193.97757);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(194.95636, 189.0601);
((GeneralPath)shape).curveTo(194.80309, 188.90683, 194.69405, 189.17928, 194.71408, 189.66556);
((GeneralPath)shape).curveTo(194.73628, 190.20294, 194.84552, 190.31224, 194.9928, 189.94426);
((GeneralPath)shape).curveTo(195.12605, 189.61125, 195.10966, 189.21338, 194.95639, 189.0601);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(61.93887, 212.59042);
((GeneralPath)shape).curveTo(61.621727, 212.47716, 61.37918, 211.72713, 61.39987, 210.9237);
((GeneralPath)shape).lineTo(61.437523, 209.46292);
((GeneralPath)shape).lineTo(62.115063, 211.01581);
((GeneralPath)shape).curveTo(62.847248, 212.69394, 62.823486, 212.90636, 61.93889, 212.59042);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(147.8558, 197.23851);
((GeneralPath)shape).curveTo(148.01262, 196.9848, 148.45229, 196.7772, 148.83286, 196.7772);
((GeneralPath)shape).curveTo(149.21342, 196.7772, 149.39651, 196.9848, 149.2397, 197.23851);
((GeneralPath)shape).curveTo(149.0829, 197.49222, 148.64323, 197.69981, 148.26265, 197.69981);
((GeneralPath)shape).curveTo(147.88208, 197.69981, 147.699, 197.49222, 147.8558, 197.23851);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(199.9826, 181.55435);
((GeneralPath)shape).curveTo(199.82579, 181.30063, 199.9173, 181.09305, 200.18602, 181.09305);
((GeneralPath)shape).curveTo(200.45471, 181.09305, 200.67455, 181.30063, 200.67455, 181.55435);
((GeneralPath)shape).curveTo(200.67455, 181.80806, 200.58304, 182.01564, 200.47113, 182.01564);
((GeneralPath)shape).curveTo(200.35925, 182.01564, 200.1394, 181.80806, 199.9826, 181.55435);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(193.79147, 176.28784);
((GeneralPath)shape).curveTo(193.77147, 175.80156, 193.88048, 175.5291, 194.03377, 175.68239);
((GeneralPath)shape).curveTo(194.18704, 175.8357, 194.20343, 176.23355, 194.07018, 176.56656);
((GeneralPath)shape).curveTo(193.92293, 176.93456, 193.8136, 176.82526, 193.79149, 176.28784);
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
        return  Math.round(157 * GraphicsEngine.getScaleFactor());
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

