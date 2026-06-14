package h2;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes5.dex */
public class n extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f72921d = {"delivery", "type", "width", "height", "codec", "id", com.taurusx.tax.f.a.f65992s, com.taurusx.tax.f.a.f65988a, com.taurusx.tax.f.a.f65990n, "scalable", "maintainAspectRatio", "apiFramework"};

    n(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // h2.t
    public String[] O() {
        return f72921d;
    }

    @Override // h2.t
    public boolean T() {
        return true;
    }

    public int Y() {
        return E("height");
    }

    public String Z() {
        return a("type");
    }

    public int a0() {
        return E("width");
    }

    public boolean b0() {
        return (TextUtils.isEmpty(a("type")) || TextUtils.isEmpty(a("width")) || TextUtils.isEmpty(a("height")) || TextUtils.isEmpty(P())) ? false : true;
    }
}
