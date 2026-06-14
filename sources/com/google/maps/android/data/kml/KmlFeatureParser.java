package com.google.maps.android.data.kml;

import androidx.constraintlayout.motion.widget.Key;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.data.Geometry;
import com.ironsource.C4257c4;
import com.taurusx.tax.f.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
class KmlFeatureParser {

    private static class LatLngAlt {
        public final Double altitude;
        public final LatLng latLng;

        LatLngAlt(LatLng latLng, Double d10) {
            this.latLng = latLng;
            this.altitude = d10;
        }
    }

    private static LatLngAlt a(String str) {
        return b(str, StringUtils.COMMA);
    }

    private static LatLngAlt b(String str, String str2) {
        String[] strArrSplit = str.split(str2);
        if (strArrSplit.length < 2) {
            throw new IllegalArgumentException("Wrong coordinate, latitude and longitude must be set");
        }
        return new LatLngAlt(new LatLng(Double.parseDouble(strArrSplit[1]), Double.parseDouble(strArrSplit[0])), strArrSplit.length > 2 ? Double.valueOf(Double.parseDouble(strArrSplit[2])) : null);
    }

    private static ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.trim().split("(\\s+)")) {
            arrayList.add(a(str2));
        }
        return arrayList;
    }

    private static ArrayList d(String str) {
        ArrayList arrayListC = c(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            arrayList.add(((LatLngAlt) it.next()).latLng);
        }
        return arrayList;
    }

    private static Geometry e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(str)) {
                return null;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Point")) {
                    return l(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("LineString")) {
                    return h(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("Track")) {
                    return n(xmlPullParser);
                }
                if (xmlPullParser.getName().equals(KmlPolygon.GEOMETRY_TYPE)) {
                    return m(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiGeometry")) {
                    return i(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiTrack")) {
                    return j(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static KmlGroundOverlay f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int eventType = xmlPullParser.getEventType();
        float fP = 0.0f;
        String strO = null;
        int i10 = 1;
        float f10 = 0.0f;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("GroundOverlay")) {
                return new KmlGroundOverlay(strO, g((Double) map2.get("north"), (Double) map2.get("south"), (Double) map2.get("east"), (Double) map2.get("west")), f10, i10, map, fP);
            }
            int i11 = i10;
            String str = strO;
            if (eventType != 2) {
                i10 = i11;
                strO = str;
            } else if (xmlPullParser.getName().equals(s.f66014g)) {
                i10 = i11;
                strO = o(xmlPullParser);
            } else if (xmlPullParser.getName().equals("drawOrder")) {
                i10 = i11;
                strO = str;
                f10 = Float.parseFloat(xmlPullParser.nextText());
            } else if (xmlPullParser.getName().equals("visibility")) {
                strO = str;
                i10 = Integer.parseInt(xmlPullParser.nextText());
            } else {
                if (xmlPullParser.getName().equals("ExtendedData")) {
                    map.putAll(q(xmlPullParser));
                } else if (xmlPullParser.getName().equals(Key.ROTATION)) {
                    i10 = i11;
                    strO = str;
                    fP = p(xmlPullParser);
                } else if (xmlPullParser.getName().matches("name|description|drawOrder|visibility|open|address|phoneNumber") || xmlPullParser.getName().equals("color")) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().matches("north|south|east|west")) {
                    map2.put(xmlPullParser.getName(), Double.valueOf(Double.parseDouble(xmlPullParser.nextText())));
                }
                i10 = i11;
                strO = str;
            }
            eventType = xmlPullParser.next();
        }
    }

    private static LatLngBounds g(Double d10, Double d11, Double d12, Double d13) {
        return new LatLngBounds(new LatLng(d11.doubleValue(), d13.doubleValue()), new LatLng(d10.doubleValue(), d12.doubleValue()));
    }

    private static KmlLineString h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineString")) {
                return new KmlLineString(arrayList, arrayList2);
            }
            if (eventType == 2 && xmlPullParser.getName().equals(C4257c4.f42802f)) {
                for (LatLngAlt latLngAlt : c(xmlPullParser.nextText())) {
                    arrayList.add(latLngAlt.latLng);
                    Double d10 = latLngAlt.altitude;
                    if (d10 != null) {
                        arrayList2.add(d10);
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlMultiGeometry i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals("MultiGeometry")) {
                return new KmlMultiGeometry(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches("Point|LineString|Polygon|MultiGeometry|Track|MultiTrack")) {
                arrayList.add(e(xmlPullParser, xmlPullParser.getName()));
            }
            next = xmlPullParser.next();
        }
    }

    private static KmlMultiTrack j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals("MultiTrack")) {
                return new KmlMultiTrack(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches("Track")) {
                arrayList.add(n(xmlPullParser));
            }
            next = xmlPullParser.next();
        }
    }

    static KmlPlacemark k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        Geometry geometryE = null;
        String strNextText = null;
        KmlStyle kmlStyleE = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Placemark")) {
                return new KmlPlacemark(geometryE, strNextText, kmlStyleE, map);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("styleUrl")) {
                    strNextText = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().matches("Point|LineString|Polygon|MultiGeometry|Track|MultiTrack")) {
                    geometryE = e(xmlPullParser, xmlPullParser.getName());
                } else if (xmlPullParser.getName().matches("name|description|drawOrder|visibility|open|address|phoneNumber")) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    map.putAll(q(xmlPullParser));
                } else if (xmlPullParser.getName().equals("Style")) {
                    kmlStyleE = KmlStyleParser.e(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlPoint l(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        LatLngAlt latLngAltA = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Point")) {
                return new KmlPoint(latLngAltA.latLng, latLngAltA.altitude);
            }
            if (eventType == 2 && xmlPullParser.getName().equals(C4257c4.f42802f)) {
                latLngAltA = a(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlPolygon m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        boolean zEquals = false;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(KmlPolygon.GEOMETRY_TYPE)) {
                return new KmlPolygon(arrayList, arrayList2);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches("outerBoundaryIs|innerBoundaryIs")) {
                    zEquals = xmlPullParser.getName().equals("outerBoundaryIs");
                } else if (xmlPullParser.getName().equals(C4257c4.f42802f)) {
                    if (zEquals) {
                        arrayList = d(xmlPullParser.nextText());
                    } else {
                        arrayList2.add(d(xmlPullParser.nextText()));
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlTrack n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Track")) {
                return new KmlTrack(arrayList, arrayList2, arrayList3, map);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("coord")) {
                    LatLngAlt latLngAltB = b(xmlPullParser.nextText(), " ");
                    arrayList.add(latLngAltB.latLng);
                    Double d10 = latLngAltB.altitude;
                    if (d10 != null) {
                        arrayList2.add(d10);
                    }
                } else if (xmlPullParser.getName().equals("when")) {
                    try {
                        arrayList3.add(Long.valueOf(simpleDateFormat.parse(xmlPullParser.nextText()).getTime()));
                    } catch (ParseException e10) {
                        throw new XmlPullParserException("Invalid date", xmlPullParser, e10);
                    }
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    map.putAll(q(xmlPullParser));
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static String o(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(s.f66014g)) {
                return null;
            }
            if (eventType == 2 && xmlPullParser.getName().equals(SVGParserImpl.XML_STYLESHEET_ATTR_HREF)) {
                return xmlPullParser.nextText();
            }
            eventType = xmlPullParser.next();
        }
    }

    private static float p(XmlPullParser xmlPullParser) {
        return -Float.parseFloat(xmlPullParser.nextText());
    }

    private static HashMap q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        String attributeValue = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("ExtendedData")) {
                return map;
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
