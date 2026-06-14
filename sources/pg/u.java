package pg;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    private static final String a(a aVar, long j10) throws EOFException {
        if (j10 == 0) {
            return "";
        }
        tg.d dVar = tg.d.f105172a;
        m mVarQ = aVar.q();
        if (mVarQ == null) {
            throw new IllegalStateException("Unreacheable");
        }
        tg.b unused = tg.e.f105173a;
        if (mVarQ.j() < j10) {
            return sg.a.b(t.d(aVar, (int) j10), 0, 0, 3, null);
        }
        byte[] bArrB = mVarQ.b(true);
        int iF = mVarQ.f();
        String strA = sg.a.a(bArrB, iF, Math.min(mVarQ.d(), ((int) j10) + iF));
        aVar.skip(j10);
        return strA;
    }

    public static final String b(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return a(aVar, aVar.s());
    }

    public static final String c(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        sVar.request(Long.MAX_VALUE);
        return a(sVar.getBuffer(), sVar.getBuffer().s());
    }

    public static final String d(s sVar, long j10) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        sVar.require(j10);
        return a(sVar.getBuffer(), j10);
    }
}
