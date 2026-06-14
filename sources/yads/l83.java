package yads;

import java.net.URI;
import kotlin.Result;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l83 {
    public static String a(String str) {
        Object objB;
        String str2;
        try {
            Result.Companion companion = Result.f93230c;
            boolean zG0 = StringsKt.g0(str, "://", false, 2, null);
            if (!zG0) {
                str = b(str);
            }
            URI uri = new URI(str);
            if (zG0) {
                str2 = uri.getScheme() + "://";
            } else {
                str2 = "";
            }
            objB = Result.b(str2 + uri.getHost());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = "bad_url";
        }
        return (String) objB;
    }

    public static String b(String str) {
        return "stub://" + str;
    }
}
