package e9;

import com.taurusx.tax.f.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class m extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f68965j = {com.taurusx.tax.f.s.f66023p};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f68966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f68967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w f68968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f68969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EnumMap f68970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f68971i;

    m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f68971i = -1;
        xmlPullParser.require(2, null, y.f66052c);
        int iJ = u.J(a(com.taurusx.tax.f.s.f66023p));
        if (iJ > -1) {
            X(iJ);
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.C(name, "Duration")) {
                    float fJ = u.J(u.G(xmlPullParser));
                    if (fJ > -1.0f) {
                        h0(Float.valueOf(fJ));
                    }
                } else if (u.C(name, com.taurusx.tax.f.s.f66008a)) {
                    a0(b0(xmlPullParser));
                } else if (u.C(name, com.taurusx.tax.f.s.f66032y)) {
                    Y(new w(xmlPullParser));
                } else if (u.C(name, "AdParameters")) {
                    g0(u.G(xmlPullParser));
                } else if (u.C(name, "TrackingEvents")) {
                    Z(new q(xmlPullParser).X());
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66052c);
    }

    private void X(int i10) {
        this.f68971i = i10;
    }

    private void Y(w wVar) {
        this.f68968f = wVar;
    }

    private void Z(EnumMap enumMap) {
        this.f68970h = enumMap;
    }

    private void a0(List list) {
        this.f68967e = list;
    }

    private static List b0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, com.taurusx.tax.f.s.f66008a);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.C(xmlPullParser.getName(), com.taurusx.tax.f.s.f66021n)) {
                    n nVar = new n(xmlPullParser);
                    if (nVar.a0()) {
                        arrayList.add(nVar);
                    } else {
                        c9.e.a("VastXmlTag", "MediaFile: is not valid. Skipping it.", new Object[0]);
                        u.H(xmlPullParser);
                    }
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, com.taurusx.tax.f.s.f66008a);
        return arrayList;
    }

    @Override // e9.u
    public String[] N() {
        return f68965j;
    }

    public Float c0() {
        return this.f68966d;
    }

    public List d0() {
        return this.f68967e;
    }

    public Map e0() {
        return this.f68970h;
    }

    public w f0() {
        return this.f68968f;
    }

    public void g0(String str) {
        this.f68969g = str;
    }

    public void h0(Float f10) {
        this.f68966d = f10;
    }
}
