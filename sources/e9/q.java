package e9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
class q extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumMap f68986d;

    q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        c9.a aVarValueOf;
        super(xmlPullParser);
        this.f68986d = new EnumMap(c9.a.class);
        xmlPullParser.require(2, null, "TrackingEvents");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.C(xmlPullParser.getName(), "Tracking")) {
                    String strA = new r(xmlPullParser).a("event");
                    try {
                        aVarValueOf = c9.a.valueOf(strA);
                    } catch (Exception unused) {
                        c9.e.a("VastXmlTag", "Event: %s is not valid. Skipping it.", strA);
                        aVarValueOf = null;
                    }
                    if (aVarValueOf != null) {
                        String strG = u.G(xmlPullParser);
                        List list = (List) this.f68986d.get(aVarValueOf);
                        if (list != null) {
                            list.add(strG);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(strG);
                            this.f68986d.put(aVarValueOf, arrayList);
                        }
                    } else {
                        u.H(xmlPullParser);
                    }
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "TrackingEvents");
    }

    EnumMap X() {
        return this.f68986d;
    }
}
