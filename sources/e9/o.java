package e9;

import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class o extends u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f68977h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b9.k f68973d = new b9.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b9.k f68974e = new b9.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b9.k f68975f = new b9.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b9.k f68976g = new b9.k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f68978i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f68979j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f68980k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f68981l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f68982m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f68983n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f68984o = false;

    @Override // e9.u
    protected void A(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "Postbanner");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                try {
                    String name = xmlPullParser.getName();
                    if (u.C(name, "CloseTime")) {
                        String strG = u.G(xmlPullParser);
                        if (!TextUtils.isEmpty(strG)) {
                            this.f68978i = Float.parseFloat(strG);
                        }
                    } else if (u.C(name, "Duration")) {
                        String strG2 = u.G(xmlPullParser);
                        if (!TextUtils.isEmpty(strG2)) {
                            this.f68979j = Float.parseFloat(strG2);
                        }
                    } else if (u.C(name, "ClosableView")) {
                        u.B(xmlPullParser, this.f68973d);
                    } else if (u.C(name, "Countdown")) {
                        u.B(xmlPullParser, this.f68974e);
                    } else if (u.C(name, "LoadingView")) {
                        u.B(xmlPullParser, this.f68975f);
                    } else if (u.C(name, "Progress")) {
                        u.B(xmlPullParser, this.f68976g);
                    } else if (u.C(name, "UseNativeClose")) {
                        this.f68982m = u.E(xmlPullParser);
                    } else if (u.C(name, "IgnoresSafeAreaLayoutGuide")) {
                        this.f68981l = u.E(xmlPullParser);
                    } else if (u.C(name, "ProductLink")) {
                        this.f68977h = u.G(xmlPullParser);
                    } else if (u.C(name, "R1")) {
                        this.f68983n = u.E(xmlPullParser);
                    } else if (u.C(name, "R2")) {
                        this.f68984o = u.E(xmlPullParser);
                    } else {
                        u.H(xmlPullParser);
                    }
                } catch (Throwable th2) {
                    c9.e.c("VastXmlTag", th2);
                }
            }
        }
        xmlPullParser.require(3, null, "Postbanner");
    }

    public float X() {
        return this.f68978i;
    }

    public float Y() {
        return this.f68979j;
    }

    public String Z() {
        return this.f68977h;
    }

    public boolean a0() {
        return this.f68982m;
    }

    public boolean b0() {
        return this.f68980k;
    }

    public void c0(int i10) {
        this.f68978i = i10;
    }

    public b9.k d() {
        return this.f68973d;
    }

    public void d0(boolean z10) {
        this.f68980k = z10;
    }

    public b9.k m() {
        return this.f68976g;
    }

    public boolean o() {
        return this.f68984o;
    }

    public boolean r() {
        return this.f68983n;
    }

    public b9.k v() {
        return this.f68974e;
    }

    public b9.k x() {
        return this.f68975f;
    }
}
