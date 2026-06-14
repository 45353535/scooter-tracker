package e9;

import com.taurusx.tax.f.y;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class i extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f68961e = {"id", "adID"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f68962d;

    i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, y.f66055s);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.C(name, y.f66052c)) {
                    this.f68962d = new m(xmlPullParser);
                } else if (u.C(name, y.f66051a)) {
                    this.f68962d = new f(xmlPullParser);
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66055s);
    }

    @Override // e9.u
    public String[] N() {
        return f68961e;
    }

    public h X() {
        return this.f68962d;
    }
}
