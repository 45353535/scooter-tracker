package e9;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes12.dex */
public class p extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f68985d = {"creativeType"};

    p(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // e9.u
    public String[] N() {
        return f68985d;
    }

    @Override // e9.u
    public boolean S() {
        return true;
    }

    public boolean X() {
        String strA = a("creativeType");
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        return strA.matches("image/.*(?i)(gif|jpeg|jpg|bmp|png)");
    }
}
