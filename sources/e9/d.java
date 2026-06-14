package e9;

import com.taurusx.tax.f.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class d extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f68932e;

    d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f68932e = new ArrayList();
        xmlPullParser.require(2, null, z.f66069w);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.C(xmlPullParser.getName(), z.f66070y)) {
                    this.f68932e.add(new v(xmlPullParser));
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, z.f66069w);
    }

    public List X() {
        return this.f68932e;
    }
}
