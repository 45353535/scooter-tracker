package h2;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class c extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f72879e = {"id"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f72880d;

    c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        a kVar;
        super(xmlPullParser);
        xmlPullParser.require(2, null, com.taurusx.tax.f.t.f66040o);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (t.D(name, com.taurusx.tax.f.w.f66048w)) {
                    kVar = new k(xmlPullParser);
                } else if (t.D(name, com.taurusx.tax.f.w.f66049y)) {
                    kVar = new w(xmlPullParser);
                } else {
                    t.I(xmlPullParser);
                }
                this.f72880d = kVar;
            }
        }
        xmlPullParser.require(3, null, com.taurusx.tax.f.t.f66040o);
    }

    @Override // h2.t
    public String[] O() {
        return f72879e;
    }

    public a Y() {
        return this.f72880d;
    }
}
