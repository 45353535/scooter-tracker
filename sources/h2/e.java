package h2;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity;
import com.taurusx.tax.f.y;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class e extends j implements f2.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e2.e f72882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e2.e f72883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e2.e f72884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e2.e f72885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e2.e f72886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e2.e f72887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e2.e f72888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e2.e f72889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o f72890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f72891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f72892o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private g f72893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Boolean f72894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Float f72895r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f72896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f72897t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f72898u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f72899v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f72900w;

    e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        e2.e eVar;
        e2.e eVar2;
        e2.e eVar3;
        e2.e eVar4;
        super(xmlPullParser);
        this.f72882e = new e2.e();
        this.f72883f = new e2.e();
        this.f72884g = new e2.e();
        this.f72885h = new e2.e();
        this.f72886i = new e2.e();
        this.f72887j = new e2.e();
        this.f72888k = new e2.e();
        this.f72889l = new e2.e();
        this.f72890m = new o();
        this.f72896s = false;
        this.f72897t = false;
        this.f72898u = false;
        this.f72899v = false;
        xmlPullParser.require(2, null, VastExtensionParentXmlManager.f66980w);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (t.D(name, "Video")) {
                    eVar = this.f72882e;
                } else if (t.D(name, "LoadingView")) {
                    eVar = this.f72888k;
                } else if (t.D(name, "Countdown")) {
                    eVar = this.f72889l;
                } else if (t.D(name, "Progress")) {
                    eVar = this.f72886i;
                } else if (t.D(name, "ClosableView")) {
                    eVar = this.f72885h;
                } else if (t.D(name, "Mute")) {
                    eVar = this.f72884g;
                } else if (t.D(name, NativeAdContent.ViewTag.CTA)) {
                    eVar = this.f72883f;
                } else if (t.D(name, "RepeatView")) {
                    eVar = this.f72887j;
                } else if (t.D(name, "Postbanner")) {
                    this.f72890m.W(xmlPullParser);
                } else if (t.D(name, "Autorotate")) {
                    this.f72894q = Boolean.valueOf(t.F(xmlPullParser));
                } else if (t.D(name, "R1")) {
                    this.f72898u = t.F(xmlPullParser);
                } else if (t.D(name, "R2")) {
                    this.f72899v = t.F(xmlPullParser);
                } else if (t.D(name, POBVideoPlayerActivity.FORCE_ORIENTATION_KEY)) {
                    this.f72900w = t.M(t.H(xmlPullParser));
                } else if (t.D(name, "CtaText")) {
                    this.f72883f.M(t.H(xmlPullParser));
                } else {
                    if (t.D(name, "ShowCta")) {
                        eVar2 = this.f72883f;
                    } else if (t.D(name, "ShowMute")) {
                        eVar2 = this.f72884g;
                    } else if (t.D(name, "ShowCompanion")) {
                        this.f72890m.e0(t.F(xmlPullParser));
                    } else if (t.D(name, "CompanionCloseTime")) {
                        int iL = t.L(t.H(xmlPullParser));
                        if (iL > -1) {
                            this.f72890m.d0(iL);
                        }
                    } else if (t.D(name, "Muted")) {
                        this.f72896s = t.F(xmlPullParser);
                    } else if (t.D(name, "VideoClickable")) {
                        this.f72897t = t.F(xmlPullParser);
                    } else {
                        if (t.D(name, "CtaXPosition")) {
                            eVar3 = this.f72883f;
                        } else {
                            if (t.D(name, "CtaYPosition")) {
                                eVar4 = this.f72883f;
                            } else if (t.D(name, "CloseXPosition")) {
                                eVar3 = this.f72885h;
                            } else if (t.D(name, "CloseYPosition")) {
                                eVar4 = this.f72885h;
                            } else if (t.D(name, "MuteXPosition")) {
                                eVar3 = this.f72884g;
                            } else if (t.D(name, "MuteYPosition")) {
                                eVar4 = this.f72884g;
                            } else if (t.D(name, "AssetsColor")) {
                                Integer numG = t.G(t.H(xmlPullParser));
                                if (numG != null) {
                                    this.f72891n = numG;
                                }
                            } else if (t.D(name, "AssetsBackgroundColor")) {
                                Integer numG2 = t.G(t.H(xmlPullParser));
                                if (numG2 != null) {
                                    this.f72892o = numG2;
                                }
                            } else if (t.D(name, y.f66058y)) {
                                g gVar = new g(xmlPullParser);
                                if (gVar.h0() && gVar.g0()) {
                                    this.f72893p = gVar;
                                }
                            } else if (t.D(name, "CloseTime")) {
                                String strH = t.H(xmlPullParser);
                                if (strH != null) {
                                    this.f72895r = Float.valueOf(Float.parseFloat(strH));
                                }
                            } else if (t.D(name, "ShowProgress")) {
                                eVar2 = this.f72886i;
                            } else {
                                t.I(xmlPullParser);
                            }
                            eVar4.d0(t.S(t.H(xmlPullParser)));
                        }
                        eVar3.T(t.Q(t.H(xmlPullParser)));
                    }
                    eVar2.e0(Boolean.valueOf(t.F(xmlPullParser)));
                }
                t.B(xmlPullParser, eVar);
            }
        }
        xmlPullParser.require(3, null, VastExtensionParentXmlManager.f66980w);
    }

    public g Y() {
        return this.f72893p;
    }

    public boolean Z() {
        return this.f72896s;
    }

    @Override // f2.k
    public e2.e d() {
        return this.f72885h;
    }

    @Override // f2.k
    public Integer g() {
        return this.f72892o;
    }

    @Override // f2.k
    public e2.e h() {
        return this.f72887j;
    }

    @Override // f2.k
    public o i() {
        return this.f72890m;
    }

    @Override // f2.k
    public boolean j() {
        return this.f72897t;
    }

    @Override // f2.k
    public Integer k() {
        return this.f72900w;
    }

    @Override // f2.k
    public Float l() {
        return this.f72895r;
    }

    @Override // f2.k
    public e2.e m() {
        return this.f72886i;
    }

    @Override // f2.k
    public e2.e n() {
        return this.f72884g;
    }

    @Override // f2.k
    public boolean o() {
        return this.f72899v;
    }

    @Override // f2.k
    public e2.e q() {
        return this.f72882e;
    }

    @Override // f2.k
    public boolean r() {
        return this.f72898u;
    }

    @Override // f2.k
    public Integer s() {
        return this.f72891n;
    }

    @Override // f2.k
    public e2.e t() {
        return this.f72883f;
    }

    @Override // f2.k
    public Boolean u() {
        return this.f72894q;
    }

    @Override // f2.k
    public e2.e v() {
        return this.f72889l;
    }

    @Override // f2.k
    public e2.e x() {
        return this.f72888k;
    }
}
