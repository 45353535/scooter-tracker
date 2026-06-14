package e9;

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

/* JADX INFO: loaded from: classes12.dex */
public class g extends u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f68953k = {"width", "height", "id", "assetWidth", "assetHeight", "expandedWidth", "expandedHeight", "apiFramework", com.taurusx.tax.f.c.f65999g, POBCoreNativeConstants.NATIVE_REQUIRED_FIELD};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f68954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f68955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f68956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f68957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f68958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f68959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f68960j;

    g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, y.f66058y);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.C(name, VastResourceXmlManager.STATIC_RESOURCE)) {
                    p pVar = new p(xmlPullParser);
                    if (pVar.X()) {
                        X(pVar);
                    }
                } else if (u.C(name, VastResourceXmlManager.IFRAME_RESOURCE)) {
                    j0(u.G(xmlPullParser));
                } else if (u.C(name, VastResourceXmlManager.HTML_RESOURCE)) {
                    l0(u.G(xmlPullParser));
                } else if (u.C(name, com.taurusx.tax.f.c.f66001o)) {
                    i0(u.G(xmlPullParser));
                } else if (u.C(name, com.taurusx.tax.f.c.f66002s)) {
                    h0(u.G(xmlPullParser));
                } else if (u.C(name, "TrackingEvents")) {
                    Y(new q(xmlPullParser).X());
                } else if (u.C(name, "AdParameters")) {
                    k0(u.G(xmlPullParser));
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, y.f66058y);
    }

    private void X(p pVar) {
        this.f68954d = pVar;
    }

    private void Y(Map map) {
        this.f68959i = map;
    }

    private void h0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f68958h == null) {
            this.f68958h = new ArrayList();
        }
        this.f68958h.add(str);
    }

    private void i0(String str) {
        this.f68957g = str;
    }

    private void j0(String str) {
        this.f68955e = str;
    }

    @Override // e9.u
    public String[] N() {
        return f68953k;
    }

    public List Z() {
        return this.f68958h;
    }

    public int a0() {
        return D("height");
    }

    public String b0() {
        String strC0 = c0();
        if (strC0 != null) {
            return io.bidmachine.iab.mraid.r.r(strC0);
        }
        return null;
    }

    public String c0() {
        String str = this.f68956f;
        if (str != null) {
            return str;
        }
        p pVar = this.f68954d;
        if (pVar != null) {
            return String.format("<script type='text/javascript'>document.write('<a style=\"display: flex; width: 100%%; height: 100%%; justify-content: center; align-items: center\" href=\"%s\" target=\"_blank\"><img style=\"border-style: none; height: 100%%; width: 100%%; object-fit: contain;\" src=\"%s\"/></a>');</script>", this.f68957g, pVar.O());
        }
        if (this.f68955e != null) {
            return String.format("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"%s\" height=\"%s\" src=\"%s\"></iframe>", Integer.valueOf(e0()), Integer.valueOf(a0()), this.f68955e);
        }
        return null;
    }

    public Map d0() {
        return this.f68959i;
    }

    public int e0() {
        return D("width");
    }

    public boolean f0() {
        return (this.f68956f == null && this.f68954d == null && this.f68955e == null) ? false : true;
    }

    public boolean g0() {
        return (TextUtils.isEmpty(a("width")) || TextUtils.isEmpty(a("height"))) ? false : true;
    }

    public void k0(String str) {
        this.f68960j = str;
    }

    public void l0(String str) {
        this.f68956f = str;
    }
}
