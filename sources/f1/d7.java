package f1;

import androidx.collection.SieveCacheKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d7 f69595a = new d7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f69596b = new byte[0];

    public final int a(InputStream input, OutputStream output) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        long jE = e(input, output);
        if (jE > SieveCacheKt.NodeLinkMask) {
            return -1;
        }
        return (int) jE;
    }

    public final long b(InputStream input, OutputStream output, int i10) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        return c(input, output, new byte[i10]);
    }

    public final long c(InputStream input, OutputStream output, byte[] buffer) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        long j10 = 0;
        while (true) {
            int i10 = input.read(buffer);
            if (i10 == -1) {
                return j10;
            }
            output.write(buffer, 0, i10);
            j10 += (long) i10;
        }
    }

    public final byte[] d(InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f69595a.a(input, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            uf.c.a(byteArrayOutputStream, null);
            return byteArray;
        } finally {
        }
    }

    public final long e(InputStream input, OutputStream output) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        return b(input, output, 8192);
    }
}
