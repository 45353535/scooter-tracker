package h2;

import com.taurusx.tax.f.y;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class k extends a {
    k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, com.taurusx.tax.f.w.f66048w);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (t.D(name, y.f66054o)) {
                    Z(b0(xmlPullParser));
                } else if (t.D(name, y.f66056t)) {
                    a0(d0(xmlPullParser));
                } else if (t.D(name, y.f66057w)) {
                    j0(t.H(xmlPullParser));
                } else if (t.D(name, "Error")) {
                    i0(t.H(xmlPullParser));
                } else if (t.D(name, "AdSystem")) {
                    Y(new b(xmlPullParser));
                } else {
                    t.I(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, com.taurusx.tax.f.w.f66048w);
    }
}
