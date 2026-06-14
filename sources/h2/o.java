package h2;

import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class o extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f72922p = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f72927h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e2.e f72923d = new e2.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e2.e f72924e = new e2.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e2.e f72925f = new e2.e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e2.e f72926g = new e2.e();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f72928i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f72929j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f72930k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f72931l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f72932m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f72933n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f72934o = false;

    @Override // h2.t
    protected void A(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        e2.e eVar;
        xmlPullParser.require(2, null, "Postbanner");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                try {
                    String name = xmlPullParser.getName();
                    if (t.D(name, "CloseTime")) {
                        String strH = t.H(xmlPullParser);
                        if (TextUtils.isEmpty(strH)) {
                            continue;
                        } else {
                            if (!f72922p && strH == null) {
                                throw new AssertionError();
                            }
                            this.f72928i = Float.parseFloat(strH);
                        }
                    } else if (t.D(name, "Duration")) {
                        String strH2 = t.H(xmlPullParser);
                        if (TextUtils.isEmpty(strH2)) {
                            continue;
                        } else {
                            if (!f72922p && strH2 == null) {
                                throw new AssertionError();
                            }
                            this.f72929j = Float.parseFloat(strH2);
                        }
                    } else {
                        if (t.D(name, "ClosableView")) {
                            eVar = this.f72923d;
                        } else if (t.D(name, "Countdown")) {
                            eVar = this.f72924e;
                        } else if (t.D(name, "LoadingView")) {
                            eVar = this.f72925f;
                        } else if (t.D(name, "Progress")) {
                            eVar = this.f72926g;
                        } else if (t.D(name, "UseNativeClose")) {
                            this.f72932m = t.F(xmlPullParser);
                        } else if (t.D(name, "IgnoresSafeAreaLayoutGuide")) {
                            this.f72931l = t.F(xmlPullParser);
                        } else if (t.D(name, "ProductLink")) {
                            this.f72927h = t.H(xmlPullParser);
                        } else if (t.D(name, "R1")) {
                            this.f72933n = t.F(xmlPullParser);
                        } else if (t.D(name, "R2")) {
                            this.f72934o = t.F(xmlPullParser);
                        } else {
                            t.I(xmlPullParser);
                        }
                        t.B(xmlPullParser, eVar);
                    }
                } catch (Throwable th2) {
                    f2.c.b("VastXmlTag", th2);
                }
            }
        }
        xmlPullParser.require(3, null, "Postbanner");
    }

    public float Y() {
        return this.f72928i;
    }

    public float Z() {
        return this.f72929j;
    }

    public String a0() {
        return this.f72927h;
    }

    public boolean b0() {
        return this.f72932m;
    }

    public boolean c0() {
        return this.f72930k;
    }

    public e2.e d() {
        return this.f72923d;
    }

    public void d0(int i10) {
        this.f72928i = i10;
    }

    public void e0(boolean z10) {
        this.f72930k = z10;
    }

    public e2.e m() {
        return this.f72926g;
    }

    public boolean o() {
        return this.f72934o;
    }

    public boolean r() {
        return this.f72933n;
    }

    public e2.e v() {
        return this.f72924e;
    }

    public e2.e x() {
        return this.f72925f;
    }
}
