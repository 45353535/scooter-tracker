package e9;

import android.graphics.Color;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class u implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f68990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f68991c;

    public u() {
    }

    static void B(XmlPullParser xmlPullParser, b9.k kVar) {
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    if ("stroke".equals(attributeName)) {
                        kVar.a0(F(attributeValue));
                    } else if (Reporting.EventType.FILL.equals(attributeName)) {
                        kVar.N(F(attributeValue));
                    } else if ("outlined".equals(attributeName)) {
                        kVar.X(Boolean.valueOf(U(attributeValue)));
                    } else if ("visible".equals(attributeName)) {
                        kVar.e0(Boolean.valueOf(U(attributeValue)));
                    } else if ("x".equals(attributeName)) {
                        kVar.T(P(attributeValue));
                    } else if ("y".equals(attributeName)) {
                        kVar.d0(Q(attributeValue));
                    } else if ("style".equals(attributeName)) {
                        kVar.c0(attributeValue);
                    } else if ("opacity".equals(attributeName)) {
                        kVar.W(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("hideafter".equals(attributeName)) {
                        kVar.S(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("padding".equals(attributeName)) {
                        kVar.Z(attributeValue);
                    } else if ("margin".equals(attributeName)) {
                        kVar.V(attributeValue);
                    } else if ("strokewidth".equals(attributeName)) {
                        kVar.b0(b9.u.o(attributeValue));
                    } else if ("width".equals(attributeName)) {
                        kVar.f0(b9.u.o(attributeValue));
                    } else if ("height".equals(attributeName)) {
                        kVar.Q(b9.u.o(attributeValue));
                    } else if ("fontstyle".equals(attributeName)) {
                        kVar.P(Integer.valueOf(Integer.parseInt(attributeValue)));
                    } else if ("fontsize".equals(attributeName)) {
                        kVar.O(b9.u.o(attributeValue));
                    }
                } catch (Throwable th2) {
                    c9.e.c("VastXmlTag", th2);
                }
            }
        }
        try {
            kVar.M(G(xmlPullParser));
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

    static boolean C(String str, String str2) {
        return str != null && str.equalsIgnoreCase(str2);
    }

    static boolean E(XmlPullParser xmlPullParser) {
        return U(G(xmlPullParser));
    }

    static Integer F(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e10) {
            c9.e.b("VastXmlTag", e10.getMessage(), new Object[0]);
            return null;
        }
    }

    static String G(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    static void H(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    private boolean I(String str) {
        for (String str2 : N()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    static int J(String str) {
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
            c9.e.c("VastXmlTag", e10);
            return -1;
        }
    }

    static int K(String str) {
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
            c9.e.c("VastXmlTag", e10);
            return -1;
        }
    }

    static Integer L(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        if (lowerCase.equals("portrait")) {
            return 1;
        }
        return !lowerCase.equals("landscape") ? null : 2;
    }

    static Integer P(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "center":
                return 1;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return null;
        }
    }

    static Integer Q(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "bottom":
                return 80;
            case "center":
                return 16;
            case "top":
                return 48;
            default:
                return null;
        }
    }

    static boolean T(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("false") || str.equalsIgnoreCase("0");
        }
        return false;
    }

    static boolean U(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("1");
        }
        return false;
    }

    private static HashMap b(u uVar, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getAttributeCount() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            if (uVar.I(xmlPullParser.getAttributeName(i10))) {
                map.put(xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
            }
        }
        return map;
    }

    private void c(HashMap map) {
        this.f68991c = map;
    }

    final int D(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            c9.e.a("VastXmlTag", "Error parse attribute value - %s, by name - %s", strA, str);
            return -1;
        }
        try {
            return Integer.parseInt(strA);
        } catch (Exception unused) {
            c9.e.b("VastXmlTag", "Error parse attribute value - %s, by name - %s", strA, str);
            return -1;
        }
    }

    public final boolean M(String str, boolean z10) {
        String strA = a(str);
        if (U(strA)) {
            return true;
        }
        if (T(strA)) {
            return false;
        }
        return z10;
    }

    public String[] N() {
        return new String[0];
    }

    public final String O() {
        return this.f68990b;
    }

    public boolean S() {
        return false;
    }

    public void V(XmlPullParser xmlPullParser) {
        c(b(this, xmlPullParser));
        if (S()) {
            W(G(xmlPullParser));
        }
        A(xmlPullParser);
    }

    public final void W(String str) {
        this.f68990b = str;
    }

    final String a(String str) {
        HashMap map = this.f68991c;
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public u(XmlPullParser xmlPullParser) {
        V(xmlPullParser);
    }

    protected void A(XmlPullParser xmlPullParser) {
    }
}
