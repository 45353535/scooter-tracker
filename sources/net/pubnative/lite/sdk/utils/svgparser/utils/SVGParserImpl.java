package net.pubnative.lite.sdk.utils.svgparser.utils;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;
import net.pubnative.lite.sdk.utils.svgparser.SVGParseException;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase;
import net.pubnative.lite.sdk.utils.svgparser.utils.Style;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
class SVGParserImpl implements SVGParser {
    static final String CURRENTCOLOR = "currentColor";
    public static final int ENTITY_WATCH_BUFFER_SIZE = 4096;
    private static final String FEATURE_STRING_PREFIX = "http://www.w3.org/TR/SVG11/feature#";
    static final String NONE = "none";
    private static final String SVG_NAMESPACE = "http://www.w3.org/2000/svg";
    private static final String TAG = "SVGParser";
    static final String VALID_DISPLAY_VALUES = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|";
    static final String VALID_VISIBILITY_VALUES = "|visible|hidden|collapse|";
    private static final String XLINK_NAMESPACE = "http://www.w3.org/1999/xlink";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE = "alternate";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE_NO = "no";
    public static final String XML_STYLESHEET_ATTR_HREF = "href";
    public static final String XML_STYLESHEET_ATTR_MEDIA = "media";
    public static final String XML_STYLESHEET_ATTR_MEDIA_ALL = "all";
    public static final String XML_STYLESHEET_ATTR_TYPE = "type";
    private static final String XML_STYLESHEET_PROCESSING_INSTRUCTION = "xml-stylesheet";
    private int ignoreDepth;
    private static final boolean FORCE_SAX_ON_EARLY_ANDROIDS = false;
    private static final Pattern PATTERN_BLOCK_COMMENTS = Pattern.compile("/\\*.*?\\*/");
    private SVGBase svgDocument = null;
    private SVGBase.SvgContainer currentElement = null;
    private boolean enableInternalEntities = true;
    private SVGExternalFileResolver externalFileResolver = null;
    private boolean ignoring = false;
    private boolean inMetadataElement = false;
    private SVGElem metadataTag = null;
    private StringBuilder metadataElementContents = null;
    private boolean inStyleElement = false;
    private StringBuilder styleElementContents = null;

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr;
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem;

