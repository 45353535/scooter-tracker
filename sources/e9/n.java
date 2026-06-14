package e9;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes12.dex */
public class n extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f68972d = {"delivery", "type", "width", "height", "codec", "id", com.taurusx.tax.f.a.f65992s, com.taurusx.tax.f.a.f65988a, com.taurusx.tax.f.a.f65990n, "scalable", "maintainAspectRatio", "apiFramework"};

    n(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // e9.u
    public String[] N() {
        return f68972d;
    }

    @Override // e9.u
    public boolean S() {
        return true;
    }

    public int X() {
        return D("height");
    }

    public String Y() {
        return a("type");
    }

    public int Z() {
        return D("width");
    }

    public boolean a0() {
        return (TextUtils.isEmpty(a("type")) || TextUtils.isEmpty(a("width")) || TextUtils.isEmpty(a("height")) || TextUtils.isEmpty(O())) ? false : true;
    }
}
