package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class ButtonReset implements GameGraphics {
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
paint = new LinearGradientPaint(new Point2D.Double(58.60942077636719, 83.05278778076172), new Point2D.Double(364.6808166503906, 157.94259643554688), new float[] {0.0f,1.0f}, new Color[] {new Color(201, 39, 39, 255),new Color(77, 21, 21, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9998186826705933f, 0.0f, 0.0f, 1.0375310182571411f, -15.90113353729248f, 577.7676391601562f));
shape = new Rectangle2D.Double(44.867977142333984, 661.685302734375, 306.015869140625, 83.33096313476562);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(75.8011245727539, -35.0330924987793), new Point2D.Double(197.87591552734375, 180.22512817382812), new float[] {0.0f,1.0f}, new Color[] {new Color(224, 224, 224, 255),new Color(35, 35, 35, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 626.25146484375f));
stroke = new BasicStroke(3.056f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(44.867977142333984, 661.685302734375, 306.015869140625, 83.33096313476562);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_0
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(144.78654, 719.73926);
((GeneralPath)shape).curveTo(144.78554, 719.2983, 144.6555, 718.8603, 144.39655, 718.4253);
((GeneralPath)shape).curveTo(144.13751, 717.9903, 143.75551, 717.7563, 143.25056, 717.7233);
((GeneralPath)shape).curveTo(142.89154, 717.76733, 142.55353, 718.00336, 142.23657, 718.43134);
((GeneralPath)shape).curveTo(141.91954, 718.8593, 141.61754, 719.21533, 141.33058, 719.4993);
((GeneralPath)shape).lineTo(140.99458, 719.1633);
((GeneralPath)shape).curveTo(140.90259, 718.6793, 140.84656, 718.18335, 140.8266, 717.67535);
((GeneralPath)shape).curveTo(140.8066, 717.16736, 140.7986, 716.6714, 140.8026, 716.1874);
((GeneralPath)shape).curveTo(140.8046, 715.6094, 140.81259, 715.0254, 140.8266, 714.4354);
((GeneralPath)shape).curveTo(140.8406, 713.84546, 140.8486, 713.2615, 140.8506, 712.6835);
((GeneralPath)shape).curveTo(140.8186, 709.97455, 140.05458, 707.9525, 138.55862, 706.61755);
((GeneralPath)shape).curveTo(137.0626, 705.2826, 135.02664, 704.4726, 132.4507, 704.18756);
((GeneralPath)shape).curveTo(135.37964, 703.64056, 137.5016, 702.4426, 138.81662, 700.5936);
((GeneralPath)shape).curveTo(140.13158, 698.7447, 140.77757, 696.3587, 140.7546, 693.4357);
((GeneralPath)shape).curveTo(140.7466, 689.62683, 139.77858, 686.79285, 137.85062, 684.93384);
((GeneralPath)shape).curveTo(135.92262, 683.0749, 133.08266, 682.1489, 129.33072, 682.1559);
((GeneralPath)shape).curveTo(128.46672, 682.1479, 127.60273, 682.1639, 126.73876, 682.20386);
((GeneralPath)shape).lineTo(126.73876, 685.9478);
((GeneralPath)shape).curveTo(128.10373, 686.14685, 128.96172, 686.82886, 129.31273, 687.9938);
((GeneralPath)shape).curveTo(129.66371, 689.1588, 129.8137, 690.33276, 129.76273, 691.51575);
((GeneralPath)shape).lineTo(129.76273, 697.1797);
((GeneralPath)shape).curveTo(129.81372, 698.3627, 129.66373, 699.5367, 129.31273, 700.70166);
((GeneralPath)shape).curveTo(128.96172, 701.86664, 128.10373, 702.54865, 126.73877, 702.7476);
((GeneralPath)shape).lineTo(126.73877, 706.4916);
((GeneralPath)shape).curveTo(128.48723, 706.9688, 129.49622, 708.2373, 129.76573, 710.297);
((GeneralPath)shape).curveTo(130.0352, 712.35675, 130.1622, 714.6482, 130.14673, 717.1714);
((GeneralPath)shape).curveTo(130.13123, 719.6946, 130.5702, 721.8901, 131.46371, 723.7578);
((GeneralPath)shape).curveTo(132.35718, 725.62555, 134.30215, 726.606, 137.29863, 726.6993);
((GeneralPath)shape).curveTo(139.22758, 726.6463, 140.93755, 725.96027, 142.42857, 724.6413);
((GeneralPath)shape).curveTo(143.91951, 723.3223, 144.7055, 721.68835, 144.78654, 719.7394);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(127.84276, 724.4912);
((GeneralPath)shape).curveTo(127.78976, 723.62024, 127.48775, 723.0222, 126.936775, 722.6972);
((GeneralPath)shape).curveTo(126.385765, 722.3722, 125.90376, 721.93024, 125.49078, 721.3712);
((GeneralPath)shape).curveTo(125.364555, 721.0053, 125.27033, 719.8492, 125.20812, 717.90283);
((GeneralPath)shape).curveTo(125.14592, 715.9565, 125.105, 713.97546, 125.08545, 711.9598);
((GeneralPath)shape).curveTo(125.06585, 709.9441, 125.05705, 708.6493, 125.05875, 708.0754);
((GeneralPath)shape).curveTo(125.06875, 703.75745, 125.10875, 699.4455, 125.17875, 695.1395);
((GeneralPath)shape).curveTo(125.24875, 690.8336, 125.28873, 686.52167, 125.29875, 682.2037);
((GeneralPath)shape).lineTo(113.4429, 682.2037);
((GeneralPath)shape).curveTo(112.79191, 682.1897, 112.293915, 682.3137, 111.94892, 682.5757);
((GeneralPath)shape).curveTo(111.60392, 682.8377, 111.429924, 683.3217, 111.42692, 684.02765);
((GeneralPath)shape).curveTo(111.47692, 684.85767, 111.77292, 685.44165, 112.31491, 685.7796);
((GeneralPath)shape).curveTo(112.8569, 686.1176, 113.3449, 686.5576, 113.77889, 687.0996);
((GeneralPath)shape).curveTo(113.84989, 687.41364, 113.899895, 687.73364, 113.928894, 688.0596);
((GeneralPath)shape).curveTo(113.95789, 688.3856, 113.97189, 688.70557, 113.970894, 689.01953);
((GeneralPath)shape).lineTo(113.970894, 719.49915);
((GeneralPath)shape).curveTo(113.9789, 720.1231, 113.914894, 720.74713, 113.77889, 721.3711);
((GeneralPath)shape).curveTo(113.3449, 721.9331, 112.8569, 722.3811, 112.31491, 722.7151);
((GeneralPath)shape).curveTo(111.77292, 723.0491, 111.47692, 723.64105, 111.42692, 724.4911);
((GeneralPath)shape).curveTo(111.432915, 725.1741, 111.612915, 725.64404, 111.96692, 725.90106);
((GeneralPath)shape).curveTo(112.32091, 726.1581, 112.8129, 726.28, 113.4429, 726.2671);
((GeneralPath)shape).lineTo(125.826744, 726.2671);
((GeneralPath)shape).curveTo(126.477715, 726.2801, 126.975716, 726.1581, 127.320724, 725.90106);
((GeneralPath)shape).curveTo(127.6657, 725.64404, 127.83971, 725.1741, 127.84271, 724.4911);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(173.31886, 696.1716);
((GeneralPath)shape).lineTo(173.31886, 688.0597);
((GeneralPath)shape).lineTo(162.999, 688.0597);
((GeneralPath)shape).lineTo(162.999, 690.89166);
((GeneralPath)shape).curveTo(165.40932, 691.1699, 167.11655, 691.8348, 168.12071, 692.8863);
((GeneralPath)shape).curveTo(169.12482, 693.93787, 169.84363, 694.9547, 170.27711, 695.93695);
((GeneralPath)shape).curveTo(170.71057, 696.9192, 171.27649, 697.4454, 171.97487, 697.5156);
((GeneralPath)shape).curveTo(172.36684, 697.5076, 172.68683, 697.37964, 172.93486, 697.13165);
((GeneralPath)shape).curveTo(173.18282, 696.88367, 173.31082, 696.56366, 173.31885, 696.1717);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(168.99892, 706.7794);
((GeneralPath)shape).lineTo(168.99892, 699.1475);
((GeneralPath)shape).curveTo(169.02191, 698.6295, 168.95192, 698.11755, 168.78891, 697.6116);
((GeneralPath)shape).curveTo(168.62589, 697.1056, 168.23189, 696.8336, 167.60692, 696.7956);
((GeneralPath)shape).curveTo(166.9669, 696.8362, 166.52957, 697.171, 166.29494, 697.80005);
((GeneralPath)shape).curveTo(166.06026, 698.4291, 165.74025, 699.10876, 165.33495, 699.8391);
((GeneralPath)shape).curveTo(164.9296, 700.5695, 164.15094, 701.107, 162.99898, 701.45154);
((GeneralPath)shape).lineTo(162.99898, 704.2835);
((GeneralPath)shape).curveTo(164.15096, 704.6432, 164.9296, 705.1878, 165.33495, 705.9173);
((GeneralPath)shape).curveTo(165.74025, 706.6468, 166.06026, 707.32294, 166.29494, 707.94574);
((GeneralPath)shape).curveTo(166.52957, 708.56854, 166.9669, 708.8998, 167.60692, 708.9395);
((GeneralPath)shape).curveTo(168.21089, 708.9095, 168.59889, 708.66956, 168.7709, 708.21954);
((GeneralPath)shape).curveTo(168.94287, 707.7696, 169.01888, 707.28955, 168.9989, 706.77954);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(173.65486, 711.48334);
((GeneralPath)shape).curveTo(173.67986, 710.8693, 173.59386, 710.28534, 173.39687, 709.7314);
((GeneralPath)shape).curveTo(173.19983, 709.1774, 172.74185, 708.8814, 172.02289, 708.8434);
((GeneralPath)shape).curveTo(171.2928, 708.9172, 170.75829, 709.46826, 170.41934, 710.4967);
((GeneralPath)shape).curveTo(170.08037, 711.52515, 169.42142, 712.58826, 168.44247, 713.686);
((GeneralPath)shape).curveTo(167.4635, 714.78375, 165.649, 715.4735, 162.99898, 715.75525);
((GeneralPath)shape).lineTo(162.99898, 718.5872);
((GeneralPath)shape).lineTo(173.60684, 718.5872);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(161.41501, 718.5872);
((GeneralPath)shape).lineTo(161.41501, 688.05963);
((GeneralPath)shape).lineTo(149.55917, 688.05963);
((GeneralPath)shape).curveTo(149.07617, 688.03864, 148.62619, 688.1046, 148.20918, 688.2576);
((GeneralPath)shape).curveTo(147.79219, 688.41064, 147.57019, 688.7767, 147.5432, 689.3556);
((GeneralPath)shape).curveTo(147.5992, 689.9416, 147.9072, 690.35364, 148.4672, 690.59155);
((GeneralPath)shape).curveTo(149.02719, 690.8296, 149.50317, 691.1216, 149.89517, 691.4675);
((GeneralPath)shape).curveTo(149.94518, 691.68353, 149.98917, 691.89954, 150.02718, 692.11554);
((GeneralPath)shape).curveTo(150.06517, 692.33154, 150.08517, 692.54755, 150.08717, 692.76355);
((GeneralPath)shape).lineTo(150.08717, 713.8833);
((GeneralPath)shape).curveTo(150.08517, 714.0993, 150.06517, 714.3153, 150.02718, 714.5313);
((GeneralPath)shape).curveTo(149.98918, 714.7473, 149.94518, 714.9633, 149.89517, 715.1793);
((GeneralPath)shape).curveTo(149.50317, 715.52734, 149.02718, 715.82733, 148.4672, 716.0793);
((GeneralPath)shape).curveTo(147.9072, 716.3313, 147.5992, 716.7513, 147.5432, 717.3393);
((GeneralPath)shape).curveTo(147.57019, 717.8953, 147.79219, 718.2473, 148.20918, 718.39526);
((GeneralPath)shape).curveTo(148.62619, 718.5433, 149.07617, 718.60724, 149.55917, 718.5873);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(200.4914, 696.2676);
((GeneralPath)shape).lineTo(200.4914, 689.1637);
((GeneralPath)shape).curveTo(200.5054, 688.6527, 200.41739, 688.24677, 200.2274, 687.9457);
((GeneralPath)shape).curveTo(200.03737, 687.6447, 199.66138, 687.4907, 199.09941, 687.4837);
((GeneralPath)shape).curveTo(198.5794, 687.53973, 198.1674, 687.76373, 197.86343, 688.1557);
((GeneralPath)shape).curveTo(197.55942, 688.5477, 197.17142, 688.7717, 196.69945, 688.8277);
((GeneralPath)shape).curveTo(195.64645, 688.7767, 194.58446, 688.5667, 193.51349, 688.1977);
((GeneralPath)shape).curveTo(192.44249, 687.82874, 191.34451, 687.60675, 190.21954, 687.5317);
((GeneralPath)shape).lineTo(190.21954, 690.0756);
((GeneralPath)shape).curveTo(192.59787, 690.58496, 194.27843, 691.4863, 195.26126, 692.7796);
((GeneralPath)shape).curveTo(196.24403, 694.07294, 196.94685, 695.29425, 197.36967, 696.44354);
((GeneralPath)shape).curveTo(197.79245, 697.5929, 198.35304, 698.20624, 199.05142, 698.2835);
((GeneralPath)shape).curveTo(199.69939, 698.2655, 200.10738, 698.0615, 200.2754, 697.6715);
((GeneralPath)shape).curveTo(200.44337, 697.28156, 200.51538, 696.81354, 200.4914, 696.2675);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(202.17137, 708.84344);
((GeneralPath)shape).curveTo(202.08537, 706.0018, 201.22536, 703.8133, 199.59142, 702.278);
((GeneralPath)shape).curveTo(197.95741, 700.7428, 196.06543, 699.5593, 193.91548, 698.72754);
((GeneralPath)shape).curveTo(191.76549, 697.8958, 189.87352, 697.1143, 188.23955, 696.38306);
((GeneralPath)shape).curveTo(186.60556, 695.65186, 185.74557, 694.6694, 185.65959, 693.4356);
((GeneralPath)shape).curveTo(185.68959, 692.54065, 186.01357, 691.81067, 186.63158, 691.24567);
((GeneralPath)shape).curveTo(187.24956, 690.6807, 187.98155, 690.3227, 188.82755, 690.1717);
((GeneralPath)shape).lineTo(188.82755, 687.4837);
((GeneralPath)shape).curveTo(185.56758, 687.4847, 182.82361, 688.34674, 180.59566, 690.06964);
((GeneralPath)shape).curveTo(178.36769, 691.79266, 177.2077, 694.3706, 177.1157, 697.8035);
((GeneralPath)shape).curveTo(177.2012, 700.39825, 178.05618, 702.42676, 179.68066, 703.889);
((GeneralPath)shape).curveTo(181.30515, 705.3512, 183.18611, 706.5187, 185.3236, 707.3914);
((GeneralPath)shape).curveTo(187.46106, 708.26416, 189.34203, 709.11365, 190.96652, 709.9399);
((GeneralPath)shape).curveTo(192.59099, 710.7661, 193.44597, 711.84064, 193.53148, 713.1633);
((GeneralPath)shape).curveTo(193.47948, 714.34033, 193.01947, 715.1543, 192.1515, 715.6053);
((GeneralPath)shape).curveTo(191.28351, 716.0563, 190.31952, 716.2823, 189.25955, 716.28326);
((GeneralPath)shape).lineTo(189.25955, 719.1632);
((GeneralPath)shape).curveTo(192.6115, 719.1862, 195.56746, 718.3722, 198.12743, 716.72125);
((GeneralPath)shape).curveTo(200.68738, 715.0703, 202.03535, 712.44434, 202.17137, 708.8433);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(187.86755, 719.1153);
((GeneralPath)shape).lineTo(187.86755, 716.33136);
((GeneralPath)shape).curveTo(185.39824, 715.6585, 183.66493, 714.59894, 182.66762, 713.1527);
((GeneralPath)shape).curveTo(181.6703, 711.7065, 180.96097, 710.359, 180.53964, 709.1101);
((GeneralPath)shape).curveTo(180.11832, 707.86127, 179.53699, 707.19635, 178.79567, 707.1155);
((GeneralPath)shape).curveTo(178.09969, 707.13745, 177.65569, 707.3695, 177.46368, 707.81146);
((GeneralPath)shape).curveTo(177.27168, 708.2535, 177.18768, 708.77344, 177.21169, 709.37146);
((GeneralPath)shape).lineTo(177.21169, 717.33936);
((GeneralPath)shape).curveTo(177.21368, 717.8564, 177.35368, 718.2863, 177.63168, 718.62933);
((GeneralPath)shape).curveTo(177.90967, 718.97235, 178.31367, 719.1503, 178.84366, 719.1633);
((GeneralPath)shape).curveTo(179.38065, 719.1093, 179.78265, 718.8933, 180.04965, 718.5153);
((GeneralPath)shape).curveTo(180.31664, 718.1373, 180.68263, 717.9213, 181.14763, 717.8673);
((GeneralPath)shape).curveTo(182.2946, 717.9163, 183.4206, 718.1183, 184.52559, 718.4733);
((GeneralPath)shape).curveTo(185.63057, 718.8283, 186.74455, 719.0423, 187.86755, 719.1153);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_3
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(231.44386, 696.1716);
((GeneralPath)shape).lineTo(231.44386, 688.0597);
((GeneralPath)shape).lineTo(221.124, 688.0597);
((GeneralPath)shape).lineTo(221.124, 690.89166);
((GeneralPath)shape).curveTo(223.53432, 691.1699, 225.24155, 691.8348, 226.24571, 692.8863);
((GeneralPath)shape).curveTo(227.24982, 693.93787, 227.96863, 694.9547, 228.40211, 695.93695);
((GeneralPath)shape).curveTo(228.83557, 696.9192, 229.40149, 697.4454, 230.09987, 697.5156);
((GeneralPath)shape).curveTo(230.49184, 697.5076, 230.81183, 697.37964, 231.05986, 697.13165);
((GeneralPath)shape).curveTo(231.30782, 696.88367, 231.43582, 696.56366, 231.44385, 696.1717);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(227.12392, 706.7794);
((GeneralPath)shape).lineTo(227.12392, 699.1475);
((GeneralPath)shape).curveTo(227.14691, 698.6295, 227.07692, 698.11755, 226.91391, 697.6116);
((GeneralPath)shape).curveTo(226.75089, 697.1056, 226.35689, 696.8336, 225.73192, 696.7956);
((GeneralPath)shape).curveTo(225.0919, 696.8362, 224.65457, 697.171, 224.41994, 697.80005);
((GeneralPath)shape).curveTo(224.18526, 698.4291, 223.86525, 699.10876, 223.45995, 699.8391);
((GeneralPath)shape).curveTo(223.0546, 700.5695, 222.27594, 701.107, 221.12398, 701.45154);
((GeneralPath)shape).lineTo(221.12398, 704.2835);
((GeneralPath)shape).curveTo(222.27596, 704.6432, 223.0546, 705.1878, 223.45995, 705.9173);
((GeneralPath)shape).curveTo(223.86525, 706.6468, 224.18526, 707.32294, 224.41994, 707.94574);
((GeneralPath)shape).curveTo(224.65457, 708.56854, 225.0919, 708.8998, 225.73192, 708.9395);
((GeneralPath)shape).curveTo(226.33589, 708.9095, 226.72389, 708.66956, 226.8959, 708.21954);
((GeneralPath)shape).curveTo(227.06787, 707.7696, 227.14388, 707.28955, 227.1239, 706.77954);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(231.77986, 711.48334);
((GeneralPath)shape).curveTo(231.80486, 710.8693, 231.71886, 710.28534, 231.52187, 709.7314);
((GeneralPath)shape).curveTo(231.32483, 709.1774, 230.86685, 708.8814, 230.14789, 708.8434);
((GeneralPath)shape).curveTo(229.4178, 708.9172, 228.88329, 709.46826, 228.54434, 710.4967);
((GeneralPath)shape).curveTo(228.20537, 711.52515, 227.54642, 712.58826, 226.56747, 713.686);
((GeneralPath)shape).curveTo(225.5885, 714.78375, 223.774, 715.4735, 221.12398, 715.75525);
((GeneralPath)shape).lineTo(221.12398, 718.5872);
((GeneralPath)shape).lineTo(231.73184, 718.5872);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(219.54001, 718.5872);
((GeneralPath)shape).lineTo(219.54001, 688.05963);
((GeneralPath)shape).lineTo(207.68417, 688.05963);
((GeneralPath)shape).curveTo(207.20117, 688.03864, 206.75119, 688.1046, 206.33418, 688.2576);
((GeneralPath)shape).curveTo(205.91719, 688.41064, 205.69519, 688.7767, 205.6682, 689.3556);
((GeneralPath)shape).curveTo(205.7242, 689.9416, 206.0322, 690.35364, 206.5922, 690.59155);
((GeneralPath)shape).curveTo(207.15219, 690.8296, 207.62817, 691.1216, 208.02017, 691.4675);
((GeneralPath)shape).curveTo(208.07018, 691.68353, 208.11417, 691.89954, 208.15218, 692.11554);
((GeneralPath)shape).curveTo(208.19017, 692.33154, 208.21017, 692.54755, 208.21217, 692.76355);
((GeneralPath)shape).lineTo(208.21217, 713.8833);
((GeneralPath)shape).curveTo(208.21017, 714.0993, 208.19017, 714.3153, 208.15218, 714.5313);
((GeneralPath)shape).curveTo(208.11418, 714.7473, 208.07018, 714.9633, 208.02017, 715.1793);
((GeneralPath)shape).curveTo(207.62817, 715.52734, 207.15218, 715.82733, 206.5922, 716.0793);
((GeneralPath)shape).curveTo(206.0322, 716.3313, 205.7242, 716.7513, 205.6682, 717.3393);
((GeneralPath)shape).curveTo(205.69519, 717.8953, 205.91719, 718.2473, 206.33418, 718.39526);
((GeneralPath)shape).curveTo(206.75119, 718.5433, 207.20117, 718.60724, 207.68417, 718.5873);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_4
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(263.51233, 697.17957);
((GeneralPath)shape).lineTo(263.51233, 688.0597);
((GeneralPath)shape).lineTo(256.6964, 688.0597);
((GeneralPath)shape).lineTo(256.6964, 690.93964);
((GeneralPath)shape).curveTo(257.8878, 691.5047, 258.68362, 692.4013, 259.08392, 693.6294);
((GeneralPath)shape).curveTo(259.4842, 694.85754, 259.8285, 696.00305, 260.1168, 697.0658);
((GeneralPath)shape).curveTo(260.40506, 698.1286, 260.9769, 698.6945, 261.8323, 698.76355);
((GeneralPath)shape).curveTo(262.32227, 698.75757, 262.72226, 698.6136, 263.0323, 698.33154);
((GeneralPath)shape).curveTo(263.34225, 698.04956, 263.50226, 697.6656, 263.51227, 697.17957);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(258.2804, 717.3873);
((GeneralPath)shape).curveTo(258.1544, 716.5593, 257.6504, 716.05536, 256.7684, 715.87537);
((GeneralPath)shape).curveTo(255.8864, 715.6954, 255.38239, 715.1914, 255.25642, 714.3634);
((GeneralPath)shape).lineTo(255.25642, 688.05975);
((GeneralPath)shape).lineTo(243.88057, 688.05975);
((GeneralPath)shape).lineTo(243.88057, 713.49945);
((GeneralPath)shape).curveTo(243.88457, 713.7875, 243.87657, 714.07544, 243.85657, 714.36346);
((GeneralPath)shape).curveTo(243.83656, 714.6515, 243.78056, 714.93945, 243.68858, 715.2275);
((GeneralPath)shape).curveTo(243.21358, 715.53046, 242.63959, 715.81244, 241.9666, 716.0735);
((GeneralPath)shape).curveTo(241.2936, 716.3345, 240.9236, 716.77246, 240.85661, 717.38745);
((GeneralPath)shape).curveTo(240.8966, 717.96246, 241.1646, 718.31244, 241.6606, 718.43744);
((GeneralPath)shape).curveTo(242.15659, 718.56244, 242.64058, 718.6124, 243.11258, 718.58746);
((GeneralPath)shape).lineTo(256.0244, 718.58746);
((GeneralPath)shape).curveTo(256.4964, 718.6125, 256.98038, 718.56244, 257.47638, 718.43744);
((GeneralPath)shape).curveTo(257.97235, 718.31244, 258.24033, 717.96246, 258.28036, 717.38745);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(242.0086, 690.9397);
((GeneralPath)shape).lineTo(242.0086, 688.05975);
((GeneralPath)shape).lineTo(235.1927, 688.05975);
((GeneralPath)shape).lineTo(235.1927, 696.5076);
((GeneralPath)shape).curveTo(235.16971, 697.12665, 235.2637, 697.65265, 235.47469, 698.08563);
((GeneralPath)shape).curveTo(235.68568, 698.5186, 236.15167, 698.7446, 236.87267, 698.7636);
((GeneralPath)shape).curveTo(237.72894, 698.6955, 238.30435, 698.1331, 238.59886, 697.07654);
((GeneralPath)shape).curveTo(238.89337, 696.01996, 239.24123, 694.87805, 239.64241, 693.6508);
((GeneralPath)shape).curveTo(240.04358, 692.4236, 240.8323, 691.5199, 242.0086, 690.93976);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_4);
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
        return  Math.round(661 * GraphicsEngine.getScaleFactor());
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

