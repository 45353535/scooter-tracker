package e9;

import android.text.TextUtils;
import com.taurusx.tax.f.y;
import com.taurusx.tax.f.z;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f68924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f68925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f68926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f68927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f68928h;

    a(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    private j b0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        j eVar;
        xmlPullParser.require(2, null, VastExtensionParentXmlManager.f66980w);
        String strA = new j(xmlPullParser).a("type");
        if (u.C(strA, "appodeal")) {
            eVar = new e(xmlPullParser);
        } else if (u.C(strA, z.f66069w)) {
            d dVar = null;
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (u.C(xmlPullParser.getName(), z.f66069w)) {
                        dVar = new d(xmlPullParser);
                    } else {
                        u.H(xmlPullParser);
                    }
                }
            }
            eVar = dVar;
        } else {
            u.H(xmlPullParser);
            eVar = null;
        }
        xmlPullParser.require(3, null, VastExtensionParentXmlManager.f66980w);
        return eVar;
    }

    void X(b bVar) {
        this.f68924d = bVar;
    }

    void Y(List list) {
        this.f68925e = list;
    }

    void Z(List list) {
        this.f68926f = list;
    }

    List a0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, y.f66054o);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.C(xmlPullParser.getName(), y.f66055s)) {
                    arrayList.add(new i(xmlPullParser));
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66054o);
        return arrayList;
    }

    List c0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, y.f66056t);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.C(xmlPullParser.getName(), VastExtensionParentXmlManager.f66980w)) {
                    j jVarB0 = b0(xmlPullParser);
                    if (jVarB0 != null) {
                        arrayList.add(jVarB0);
                    }
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66056t);
        return arrayList;
    }

    public List d0() {
        return this.f68925e;
    }

    public List e0() {
        return this.f68928h;
    }

    public List f0() {
        return this.f68926f;
    }

    public List g0() {
        return this.f68927g;
    }

    void h0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f68928h == null) {
            this.f68928h = new ArrayList();
        }
        this.f68928h.add(str);
    }

    void i0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f68927g == null) {
            this.f68927g = new ArrayList();
        }
        this.f68927g.add(str);
    }
}
