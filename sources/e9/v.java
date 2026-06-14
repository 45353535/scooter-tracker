package e9;

import com.taurusx.tax.f.z;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class v extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f68992f = {z.f66061c};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f68993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f68994e;

    v(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, z.f66070y);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.C(name, z.f66066o)) {
                    this.f68993d = new l(xmlPullParser);
                } else if (u.C(name, z.f66065n)) {
                    this.f68994e = u.G(xmlPullParser);
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, z.f66070y);
    }

    @Override // e9.u
    public String[] N() {
        return f68992f;
    }

    public l X() {
        return this.f68993d;
    }

    public String Y() {
        return a(z.f66061c);
    }

    public String Z() {
        return this.f68994e;
    }
}
