package e9;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class c extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f68930e = {"id"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f68931d;

    c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, com.taurusx.tax.f.t.f66040o);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.C(name, com.taurusx.tax.f.w.f66048w)) {
                    this.f68931d = new k(xmlPullParser);
                } else if (u.C(name, com.taurusx.tax.f.w.f66049y)) {
                    this.f68931d = new x(xmlPullParser);
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, com.taurusx.tax.f.t.f66040o);
    }

    @Override // e9.u
    public String[] N() {
        return f68930e;
    }

    public a X() {
        return this.f68931d;
    }
}
