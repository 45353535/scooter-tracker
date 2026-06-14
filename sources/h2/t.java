package h2;

import android.graphics.Color;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f72940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f72941c;

    public t() {
    }

    static void B(XmlPullParser xmlPullParser, e2.e eVar) {
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    if ("stroke".equals(attributeName)) {
                        eVar.a0(G(attributeValue));
                    } else if (Reporting.EventType.FILL.equals(attributeName)) {
                        eVar.N(G(attributeValue));
                    } else if ("outlined".equals(attributeName)) {
                        eVar.X(Boolean.valueOf(V(attributeValue)));
                    } else if ("visible".equals(attributeName)) {
                        eVar.e0(Boolean.valueOf(V(attributeValue)));
                    } else if ("x".equals(attributeName)) {
                        eVar.T(Q(attributeValue));
                    } else if ("y".equals(attributeName)) {
                        eVar.d0(S(attributeValue));
                    } else if ("style".equals(attributeName)) {
                        eVar.c0(attributeValue);
                    } else if ("opacity".equals(attributeName)) {
                        eVar.W(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("hideafter".equals(attributeName)) {
                        eVar.S(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("padding".equals(attributeName)) {
                        eVar.Z(attributeValue);
                    } else if ("margin".equals(attributeName)) {
                        eVar.V(attributeValue);
                    } else if ("strokewidth".equals(attributeName)) {
                        eVar.b0(e2.g.j(attributeValue));
                    } else if ("width".equals(attributeName)) {
                        eVar.f0(e2.g.j(attributeValue));
                    } else if ("height".equals(attributeName)) {
                        eVar.Q(e2.g.j(attributeValue));
                    } else if ("fontstyle".equals(attributeName)) {
                        eVar.P(Integer.valueOf(Integer.parseInt(attributeValue)));
                    } else if ("fontsize".equals(attributeName)) {
                        eVar.O(e2.g.j(attributeValue));
                    }
                } catch (Throwable th2) {
                    f2.c.b("VastXmlTag", th2);
                }
            }
        }
        try {
            eVar.M(H(xmlPullParser));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            xmlPullParser.require(3, null, xmlPullParser.getName());
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    private boolean C() {
        HashMap map = this.f72941c;
        return (map == null || map.isEmpty()) ? false : true;
    }

    static boolean D(String str, String str2) {
        return str != null && str.equalsIgnoreCase(str2);
    }

    static boolean F(XmlPullParser xmlPullParser) {
        return V(H(xmlPullParser));
    }

    static Integer G(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e10) {
            f2.c.c("VastXmlTag", e10.getMessage(), new Object[0]);
            return null;
        }
    }

    static String H(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() != 4) {
            return null;
        }
        String text = xmlPullParser.getText();
        if (!TextUtils.isEmpty(text)) {
            text = text.trim();
        }
        xmlPullParser.nextTag();
        return text;
    }

    static void I(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private boolean J(String str) {
        String[] strArrO = O();
        if (strArrO != null && strArrO.length > 0) {
            for (String str2 : strArrO) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    static int K(String str) {
        if (str == null) {
            return -1;
        }
        int iIndexOf = str.indexOf(".");
        if (iIndexOf > 0) {
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length <= 2) {
            return -1;
        }
        try {
            return (Integer.parseInt(strArrSplit[0]) * 3600) + (Integer.parseInt(strArrSplit[1]) * 60) + Integer.parseInt(strArrSplit[2]);
        } catch (Exception e10) {
            f2.c.b("VastXmlTag", e10);
            return -1;
        }
    }

    static int L(String str) {
        if (str == null) {
            return -1;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length <= 1) {
            return -1;
        }
        try {
            return (Integer.parseInt(strArrSplit[0]) * 60) + Integer.parseInt(strArrSplit[1]);
        } catch (Exception e10) {
            f2.c.b("VastXmlTag", e10);
            return -1;
        }
    }

    static Integer M(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        if (lowerCase.equals("portrait")) {
            i10 = 1;
        } else {
            if (!lowerCase.equals("landscape")) {
                return null;
            }
            i10 = 2;
        }
        return Integer.valueOf(i10);
    }

    static Integer Q(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "center":
                return 1;
            case "left":
                i10 = 3;
                break;
            case "right":
                i10 = 5;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    static Integer S(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "bottom":
                i10 = 80;
                break;
            case "center":
                i10 = 16;
                break;
            case "top":
                i10 = 48;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    static boolean U(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("false") || str.equalsIgnoreCase("0");
        }
        return false;
    }

    static boolean V(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("1");
        }
        return false;
    }

    private static HashMap b(t tVar, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getAttributeCount() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            if (tVar.J(xmlPullParser.getAttributeName(i10))) {
                map.put(xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
            }
        }
        return map;
    }

    private void c(HashMap map) {
        this.f72941c = map;
    }

    final int E(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            f2.c.a("VastXmlTag", "Error parse attribute value - %s, by name - %s", strA, str);
            return -1;
        }
        try {
            return Integer.parseInt(strA);
        } catch (Exception unused) {
            f2.c.c("VastXmlTag", "Error parse attribute value - %s, by name - %s", strA, str);
            return -1;
        }
    }

    public final boolean N(String str, boolean z10) {
        String strA = a(str);
        if (V(strA)) {
            return true;
        }
        if (U(strA)) {
            return false;
        }
        return z10;
    }

    public String[] O() {
        return new String[0];
    }

    public final String P() {
        return this.f72940b;
    }

    public boolean T() {
        return false;
    }

    public void W(XmlPullParser xmlPullParser) {
        c(b(this, xmlPullParser));
        if (T()) {
            X(H(xmlPullParser));
        }
        A(xmlPullParser);
    }

    public final void X(String str) {
        this.f72940b = str;
    }

    final String a(String str) {
        if (C()) {
            return (String) this.f72941c.get(str);
        }
        return null;
    }

    public t(XmlPullParser xmlPullParser) {
        W(xmlPullParser);
    }

    protected void A(XmlPullParser xmlPullParser) {
    }
}
