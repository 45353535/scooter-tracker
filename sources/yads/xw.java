package yads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.ironsource.C4240b4;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f117998a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f117999b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f118000c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f118001d;

    static {
        HashMap map = new HashMap();
        f118001d = map;
        kh1.a(-984833, map, "aliceblue", -332841, "antiquewhite");
        kh1.a(-16711681, map, "aqua", -8388652, "aquamarine");
        kh1.a(-983041, map, "azure", -657956, "beige");
        kh1.a(-6972, map, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
        kh1.a(-5171, map, "blanchedalmond", -16776961, "blue");
        kh1.a(-7722014, map, "blueviolet", -5952982, "brown");
        kh1.a(-2180985, map, "burlywood", -10510688, "cadetblue");
        kh1.a(-8388864, map, "chartreuse", -2987746, "chocolate");
        kh1.a(-32944, map, "coral", -10185235, "cornflowerblue");
        kh1.a(-1828, map, "cornsilk", -2354116, "crimson");
        kh1.a(-16711681, map, "cyan", -16777077, "darkblue");
        kh1.a(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        kh1.a(-5658199, map, "darkgray", -16751616, "darkgreen");
        kh1.a(-5658199, map, "darkgrey", -4343957, "darkkhaki");
        kh1.a(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        kh1.a(-29696, map, "darkorange", -6737204, "darkorchid");
        kh1.a(-7667712, map, "darkred", -1468806, "darksalmon");
        kh1.a(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        kh1.a(-13676721, map, "darkslategray", -13676721, "darkslategrey");
        kh1.a(-16724271, map, "darkturquoise", -7077677, "darkviolet");
        kh1.a(-60269, map, "deeppink", -16728065, "deepskyblue");
        kh1.a(-9868951, map, "dimgray", -9868951, "dimgrey");
        kh1.a(-14774017, map, "dodgerblue", -5103070, "firebrick");
        kh1.a(-1296, map, "floralwhite", -14513374, "forestgreen");
        kh1.a(-65281, map, "fuchsia", -2302756, "gainsboro");
        kh1.a(-460545, map, "ghostwhite", -10496, "gold");
        kh1.a(-2448096, map, "goldenrod", -8355712, "gray");
        kh1.a(-16744448, map, "green", -5374161, "greenyellow");
        kh1.a(-8355712, map, "grey", -983056, "honeydew");
        kh1.a(-38476, map, "hotpink", -3318692, "indianred");
        kh1.a(-11861886, map, "indigo", -16, "ivory");
        kh1.a(-989556, map, "khaki", -1644806, "lavender");
        kh1.a(-3851, map, "lavenderblush", -8586240, "lawngreen");
        kh1.a(-1331, map, "lemonchiffon", -5383962, "lightblue");
        kh1.a(-1015680, map, "lightcoral", -2031617, "lightcyan");
        kh1.a(-329006, map, "lightgoldenrodyellow", -2894893, "lightgray");
        kh1.a(-7278960, map, "lightgreen", -2894893, "lightgrey");
        kh1.a(-18751, map, "lightpink", -24454, "lightsalmon");
        kh1.a(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        kh1.a(-8943463, map, "lightslategray", -8943463, "lightslategrey");
        kh1.a(-5192482, map, "lightsteelblue", -32, "lightyellow");
        kh1.a(-16711936, map, "lime", -13447886, "limegreen");
        kh1.a(-331546, map, "linen", -65281, "magenta");
        kh1.a(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        kh1.a(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        kh1.a(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        kh1.a(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        kh1.a(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        kh1.a(-15132304, map, "midnightblue", -655366, "mintcream");
        kh1.a(-6943, map, "mistyrose", -6987, "moccasin");
        kh1.a(-8531, map, "navajowhite", -16777088, "navy");
        kh1.a(-133658, map, "oldlace", -8355840, "olive");
        kh1.a(-9728477, map, "olivedrab", -23296, "orange");
        kh1.a(-47872, map, "orangered", -2461482, "orchid");
        kh1.a(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        kh1.a(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        kh1.a(-4139, map, "papayawhip", -9543, "peachpuff");
        kh1.a(-3308225, map, "peru", -16181, "pink");
        kh1.a(-2252579, map, "plum", -5185306, "powderblue");
        kh1.a(-8388480, map, "purple", -10079335, "rebeccapurple");
        kh1.a(SupportMenu.CATEGORY_MASK, map, "red", -4419697, "rosybrown");
        kh1.a(-12490271, map, "royalblue", -7650029, "saddlebrown");
        kh1.a(-360334, map, "salmon", -744352, "sandybrown");
        kh1.a(-13726889, map, "seagreen", -2578, "seashell");
        kh1.a(-6270419, map, "sienna", -4144960, "silver");
        kh1.a(-7876885, map, "skyblue", -9807155, "slateblue");
        kh1.a(-9404272, map, "slategray", -9404272, "slategrey");
        kh1.a(-1286, map, "snow", -16711809, "springgreen");
        kh1.a(-12156236, map, "steelblue", -2968436, "tan");
        kh1.a(-16744320, map, "teal", -2572328, "thistle");
        kh1.a(-40121, map, "tomato", 0, C4240b4.i.T);
        kh1.a(-12525360, map, "turquoise", -1146130, "violet");
        kh1.a(-663885, map, "wheat", -1, "white");
        kh1.a(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z10) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i11;
            }
            if (strReplace.length() == 9) {
                return ((i11 & 255) << 24) | (i11 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z10 ? f118000c : f117999b).matcher(strReplace);
            if (matcher.matches()) {
                if (z10) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i10 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i12 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i13 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f117998a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i14 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i15 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f118001d.get(ci.a(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
