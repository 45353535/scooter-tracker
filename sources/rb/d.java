package rb;

import android.text.Layout;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lb.i;
import lb.k;
import lb.m;
import lb.s;
import lb.t;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q9.j;
import q9.l;
import q9.o0;
import q9.p0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f99366b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f99367c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f99368d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Pattern f99369e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Pattern f99370f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f99371g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f99372h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f99373i = new a(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f99374a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f99375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f99376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f99377c;

        a(float f10, int i10, int i11) {
            this.f99375a = f10;
            this.f99376b = i10;
            this.f99377c = i11;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f99378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f99379b;

        b(int i10, int i11) {
            this.f99378a = i10;
            this.f99379b = i11;
        }
    }

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f99374a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g b(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean c(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment d(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int e(XmlPullParser xmlPullParser, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i10;
        }
        Matcher matcher = f99372h.matcher(attributeValue);
        if (!matcher.matches()) {
            u.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
        boolean z10 = true;
        try {
            int i11 = Integer.parseInt((String) q9.a.e(matcher.group(1)));
            int i12 = Integer.parseInt((String) q9.a.e(matcher.group(2)));
            if (i11 == 0 || i12 == 0) {
                z10 = false;
            }
            q9.a.b(z10, "Invalid cell resolution " + i11 + " " + i12);
            return i12;
        } catch (NumberFormatException unused) {
            u.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
    }

    private static void f(String str, g gVar) throws m {
        Matcher matcher;
        String str2;
        String[] strArrJ1 = o0.j1(str, "\\s+");
        if (strArrJ1.length == 1) {
            matcher = f99368d.matcher(str);
        } else {
            if (strArrJ1.length != 2) {
                throw new m("Invalid number of entries for fontSize: " + strArrJ1.length + ".");
            }
            matcher = f99368d.matcher(strArrJ1[1]);
            u.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new m("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) q9.a.e(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.C(3);
                break;
            case "em":
                gVar.C(2);
                break;
            case "px":
                gVar.C(1);
                break;
            default:
                throw new m("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.B(Float.parseFloat((String) q9.a.e(matcher.group(1))));
    }

    private static a g(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            q9.a.b(o0.j1(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        a aVar = f99373i;
        int i11 = aVar.f99376b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = aVar.f99377c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new a(i10 * f10, i11, i12);
    }

    private static Map h(XmlPullParser xmlPullParser, Map map, int i10, b bVar, Map map2, Map map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (p0.f(xmlPullParser, "style")) {
                String strA = p0.a(xmlPullParser, "style");
                g gVarM = m(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : n(strA)) {
                        gVarM.a((g) map.get(str));
                    }
                }
                String strH = gVarM.h();
                if (strH != null) {
                    map.put(strH, gVarM);
                }
            } else if (p0.f(xmlPullParser, "region")) {
                e eVarK = k(xmlPullParser, i10, bVar, map);
                if (eVarK != null) {
                    map2.put(eVarK.f99380a, eVarK);
                }
            } else if (p0.f(xmlPullParser, "metadata")) {
                i(xmlPullParser, map3);
            }
        } while (!p0.d(xmlPullParser, "head"));
        return map;
    }

    private static void i(XmlPullParser xmlPullParser, Map map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (p0.f(xmlPullParser, "image") && (strA = p0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!p0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static rb.c j(org.xmlpull.v1.XmlPullParser r22, rb.c r23, java.util.Map r24, rb.d.a r25) throws lb.m {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.d.j(org.xmlpull.v1.XmlPullParser, rb.c, java.util.Map, rb.d$a):rb.c");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static rb.e k(org.xmlpull.v1.XmlPullParser r18, int r19, rb.d.b r20, java.util.Map r21) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.d.k(org.xmlpull.v1.XmlPullParser, int, rb.d$b, java.util.Map):rb.e");
    }

    private static float l(String str) {
        Matcher matcher = f99369e.matcher(str);
        if (!matcher.matches()) {
            u.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) q9.a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            u.i("TtmlParser", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static g m(XmlPullParser xmlPullParser, g gVar) {
        byte b10;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    b10 = attributeName.equals("fontStyle") ? (byte) 0 : (byte) -1;
                    break;
                case -1289044182:
                    b10 = attributeName.equals("extent") ? (byte) 1 : (byte) -1;
                    break;
                case -1224696685:
                    b10 = attributeName.equals("fontFamily") ? (byte) 2 : (byte) -1;
                    break;
                case -1065511464:
                    b10 = attributeName.equals("textAlign") ? (byte) 3 : (byte) -1;
                    break;
                case -1008619738:
                    b10 = attributeName.equals("origin") ? (byte) 4 : (byte) -1;
                    break;
                case -879295043:
                    b10 = attributeName.equals("textDecoration") ? (byte) 5 : (byte) -1;
                    break;
                case -734428249:
                    b10 = attributeName.equals("fontWeight") ? (byte) 6 : (byte) -1;
                    break;
                case 3355:
                    b10 = attributeName.equals("id") ? (byte) 7 : (byte) -1;
                    break;
                case 3511770:
                    b10 = attributeName.equals("ruby") ? (byte) 8 : (byte) -1;
                    break;
                case 94842723:
                    b10 = attributeName.equals("color") ? (byte) 9 : (byte) -1;
                    break;
                case 109403361:
                    b10 = attributeName.equals("shear") ? (byte) 10 : (byte) -1;
                    break;
                case 110138194:
                    b10 = attributeName.equals("textCombine") ? Ascii.VT : (byte) -1;
                    break;
                case 365601008:
                    b10 = attributeName.equals("fontSize") ? Ascii.FF : (byte) -1;
                    break;
                case 921125321:
                    b10 = attributeName.equals("textEmphasis") ? (byte) 13 : (byte) -1;
                    break;
                case 1115953443:
                    b10 = attributeName.equals("rubyPosition") ? Ascii.SO : (byte) -1;
                    break;
                case 1287124693:
                    b10 = attributeName.equals("backgroundColor") ? Ascii.SI : (byte) -1;
                    break;
                case 1754920356:
                    b10 = attributeName.equals("multiRowAlign") ? Ascii.DLE : (byte) -1;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    gVar = b(gVar).E("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    gVar = b(gVar).y(attributeValue);
                    break;
                case 2:
                    gVar = b(gVar).A(attributeValue);
                    break;
                case 3:
                    gVar = b(gVar).L(d(attributeValue));
                    break;
                case 4:
                    gVar = b(gVar).H(attributeValue);
                    break;
                case 5:
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    lowerCase.getClass();
                    switch (lowerCase) {
                        case "nounderline":
                            gVar = b(gVar).O(false);
                            break;
                        case "underline":
                            gVar = b(gVar).O(true);
                            break;
                        case "nolinethrough":
                            gVar = b(gVar).F(false);
                            break;
                        case "linethrough":
                            gVar = b(gVar).F(true);
                            break;
                    }
                    break;
                case 6:
                    gVar = b(gVar).x("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        gVar = b(gVar).D(attributeValue);
                    }
                    break;
                case 8:
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    lowerCase2.getClass();
                    switch (lowerCase2) {
                        case "baseContainer":
                        case "base":
                            gVar = b(gVar).J(2);
                            break;
                        case "container":
                            gVar = b(gVar).J(1);
                            break;
                        case "delimiter":
                            gVar = b(gVar).J(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = b(gVar).J(3);
                            break;
                    }
                    break;
                case 9:
                    gVar = b(gVar);
                    try {
                        gVar.z(j.c(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        u.h("TtmlParser", "Failed parsing color value: " + attributeValue);
                    }
                    break;
                case 10:
                    gVar = b(gVar).K(l(attributeValue));
                    break;
                case 11:
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    lowerCase3.getClass();
                    if (lowerCase3.equals("all")) {
                        gVar = b(gVar).M(true);
                    } else if (lowerCase3.equals("none")) {
                        gVar = b(gVar).M(false);
                    }
                    break;
                case 12:
                    try {
                        gVar = b(gVar);
                        f(attributeValue, gVar);
                    } catch (m unused2) {
                        u.h("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                    }
                    break;
                case 13:
                    gVar = b(gVar).N(rb.b.a(attributeValue));
                    break;
                case 14:
                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                    lowerCase4.getClass();
                    if (lowerCase4.equals("before")) {
                        gVar = b(gVar).I(1);
                    } else if (lowerCase4.equals("after")) {
                        gVar = b(gVar).I(2);
                    }
                    break;
                case 15:
                    gVar = b(gVar);
                    try {
                        gVar.w(j.c(attributeValue));
                    } catch (IllegalArgumentException unused3) {
                        u.h("TtmlParser", "Failed parsing background value: " + attributeValue);
                    }
                    break;
                case 16:
                    gVar = b(gVar).G(d(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    private static String[] n(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : o0.j1(strTrim, "\\s+");
    }

    private static long o(String str, a aVar) throws m {
        double d10;
        double d11;
        double d12;
        Matcher matcher = f99366b.matcher(str);
        if (matcher.matches()) {
            double d13 = (Long.parseLong((String) q9.a.e(matcher.group(1))) * 3600) + (Long.parseLong((String) q9.a.e(matcher.group(2))) * 60) + Long.parseLong((String) q9.a.e(matcher.group(3)));
            String strGroup = matcher.group(4);
            return (long) ((d13 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / aVar.f99375a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) aVar.f99376b)) / ((double) aVar.f99375a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f99367c.matcher(str);
        if (!matcher2.matches()) {
            throw new m("Malformed time expression: " + str);
        }
        d10 = Double.parseDouble((String) q9.a.e(matcher2.group(1)));
        String str2 = (String) q9.a.e(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d11 = aVar.f99375a;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "h":
                d12 = 3600.0d;
                break;
            case "m":
                d12 = 60.0d;
                break;
            case "t":
                d11 = aVar.f99377c;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "ms":
                d11 = 1000.0d;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            default:
                return (long) (d10 * 1000000.0d);
        }
        d10 *= d12;
        return (long) (d10 * 1000000.0d);
    }

    private static b p(XmlPullParser xmlPullParser) {
        String strA = p0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f99371g.matcher(strA);
        if (!matcher.matches()) {
            u.h("TtmlParser", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) q9.a.e(matcher.group(1))), Integer.parseInt((String) q9.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            u.h("TtmlParser", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // lb.t
    public void a(byte[] bArr, int i10, int i11, t.b bVar, l lVar) {
        i.c(parseToLegacySubtitle(bArr, i10, i11), bVar, lVar);
    }

    @Override // lb.t
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // lb.t
    public k parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        char c10;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f99374a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            h hVar = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int iE = 15;
            a aVarG = f99373i;
            b bVarP = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVarG = g(xmlPullParserNewPullParser);
                            c10 = 15;
                            iE = e(xmlPullParserNewPullParser, 15);
                            bVarP = p(xmlPullParserNewPullParser);
                        } else {
                            c10 = 15;
                        }
                        a aVar = aVarG;
                        b bVar = bVarP;
                        int i13 = iE;
                        if (c(name)) {
                            if ("head".equals(name)) {
                                h(xmlPullParserNewPullParser, map, i13, bVar, map2, map3);
                            } else {
                                try {
                                    c cVarJ = j(xmlPullParserNewPullParser, cVar, map2, aVar);
                                    arrayDeque.push(cVarJ);
                                    if (cVar != null) {
                                        cVar.a(cVarJ);
                                    }
                                } catch (m e10) {
                                    u.i("TtmlParser", "Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            iE = i13;
                            bVarP = bVar;
                            aVarG = aVar;
                        } else {
                            u.f("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iE = i13;
                        bVarP = bVar;
                        aVarG = aVar;
                    } else {
                        c10 = 15;
                        if (eventType == 4) {
                            ((c) q9.a.e(cVar)).a(c.d(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                hVar = new h((c) q9.a.e((c) arrayDeque.peek()), map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (k) q9.a.e(hVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // lb.t
    public /* synthetic */ void reset() {
        s.b(this);
    }
}
