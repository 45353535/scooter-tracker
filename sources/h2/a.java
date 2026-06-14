package h2;

import com.taurusx.tax.f.y;
import com.taurusx.tax.f.z;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f72873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f72874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f72875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f72876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f72877h;

    a(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    private j c0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        j eVar;
        xmlPullParser.require(2, null, VastExtensionParentXmlManager.f66980w);
        String strA = new j(xmlPullParser).a("type");
        if (t.D(strA, "appodeal")) {
            eVar = new e(xmlPullParser);
        } else if (t.D(strA, z.f66069w)) {
            d dVar = null;
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (t.D(xmlPullParser.getName(), z.f66069w)) {
                        dVar = new d(xmlPullParser);
                    } else {
                        t.I(xmlPullParser);
                    }
                }
            }
            eVar = dVar;
        } else {
            t.I(xmlPullParser);
            eVar = null;
        }
        xmlPullParser.require(3, null, VastExtensionParentXmlManager.f66980w);
        return eVar;
    }

    void Y(b bVar) {
        this.f72873d = bVar;
    }

    void Z(List list) {
        this.f72874e = list;
    }

    void a0(List list) {
        this.f72875f = list;
    }

    List b0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, y.f66054o);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (t.D(xmlPullParser.getName(), y.f66055s)) {
                    arrayList.add(new i(xmlPullParser));
                } else {
                    t.I(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66054o);
        return arrayList;
    }

    List d0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, y.f66056t);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (t.D(xmlPullParser.getName(), VastExtensionParentXmlManager.f66980w)) {
                    j jVarC0 = c0(xmlPullParser);
                    if (jVarC0 != null) {
                        arrayList.add(jVarC0);
                    }
                } else {
                    t.I(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66056t);
        return arrayList;
    }

    public List e0() {
        return this.f72874e;
    }

    public List f0() {
        return this.f72877h;
    }

    public List g0() {
        return this.f72875f;
    }

    public List h0() {
        return this.f72876g;
    }

    void i0(String str) {
        if (this.f72877h == null) {
            this.f72877h = new ArrayList();
        }
        this.f72877h.add(str);
    }

    void j0(String str) {
        if (this.f72876g == null) {
            this.f72876g = new ArrayList();
        }
        this.f72876g.add(str);
    }
}
