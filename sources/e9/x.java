package e9;

import com.taurusx.tax.f.y;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class x extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f68998j = {"followAdditionalWrappers", "allowMultipleAds", "fallbackOnNoAd"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f68999i;

    public x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, com.taurusx.tax.f.w.f66049y);
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
                } else if (u.C(name, com.taurusx.tax.f.n.f66007g)) {
                    k0(u.G(xmlPullParser));
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, com.taurusx.tax.f.w.f66049y);
    }

    private void k0(String str) {
        this.f68999i = str;
    }

    @Override // e9.u
    public String[] N() {
        return f68998j;
    }

    public String j0() {
        return this.f68999i;
    }
}
