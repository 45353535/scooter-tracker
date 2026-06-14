package pg;

import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    public static final long a(s sVar, byte b10, long j10, long j11) {
        String str;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if (0 <= j10 && j10 <= j11) {
            if (j10 == j11) {
                return -1L;
            }
            long jS = j10;
            while (jS < j11 && sVar.request(1 + jS)) {
                byte b11 = b10;
                long jA = c.a(sVar.getBuffer(), b11, jS, Math.min(j11, sVar.getBuffer().s()));
                if (jA != -1) {
                    return jA;
                }
                jS = sVar.getBuffer().s();
                b10 = b11;
            }
            return -1L;
        }
        if (j11 < 0) {
            str = "startIndex (" + j10 + ") and endIndex (" + j11 + ") should be non negative";
        } else {
            str = "startIndex (" + j10 + ") is not within the range [0..endIndex(" + j11 + "))";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static /* synthetic */ long b(s sVar, byte b10, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return a(sVar, b10, j12, j11);
    }

    public static final byte[] c(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return e(sVar, -1);
    }

    public static final byte[] d(s sVar, int i10) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        long j10 = i10;
        if (j10 >= 0) {
            return e(sVar, i10);
        }
        throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
    }

    private static final byte[] e(s sVar, int i10) throws EOFException {
        if (i10 == -1) {
            for (long j10 = 2147483647L; sVar.getBuffer().s() < SieveCacheKt.NodeLinkMask && sVar.request(j10); j10 *= (long) 2) {
            }
            if (sVar.getBuffer().s() >= SieveCacheKt.NodeLinkMask) {
                throw new IllegalStateException(("Can't create an array of size " + sVar.getBuffer().s()).toString());
            }
            i10 = (int) sVar.getBuffer().s();
        } else {
            sVar.require(i10);
        }
        byte[] bArr = new byte[i10];
        g(sVar.getBuffer(), bArr, 0, 0, 6, null);
        return bArr;
    }

    public static final void f(s sVar, byte[] sink, int i10, int i11) throws EOFException {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        v.a(sink.length, i10, i11);
        int i12 = i10;
        while (i12 < i11) {
            int iJ0 = sVar.j0(sink, i12, i11);
            if (iJ0 == -1) {
                throw new EOFException("Source exhausted before reading " + (i11 - i10) + " bytes. Only " + iJ0 + " bytes were read.");
            }
            i12 += iJ0;
        }
    }

    public static /* synthetic */ void g(s sVar, byte[] bArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        f(sVar, bArr, i10, i11);
    }
}
