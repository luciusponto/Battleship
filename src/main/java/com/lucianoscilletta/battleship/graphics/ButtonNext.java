package com.lucianoscilletta.battleship.graphics;

import com.lucianoscilletta.battleship.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class ButtonNext implements GameGraphics {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 629.943603515625f, 626.25146484375f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0
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
g.setTransform(defaultTransform__0_0_0_0);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(58.60942077636719, 83.05278778076172), new Point2D.Double(364.6808166503906, 157.94259643554688), new float[] {0.0f,1.0f}, new Color[] {new Color(59, 201, 39, 255),new Color(23, 78, 15, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9906227588653564f, 0.0f, 0.0f, 1.002487063407898f, 616.0087280273438f, 582.0093994140625f));
shape = new Rectangle2D.Double(676.2188720703125, 663.0925903320312, 303.2012634277344, 80.516357421875);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(157.71102905273438, 13.033676147460938), new Point2D.Double(195.08297729492188, 150.60728454589844), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9908024072647095f, 0.0f, 0.0f, 0.9662237763404846f, 631.7636108398438f, 628.8556518554688f));
stroke = new BasicStroke(5.8706155f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(676.2188720703125, 663.0925903320312, 303.2012634277344, 80.516357421875);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(787.904, 681.3094);
((GeneralPath)shape).curveTo(787.90393, 680.61646, 787.73596, 680.10645, 787.39996, 679.7794);
((GeneralPath)shape).curveTo(787.06396, 679.45245, 786.55994, 679.29047, 785.888, 679.29346);
((GeneralPath)shape).lineTo(779.2641, 679.29346);
((GeneralPath)shape).curveTo(778.59406, 679.2935, 778.0981, 679.4615, 777.7761, 679.7974);
((GeneralPath)shape).curveTo(777.4541, 680.1335, 777.2941, 680.63745, 777.29614, 681.3094);
((GeneralPath)shape).curveTo(777.40015, 682.2434, 777.9121, 682.97943, 778.8321, 683.5174);
((GeneralPath)shape).curveTo(779.7521, 684.0554, 780.45605, 685.1274, 780.9441, 686.73334);
((GeneralPath)shape).curveTo(781.15106, 687.5804, 781.27704, 688.45435, 781.3221, 689.3553);
((GeneralPath)shape).curveTo(781.36707, 690.2563, 781.3851, 691.1423, 781.3761, 692.01324);
((GeneralPath)shape).curveTo(781.3701, 693.18726, 781.34607, 694.3552, 781.3041, 695.5172);
((GeneralPath)shape).curveTo(781.2621, 696.6792, 781.2381, 697.8472, 781.23206, 699.0212);
((GeneralPath)shape).lineTo(783.968, 705.1171);
((GeneralPath)shape).curveTo(783.958, 703.29517, 783.918, 701.4792, 783.848, 699.6692);
((GeneralPath)shape).curveTo(783.778, 697.85925, 783.738, 696.0433, 783.728, 694.22125);
((GeneralPath)shape).curveTo(783.71204, 692.9823, 783.72003, 691.7043, 783.752, 690.3873);
((GeneralPath)shape).curveTo(783.784, 689.0704, 783.936, 687.8044, 784.208, 686.58936);
((GeneralPath)shape).curveTo(784.74, 685.0104, 785.464, 683.96844, 786.38, 683.4634);
((GeneralPath)shape).curveTo(787.29596, 682.95844, 787.80396, 682.2404, 787.904, 681.3094);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(783.968, 723.3569);
((GeneralPath)shape).lineTo(783.968, 708.62103);
((GeneralPath)shape).lineTo(770.9122, 679.2934);
((GeneralPath)shape).lineTo(758.04834, 679.2934);
((GeneralPath)shape).curveTo(757.4683, 679.2854, 757.0203, 679.4094, 756.70435, 679.6654);
((GeneralPath)shape).curveTo(756.38837, 679.92145, 756.22833, 680.3574, 756.22437, 680.9734);
((GeneralPath)shape).curveTo(756.30634, 681.86743, 756.76636, 682.4674, 757.6044, 682.7734);
((GeneralPath)shape).curveTo(758.4423, 683.0794, 759.1663, 683.7754, 759.77637, 684.8613);
((GeneralPath)shape).lineTo(776.96014, 723.3568);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(766.8322, 721.3409);
((GeneralPath)shape).curveTo(766.7342, 720.42487, 766.2342, 719.70087, 765.3322, 719.1689);
((GeneralPath)shape).curveTo(764.43024, 718.6369, 763.71423, 717.6009, 763.1842, 716.0609);
((GeneralPath)shape).curveTo(762.8892, 714.7669, 762.7232, 713.39496, 762.6862, 711.94495);
((GeneralPath)shape).curveTo(762.64923, 710.495, 762.6392, 709.099, 762.6562, 707.757);
((GeneralPath)shape).curveTo(762.6662, 705.66705, 762.7062, 703.5711, 762.7762, 701.4691);
((GeneralPath)shape).curveTo(762.8462, 699.3671, 762.88617, 697.2712, 762.8962, 695.1812);
((GeneralPath)shape).lineTo(760.1602, 689.08527);
((GeneralPath)shape).lineTo(760.1602, 711.74097);
((GeneralPath)shape).curveTo(760.1712, 712.443, 760.1732, 713.16296, 760.1662, 713.90094);
((GeneralPath)shape).curveTo(760.1592, 714.6389, 760.0772, 715.35895, 759.9202, 716.0609);
((GeneralPath)shape).curveTo(759.43024, 717.6189, 758.71826, 718.65485, 757.78424, 719.1689);
((GeneralPath)shape).curveTo(756.8503, 719.68286, 756.33026, 720.40686, 756.22424, 721.3409);
((GeneralPath)shape).curveTo(756.22723, 722.0129, 756.40125, 722.51685, 756.7462, 722.85284);
((GeneralPath)shape).curveTo(757.0912, 723.18884, 757.58923, 723.3568, 758.2402, 723.3568);
((GeneralPath)shape).lineTo(764.8161, 723.3568);
((GeneralPath)shape).curveTo(766.1601, 723.3568, 766.8321, 722.6848, 766.8321, 721.3408);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(815.28503, 693.2132);
((GeneralPath)shape).lineTo(815.28503, 685.1013);
((GeneralPath)shape).lineTo(804.96515, 685.1013);
((GeneralPath)shape).lineTo(804.96515, 687.9333);
((GeneralPath)shape).curveTo(807.3755, 688.21155, 809.0827, 688.8764, 810.08685, 689.9279);
((GeneralPath)shape).curveTo(811.09094, 690.9795, 811.80975, 691.99634, 812.2433, 692.9786);
((GeneralPath)shape).curveTo(812.67676, 693.9608, 813.2427, 694.487, 813.94104, 694.5572);
((GeneralPath)shape).curveTo(814.333, 694.5492, 814.653, 694.4212, 814.901, 694.1732);
((GeneralPath)shape).curveTo(815.149, 693.92523, 815.277, 693.6052, 815.285, 693.21326);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(810.9651, 703.82104);
((GeneralPath)shape).lineTo(810.9651, 696.18915);
((GeneralPath)shape).curveTo(810.9881, 695.6712, 810.9181, 695.1592, 810.75507, 694.6532);
((GeneralPath)shape).curveTo(810.59204, 694.1472, 810.19806, 693.87524, 809.57306, 693.8372);
((GeneralPath)shape).curveTo(808.93304, 693.8778, 808.4957, 694.21265, 808.26105, 694.8417);
((GeneralPath)shape).curveTo(808.02637, 695.4707, 807.70636, 696.15045, 807.3011, 696.88074);
((GeneralPath)shape).curveTo(806.89575, 697.61115, 806.11707, 698.14856, 804.9651, 698.49316);
((GeneralPath)shape).lineTo(804.9651, 701.32513);
((GeneralPath)shape).curveTo(806.11707, 701.6848, 806.8957, 702.22943, 807.3011, 702.95886);
((GeneralPath)shape).curveTo(807.70636, 703.68835, 808.02637, 704.3645, 808.26105, 704.9873);
((GeneralPath)shape).curveTo(808.4957, 705.6101, 808.93304, 705.94135, 809.57306, 705.9811);
((GeneralPath)shape).curveTo(810.177, 705.95105, 810.565, 705.71106, 810.73706, 705.2611);
((GeneralPath)shape).curveTo(810.90906, 704.8111, 810.98505, 704.3311, 810.9651, 703.8211);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(815.62103, 708.52496);
((GeneralPath)shape).curveTo(815.64606, 707.911, 815.56006, 707.32697, 815.36304, 706.773);
((GeneralPath)shape).curveTo(815.166, 706.219, 814.708, 705.92303, 813.9891, 705.885);
((GeneralPath)shape).curveTo(813.259, 705.9588, 812.7245, 706.5099, 812.38556, 707.5383);
((GeneralPath)shape).curveTo(812.0466, 708.5668, 811.38763, 709.6299, 810.4087, 710.7276);
((GeneralPath)shape).curveTo(809.42975, 711.8254, 807.61523, 712.51514, 804.9652, 712.79694);
((GeneralPath)shape).lineTo(804.9652, 715.6289);
((GeneralPath)shape).lineTo(815.57306, 715.6289);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(803.38116, 715.62885);
((GeneralPath)shape).lineTo(803.38116, 685.10126);
((GeneralPath)shape).lineTo(791.5253, 685.10126);
((GeneralPath)shape).curveTo(791.04236, 685.08026, 790.59235, 685.14624, 790.17535, 685.29926);
((GeneralPath)shape).curveTo(789.75836, 685.4523, 789.5364, 685.8183, 789.50934, 686.3972);
((GeneralPath)shape).curveTo(789.56537, 686.9832, 789.87335, 687.3952, 790.4333, 687.6332);
((GeneralPath)shape).curveTo(790.9933, 687.8712, 791.4693, 688.1632, 791.86127, 688.50916);
((GeneralPath)shape).curveTo(791.91125, 688.72516, 791.95526, 688.94116, 791.9933, 689.15717);
((GeneralPath)shape).curveTo(792.0313, 689.37317, 792.0513, 689.5892, 792.0533, 689.8052);
((GeneralPath)shape).lineTo(792.0533, 710.9249);
((GeneralPath)shape).curveTo(792.0513, 711.1409, 792.0313, 711.35693, 791.9933, 711.57294);
((GeneralPath)shape).curveTo(791.95526, 711.78894, 791.9113, 712.00494, 791.86127, 712.22095);
((GeneralPath)shape).curveTo(791.46924, 712.569, 790.9933, 712.86896, 790.4333, 713.1209);
((GeneralPath)shape).curveTo(789.8733, 713.3729, 789.5653, 713.7929, 789.50934, 714.3809);
((GeneralPath)shape).curveTo(789.5363, 714.9369, 789.7583, 715.28894, 790.17535, 715.4369);
((GeneralPath)shape).curveTo(790.59235, 715.5849, 791.04236, 715.64886, 791.5253, 715.6289);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(846.9215, 686.2533);
((GeneralPath)shape).curveTo(846.9215, 685.48535, 846.5375, 685.1013, 845.76953, 685.1013);
((GeneralPath)shape).lineTo(838.2816, 685.1013);
((GeneralPath)shape).curveTo(837.84863, 685.0863, 837.4426, 685.15234, 837.06366, 685.2993);
((GeneralPath)shape).curveTo(836.68463, 685.44635, 836.48267, 685.76434, 836.45764, 686.2533);
((GeneralPath)shape).curveTo(836.5676, 686.9433, 837.0076, 687.4233, 837.77765, 687.6933);
((GeneralPath)shape).curveTo(838.5476, 687.9633, 838.9876, 688.49133, 839.09766, 689.2773);
((GeneralPath)shape).curveTo(839.05865, 689.9083, 838.82465, 690.5303, 838.3957, 691.14325);
((GeneralPath)shape).curveTo(837.9667, 691.7563, 837.57666, 692.31824, 837.2257, 692.8292);
((GeneralPath)shape).lineTo(838.6657, 695.4212);
((GeneralPath)shape).curveTo(839.3887, 694.3192, 840.1147, 693.1993, 840.8437, 692.0613);
((GeneralPath)shape).curveTo(841.57263, 690.92334, 842.43066, 689.89935, 843.41766, 688.9893);
((GeneralPath)shape).curveTo(843.8786, 688.66235, 844.5526, 688.24835, 845.43964, 687.7473);
((GeneralPath)shape).curveTo(846.3266, 687.24634, 846.82056, 686.74835, 846.92163, 686.25336);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(848.4095, 714.2849);
((GeneralPath)shape).curveTo(848.3275, 713.8899, 847.93945, 713.3839, 847.2455, 712.7669);
((GeneralPath)shape).curveTo(846.55145, 712.1499, 846.04346, 711.6319, 845.7215, 711.21295);
((GeneralPath)shape).curveTo(845.31885, 710.5862, 844.4681, 709.1157, 843.16925, 706.8015);
((GeneralPath)shape).curveTo(841.87036, 704.4873, 840.4511, 701.9218, 838.91156, 699.1051);
((GeneralPath)shape).curveTo(837.37195, 696.2884, 836.03973, 693.8129, 834.91486, 691.6787);
((GeneralPath)shape).curveTo(833.79, 689.5445, 833.20026, 688.34406, 833.1456, 688.0773);
((GeneralPath)shape).curveTo(833.2056, 687.7643, 833.4456, 687.4903, 833.8656, 687.2553);
((GeneralPath)shape).curveTo(834.2856, 687.0203, 834.5256, 686.68634, 834.5856, 686.2533);
((GeneralPath)shape).curveTo(834.54456, 685.68036, 834.27856, 685.3383, 833.7876, 685.2273);
((GeneralPath)shape).curveTo(833.2966, 685.11633, 832.8266, 685.07434, 832.3776, 685.1013);
((GeneralPath)shape).lineTo(820.4258, 685.1013);
((GeneralPath)shape).curveTo(819.9198, 685.07733, 819.4558, 685.1373, 819.0338, 685.2813);
((GeneralPath)shape).curveTo(818.6118, 685.42535, 818.3878, 685.79736, 818.3618, 686.3973);
((GeneralPath)shape).curveTo(818.4368, 686.6853, 818.79083, 687.1293, 819.4238, 687.72925);
((GeneralPath)shape).curveTo(820.0568, 688.3293, 820.5188, 688.79724, 820.8098, 689.13324);
((GeneralPath)shape).curveTo(821.17633, 689.6899, 821.9943, 691.1146, 823.2638, 693.4074);
((GeneralPath)shape).curveTo(824.53326, 695.70026, 825.92725, 698.2575, 827.44574, 701.07904);
((GeneralPath)shape).curveTo(828.96423, 703.90063, 830.2802, 706.3829, 831.3937, 708.5257);
((GeneralPath)shape).curveTo(832.50714, 710.6686, 833.0911, 711.8683, 833.1456, 712.1249);
((GeneralPath)shape).curveTo(833.07764, 712.5429, 832.8056, 712.87085, 832.32965, 713.1089);
((GeneralPath)shape).curveTo(831.85364, 713.34686, 831.58167, 713.7229, 831.5137, 714.2369);
((GeneralPath)shape).curveTo(831.54865, 714.8829, 831.81464, 715.28284, 832.31165, 715.4369);
((GeneralPath)shape).curveTo(832.80865, 715.5909, 833.3266, 715.6549, 833.8656, 715.6289);
((GeneralPath)shape).lineTo(846.00946, 715.6289);
((GeneralPath)shape).curveTo(846.5084, 715.65393, 847.0224, 715.5919, 847.55145, 715.44293);
((GeneralPath)shape).curveTo(848.0804, 715.29395, 848.3664, 714.90796, 848.4094, 714.2849);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(829.06573, 714.2849);
((GeneralPath)shape).curveTo(828.9517, 713.53094, 828.4957, 713.0349, 827.69775, 712.79694);
((GeneralPath)shape).curveTo(826.8998, 712.55896, 826.4437, 712.0629, 826.3298, 711.30896);
((GeneralPath)shape).curveTo(826.3738, 710.47095, 826.66974, 709.68695, 827.2178, 708.957);
((GeneralPath)shape).curveTo(827.76575, 708.227, 828.30176, 707.539, 828.82574, 706.893);
((GeneralPath)shape).lineTo(827.4338, 704.25305);
((GeneralPath)shape).curveTo(827.00146, 704.8711, 826.36206, 705.7843, 825.51556, 706.99255);
((GeneralPath)shape).curveTo(824.66907, 708.20087, 823.8092, 709.3558, 822.93604, 710.4574);
((GeneralPath)shape).curveTo(822.06287, 711.559, 821.3701, 712.25885, 820.85785, 712.55695);
((GeneralPath)shape).curveTo(820.38586, 712.74493, 819.90186, 712.94495, 819.4059, 713.1569);
((GeneralPath)shape).curveTo(818.9099, 713.3689, 818.6419, 713.7609, 818.6019, 714.3329);
((GeneralPath)shape).curveTo(818.63995, 714.89087, 818.8999, 715.25085, 819.3819, 715.41284);
((GeneralPath)shape).curveTo(819.8639, 715.5748, 820.3399, 715.64685, 820.8099, 715.62885);
((GeneralPath)shape).lineTo(826.2338, 715.62885);
((GeneralPath)shape).curveTo(826.7508, 715.65686, 827.3368, 715.6008, 827.9918, 715.4608);
((GeneralPath)shape).curveTo(828.6468, 715.3208, 829.0048, 714.92883, 829.0658, 714.28485);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(879.13477, 694.2212);
((GeneralPath)shape).lineTo(879.13477, 685.1013);
((GeneralPath)shape).lineTo(872.31885, 685.1013);
((GeneralPath)shape).lineTo(872.31885, 687.98126);
((GeneralPath)shape).curveTo(873.5102, 688.5463, 874.306, 689.4429, 874.70636, 690.671);
((GeneralPath)shape).curveTo(875.1066, 691.8992, 875.4509, 693.0446, 875.73926, 694.1074);
((GeneralPath)shape).curveTo(876.0275, 695.1702, 876.59937, 695.73615, 877.4548, 695.8052);
((GeneralPath)shape).curveTo(877.94476, 695.7992, 878.3447, 695.6552, 878.6547, 695.37317);
((GeneralPath)shape).curveTo(878.9647, 695.0912, 879.1247, 694.7072, 879.1347, 694.2212);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(873.90283, 714.42896);
((GeneralPath)shape).curveTo(873.7768, 713.60095, 873.2728, 713.097, 872.39087, 712.917);
((GeneralPath)shape).curveTo(871.50885, 712.737, 871.0049, 712.23303, 870.8789, 711.405);
((GeneralPath)shape).lineTo(870.8789, 685.1014);
((GeneralPath)shape).lineTo(859.50305, 685.1014);
((GeneralPath)shape).lineTo(859.50305, 710.5411);
((GeneralPath)shape).curveTo(859.5071, 710.8291, 859.499, 711.11707, 859.47906, 711.4051);
((GeneralPath)shape).curveTo(859.45905, 711.6931, 859.4031, 711.9811, 859.31104, 712.2691);
((GeneralPath)shape).curveTo(858.83606, 712.5721, 858.262, 712.85406, 857.58905, 713.1151);
((GeneralPath)shape).curveTo(856.9161, 713.3761, 856.5461, 713.8141, 856.47906, 714.4291);
((GeneralPath)shape).curveTo(856.51904, 715.0041, 856.78705, 715.35406, 857.2831, 715.47906);
((GeneralPath)shape).curveTo(857.77905, 715.60406, 858.26306, 715.65405, 858.73505, 715.6291);
((GeneralPath)shape).lineTo(871.64685, 715.6291);
((GeneralPath)shape).curveTo(872.11884, 715.6541, 872.60284, 715.60406, 873.0988, 715.47906);
((GeneralPath)shape).curveTo(873.5948, 715.35406, 873.8628, 715.0041, 873.90283, 714.4291);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(857.63104, 687.9813);
((GeneralPath)shape).lineTo(857.63104, 685.1014);
((GeneralPath)shape).lineTo(850.8151, 685.1014);
((GeneralPath)shape).lineTo(850.8151, 693.54926);
((GeneralPath)shape).curveTo(850.7921, 694.1683, 850.8861, 694.6943, 851.0971, 695.12726);
((GeneralPath)shape).curveTo(851.3081, 695.56024, 851.7741, 695.78625, 852.4951, 695.80524);
((GeneralPath)shape).curveTo(853.3514, 695.7371, 853.9268, 695.17474, 854.2213, 694.11816);
((GeneralPath)shape).curveTo(854.5158, 693.0616, 854.86365, 691.9197, 855.26483, 690.69244);
((GeneralPath)shape).curveTo(855.666, 689.4652, 856.4547, 688.5615, 857.63104, 687.9814);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_3);
g.setTransform(defaultTransform__0_0_2);
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
        return  Math.round(674 * GraphicsEngine.getScaleFactor());
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

