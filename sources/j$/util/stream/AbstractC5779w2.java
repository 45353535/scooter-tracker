package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5779w2 {
    public static long c(long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        if (j12 >= 0) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static long a(long j10, long j11, long j12) {
        if (j10 >= 0) {
            return Math.max(-1L, Math.min(j10 - j11, j12));
        }
        return -1L;
    }

    public static Spliterator b(EnumC5676b3 enumC5676b3, Spliterator spliterator, long j10, long j11) {
        long jC = c(j10, j11);
        int i10 = AbstractC5769u2.f85371a[enumC5676b3.ordinal()];
        if (i10 == 1) {
            return new C5770u3(spliterator, j10, jC);
        }
        if (i10 == 2) {
            return new C5755r3((Spliterator.OfInt) spliterator, j10, jC);
        }
        if (i10 == 3) {
            return new C5760s3((j$.util.Y) spliterator, j10, jC);
        }
        if (i10 != 4) {
            throw new IllegalStateException("Unknown shape " + enumC5676b3);
        }
        return new C5751q3((j$.util.T) spliterator, j10, jC);
    }

    public static C5735n2 h(AbstractC5685d2 abstractC5685d2, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new C5735n2(abstractC5685d2, d(j11), j10, j11);
    }

    public static C5745p2 f(AbstractC5668a0 abstractC5668a0, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new C5745p2(abstractC5668a0, d(j11), j10, j11);
    }

    public static C5754r2 g(AbstractC5708i0 abstractC5708i0, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new C5754r2(abstractC5708i0, d(j11), j10, j11);
    }

    public static C5764t2 e(AbstractC5786y abstractC5786y, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new C5764t2(abstractC5786y, d(j11), j10, j11);
    }

    public static int d(long j10) {
        return (j10 != -1 ? EnumC5671a3.f85211u : 0) | EnumC5671a3.f85210t;
    }
}
