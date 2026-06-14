package h2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class v extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f72945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f72946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f72947f;

    v(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, com.taurusx.tax.f.s.f66032y);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (t.D(name, com.taurusx.tax.f.s.f66022o)) {
                    c0(t.H(xmlPullParser));
                } else if (t.D(name, com.taurusx.tax.f.s.f66026s)) {
                    a0(t.H(xmlPullParser));
                } else if (t.D(name, "CustomClick")) {
                    b0(t.H(xmlPullParser));
                } else {
                    t.I(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, com.taurusx.tax.f.s.f66032y);
    }

    private void a0(String str) {
        if (this.f72946e == null) {
            this.f72946e = new ArrayList();
        }
        this.f72946e.add(str);
    }

    private void b0(String str) {
        if (this.f72947f == null) {
            this.f72947f = new ArrayList();
        }
        this.f72947f.add(str);
    }

    private void c0(String str) {
        this.f72945d = str;
    }

    public String Y() {
        return this.f72945d;
    }

    public List Z() {
        return this.f72946e;
    }
}
