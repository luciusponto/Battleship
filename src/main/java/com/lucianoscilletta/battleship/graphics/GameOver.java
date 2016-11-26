package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class GameOver implements GameGraphics {
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
atScale.scale(scaleFactor, scaleFactor);
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
((GeneralPath)shape).moveTo(195.11023, 177.86937);
((GeneralPath)shape).curveTo(189.44383, 178.0755, 183.7332, 177.85397, 178.06294, 177.6024);
((GeneralPath)shape).curveTo(177.34084, 177.5703, 179.50836, 177.62671, 180.23108, 177.6389);
((GeneralPath)shape).curveTo(177.54199, 177.87923, 174.724, 177.6782, 172.12758, 178.57764);
((GeneralPath)shape).curveTo(170.06915, 179.29076, 166.12283, 181.33963, 164.3989, 182.15204);
((GeneralPath)shape).curveTo(162.56305, 183.01718, 160.71014, 183.84569, 158.86577, 184.6925);
((GeneralPath)shape).curveTo(151.34142, 188.00748, 143.89688, 191.66916, 136.86046, 195.94113);
((GeneralPath)shape).curveTo(133.57243, 197.93738, 130.46031, 200.2099, 127.25352, 202.33417);
((GeneralPath)shape).curveTo(123.50371, 204.61862, 119.56965, 206.6229, 116.0384, 209.25116);
((GeneralPath)shape).curveTo(113.7714, 212.12901, 111.46986, 214.97423, 109.54901, 218.1037);
((GeneralPath)shape).curveTo(108.02525, 221.66087, 106.3425, 225.11244, 106.09202, 229.012);
((GeneralPath)shape).curveTo(105.8349, 230.53438, 105.935555, 232.14427, 105.60575, 233.65784);
((GeneralPath)shape).curveTo(105.55165, 233.9063, 105.66995, 232.99284, 105.59485, 232.04063);
((GeneralPath)shape).curveTo(106.22228, 231.35403, 105.45308, 232.02783, 106.83986, 232.84616);
((GeneralPath)shape).curveTo(107.04686, 232.96832, 107.34374, 232.70879, 107.560165, 232.81335);
((GeneralPath)shape).curveTo(109.40961, 233.70659, 111.145546, 235.541, 112.67779, 236.86917);
((GeneralPath)shape).curveTo(113.657555, 238.01987, 114.018875, 237.69945, 115.16366, 238.01201);
((GeneralPath)shape).curveTo(115.65837, 238.14708, 116.104706, 238.43475, 116.603455, 238.55403);
((GeneralPath)shape).curveTo(117.63783, 238.80144, 118.727684, 238.66454, 119.79005, 238.71475);
((GeneralPath)shape).curveTo(123.752464, 238.88101, 127.724045, 238.79515, 131.68703, 238.95213);
((GeneralPath)shape).curveTo(132.36223, 238.97884, 130.33562, 238.93983, 129.65991, 238.93364);
((GeneralPath)shape).curveTo(130.5291, 238.96104, 131.39828, 238.98843, 132.26747, 239.01584);
((GeneralPath)shape).curveTo(130.65082, 239.18982, 135.69408, 238.82343, 135.234, 239.60916);
((GeneralPath)shape).curveTo(135.03606, 239.9472, 134.2525, 240.05653, 134.38744, 240.42429);
((GeneralPath)shape).curveTo(134.40593, 240.47469, 136.02284, 239.06573, 136.05771, 239.03569);
((GeneralPath)shape).curveTo(139.53523, 235.41559, 144.14368, 233.42813, 148.56082, 231.24754);
((GeneralPath)shape).curveTo(152.17793, 229.20284, 156.2073, 228.08377, 159.82585, 226.05832);
((GeneralPath)shape).curveTo(162.32751, 224.68343, 164.44948, 222.70882, 166.64227, 220.89792);
((GeneralPath)shape).curveTo(170.49257, 218.15092, 174.10315, 215.1114, 177.84502, 212.22903);
((GeneralPath)shape).curveTo(186.25784, 206.19301, 182.25949, 209.28055, 195.78638, 220.96454);
((GeneralPath)shape).curveTo(195.51683, 221.32098, 195.19965, 221.64597, 194.97775, 222.03387);
((GeneralPath)shape).curveTo(194.28778, 223.24007, 193.97339, 224.62648, 193.40636, 225.89511);
((GeneralPath)shape).curveTo(191.86406, 229.3458, 190.5469, 232.71812, 189.37439, 236.31642);
((GeneralPath)shape).curveTo(187.59303, 244.3367, 185.43002, 252.3071, 182.33974, 259.92627);
((GeneralPath)shape).curveTo(181.69383, 261.046, 181.04791, 262.16574, 180.40202, 263.2855);
((GeneralPath)shape).curveTo(179.81818, 264.52905, 162.2314, 256.2724, 162.81523, 255.02882);
((GeneralPath)shape).lineTo(162.81523, 255.02882);
((GeneralPath)shape).curveTo(163.04573, 254.62685, 163.27625, 254.22487, 163.50676, 253.8229);
((GeneralPath)shape).curveTo(164.63345, 250.74448, 165.15155, 247.5681, 165.91454, 244.38174);
((GeneralPath)shape).curveTo(166.98654, 239.90477, 168.22447, 235.46722, 169.2689, 230.98326);
((GeneralPath)shape).curveTo(169.79019, 229.32259, 170.21477, 227.62839, 170.83281, 226.00124);
((GeneralPath)shape).curveTo(172.50298, 221.6041, 174.79732, 217.6527, 177.5324, 213.85638);
((GeneralPath)shape).curveTo(178.35628, 212.71284, 179.11017, 211.51152, 180.0373, 210.44998);
((GeneralPath)shape).curveTo(180.5953, 209.81107, 181.32028, 209.33987, 181.96178, 208.78484);
((GeneralPath)shape).curveTo(187.12001, 212.11667, 192.3588, 215.327, 197.4365, 218.78035);
((GeneralPath)shape).curveTo(197.59949, 218.8912, 196.95116, 219.89435, 196.19797, 220.94888);
((GeneralPath)shape).curveTo(194.8809, 222.7929, 193.26863, 224.29228, 191.60748, 225.8257);
((GeneralPath)shape).curveTo(190.38297, 226.71559, 189.06949, 227.48386, 187.8828, 228.42361);
((GeneralPath)shape).curveTo(185.46812, 230.33586, 183.26532, 232.66226, 180.38564, 233.90993);
((GeneralPath)shape).curveTo(173.7355, 239.03325, 181.0006, 233.68517, 177.37892, 235.90732);
((GeneralPath)shape).curveTo(175.29224, 237.18765, 173.83084, 239.39973, 171.56834, 240.46123);
((GeneralPath)shape).curveTo(169.95894, 241.38417, 168.55507, 242.54341, 166.98131, 243.52739);
((GeneralPath)shape).curveTo(164.7609, 244.91566, 162.323, 245.8745, 159.99818, 247.06262);
((GeneralPath)shape).curveTo(159.20607, 247.43051, 155.77287, 249.04184, 154.91049, 249.3778);
((GeneralPath)shape).curveTo(154.27672, 249.6247, 152.4482, 250.19073, 151.60962, 250.3354);
((GeneralPath)shape).curveTo(151.39297, 250.3728, 151.14088, 250.2467, 150.95042, 250.3565);
((GeneralPath)shape).curveTo(150.44574, 250.64754, 150.06075, 251.10889, 149.61589, 251.48509);
((GeneralPath)shape).curveTo(145.8845, 254.43723, 142.9146, 257.31738, 137.86327, 257.7473);
((GeneralPath)shape).curveTo(129.15912, 258.7453, 120.071686, 258.55685, 111.59382, 256.21268);
((GeneralPath)shape).curveTo(106.96464, 254.53477, 102.32789, 252.8116, 98.52849, 249.5581);
((GeneralPath)shape).curveTo(95.216675, 246.86186, 91.73218, 244.28891, 89.45974, 240.58203);
((GeneralPath)shape).curveTo(89.05103, 239.73293, 88.58462, 238.90924, 88.23359, 238.03471);
((GeneralPath)shape).curveTo(87.03652, 235.0523, 87.1534, 231.76414, 86.98848, 228.61594);
((GeneralPath)shape).curveTo(87.04528, 222.02345, 88.65953, 216.30191, 91.89721, 210.5498);
((GeneralPath)shape).curveTo(93.90821, 206.40544, 95.3145, 204.59769, 98.50601, 201.38141);
((GeneralPath)shape).curveTo(100.04086, 199.83466, 99.12889, 200.25188, 100.334854, 199.83437);
((GeneralPath)shape).curveTo(103.473656, 194.709, 107.65451, 190.32262, 112.25777, 186.47766);
((GeneralPath)shape).curveTo(117.418564, 182.78825, 122.455215, 178.81949, 127.86877, 175.50092);
((GeneralPath)shape).curveTo(133.89786, 171.805, 140.32591, 168.85709, 146.86116, 166.18533);
((GeneralPath)shape).curveTo(155.84618, 162.98369, 164.89134, 159.55682, 174.41202, 158.3826);
((GeneralPath)shape).curveTo(183.57205, 158.06631, 192.98593, 157.7098, 201.8432, 160.53728);
((GeneralPath)shape).curveTo(203.06877, 161.01337, 196.33583, 178.34564, 195.11024, 177.86955);
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
((GeneralPath)shape).moveTo(198.17023, 251.4834);
((GeneralPath)shape).curveTo(197.09436, 241.38376, 199.15524, 231.37273, 201.09947, 221.5135);
((GeneralPath)shape).curveTo(203.74911, 209.4859, 209.11867, 198.54706, 215.34273, 188.02487);
((GeneralPath)shape).curveTo(216.55315, 185.76485, 218.17087, 183.62369, 218.87086, 181.11499);
((GeneralPath)shape).curveTo(219.31964, 179.50668, 219.41982, 177.81708, 219.82898, 176.19826);
((GeneralPath)shape).curveTo(220.14494, 174.94818, 220.55486, 173.72374, 220.9178, 172.48648);
((GeneralPath)shape).curveTo(222.3362, 168.81725, 223.93834, 165.15855, 226.39644, 162.04903);
((GeneralPath)shape).curveTo(226.97334, 161.31924, 227.49353, 160.51898, 228.21599, 159.93294);
((GeneralPath)shape).curveTo(229.69449, 158.73364, 231.37054, 157.80084, 232.94781, 156.7348);
((GeneralPath)shape).curveTo(236.66751, 157.20857, 240.57559, 156.89497, 244.10689, 158.15613);
((GeneralPath)shape).curveTo(245.9803, 158.8252, 251.10551, 165.20787, 252.33096, 166.72661);
((GeneralPath)shape).curveTo(258.23898, 174.0485, 263.34998, 181.80821, 268.48428, 189.68292);
((GeneralPath)shape).curveTo(276.85812, 203.86893, 283.59964, 219.15149, 287.126, 235.3003);
((GeneralPath)shape).curveTo(288.81473, 243.03368, 288.67764, 245.41643, 289.13074, 253.0505);
((GeneralPath)shape).curveTo(288.14902, 261.2742, 289.07245, 257.48474, 286.63574, 264.4824);
((GeneralPath)shape).curveTo(286.35226, 265.8533, 266.96466, 261.84442, 267.24814, 260.47348);
((GeneralPath)shape).lineTo(267.24814, 260.47348);
((GeneralPath)shape).curveTo(266.78848, 258.0591, 267.0969, 259.71854, 266.37494, 255.48573);
((GeneralPath)shape).curveTo(265.92712, 253.4646, 265.59888, 251.41318, 265.03143, 249.4223);
((GeneralPath)shape).curveTo(264.27853, 246.78072, 263.31345, 244.20407, 262.4192, 241.60692);
((GeneralPath)shape).curveTo(257.59283, 227.58992, 251.87357, 213.90073, 245.37318, 200.57465);
((GeneralPath)shape).curveTo(240.28383, 190.55727, 241.04922, 192.3401, 236.70198, 182.81502);
((GeneralPath)shape).curveTo(235.79787, 180.83403, 234.95273, 178.82646, 234.0474, 176.84604);
((GeneralPath)shape).curveTo(233.55458, 175.76802, 232.8276, 174.78198, 232.50797, 173.64058);
((GeneralPath)shape).curveTo(232.45076, 173.43646, 232.87776, 173.4333, 233.06265, 173.32965);
((GeneralPath)shape).curveTo(235.73264, 173.29655, 238.4026, 173.26355, 241.07259, 173.23045);
((GeneralPath)shape).curveTo(241.84769, 172.36551, 242.6382, 171.51411, 243.39792, 170.6356);
((GeneralPath)shape).curveTo(243.44162, 170.585, 243.2615, 170.6829, 243.22643, 170.73984);
((GeneralPath)shape).curveTo(242.93245, 171.217, 242.6995, 171.72926, 242.42358, 172.21707);
((GeneralPath)shape).curveTo(241.44594, 173.9456, 241.57649, 173.45827, 240.717, 175.5267);
((GeneralPath)shape).curveTo(240.42099, 176.23907, 240.17761, 176.97218, 239.9079, 177.69492);
((GeneralPath)shape).curveTo(237.52473, 183.66464, 237.29797, 190.34349, 234.60666, 196.24208);
((GeneralPath)shape).curveTo(228.21141, 210.2999, 237.31645, 190.49316, 230.36539, 204.91302);
((GeneralPath)shape).curveTo(227.1781, 211.52496, 224.8984, 218.5968, 222.77017, 225.60051);
((GeneralPath)shape).curveTo(221.42258, 230.85954, 220.0908, 236.1164, 218.97603, 241.43098);
((GeneralPath)shape).curveTo(218.4224, 244.07039, 218.04169, 246.74643, 217.41632, 249.36977);
((GeneralPath)shape).curveTo(217.24509, 250.08807, 216.97409, 250.77887, 216.75298, 251.48341);
((GeneralPath)shape).curveTo(216.75298, 252.79741, 198.17027, 252.79741, 198.17027, 251.48341);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(223.1999, 216.38712);
((GeneralPath)shape).curveTo(224.8784, 215.70067, 226.51974, 214.9153, 228.23537, 214.32779);
((GeneralPath)shape).curveTo(242.93811, 209.29301, 259.2187, 206.27065, 274.60165, 204.39227);
((GeneralPath)shape).curveTo(278.72397, 203.8889, 282.8723, 203.62834, 287.00763, 203.24637);
((GeneralPath)shape).curveTo(290.17487, 203.13438, 293.34213, 203.02238, 296.50937, 202.91039);
((GeneralPath)shape).curveTo(298.11737, 202.27068, 307.16434, 225.01117, 305.55634, 225.6509);
((GeneralPath)shape).lineTo(305.55634, 225.6509);
((GeneralPath)shape).curveTo(302.5344, 226.48418, 299.51242, 227.31747, 296.4905, 228.15076);
((GeneralPath)shape).curveTo(282.015, 230.7359, 286.33084, 230.18477, 271.00412, 231.96565);
((GeneralPath)shape).curveTo(257.72003, 233.50919, 244.3201, 234.95271, 230.93614, 233.84456);
((GeneralPath)shape).curveTo(229.7017, 234.3916, 221.96548, 216.93413, 223.19992, 216.3871);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(303.31723, 255.4123);
((GeneralPath)shape).curveTo(303.28262, 250.26115, 303.7994, 245.08629, 304.94604, 240.0641);
((GeneralPath)shape).curveTo(305.78088, 235.42242, 307.09015, 230.95934, 308.80667, 226.57614);
((GeneralPath)shape).curveTo(310.47858, 221.55894, 312.30063, 216.55666, 313.1644, 211.32492);
((GeneralPath)shape).curveTo(314.15182, 206.43224, 315.46567, 201.6072, 317.18967, 196.92313);
((GeneralPath)shape).curveTo(318.1307, 194.68048, 317.47952, 192.29756, 317.8886, 189.87573);
((GeneralPath)shape).curveTo(317.9689, 186.51402, 318.62854, 183.22856, 319.28397, 179.9439);
((GeneralPath)shape).curveTo(319.75668, 177.0724, 319.61563, 174.18527, 320.46802, 171.36545);
((GeneralPath)shape).curveTo(324.05347, 164.46677, 322.60645, 165.09332, 337.40103, 167.27792);
((GeneralPath)shape).curveTo(338.92416, 167.50284, 339.30542, 169.69878, 340.20667, 170.94707);
((GeneralPath)shape).curveTo(340.93317, 171.95332, 341.55206, 173.03459, 342.28195, 174.03838);
((GeneralPath)shape).curveTo(343.0002, 175.02617, 343.79266, 175.95784, 344.54803, 176.91757);
((GeneralPath)shape).curveTo(345.40955, 178.13176, 346.2711, 179.34595, 347.1326, 180.56013);
((GeneralPath)shape).curveTo(349.49637, 183.90982, 352.01297, 187.14893, 354.42844, 190.45694);
((GeneralPath)shape).curveTo(355.102, 191.37938, 355.66528, 192.38011, 356.35464, 193.2908);
((GeneralPath)shape).curveTo(357.31113, 194.55443, 358.40533, 195.70969, 359.36307, 196.97235);
((GeneralPath)shape).curveTo(359.7121, 197.43796, 359.92926, 198.0415, 360.41013, 198.36914);
((GeneralPath)shape).curveTo(360.6529, 198.53453, 360.13397, 197.81316, 360.16913, 197.52153);
((GeneralPath)shape).curveTo(360.18344, 197.40305, 360.48764, 197.56783, 360.52057, 197.45312);
((GeneralPath)shape).curveTo(360.56625, 197.29393, 360.1542, 196.98376, 360.31915, 196.9989);
((GeneralPath)shape).curveTo(360.7184, 197.0355, 361.044, 197.34276, 361.39667, 197.53351);
((GeneralPath)shape).curveTo(362.10043, 197.91414, 362.79053, 198.31952, 363.48743, 198.71252);
((GeneralPath)shape).curveTo(364.5702, 200.16713, 365.9809, 201.42757, 366.73572, 203.07637);
((GeneralPath)shape).curveTo(367.36337, 204.44746, 367.30914, 206.03839, 367.5244, 207.53088);
((GeneralPath)shape).curveTo(367.57452, 207.87834, 367.63474, 208.91914, 367.52942, 208.58403);
((GeneralPath)shape).curveTo(367.2394, 207.65504, 367.79153, 206.22415, 366.95865, 205.72078);
((GeneralPath)shape).curveTo(356.2384, 199.2418, 351.3867, 203.85904, 355.25854, 200.39526);
((GeneralPath)shape).curveTo(363.38956, 193.91864, 371.61694, 187.5682, 379.72424, 181.05893);
((GeneralPath)shape).curveTo(384.8499, 177.3301, 389.46463, 172.99072, 394.42422, 169.05438);
((GeneralPath)shape).curveTo(395.42334, 168.2614, 396.42093, 167.46431, 397.4621, 166.72737);
((GeneralPath)shape).curveTo(397.8552, 166.44914, 398.25592, 165.88185, 398.71884, 166.01465);
((GeneralPath)shape).curveTo(399.0689, 166.11508, 398.75974, 166.74188, 398.78024, 167.10548);
((GeneralPath)shape).curveTo(399.9562, 176.39572, 397.84952, 174.98312, 411.72913, 176.89117);
((GeneralPath)shape).curveTo(412.62225, 177.01396, 413.03226, 175.50368, 413.90775, 175.28854);
((GeneralPath)shape).curveTo(414.24338, 175.20604, 414.10477, 175.9573, 414.12543, 176.3023);
((GeneralPath)shape).curveTo(414.26703, 178.66556, 414.14444, 181.03725, 414.14612, 183.40474);
((GeneralPath)shape).curveTo(414.31857, 192.73, 415.2174, 202.06802, 414.41992, 211.391);
((GeneralPath)shape).curveTo(414.2661, 213.1889, 413.9595, 214.97044, 413.7293, 216.76016);
((GeneralPath)shape).curveTo(412.4782, 223.87254, 411.6733, 231.04875, 410.27942, 238.13643);
((GeneralPath)shape).curveTo(409.4913, 240.58882, 409.4258, 242.17719, 409.40375, 244.74437);
((GeneralPath)shape).curveTo(408.24756, 247.73949, 407.4181, 250.59322, 407.11197, 253.761);
((GeneralPath)shape).curveTo(406.91458, 255.98369, 407.2207, 258.19672, 407.44583, 260.40335);
((GeneralPath)shape).curveTo(407.70386, 261.79236, 407.46893, 263.2323, 407.6167, 264.62378);
((GeneralPath)shape).curveTo(407.6217, 264.67297, 407.72247, 264.51205, 407.7481, 264.55438);
((GeneralPath)shape).curveTo(407.86563, 264.7487, 407.90253, 264.98187, 407.96533, 265.20013);
((GeneralPath)shape).curveTo(408.07736, 265.5894, 408.16998, 265.98398, 408.2723, 266.3759);
((GeneralPath)shape).curveTo(408.3799, 266.88422, 408.4875, 267.39258, 408.5951, 267.9009);
((GeneralPath)shape).curveTo(408.81985, 269.18625, 390.64236, 272.36478, 390.41763, 271.07944);
((GeneralPath)shape).lineTo(390.41763, 271.07944);
((GeneralPath)shape).curveTo(390.34402, 270.72122, 390.2705, 270.363, 390.19696, 270.00482);
((GeneralPath)shape).curveTo(389.6348, 267.4774, 389.27814, 264.95154, 389.30655, 262.3636);
((GeneralPath)shape).curveTo(388.737, 258.9904, 387.91614, 255.63608, 388.21118, 252.17908);
((GeneralPath)shape).curveTo(388.5741, 248.59406, 389.19937, 245.18918, 390.9715, 241.99478);
((GeneralPath)shape).curveTo(391.2165, 241.55316, 391.49646, 240.33167, 391.80634, 240.73047);
((GeneralPath)shape).curveTo(392.2215, 241.26477, 391.63824, 242.07327, 391.5542, 242.74467);
((GeneralPath)shape).curveTo(391.6044, 243.32864, 391.7877, 243.91634, 391.70496, 244.4966);
((GeneralPath)shape).curveTo(391.64847, 244.89291, 391.5411, 243.71274, 391.47238, 243.31837);
((GeneralPath)shape).curveTo(391.0604, 240.95398, 390.878, 238.5553, 390.9541, 236.155);
((GeneralPath)shape).curveTo(391.32788, 229.12357, 392.22748, 222.12163, 392.60147, 215.0875);
((GeneralPath)shape).curveTo(392.63947, 214.38611, 393.09647, 206.04306, 393.10162, 205.54373);
((GeneralPath)shape).curveTo(393.18283, 197.72223, 392.03925, 189.88313, 393.07224, 182.06944);
((GeneralPath)shape).curveTo(394.63098, 170.3239, 397.82037, 153.66698, 415.20483, 164.75584);
((GeneralPath)shape).curveTo(417.2143, 166.0376, 416.09665, 169.43858, 416.54257, 171.77994);
((GeneralPath)shape).curveTo(416.31924, 172.91423, 416.23453, 174.0849, 415.8726, 175.18285);
((GeneralPath)shape).curveTo(412.77557, 184.57765, 402.9818, 190.60063, 396.2528, 197.14828);
((GeneralPath)shape).curveTo(386.79578, 204.02089, 377.31616, 211.10274, 366.34525, 215.3986);
((GeneralPath)shape).curveTo(360.17972, 217.89882, 361.27573, 218.03676, 350.30148, 212.01268);
((GeneralPath)shape).curveTo(349.18454, 211.39955, 349.5957, 209.56094, 349.34644, 208.3114);
((GeneralPath)shape).curveTo(349.28873, 208.0221, 349.25952, 207.16113, 349.38675, 207.4273);
((GeneralPath)shape).curveTo(349.78387, 208.2585, 349.71933, 209.27904, 350.18774, 210.07224);
((GeneralPath)shape).curveTo(350.88522, 211.2533, 351.94098, 212.1821, 352.81763, 213.23703);
((GeneralPath)shape).curveTo(353.06522, 213.4102, 353.41827, 213.48991, 353.56042, 213.75652);
((GeneralPath)shape).curveTo(353.9618, 214.50935, 348.37695, 212.00714, 348.3052, 211.95917);
((GeneralPath)shape).curveTo(347.00333, 211.08849, 345.09863, 209.37889, 343.77237, 208.21487);
((GeneralPath)shape).curveTo(337.9325, 202.93683, 332.77762, 196.88045, 328.55908, 190.2316);
((GeneralPath)shape).curveTo(327.31308, 188.10341, 323.26852, 181.74504, 323.19324, 179.26025);
((GeneralPath)shape).curveTo(323.18524, 178.98578, 323.69363, 179.58266, 323.96582, 179.54622);
((GeneralPath)shape).curveTo(338.21063, 177.63843, 336.24988, 181.65318, 338.36514, 175.63759);
((GeneralPath)shape).curveTo(338.27853, 175.9664, 338.44345, 176.65962, 338.10535, 176.62401);
((GeneralPath)shape).curveTo(337.7538, 176.587, 337.96237, 175.24223, 337.88406, 175.58693);
((GeneralPath)shape).curveTo(337.76965, 176.0904, 337.96677, 176.61642, 337.98987, 177.13219);
((GeneralPath)shape).curveTo(338.07047, 178.92908, 338.02426, 180.72987, 337.81204, 182.5171);
((GeneralPath)shape).curveTo(337.36102, 185.74573, 336.47073, 188.85739, 336.16928, 192.10199);
((GeneralPath)shape).curveTo(336.12637, 192.47372, 336.3288, 192.9784, 336.0407, 193.21722);
((GeneralPath)shape).curveTo(335.82718, 193.39424, 335.77277, 192.15132, 335.77524, 192.42865);
((GeneralPath)shape).curveTo(335.78125, 193.143, 336.00555, 193.84096, 336.05264, 194.5538);
((GeneralPath)shape).curveTo(336.18848, 196.60954, 336.09244, 198.73032, 335.42938, 200.69614);
((GeneralPath)shape).curveTo(334.71198, 205.1842, 333.6905, 209.62477, 332.7114, 214.0613);
((GeneralPath)shape).curveTo(331.62756, 220.49857, 329.82645, 226.72333, 326.9579, 232.61238);
((GeneralPath)shape).curveTo(325.60324, 235.89981, 324.0401, 239.135, 323.85312, 242.75998);
((GeneralPath)shape).curveTo(323.3633, 247.85658, 323.22165, 253.06985, 321.57538, 257.96155);
((GeneralPath)shape).curveTo(321.3951, 259.25262, 303.1364, 256.7033, 303.31668, 255.41223);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(454.80063, 177.10019);
((GeneralPath)shape).curveTo(455.36816, 182.73265, 454.76724, 188.42053, 455.24835, 194.05626);
((GeneralPath)shape).curveTo(455.3861, 195.66998, 456.7955, 204.18427, 456.9404, 205.08368);
((GeneralPath)shape).curveTo(458.18155, 213.83997, 458.94403, 222.7309, 458.0549, 231.56535);
((GeneralPath)shape).curveTo(457.71362, 234.95653, 456.9586, 237.98724, 456.2362, 241.29976);
((GeneralPath)shape).curveTo(454.82077, 246.05247, 452.94714, 250.76875, 450.11276, 254.86937);
((GeneralPath)shape).curveTo(450.04947, 254.92928, 449.92346, 255.13597, 449.9229, 255.04887);
((GeneralPath)shape).curveTo(449.92224, 254.8966, 450.39453, 253.71877, 450.39594, 253.72217);
((GeneralPath)shape).curveTo(450.6222, 254.28494, 450.86948, 255.832, 450.95447, 256.28937);
((GeneralPath)shape).curveTo(451.5338, 260.55838, 450.88077, 255.53874, 451.36227, 259.94302);
((GeneralPath)shape).curveTo(451.3954, 260.24557, 451.67645, 261.11884, 451.5848, 260.82858);
((GeneralPath)shape).curveTo(450.78146, 258.28427, 451.564, 260.02493, 449.15344, 256.6147);
((GeneralPath)shape).curveTo(450.37463, 254.32758, 444.8394, 255.65503, 445.84042, 254.9234);
((GeneralPath)shape).curveTo(447.3097, 253.84955, 449.35443, 253.97351, 451.12277, 253.54358);
((GeneralPath)shape).curveTo(453.72107, 252.91187, 456.32193, 252.28703, 458.93912, 251.7388);
((GeneralPath)shape).curveTo(466.9049, 250.07018, 472.79514, 249.14249, 480.91858, 247.7478);
((GeneralPath)shape).curveTo(484.9756, 247.24094, 489.0326, 246.73407, 493.0896, 246.22719);
((GeneralPath)shape).curveTo(494.85266, 245.57532, 504.07144, 270.50864, 502.30838, 271.16052);
((GeneralPath)shape).lineTo(502.30838, 271.16052);
((GeneralPath)shape).curveTo(498.28235, 271.64804, 494.25632, 272.13556, 490.2303, 272.62308);
((GeneralPath)shape).curveTo(481.4094, 273.38345, 475.5111, 274.0478, 466.7592, 274.2286);
((GeneralPath)shape).curveTo(446.97498, 274.63736, 466.20184, 274.0969, 451.93958, 273.4642);
((GeneralPath)shape).curveTo(449.16943, 273.3413, 446.37796, 273.7818, 443.62103, 273.4852);
((GeneralPath)shape).curveTo(442.1683, 273.32892, 440.84393, 272.5758, 439.45538, 272.12112);
((GeneralPath)shape).curveTo(438.09323, 270.9056, 436.55386, 269.8634, 435.3689, 268.47458);
((GeneralPath)shape).curveTo(433.04926, 265.7559, 432.7875, 261.6947, 432.4325, 258.335);
((GeneralPath)shape).curveTo(432.1219, 254.37701, 431.81784, 250.35263, 433.7225, 246.69751);
((GeneralPath)shape).curveTo(435.076, 244.07439, 435.79562, 241.32986, 436.03238, 238.35793);
((GeneralPath)shape).curveTo(437.15005, 228.03368, 435.72726, 217.5998, 434.76242, 207.3198);
((GeneralPath)shape).curveTo(434.40344, 202.87846, 433.78796, 198.45229, 433.65198, 193.99855);
((GeneralPath)shape).curveTo(433.45813, 187.64964, 434.47925, 181.2488, 436.15005, 175.1448);
((GeneralPath)shape).curveTo(436.28833, 173.826, 454.9389, 175.78134, 454.80066, 177.10014);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(449.67493, 209.13927);
((GeneralPath)shape).curveTo(466.13098, 204.93478, 483.38605, 204.8664, 500.24084, 205.85522);
((GeneralPath)shape).curveTo(501.83902, 205.38148, 508.5388, 227.98297, 506.9406, 228.45671);
((GeneralPath)shape).lineTo(506.9406, 228.45671);
((GeneralPath)shape).curveTo(504.2536, 228.85825, 501.58206, 229.38225, 498.8796, 229.66129);
((GeneralPath)shape).curveTo(483.99423, 231.19829, 468.82898, 230.42668, 454.25644, 226.98305);
((GeneralPath)shape).curveTo(452.9947, 227.307, 448.41318, 209.46321, 449.67493, 209.13925);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(434.11722, 166.98587);
((GeneralPath)shape).curveTo(435.78143, 166.2804, 437.38812, 165.4199, 439.1098, 164.86946);
((GeneralPath)shape).curveTo(447.50623, 162.18497, 457.02112, 161.18954, 465.70102, 160.03178);
((GeneralPath)shape).curveTo(478.6463, 158.3051, 477.17615, 158.56541, 490.50424, 157.22995);
((GeneralPath)shape).curveTo(494.89856, 156.90373, 499.29288, 156.5775, 503.6872, 156.25127);
((GeneralPath)shape).curveTo(505.5217, 155.66867, 513.76074, 181.61252, 511.92627, 182.1951);
((GeneralPath)shape).lineTo(511.92627, 182.1951);
((GeneralPath)shape).curveTo(507.62674, 182.45111, 503.3272, 182.70712, 499.02768, 182.96313);
((GeneralPath)shape).curveTo(491.13214, 183.46373, 481.50186, 184.14618, 473.574, 184.36748);
((GeneralPath)shape).curveTo(469.95813, 184.46841, 466.33954, 184.40637, 462.72238, 184.43457);
((GeneralPath)shape).curveTo(458.41397, 184.46817, 451.30048, 184.70119, 446.74426, 184.25377);
((GeneralPath)shape).curveTo(445.41086, 184.12283, 444.11685, 183.72746, 442.80316, 183.4643);
((GeneralPath)shape).curveTo(441.63797, 184.07849, 432.952, 167.60002, 434.11722, 166.98582);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(141.86844, 322.17365);
((GeneralPath)shape).curveTo(136.42625, 327.22177, 130.4102, 331.6339, 124.82316, 336.53137);
((GeneralPath)shape).curveTo(122.49025, 338.39383, 121.08002, 339.1132, 120.05035, 341.91095);
((GeneralPath)shape).curveTo(118.226746, 345.8601, 116.07915, 349.6569, 114.00657, 353.48306);
((GeneralPath)shape).curveTo(112.11969, 356.11172, 111.95858, 358.90732, 111.86779, 362.02075);
((GeneralPath)shape).curveTo(111.48915, 366.82434, 110.93348, 371.61533, 110.93778, 376.43848);
((GeneralPath)shape).curveTo(111.112526, 379.06876, 110.54553, 381.71783, 110.62744, 384.342);
((GeneralPath)shape).curveTo(110.636444, 384.63416, 110.61744, 383.7426, 110.72434, 383.47052);
((GeneralPath)shape).curveTo(110.75344, 383.39642, 110.88311, 383.48212, 110.962494, 383.4879);
((GeneralPath)shape).curveTo(112.641914, 386.68408, 114.437645, 389.81723, 116.31564, 392.91397);
((GeneralPath)shape).curveTo(117.35742, 394.13235, 118.070656, 396.51456, 119.84255, 396.98883);
((GeneralPath)shape).curveTo(120.05526, 397.04572, 120.28293, 396.98984, 120.503136, 396.99182);
((GeneralPath)shape).curveTo(121.11192, 397.25842, 121.72072, 397.52502, 122.329506, 397.79163);
((GeneralPath)shape).curveTo(123.05955, 398.194, 123.78959, 398.59637, 124.51962, 398.99875);
((GeneralPath)shape).curveTo(125.089615, 399.21042, 125.68376, 399.36584, 126.229576, 399.6338);
((GeneralPath)shape).curveTo(127.46519, 400.2403, 129.55539, 402.4614, 130.63838, 401.1925);
((GeneralPath)shape).curveTo(122.67217, 400.45773, 126.72402, 401.07373, 128.44244, 400.8992);
((GeneralPath)shape).curveTo(129.95132, 400.74594, 131.43198, 400.38116, 132.90672, 400.04626);
((GeneralPath)shape).curveTo(137.48445, 399.46417, 141.9393, 398.01312, 146.16452, 396.19464);
((GeneralPath)shape).curveTo(150.2348, 394.08163, 154.64822, 392.36035, 157.89899, 389.00992);
((GeneralPath)shape).curveTo(160.441, 385.16705, 163.32709, 381.66168, 166.65375, 378.47906);
((GeneralPath)shape).curveTo(168.32228, 377.40033, 168.71893, 375.64987, 169.21292, 373.65076);
((GeneralPath)shape).curveTo(170.2411, 370.10675, 171.18011, 366.55844, 172.05223, 362.97525);
((GeneralPath)shape).curveTo(172.30107, 359.4124, 171.96463, 355.8087, 171.93378, 352.22925);
((GeneralPath)shape).curveTo(171.75412, 349.9973, 172.23322, 347.7287, 172.0806, 345.50052);
((GeneralPath)shape).curveTo(172.065, 345.27255, 172.0392, 345.95563, 172.0185, 346.1832);
((GeneralPath)shape).curveTo(170.71956, 342.7287, 170.3819, 338.99896, 169.74074, 335.38025);
((GeneralPath)shape).curveTo(169.51654, 334.6687, 169.11694, 333.56754, 168.53825, 333.0214);
((GeneralPath)shape).curveTo(168.44565, 332.934, 168.66353, 333.34903, 168.54836, 333.40326);
((GeneralPath)shape).curveTo(167.88124, 333.71732, 168.50716, 332.46475, 168.09143, 333.5113);
((GeneralPath)shape).curveTo(167.68622, 333.2283, 167.2983, 332.91876, 166.87576, 332.66235);
((GeneralPath)shape).curveTo(166.48436, 332.42487, 166.02878, 332.29727, 165.65503, 332.03287);
((GeneralPath)shape).curveTo(163.34132, 330.39606, 161.87614, 328.0274, 160.17114, 325.82922);
((GeneralPath)shape).curveTo(159.51088, 324.73965, 158.84116, 323.4155, 157.919, 322.48126);
((GeneralPath)shape).curveTo(157.8204, 322.38135, 157.63005, 322.41986, 157.52902, 322.32242);
((GeneralPath)shape).curveTo(157.17442, 321.98035, 156.99785, 321.45007, 156.57979, 321.18936);
((GeneralPath)shape).curveTo(156.43103, 321.09656, 156.56299, 321.5396, 156.55458, 321.71472);
((GeneralPath)shape).curveTo(156.58678, 321.9217, 156.85577, 322.29074, 156.65118, 322.33563);
((GeneralPath)shape).curveTo(156.05368, 322.4667, 154.13829, 320.85352, 153.69313, 320.5829);
((GeneralPath)shape).curveTo(152.9163, 320.1106, 151.6316, 319.5863, 150.74232, 319.2727);
((GeneralPath)shape).curveTo(149.70415, 319.77124, 150.42479, 319.5453, 148.53937, 319.2767);
((GeneralPath)shape).curveTo(147.43196, 319.1188, 146.29395, 319.1384, 145.20854, 318.8679);
((GeneralPath)shape).curveTo(144.27106, 318.63425, 142.44156, 317.84924, 141.46715, 317.44736);
((GeneralPath)shape).curveTo(141.13454, 317.3217, 140.82083, 317.1238, 140.46933, 317.07034);
((GeneralPath)shape).curveTo(140.15257, 317.02225, 139.263, 317.3915, 139.58032, 317.4357);
((GeneralPath)shape).curveTo(142.4885, 317.84048, 144.94208, 317.59103, 141.97119, 317.72787);
((GeneralPath)shape).curveTo(141.46436, 317.75116, 140.95796, 317.78348, 140.45134, 317.81128);
((GeneralPath)shape).curveTo(140.08607, 317.71658, 135.57462, 318.43152, 135.44955, 318.31625);
((GeneralPath)shape).curveTo(135.43056, 318.29877, 136.0205, 317.52737, 136.03477, 317.50845);
((GeneralPath)shape).curveTo(135.3472, 320.11856, 134.02858, 323.19662, 132.92337, 325.81363);
((GeneralPath)shape).curveTo(132.35493, 327.12643, 113.78927, 319.08765, 114.3577, 317.77487);
((GeneralPath)shape).lineTo(114.3577, 317.77487);
((GeneralPath)shape).curveTo(116.69521, 314.3839, 118.53268, 310.7259, 120.61778, 307.17432);
((GeneralPath)shape).curveTo(121.34874, 306.29773, 121.9913, 305.33914, 122.81065, 304.54456);
((GeneralPath)shape).curveTo(125.99263, 301.45874, 130.42595, 300.06238, 134.78311, 299.9767);
((GeneralPath)shape).curveTo(139.95708, 299.57565, 145.20476, 299.4732, 150.17606, 301.13226);
((GeneralPath)shape).curveTo(154.17131, 301.59216, 158.0996, 302.314, 161.64891, 304.37448);
((GeneralPath)shape).curveTo(162.82214, 305.03638, 164.18938, 306.0104, 165.42712, 306.54532);
((GeneralPath)shape).curveTo(165.49292, 306.57373, 165.38443, 306.31558, 165.45422, 306.33203);
((GeneralPath)shape).curveTo(166.91144, 306.67508, 168.44794, 307.88528, 169.57669, 308.5984);
((GeneralPath)shape).curveTo(171.89745, 310.87396, 174.00931, 313.2252, 175.76044, 315.97116);
((GeneralPath)shape).curveTo(177.03215, 317.53278, 178.37451, 318.65967, 180.19273, 319.6532);
((GeneralPath)shape).curveTo(184.76819, 323.4752, 187.15099, 326.55612, 188.5316, 332.549);
((GeneralPath)shape).curveTo(189.16628, 336.02884, 189.42143, 339.5418, 189.9044, 343.03864);
((GeneralPath)shape).curveTo(190.25986, 345.80682, 190.47409, 348.5882, 190.92, 351.34738);
((GeneralPath)shape).curveTo(191.40442, 356.3338, 191.46347, 361.358, 190.44092, 366.29044);
((GeneralPath)shape).curveTo(189.67162, 370.30035, 189.21638, 374.4242, 187.41743, 378.14908);
((GeneralPath)shape).curveTo(185.93095, 382.5214, 184.61606, 387.0862, 181.34442, 390.5274);
((GeneralPath)shape).curveTo(178.79082, 392.85785, 176.14728, 395.0816, 174.56984, 398.23117);
((GeneralPath)shape).curveTo(173.17496, 400.49255, 172.67377, 401.54105, 170.90546, 403.50543);
((GeneralPath)shape).curveTo(167.14534, 407.68243, 162.40979, 410.6239, 157.3976, 413.0819);
((GeneralPath)shape).curveTo(151.78574, 415.42612, 145.6228, 417.54248, 139.4526, 417.37054);
((GeneralPath)shape).curveTo(135.12065, 417.10565, 128.10768, 421.60144, 123.994606, 418.68463);
((GeneralPath)shape).curveTo(119.319016, 417.32745, 114.82893, 415.3778, 110.65124, 412.864);
((GeneralPath)shape).curveTo(105.621956, 409.79263, 101.299774, 406.09933, 98.71873, 400.66205);
((GeneralPath)shape).curveTo(97.22015, 397.56302, 96.04709, 394.28055, 94.17621, 391.38022);
((GeneralPath)shape).curveTo(93.770706, 390.54532, 93.26438, 389.75223, 92.95971, 388.8755);
((GeneralPath)shape).curveTo(91.513626, 384.71417, 91.39266, 380.20425, 91.38012, 375.85495);
((GeneralPath)shape).curveTo(91.687416, 371.14862, 92.06785, 366.4656, 93.05581, 361.84406);
((GeneralPath)shape).curveTo(93.04051, 355.73267, 93.18854, 350.6641, 96.44412, 345.17676);
((GeneralPath)shape).curveTo(97.7153, 343.12936, 99.01261, 341.12848, 100.4041, 339.16284);
((GeneralPath)shape).curveTo(101.00085, 338.31985, 101.42102, 337.33737, 102.141266, 336.5971);
((GeneralPath)shape).curveTo(102.20976, 336.5267, 102.337006, 336.6134, 102.434875, 336.6216);
((GeneralPath)shape).curveTo(103.99184, 332.3041, 105.61343, 327.9116, 108.49725, 324.27982);
((GeneralPath)shape).curveTo(109.50002, 323.1047, 110.44158, 321.87445, 111.50558, 320.75446);
((GeneralPath)shape).curveTo(116.91942, 315.05563, 123.58784, 310.42953, 130.78714, 307.3158);
((GeneralPath)shape).curveTo(131.83781, 306.53223, 142.91917, 321.39108, 141.8685, 322.17465);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(215.43166, 311.86865);
((GeneralPath)shape).curveTo(223.29904, 324.11038, 229.1232, 337.47385, 234.8829, 350.78952);
((GeneralPath)shape).curveTo(240.21887, 364.03506, 247.68683, 376.3904, 251.71555, 390.1534);
((GeneralPath)shape).curveTo(251.9333, 391.00937, 252.15106, 391.86536, 252.36882, 392.7213);
((GeneralPath)shape).curveTo(252.30151, 392.8524, 252.28172, 393.207, 252.16702, 393.11453);
((GeneralPath)shape).curveTo(251.49216, 392.57047, 251.17572, 390.706, 250.44229, 391.16812);
((GeneralPath)shape).curveTo(220.65436, 409.93735, 234.7874, 397.74188, 238.79803, 404.548);
((GeneralPath)shape).curveTo(239.10652, 405.0715, 237.8011, 403.85303, 237.30263, 403.50552);
((GeneralPath)shape).curveTo(236.17079, 401.52097, 234.58952, 399.7322, 233.90714, 397.55185);
((GeneralPath)shape).curveTo(232.98308, 394.59933, 234.85945, 388.98724, 235.67885, 386.1161);
((GeneralPath)shape).curveTo(237.65541, 379.19025, 236.66605, 382.40344, 239.42323, 374.59042);
((GeneralPath)shape).curveTo(244.05365, 362.30402, 248.83698, 350.0474, 254.39568, 338.1444);
((GeneralPath)shape).curveTo(258.36578, 329.64316, 259.80063, 327.1963, 264.1548, 319.01202);
((GeneralPath)shape).curveTo(268.71173, 311.21283, 273.0461, 303.2817, 279.02036, 296.46426);
((GeneralPath)shape).curveTo(279.5984, 295.15857, 298.0637, 303.33304, 297.48566, 304.63873);
((GeneralPath)shape).lineTo(297.48566, 304.63873);
((GeneralPath)shape).curveTo(295.1341, 313.07706, 291.01556, 320.82175, 287.30923, 328.72614);
((GeneralPath)shape).curveTo(278.4962, 346.68884, 270.35507, 365.0, 260.507, 382.43463);
((GeneralPath)shape).curveTo(258.04153, 386.80655, 255.70021, 391.28165, 252.9512, 395.48615);
((GeneralPath)shape).curveTo(252.64737, 395.95084, 252.50182, 397.09262, 252.00058, 396.85385);
((GeneralPath)shape).curveTo(249.49792, 395.6617, 255.61864, 387.15265, 248.14404, 389.48587);
((GeneralPath)shape).curveTo(247.85161, 389.2468, 246.9486, 388.56506, 247.26674, 388.76868);
((GeneralPath)shape).curveTo(248.31859, 389.44183, 251.03027, 389.85037, 250.34966, 390.89743);
((GeneralPath)shape).curveTo(247.134, 395.84418, 242.59117, 399.94373, 237.78125, 403.36066);
((GeneralPath)shape).curveTo(237.60542, 403.48557, 233.49438, 398.57733, 233.11092, 398.13058);
((GeneralPath)shape).curveTo(229.54884, 393.60843, 226.8266, 388.8631, 224.00613, 383.84448);
((GeneralPath)shape).curveTo(219.41179, 375.6695, 214.8627, 367.46353, 211.40448, 358.71912);
((GeneralPath)shape).curveTo(206.39752, 345.6925, 200.75359, 332.71667, 198.28375, 318.90665);
((GeneralPath)shape).curveTo(197.78609, 317.69412, 214.93396, 310.65613, 215.43163, 311.86868);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(335.16336, 307.90402);
((GeneralPath)shape).curveTo(337.01254, 318.44678, 337.20633, 329.22592, 337.45206, 339.90414);
((GeneralPath)shape).curveTo(337.35696, 350.4928, 337.92908, 361.09888, 337.54486, 371.68518);
((GeneralPath)shape).curveTo(337.3809, 376.20255, 336.85144, 382.5205, 336.50085, 387.0751);
((GeneralPath)shape).curveTo(335.91635, 393.45105, 334.85992, 399.7961, 332.6827, 405.8273);
((GeneralPath)shape).curveTo(332.51736, 407.1813, 313.36914, 404.84317, 313.53445, 403.48917);
((GeneralPath)shape).lineTo(313.53445, 403.48917);
((GeneralPath)shape).curveTo(313.03378, 397.71545, 313.40823, 391.9122, 313.59305, 386.13046);
((GeneralPath)shape).curveTo(313.91318, 370.71902, 314.5521, 355.32022, 314.45218, 339.9041);
((GeneralPath)shape).curveTo(314.69788, 329.2259, 314.8917, 318.44675, 316.74088, 307.904);
((GeneralPath)shape).curveTo(316.74088, 306.60132, 335.16345, 306.60132, 335.16345, 307.904);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(321.21948, 303.63376);
((GeneralPath)shape).curveTo(323.36368, 302.96017, 325.45633, 302.09256, 327.6521, 301.61304);
((GeneralPath)shape).curveTo(337.743, 299.40927, 350.23065, 298.94775, 359.92853, 298.3108);
((GeneralPath)shape).curveTo(366.11133, 297.90472, 372.30316, 297.64978, 378.48914, 297.2948);
((GeneralPath)shape).curveTo(382.2971, 297.0763, 386.0964, 296.65475, 389.91006, 296.59033);
((GeneralPath)shape).curveTo(395.82764, 296.49033, 401.74606, 296.7314, 407.66406, 296.80197);
((GeneralPath)shape).curveTo(409.75592, 296.21527, 418.05313, 325.79877, 415.96127, 326.38544);
((GeneralPath)shape).lineTo(415.96127, 326.38544);
((GeneralPath)shape).curveTo(410.0412, 326.76773, 404.1322, 327.41083, 398.20102, 327.5323);
((GeneralPath)shape).curveTo(384.8588, 327.8055, 366.69763, 327.621, 352.78296, 326.04465);
((GeneralPath)shape).curveTo(350.04062, 325.73398, 347.39667, 324.8223, 344.6728, 324.378);
((GeneralPath)shape).curveTo(321.8238, 320.65115, 344.0092, 325.02286, 327.49036, 321.64438);
((GeneralPath)shape).curveTo(326.21683, 322.0878, 319.94595, 304.07718, 321.21948, 303.63376);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(319.29544, 347.3534);
((GeneralPath)shape).curveTo(336.07376, 343.65997, 353.03217, 340.63016, 370.07584, 338.4415);
((GeneralPath)shape).curveTo(375.50156, 337.74475, 380.95108, 337.24765, 386.3887, 336.65073);
((GeneralPath)shape).curveTo(391.30353, 336.37802, 396.21835, 336.10532, 401.13315, 335.8326);
((GeneralPath)shape).curveTo(403.02496, 335.1678, 412.427, 361.92206, 410.5352, 362.58688);
((GeneralPath)shape).lineTo(410.5352, 362.58688);
((GeneralPath)shape).curveTo(405.77267, 363.31558, 401.0102, 364.04428, 396.24768, 364.77298);
((GeneralPath)shape).curveTo(390.7262, 365.30017, 385.216, 365.96307, 379.68323, 366.35455);
((GeneralPath)shape).curveTo(371.47723, 366.93515, 357.49228, 367.3354, 349.00714, 367.38522);
((GeneralPath)shape).curveTo(342.085, 367.42593, 335.57028, 367.39792, 328.72067, 366.58704);
((GeneralPath)shape).curveTo(327.12717, 366.39838, 325.57114, 365.97067, 323.99637, 365.6625);
((GeneralPath)shape).curveTo(322.70172, 365.9949, 318.00073, 347.68582, 319.29538, 347.3534);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(459.89017, 306.65674);
((GeneralPath)shape).curveTo(462.4691, 320.0969, 462.3177, 333.89587, 462.07266, 347.51877);
((GeneralPath)shape).curveTo(461.24658, 357.7241, 460.41144, 367.9565, 458.7803, 378.07324);
((GeneralPath)shape).curveTo(457.91742, 383.42496, 456.83862, 388.5627, 454.81784, 393.5827);
((GeneralPath)shape).curveTo(450.32245, 399.21295, 453.33417, 395.98077, 436.07584, 395.73962);
((GeneralPath)shape).curveTo(435.6057, 395.73264, 435.3805, 394.01468, 435.66205, 394.3912);
((GeneralPath)shape).curveTo(436.8603, 395.99362, 437.79675, 397.77603, 438.8641, 399.46844);
((GeneralPath)shape).curveTo(437.80954, 398.76416, 447.76956, 383.85025, 448.82413, 384.55453);
((GeneralPath)shape).lineTo(448.82413, 384.55453);
((GeneralPath)shape).curveTo(450.27954, 386.4118, 451.75275, 388.25525, 453.1903, 390.12637);
((GeneralPath)shape).curveTo(456.592, 394.55408, 437.32025, 397.68518, 435.24768, 391.6448);
((GeneralPath)shape).curveTo(434.39478, 386.5648, 434.42206, 381.52353, 434.51868, 376.37158);
((GeneralPath)shape).curveTo(434.70944, 366.19897, 435.49707, 356.06244, 436.61685, 345.95114);
((GeneralPath)shape).curveTo(438.359, 332.86673, 439.41092, 319.6902, 441.4676, 306.65668);
((GeneralPath)shape).curveTo(441.4676, 305.354, 459.89014, 305.354, 459.89014, 306.65668);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(436.99408, 295.72522);
((GeneralPath)shape).curveTo(447.24536, 289.23563, 459.37845, 287.1306, 471.25128, 285.94492);
((GeneralPath)shape).curveTo(479.46506, 285.44794, 481.75522, 285.07486, 491.22504, 285.99872);
((GeneralPath)shape).curveTo(493.74734, 286.24478, 496.3225, 286.56143, 498.67993, 287.4916);
((GeneralPath)shape).curveTo(504.78094, 289.899, 508.75757, 294.90976, 513.1051, 299.48187);
((GeneralPath)shape).curveTo(514.6598, 301.75504, 516.5833, 304.0235, 517.50366, 306.684);
((GeneralPath)shape).curveTo(517.7518, 307.40125, 518.6882, 308.34418, 518.14075, 308.8699);
((GeneralPath)shape).curveTo(503.40512, 323.02145, 505.55298, 313.65283, 504.21356, 319.69742);
((GeneralPath)shape).curveTo(508.95758, 320.17017, 510.28656, 321.53763, 513.68036, 317.95084);
((GeneralPath)shape).curveTo(514.6083, 316.97015, 515.01874, 315.60498, 515.64404, 314.40842);
((GeneralPath)shape).curveTo(515.7853, 314.13812, 515.8389, 313.28412, 515.97687, 313.55612);
((GeneralPath)shape).curveTo(516.50244, 314.59265, 516.13293, 317.69357, 516.0845, 318.51385);
((GeneralPath)shape).curveTo(514.33307, 327.07285, 510.1068, 330.64563, 502.86554, 334.82538);
((GeneralPath)shape).curveTo(498.08395, 337.22534, 493.20615, 339.4357, 488.31952, 341.61423);
((GeneralPath)shape).curveTo(487.6099, 341.93817, 486.87756, 342.21643, 486.1906, 342.58606);
((GeneralPath)shape).curveTo(484.45908, 343.51773, 482.93912, 344.79892, 481.28262, 345.85828);
((GeneralPath)shape).curveTo(476.20108, 349.10803, 470.9486, 352.02628, 465.6444, 354.89084);
((GeneralPath)shape).curveTo(459.50534, 357.8032, 453.48773, 361.03354, 447.17596, 363.57358);
((GeneralPath)shape).curveTo(445.92102, 364.0786, 444.62582, 365.30722, 443.33817, 364.89276);
((GeneralPath)shape).curveTo(442.5653, 364.644, 444.15634, 363.43124, 444.21857, 362.6217);
((GeneralPath)shape).curveTo(444.52353, 358.6555, 444.35962, 354.66708, 444.43015, 350.68976);
((GeneralPath)shape).curveTo(446.99402, 350.32904, 449.53577, 349.7349, 452.12177, 349.60757);
((GeneralPath)shape).curveTo(460.9146, 349.17453, 471.50214, 350.10135, 480.04315, 351.19675);
((GeneralPath)shape).curveTo(490.9572, 352.59653, 505.33325, 355.24887, 515.9501, 357.92355);
((GeneralPath)shape).curveTo(521.91956, 359.42743, 527.77344, 361.3576, 533.6851, 363.07465);
((GeneralPath)shape).curveTo(545.9106, 367.83844, 558.84546, 372.13657, 569.3544, 380.32187);
((GeneralPath)shape).curveTo(570.9123, 381.5353, 572.2394, 383.03253, 573.50854, 384.54538);
((GeneralPath)shape).curveTo(573.6933, 384.7656, 573.7931, 385.17508, 573.6155, 385.40112);
((GeneralPath)shape).curveTo(569.80743, 390.24863, 565.6823, 394.8384, 561.7157, 399.55707);
((GeneralPath)shape).curveTo(558.7487, 399.40924, 556.46, 398.11398, 553.9514, 396.66724);
((GeneralPath)shape).curveTo(552.8482, 395.80878, 564.98883, 380.2066, 566.09204, 381.0651);
((GeneralPath)shape).lineTo(566.09204, 381.0651);
((GeneralPath)shape).curveTo(569.0352, 382.46146, 572.0221, 383.82236, 574.16656, 386.38763);
((GeneralPath)shape).curveTo(570.68677, 391.44104, 567.9716, 397.11728, 563.7271, 401.54788);
((GeneralPath)shape).curveTo(562.8906, 402.42102, 561.3321, 401.21243, 560.13635, 401.03305);
((GeneralPath)shape).curveTo(558.5879, 400.80078, 557.02356, 400.65012, 555.4945, 400.31293);
((GeneralPath)shape).curveTo(543.3365, 397.6319, 531.5526, 393.43884, 519.4745, 390.45572);
((GeneralPath)shape).curveTo(502.77148, 386.04773, 486.0332, 381.85037, 469.23306, 377.82745);
((GeneralPath)shape).curveTo(464.55756, 376.7079, 459.87903, 375.60083, 455.1987, 374.50146);
((GeneralPath)shape).curveTo(451.32825, 373.59235, 447.3937, 372.92838, 443.58078, 371.8021);
((GeneralPath)shape).curveTo(440.48154, 370.8866, 437.53128, 369.52682, 434.50653, 368.3892);
((GeneralPath)shape).curveTo(432.17017, 363.6432, 428.64328, 359.3155, 427.4975, 354.15115);
((GeneralPath)shape).curveTo(427.07547, 352.24887, 429.0079, 350.50974, 430.1974, 348.9664);
((GeneralPath)shape).curveTo(431.13632, 347.74817, 432.48883, 346.9008, 433.75668, 346.03003);
((GeneralPath)shape).curveTo(439.55453, 342.0481, 446.12268, 339.25793, 452.47797, 336.33563);
((GeneralPath)shape).curveTo(473.44202, 328.10062, 446.0529, 338.84317, 464.60724, 331.61304);
((GeneralPath)shape).curveTo(467.0587, 330.65778, 469.5862, 329.87476, 471.95358, 328.72687);
((GeneralPath)shape).curveTo(473.06982, 328.18564, 474.1016, 327.48523, 475.1756, 326.8644);
((GeneralPath)shape).curveTo(475.87482, 326.545, 476.574, 326.22565, 477.27322, 325.90625);
((GeneralPath)shape).curveTo(480.38046, 324.4339, 483.3884, 322.73407, 486.53342, 321.34436);
((GeneralPath)shape).curveTo(487.16324, 321.06607, 487.83597, 320.8898, 488.459, 320.5967);
((GeneralPath)shape).curveTo(489.3072, 320.19772, 490.11252, 319.7134, 490.93927, 319.27176);
((GeneralPath)shape).curveTo(492.97504, 318.354, 495.1608, 317.3552, 497.34445, 317.0313);
((GeneralPath)shape).curveTo(497.78043, 315.27194, 497.26175, 313.2563, 497.7273, 311.57275);
((GeneralPath)shape).curveTo(498.71204, 308.01147, 500.46375, 303.9389, 504.6658, 302.98624);
((GeneralPath)shape).curveTo(507.15668, 302.4215, 509.7642, 303.30252, 512.31335, 303.46063);
((GeneralPath)shape).curveTo(519.2011, 306.5908, 513.4077, 303.3332, 501.50317, 315.28195);
((GeneralPath)shape).curveTo(501.19498, 315.59128, 502.15802, 316.5606, 501.72156, 316.57358);
((GeneralPath)shape).curveTo(501.20367, 316.589, 497.5252, 312.37668, 496.9326, 312.0462);
((GeneralPath)shape).curveTo(495.5937, 310.7976, 494.393, 309.30133, 492.6033, 308.65906);
((GeneralPath)shape).curveTo(491.785, 308.3654, 490.9127, 308.24515, 490.05472, 308.10452);
((GeneralPath)shape).curveTo(483.9473, 307.10355, 484.75037, 307.0684, 478.34238, 306.95654);
((GeneralPath)shape).curveTo(472.44025, 307.39832, 466.56314, 307.99533, 460.72394, 308.9968);
((GeneralPath)shape).curveTo(457.31088, 309.58215, 454.18234, 310.422, 450.76736, 310.91785);
((GeneralPath)shape).curveTo(449.65494, 311.07938, 448.52902, 311.1282, 447.40985, 311.23337);
((GeneralPath)shape).curveTo(446.31326, 311.96988, 435.89743, 296.46176, 436.99402, 295.72525);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
paint = new Color(0, 255, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(324.40173, 389.9114);
((GeneralPath)shape).curveTo(331.8197, 387.564, 339.5731, 386.7645, 347.3111, 386.48514);
((GeneralPath)shape).curveTo(351.06985, 386.76825, 354.9985, 385.9524, 358.54544, 387.48697);
((GeneralPath)shape).curveTo(360.1179, 388.1673, 361.35797, 389.3945, 361.07248, 388.69284);
((GeneralPath)shape).curveTo(359.38382, 387.90237, 362.49823, 387.64563, 362.46875, 387.64246);
((GeneralPath)shape).curveTo(361.4073, 387.52805, 360.32565, 387.72546, 359.26627, 387.59305);
((GeneralPath)shape).curveTo(358.68073, 387.51996, 360.4427, 387.49716, 361.0318, 387.4629);
((GeneralPath)shape).curveTo(361.67007, 387.42578, 362.30927, 387.40698, 362.94797, 387.3791);
((GeneralPath)shape).curveTo(367.52042, 387.39767, 372.1165, 387.2949, 376.6823, 387.54962);
((GeneralPath)shape).curveTo(378.54166, 387.59613, 389.05618, 387.26736, 380.01172, 387.32745);
((GeneralPath)shape).curveTo(382.7315, 387.0967, 385.45007, 386.65637, 388.0909, 385.96262);
((GeneralPath)shape).curveTo(392.9411, 384.52127, 397.9475, 384.30927, 402.9731, 384.93835);
((GeneralPath)shape).curveTo(405.13934, 385.31458, 407.32608, 385.08597, 409.50787, 385.03296);
((GeneralPath)shape).curveTo(410.7814, 385.3748, 405.9469, 403.38516, 404.6734, 403.0433);
((GeneralPath)shape).lineTo(404.6734, 403.0433);
((GeneralPath)shape).curveTo(402.20038, 402.93433, 399.76498, 402.58948, 397.29868, 402.4137);
((GeneralPath)shape).curveTo(396.98645, 402.4157, 396.0497, 402.4187, 396.36197, 402.4187);
((GeneralPath)shape).curveTo(397.61942, 402.4197, 398.8778, 402.465, 400.13428, 402.4157);
((GeneralPath)shape).curveTo(400.38803, 402.4057, 399.63385, 402.3268, 399.38132, 402.3001);
((GeneralPath)shape).curveTo(398.38593, 402.19507, 397.4036, 402.29712, 396.4317, 402.53326);
((GeneralPath)shape).curveTo(393.09006, 403.40445, 389.7583, 404.29105, 386.4033, 405.11673);
((GeneralPath)shape).curveTo(383.91144, 405.26788, 381.42218, 405.47125, 378.92773, 405.5702);
((GeneralPath)shape).curveTo(376.60196, 405.66238, 374.29254, 405.01746, 371.96216, 405.21158);
((GeneralPath)shape).curveTo(369.29062, 405.30807, 372.08517, 405.1894, 374.35504, 405.2989);
((GeneralPath)shape).curveTo(374.7775, 405.31927, 373.50992, 405.3347, 373.08746, 405.3548);
((GeneralPath)shape).curveTo(371.42175, 405.4342, 369.75687, 405.535, 368.0894, 405.5733);
((GeneralPath)shape).curveTo(363.29367, 405.6398, 368.9582, 405.5803, 364.20386, 405.5713);
((GeneralPath)shape).curveTo(359.96838, 405.5633, 356.1825, 406.02573, 352.31827, 404.2266);
((GeneralPath)shape).curveTo(351.97794, 404.06082, 351.65875, 403.84174, 351.2973, 403.72925);
((GeneralPath)shape).curveTo(350.61594, 403.5172, 351.7299, 404.02728, 351.85715, 404.38922);
((GeneralPath)shape).curveTo(351.89954, 404.50983, 351.5706, 404.71854, 351.69702, 404.7378);
((GeneralPath)shape).curveTo(354.5694, 405.1758, 357.37576, 404.65378, 353.6186, 405.19308);
((GeneralPath)shape).curveTo(346.11948, 406.34283, 338.56122, 408.12112, 330.93396, 407.48914);
((GeneralPath)shape).curveTo(329.69098, 407.95102, 323.15887, 390.37265, 324.40182, 389.91077);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16);
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
        return  Math.round(53 * scaleFactor);
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public int getOrigY() {
        return  Math.round(33 * scaleFactor);
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * 
     * @return The width of the bounding box of the original SVG image.
     */
    public int getOrigWidth() {
        return  Math.round(542 * scaleFactor);
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public int getOrigHeight() {
        return  Math.round(542 * scaleFactor);
    }
}

