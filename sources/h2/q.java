package h2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
class q extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumMap f72936d;

    q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        f2.a aVarValueOf;
        super(xmlPullParser);
        this.f72936d = new EnumMap(f2.a.class);
        xmlPullParser.require(2, null, "TrackingEvents");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (t.D(xmlPullParser.getName(), "Tracking")) {
                    String strA = new r(xmlPullParser).a("event");
                    try {
                        aVarValueOf = f2.a.valueOf(strA);
                    } catch (Exception unused) {
                        f2.c.a("VastXmlTag", "Event: %s is not valid. Skipping it.", strA);
                        aVarValueOf = null;
                    }
                    if (aVarValueOf != null) {
                        String strH = t.H(xmlPullParser);
                        List list = (List) this.f72936d.get(aVarValueOf);
                        if (list != null) {
                            list.add(strH);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(strH);
                            this.f72936d.put(aVarValueOf, arrayList);
                        }
                    }
                }
                t.I(xmlPullParser);
            }
        }
        xmlPullParser.require(3, null, "TrackingEvents");
    }

    EnumMap Y() {
        return this.f72936d;
    }
}
