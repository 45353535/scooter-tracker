package yads;

import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class zm {
    public static String a(String str) {
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            String str2 = new String(bytes, Charsets.UTF_8);
            boolean z10 = lb1.f113032a;
            return str2;
        }
    }

    public static String b(String str) {
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }
}
