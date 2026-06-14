package e9;

import com.taurusx.tax.f.y;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class k extends a {
    k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, com.taurusx.tax.f.w.f66048w);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.C(name, y.f66054o)) {
                    Y(a0(xmlPullParser));
                } else if (u.C(name, y.f66056t)) {
                    Z(c0(xmlPullParser));
                } else if (u.C(name, y.f66057w)) {
                    i0(u.G(xmlPullParser));
                } else if (u.C(name, "Error")) {
                    h0(u.G(xmlPullParser));
                } else if (u.C(name, "AdSystem")) {
                    X(new b(xmlPullParser));
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, com.taurusx.tax.f.w.f66048w);
    }
}
