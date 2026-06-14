package td;

import java.io.File;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f105146a = new a();

    private a() {
    }

    public static final boolean a(File file) {
        return b.f(file);
    }

    public static final String b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        byte[] bytes = url.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrB = g0.b(bytes);
        if (bArrB == null) {
            return null;
        }
        return new BigInteger(bArrB).abs().toString(36);
    }
}