        static {
            int[] iArr = new int[SVGAttr.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr = iArr;
            try {
                iArr[SVGAttr.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fr.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.offset.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.clipPathUnits.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.startOffset.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.patternUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.patternContentUnits.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.patternTransform.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.maskUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.maskContentUnits.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.style.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.CLASS.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.viewBox.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.type.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.media.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            int[] iArr2 = new int[SVGElem.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem = iArr2;
            try {
                iArr2[SVGElem.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.defs.ordinal()] = 3;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused81) {
            }
        }
    }

    private static class ColourKeywords {
        private static final Map<String, Integer> colourKeywords;

        static {
            HashMap map = new HashMap(47);
            colourKeywords = map;
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

        private ColourKeywords() {
        }

        static Integer get(String str) {
            return colourKeywords.get(str);
        }
    }

    private static class FontSizeKeywords {
        private static final Map<String, SVGBase.Length> fontSizeKeywords;

        static {
            HashMap map = new HashMap(9);
            fontSizeKeywords = map;
            SVGBase.Unit unit = SVGBase.Unit.pt;
            map.put("xx-small", new SVGBase.Length(0.694f, unit));
            map.put("x-small", new SVGBase.Length(0.833f, unit));
            map.put(Constants.SMALL, new SVGBase.Length(10.0f, unit));
            map.put("medium", new SVGBase.Length(12.0f, unit));
            map.put(Constants.LARGE, new SVGBase.Length(14.4f, unit));
            map.put("x-large", new SVGBase.Length(17.3f, unit));
            map.put("xx-large", new SVGBase.Length(20.7f, unit));
            SVGBase.Unit unit2 = SVGBase.Unit.percent;
            map.put("smaller", new SVGBase.Length(83.33f, unit2));
            map.put("larger", new SVGBase.Length(120.0f, unit2));
        }

        private FontSizeKeywords() {
        }

        static SVGBase.Length get(String str) {
            return fontSizeKeywords.get(str);
        }
    }

    private static class FontStretchKeywords {
        private static final Map<String, Float> fontStretchKeywords;

        static {
            HashMap map = new HashMap(9);
            fontStretchKeywords = map;
            map.put("ultra-condensed", Float.valueOf(50.0f));
            map.put("extra-condensed", Float.valueOf(62.5f));
            map.put("condensed", Float.valueOf(75.0f));
            map.put("semi-condensed", Float.valueOf(87.5f));
            map.put(Constants.NORMAL, Float.valueOf(100.0f));
            map.put("semi-expanded", Float.valueOf(112.5f));
            map.put("expanded", Float.valueOf(125.0f));
            map.put("extra-expanded", Float.valueOf(150.0f));
            map.put("ultra-expanded", Float.valueOf(200.0f));
        }

        private FontStretchKeywords() {
        }

        static boolean contains(String str) {
            return fontStretchKeywords.containsKey(str);
        }

        static Float get(String str) {
            return fontStretchKeywords.get(str);
        }
    }

    private static class FontWeightKeywords {
        private static final Map<String, Float> fontWeightKeywords;

        static {
            HashMap map = new HashMap(4);
            fontWeightKeywords = map;
            map.put(Constants.NORMAL, Float.valueOf(400.0f));
            map.put("bold", Float.valueOf(700.0f));
            map.put("bolder", Float.valueOf(Float.MAX_VALUE));
            map.put("lighter", Float.valueOf(Float.MIN_VALUE));
        }

        private FontWeightKeywords() {
        }

        static boolean contains(String str) {
            return fontWeightKeywords.containsKey(str);
        }

        static Float get(String str) {
            return fontWeightKeywords.get(str);
        }
    }

    private class SAXHandler extends DefaultHandler2 {
        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            SVGParserImpl.this.text(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            SVGParserImpl.this.endDocument();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SVGParseException {
            SVGParserImpl.this.endElement(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            SVGParserImpl.this.handleProcessingInstruction(str, SVGParserImpl.this.parseProcessingInstructionAttributes(new TextScanner(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            SVGParserImpl.this.startDocument();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
            SVGParserImpl.this.startElement(str, str2, str3, attributes);
        }

        private SAXHandler() {
        }
    }

    enum SVGAttr {
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
        fr,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_feature_settings,
        font_size,
        font_stretch,
        font_style,
        font_weight,
        font_kerning,
        font_variant,
        font_variant_ligatures,
        font_variant_position,
        font_variant_caps,
        font_variant_numeric,
        font_variant_east_asian,
        font_variation_settings,
        glyph_orientation_vertical,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        isolation,
        letter_spacing,
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
        mix_blend_mode,
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
        text_orientation,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        word_spacing,
        writing_mode,
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

        private static final Map<String, SVGAttr> cache = new HashMap();

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    cache.put("class", sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    cache.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = cache.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }
    }

    private enum SVGElem {
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

        private static final Map<String, SVGElem> cache = new HashMap();

        static {
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    cache.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    cache.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static SVGElem fromString(String str) {
            SVGElem sVGElem = cache.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    private static class XPPAttributesWrapper implements Attributes {
        private final XmlPullParser parser;

        public XPPAttributesWrapper(XmlPullParser xmlPullParser) {
            this.parser = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.parser.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.parser.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.parser.getAttributeName(i10);
            if (this.parser.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.parser.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.parser.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.parser.getAttributeValue(i10);
        }
    }

    SVGParserImpl() {
    }

    private void appendToTextContainer(String str) {
        SVGBase.SvgConditionalContainer svgConditionalContainer = (SVGBase.SvgConditionalContainer) this.currentElement;
        int size = svgConditionalContainer.getChildren().size();
        SVGBase.SvgObject svgObject = size == 0 ? null : svgConditionalContainer.getChildren().get(size - 1);
        if (!(svgObject instanceof SVGBase.TextSequence)) {
            this.currentElement.addChild(new SVGBase.TextSequence(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        SVGBase.TextSequence textSequence = (SVGBase.TextSequence) svgObject;
        sb2.append(textSequence.text);
        sb2.append(str);
        textSequence.text = sb2.toString();
    }

    private void circle(Attributes attributes) throws SVGParseException {
        debug("<circle>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Circle circle = new SVGBase.Circle();
        circle.document = this.svgDocument;
        circle.parent = this.currentElement;
        parseAttributesCore(circle, attributes);
        parseAttributesStyle(circle, attributes);
        parseAttributesTransform(circle, attributes);
        parseAttributesConditional(circle, attributes);
        parseAttributesCircle(circle, attributes);
        this.currentElement.addChild(circle);
    }

    private static int clamp255(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    private void clipPath(Attributes attributes) throws SVGParseException {
        debug("<clipPath>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.ClipPath clipPath = new SVGBase.ClipPath();
        clipPath.document = this.svgDocument;
        clipPath.parent = this.currentElement;
        parseAttributesCore(clipPath, attributes);
        parseAttributesStyle(clipPath, attributes);
        parseAttributesTransform(clipPath, attributes);
        parseAttributesConditional(clipPath, attributes);
        parseAttributesClipPath(clipPath, attributes);
        this.currentElement.addChild(clipPath);
        this.currentElement = clipPath;
    }

    private void debug(String str, Object... objArr) {
    }

    private void defs(Attributes attributes) throws SVGParseException {
        debug("<defs>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Defs defs = new SVGBase.Defs();
        defs.document = this.svgDocument;
        defs.parent = this.currentElement;
        parseAttributesCore(defs, attributes);
        parseAttributesStyle(defs, attributes);
        parseAttributesTransform(defs, attributes);
        this.currentElement.addChild(defs);
        this.currentElement = defs;
    }

    private void dumpNode(SVGBase.SvgObject svgObject, String str) {
    }

    private void ellipse(Attributes attributes) throws SVGParseException {
        debug("<ellipse>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Ellipse ellipse = new SVGBase.Ellipse();
        ellipse.document = this.svgDocument;
        ellipse.parent = this.currentElement;
        parseAttributesCore(ellipse, attributes);
        parseAttributesStyle(ellipse, attributes);
        parseAttributesTransform(ellipse, attributes);
        parseAttributesConditional(ellipse, attributes);
        parseAttributesEllipse(ellipse, attributes);
        this.currentElement.addChild(ellipse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endDocument() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endElement(String str, String str2, String str3) throws SVGParseException {
        if (this.ignoring) {
            int i10 = this.ignoreDepth - 1;
            this.ignoreDepth = i10;
            if (i10 == 0) {
                this.ignoring = false;
                return;
            }
            return;
        }
        if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[SVGElem.fromString(str2).ordinal()];
            if (i11 != 13 && i11 != 14 && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5) {
                switch (i11) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 31:
                        break;
                    case 22:
                    case 23:
                        this.inMetadataElement = false;
                        StringBuilder sb2 = this.metadataElementContents;
                        if (sb2 != null) {
                            SVGElem sVGElem = this.metadataTag;
                            if (sVGElem == SVGElem.title) {
                                this.svgDocument.setTitle(sb2.toString());
                            } else if (sVGElem == SVGElem.desc) {
                                this.svgDocument.setDesc(sb2.toString());
                            }
                            this.metadataElementContents.setLength(0);
                            return;
                        }
                        return;
                    case 30:
                        StringBuilder sb3 = this.styleElementContents;
                        if (sb3 != null) {
                            this.inStyleElement = false;
                            parseCSSStyleSheet(sb3.toString());
                            this.styleElementContents.setLength(0);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            Object obj = this.currentElement;
            if (obj == null) {
                throw new SVGParseException(String.format("Unbalanced end element </%s> found", str2));
            }
            this.currentElement = ((SVGBase.SvgObject) obj).parent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleProcessingInstruction(String str, Map<String, String> map) {
        String str2;
        String strResolveCSSStyleSheet;
        if (!str.equals(XML_STYLESHEET_PROCESSING_INSTRUCTION) || this.externalFileResolver == null) {
            return;
        }
        if (map.get("type") == null || "text/css".equals(map.get("type"))) {
            if ((map.get(XML_STYLESHEET_ATTR_ALTERNATE) != null && !XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(map.get(XML_STYLESHEET_ATTR_ALTERNATE))) || (str2 = map.get(XML_STYLESHEET_ATTR_HREF)) == null || (strResolveCSSStyleSheet = this.externalFileResolver.resolveCSSStyleSheet(str2)) == null) {
                return;
            }
            String str3 = map.get("media");
            if (str3 != null && !"all".equals(str3.trim())) {
                strResolveCSSStyleSheet = "@media " + str3 + " { " + strResolveCSSStyleSheet + "}";
            }
            parseCSSStyleSheet(strResolveCSSStyleSheet);
        }
    }

    private static int hslToRgb(float f10, float f11, float f12) {
        float f13 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f11 / 100.0f;
        float f16 = f12 / 100.0f;
        float fMin = f15 < 0.0f ? 0.0f : Math.min(f15, 1.0f);
        float fMin2 = f16 >= 0.0f ? Math.min(f16, 1.0f) : 0.0f;
        float f17 = fMin2 <= 0.5f ? (fMin + 1.0f) * fMin2 : (fMin2 + fMin) - (fMin * fMin2);
        float f18 = (fMin2 * 2.0f) - f17;
        return clamp255(hueToRgb(f18, f17, f14 - 2.0f) * 256.0f) | (clamp255(hueToRgb(f18, f17, f14 + 2.0f) * 256.0f) << 16) | (clamp255(hueToRgb(f18, f17, f14) * 256.0f) << 8);
    }

    private static float hueToRgb(float f10, float f11, float f12) {
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

    private void image(Attributes attributes) throws SVGParseException {
        debug("<image>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Image image = new SVGBase.Image();
        image.document = this.svgDocument;
        image.parent = this.currentElement;
        parseAttributesCore(image, attributes);
        parseAttributesStyle(image, attributes);
        parseAttributesTransform(image, attributes);
        parseAttributesConditional(image, attributes);
        parseAttributesImage(image, attributes);
        this.currentElement.addChild(image);
        this.currentElement = image;
    }

    private void line(Attributes attributes) throws SVGParseException {
        debug("<line>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Line line = new SVGBase.Line();
        line.document = this.svgDocument;
        line.parent = this.currentElement;
        parseAttributesCore(line, attributes);
        parseAttributesStyle(line, attributes);
        parseAttributesTransform(line, attributes);
        parseAttributesConditional(line, attributes);
        parseAttributesLine(line, attributes);
        this.currentElement.addChild(line);
    }

    private void linearGradient(Attributes attributes) throws SVGParseException {
        debug("<linearGradient>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.SvgLinearGradient svgLinearGradient = new SVGBase.SvgLinearGradient();
        svgLinearGradient.document = this.svgDocument;
        svgLinearGradient.parent = this.currentElement;
        parseAttributesCore(svgLinearGradient, attributes);
        parseAttributesStyle(svgLinearGradient, attributes);
        parseAttributesGradient(svgLinearGradient, attributes);
        parseAttributesLinearGradient(svgLinearGradient, attributes);
        this.currentElement.addChild(svgLinearGradient);
        this.currentElement = svgLinearGradient;
    }

    private void marker(Attributes attributes) throws SVGParseException {
        debug("<marker>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Marker marker = new SVGBase.Marker();
        marker.document = this.svgDocument;
        marker.parent = this.currentElement;
        parseAttributesCore(marker, attributes);
        parseAttributesStyle(marker, attributes);
        parseAttributesConditional(marker, attributes);
        parseAttributesViewBox(marker, attributes);
        parseAttributesMarker(marker, attributes);
        this.currentElement.addChild(marker);
        this.currentElement = marker;
    }

    private void mask(Attributes attributes) throws SVGParseException {
        debug("<mask>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Mask mask = new SVGBase.Mask();
        mask.document = this.svgDocument;
        mask.parent = this.currentElement;
        parseAttributesCore(mask, attributes);
        parseAttributesStyle(mask, attributes);
        parseAttributesConditional(mask, attributes);
        parseAttributesMask(mask, attributes);
        this.currentElement.addChild(mask);
        this.currentElement = mask;
    }

    private void parseAttributesA(SVGBase.A a10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()] == 6 && ("".equals(attributes.getURI(i10)) || XLINK_NAMESPACE.equals(attributes.getURI(i10)))) {
                a10.href = strTrim;
            }
        }
    }

    private void parseAttributesCircle(SVGBase.Circle circle, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    circle.cx = parseLength(strTrim);
                    break;
                case 13:
                    circle.cy = parseLength(strTrim);
                    break;
                case 14:
                    SVGBase.Length length = parseLength(strTrim);
                    circle.f95993r = length;
                    if (length.isNegative()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    private void parseAttributesClipPath(SVGBase.ClipPath clipPath, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()] == 39) {
                if ("objectBoundingBox".equals(strTrim)) {
                    clipPath.clipPathUnitsAreUser = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute clipPathUnits");
                    }
                    clipPath.clipPathUnitsAreUser = Boolean.TRUE;
                }
            }
        }
    }

    private void parseAttributesConditional(SVGBase.SvgConditional svgConditional, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 21:
                    svgConditional.setRequiredFeatures(parseRequiredFeatures(strTrim));
                    break;
                case 22:
                    svgConditional.setRequiredExtensions(strTrim);
                    break;
                case 23:
                    svgConditional.setSystemLanguage(parseSystemLanguage(strTrim));
                    break;
                case 24:
                    svgConditional.setRequiredFormats(parseRequiredFormats(strTrim));
                    break;
                case 25:
                    List<String> fontFamily = parseFontFamily(strTrim);
                    svgConditional.setRequiredFonts(fontFamily != null ? new HashSet(fontFamily) : new HashSet(0));
                    break;
            }
        }
    }

    private void parseAttributesCore(SVGBase.SvgElementBase svgElementBase, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                svgElementBase.f96009id = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    svgElementBase.spacePreserve = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        svgElementBase.spacePreserve = Boolean.TRUE;
                        return;
                    }
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    private void parseAttributesEllipse(SVGBase.Ellipse ellipse, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    SVGBase.Length length = parseLength(strTrim);
                    ellipse.rx = length;
                    if (length.isNegative()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    SVGBase.Length length2 = parseLength(strTrim);
                    ellipse.ry = length2;
                    if (length2.isNegative()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    ellipse.cx = parseLength(strTrim);
                    break;
                case 13:
                    ellipse.cy = parseLength(strTrim);
                    break;
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
    private void parseAttributesGradient(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.GradientElement r5, org.xml.sax.Attributes r6) throws net.pubnative.lite.sdk.utils.svgparser.SVGParseException {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L90
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl.AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr
            java.lang.String r3 = r6.getLocalName(r0)
            net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl$SVGAttr r3 = net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl.SVGAttr.fromString(r3)
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
            net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$GradientSpread r2 = net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.GradientSpread.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.spreadMethod = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L8c
        L2d:
            net.pubnative.lite.sdk.utils.svgparser.SVGParseException r5 = new net.pubnative.lite.sdk.utils.svgparser.SVGParseException
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
            android.graphics.Matrix r1 = r4.parseTransformList(r1)
            r5.gradientTransform = r1
            goto L8c
        L50:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.gradientUnitsAreUser = r1
            goto L8c
        L5d:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.gradientUnitsAreUser = r1
            goto L8c
        L6a:
            net.pubnative.lite.sdk.utils.svgparser.SVGParseException r5 = new net.pubnative.lite.sdk.utils.svgparser.SVGParseException
            java.lang.String r6 = "Invalid value for attribute gradientUnits"
            r5.<init>(r6)
            throw r5
        L72:
            java.lang.String r2 = r6.getURI(r0)
            java.lang.String r3 = ""
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L8a
            java.lang.String r2 = r6.getURI(r0)
            java.lang.String r3 = "http://www.w3.org/1999/xlink"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8c
        L8a:
            r5.href = r1
        L8c:
            int r0 = r0 + 1
            goto L1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl.parseAttributesGradient(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$GradientElement, org.xml.sax.Attributes):void");
    }

    private void parseAttributesImage(SVGBase.Image image, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                image.f95994x = parseLength(strTrim);
            } else if (i11 == 2) {
                image.f95995y = parseLength(strTrim);
            } else if (i11 == 3) {
                SVGBase.Length length = parseLength(strTrim);
                image.width = length;
                if (length.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                SVGBase.Length length2 = parseLength(strTrim);
                image.height = length2;
                if (length2.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    parsePreserveAspectRatio(image, strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || XLINK_NAMESPACE.equals(attributes.getURI(i10))) {
                image.href = strTrim;
            }
        }
    }

    private void parseAttributesLine(SVGBase.Line line, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    line.f95996x1 = parseLength(strTrim);
                    break;
                case 16:
                    line.f95998y1 = parseLength(strTrim);
                    break;
                case 17:
                    line.f95997x2 = parseLength(strTrim);
                    break;
                case 18:
                    line.f95999y2 = parseLength(strTrim);
                    break;
            }
        }
    }

    private void parseAttributesLinearGradient(SVGBase.SvgLinearGradient svgLinearGradient, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    svgLinearGradient.f96010x1 = parseLength(strTrim);
                    break;
                case 16:
                    svgLinearGradient.f96012y1 = parseLength(strTrim);
                    break;
                case 17:
                    svgLinearGradient.f96011x2 = parseLength(strTrim);
                    break;
                case 18:
                    svgLinearGradient.f96013y2 = parseLength(strTrim);
                    break;
            }
        }
    }

    private void parseAttributesMarker(SVGBase.Marker marker, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 26:
                    marker.refX = parseLength(strTrim);
                    break;
                case 27:
                    marker.refY = parseLength(strTrim);
                    break;
                case 28:
                    SVGBase.Length length = parseLength(strTrim);
                    marker.markerWidth = length;
                    if (length.isNegative()) {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    SVGBase.Length length2 = parseLength(strTrim);
                    marker.markerHeight = length2;
                    if (length2.isNegative()) {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new SVGParseException("Invalid value for attribute markerUnits");
                        }
                        marker.markerUnitsAreUser = true;
                    } else {
                        marker.markerUnitsAreUser = false;
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        marker.orient = Float.valueOf(Float.NaN);
                    } else {
                        marker.orient = Float.valueOf(parseFloat(strTrim));
                    }
                    break;
            }
        }
    }

    private void parseAttributesMask(SVGBase.Mask mask, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 44) {
                if (i11 != 45) {
                    if (i11 == 1) {
                        mask.f96000x = parseLength(strTrim);
                    } else if (i11 == 2) {
                        mask.f96001y = parseLength(strTrim);
                    } else if (i11 == 3) {
                        SVGBase.Length length = parseLength(strTrim);
                        mask.width = length;
                        if (length.isNegative()) {
                            throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                        }
                    } else if (i11 != 4) {
                        continue;
                    } else {
                        SVGBase.Length length2 = parseLength(strTrim);
                        mask.height = length2;
                        if (length2.isNegative()) {
                            throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                        }
                    }
                } else if ("objectBoundingBox".equals(strTrim)) {
                    mask.maskContentUnitsAreUser = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute maskContentUnits");
                    }
                    mask.maskContentUnitsAreUser = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                mask.maskUnitsAreUser = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new SVGParseException("Invalid value for attribute maskUnits");
                }
                mask.maskUnitsAreUser = Boolean.TRUE;
            }
        }
    }

    private void parseAttributesPath(SVGBase.Path path, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                path.f96002d = parsePath(strTrim);
            } else if (i11 != 9) {
                continue;
            } else {
                float f10 = parseFloat(strTrim);
                path.pathLength = Float.valueOf(f10);
                if (f10 < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void parseAttributesPattern(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Pattern r6, org.xml.sax.Attributes r7) throws net.pubnative.lite.sdk.utils.svgparser.SVGParseException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl.parseAttributesPattern(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Pattern, org.xml.sax.Attributes):void");
    }

    private void parseAttributesPolyLine(SVGBase.PolyLine polyLine, Attributes attributes, String str) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (SVGAttr.fromString(attributes.getLocalName(i10)) == SVGAttr.points) {
                TextScanner textScanner = new TextScanner(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                textScanner.skipWhitespace();
                while (!textScanner.empty()) {
                    float fNextFloat = textScanner.nextFloat();
                    if (Float.isNaN(fNextFloat)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    textScanner.skipCommaWhitespace();
                    float fNextFloat2 = textScanner.nextFloat();
                    if (Float.isNaN(fNextFloat2)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    textScanner.skipCommaWhitespace();
                    arrayList.add(Float.valueOf(fNextFloat));
                    arrayList.add(Float.valueOf(fNextFloat2));
                }
                polyLine.points = new float[arrayList.size()];
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    polyLine.points[i12] = ((Float) obj).floatValue();
                    i12++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void parseAttributesRadialGradient(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgRadialGradient r5, org.xml.sax.Attributes r6) throws net.pubnative.lite.sdk.utils.svgparser.SVGParseException {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L6e
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl.AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr
            java.lang.String r3 = r6.getLocalName(r0)
            net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl$SVGAttr r3 = net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 12: goto L65;
                case 13: goto L5e;
                case 14: goto L49;
                default: goto L22;
            }
        L22:
            switch(r2) {
                case 35: goto L42;
                case 36: goto L3b;
                case 37: goto L26;
                default: goto L25;
            }
        L25:
            goto L6b
        L26:
            net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Length r1 = parseLength(r1)
            r5.fr = r1
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L33
            goto L6b
        L33:
            net.pubnative.lite.sdk.utils.svgparser.SVGParseException r5 = new net.pubnative.lite.sdk.utils.svgparser.SVGParseException
            java.lang.String r6 = "Invalid <radialGradient> element. fr cannot be negative"
            r5.<init>(r6)
            throw r5
        L3b:
            net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Length r1 = parseLength(r1)
            r5.fy = r1
            goto L6b
        L42:
            net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Length r1 = parseLength(r1)
            r5.fx = r1
            goto L6b
        L49:
            net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Length r1 = parseLength(r1)
            r5.f96014r = r1
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L56
            goto L6b
        L56:
            net.pubnative.lite.sdk.utils.svgparser.SVGParseException r5 = new net.pubnative.lite.sdk.utils.svgparser.SVGParseException
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L5e:
            net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Length r1 = parseLength(r1)
            r5.cy = r1
            goto L6b
        L65:
            net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Length r1 = parseLength(r1)
            r5.cx = r1
        L6b:
            int r0 = r0 + 1
            goto L1
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl.parseAttributesRadialGradient(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$SvgRadialGradient, org.xml.sax.Attributes):void");
    }

    private void parseAttributesRect(SVGBase.Rect rect, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 10) {
                SVGBase.Length length = parseLength(strTrim);
                rect.rx = length;
                if (length.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 == 11) {
                SVGBase.Length length2 = parseLength(strTrim);
                rect.ry = length2;
                if (length2.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            } else if (i11 == 1) {
                rect.f96005x = parseLength(strTrim);
            } else if (i11 == 2) {
                rect.f96006y = parseLength(strTrim);
            } else if (i11 == 3) {
                SVGBase.Length length3 = parseLength(strTrim);
                rect.width = length3;
                if (length3.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 != 4) {
                continue;
            } else {
                SVGBase.Length length4 = parseLength(strTrim);
                rect.height = length4;
                if (length4.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            }
        }
    }

    private void parseAttributesSVG(SVGBase.Svg svg, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                svg.f96007x = parseLength(strTrim);
            } else if (i11 == 2) {
                svg.f96008y = parseLength(strTrim);
            } else if (i11 == 3) {
                SVGBase.Length length = parseLength(strTrim);
                svg.width = length;
                if (length.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                SVGBase.Length length2 = parseLength(strTrim);
                svg.height = length2;
                if (length2.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                svg.version = strTrim;
            }
        }
    }

    private void parseAttributesStop(SVGBase.Stop stop, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()] == 38) {
                stop.offset = parseGradientOffset(strTrim);
            }
        }
    }

    private void parseAttributesStyle(SVGBase.SvgElementBase svgElementBase, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 46) {
                    parseStyle(svgElementBase, strTrim);
                } else if (i11 != 47) {
                    if (svgElementBase.baseStyle == null) {
                        svgElementBase.baseStyle = new Style();
                    }
                    Style.processStyleProperty(svgElementBase.baseStyle, attributes.getLocalName(i10), attributes.getValue(i10).trim(), true);
                } else {
                    svgElementBase.classNames = CSSParser.parseClassAttribute(strTrim);
                }
            }
        }
    }

    private void parseAttributesTRef(SVGBase.TRef tRef, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()] == 6 && ("".equals(attributes.getURI(i10)) || XLINK_NAMESPACE.equals(attributes.getURI(i10)))) {
                tRef.href = strTrim;
            }
        }
    }

    private void parseAttributesTextPath(SVGBase.TextPath textPath, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 40) {
                    textPath.startOffset = parseLength(strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || XLINK_NAMESPACE.equals(attributes.getURI(i10))) {
                textPath.href = strTrim;
            }
        }
    }

    private void parseAttributesTextPosition(SVGBase.TextPositionedContainer textPositionedContainer, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                textPositionedContainer.f96015x = parseLengthList(strTrim);
            } else if (i11 == 2) {
                textPositionedContainer.f96016y = parseLengthList(strTrim);
            } else if (i11 == 19) {
                textPositionedContainer.dx = parseLengthList(strTrim);
            } else if (i11 == 20) {
                textPositionedContainer.dy = parseLengthList(strTrim);
            }
        }
    }

    private void parseAttributesTransform(SVGBase.HasTransform hasTransform, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (SVGAttr.fromString(attributes.getLocalName(i10)) == SVGAttr.transform) {
                hasTransform.setTransform(parseTransformList(attributes.getValue(i10)));
            }
        }
    }

    private void parseAttributesUse(SVGBase.Use use, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                use.f96018x = parseLength(strTrim);
            } else if (i11 == 2) {
                use.f96019y = parseLength(strTrim);
            } else if (i11 == 3) {
                SVGBase.Length length = parseLength(strTrim);
                use.width = length;
                if (length.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                SVGBase.Length length2 = parseLength(strTrim);
                use.height = length2;
                if (length2.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && ("".equals(attributes.getURI(i10)) || XLINK_NAMESPACE.equals(attributes.getURI(i10)))) {
                use.href = strTrim;
            }
        }
    }

    private void parseAttributesViewBox(SVGBase.SvgViewBoxContainer svgViewBoxContainer, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                parsePreserveAspectRatio(svgViewBoxContainer, strTrim);
            } else if (i11 == 48) {
                svgViewBoxContainer.viewBox = parseViewBox(strTrim);
            }
        }
    }

    private void parseCSSStyleSheet(String str) {
        this.svgDocument.addCSSRules(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document, this.externalFileResolver).parse(str));
    }

    static SVGBase.CSSClipRect parseClip(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        TextScanner textScanner = new TextScanner(str.substring(5));
        textScanner.skipWhitespace();
        SVGBase.Length lengthOrAuto = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVGBase.Length lengthOrAuto2 = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVGBase.Length lengthOrAuto3 = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVGBase.Length lengthOrAuto4 = parseLengthOrAuto(textScanner);
        textScanner.skipWhitespace();
        if (textScanner.consume(')') || textScanner.empty()) {
            return new SVGBase.CSSClipRect(lengthOrAuto, lengthOrAuto2, lengthOrAuto3, lengthOrAuto4);
        }
        return null;
    }

    static SVGBase.Colour parseColour(String str) {
        if (str.charAt(0) == '#') {
            IntegerParser hex = IntegerParser.parseHex(str, 1, str.length());
            if (hex == null) {
                return SVGBase.Colour.BLACK;
            }
            int endPos = hex.getEndPos();
            if (endPos == 4) {
                int iValue = hex.value();
                int i10 = iValue & 3840;
                int i11 = iValue & 240;
                int i12 = iValue & 15;
                return new SVGBase.Colour(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (endPos != 5) {
                if (endPos == 7) {
                    return new SVGBase.Colour(hex.value() | ViewCompat.MEASURED_STATE_MASK);
                }
                if (endPos != 9) {
                    return SVGBase.Colour.BLACK;
                }
                return new SVGBase.Colour((hex.value() >>> 8) | (hex.value() << 24));
            }
            int iValue2 = hex.value();
            int i13 = 61440 & iValue2;
            int i14 = iValue2 & 3840;
            int i15 = iValue2 & 240;
            int i16 = iValue2 & 15;
            return new SVGBase.Colour((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        float fNextFloat = Float.NaN;
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            TextScanner textScanner = new TextScanner(str.substring(zStartsWith ? 5 : 4));
            textScanner.skipWhitespace();
            float fNextFloat2 = textScanner.nextFloat();
            if (!Float.isNaN(fNextFloat2)) {
                if (textScanner.consume('%')) {
                    fNextFloat2 = (fNextFloat2 * 256.0f) / 100.0f;
                }
                boolean zSkipCommaWhitespace = textScanner.skipCommaWhitespace();
                float fNextFloat3 = textScanner.nextFloat();
                if (!Float.isNaN(fNextFloat3)) {
                    if (textScanner.consume('%')) {
                        fNextFloat3 = (fNextFloat3 * 256.0f) / 100.0f;
                    }
                    if (!zSkipCommaWhitespace) {
                        textScanner.skipWhitespace();
                    } else if (!textScanner.skipCommaWhitespace()) {
                        return SVGBase.Colour.BLACK;
                    }
                    float fNextFloat4 = textScanner.nextFloat();
                    if (!Float.isNaN(fNextFloat4)) {
                        if (textScanner.consume('%')) {
                            fNextFloat4 = (fNextFloat4 * 256.0f) / 100.0f;
                        }
                        if (!zSkipCommaWhitespace) {
                            textScanner.skipWhitespace();
                            if (textScanner.consume(IOUtils.DIR_SEPARATOR_UNIX)) {
                                textScanner.skipWhitespace();
                                fNextFloat = textScanner.nextFloat();
                            }
                        } else if (textScanner.skipCommaWhitespace()) {
                            fNextFloat = textScanner.nextFloat();
                        }
                        textScanner.skipWhitespace();
                        if (!textScanner.consume(')')) {
                            return SVGBase.Colour.BLACK;
                        }
                        if (Float.isNaN(fNextFloat)) {
                            return new SVGBase.Colour((clamp255(fNextFloat2) << 16) | ViewCompat.MEASURED_STATE_MASK | (clamp255(fNextFloat3) << 8) | clamp255(fNextFloat4));
                        }
                        return new SVGBase.Colour((clamp255(fNextFloat2) << 16) | (clamp255(fNextFloat * 256.0f) << 24) | (clamp255(fNextFloat3) << 8) | clamp255(fNextFloat4));
                    }
                }
            }
        } else {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (zStartsWith2 || lowerCase.startsWith("hsl(")) {
                TextScanner textScanner2 = new TextScanner(str.substring(zStartsWith2 ? 5 : 4));
                textScanner2.skipWhitespace();
                float fNextFloat5 = textScanner2.nextFloat();
                if (!Float.isNaN(fNextFloat5)) {
                    textScanner2.consume("deg");
                    boolean zSkipCommaWhitespace2 = textScanner2.skipCommaWhitespace();
                    float fNextFloat6 = textScanner2.nextFloat();
                    if (!Float.isNaN(fNextFloat6)) {
                        if (!textScanner2.consume('%')) {
                            return SVGBase.Colour.BLACK;
                        }
                        if (!zSkipCommaWhitespace2) {
                            textScanner2.skipWhitespace();
                        } else if (!textScanner2.skipCommaWhitespace()) {
                            return SVGBase.Colour.BLACK;
                        }
                        float fNextFloat7 = textScanner2.nextFloat();
                        if (!Float.isNaN(fNextFloat7)) {
                            if (!textScanner2.consume('%')) {
                                return SVGBase.Colour.BLACK;
                            }
                            if (!zSkipCommaWhitespace2) {
                                textScanner2.skipWhitespace();
                                if (textScanner2.consume(IOUtils.DIR_SEPARATOR_UNIX)) {
                                    textScanner2.skipWhitespace();
                                    fNextFloat = textScanner2.nextFloat();
                                }
                            } else if (textScanner2.skipCommaWhitespace()) {
                                fNextFloat = textScanner2.nextFloat();
                            }
                            textScanner2.skipWhitespace();
                            if (!textScanner2.consume(')')) {
                                return SVGBase.Colour.BLACK;
                            }
                            if (Float.isNaN(fNextFloat)) {
                                return new SVGBase.Colour(hslToRgb(fNextFloat5, fNextFloat6, fNextFloat7) | ViewCompat.MEASURED_STATE_MASK);
                            }
                            return new SVGBase.Colour(hslToRgb(fNextFloat5, fNextFloat6, fNextFloat7) | (clamp255(fNextFloat * 256.0f) << 24));
                        }
                    }
                }
            }
        }
        return parseColourKeyword(lowerCase);
    }

    private static SVGBase.Colour parseColourKeyword(String str) {
        Integer num = ColourKeywords.get(str);
        return num == null ? SVGBase.Colour.BLACK : new SVGBase.Colour(num.intValue());
    }

    private static SVGBase.SvgPaint parseColourSpecifer(String str) {
        str.getClass();
        return !str.equals("none") ? !str.equals(CURRENTCOLOR) ? parseColour(str) : SVGBase.CurrentColor.getInstance() : SVGBase.Colour.TRANSPARENT;
    }

    static Style.FillRule parseFillRule(String str) {
        if ("nonzero".equals(str)) {
            return Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return Style.FillRule.EvenOdd;
        }
        return null;
    }

    static float parseFloat(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return parseFloat(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    static void parseFont(Style style, String str) {
        String strNextToken;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            return;
        }
        TextScanner textScanner = new TextScanner(str);
        Float f10 = null;
        Style.FontStyle fontStyle = null;
        Boolean bool = null;
        Float f11 = null;
        while (true) {
            strNextToken = textScanner.nextToken(IOUtils.DIR_SEPARATOR_UNIX);
            textScanner.skipWhitespace();
            if (strNextToken != null) {
                if (f10 != null && fontStyle != null) {
                    break;
                }
                if (!strNextToken.equals(Constants.NORMAL)) {
                    if (f10 == null && FontWeightKeywords.contains(strNextToken)) {
                        f10 = FontWeightKeywords.get(strNextToken);
                    } else if (fontStyle != null || (fontStyle = parseFontStyle(strNextToken)) == null) {
                        if (bool == null && strNextToken.equals("small-caps")) {
                            bool = Boolean.TRUE;
                        } else if (f11 != null || !FontStretchKeywords.contains(strNextToken)) {
                            break;
                        } else {
                            f11 = FontStretchKeywords.get(strNextToken);
                        }
                    }
                }
            } else {
                return;
            }
        }
        SVGBase.Length fontSize = parseFontSize(strNextToken);
        if (textScanner.consume(IOUtils.DIR_SEPARATOR_UNIX)) {
            textScanner.skipWhitespace();
            String strNextToken2 = textScanner.nextToken();
            if (strNextToken2 != null) {
                try {
                    parseLength(strNextToken2);
                } catch (SVGParseException unused) {
                    return;
                }
            }
            textScanner.skipWhitespace();
        }
        style.fontFamily = parseFontFamily(textScanner.restOfText());
        style.fontSize = fontSize;
        style.fontWeight = Float.valueOf(f10 == null ? 400.0f : f10.floatValue());
        if (fontStyle == null) {
            fontStyle = Style.FontStyle.normal;
        }
        style.fontStyle = fontStyle;
        style.fontStretch = Float.valueOf(f11 == null ? 100.0f : f11.floatValue());
        style.fontKerning = Style.FontKerning.auto;
        style.fontVariantLigatures = CSSFontFeatureSettings.LIGATURES_NORMAL;
        style.fontVariantPosition = CSSFontFeatureSettings.POSITION_ALL_OFF;
        style.fontVariantCaps = CSSFontFeatureSettings.CAPS_ALL_OFF;
        if (bool == Boolean.TRUE) {
            style.fontVariantCaps = CSSFontFeatureSettings.makeSmallCaps();
        }
        style.fontVariantNumeric = CSSFontFeatureSettings.NUMERIC_ALL_OFF;
        style.fontVariantEastAsian = CSSFontFeatureSettings.EAST_ASIAN_ALL_OFF;
        style.fontFeatureSettings = CSSFontFeatureSettings.FONT_FEATURE_SETTINGS_NORMAL;
        style.fontVariationSettings = null;
        style.specifiedFlags |= 4009918906621952L;
    }

    static List<String> parseFontFamily(String str) {
        TextScanner textScanner = new TextScanner(str);
        ArrayList arrayList = null;
        do {
            String strNextQuotedString = textScanner.nextQuotedString();
            if (strNextQuotedString == null) {
                strNextQuotedString = textScanner.nextTokenWithWhitespace(',');
            }
            if (strNextQuotedString == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strNextQuotedString);
            textScanner.skipCommaWhitespace();
        } while (!textScanner.empty());
        return arrayList;
    }

    static SVGBase.Length parseFontSize(String str) {
        try {
            SVGBase.Length length = FontSizeKeywords.get(str);
            return length == null ? parseLength(str) : length;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    static Float parseFontStretch(String str) {
        Float f10 = FontStretchKeywords.get(str);
        if (f10 != null) {
            return f10;
        }
        TextScanner textScanner = new TextScanner(str);
        float fNextFloat = textScanner.nextFloat();
        Float fValueOf = Float.valueOf(fNextFloat);
        if (!textScanner.consume('%')) {
            return null;
        }
        textScanner.skipWhitespace();
        if (textScanner.empty() && fNextFloat >= 0.0f) {
            return fValueOf;
        }
        return null;
    }

    static Style.FontStyle parseFontStyle(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return Style.FontStyle.oblique;
            case "italic":
                return Style.FontStyle.italic;
            case "normal":
                return Style.FontStyle.normal;
            default:
                return null;
        }
    }

    static Float parseFontWeight(String str) {
        Float f10 = FontWeightKeywords.get(str);
        if (f10 != null) {
            return f10;
        }
        TextScanner textScanner = new TextScanner(str);
        float fNextFloat = textScanner.nextFloat();
        Float fValueOf = Float.valueOf(fNextFloat);
        textScanner.skipWhitespace();
        if (textScanner.empty() && fNextFloat >= 1.0f && fNextFloat <= 1000.0f) {
            return fValueOf;
        }
        return null;
    }

    static String parseFunctionalIRI(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private Float parseGradientOffset(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z10 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z10 = false;
        }
        try {
            float f10 = parseFloat(str, 0, length);
            float f11 = 100.0f;
            if (z10) {
                f10 /= 100.0f;
            }
            if (f10 < 0.0f) {
                f11 = 0.0f;
            } else if (f10 <= 100.0f) {
                f11 = f10;
            }
            return Float.valueOf(f11);
        } catch (NumberFormatException e10) {
            throw new SVGParseException("Invalid offset value in <stop>: " + str, e10);
        }
    }

    static Style.Isolation parseIsolation(String str) {
        str.getClass();
        if (str.equals("auto")) {
            return Style.Isolation.auto;
        }
        if (str.equals("isolate")) {
            return Style.Isolation.isolate;
        }
        return null;
    }

    static SVGBase.Length parseLength(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        SVGBase.Unit unitValueOf = SVGBase.Unit.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            unitValueOf = SVGBase.Unit.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                unitValueOf = SVGBase.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new SVGBase.Length(parseFloat(str, 0, length), unitValueOf);
        } catch (NumberFormatException e10) {
            throw new SVGParseException("Invalid length value: " + str, e10);
        }
    }

    private static List<SVGBase.Length> parseLengthList(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            float fNextFloat = textScanner.nextFloat();
            if (Float.isNaN(fNextFloat)) {
                throw new SVGParseException("Invalid length list value: " + textScanner.ahead());
            }
            SVGBase.Unit unitNextUnit = textScanner.nextUnit();
            if (unitNextUnit == null) {
                unitNextUnit = SVGBase.Unit.px;
            }
            arrayList.add(new SVGBase.Length(fNextFloat, unitNextUnit));
            textScanner.skipCommaWhitespace();
        }
        return arrayList;
    }

    private static SVGBase.Length parseLengthOrAuto(TextScanner textScanner) {
        return textScanner.consume("auto") ? SVGBase.Length.ZERO : textScanner.nextLength();
    }

    static SVGBase.Length parseLetterOrWordSpacing(String str) {
        if (Constants.NORMAL.equals(str)) {
            return SVGBase.Length.ZERO;
        }
        try {
            SVGBase.Length length = parseLength(str);
            if (length.unit == SVGBase.Unit.percent) {
                return null;
            }
            return length;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    static Float parseOpacity(String str) {
        try {
            float f10 = parseFloat(str);
            float fMin = 0.0f;
            if (f10 >= 0.0f) {
                fMin = Math.min(f10, 1.0f);
            }
            return Float.valueOf(fMin);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    static Boolean parseOverflow(String str) {
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

    static SVGBase.SvgPaint parsePaintSpecifier(String str) {
        if (!str.startsWith("url(")) {
            return parseColourSpecifer(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new SVGBase.PaintReference(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new SVGBase.PaintReference(strTrim, strTrim2.length() > 0 ? parseColourSpecifer(strTrim2) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x029a, code lost:
    
        android.util.Log.e(net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl.TAG, "Bad path coords for " + ((char) r11) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathDefinition parsePath(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl.parsePath(java.lang.String):net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$PathDefinition");
    }

    private static void parsePreserveAspectRatio(SVGBase.SvgPreserveAspectRatioContainer svgPreserveAspectRatioContainer, String str) {
        svgPreserveAspectRatioContainer.preserveAspectRatio = PreserveAspectRatio.of(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> parseProcessingInstructionAttributes(TextScanner textScanner) {
        HashMap map = new HashMap();
        textScanner.skipWhitespace();
        String strNextToken = textScanner.nextToken(D5.T);
        while (strNextToken != null) {
            textScanner.consume(D5.T);
            map.put(strNextToken, textScanner.nextQuotedString());
            textScanner.skipWhitespace();
            strNextToken = textScanner.nextToken(D5.T);
        }
        return map;
    }

    static Style.RenderQuality parseRenderQuality(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return Style.RenderQuality.optimizeQuality;
            case "auto":
                return Style.RenderQuality.auto;
            case "optimizeSpeed":
                return Style.RenderQuality.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set<String> parseRequiredFeatures(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String strNextToken = textScanner.nextToken();
            if (strNextToken.startsWith(FEATURE_STRING_PREFIX)) {
                hashSet.add(strNextToken.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static Set<String> parseRequiredFormats(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            hashSet.add(textScanner.nextToken());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    static SVGBase.Length[] parseStrokeDashArray(String str) {
        SVGBase.Length lengthNextLength;
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.empty() || (lengthNextLength = textScanner.nextLength()) == null || lengthNextLength.isNegative()) {
            return null;
        }
        float fFloatValue = lengthNextLength.floatValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(lengthNextLength);
        while (!textScanner.empty()) {
            textScanner.skipCommaWhitespace();
            SVGBase.Length lengthNextLength2 = textScanner.nextLength();
            if (lengthNextLength2 == null || lengthNextLength2.isNegative()) {
                return null;
            }
            arrayList.add(lengthNextLength2);
            fFloatValue += lengthNextLength2.floatValue();
        }
        if (fFloatValue == 0.0f) {
            return null;
        }
        return (SVGBase.Length[]) arrayList.toArray(new SVGBase.Length[0]);
    }

    static Style.LineCap parseStrokeLineCap(String str) {
        if ("butt".equals(str)) {
            return Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return Style.LineCap.Square;
        }
        return null;
    }

    static Style.LineJoin parseStrokeLineJoin(String str) {
        if ("miter".equals(str)) {
            return Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return Style.LineJoin.Bevel;
        }
        return null;
    }

    private static void parseStyle(SVGBase.SvgElementBase svgElementBase, String str) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(PATTERN_BLOCK_COMMENTS.matcher(str).replaceAll(""));
        while (!cSSTextScanner.empty()) {
            cSSTextScanner.skipWhitespace();
            String strNextIdentifier = cSSTextScanner.nextIdentifier();
            cSSTextScanner.skipWhitespace();
            if (!cSSTextScanner.consume(';')) {
                if (!cSSTextScanner.consume(':')) {
                    return;
                }
                cSSTextScanner.skipWhitespace();
                String strNextPropertyValue = cSSTextScanner.nextPropertyValue();
                if (strNextPropertyValue != null) {
                    cSSTextScanner.skipWhitespace();
                    if (cSSTextScanner.empty() || cSSTextScanner.consume(';')) {
                        if (svgElementBase.style == null) {
                            svgElementBase.style = new Style();
                        }
                        Style.processStyleProperty(svgElementBase.style, strNextIdentifier, strNextPropertyValue, false);
                        cSSTextScanner.skipWhitespace();
                    }
                }
            }
        }
    }

    private static Set<String> parseSystemLanguage(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String strNextToken = textScanner.nextToken();
            int iIndexOf = strNextToken.indexOf(45);
            if (iIndexOf != -1) {
                strNextToken = strNextToken.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strNextToken, "", "").getLanguage());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    static Style.TextAnchor parseTextAnchor(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return Style.TextAnchor.Middle;
            case "end":
                return Style.TextAnchor.End;
            case "start":
                return Style.TextAnchor.Start;
            default:
                return null;
        }
    }

    static Style.TextDecoration parseTextDecoration(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return Style.TextDecoration.LineThrough;
            case "underline":
                return Style.TextDecoration.Underline;
            case "none":
                return Style.TextDecoration.None;
            case "blink":
                return Style.TextDecoration.Blink;
            case "overline":
                return Style.TextDecoration.Overline;
            default:
                return null;
        }
    }

    static Style.TextDirection parseTextDirection(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return Style.TextDirection.LTR;
        }
        if (str.equals("rtl")) {
            return Style.TextDirection.RTL;
        }
        return null;
    }

    private Matrix parseTransformList(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            String strNextFunction = textScanner.nextFunction();
            if (strNextFunction == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (strNextFunction) {
                case "matrix":
                    textScanner.skipWhitespace();
                    float fNextFloat = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat2 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat3 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat4 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat5 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat6 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat6) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fNextFloat, fNextFloat3, fNextFloat5, fNextFloat2, fNextFloat4, fNextFloat6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    textScanner.skipWhitespace();
                    float fNextFloat7 = textScanner.nextFloat();
                    float fPossibleNextFloat = textScanner.possibleNextFloat();
                    float fPossibleNextFloat2 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat7) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fPossibleNextFloat)) {
                        matrix.preRotate(fNextFloat7);
                    } else {
                        if (Float.isNaN(fPossibleNextFloat2)) {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fNextFloat7, fPossibleNextFloat, fPossibleNextFloat2);
                    }
                    break;
                    break;
                case "scale":
                    textScanner.skipWhitespace();
                    float fNextFloat8 = textScanner.nextFloat();
                    float fPossibleNextFloat3 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat8) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fPossibleNextFloat3)) {
                        matrix.preScale(fNextFloat8, fPossibleNextFloat3);
                    } else {
                        matrix.preScale(fNextFloat8, fNextFloat8);
                    }
                    break;
                    break;
                case "skewX":
                    textScanner.skipWhitespace();
                    float fNextFloat9 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat9) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fNextFloat9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    textScanner.skipWhitespace();
                    float fNextFloat10 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat10) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fNextFloat10)));
                    break;
                    break;
                case "translate":
                    textScanner.skipWhitespace();
                    float fNextFloat11 = textScanner.nextFloat();
                    float fPossibleNextFloat4 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat11) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fPossibleNextFloat4)) {
                        matrix.preTranslate(fNextFloat11, fPossibleNextFloat4);
                    } else {
                        matrix.preTranslate(fNextFloat11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new SVGParseException("Invalid transform list fn: " + strNextFunction + ")");
            }
            if (textScanner.empty()) {
                return matrix;
            }
            textScanner.skipCommaWhitespace();
        }
        return matrix;
    }

    private void parseUsingSAX(InputStream inputStream) throws SVGParseException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            if (!FORCE_SAX_ON_EARLY_ANDROIDS) {
                sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
                sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            }
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            SAXHandler sAXHandler = new SAXHandler();
            xMLReader.setContentHandler(sAXHandler);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", sAXHandler);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new SVGParseException("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new SVGParseException("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new SVGParseException("SVG parse error", e12);
        }
    }

    private void parseUsingXmlPullParser(InputStream inputStream) throws SVGParseException {
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            XPPAttributesWrapper xPPAttributesWrapper = new XPPAttributesWrapper(xmlPullParserNewPullParser);
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(inputStream, null);
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                if (eventType == 0) {
                    startDocument();
                } else if (eventType == 8) {
                    TextScanner textScanner = new TextScanner(xmlPullParserNewPullParser.getText());
                    handleProcessingInstruction(textScanner.nextToken(), parseProcessingInstructionAttributes(textScanner));
                } else if (eventType == 2) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (xmlPullParserNewPullParser.getPrefix() != null) {
                        name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                    }
                    startElement(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, xPPAttributesWrapper);
                } else if (eventType == 3) {
                    String name2 = xmlPullParserNewPullParser.getName();
                    if (xmlPullParserNewPullParser.getPrefix() != null) {
                        name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                    }
                    endElement(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                } else if (eventType == 4) {
                    int[] iArr = new int[2];
                    text(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                } else if (eventType == 5) {
                    text(xmlPullParserNewPullParser.getText());
                } else if (eventType == 6) {
                    text(xmlPullParserNewPullParser.getText());
                }
            }
            endDocument();
        } catch (IOException e10) {
            throw new SVGParseException("Stream error", e10);
        } catch (XmlPullParserException e11) {
            throw new SVGParseException("XML parser problem", e11);
        }
    }

    static Style.VectorEffect parseVectorEffect(String str) {
        str.getClass();
        if (str.equals("none")) {
            return Style.VectorEffect.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return Style.VectorEffect.NonScalingStroke;
        }
        return null;
    }

    private static SVGBase.Box parseViewBox(String str) throws SVGParseException {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        float fNextFloat = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float fNextFloat2 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float fNextFloat3 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float fNextFloat4 = textScanner.nextFloat();
        if (Float.isNaN(fNextFloat) || Float.isNaN(fNextFloat2) || Float.isNaN(fNextFloat3) || Float.isNaN(fNextFloat4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (fNextFloat3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (fNextFloat4 >= 0.0f) {
            return new SVGBase.Box(fNextFloat, fNextFloat2, fNextFloat3, fNextFloat4);
        }
        throw new SVGParseException("Invalid viewBox. height cannot be negative");
    }

    private void path(Attributes attributes) throws SVGParseException {
        debug("<path>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Path path = new SVGBase.Path();
        path.document = this.svgDocument;
        path.parent = this.currentElement;
        parseAttributesCore(path, attributes);
        parseAttributesStyle(path, attributes);
        parseAttributesTransform(path, attributes);
        parseAttributesConditional(path, attributes);
        parseAttributesPath(path, attributes);
        this.currentElement.addChild(path);
    }

    private void pattern(Attributes attributes) throws SVGParseException {
        debug("<pattern>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Pattern pattern = new SVGBase.Pattern();
        pattern.document = this.svgDocument;
        pattern.parent = this.currentElement;
        parseAttributesCore(pattern, attributes);
        parseAttributesStyle(pattern, attributes);
        parseAttributesConditional(pattern, attributes);
        parseAttributesViewBox(pattern, attributes);
        parseAttributesPattern(pattern, attributes);
        this.currentElement.addChild(pattern);
        this.currentElement = pattern;
    }

    private void polygon(Attributes attributes) throws SVGParseException {
        debug("<polygon>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.PolyLine polygon = new SVGBase.Polygon();
        polygon.document = this.svgDocument;
        polygon.parent = this.currentElement;
        parseAttributesCore(polygon, attributes);
        parseAttributesStyle(polygon, attributes);
        parseAttributesTransform(polygon, attributes);
        parseAttributesConditional(polygon, attributes);
        parseAttributesPolyLine(polygon, attributes, "polygon");
        this.currentElement.addChild(polygon);
    }

    private void polyline(Attributes attributes) throws SVGParseException {
        debug("<polyline>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.PolyLine polyLine = new SVGBase.PolyLine();
        polyLine.document = this.svgDocument;
        polyLine.parent = this.currentElement;
        parseAttributesCore(polyLine, attributes);
        parseAttributesStyle(polyLine, attributes);
        parseAttributesTransform(polyLine, attributes);
        parseAttributesConditional(polyLine, attributes);
        parseAttributesPolyLine(polyLine, attributes, "polyline");
        this.currentElement.addChild(polyLine);
    }

    private void radialGradient(Attributes attributes) throws SVGParseException {
        debug("<radialGradient>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.SvgRadialGradient svgRadialGradient = new SVGBase.SvgRadialGradient();
        svgRadialGradient.document = this.svgDocument;
        svgRadialGradient.parent = this.currentElement;
        parseAttributesCore(svgRadialGradient, attributes);
        parseAttributesStyle(svgRadialGradient, attributes);
        parseAttributesGradient(svgRadialGradient, attributes);
        parseAttributesRadialGradient(svgRadialGradient, attributes);
        this.currentElement.addChild(svgRadialGradient);
        this.currentElement = svgRadialGradient;
    }

    private void rect(Attributes attributes) throws SVGParseException {
        debug("<rect>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Rect rect = new SVGBase.Rect();
        rect.document = this.svgDocument;
        rect.parent = this.currentElement;
        parseAttributesCore(rect, attributes);
        parseAttributesStyle(rect, attributes);
        parseAttributesTransform(rect, attributes);
        parseAttributesConditional(rect, attributes);
        parseAttributesRect(rect, attributes);
        this.currentElement.addChild(rect);
    }

    private void solidColor(Attributes attributes) throws SVGParseException {
        debug("<solidColor>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.SolidColor solidColor = new SVGBase.SolidColor();
        solidColor.document = this.svgDocument;
        solidColor.parent = this.currentElement;
        parseAttributesCore(solidColor, attributes);
        parseAttributesStyle(solidColor, attributes);
        this.currentElement.addChild(solidColor);
        this.currentElement = solidColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startDocument() {
        this.svgDocument = new SVGBase(this.enableInternalEntities, this.externalFileResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.ignoring) {
            this.ignoreDepth++;
        }
        if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem sVGElemFromString = SVGElem.fromString(str2);
            switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGElem[sVGElemFromString.ordinal()]) {
                case 1:
                    svg(attributes);
                    break;
                case 2:
                    g(attributes);
                    break;
                case 3:
                    defs(attributes);
                    break;
                case 4:
                    a(attributes);
                    break;
                case 5:
                    use(attributes);
                    break;
                case 6:
                    path(attributes);
                    break;
                case 7:
                    rect(attributes);
                    break;
                case 8:
                    circle(attributes);
                    break;
                case 9:
                    ellipse(attributes);
                    break;
                case 10:
                    line(attributes);
                    break;
                case 11:
                    polyline(attributes);
                    break;
                case 12:
                    polygon(attributes);
                    break;
                case 13:
                    text(attributes);
                    break;
                case 14:
                    tspan(attributes);
                    break;
                case 15:
                    tref(attributes);
                    break;
                case 16:
                    zwitch(attributes);
                    break;
                case 17:
                    symbol(attributes);
                    break;
                case 18:
                    marker(attributes);
                    break;
                case 19:
                    linearGradient(attributes);
                    break;
                case 20:
                    radialGradient(attributes);
                    break;
                case 21:
                    stop(attributes);
                    break;
                case 22:
                case 23:
                    this.inMetadataElement = true;
                    this.metadataTag = sVGElemFromString;
                    break;
                case 24:
                    clipPath(attributes);
                    break;
                case 25:
                    textPath(attributes);
                    break;
                case 26:
                    pattern(attributes);
                    break;
                case 27:
                    image(attributes);
                    break;
                case 28:
                    view(attributes);
                    break;
                case 29:
                    mask(attributes);
                    break;
                case 30:
                    style(attributes);
                    break;
                case 31:
                    solidColor(attributes);
                    break;
                default:
                    this.ignoring = true;
                    this.ignoreDepth = 1;
                    break;
            }
        }
    }

    private void stop(Attributes attributes) throws SVGParseException {
        debug("<stop>", new Object[0]);
        SVGBase.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof SVGBase.GradientElement)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        SVGBase.Stop stop = new SVGBase.Stop();
        stop.document = this.svgDocument;
        stop.parent = this.currentElement;
        parseAttributesCore(stop, attributes);
        parseAttributesStyle(stop, attributes);
        parseAttributesStop(stop, attributes);
        this.currentElement.addChild(stop);
        this.currentElement = stop;
    }

    private void style(Attributes attributes) throws SVGParseException {
        debug("<style>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGParserImpl$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 49) {
                zEquals = strTrim.equals("text/css");
            } else if (i11 == 50) {
                str = strTrim;
            }
        }
        if (zEquals && CSSParser.mediaMatches(str, CSSParser.MediaType.screen)) {
            this.inStyleElement = true;
        } else {
            this.ignoring = true;
            this.ignoreDepth = 1;
        }
    }

    private void svg(Attributes attributes) throws SVGParseException {
        debug("<svg>", new Object[0]);
        SVGBase.Svg svg = new SVGBase.Svg();
        svg.document = this.svgDocument;
        svg.parent = this.currentElement;
        parseAttributesCore(svg, attributes);
        parseAttributesStyle(svg, attributes);
        parseAttributesConditional(svg, attributes);
        parseAttributesViewBox(svg, attributes);
        parseAttributesSVG(svg, attributes);
        SVGBase.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            this.svgDocument.setRootElement(svg);
        } else {
            svgContainer.addChild(svg);
        }
        this.currentElement = svg;
    }

    private void symbol(Attributes attributes) throws SVGParseException {
        debug("<symbol>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.SvgViewBoxContainer symbol = new SVGBase.Symbol();
        symbol.document = this.svgDocument;
        symbol.parent = this.currentElement;
        parseAttributesCore(symbol, attributes);
        parseAttributesStyle(symbol, attributes);
        parseAttributesConditional(symbol, attributes);
        parseAttributesViewBox(symbol, attributes);
        this.currentElement.addChild(symbol);
        this.currentElement = symbol;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void text(String str) {
        if (this.ignoring) {
            return;
        }
        if (this.inMetadataElement) {
            if (this.metadataElementContents == null) {
                this.metadataElementContents = new StringBuilder(str.length());
            }
            this.metadataElementContents.append(str);
        } else if (this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(str.length());
            }
            this.styleElementContents.append(str);
        } else if (this.currentElement instanceof SVGBase.TextContainer) {
            appendToTextContainer(str);
        }
    }

    private void textPath(Attributes attributes) throws SVGParseException {
        debug("<textPath>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.TextPath textPath = new SVGBase.TextPath();
        textPath.document = this.svgDocument;
        textPath.parent = this.currentElement;
        parseAttributesCore(textPath, attributes);
        parseAttributesStyle(textPath, attributes);
        parseAttributesConditional(textPath, attributes);
        parseAttributesTextPath(textPath, attributes);
        this.currentElement.addChild(textPath);
        this.currentElement = textPath;
        SVGBase.SvgContainer svgContainer = textPath.parent;
        if (svgContainer instanceof SVGBase.TextRoot) {
            textPath.setTextRoot((SVGBase.TextRoot) svgContainer);
        } else {
            textPath.setTextRoot(((SVGBase.TextChild) svgContainer).getTextRoot());
        }
    }

    private void tref(Attributes attributes) throws SVGParseException {
        debug("<tref>", new Object[0]);
        SVGBase.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof SVGBase.TextContainer)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        SVGBase.TRef tRef = new SVGBase.TRef();
        tRef.document = this.svgDocument;
        tRef.parent = this.currentElement;
        parseAttributesCore(tRef, attributes);
        parseAttributesStyle(tRef, attributes);
        parseAttributesConditional(tRef, attributes);
        parseAttributesTRef(tRef, attributes);
        this.currentElement.addChild(tRef);
        SVGBase.SvgContainer svgContainer2 = tRef.parent;
        if (svgContainer2 instanceof SVGBase.TextRoot) {
            tRef.setTextRoot((SVGBase.TextRoot) svgContainer2);
        } else {
            tRef.setTextRoot(((SVGBase.TextChild) svgContainer2).getTextRoot());
        }
    }

    private void tspan(Attributes attributes) throws SVGParseException {
        debug("<tspan>", new Object[0]);
        SVGBase.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof SVGBase.TextContainer)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        SVGBase.TSpan tSpan = new SVGBase.TSpan();
        tSpan.document = this.svgDocument;
        tSpan.parent = this.currentElement;
        parseAttributesCore(tSpan, attributes);
        parseAttributesStyle(tSpan, attributes);
        parseAttributesConditional(tSpan, attributes);
        parseAttributesTextPosition(tSpan, attributes);
        this.currentElement.addChild(tSpan);
        this.currentElement = tSpan;
        SVGBase.SvgContainer svgContainer2 = tSpan.parent;
        if (svgContainer2 instanceof SVGBase.TextRoot) {
            tSpan.setTextRoot((SVGBase.TextRoot) svgContainer2);
        } else {
            tSpan.setTextRoot(((SVGBase.TextChild) svgContainer2).getTextRoot());
        }
    }

    private void use(Attributes attributes) throws SVGParseException {
        debug("<use>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Use use = new SVGBase.Use();
        use.document = this.svgDocument;
        use.parent = this.currentElement;
        parseAttributesCore(use, attributes);
        parseAttributesStyle(use, attributes);
        parseAttributesTransform(use, attributes);
        parseAttributesConditional(use, attributes);
        parseAttributesUse(use, attributes);
        this.currentElement.addChild(use);
        this.currentElement = use;
    }

    private void view(Attributes attributes) throws SVGParseException {
        debug("<view>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.SvgViewBoxContainer view = new SVGBase.View();
        view.document = this.svgDocument;
        view.parent = this.currentElement;
        parseAttributesCore(view, attributes);
        parseAttributesConditional(view, attributes);
        parseAttributesViewBox(view, attributes);
        this.currentElement.addChild(view);
        this.currentElement = view;
    }

    private void zwitch(Attributes attributes) throws SVGParseException {
        debug("<switch>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Switch r02 = new SVGBase.Switch();
        r02.document = this.svgDocument;
        r02.parent = this.currentElement;
        parseAttributesCore(r02, attributes);
        parseAttributesStyle(r02, attributes);
        parseAttributesTransform(r02, attributes);
        parseAttributesConditional(r02, attributes);
        this.currentElement.addChild(r02);
        this.currentElement = r02;
    }

    @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGParser
    public SVGBase parseStream(InputStream inputStream) {
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
            try {
                if (FORCE_SAX_ON_EARLY_ANDROIDS) {
                    debug("Forcing SAX parser for this version of Android", new Object[0]);
                    parseUsingSAX(inputStream);
                    return this.svgDocument;
                }
                if (this.enableInternalEntities) {
                    inputStream.mark(4096);
                    byte[] bArr = new byte[4096];
                    String str = new String(bArr, 0, inputStream.read(bArr));
                    inputStream.reset();
                    if (str.contains("<!ENTITY ")) {
                        debug("Switching to SAX parser to process entities", new Object[0]);
                        parseUsingSAX(inputStream);
                        SVGBase sVGBase = this.svgDocument;
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                            Log.e(TAG, "Exception thrown closing input stream");
                        }
                        return sVGBase;
                    }
                }
                parseUsingXmlPullParser(inputStream);
                SVGBase sVGBase2 = this.svgDocument;
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                    Log.e(TAG, "Exception thrown closing input stream");
                }
                return sVGBase2;
            } catch (IOException e10) {
                Log.e(TAG, "Error occurred while performing check for entities.  File may not be parsed correctly if it contains entity definitions.", e10);
                parseUsingXmlPullParser(inputStream);
                SVGBase sVGBase3 = this.svgDocument;
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                    Log.e(TAG, "Exception thrown closing input stream");
                }
                return sVGBase3;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused5) {
                Log.e(TAG, "Exception thrown closing input stream");
            }
        }
    }

    @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGParser
    public SVGParser setExternalFileResolver(SVGExternalFileResolver sVGExternalFileResolver) {
        this.externalFileResolver = sVGExternalFileResolver;
        return this;
    }

    @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGParser
    public SVGParser setInternalEntitiesEnabled(boolean z10) {
        this.enableInternalEntities = z10;
        return this;
    }

    private void a(Attributes attributes) throws SVGParseException {
        debug("<a>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.A a10 = new SVGBase.A();
        a10.document = this.svgDocument;
        a10.parent = this.currentElement;
        parseAttributesCore(a10, attributes);
        parseAttributesStyle(a10, attributes);
        parseAttributesTransform(a10, attributes);
        parseAttributesConditional(a10, attributes);
        parseAttributesA(a10, attributes);
        this.currentElement.addChild(a10);
        this.currentElement = a10;
    }

    private void g(Attributes attributes) throws SVGParseException {
        debug("<g>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVGBase.Group group = new SVGBase.Group();
        group.document = this.svgDocument;
        group.parent = this.currentElement;
        parseAttributesCore(group, attributes);
        parseAttributesStyle(group, attributes);
        parseAttributesTransform(group, attributes);
        parseAttributesConditional(group, attributes);
        this.currentElement.addChild(group);
        this.currentElement = group;
    }

    private static float parseFloat(String str, int i10, int i11) throws SVGParseException {
        float number = new NumberParser().parseNumber(str, i10, i11);
        if (!Float.isNaN(number)) {
            return number;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    private void text(char[] cArr, int i10, int i11) {
        if (this.ignoring) {
            return;
        }
        if (this.inMetadataElement) {
            if (this.metadataElementContents == null) {
                this.metadataElementContents = new StringBuilder(i11);
            }
            this.metadataElementContents.append(cArr, i10, i11);
        } else if (this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(i11);
            }
            this.styleElementContents.append(cArr, i10, i11);
        } else if (this.currentElement instanceof SVGBase.TextContainer) {
            appendToTextContainer(new String(cArr, i10, i11));
        }
    }

    private void text(Attributes attributes) throws SVGParseException {
        debug("<text>", new Object[0]);
        if (this.currentElement != null) {
            SVGBase.Text text = new SVGBase.Text();
            text.document = this.svgDocument;
            text.parent = this.currentElement;
            parseAttributesCore(text, attributes);
            parseAttributesStyle(text, attributes);
            parseAttributesTransform(text, attributes);
            parseAttributesConditional(text, attributes);
            parseAttributesTextPosition(text, attributes);
            this.currentElement.addChild(text);
            this.currentElement = text;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }
}
