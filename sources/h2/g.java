package h2;

import android.text.TextUtils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.taurusx.tax.vast.VastResourceXmlManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class g extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f72902k = {"width", "height", "id", "assetWidth", "assetHeight", "expandedWidth", "expandedHeight", "apiFramework", com.taurusx.tax.f.c.f65999g, POBCoreNativeConstants.NATIVE_REQUIRED_FIELD};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f72903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f72904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f72905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f72906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f72907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f72908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f72909j;

    g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, y.f66058y);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (t.D(name, VastResourceXmlManager.STATIC_RESOURCE)) {
                    p pVar = new p(xmlPullParser);
                    if (pVar.Y()) {
                        Y(pVar);
                    }
                } else if (t.D(name, VastResourceXmlManager.IFRAME_RESOURCE)) {
                    k0(t.H(xmlPullParser));
                } else if (t.D(name, VastResourceXmlManager.HTML_RESOURCE)) {
                    m0(t.H(xmlPullParser));
                } else if (t.D(name, com.taurusx.tax.f.c.f66001o)) {
                    j0(t.H(xmlPullParser));
                } else if (t.D(name, com.taurusx.tax.f.c.f66002s)) {
                    i0(t.H(xmlPullParser));
                } else if (t.D(name, "TrackingEvents")) {
                    Z(new q(xmlPullParser).Y());
                } else if (t.D(name, "AdParameters")) {
                    l0(t.H(xmlPullParser));
                } else {
                    t.I(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66058y);
    }

    private void Y(p pVar) {
        this.f72903d = pVar;
    }

    private void Z(Map map) {
        this.f72908i = map;
    }

    private void i0(String str) {
        if (this.f72907h == null) {
            this.f72907h = new ArrayList();
        }
        this.f72907h.add(str);
    }

    private void j0(String str) {
        this.f72906g = str;
    }

    private void k0(String str) {
        this.f72904e = str;
    }

    @Override // h2.t
    public String[] O() {
        return f72902k;
    }

    public List a0() {
        return this.f72907h;
    }

    public int b0() {
        return E("height");
    }

    public String c0() {
        String strD0 = d0();
        if (strD0 != null) {
            return com.explorestack.iab.mraid.p.r(strD0);
        }
        return null;
    }

    public String d0() {
        String str = this.f72905f;
        if (str != null) {
            return str;
        }
        p pVar = this.f72903d;
        if (pVar != null) {
            return String.format("<script type='text/javascript'>document.write('<a style=\"display: flex; width: 100%%; height: 100%%; justify-content: center; align-items: center\" href=\"%s\" target=\"_blank\"><img style=\"border-style: none; height: 100%%; width: 100%%; object-fit: contain;\" src=\"%s\"/></a>');</script>", this.f72906g, pVar.P());
        }
        if (this.f72904e != null) {
            return String.format("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"%s\" height=\"%s\" src=\"%s\"></iframe>", Integer.valueOf(f0()), Integer.valueOf(b0()), this.f72904e);
        }
        return null;
    }

    public Map e0() {
        return this.f72908i;
    }

    public int f0() {
        return E("width");
    }

    public boolean g0() {
        return (this.f72905f == null && this.f72903d == null && this.f72904e == null) ? false : true;
    }

    public boolean h0() {
        return (TextUtils.isEmpty(a("width")) || TextUtils.isEmpty(a("height"))) ? false : true;
    }

    public void l0(String str) {
        this.f72909j = str;
    }

    public void m0(String str) {
        this.f72905f = str;
    }
}
