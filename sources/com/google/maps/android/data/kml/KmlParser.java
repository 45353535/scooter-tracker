package com.google.maps.android.data.kml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
class KmlParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParser f33993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f33994b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f33995c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f33996d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f33997e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f33998f = new HashMap();

    KmlParser(XmlPullParser xmlPullParser) {
        this.f33993a = xmlPullParser;
    }

    static void g(XmlPullParser xmlPullParser) {
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

    ArrayList a() {
        return this.f33995c;
    }

    HashMap b() {
        return this.f33998f;
    }

    HashMap c() {
        return this.f33994b;
    }

    HashMap d() {
        return this.f33997e;
    }

    HashMap e() {
        return this.f33996d;
    }

    void f() throws XmlPullParserException, IOException {
        int eventType = this.f33993a.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                if (this.f33993a.getName().matches("altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|NetworkLink|NetworkLinkControl|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when")) {
                    g(this.f33993a);
                }
                if (this.f33993a.getName().matches("Folder|Document")) {
                    this.f33995c.add(KmlContainerParser.b(this.f33993a));
                }
                if (this.f33993a.getName().equals("Style")) {
                    KmlStyle kmlStyleE = KmlStyleParser.e(this.f33993a);
                    this.f33996d.put(kmlStyleE.f(), kmlStyleE);
                }
                if (this.f33993a.getName().equals("StyleMap")) {
                    this.f33997e.putAll(KmlStyleParser.f(this.f33993a));
                }
                if (this.f33993a.getName().equals("Placemark")) {
                    this.f33994b.put(KmlFeatureParser.k(this.f33993a), null);
                }
                if (this.f33993a.getName().equals("GroundOverlay")) {
                    this.f33998f.put(KmlFeatureParser.f(this.f33993a), null);
                }
            }
            eventType = this.f33993a.next();
        }
        this.f33996d.put(null, new KmlStyle());
    }
}
