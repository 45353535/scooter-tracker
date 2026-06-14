package yads;

import android.net.Uri;
import android.webkit.URLUtil;
import com.amazon.device.ads.DtbConstants;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m83 {
    public static String a(String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(Uri.parse(b(str)).getHost());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (String) objB;
    }

    public static String b(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return str;
        }
        return DtbConstants.HTTPS + str;
    }
}
