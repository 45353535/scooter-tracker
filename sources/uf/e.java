package uf;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class e extends ByteArrayOutputStream {
    public e(int i10) {
        super(i10);
    }

    public final byte[] m() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
