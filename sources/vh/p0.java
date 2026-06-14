package vh;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes12.dex */
public abstract class p0 {
    public static final byte[] a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }
}
