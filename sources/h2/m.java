package h2;

import com.taurusx.tax.f.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class m extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f72914j = {com.taurusx.tax.f.s.f66023p};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f72915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f72916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v f72917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f72918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EnumMap f72919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f72920i;

    m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f72920i = -1;
        xmlPullParser.require(2, null, y.f66052c);
        int iK = t.K(a(com.taurusx.tax.f.s.f66023p));
        if (iK > -1) {
            Y(iK);
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (t.D(name, "Duration")) {
                    float fK = t.K(t.H(xmlPullParser));
                    if (fK > -1.0f) {
                        i0(Float.valueOf(fK));
                    }
                } else if (t.D(name, com.taurusx.tax.f.s.f66008a)) {
                    b0(c0(xmlPullParser));
                } else if (t.D(name, com.taurusx.tax.f.s.f66032y)) {
                    Z(new v(xmlPullParser));
                } else if (t.D(name, "AdParameters")) {
                    h0(t.H(xmlPullParser));
                } else if (t.D(name, "TrackingEvents")) {
                    a0(new q(xmlPullParser).Y());
                } else {
                    t.I(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66052c);
    }

    private void Y(int i10) {
        this.f72920i = i10;
    }

    private void Z(v vVar) {
        this.f72917f = vVar;
    }

    private void a0(EnumMap enumMap) {
        this.f72919h = enumMap;
    }

    private void b0(List list) {
        this.f72916e = list;
    }

    private static List c0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, com.taurusx.tax.f.s.f66008a);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (t.D(xmlPullParser.getName(), com.taurusx.tax.f.s.f66021n)) {
                    n nVar = new n(xmlPullParser);
                    if (nVar.b0()) {
                        arrayList.add(nVar);
                    } else {
                        f2.c.a("VastXmlTag", "MediaFile: is not valid. Skipping it.", new Object[0]);
                    }
                }
                t.I(xmlPullParser);
            }
        }
        xmlPullParser.require(3, null, com.taurusx.tax.f.s.f66008a);
        return arrayList;
    }

    @Override // h2.t
    public String[] O() {
        return f72914j;
    }

    public Float d0() {
        return this.f72915d;
    }

    public List e0() {
        return this.f72916e;
    }

    public Map f0() {
        return this.f72919h;
    }

    public v g0() {
        return this.f72917f;
    }

    public void h0(String str) {
        this.f72918g = str;
    }

    public void i0(Float f10) {
        this.f72915d = f10;
    }
}
