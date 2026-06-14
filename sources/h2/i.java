package h2;

import com.taurusx.tax.f.y;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class i extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f72910e = {"id", "adID"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f72911d;

    i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        h mVar;
        super(xmlPullParser);
        xmlPullParser.require(2, null, y.f66055s);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (t.D(name, y.f66052c)) {
                    mVar = new m(xmlPullParser);
                } else if (t.D(name, y.f66051a)) {
                    mVar = new f(xmlPullParser);
                } else {
                    t.I(xmlPullParser);
                }
                this.f72911d = mVar;
            }
        }
        xmlPullParser.require(3, null, y.f66055s);
    }

    @Override // h2.t
    public String[] O() {
        return f72910e;
    }

    public h Y() {
        return this.f72911d;
    }
}
