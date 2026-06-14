package yads;

import android.util.Base64;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class bn {
    public static String a(String str) {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return a(bytes);
    }

    public static String a(byte[] bArr) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(Base64.encodeToString(bArr, 2));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            boolean z10 = lb1.f113032a;
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (String) objB;
    }
}
