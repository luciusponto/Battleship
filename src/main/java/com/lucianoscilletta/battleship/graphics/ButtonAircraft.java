package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class ButtonAircraft implements GameGraphics {
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
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(66.87966, 96.29369);
((GeneralPath)shape).curveTo(66.782234, 96.12666, 66.464615, 94.367386, 66.17385, 92.384186);
((GeneralPath)shape).curveTo(65.6888, 89.075806, 65.52609, 88.66736, 64.20133, 87.43266);
((GeneralPath)shape).curveTo(63.40721, 86.692535, 62.428226, 85.97641, 62.025814, 85.84129);
((GeneralPath)shape).curveTo(61.485725, 85.65994, 61.326694, 85.26012, 61.41845, 84.31427);
((GeneralPath)shape).curveTo(61.51562, 83.31259, 61.852062, 82.8784, 62.95993, 82.32496);
((GeneralPath)shape).curveTo(64.25823, 81.67639, 66.27075, 81.61695, 86.950775, 81.61637);
((GeneralPath)shape).curveTo(99.36629, 81.61603, 109.524445, 81.492355, 109.524445, 81.34155);
((GeneralPath)shape).curveTo(109.524445, 81.19074, 108.93227, 80.570786, 108.208496, 79.96387);
((GeneralPath)shape).curveTo(107.48472, 79.35695, 107.01983, 78.73051, 107.175385, 78.57178);
((GeneralPath)shape).curveTo(107.330956, 78.41305, 108.14686, 78.85079, 108.9885, 79.54455);
((GeneralPath)shape).curveTo(110.3414, 80.65972, 110.81313, 80.80593, 113.05841, 80.80593);
((GeneralPath)shape).curveTo(114.48158, 80.80593, 115.59807, 80.98393, 115.59807, 81.21084);
((GeneralPath)shape).curveTo(115.59807, 81.43354, 116.41801, 81.615746, 117.42016, 81.615746);
((GeneralPath)shape).curveTo(118.42231, 81.615746, 119.24224, 81.47909, 119.24224, 81.312065);
((GeneralPath)shape).curveTo(119.24223, 81.14504, 118.591934, 80.48951, 117.79712, 79.85533);
((GeneralPath)shape).curveTo(115.77146, 78.23905, 116.432106, 77.965805, 118.60052, 79.52304);
((GeneralPath)shape).curveTo(120.13836, 80.62743, 120.729805, 80.80592, 122.851395, 80.80592);
((GeneralPath)shape).curveTo(124.7721, 80.80592, 125.31589, 80.93993, 125.31589, 81.413284);
((GeneralPath)shape).curveTo(125.31589, 81.92317, 126.193184, 82.020645, 130.78215, 82.020645);
((GeneralPath)shape).lineTo(136.24841, 82.020645);
((GeneralPath)shape).lineTo(136.24841, 73.72002);
((GeneralPath)shape).curveTo(136.24841, 69.15467, 136.40524, 65.41939, 136.59692, 65.41939);
((GeneralPath)shape).curveTo(137.07735, 65.41939, 137.42027, 68.572075, 137.73103, 75.845795);
((GeneralPath)shape).curveTo(137.97176, 81.48051, 138.06013, 82.02065, 138.74126, 82.02065);
((GeneralPath)shape).curveTo(139.2675, 82.02065, 139.48767, 81.72205, 139.48767, 81.00838);
((GeneralPath)shape).curveTo(139.48767, 80.187485, 139.68724, 79.9961, 140.54326, 79.9961);
((GeneralPath)shape).curveTo(141.33876, 79.9961, 141.53839, 79.83854, 141.35349, 79.35665);
((GeneralPath)shape).curveTo(141.15129, 78.82976, 141.32188, 78.76415, 142.32242, 78.98392);
((GeneralPath)shape).curveTo(143.08635, 79.1517, 143.53674, 79.08851, 143.53674, 78.813545);
((GeneralPath)shape).curveTo(143.53674, 78.57315, 143.81006, 78.376465, 144.1441, 78.376465);
((GeneralPath)shape).curveTo(144.48154, 78.376465, 144.75148, 78.73638, 144.75148, 79.18628);
((GeneralPath)shape).curveTo(144.75148, 79.72616, 145.02142, 79.99609, 145.5613, 79.99609);
((GeneralPath)shape).curveTo(146.10118, 79.99609, 146.37111, 80.26604, 146.37111, 80.80591);
((GeneralPath)shape).curveTo(146.37111, 81.49575, 146.64105, 81.61572, 148.19319, 81.61572);
((GeneralPath)shape).curveTo(149.86682, 81.61572, 150.01527, 81.53324, 150.01527, 80.60345);
((GeneralPath)shape).curveTo(150.01527, 79.853874, 150.23004, 79.59117, 150.84285, 79.59117);
((GeneralPath)shape).curveTo(151.4064, 79.59117, 151.63248, 79.365105, 151.55145, 78.88258);
((GeneralPath)shape).curveTo(151.46866, 78.38975, 151.69872, 78.173996, 152.30693, 78.173996);
((GeneralPath)shape).curveTo(152.78789, 78.173996, 153.31932, 78.03734, 153.48792, 77.870316);
((GeneralPath)shape).curveTo(154.07501, 77.288666, 154.46928, 77.57334, 154.46928, 78.5789);
((GeneralPath)shape).curveTo(154.46928, 79.5087, 154.61775, 79.59118, 156.29137, 79.59118);
((GeneralPath)shape).curveTo(158.21565, 79.59118, 158.69212, 78.955864, 157.5061, 77.97154);
((GeneralPath)shape).curveTo(157.17206, 77.694305, 156.89874, 77.12537, 156.89874, 76.70724);
((GeneralPath)shape).curveTo(156.89874, 76.2891, 157.17206, 75.947, 157.5061, 75.947);
((GeneralPath)shape).curveTo(157.98216, 75.947, 158.11346, 75.391594, 158.11346, 73.377846);
((GeneralPath)shape).curveTo(158.11346, 71.2892, 158.27113, 70.66601, 158.95648, 70.04578);
((GeneralPath)shape).curveTo(159.74843, 69.32909, 159.82324, 69.32529, 160.19133, 69.98302);
((GeneralPath)shape).curveTo(160.71445, 70.91776, 161.6348, 70.8689, 162.25652, 69.87337);
((GeneralPath)shape).curveTo(162.63297, 69.27058, 163.20078, 69.06355, 164.4776, 69.06355);
((GeneralPath)shape).curveTo(166.6687, 69.06355, 167.6159, 67.89704, 167.044, 65.90296);
((GeneralPath)shape).curveTo(166.72963, 64.8068, 166.79498, 64.54255, 167.4697, 64.18146);
((GeneralPath)shape).curveTo(168.83636, 63.45004, 169.8558, 64.07709, 169.8558, 65.64912);
((GeneralPath)shape).curveTo(169.8558, 66.61464, 169.67036, 67.03901, 169.24844, 67.03901);
((GeneralPath)shape).curveTo(168.56763, 67.03901, 168.42041, 68.069565, 169.04599, 68.45619);
((GeneralPath)shape).curveTo(169.26869, 68.59383, 169.4509, 69.060104, 169.4509, 69.49236);
((GeneralPath)shape).curveTo(169.4509, 70.13933, 169.73726, 70.27828, 171.07054, 70.27828);
((GeneralPath)shape).lineTo(172.69017, 70.27828);
((GeneralPath)shape).lineTo(172.69017, 67.84883);
((GeneralPath)shape).curveTo(172.69017, 65.8229, 172.57248, 65.411575, 171.98158, 65.372406);
((GeneralPath)shape).curveTo(171.30673, 65.327675, 171.30673, 65.31661, 171.98158, 65.14026);
((GeneralPath)shape).curveTo(172.84583, 64.91441, 172.93, 63.79974, 172.08281, 63.79974);
((GeneralPath)shape).curveTo(171.64417, 63.79974, 171.47545, 63.349842, 171.47545, 62.180103);
((GeneralPath)shape).curveTo(171.47545, 61.010365, 171.64417, 60.560467, 172.08281, 60.560467);
((GeneralPath)shape).curveTo(172.81752, 60.560467, 172.90285, 58.91057, 172.20428, 58.211994);
((GeneralPath)shape).curveTo(171.82637, 57.83408, 171.82637, 57.618126, 172.20428, 57.24021);
((GeneralPath)shape).curveTo(172.91655, 56.527935, 172.79985, 55.29665, 172.02005, 55.29665);
((GeneralPath)shape).curveTo(171.40718, 55.29665, 171.4098, 55.23049, 172.05075, 54.522305);
((GeneralPath)shape).curveTo(172.43839, 54.09398, 172.71056, 53.234535, 172.65982, 52.598988);
((GeneralPath)shape).curveTo(172.44965, 49.965992, 172.69801, 47.53849, 173.16173, 47.69307);
((GeneralPath)shape).curveTo(173.4703, 47.79593, 173.61563, 48.88691, 173.58224, 50.850227);
((GeneralPath)shape).curveTo(173.54405, 53.098625, 173.69524, 54.031403, 174.18576, 54.573433);
((GeneralPath)shape).curveTo(174.7891, 55.24011, 174.78787, 55.296654, 174.17017, 55.296654);
((GeneralPath)shape).curveTo(173.39038, 55.296654, 173.27365, 56.52794, 173.98593, 57.240215);
((GeneralPath)shape).curveTo(174.36385, 57.61813, 174.36385, 57.834084, 173.98593, 58.211998);
((GeneralPath)shape).curveTo(173.17113, 59.026806, 173.38266, 60.56047, 174.30986, 60.56047);
((GeneralPath)shape).curveTo(174.93973, 60.56047, 175.11967, 60.83041, 175.11967, 61.775196);
((GeneralPath)shape).curveTo(175.11967, 62.443295, 175.30188, 62.98992, 175.52458, 62.98992);
((GeneralPath)shape).curveTo(175.74728, 62.98992, 175.92949, 63.17213, 175.92949, 63.39483);
((GeneralPath)shape).curveTo(175.92949, 63.617527, 175.38286, 63.799736, 174.71477, 63.799736);
((GeneralPath)shape).curveTo(173.44461, 63.799736, 173.06326, 64.46736, 174.10507, 64.86714);
((GeneralPath)shape).curveTo(174.43784, 64.994835, 174.61722, 65.24961, 174.5037, 65.43331);
((GeneralPath)shape).curveTo(174.39017, 65.617004, 174.84673, 66.69919, 175.51828, 67.83815);
((GeneralPath)shape).curveTo(176.18983, 68.97712, 176.74484, 70.128746, 176.75162, 70.39732);
((GeneralPath)shape).curveTo(176.75761, 70.66589, 176.9429, 70.5788, 177.16168, 70.20377);
((GeneralPath)shape).curveTo(177.6082, 69.43832, 177.5172, 66.96272, 177.02927, 66.60172);
((GeneralPath)shape).curveTo(176.2649, 66.036194, 177.27902, 65.01446, 178.6047, 65.01446);
((GeneralPath)shape).curveTo(179.55597, 65.01446, 179.97856, 64.82764, 179.97856, 64.4071);
((GeneralPath)shape).curveTo(179.97856, 64.073044, 180.25188, 63.799732, 180.58594, 63.799732);
((GeneralPath)shape).curveTo(180.91998, 63.799732, 181.1933, 63.98194, 181.1933, 64.20464);
((GeneralPath)shape).curveTo(181.1933, 64.7327, 184.30865, 64.7327, 184.63503, 64.20464);
((GeneralPath)shape).curveTo(185.01323, 63.592686, 185.6473, 63.719494, 185.6473, 64.4071);
((GeneralPath)shape).curveTo(185.6473, 64.74114, 185.97527, 65.01446, 186.37613, 65.01446);
((GeneralPath)shape).curveTo(187.57817, 65.01446, 188.07675, 65.87682, 188.07675, 67.95594);
((GeneralPath)shape).curveTo(188.07675, 69.65468, 188.24667, 70.06863, 189.31197, 70.965004);
((GeneralPath)shape).curveTo(190.33495, 71.82579, 190.50334, 72.20392, 190.29207, 73.16586);
((GeneralPath)shape).curveTo(190.14235, 73.847534, 190.20627, 74.32736, 190.44675, 74.32736);
((GeneralPath)shape).curveTo(190.96376, 74.32736, 191.45248, 72.85118, 191.11581, 72.30644);
((GeneralPath)shape).curveTo(190.5834, 71.44499, 191.70134, 71.9477, 192.45842, 72.91018);
((GeneralPath)shape).curveTo(194.02617, 74.90325, 194.27051, 74.28931, 193.94904, 69.16477);
((GeneralPath)shape).curveTo(193.54779, 62.76865, 193.54514, 60.762913, 193.93794, 60.762913);
((GeneralPath)shape).curveTo(194.29541, 60.762913, 194.29657, 60.775143, 194.7669, 69.56968);
((GeneralPath)shape).curveTo(195.02377, 74.37278, 195.20137, 75.54208, 195.67395, 75.54208);
((GeneralPath)shape).curveTo(196.02995, 75.54208, 196.16974, 75.302666, 196.02853, 74.93472);
((GeneralPath)shape).curveTo(195.73517, 74.17025, 195.84244, 74.174706, 198.46521, 75.03595);
((GeneralPath)shape).curveTo(200.17853, 75.59856, 200.6237, 75.92331, 200.62604, 76.61227);
((GeneralPath)shape).curveTo(200.62804, 77.089516, 200.35565, 77.58487, 200.02162, 77.71306);
((GeneralPath)shape).curveTo(199.60538, 77.87278, 199.41425, 78.52351, 199.41425, 79.78092);
((GeneralPath)shape).lineTo(199.41422, 81.615715);
((GeneralPath)shape).lineTo(201.84367, 81.615715);
((GeneralPath)shape).curveTo(203.97856, 81.615715, 204.27312, 81.520424, 204.27312, 80.829796);
((GeneralPath)shape).curveTo(204.27312, 80.39754, 204.45534, 79.93126, 204.67802, 79.793625);
((GeneralPath)shape).curveTo(204.92056, 79.64373, 205.08293, 76.95506, 205.08293, 73.08873);
((GeneralPath)shape).curveTo(205.08293, 69.05557, 205.23485, 66.63409, 205.48784, 66.63409);
((GeneralPath)shape).curveTo(205.73917, 66.63409, 205.89275, 68.861084, 205.89275, 72.505264);
((GeneralPath)shape).curveTo(205.89275, 77.45415, 205.98814, 78.37644, 206.5001, 78.37644);
((GeneralPath)shape).curveTo(206.83417, 78.37644, 207.10747, 78.537964, 207.10747, 78.735374);
((GeneralPath)shape).curveTo(207.10747, 78.932785, 207.92741, 79.21726, 208.92955, 79.367546);
((GeneralPath)shape).curveTo(210.51628, 79.60549, 210.75163, 79.76834, 210.75163, 80.62824);
((GeneralPath)shape).lineTo(210.75163, 81.61571);
((GeneralPath)shape).lineTo(224.38857, 81.61571);
((GeneralPath)shape).curveTo(234.0748, 81.61571, 238.41977, 81.47313, 239.38647, 81.123566);
((GeneralPath)shape).curveTo(240.40729, 80.75443, 240.93094, 80.74601, 241.48152, 81.089836);
((GeneralPath)shape).curveTo(242.16762, 81.51831, 242.2327, 81.26854, 242.47751, 77.26744);
((GeneralPath)shape).curveTo(242.62157, 74.91299, 242.73943, 71.6484, 242.73943, 70.01279);
((GeneralPath)shape).lineTo(242.73943, 67.038956);
((GeneralPath)shape).lineTo(243.85292, 67.08592);
((GeneralPath)shape).curveTo(244.538, 67.11483, 244.69379, 67.20414, 244.25783, 67.31807);
((GeneralPath)shape).curveTo(243.61717, 67.48549, 243.54924, 68.17973, 243.54924, 74.559456);
((GeneralPath)shape).lineTo(243.54924, 81.61568);
((GeneralPath)shape).lineTo(248.00874, 81.61568);
((GeneralPath)shape).curveTo(250.8065, 81.61568, 252.76187, 81.4323, 253.25626, 81.123535);
((GeneralPath)shape).curveTo(253.87474, 80.73729, 254.33714, 80.73729, 255.40529, 81.123535);
((GeneralPath)shape).curveTo(256.33215, 81.45869, 259.88928, 81.61568, 266.55658, 81.61568);
((GeneralPath)shape).lineTo(276.34686, 81.61568);
((GeneralPath)shape).lineTo(276.34686, 73.92241);
((GeneralPath)shape).curveTo(276.34686, 69.69111, 276.4992, 66.22914, 276.68542, 66.22914);
((GeneralPath)shape).curveTo(276.87164, 66.22914, 277.2659, 69.69111, 277.5616, 73.92241);
((GeneralPath)shape).lineTo(278.0992, 81.61568);
((GeneralPath)shape).lineTo(282.38565, 81.59066);
((GeneralPath)shape).curveTo(289.84222, 81.54711, 292.33713, 81.154854, 293.74664, 79.80444);
((GeneralPath)shape).curveTo(295.27795, 78.33737, 295.36804, 78.92182, 293.8592, 80.53455);
((GeneralPath)shape).lineTo(292.7457, 81.724724);
((GeneralPath)shape).lineTo(295.94482, 81.46776);
((GeneralPath)shape).curveTo(297.70435, 81.32642, 299.65677, 81.21079, 300.2835, 81.21079);
((GeneralPath)shape).curveTo(300.98074, 81.21079, 301.9786, 80.723015, 302.85434, 79.95412);
((GeneralPath)shape).curveTo(304.63895, 78.3872, 304.73297, 78.88859, 302.99146, 80.68537);
((GeneralPath)shape).lineTo(301.6973, 82.02061);
((GeneralPath)shape).lineTo(311.5829, 82.02061);
((GeneralPath)shape).curveTo(321.0945, 82.02061, 330.02588, 82.68654, 334.04642, 83.69551);
((GeneralPath)shape).curveTo(336.02527, 84.192116, 338.19083, 85.93386, 337.58395, 86.54074);
((GeneralPath)shape).curveTo(337.35458, 86.77011, 336.19296, 87.07682, 335.00256, 87.22232);
((GeneralPath)shape).lineTo(332.8382, 87.48688);
((GeneralPath)shape).lineTo(330.48138, 92.0421);
((GeneralPath)shape).lineTo(328.12457, 96.59733);
((GeneralPath)shape).lineTo(197.5907, 96.59733);
((GeneralPath)shape).curveTo(125.79708, 96.59733, 66.97711, 96.460655, 66.879684, 96.29364);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(153.6595, 79.18629);
((GeneralPath)shape).curveTo(153.6595, 78.963585, 153.38618, 78.78138, 153.05214, 78.78138);
((GeneralPath)shape).curveTo(152.7181, 78.78138, 152.44478, 78.963585, 152.44478, 79.18629);
((GeneralPath)shape).curveTo(152.44478, 79.40899, 152.7181, 79.591194, 153.05214, 79.591194);
((GeneralPath)shape).curveTo(153.38618, 79.591194, 153.6595, 79.40899, 153.6595, 79.18629);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(189.29147, 73.92247);
((GeneralPath)shape).curveTo(189.29147, 73.69977, 189.01816, 73.51756, 188.68411, 73.51756);
((GeneralPath)shape).curveTo(188.35007, 73.51756, 188.07674, 73.69977, 188.07674, 73.92247);
((GeneralPath)shape).curveTo(188.07674, 74.14517, 188.35005, 74.32738, 188.68411, 74.32738);
((GeneralPath)shape).curveTo(189.01816, 74.32738, 189.29147, 74.14517, 189.29147, 73.92247);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(174.51231, 70.6832);
((GeneralPath)shape).curveTo(174.37468, 70.460495, 174.43982, 70.27829, 174.65714, 70.27829);
((GeneralPath)shape).curveTo(174.87442, 70.27829, 175.13354, 70.50605, 175.23296, 70.784424);
((GeneralPath)shape).curveTo(175.33235, 71.0628, 175.51958, 71.19446, 175.64897, 71.077);
((GeneralPath)shape).curveTo(175.77835, 70.95955, 175.35089, 69.957405, 174.69904, 68.850006);
((GeneralPath)shape).lineTo(173.51384, 66.836555);
((GeneralPath)shape).lineTo(173.50684, 68.962326);
((GeneralPath)shape).curveTo(173.50084, 70.62068, 173.63873, 71.0881, 174.1312, 71.0881);
((GeneralPath)shape).curveTo(174.47838, 71.0881, 174.64984, 70.90589, 174.5122, 70.68319);
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

