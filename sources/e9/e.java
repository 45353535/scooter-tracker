package e9;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity;
import com.taurusx.tax.f.y;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class e extends j implements c9.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b9.k f68933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b9.k f68934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b9.k f68935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b9.k f68936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b9.k f68937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b9.k f68938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b9.k f68939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b9.k f68940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o f68941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f68942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f68943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private g f68944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Boolean f68945q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Float f68946r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f68947s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f68948t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f68949u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f68950v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f68951w;

    e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f68933e = new b9.k();
        this.f68934f = new b9.k();
        this.f68935g = new b9.k();
        this.f68936h = new b9.k();
        this.f68937i = new b9.k();
        this.f68938j = new b9.k();
        this.f68939k = new b9.k();
        this.f68940l = new b9.k();
        this.f68941m = new o();
        this.f68947s = false;
        this.f68948t = false;
        this.f68949u = false;
        this.f68950v = false;
        xmlPullParser.require(2, null, VastExtensionParentXmlManager.f66980w);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.C(name, "Video")) {
                    u.B(xmlPullParser, this.f68933e);
                } else if (u.C(name, "LoadingView")) {
                    u.B(xmlPullParser, this.f68939k);
                } else if (u.C(name, "Countdown")) {
                    u.B(xmlPullParser, this.f68940l);
                } else if (u.C(name, "Progress")) {
                    u.B(xmlPullParser, this.f68937i);
                } else if (u.C(name, "ClosableView")) {
                    u.B(xmlPullParser, this.f68936h);
                } else if (u.C(name, "Mute")) {
                    u.B(xmlPullParser, this.f68935g);
                } else if (u.C(name, NativeAdContent.ViewTag.CTA)) {
                    u.B(xmlPullParser, this.f68934f);
                } else if (u.C(name, "RepeatView")) {
                    u.B(xmlPullParser, this.f68938j);
                } else if (u.C(name, "Postbanner")) {
                    this.f68941m.V(xmlPullParser);
                } else if (u.C(name, "Autorotate")) {
                    this.f68945q = Boolean.valueOf(u.E(xmlPullParser));
                } else if (u.C(name, "R1")) {
                    this.f68949u = u.E(xmlPullParser);
                } else if (u.C(name, "R2")) {
                    this.f68950v = u.E(xmlPullParser);
                } else if (u.C(name, POBVideoPlayerActivity.FORCE_ORIENTATION_KEY)) {
                    this.f68951w = u.L(u.G(xmlPullParser));
                } else if (u.C(name, "CtaText")) {
                    this.f68934f.M(u.G(xmlPullParser));
                } else if (u.C(name, "ShowCta")) {
                    this.f68934f.e0(Boolean.valueOf(u.E(xmlPullParser)));
                } else if (u.C(name, "ShowMute")) {
                    this.f68935g.e0(Boolean.valueOf(u.E(xmlPullParser)));
                } else if (u.C(name, "ShowCompanion")) {
                    this.f68941m.d0(u.E(xmlPullParser));
                } else if (u.C(name, "CompanionCloseTime")) {
                    int iK = u.K(u.G(xmlPullParser));
                    if (iK > -1) {
                        this.f68941m.c0(iK);
                    }
                } else if (u.C(name, "Muted")) {
                    this.f68947s = u.E(xmlPullParser);
                } else if (u.C(name, "VideoClickable")) {
                    this.f68948t = u.E(xmlPullParser);
                } else if (u.C(name, "CtaXPosition")) {
                    this.f68934f.T(u.P(u.G(xmlPullParser)));
                } else if (u.C(name, "CtaYPosition")) {
                    this.f68934f.d0(u.Q(u.G(xmlPullParser)));
                } else if (u.C(name, "CloseXPosition")) {
                    this.f68936h.T(u.P(u.G(xmlPullParser)));
                } else if (u.C(name, "CloseYPosition")) {
                    this.f68936h.d0(u.Q(u.G(xmlPullParser)));
                } else if (u.C(name, "MuteXPosition")) {
                    this.f68935g.T(u.P(u.G(xmlPullParser)));
                } else if (u.C(name, "MuteYPosition")) {
                    this.f68935g.d0(u.Q(u.G(xmlPullParser)));
                } else if (u.C(name, "AssetsColor")) {
                    Integer numF = u.F(u.G(xmlPullParser));
                    if (numF != null) {
                        this.f68942n = numF;
                    }
                } else if (u.C(name, "AssetsBackgroundColor")) {
                    Integer numF2 = u.F(u.G(xmlPullParser));
                    if (numF2 != null) {
                        this.f68943o = numF2;
                    }
                } else if (u.C(name, y.f66058y)) {
                    g gVar = new g(xmlPullParser);
                    if (gVar.g0() && gVar.f0()) {
                        this.f68944p = gVar;
                    }
                } else if (u.C(name, "CloseTime")) {
                    String strG = u.G(xmlPullParser);
                    if (strG != null) {
                        this.f68946r = Float.valueOf(Float.parseFloat(strG));
                    }
                } else if (u.C(name, "ShowProgress")) {
                    this.f68937i.e0(Boolean.valueOf(u.E(xmlPullParser)));
                } else {
                    u.H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastExtensionParentXmlManager.f66980w);
    }

    public g X() {
        return this.f68944p;
    }

    public boolean Y() {
        return this.f68947s;
    }

    @Override // c9.c
    public b9.k d() {
        return this.f68936h;
    }

    @Override // c9.c
    public Integer g() {
        return this.f68943o;
    }

    @Override // c9.c
    public b9.k h() {
        return this.f68938j;
    }

    @Override // c9.c
    public o i() {
        return this.f68941m;
    }

    @Override // c9.c
    public boolean j() {
        return this.f68948t;
    }

    @Override // c9.c
    public Integer k() {
        return this.f68951w;
    }

    @Override // c9.c
    public Float l() {
        return this.f68946r;
    }

    @Override // c9.c
    public b9.k m() {
        return this.f68937i;
    }

    @Override // c9.c
    public b9.k n() {
        return this.f68935g;
    }

    @Override // c9.c
    public boolean o() {
        return this.f68950v;
    }

    @Override // c9.c
    public b9.k q() {
        return this.f68933e;
    }

    @Override // c9.c
    public boolean r() {
        return this.f68949u;
    }

    @Override // c9.c
    public Integer s() {
        return this.f68942n;
    }

    @Override // c9.c
    public b9.k t() {
        return this.f68934f;
    }

    @Override // c9.c
    public Boolean u() {
        return this.f68945q;
    }

    @Override // c9.c
    public b9.k v() {
        return this.f68940l;
    }

    @Override // c9.c
    public b9.k x() {
        return this.f68939k;
    }
}
