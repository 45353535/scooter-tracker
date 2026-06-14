package h2;

import com.taurusx.tax.f.y;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class w extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f72948j = {"followAdditionalWrappers", "allowMultipleAds", "fallbackOnNoAd"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f72949i;

    public w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, com.taurusx.tax.f.w.f66049y);
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
                } else if (t.D(name, com.taurusx.tax.f.n.f66007g)) {
                    l0(t.H(xmlPullParser));
                } else {
                    t.I(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, com.taurusx.tax.f.w.f66049y);
    }

    private void l0(String str) {
        this.f72949i = str;
    }

    @Override // h2.t
    public String[] O() {
        return f72948j;
    }

    public String k0() {
        return this.f72949i;
    }
}
