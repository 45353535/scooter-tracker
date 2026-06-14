package com.google.maps.android.data.kml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
class KmlContainerParser {
    private static KmlContainer a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        String attributeValue = xmlPullParser.getAttributeValue(null, "id") != null ? xmlPullParser.getAttributeValue(null, "id") : null;
        xmlPullParser.next();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(name)) {
                return new KmlContainer(map, map2, map3, map4, arrayList, map5, attributeValue);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches("altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when")) {
                    KmlParser.g(xmlPullParser);
                } else if (xmlPullParser.getName().matches("Folder|Document")) {
                    arrayList.add(a(xmlPullParser));
                } else if (xmlPullParser.getName().matches("name|description|visibility|open|address|phoneNumber")) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("StyleMap")) {
                    e(xmlPullParser, map4);
                } else if (xmlPullParser.getName().equals("Style")) {
                    d(xmlPullParser, map2);
                } else if (xmlPullParser.getName().equals("Placemark")) {
                    c(xmlPullParser, map3);
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    f(xmlPullParser, map);
                } else if (xmlPullParser.getName().equals("GroundOverlay")) {
                    map5.put(KmlFeatureParser.f(xmlPullParser), null);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static KmlContainer b(XmlPullParser xmlPullParser) {
        return a(xmlPullParser);
    }

    private static void c(XmlPullParser xmlPullParser, HashMap map) {
        map.put(KmlFeatureParser.k(xmlPullParser), null);
    }

    private static void d(XmlPullParser xmlPullParser, HashMap map) throws XmlPullParserException, IOException {
        if (xmlPullParser.getAttributeValue(null, "id") != null) {
            KmlStyle kmlStyleE = KmlStyleParser.e(xmlPullParser);
            map.put(kmlStyleE.f(), kmlStyleE);
        }
    }

    private static void e(XmlPullParser xmlPullParser, HashMap map) {
        map.putAll(KmlStyleParser.f(xmlPullParser));
    }

    private static void f(XmlPullParser xmlPullParser, HashMap map) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        String attributeValue = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("ExtendedData")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Data")) {
                    attributeValue = xmlPullParser.getAttributeValue(null, "name");
                } else if (xmlPullParser.getName().equals("value") && attributeValue != null) {
                    map.put(attributeValue, xmlPullParser.nextText());
                    attributeValue = null;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
