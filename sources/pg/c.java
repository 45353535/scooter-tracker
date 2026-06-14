package pg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final long a(a aVar, byte b10, long j10, long j11) {
        long j12;
        long j13;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        long jMin = Math.min(j11, aVar.s());
        v.a(aVar.s(), j10, jMin);
        if (j10 == jMin || aVar.q() == null) {
            return -1L;
        }
        if (aVar.s() - j10 < j10) {
            m mVarY = aVar.y();
            j12 = aVar.s();
            while (mVarY != null && j12 > j10) {
                j12 -= (long) (mVarY.d() - mVarY.f());
                if (j12 <= j10) {
                    break;
                }
                mVarY = mVarY.g();
            }
            if (j12 == -1) {
                return -1L;
            }
            while (jMin > j12) {
                Intrinsics.checkNotNull(mVarY);
                int iA = o.a(mVarY, b10, Math.max((int) (j10 - j12), 0), Math.min(mVarY.j(), (int) (jMin - j12)));
                if (iA != -1) {
                    j13 = iA;
                } else {
                    j12 += (long) mVarY.j();
                    mVarY = mVarY.e();
                    if (mVarY == null || j12 >= jMin) {
                        return -1L;
                    }
                }
            }
            throw new IllegalStateException("Check failed.");
        }
        m mVarQ = aVar.q();
        j12 = 0;
        while (mVarQ != null) {
            long jD = ((long) (mVarQ.d() - mVarQ.f())) + j12;
            if (jD > j10) {
                break;
            }
            mVarQ = mVarQ.e();
            j12 = jD;
        }
        if (j12 == -1) {
            return -1L;
        }
        while (jMin > j12) {
            Intrinsics.checkNotNull(mVarQ);
            int iA2 = o.a(mVarQ, b10, Math.max((int) (j10 - j12), 0), Math.min(mVarQ.j(), (int) (jMin - j12)));
            if (iA2 != -1) {
                j13 = iA2;
            } else {
                j12 += (long) mVarQ.j();
                mVarQ = mVarQ.e();
                if (mVarQ == null || j12 >= jMin) {
                    return -1L;
                }
            }
        }
        throw new IllegalStateException("Check failed.");
        return j12 + j13;
    }
}
