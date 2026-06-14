package yads;

import java.net.URI;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
public final class p83 {
    public static boolean a(String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            new URI(str);
            objB = Result.b(Boolean.valueOf((str == null || str.length() == 0) ? false : true));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.i(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }
}
