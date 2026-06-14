package h2;

import com.taurusx.tax.f.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class f extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f72901d;

    f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f72901d = new ArrayList();
        xmlPullParser.require(2, null, y.f66051a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (t.D(xmlPullParser.getName(), y.f66058y)) {
                    g gVar = new g(xmlPullParser);
                    if (gVar.h0()) {
                        this.f72901d.add(gVar);
                    } else {
                        f2.c.a("VastXmlTag", "Creative Companion: is not valid. Skipping it.", new Object[0]);
                    }
                } else {
                    t.I(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66051a);
    }

    public List Y() {
        return this.f72901d;
    }
}
