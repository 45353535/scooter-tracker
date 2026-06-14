package h2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class s extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f72938e = {"version"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f72939d;

    s(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f72939d = new ArrayList();
        xmlPullParser.require(2, null, "VAST");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (t.D(xmlPullParser.getName(), com.taurusx.tax.f.t.f66040o)) {
                    this.f72939d.add(new c(xmlPullParser));
                } else {
                    t.I(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "VAST");
    }

    @Override // h2.t
    public String[] O() {
        return f72938e;
    }

    public List Y() {
        return this.f72939d;
    }

    public boolean Z() {
        List list = this.f72939d;
        return list != null && list.size() > 0;
    }
}
