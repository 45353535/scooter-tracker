package pg;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final void a(a aVar, OutputStream out, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        v.b(aVar.s(), 0L, j10);
        while (j10 > 0) {
            tg.d dVar = tg.d.f105172a;
            if (aVar.exhausted()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            m mVarQ = aVar.q();
            Intrinsics.checkNotNull(mVarQ);
            byte[] bArrB = mVarQ.b(true);
            int iF = mVarQ.f();
            int iMin = (int) Math.min(j10, mVarQ.d() - iF);
            out.write(bArrB, iF, iMin);
            long j11 = iMin;
            j10 -= j11;
            if (iMin != 0) {
                if (iMin < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (iMin > mVarQ.j()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                aVar.skip(j11);
            }
        }
    }

    public static /* synthetic */ void b(a aVar, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = aVar.s();
        }
        a(aVar, outputStream, j10);
    }
}
