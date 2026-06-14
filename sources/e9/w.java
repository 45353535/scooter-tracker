package e9;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class w extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f68995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f68996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f68997f;

    w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, com.taurusx.tax.f.s.f66032y);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.C(name, com.taurusx.tax.f.s.f66022o)) {
                    b0(u.G(xmlPullParser));
                } else if (u.C(name, com.taurusx.tax.f.s.f66026s)) {
                    Z(u.G(xmlPullParser));
                } else if (u.C(name, "CustomClick")) {
                    a0(u.G(xmlPullParser));
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, com.taurusx.tax.f.s.f66032y);
    }

    private void Z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f68996e == null) {
            this.f68996e = new ArrayList();
        }
        this.f68996e.add(str);
    }

    private void a0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f68997f == null) {
            this.f68997f = new ArrayList();
        }
        this.f68997f.add(str);
    }

    private void b0(String str) {
        this.f68995d = str;
    }

    public String X() {
        return this.f68995d;
    }

    public List Y() {
        return this.f68996e;
    }
}
