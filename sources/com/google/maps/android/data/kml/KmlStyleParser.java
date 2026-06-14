package com.google.maps.android.data.kml;

import android.util.Log;
import com.adjust.sdk.Constants;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.s;
import java.io.IOException;
import java.util.HashMap;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
class KmlStyleParser {
    private static void a(XmlPullParser xmlPullParser, KmlStyle kmlStyle) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("BalloonStyle")) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("text")) {
                kmlStyle.n(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void b(XmlPullParser xmlPullParser, KmlStyle kmlStyle) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("IconStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("heading")) {
                    kmlStyle.i(Float.parseFloat(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(s.f66014g)) {
                    h(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("hotSpot")) {
                    g(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("scale")) {
                    kmlStyle.l(Double.parseDouble(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("color")) {
                    kmlStyle.p(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    kmlStyle.k(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void c(XmlPullParser xmlPullParser, KmlStyle kmlStyle) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("color")) {
                    kmlStyle.r(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("width")) {
                    kmlStyle.u(Float.valueOf(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    kmlStyle.o(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void d(XmlPullParser xmlPullParser, KmlStyle kmlStyle) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("PolyStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("color")) {
                    kmlStyle.h(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("outline")) {
                    kmlStyle.q(KmlBoolean.parseBoolean(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(Reporting.EventType.FILL)) {
                    kmlStyle.setFill(KmlBoolean.parseBoolean(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    kmlStyle.s(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static KmlStyle e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        KmlStyle kmlStyle = new KmlStyle();
        i(xmlPullParser.getAttributeValue(null, "id"), kmlStyle);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Style")) {
                return kmlStyle;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("IconStyle")) {
                    b(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("LineStyle")) {
                    c(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("PolyStyle")) {
                    d(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("BalloonStyle")) {
                    a(xmlPullParser, kmlStyle);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static HashMap f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        String str = "#" + xmlPullParser.getAttributeValue(null, "id");
        int eventType = xmlPullParser.getEventType();
        boolean z10 = false;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("StyleMap")) {
                return map;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(C4240b4.i.W) && xmlPullParser.nextText().equals(Constants.NORMAL)) {
                    z10 = true;
                } else if (xmlPullParser.getName().equals("styleUrl") && z10) {
                    map.put(str, xmlPullParser.nextText());
                    z10 = false;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void g(XmlPullParser xmlPullParser, KmlStyle kmlStyle) {
        try {
            kmlStyle.j(Float.parseFloat(xmlPullParser.getAttributeValue(null, "x")), Float.parseFloat(xmlPullParser.getAttributeValue(null, "y")), xmlPullParser.getAttributeValue(null, "xunits"), xmlPullParser.getAttributeValue(null, "yunits"));
        } catch (NullPointerException unused) {
            Log.w("KmlStyleParser", "Missing 'x' or 'y' attributes in hotSpot for style with id: " + kmlStyle.f());
        } catch (NumberFormatException unused2) {
            Log.w("KmlStyleParser", "Invalid number in 'x' or 'y' attributes in hotSpot for style with id: " + kmlStyle.f());
        }
    }

    private static void h(XmlPullParser xmlPullParser, KmlStyle kmlStyle) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(s.f66014g)) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals(SVGParserImpl.XML_STYLESHEET_ATTR_HREF)) {
                kmlStyle.m(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void i(String str, KmlStyle kmlStyle) {
        if (str != null) {
            kmlStyle.t("#" + str);
        }
    }
}
