package h2;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes5.dex */
public class p extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f72935d = {"creativeType"};

    p(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // h2.t
    public String[] O() {
        return f72935d;
    }

    @Override // h2.t
    public boolean T() {
        return true;
    }

    public boolean Y() {
        String strA = a("creativeType");
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        return strA.matches("image/.*(?i)(gif|jpeg|jpg|bmp|png)");
    }
}
