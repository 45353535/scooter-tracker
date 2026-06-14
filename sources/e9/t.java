package e9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class t extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f68988e = {"version"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f68989d;

    t(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f68989d = new ArrayList();
        xmlPullParser.require(2, null, "VAST");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.C(xmlPullParser.getName(), com.taurusx.tax.f.t.f66040o)) {
                    this.f68989d.add(new c(xmlPullParser));
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "VAST");
    }

    @Override // e9.u
    public String[] N() {
        return f68988e;
    }

    public List X() {
        return this.f68989d;
    }

    public boolean Y() {
        return !this.f68989d.isEmpty();
    }
}
