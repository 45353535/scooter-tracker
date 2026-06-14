package yads;

import android.text.Layout;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class e73 extends rw2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f110235n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f110236o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f110237p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f110238q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f110239r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f110240s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f110241t = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c73 f110242u = new c73(30.0f, 1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b73 f110243v = new b73(15);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f110244m;

    public e73() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f110244m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static i73 a(i73 i73Var) {
        return i73Var == null ? new i73() : i73Var;
    }

    public static Layout.Alignment b(String str) {
        String strA = ci.a(str);
        strA.getClass();
        switch (strA) {
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

    @Override // yads.rw2
    public final d23 a(byte[] bArr, int i10, boolean z10) throws f23 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f110244m.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new g73("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            d73 d73VarB = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i11 = 0;
            c73 c73VarA = f110242u;
            b73 b73VarA = f110243v;
            j73 j73Var = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                f73 f73Var = (f73) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c73VarA = a(xmlPullParserNewPullParser);
                            b73VarA = a(xmlPullParserNewPullParser, f110243v);
                            d73VarB = b(xmlPullParserNewPullParser);
                        }
                        b73 b73Var = b73VarA;
                        c73 c73Var = c73VarA;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                a(xmlPullParserNewPullParser, map, b73Var, d73VarB, map2, map3);
                            } else {
                                try {
                                    f73 f73VarA = a(xmlPullParserNewPullParser, f73Var, map2, c73Var);
                                    arrayDeque.push(f73VarA);
                                    if (f73Var != null) {
                                        if (f73Var.f110635m == null) {
                                            f73Var.f110635m = new ArrayList();
                                        }
                                        f73Var.f110635m.add(f73VarA);
                                    }
                                } catch (f23 e10) {
                                    uf1.d("TtmlDecoder", uf1.a("Suppressing parser error", e10));
                                    b73VarA = b73Var;
                                    c73VarA = c73Var;
                                    i11++;
                                }
                            }
                            b73VarA = b73Var;
                            c73VarA = c73Var;
                        } else {
                            uf1.c("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        b73VarA = b73Var;
                        c73VarA = c73Var;
                        i11++;
                    } else if (eventType == 4) {
                        f73Var.getClass();
                        f73 f73VarA2 = f73.a(xmlPullParserNewPullParser.getText());
                        if (f73Var.f110635m == null) {
                            f73Var.f110635m = new ArrayList();
                        }
                        f73Var.f110635m.add(f73VarA2);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            f73 f73Var2 = (f73) arrayDeque.peek();
                            f73Var2.getClass();
                            j73Var = new j73(f73Var2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (j73Var != null) {
                return j73Var;
            }
            throw new f23("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new f23("Unable to decode source", e12);
        }
    }

    public static d73 b(XmlPullParser xmlPullParser) {
        String strA = ym3.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f110240s.matcher(strA);
        if (!matcher.matches()) {
            uf1.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strA));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new d73(i10, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            uf1.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strA));
            return null;
        }
    }

    public static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static b73 a(XmlPullParser xmlPullParser, b73 b73Var) throws f23 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return b73Var;
        }
        Matcher matcher = f110241t.matcher(attributeValue);
        if (!matcher.matches()) {
            uf1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return b73Var;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 == 0 || i11 == 0) {
                throw new f23("Invalid cell resolution " + i10 + " " + i11);
            }
            return new b73(i11);
        } catch (NumberFormatException unused) {
            uf1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return b73Var;
        }
    }

    public static void a(String str, i73 i73Var) throws f23 {
        Matcher matcher;
        String strGroup;
        int i10 = w83.f117341a;
        String[] strArrSplit = str.split("\\s+", -1);
        if (strArrSplit.length == 1) {
            matcher = f110237p.matcher(str);
        } else if (strArrSplit.length == 2) {
            matcher = f110237p.matcher(strArrSplit[1]);
            uf1.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new f23("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
        }
        if (matcher.matches()) {
            strGroup = matcher.group(3);
            strGroup.getClass();
            switch (strGroup) {
                case "%":
                    i73Var.f111903j = 3;
                    break;
                case "em":
                    i73Var.f111903j = 2;
                    break;
                case "px":
                    i73Var.f111903j = 1;
                    break;
                default:
                    throw new f23("Invalid unit for fontSize: '" + strGroup + "'.");
            }
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            i73Var.f111904k = Float.parseFloat(strGroup2);
            return;
        }
        throw new f23("Invalid expression for fontSize: '" + str + "'.");
    }

    public static c73 a(XmlPullParser xmlPullParser) throws f23 {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = w83.f117341a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new f23("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        c73 c73Var = f110242u;
        int i12 = c73Var.f109272b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = c73Var.f109273c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new c73(i10 * f10, i12, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0264 A[LOOP:0: B:3:0x000a->B:106:0x0264, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, yads.b73 r22, yads.d73 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e73.a(org.xmlpull.v1.XmlPullParser, java.util.HashMap, yads.b73, yads.d73, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.f73 a(org.xmlpull.v1.XmlPullParser r23, yads.f73 r24, java.util.HashMap r25, yads.c73 r26) throws yads.f23 {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e73.a(org.xmlpull.v1.XmlPullParser, yads.f73, java.util.HashMap, yads.c73):yads.f73");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static i73 a(XmlPullParser xmlPullParser, i73 i73Var) {
        byte b10;
        int attributeCount = xmlPullParser.getAttributeCount();
        i73 i73VarA = i73Var;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    b10 = attributeName.equals("fontStyle") ? (byte) 0 : (byte) -1;
                    break;
                case -1224696685:
                    b10 = attributeName.equals("fontFamily") ? (byte) 1 : (byte) -1;
                    break;
                case -1065511464:
                    b10 = attributeName.equals("textAlign") ? (byte) 2 : (byte) -1;
                    break;
                case -879295043:
                    b10 = attributeName.equals("textDecoration") ? (byte) 3 : (byte) -1;
                    break;
                case -734428249:
                    b10 = attributeName.equals("fontWeight") ? (byte) 4 : (byte) -1;
                    break;
                case 3355:
                    b10 = attributeName.equals("id") ? (byte) 5 : (byte) -1;
                    break;
                case 3511770:
                    b10 = attributeName.equals("ruby") ? (byte) 6 : (byte) -1;
                    break;
                case 94842723:
                    b10 = attributeName.equals("color") ? (byte) 7 : (byte) -1;
                    break;
                case 109403361:
                    b10 = attributeName.equals("shear") ? (byte) 8 : (byte) -1;
                    break;
                case 110138194:
                    b10 = attributeName.equals("textCombine") ? (byte) 9 : (byte) -1;
                    break;
                case 365601008:
                    b10 = attributeName.equals("fontSize") ? (byte) 10 : (byte) -1;
                    break;
                case 921125321:
                    b10 = attributeName.equals("textEmphasis") ? Ascii.VT : (byte) -1;
                    break;
                case 1115953443:
                    b10 = attributeName.equals("rubyPosition") ? Ascii.FF : (byte) -1;
                    break;
                case 1287124693:
                    b10 = attributeName.equals("backgroundColor") ? (byte) 13 : (byte) -1;
                    break;
                case 1754920356:
                    b10 = attributeName.equals("multiRowAlign") ? Ascii.SO : (byte) -1;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    i73VarA = a(i73VarA);
                    i73VarA.f111902i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    i73VarA = a(i73VarA);
                    i73VarA.f111894a = attributeValue;
                    break;
                case 2:
                    i73VarA = a(i73VarA);
                    i73VarA.f111908o = b(attributeValue);
                    break;
                case 3:
                    String strA = ci.a(attributeValue);
                    strA.getClass();
                    switch (strA) {
                        case "nounderline":
                            i73VarA = a(i73VarA);
                            i73VarA.f111900g = 0;
                            break;
                        case "underline":
                            i73VarA = a(i73VarA);
                            i73VarA.f111900g = 1;
                            break;
                        case "nolinethrough":
                            i73VarA = a(i73VarA);
                            i73VarA.f111899f = 0;
                            break;
                        case "linethrough":
                            i73VarA = a(i73VarA);
                            i73VarA.f111899f = 1;
                            break;
                    }
                    break;
                case 4:
                    i73VarA = a(i73VarA);
                    i73VarA.f111901h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        i73VarA = a(i73VarA);
                        i73VarA.f111905l = attributeValue;
                    }
                    break;
                case 6:
                    String strA2 = ci.a(attributeValue);
                    strA2.getClass();
                    switch (strA2) {
                        case "baseContainer":
                        case "base":
                            i73VarA = a(i73VarA);
                            i73VarA.f111906m = 2;
                            break;
                        case "container":
                            i73VarA = a(i73VarA);
                            i73VarA.f111906m = 1;
                            break;
                        case "delimiter":
                            i73VarA = a(i73VarA);
                            i73VarA.f111906m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            i73VarA = a(i73VarA);
                            i73VarA.f111906m = 3;
                            break;
                    }
                    break;
                case 7:
                    i73VarA = a(i73VarA);
                    try {
                        i73VarA.f111895b = xw.a(attributeValue, false);
                        i73VarA.f111896c = true;
                    } catch (IllegalArgumentException unused) {
                        bj1.a("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                    }
                    break;
                case 8:
                    i73 i73VarA2 = a(i73VarA);
                    Matcher matcher = f110238q.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (!matcher.matches()) {
                        bj1.a("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    } else {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e10) {
                            uf1.d("TtmlDecoder", uf1.a("Failed to parse shear: " + attributeValue, e10));
                        }
                    }
                    i73VarA2.f111912s = fMin;
                    i73VarA = i73VarA2;
                    break;
                case 9:
                    String strA3 = ci.a(attributeValue);
                    strA3.getClass();
                    if (strA3.equals("all")) {
                        i73VarA = a(i73VarA);
                        i73VarA.f111910q = 1;
                    } else if (strA3.equals("none")) {
                        i73VarA = a(i73VarA);
                        i73VarA.f111910q = 0;
                    }
                    break;
                case 10:
                    try {
                        i73VarA = a(i73VarA);
                        a(attributeValue, i73VarA);
                    } catch (f23 unused2) {
                        bj1.a("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                    }
                    break;
                case 11:
                    i73VarA = a(i73VarA);
                    i73VarA.f111911r = h33.a(attributeValue);
                    break;
                case 12:
                    String strA4 = ci.a(attributeValue);
                    strA4.getClass();
                    if (strA4.equals("before")) {
                        i73VarA = a(i73VarA);
                        i73VarA.f111907n = 1;
                    } else if (strA4.equals("after")) {
                        i73VarA = a(i73VarA);
                        i73VarA.f111907n = 2;
                    }
                    break;
                case 13:
                    i73VarA = a(i73VarA);
                    try {
                        i73VarA.f111897d = xw.a(attributeValue, false);
                        i73VarA.f111898e = true;
                    } catch (IllegalArgumentException unused3) {
                        bj1.a("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                    }
                    break;
                case 14:
                    i73VarA = a(i73VarA);
                    i73VarA.f111909p = b(attributeValue);
                    break;
            }
        }
        return i73VarA;
    }

    public static long a(String str, c73 c73Var) throws f23 {
        double d10;
        double d11;
        double d12;
        Matcher matcher = f110235n.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d13 = Long.parseLong(strGroup) * 3600;
            matcher.group(2).getClass();
            double d14 = d13 + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double d15 = d14 + Long.parseLong(r13);
            String strGroup2 = matcher.group(4);
            return (long) ((d15 + (strGroup2 != null ? Double.parseDouble(strGroup2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / c73Var.f109271a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) c73Var.f109272b)) / ((double) c73Var.f109271a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f110236o.matcher(str);
        if (matcher2.matches()) {
            String strGroup3 = matcher2.group(1);
            strGroup3.getClass();
            d10 = Double.parseDouble(strGroup3);
            String strGroup4 = matcher2.group(2);
            strGroup4.getClass();
            switch (strGroup4) {
                case "f":
                    d11 = c73Var.f109271a;
                    d10 /= d11;
                    return (long) (d10 * 1000000.0d);
                case "h":
                    d12 = 3600.0d;
                    break;
                case "m":
                    d12 = 60.0d;
                    break;
                case "t":
                    d11 = c73Var.f109273c;
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
        throw new f23("Malformed time expression: " + str);
    }
}
