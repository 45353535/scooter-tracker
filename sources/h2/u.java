package h2;

import com.taurusx.tax.f.z;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class u extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f72942f = {z.f66061c};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f72943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f72944e;

    u(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, z.f66070y);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (t.D(name, z.f66066o)) {
                    this.f72943d = new l(xmlPullParser);
                } else if (t.D(name, z.f66065n)) {
                    this.f72944e = t.H(xmlPullParser);
                } else {
                    t.I(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, z.f66070y);
    }

    @Override // h2.t
    public String[] O() {
        return f72942f;
    }
}
