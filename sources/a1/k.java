package a1;

import a1.b;
import a1.e;
import a1.g;
import android.graphics.Matrix;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Xml;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.g.n;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3675d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a1.g f3672a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g.j0 f3673b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3674c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3676e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f3677f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StringBuilder f3678g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3679h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private StringBuilder f3680i = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3682b;

        static {
            int[] iArr = new int[g.values().length];
            f3682b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3682b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3682b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3682b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3682b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3682b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3682b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3682b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3682b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3682b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3682b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3682b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3682b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3682b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3682b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3682b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3682b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3682b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f3682b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3682b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3682b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3682b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3682b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3682b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f3682b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3682b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3682b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f3682b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f3682b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f3682b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f3682b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f3682b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f3682b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f3682b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f3682b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f3682b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f3682b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f3682b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f3682b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f3682b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f3682b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f3682b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f3682b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f3682b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f3682b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f3682b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f3682b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f3682b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f3682b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f3682b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f3682b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f3682b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f3682b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f3682b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f3682b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f3682b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f3682b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f3682b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f3682b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f3682b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f3682b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f3682b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f3682b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f3682b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f3682b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f3682b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f3682b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f3682b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f3682b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f3682b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f3682b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f3682b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f3682b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f3682b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f3682b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f3682b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f3682b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f3682b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f3682b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f3682b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f3682b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f3682b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f3682b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f3682b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f3682b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f3682b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f3682b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f3682b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f3682b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f3681a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f3681a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f3681a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f3681a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f3681a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f3681a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f3681a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f3681a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f3681a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f3681a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f3681a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f3681a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f3681a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f3681a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f3681a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f3681a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f3681a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f3681a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f3681a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f3681a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f3681a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f3681a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f3681a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f3681a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f3681a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f3681a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f3681a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f3681a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f3681a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f3681a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f3681a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f3683a;

        static {
            HashMap map = new HashMap(10);
            f3683a = map;
            map.put("none", e.a.none);
            map.put("xMinYMin", e.a.xMinYMin);
            map.put("xMidYMin", e.a.xMidYMin);
            map.put("xMaxYMin", e.a.xMaxYMin);
            map.put("xMinYMid", e.a.xMinYMid);
            map.put("xMidYMid", e.a.xMidYMid);
            map.put("xMaxYMid", e.a.xMaxYMid);
            map.put("xMinYMax", e.a.xMinYMax);
            map.put("xMidYMax", e.a.xMidYMax);
            map.put("xMaxYMax", e.a.xMaxYMax);
        }

        static e.a a(String str) {
            return (e.a) f3683a.get(str);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f3684a;

        static {
            HashMap map = new HashMap(47);
            f3684a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", Integer.valueOf(SupportMenu.CATEGORY_MASK));
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put(C4240b4.i.T, 0);
        }

        static Integer a(String str) {
            return (Integer) f3684a.get(str);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f3685a;

        static {
            HashMap map = new HashMap(9);
            f3685a = map;
            g.d1 d1Var = g.d1.pt;
            map.put("xx-small", new g.p(0.694f, d1Var));
            map.put("x-small", new g.p(0.833f, d1Var));
            map.put(Constants.SMALL, new g.p(10.0f, d1Var));
            map.put("medium", new g.p(12.0f, d1Var));
            map.put(Constants.LARGE, new g.p(14.4f, d1Var));
            map.put("x-large", new g.p(17.3f, d1Var));
            map.put("xx-large", new g.p(20.7f, d1Var));
            g.d1 d1Var2 = g.d1.percent;
            map.put("smaller", new g.p(83.33f, d1Var2));
            map.put("larger", new g.p(120.0f, d1Var2));
        }

        static g.p a(String str) {
            return (g.p) f3685a.get(str);
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f3686a;

        static {
            HashMap map = new HashMap(13);
            f3686a = map;
            map.put(Constants.NORMAL, 400);
            map.put("bold", 700);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", 200);
            map.put("300", 300);
            map.put("400", 400);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", 700);
            map.put("800", 800);
            map.put(n.f66164h, 900);
        }

        static Integer a(String str) {
            return (Integer) f3686a.get(str);
        }
    }

    private class f extends DefaultHandler2 {
        private f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            k.this.c1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            k.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            k.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            k.this.r(str, k.this.x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            k.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws a1.j {
            k.this.X0(str, str2, str3, attributes);
        }

        /* synthetic */ f(k kVar, a aVar) {
            this();
        }
    }

    private enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map P0 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    P0.put("class", gVar);
                } else {
                    if (gVar != UNSUPPORTED) {
                        P0.put(gVar.name().replace('_', '-'), gVar);
                    }
                }
            }
        }

        public static g a(String str) {
            g gVar = (g) P0.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    private enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map H = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    H.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    H.put(hVar.name(), hVar);
                }
            }
        }

        public static h a(String str) {
            h hVar = (h) H.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f3764a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3766c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3765b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a1.d f3767d = new a1.d();

        i(String str) {
            this.f3766c = 0;
            String strTrim = str.trim();
            this.f3764a = strTrim;
            this.f3766c = strTrim.length();
        }

        void A() {
            while (true) {
                int i10 = this.f3765b;
                if (i10 >= this.f3766c || !k(this.f3764a.charAt(i10))) {
                    return;
                } else {
                    this.f3765b++;
                }
            }
        }

        int a() {
            int i10 = this.f3765b;
            int i11 = this.f3766c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.f3765b = i12;
            if (i12 < i11) {
                return this.f3764a.charAt(i12);
            }
            return -1;
        }

        String b() {
            int i10 = this.f3765b;
            while (!h() && !k(this.f3764a.charAt(this.f3765b))) {
                this.f3765b++;
            }
            String strSubstring = this.f3764a.substring(i10, this.f3765b);
            this.f3765b = i10;
            return strSubstring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c10) {
            int i10 = this.f3765b;
            boolean z10 = i10 < this.f3766c && this.f3764a.charAt(i10) == c10;
            if (z10) {
                this.f3765b++;
            }
            return z10;
        }

        boolean g(String str) {
            int length = str.length();
            int i10 = this.f3765b;
            boolean z10 = i10 <= this.f3766c - length && this.f3764a.substring(i10, i10 + length).equals(str);
            if (z10) {
                this.f3765b += length;
            }
            return z10;
        }

        boolean h() {
            return this.f3765b == this.f3766c;
        }

        boolean i() {
            int i10 = this.f3765b;
            if (i10 == this.f3766c) {
                return false;
            }
            char cCharAt = this.f3764a.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        boolean j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        boolean k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        Integer l() {
            int i10 = this.f3765b;
            if (i10 == this.f3766c) {
                return null;
            }
            String str = this.f3764a;
            this.f3765b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        Boolean m() {
            int i10 = this.f3765b;
            if (i10 == this.f3766c) {
                return null;
            }
            char cCharAt = this.f3764a.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f3765b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        float n() {
            float fB = this.f3767d.b(this.f3764a, this.f3765b, this.f3766c);
            if (!Float.isNaN(fB)) {
                this.f3765b = this.f3767d.a();
            }
            return fB;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i10 = this.f3765b;
            int iCharAt = this.f3764a.charAt(i10);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i11 = this.f3765b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.f3765b++;
                return this.f3764a.substring(i10, i11);
            }
            this.f3765b = i10;
            return null;
        }

        g.p p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            g.d1 d1VarV = v();
            return d1VarV == null ? new g.p(fN, g.d1.px) : new g.p(fN, d1VarV);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i10 = this.f3765b;
            char cCharAt = this.f3764a.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f3765b = i10;
                return null;
            }
            int i11 = this.f3765b;
            this.f3765b = i11 + 1;
            return this.f3764a.substring(i10 + 1, i11);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c10) {
            return t(c10, false);
        }

        String t(char c10, boolean z10) {
            if (h()) {
                return null;
            }
            char cCharAt = this.f3764a.charAt(this.f3765b);
            if ((!z10 && k(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i10 = this.f3765b;
            int iA = a();
            while (iA != -1 && iA != c10 && (z10 || !k(iA))) {
                iA = a();
            }
            return this.f3764a.substring(i10, this.f3765b);
        }

        String u(char c10) {
            return t(c10, true);
        }

        g.d1 v() {
            if (h()) {
                return null;
            }
            if (this.f3764a.charAt(this.f3765b) == '%') {
                this.f3765b++;
                return g.d1.percent;
            }
            int i10 = this.f3765b;
            if (i10 > this.f3766c - 2) {
                return null;
            }
            try {
                g.d1 d1VarValueOf = g.d1.valueOf(this.f3764a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.f3765b += 2;
                return d1VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i10 = this.f3765b;
            char cCharAt = this.f3764a.charAt(i10);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f3765b = i10;
                return null;
            }
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                    break;
                }
                iA = a();
            }
            return this.f3764a.substring(i10, this.f3765b);
        }

        float x() {
            z();
            float fB = this.f3767d.b(this.f3764a, this.f3765b, this.f3766c);
            if (!Float.isNaN(fB)) {
                this.f3765b = this.f3767d.a();
            }
            return fB;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i10 = this.f3765b;
            this.f3765b = this.f3766c;
            return this.f3764a.substring(i10);
        }

        boolean z() {
            A();
            int i10 = this.f3765b;
            if (i10 == this.f3766c || this.f3764a.charAt(i10) != ',') {
                return false;
            }
            this.f3765b++;
            A();
            return true;
        }
    }

    private class j implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private XmlPullParser f3768a;

        public j(XmlPullParser xmlPullParser) {
            this.f3768a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f3768a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f3768a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f3768a.getAttributeName(i10);
            if (this.f3768a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f3768a.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f3768a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f3768a.getAttributeValue(i10);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    k() {
    }

    private void A(g.d dVar, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    dVar.f3434o = o0(strTrim);
                    break;
                case 13:
                    dVar.f3435p = o0(strTrim);
                    break;
                case 14:
                    g.p pVarO0 = o0(strTrim);
                    dVar.f3436q = pVarO0;
                    if (pVarO0.i()) {
                        throw new a1.j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    private static Set A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    private void B(g.e eVar, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    eVar.f3448p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new a1.j("Invalid value for attribute clipPathUnits");
                    }
                    eVar.f3448p = Boolean.TRUE;
                }
            }
        }
    }

    private static g.p[] B0(String str) {
        g.p pVarP;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (pVarP = iVar.p()) == null || pVarP.i()) {
            return null;
        }
        float fA = pVarP.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pVarP);
        while (!iVar.h()) {
            iVar.z();
            g.p pVarP2 = iVar.p();
            if (pVarP2 == null || pVarP2.i()) {
                return null;
            }
            arrayList.add(pVarP2);
            fA += pVarP2.a();
        }
        if (fA == 0.0f) {
            return null;
        }
        return (g.p[]) arrayList.toArray(new g.p[arrayList.size()]);
    }

    private void C(g.g0 g0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 21:
                    g0Var.setRequiredFeatures(z0(strTrim));
                    break;
                case 22:
                    g0Var.setRequiredExtensions(strTrim);
                    break;
                case 23:
                    g0Var.setSystemLanguage(F0(strTrim));
                    break;
                case 24:
                    g0Var.setRequiredFormats(A0(strTrim));
                    break;
                case 25:
                    List listI0 = i0(strTrim);
                    g0Var.setRequiredFonts(listI0 != null ? new HashSet(listI0) : new HashSet(0));
                    break;
            }
        }
    }

    private static g.e0.c C0(String str) {
        if ("butt".equals(str)) {
            return g.e0.c.Butt;
        }
        if ("round".equals(str)) {
            return g.e0.c.Round;
        }
        if ("square".equals(str)) {
            return g.e0.c.Square;
        }
        return null;
    }

    private void D(g.l0 l0Var, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l0Var.f3549c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    l0Var.f3550d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        l0Var.f3550d = Boolean.TRUE;
                        return;
                    }
                    throw new a1.j("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    private static g.e0.d D0(String str) {
        if ("miter".equals(str)) {
            return g.e0.d.Miter;
        }
        if ("round".equals(str)) {
            return g.e0.d.Round;
        }
        if ("bevel".equals(str)) {
            return g.e0.d.Bevel;
        }
        return null;
    }

    private void E(g.i iVar, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    g.p pVarO0 = o0(strTrim);
                    iVar.f3531q = pVarO0;
                    if (pVarO0.i()) {
                        throw new a1.j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    g.p pVarO02 = o0(strTrim);
                    iVar.f3532r = pVarO02;
                    if (pVarO02.i()) {
                        throw new a1.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    iVar.f3529o = o0(strTrim);
                    break;
                case 13:
                    iVar.f3530p = o0(strTrim);
                    break;
            }
        }
    }

    private static void E0(g.l0 l0Var, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strS = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String strU = iVar.u(';');
            if (strU == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l0Var.f3552f == null) {
                    l0Var.f3552f = new g.e0();
                }
                S0(l0Var.f3552f, strS, strU);
                iVar.A();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F(a1.g.j r5, org.xml.sax.Attributes r6) throws a1.j {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L90
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = a1.k.a.f3682b
            java.lang.String r3 = r6.getLocalName(r0)
            a1.k$g r3 = a1.k.g.a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L72
            switch(r2) {
                case 32: goto L50;
                case 33: goto L49;
                case 34: goto L26;
                default: goto L25;
            }
        L25:
            goto L8c
        L26:
            a1.g$k r2 = a1.g.k.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.f3541k = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L8c
        L2d:
            a1.j r5 = new a1.j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "\" is not a valid value."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L49:
            android.graphics.Matrix r1 = r4.J0(r1)
            r5.f3540j = r1
            goto L8c
        L50:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.f3539i = r1
            goto L8c
        L5d:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.f3539i = r1
            goto L8c
        L6a:
            a1.j r5 = new a1.j
            java.lang.String r6 = "Invalid value for attribute gradientUnits"
            r5.<init>(r6)
            throw r5
        L72:
            java.lang.String r2 = ""
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8a
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8c
        L8a:
            r5.f3542l = r1
        L8c:
            int r0 = r0 + 1
            goto L1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.k.F(a1.g$j, org.xml.sax.Attributes):void");
    }

    private static Set F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, "", "").getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    private void G(g.o oVar, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                oVar.f3562q = o0(strTrim);
            } else if (i11 == 2) {
                oVar.f3563r = o0(strTrim);
            } else if (i11 == 3) {
                g.p pVarO0 = o0(strTrim);
                oVar.f3564s = pVarO0;
                if (pVarO0.i()) {
                    throw new a1.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.p pVarO02 = o0(strTrim);
                oVar.f3565t = pVarO02;
                if (pVarO02.i()) {
                    throw new a1.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    w0(oVar, strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                oVar.f3561p = strTrim;
            }
        }
    }

    private static g.e0.f G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return g.e0.f.Middle;
            case "end":
                return g.e0.f.End;
            case "start":
                return g.e0.f.Start;
            default:
                return null;
        }
    }

    private void H(g.q qVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    qVar.f3570o = o0(strTrim);
                    break;
                case 16:
                    qVar.f3571p = o0(strTrim);
                    break;
                case 17:
                    qVar.f3572q = o0(strTrim);
                    break;
                case 18:
                    qVar.f3573r = o0(strTrim);
                    break;
            }
        }
    }

    private static g.e0.EnumC0002g H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return g.e0.EnumC0002g.LineThrough;
            case "underline":
                return g.e0.EnumC0002g.Underline;
            case "none":
                return g.e0.EnumC0002g.None;
            case "blink":
                return g.e0.EnumC0002g.Blink;
            case "overline":
                return g.e0.EnumC0002g.Overline;
            default:
                return null;
        }
    }

    private void I(g.m0 m0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    m0Var.f3555m = o0(strTrim);
                    break;
                case 16:
                    m0Var.f3556n = o0(strTrim);
                    break;
                case 17:
                    m0Var.f3557o = o0(strTrim);
                    break;
                case 18:
                    m0Var.f3558p = o0(strTrim);
                    break;
            }
        }
    }

    private static g.e0.h I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return g.e0.h.LTR;
        }
        if (str.equals("rtl")) {
            return g.e0.h.RTL;
        }
        return null;
    }

    private void J(g.r rVar, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 26:
                    rVar.f3580r = o0(strTrim);
                    break;
                case 27:
                    rVar.f3581s = o0(strTrim);
                    break;
                case 28:
                    g.p pVarO0 = o0(strTrim);
                    rVar.f3582t = pVarO0;
                    if (pVarO0.i()) {
                        throw new a1.j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    g.p pVarO02 = o0(strTrim);
                    rVar.f3583u = pVarO02;
                    if (pVarO02.i()) {
                        throw new a1.j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new a1.j("Invalid value for attribute markerUnits");
                        }
                        rVar.f3579q = true;
                    } else {
                        rVar.f3579q = false;
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        rVar.f3584v = Float.valueOf(Float.NaN);
                    } else {
                        rVar.f3584v = Float.valueOf(f0(strTrim));
                    }
                    break;
            }
        }
    }

    private Matrix J0(String str) throws a1.j {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String strO = iVar.o();
            if (strO == null) {
                throw new a1.j("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    iVar.A();
                    float fN = iVar.n();
                    iVar.z();
                    float fN2 = iVar.n();
                    iVar.z();
                    float fN3 = iVar.n();
                    iVar.z();
                    float fN4 = iVar.n();
                    iVar.z();
                    float fN5 = iVar.n();
                    iVar.z();
                    float fN6 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN6) || !iVar.f(')')) {
                        throw new a1.j("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    iVar.A();
                    float fN7 = iVar.n();
                    float fX = iVar.x();
                    float fX2 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN7) || !iVar.f(')')) {
                        throw new a1.j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fX2)) {
                            throw new a1.j("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fN7, fX, fX2);
                    }
                    break;
                    break;
                case "scale":
                    iVar.A();
                    float fN8 = iVar.n();
                    float fX3 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN8) || !iVar.f(')')) {
                        throw new a1.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX3)) {
                        matrix.preScale(fN8, fX3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    iVar.A();
                    float fN9 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN9) || !iVar.f(')')) {
                        throw new a1.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    iVar.A();
                    float fN10 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN10) || !iVar.f(')')) {
                        throw new a1.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    iVar.A();
                    float fN11 = iVar.n();
                    float fX4 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN11) || !iVar.f(')')) {
                        throw new a1.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX4)) {
                        matrix.preTranslate(fN11, fX4);
                    } else {
                        matrix.preTranslate(fN11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new a1.j("Invalid transform list fn: " + strO + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    private void K(g.s sVar, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                sVar.f3588q = o0(strTrim);
            } else if (i11 == 2) {
                sVar.f3589r = o0(strTrim);
            } else if (i11 == 3) {
                g.p pVarO0 = o0(strTrim);
                sVar.f3590s = pVarO0;
                if (pVarO0.i()) {
                    throw new a1.j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.p pVarO02 = o0(strTrim);
                sVar.f3591t = pVarO02;
                if (pVarO02.i()) {
                    throw new a1.j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    sVar.f3587p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new a1.j("Invalid value for attribute maskContentUnits");
                    }
                    sVar.f3587p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                sVar.f3586o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new a1.j("Invalid value for attribute maskUnits");
                }
                sVar.f3586o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) throws a1.j {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new a1.j("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new a1.j("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new a1.j("SVG parse error", e12);
        }
    }

    private void L(g.v vVar, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                vVar.f3596o = u0(strTrim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(f0(strTrim));
                vVar.f3597p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new a1.j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z10) throws a1.j {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        i iVar = new i(xmlPullParserNewPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType == 10) {
                        if (z10 && this.f3672a.m() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                K0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        c1(xmlPullParserNewPullParser.getText());
                    }
                }
                o();
            } catch (XmlPullParserException e10) {
                throw new a1.j("XML parser problem", e10);
            }
        } catch (IOException e11) {
            throw new a1.j("Stream error", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void M(a1.g.y r6, org.xml.sax.Attributes r7) throws a1.j {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.k.M(a1.g$y, org.xml.sax.Attributes):void");
    }

    private static g.e0.i M0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return g.e0.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return g.e0.i.NonScalingStroke;
        }
        return null;
    }

    private void N(g.z zVar, Attributes attributes, String str) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float fN = iVar.n();
                    if (Float.isNaN(fN)) {
                        throw new a1.j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float fN2 = iVar.n();
                    if (Float.isNaN(fN2)) {
                        throw new a1.j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                zVar.f3612o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    zVar.f3612o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    private static g.b N0(String str) throws a1.j {
        i iVar = new i(str);
        iVar.A();
        float fN = iVar.n();
        iVar.z();
        float fN2 = iVar.n();
        iVar.z();
        float fN3 = iVar.n();
        iVar.z();
        float fN4 = iVar.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new a1.j("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < 0.0f) {
            throw new a1.j("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= 0.0f) {
            return new g.b(fN, fN2, fN3, fN4);
        }
        throw new a1.j("Invalid viewBox. height cannot be negative");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void O(a1.g.q0 r5, org.xml.sax.Attributes r6) throws a1.j {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L5e
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = a1.k.a.f3682b
            java.lang.String r3 = r6.getLocalName(r0)
            a1.k$g r3 = a1.k.g.a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 35
            if (r2 == r3) goto L55
            r3 = 36
            if (r2 == r3) goto L4e
            switch(r2) {
                case 12: goto L47;
                case 13: goto L40;
                case 14: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L5b
        L2b:
            a1.g$p r1 = o0(r1)
            r5.f3576o = r1
            boolean r1 = r1.i()
            if (r1 != 0) goto L38
            goto L5b
        L38:
            a1.j r5 = new a1.j
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L40:
            a1.g$p r1 = o0(r1)
            r5.f3575n = r1
            goto L5b
        L47:
            a1.g$p r1 = o0(r1)
            r5.f3574m = r1
            goto L5b
        L4e:
            a1.g$p r1 = o0(r1)
            r5.f3578q = r1
            goto L5b
        L55:
            a1.g$p r1 = o0(r1)
            r5.f3577p = r1
        L5b:
            int r0 = r0 + 1
            goto L1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.k.O(a1.g$q0, org.xml.sax.Attributes):void");
    }

    private void O0(Attributes attributes) throws a1.j {
        l("<path>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.v vVar = new g.v();
        vVar.f3559a = this.f3672a;
        vVar.f3560b = this.f3673b;
        D(vVar, attributes);
        S(vVar, attributes);
        W(vVar, attributes);
        C(vVar, attributes);
        L(vVar, attributes);
        this.f3673b.a(vVar);
    }

    private void P(g.b0 b0Var, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b0Var.f3422o = o0(strTrim);
            } else if (i11 == 2) {
                b0Var.f3423p = o0(strTrim);
            } else if (i11 == 3) {
                g.p pVarO0 = o0(strTrim);
                b0Var.f3424q = pVarO0;
                if (pVarO0.i()) {
                    throw new a1.j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.p pVarO02 = o0(strTrim);
                b0Var.f3425r = pVarO02;
                if (pVarO02.i()) {
                    throw new a1.j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                g.p pVarO03 = o0(strTrim);
                b0Var.f3426s = pVarO03;
                if (pVarO03.i()) {
                    throw new a1.j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                g.p pVarO04 = o0(strTrim);
                b0Var.f3427t = pVarO04;
                if (pVarO04.i()) {
                    throw new a1.j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) throws a1.j {
        l("<pattern>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.y yVar = new g.y();
        yVar.f3559a = this.f3672a;
        yVar.f3560b = this.f3673b;
        D(yVar, attributes);
        S(yVar, attributes);
        C(yVar, attributes);
        Y(yVar, attributes);
        M(yVar, attributes);
        this.f3673b.a(yVar);
        this.f3673b = yVar;
    }

    private void Q(g.f0 f0Var, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                f0Var.f3517q = o0(strTrim);
            } else if (i11 == 2) {
                f0Var.f3518r = o0(strTrim);
            } else if (i11 == 3) {
                g.p pVarO0 = o0(strTrim);
                f0Var.f3519s = pVarO0;
                if (pVarO0.i()) {
                    throw new a1.j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.p pVarO02 = o0(strTrim);
                f0Var.f3520t = pVarO02;
                if (pVarO02.i()) {
                    throw new a1.j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                f0Var.f3521u = strTrim;
            }
        }
    }

    private void Q0(Attributes attributes) throws a1.j {
        l("<polygon>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.z a0Var = new g.a0();
        a0Var.f3559a = this.f3672a;
        a0Var.f3560b = this.f3673b;
        D(a0Var, attributes);
        S(a0Var, attributes);
        W(a0Var, attributes);
        C(a0Var, attributes);
        N(a0Var, attributes, "polygon");
        this.f3673b.a(a0Var);
    }

    private void R(g.d0 d0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()] == 37) {
                d0Var.f3437h = n0(strTrim);
            }
        }
    }

    private void R0(Attributes attributes) throws a1.j {
        l("<polyline>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.z zVar = new g.z();
        zVar.f3559a = this.f3672a;
        zVar.f3560b = this.f3673b;
        D(zVar, attributes);
        S(zVar, attributes);
        W(zVar, attributes);
        C(zVar, attributes);
        N(zVar, attributes, "polyline");
        this.f3673b.a(zVar);
    }

    private void S(g.l0 l0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    E0(l0Var, strTrim);
                } else if (i11 != 46) {
                    if (l0Var.f3551e == null) {
                        l0Var.f3551e = new g.e0();
                    }
                    S0(l0Var.f3551e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    l0Var.f3553g = a1.b.f(strTrim);
                }
            }
        }
    }

    static void S0(g.e0 e0Var, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f3682b[g.a(str).ordinal()]) {
                case 47:
                    g.o0 o0VarT0 = t0(str2);
                    e0Var.f3450c = o0VarT0;
                    if (o0VarT0 != null) {
                        e0Var.f3449b |= 1;
                    }
                    break;
                case 48:
                    g.e0.a aVarE0 = e0(str2);
                    e0Var.f3451d = aVarE0;
                    if (aVarE0 != null) {
                        e0Var.f3449b |= 2;
                    }
                    break;
                case 49:
                    Float fR0 = r0(str2);
                    e0Var.f3452e = fR0;
                    if (fR0 != null) {
                        e0Var.f3449b |= 4;
                    }
                    break;
                case 50:
                    g.o0 o0VarT02 = t0(str2);
                    e0Var.f3453f = o0VarT02;
                    if (o0VarT02 != null) {
                        e0Var.f3449b |= 8;
                    }
                    break;
                case 51:
                    Float fR02 = r0(str2);
                    e0Var.f3454g = fR02;
                    if (fR02 != null) {
                        e0Var.f3449b |= 16;
                    }
                    break;
                case 52:
                    e0Var.f3455h = o0(str2);
                    e0Var.f3449b |= 32;
                    break;
                case 53:
                    g.e0.c cVarC0 = C0(str2);
                    e0Var.f3456i = cVarC0;
                    if (cVarC0 != null) {
                        e0Var.f3449b |= 64;
                    }
                    break;
                case 54:
                    g.e0.d dVarD0 = D0(str2);
                    e0Var.f3457j = dVarD0;
                    if (dVarD0 != null) {
                        e0Var.f3449b |= 128;
                    }
                    break;
                case 55:
                    e0Var.f3458k = Float.valueOf(f0(str2));
                    e0Var.f3449b |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        g.p[] pVarArrB0 = B0(str2);
                        e0Var.f3459l = pVarArrB0;
                        if (pVarArrB0 != null) {
                            e0Var.f3449b |= 512;
                        }
                    } else {
                        e0Var.f3459l = null;
                        e0Var.f3449b |= 512;
                    }
                    break;
                case 57:
                    e0Var.f3460m = o0(str2);
                    e0Var.f3449b |= 1024;
                    break;
                case 58:
                    e0Var.f3461n = r0(str2);
                    e0Var.f3449b |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    break;
                case 59:
                    e0Var.f3462o = b0(str2);
                    e0Var.f3449b |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    break;
                case 60:
                    h0(e0Var, str2);
                    break;
                case 61:
                    List listI0 = i0(str2);
                    e0Var.f3463p = listI0;
                    if (listI0 != null) {
                        e0Var.f3449b |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    }
                    break;
                case 62:
                    g.p pVarJ0 = j0(str2);
                    e0Var.f3464q = pVarJ0;
                    if (pVarJ0 != null) {
                        e0Var.f3449b |= 16384;
                    }
                    break;
                case 63:
                    Integer numL0 = l0(str2);
                    e0Var.f3465r = numL0;
                    if (numL0 != null) {
                        e0Var.f3449b |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                    }
                    break;
                case 64:
                    g.e0.b bVarK0 = k0(str2);
                    e0Var.f3466s = bVarK0;
                    if (bVarK0 != null) {
                        e0Var.f3449b |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                    }
                    break;
                case 65:
                    g.e0.EnumC0002g enumC0002gH0 = H0(str2);
                    e0Var.f3467t = enumC0002gH0;
                    if (enumC0002gH0 != null) {
                        e0Var.f3449b |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                    }
                    break;
                case 66:
                    g.e0.h hVarI0 = I0(str2);
                    e0Var.f3468u = hVarI0;
                    if (hVarI0 != null) {
                        e0Var.f3449b |= 68719476736L;
                    }
                    break;
                case 67:
                    g.e0.f fVarG0 = G0(str2);
                    e0Var.f3469v = fVarG0;
                    if (fVarG0 != null) {
                        e0Var.f3449b |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    }
                    break;
                case 68:
                    Boolean boolS0 = s0(str2);
                    e0Var.f3470w = boolS0;
                    if (boolS0 != null) {
                        e0Var.f3449b |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                    }
                    break;
                case 69:
                    String strM0 = m0(str2, str);
                    e0Var.f3472y = strM0;
                    e0Var.f3473z = strM0;
                    e0Var.A = strM0;
                    e0Var.f3449b |= 14680064;
                    break;
                case 70:
                    e0Var.f3472y = m0(str2, str);
                    e0Var.f3449b |= 2097152;
                    break;
                case 71:
                    e0Var.f3473z = m0(str2, str);
                    e0Var.f3449b |= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                    break;
                case 72:
                    e0Var.A = m0(str2, str);
                    e0Var.f3449b |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e0Var.B = Boolean.valueOf(!str2.equals("none"));
                            e0Var.f3449b |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e0Var.C = Boolean.valueOf(str2.equals("visible"));
                            e0Var.f3449b |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e0Var.D = g.C0003g.a();
                    } else {
                        try {
                            e0Var.D = b0(str2);
                        } catch (a1.j e10) {
                            Log.w("SVGParser", e10.getMessage());
                            return;
                        }
                    }
                    e0Var.f3449b |= 67108864;
                    break;
                case 76:
                    e0Var.E = r0(str2);
                    e0Var.f3449b |= 134217728;
                    break;
                case 77:
                    g.c cVarA0 = a0(str2);
                    e0Var.f3471x = cVarA0;
                    if (cVarA0 != null) {
                        e0Var.f3449b |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    }
                    break;
                case 78:
                    e0Var.F = m0(str2, str);
                    e0Var.f3449b |= 268435456;
                    break;
                case 79:
                    e0Var.G = e0(str2);
                    e0Var.f3449b |= 536870912;
                    break;
                case 80:
                    e0Var.H = m0(str2, str);
                    e0Var.f3449b |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e0Var.I = g.C0003g.a();
                    } else {
                        try {
                            e0Var.I = b0(str2);
                        } catch (a1.j e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                    }
                    e0Var.f3449b |= 2147483648L;
                    break;
                case 82:
                    e0Var.J = r0(str2);
                    e0Var.f3449b |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e0Var.K = g.C0003g.a();
                    } else {
                        try {
                            e0Var.K = b0(str2);
                        } catch (a1.j e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    e0Var.f3449b |= 8589934592L;
                    break;
                case 84:
                    e0Var.L = r0(str2);
                    e0Var.f3449b |= 17179869184L;
                    break;
                case 85:
                    g.e0.i iVarM0 = M0(str2);
                    e0Var.M = iVarM0;
                    if (iVarM0 != null) {
                        e0Var.f3449b |= 34359738368L;
                    }
                    break;
                case 86:
                    g.e0.e eVarY0 = y0(str2);
                    e0Var.N = eVarY0;
                    if (eVarY0 != null) {
                        e0Var.f3449b |= 137438953472L;
                    }
                    break;
            }
        } catch (a1.j unused) {
        }
    }

    private void T(g.u0 u0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()] == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                u0Var.f3594o = strTrim;
            }
        }
    }

    private void T0(Attributes attributes) throws a1.j {
        l("<radialGradient>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.q0 q0Var = new g.q0();
        q0Var.f3559a = this.f3672a;
        q0Var.f3560b = this.f3673b;
        D(q0Var, attributes);
        S(q0Var, attributes);
        F(q0Var, attributes);
        O(q0Var, attributes);
        this.f3673b.a(q0Var);
        this.f3673b = q0Var;
    }

    private void U(g.z0 z0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    z0Var.f3614p = o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                z0Var.f3613o = strTrim;
            }
        }
    }

    private void U0(Attributes attributes) throws a1.j {
        l("<rect>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.b0 b0Var = new g.b0();
        b0Var.f3559a = this.f3672a;
        b0Var.f3560b = this.f3673b;
        D(b0Var, attributes);
        S(b0Var, attributes);
        W(b0Var, attributes);
        C(b0Var, attributes);
        P(b0Var, attributes);
        this.f3673b.a(b0Var);
    }

    private void V(g.a1 a1Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a1Var.f3414o = p0(strTrim);
            } else if (i11 == 2) {
                a1Var.f3415p = p0(strTrim);
            } else if (i11 == 19) {
                a1Var.f3416q = p0(strTrim);
            } else if (i11 == 20) {
                a1Var.f3417r = p0(strTrim);
            }
        }
    }

    private void V0(Attributes attributes) throws a1.j {
        l("<solidColor>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.c0 c0Var = new g.c0();
        c0Var.f3559a = this.f3672a;
        c0Var.f3560b = this.f3673b;
        D(c0Var, attributes);
        S(c0Var, attributes);
        this.f3673b.a(c0Var);
        this.f3673b = c0Var;
    }

    private void W(g.n nVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.transform) {
                nVar.setTransform(J0(attributes.getValue(i10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        this.f3672a = new a1.g();
    }

    private void X(g.e1 e1Var, Attributes attributes) throws a1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                e1Var.f3510q = o0(strTrim);
            } else if (i11 == 2) {
                e1Var.f3511r = o0(strTrim);
            } else if (i11 == 3) {
                g.p pVarO0 = o0(strTrim);
                e1Var.f3512s = pVarO0;
                if (pVarO0.i()) {
                    throw new a1.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.p pVarO02 = o0(strTrim);
                e1Var.f3513t = pVarO02;
                if (pVarO02.i()) {
                    throw new a1.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                e1Var.f3509p = strTrim;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(String str, String str2, String str3, Attributes attributes) throws a1.j {
        if (this.f3674c) {
            this.f3675d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarA = h.a(str2);
            switch (a.f3681a[hVarA.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f3676e = true;
                    this.f3677f = hVarA;
                    break;
                case 24:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.f3674c = true;
                    this.f3675d = 1;
                    break;
            }
        }
    }

    private void Y(g.r0 r0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                w0(r0Var, strTrim);
            } else if (i11 == 87) {
                r0Var.f3585p = N0(strTrim);
            }
        }
    }

    private void Y0(Attributes attributes) throws a1.j {
        l("<stop>", new Object[0]);
        g.j0 j0Var = this.f3673b;
        if (j0Var == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof g.j)) {
            throw new a1.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        g.d0 d0Var = new g.d0();
        d0Var.f3559a = this.f3672a;
        d0Var.f3560b = this.f3673b;
        D(d0Var, attributes);
        S(d0Var, attributes);
        R(d0Var, attributes);
        this.f3673b.a(d0Var);
        this.f3673b = d0Var;
    }

    private void Z(String str) {
        this.f3672a.a(new a1.b(b.f.screen, b.u.Document).d(str));
    }

    private void Z0(Attributes attributes) throws a1.j {
        l("<style>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f3682b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i11 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && a1.b.b(str, b.f.screen)) {
            this.f3679h = true;
        } else {
            this.f3674c = true;
            this.f3675d = 1;
        }
    }

    private static g.c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        g.p pVarQ0 = q0(iVar);
        iVar.z();
        g.p pVarQ02 = q0(iVar);
        iVar.z();
        g.p pVarQ03 = q0(iVar);
        iVar.z();
        g.p pVarQ04 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new g.c(pVarQ0, pVarQ02, pVarQ03, pVarQ04);
        }
        return null;
    }

    private void a1(Attributes attributes) throws a1.j {
        l("<svg>", new Object[0]);
        g.f0 f0Var = new g.f0();
        f0Var.f3559a = this.f3672a;
        f0Var.f3560b = this.f3673b;
        D(f0Var, attributes);
        S(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        Q(f0Var, attributes);
        g.j0 j0Var = this.f3673b;
        if (j0Var == null) {
            this.f3672a.u(f0Var);
        } else {
            j0Var.a(f0Var);
        }
        this.f3673b = f0Var;
    }

    private static g.f b0(String str) throws a1.j {
        if (str.charAt(0) == '#') {
            a1.c cVarB = a1.c.b(str, 1, str.length());
            if (cVarB == null) {
                throw new a1.j("Bad hex colour value: " + str);
            }
            int iA = cVarB.a();
            if (iA == 4) {
                int iD = cVarB.d();
                int i10 = iD & 3840;
                int i11 = iD & 240;
                int i12 = iD & 15;
                return new g.f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (iA == 5) {
                int iD2 = cVarB.d();
                int i13 = 61440 & iD2;
                int i14 = iD2 & 3840;
                int i15 = iD2 & 240;
                int i16 = iD2 & 15;
                return new g.f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (iA == 7) {
                return new g.f(cVarB.d() | ViewCompat.MEASURED_STATE_MASK);
            }
            if (iA == 9) {
                return new g.f((cVarB.d() >>> 8) | (cVarB.d() << 24));
            }
            throw new a1.j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(zStartsWith2 ? 5 : 4));
            iVar.A();
            float fN = iVar.n();
            float fD = iVar.d(fN);
            if (!Float.isNaN(fD)) {
                iVar.f('%');
            }
            float fD2 = iVar.d(fD);
            if (!Float.isNaN(fD2)) {
                iVar.f('%');
            }
            if (!zStartsWith2) {
                iVar.A();
                if (!Float.isNaN(fD2) && iVar.f(')')) {
                    return new g.f(s(fN, fD, fD2) | ViewCompat.MEASURED_STATE_MASK);
                }
                throw new a1.j("Bad hsl() colour value: " + str);
            }
            float fD3 = iVar.d(fD2);
            iVar.A();
            if (!Float.isNaN(fD3) && iVar.f(')')) {
                return new g.f((j(fD3 * 256.0f) << 24) | s(fN, fD, fD2));
            }
            throw new a1.j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(zStartsWith ? 5 : 4));
        iVar2.A();
        float fN2 = iVar2.n();
        if (!Float.isNaN(fN2) && iVar2.f('%')) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = iVar2.d(fN2);
        if (!Float.isNaN(fD4) && iVar2.f('%')) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = iVar2.d(fD4);
        if (!Float.isNaN(fD5) && iVar2.f('%')) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            iVar2.A();
            if (!Float.isNaN(fD5) && iVar2.f(')')) {
                return new g.f((j(fN2) << 16) | ViewCompat.MEASURED_STATE_MASK | (j(fD4) << 8) | j(fD5));
            }
            throw new a1.j("Bad rgb() colour value: " + str);
        }
        float fD6 = iVar2.d(fD5);
        iVar2.A();
        if (!Float.isNaN(fD6) && iVar2.f(')')) {
            return new g.f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new a1.j("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) throws a1.j {
        l("<symbol>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.r0 t0Var = new g.t0();
        t0Var.f3559a = this.f3672a;
        t0Var.f3560b = this.f3673b;
        D(t0Var, attributes);
        S(t0Var, attributes);
        C(t0Var, attributes);
        Y(t0Var, attributes);
        this.f3673b.a(t0Var);
        this.f3673b = t0Var;
    }

    private static g.f c0(String str) throws a1.j {
        Integer numA = c.a(str);
        if (numA != null) {
            return new g.f(numA.intValue());
        }
        throw new a1.j("Invalid colour keyword: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str) {
        if (this.f3674c) {
            return;
        }
        if (this.f3676e) {
            if (this.f3678g == null) {
                this.f3678g = new StringBuilder(str.length());
            }
            this.f3678g.append(str);
        } else if (this.f3679h) {
            if (this.f3680i == null) {
                this.f3680i = new StringBuilder(str.length());
            }
            this.f3680i.append(str);
        } else if (this.f3673b instanceof g.y0) {
            h(str);
        }
    }

    private static g.o0 d0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return g.f.f3515d;
        }
        if (str.equals("currentColor")) {
            return g.C0003g.a();
        }
        try {
            return b0(str);
        } catch (a1.j unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) throws a1.j {
        l("<text>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.w0 w0Var = new g.w0();
        w0Var.f3559a = this.f3672a;
        w0Var.f3560b = this.f3673b;
        D(w0Var, attributes);
        S(w0Var, attributes);
        W(w0Var, attributes);
        C(w0Var, attributes);
        V(w0Var, attributes);
        this.f3673b.a(w0Var);
        this.f3673b = w0Var;
    }

    private static g.e0.a e0(String str) {
        if ("nonzero".equals(str)) {
            return g.e0.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return g.e0.a.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i10, int i11) {
        if (this.f3674c) {
            return;
        }
        if (this.f3676e) {
            if (this.f3678g == null) {
                this.f3678g = new StringBuilder(i11);
            }
            this.f3678g.append(cArr, i10, i11);
        } else if (this.f3679h) {
            if (this.f3680i == null) {
                this.f3680i = new StringBuilder(i11);
            }
            this.f3680i.append(cArr, i10, i11);
        } else if (this.f3673b instanceof g.y0) {
            h(new String(cArr, i10, i11));
        }
    }

    private static float f0(String str) throws a1.j {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new a1.j("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) throws a1.j {
        l("<textPath>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.z0 z0Var = new g.z0();
        z0Var.f3559a = this.f3672a;
        z0Var.f3560b = this.f3673b;
        D(z0Var, attributes);
        S(z0Var, attributes);
        C(z0Var, attributes);
        U(z0Var, attributes);
        this.f3673b.a(z0Var);
        this.f3673b = z0Var;
        g.j0 j0Var = z0Var.f3560b;
        if (j0Var instanceof g.b1) {
            z0Var.c((g.b1) j0Var);
        } else {
            z0Var.c(((g.x0) j0Var).getTextRoot());
        }
    }

    private static float g0(String str, int i10, int i11) throws a1.j {
        float fB = new a1.d().b(str, i10, i11);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new a1.j("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) throws a1.j {
        l("<tref>", new Object[0]);
        g.j0 j0Var = this.f3673b;
        if (j0Var == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof g.y0)) {
            throw new a1.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        g.u0 u0Var = new g.u0();
        u0Var.f3559a = this.f3672a;
        u0Var.f3560b = this.f3673b;
        D(u0Var, attributes);
        S(u0Var, attributes);
        C(u0Var, attributes);
        T(u0Var, attributes);
        this.f3673b.a(u0Var);
        g.j0 j0Var2 = u0Var.f3560b;
        if (j0Var2 instanceof g.b1) {
            u0Var.c((g.b1) j0Var2);
        } else {
            u0Var.c(((g.x0) j0Var2).getTextRoot());
        }
    }

    private void h(String str) {
        g.h0 h0Var = (g.h0) this.f3673b;
        int size = h0Var.f3523i.size();
        g.n0 n0Var = size == 0 ? null : (g.n0) h0Var.f3523i.get(size - 1);
        if (!(n0Var instanceof g.c1)) {
            this.f3673b.a(new g.c1(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        g.c1 c1Var = (g.c1) n0Var;
        sb2.append(c1Var.f3432c);
        sb2.append(str);
        c1Var.f3432c = sb2.toString();
    }

    private static void h0(g.e0 e0Var, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer numA = null;
            g.e0.b bVarK0 = null;
            String str2 = null;
            while (true) {
                strS = iVar.s(IOUtils.DIR_SEPARATOR_UNIX);
                iVar.A();
                if (strS != null) {
                    if (numA != null && bVarK0 != null) {
                        break;
                    }
                    if (!strS.equals(Constants.NORMAL) && (numA != null || (numA = e.a(strS)) == null)) {
                        if (bVarK0 != null || (bVarK0 = k0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            g.p pVarJ0 = j0(strS);
            if (iVar.f(IOUtils.DIR_SEPARATOR_UNIX)) {
                iVar.A();
                String strR = iVar.r();
                if (strR != null) {
                    try {
                        o0(strR);
                    } catch (a1.j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e0Var.f3463p = i0(iVar.y());
            e0Var.f3464q = pVarJ0;
            e0Var.f3465r = Integer.valueOf(numA == null ? 400 : numA.intValue());
            if (bVarK0 == null) {
                bVarK0 = g.e0.b.Normal;
            }
            e0Var.f3466s = bVarK0;
            e0Var.f3449b |= 122880;
        }
    }

    private void h1(Attributes attributes) throws a1.j {
        l("<tspan>", new Object[0]);
        g.j0 j0Var = this.f3673b;
        if (j0Var == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof g.y0)) {
            throw new a1.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        g.v0 v0Var = new g.v0();
        v0Var.f3559a = this.f3672a;
        v0Var.f3560b = this.f3673b;
        D(v0Var, attributes);
        S(v0Var, attributes);
        C(v0Var, attributes);
        V(v0Var, attributes);
        this.f3673b.a(v0Var);
        this.f3673b = v0Var;
        g.j0 j0Var2 = v0Var.f3560b;
        if (j0Var2 instanceof g.b1) {
            v0Var.c((g.b1) j0Var2);
        } else {
            v0Var.c(((g.x0) j0Var2).getTextRoot());
        }
    }

    private void i(Attributes attributes) throws a1.j {
        l("<circle>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.d dVar = new g.d();
        dVar.f3559a = this.f3672a;
        dVar.f3560b = this.f3673b;
        D(dVar, attributes);
        S(dVar, attributes);
        W(dVar, attributes);
        C(dVar, attributes);
        A(dVar, attributes);
        this.f3673b.a(dVar);
    }

    private static List i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String strQ = iVar.q();
            if (strQ == null) {
                strQ = iVar.u(',');
            }
            if (strQ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    private void i1(Attributes attributes) throws a1.j {
        l("<use>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.e1 e1Var = new g.e1();
        e1Var.f3559a = this.f3672a;
        e1Var.f3560b = this.f3673b;
        D(e1Var, attributes);
        S(e1Var, attributes);
        W(e1Var, attributes);
        C(e1Var, attributes);
        X(e1Var, attributes);
        this.f3673b.a(e1Var);
        this.f3673b = e1Var;
    }

    private static int j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    private static g.p j0(String str) {
        try {
            g.p pVarA = d.a(str);
            return pVarA == null ? o0(str) : pVarA;
        } catch (a1.j unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) throws a1.j {
        l("<view>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.r0 f1Var = new g.f1();
        f1Var.f3559a = this.f3672a;
        f1Var.f3560b = this.f3673b;
        D(f1Var, attributes);
        C(f1Var, attributes);
        Y(f1Var, attributes);
        this.f3673b.a(f1Var);
        this.f3673b = f1Var;
    }

    private void k(Attributes attributes) throws a1.j {
        l("<clipPath>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.e eVar = new g.e();
        eVar.f3559a = this.f3672a;
        eVar.f3560b = this.f3673b;
        D(eVar, attributes);
        S(eVar, attributes);
        W(eVar, attributes);
        C(eVar, attributes);
        B(eVar, attributes);
        this.f3673b.a(eVar);
        this.f3673b = eVar;
    }

    private static g.e0.b k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return g.e0.b.Oblique;
            case "italic":
                return g.e0.b.Italic;
            case "normal":
                return g.e0.b.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) throws a1.j {
        l("<switch>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.s0 s0Var = new g.s0();
        s0Var.f3559a = this.f3672a;
        s0Var.f3560b = this.f3673b;
        D(s0Var, attributes);
        S(s0Var, attributes);
        W(s0Var, attributes);
        C(s0Var, attributes);
        this.f3673b.a(s0Var);
        this.f3673b = s0Var;
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) throws a1.j {
        l("<defs>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.h hVar = new g.h();
        hVar.f3559a = this.f3672a;
        hVar.f3560b = this.f3673b;
        D(hVar, attributes);
        S(hVar, attributes);
        W(hVar, attributes);
        this.f3673b.a(hVar);
        this.f3673b = hVar;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) throws a1.j {
        l("<ellipse>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.i iVar = new g.i();
        iVar.f3559a = this.f3672a;
        iVar.f3560b = this.f3673b;
        D(iVar, attributes);
        S(iVar, attributes);
        W(iVar, attributes);
        C(iVar, attributes);
        E(iVar, attributes);
        this.f3673b.a(iVar);
    }

    private Float n0(String str) throws a1.j {
        if (str.length() == 0) {
            throw new a1.j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z10 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z10 = false;
        }
        try {
            float fG0 = g0(str, 0, length);
            float f10 = 100.0f;
            if (z10) {
                fG0 /= 100.0f;
            }
            if (fG0 < 0.0f) {
                f10 = 0.0f;
            } else if (fG0 <= 100.0f) {
                f10 = fG0;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new a1.j("Invalid offset value in <stop>: " + str, e10);
        }
    }

    static g.p o0(String str) throws a1.j {
        if (str.length() == 0) {
            throw new a1.j("Invalid length value (empty string)");
        }
        int length = str.length();
        g.d1 d1VarValueOf = g.d1.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d1VarValueOf = g.d1.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d1VarValueOf = g.d1.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new a1.j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new g.p(g0(str, 0, length), d1VarValueOf);
        } catch (NumberFormatException e10) {
            throw new a1.j("Invalid length value: " + str, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, String str2, String str3) {
        if (this.f3674c) {
            int i10 = this.f3675d - 1;
            this.f3675d = i10;
            if (i10 == 0) {
                this.f3674c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f3681a[h.a(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 22:
                    case 23:
                        this.f3676e = false;
                        StringBuilder sb2 = this.f3678g;
                        if (sb2 != null) {
                            h hVar = this.f3677f;
                            if (hVar == h.title) {
                                this.f3672a.v(sb2.toString());
                            } else if (hVar == h.desc) {
                                this.f3672a.s(sb2.toString());
                            }
                            this.f3678g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f3680i;
                        if (sb3 != null) {
                            this.f3679h = false;
                            Z(sb3.toString());
                            this.f3680i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f3673b = ((g.n0) this.f3673b).f3560b;
        }
    }

    private static List p0(String str) throws a1.j {
        if (str.length() == 0) {
            throw new a1.j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float fN = iVar.n();
            if (Float.isNaN(fN)) {
                throw new a1.j("Invalid length list value: " + iVar.b());
            }
            g.d1 d1VarV = iVar.v();
            if (d1VarV == null) {
                d1VarV = g.d1.px;
            }
            arrayList.add(new g.p(fN, d1VarV));
            iVar.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) throws a1.j {
        l("<g>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.m mVar = new g.m();
        mVar.f3559a = this.f3672a;
        mVar.f3560b = this.f3673b;
        D(mVar, attributes);
        S(mVar, attributes);
        W(mVar, attributes);
        C(mVar, attributes);
        this.f3673b.a(mVar);
        this.f3673b = mVar;
    }

    private static g.p q0(i iVar) {
        return iVar.g("auto") ? new g.p(0.0f) : iVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            a1.g.k();
        }
    }

    private static Float r0(String str) {
        try {
            float fF0 = f0(str);
            float f10 = 0.0f;
            if (fF0 < 0.0f) {
                fF0 = f10;
            } else {
                f10 = 1.0f;
                if (fF0 > 1.0f) {
                    fF0 = f10;
                }
            }
            return Float.valueOf(fF0);
        } catch (a1.j unused) {
            return null;
        }
    }

    private static int s(float f10, float f11, float f12) {
        float f13 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f11 / 100.0f;
        float f16 = f12 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        float f17 = f16 >= 0.0f ? f16 > 1.0f ? 1.0f : f16 : 0.0f;
        float f18 = f17 <= 0.5f ? (f15 + 1.0f) * f17 : (f17 + f15) - (f15 * f17);
        float f19 = (f17 * 2.0f) - f18;
        return j(t(f19, f18, f14 - 2.0f) * 256.0f) | (j(t(f19, f18, f14 + 2.0f) * 256.0f) << 16) | (j(t(f19, f18, f14) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static float t(float f10, float f11, float f12) {
        float f13;
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    private static g.o0 t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new g.u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new g.u(strTrim, strTrim2.length() > 0 ? d0(strTrim2) : null);
    }

    private void u(Attributes attributes) throws a1.j {
        l("<image>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.o oVar = new g.o();
        oVar.f3559a = this.f3672a;
        oVar.f3560b = this.f3673b;
        D(oVar, attributes);
        S(oVar, attributes);
        W(oVar, attributes);
        C(oVar, attributes);
        G(oVar, attributes);
        this.f3673b.a(oVar);
        this.f3673b = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0293, code lost:
    
        android.util.Log.e("SVGParser", "Bad path coords for " + ((char) r11) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0280 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static a1.g.w u0(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.k.u0(java.lang.String):a1.g$w");
    }

    private void v(Attributes attributes) throws a1.j {
        l("<line>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.q qVar = new g.q();
        qVar.f3559a = this.f3672a;
        qVar.f3560b = this.f3673b;
        D(qVar, attributes);
        S(qVar, attributes);
        W(qVar, attributes);
        C(qVar, attributes);
        H(qVar, attributes);
        this.f3673b.a(qVar);
    }

    static a1.e v0(String str) throws a1.j {
        e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String strR = iVar.r();
        if ("defer".equals(strR)) {
            iVar.A();
            strR = iVar.r();
        }
        e.a aVarA = b.a(strR);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String strR2 = iVar.r();
            strR2.getClass();
            if (strR2.equals("meet")) {
                bVar = e.b.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new a1.j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = e.b.slice;
            }
        }
        return new a1.e(aVarA, bVar);
    }

    private void w(Attributes attributes) throws a1.j {
        l("<linearGradient>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.m0 m0Var = new g.m0();
        m0Var.f3559a = this.f3672a;
        m0Var.f3560b = this.f3673b;
        D(m0Var, attributes);
        S(m0Var, attributes);
        F(m0Var, attributes);
        I(m0Var, attributes);
        this.f3673b.a(m0Var);
        this.f3673b = m0Var;
    }

    private static void w0(g.p0 p0Var, String str) {
        p0Var.f3569o = v0(str);
    }

    private void x(Attributes attributes) throws a1.j {
        l("<marker>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.r rVar = new g.r();
        rVar.f3559a = this.f3672a;
        rVar.f3560b = this.f3673b;
        D(rVar, attributes);
        S(rVar, attributes);
        C(rVar, attributes);
        Y(rVar, attributes);
        J(rVar, attributes);
        this.f3673b.a(rVar);
        this.f3673b = rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map x0(i iVar) {
        HashMap map = new HashMap();
        iVar.A();
        String strS = iVar.s(D5.T);
        while (strS != null) {
            iVar.f(D5.T);
            map.put(strS, iVar.q());
            iVar.A();
            strS = iVar.s(D5.T);
        }
        return map;
    }

    private void y(Attributes attributes) throws a1.j {
        l("<mask>", new Object[0]);
        if (this.f3673b == null) {
            throw new a1.j("Invalid document. Root element must be <svg>");
        }
        g.s sVar = new g.s();
        sVar.f3559a = this.f3672a;
        sVar.f3560b = this.f3673b;
        D(sVar, attributes);
        S(sVar, attributes);
        C(sVar, attributes);
        K(sVar, attributes);
        this.f3673b.a(sVar);
        this.f3673b = sVar;
    }

    private static g.e0.e y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return g.e0.e.optimizeQuality;
            case "auto":
                return g.e0.e.auto;
            case "optimizeSpeed":
                return g.e0.e.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    a1.g z(InputStream inputStream, boolean z10) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            L0(inputStream, z10);
            return this.f3672a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
    }

    private void l(String str, Object... objArr) {
    }
}
