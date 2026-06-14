package kotlin.random;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final d a(long j10) {
        return new f((int) j10, (int) (j10 >> 32));
    }

    public static final String b(Object from, Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void c(int i10, int i11) {
        if (i11 <= i10) {
            throw new IllegalArgumentException(b(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void d(long j10, long j11) {
        if (j11 <= j10) {
            throw new IllegalArgumentException(b(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int e(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int f(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
