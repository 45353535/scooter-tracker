package e9;

import com.taurusx.tax.f.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class f extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f68952d;

    f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f68952d = new ArrayList();
        xmlPullParser.require(2, null, y.f66051a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.C(xmlPullParser.getName(), y.f66058y)) {
                    g gVar = new g(xmlPullParser);
                    if (gVar.g0()) {
                        this.f68952d.add(gVar);
                    } else {
                        c9.e.a("VastXmlTag", "Creative Companion: is not valid. Skipping it.", new Object[0]);
                    }
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66051a);
    }

    public List X() {
        return this.f68952d;
    }
}
