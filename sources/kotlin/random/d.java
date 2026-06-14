package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f93341b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f93342c = rf.b.f99465a.b();

    public static final class a extends d implements Serializable {

        /* JADX INFO: renamed from: kotlin.random.d$a$a, reason: collision with other inner class name */
        private static final class C1067a implements Serializable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C1067a f93343b = new C1067a();

            private C1067a() {
            }

            private final Object readResolve() {
                return d.f93341b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return C1067a.f93343b;
        }

        @Override // kotlin.random.d
        public int g(int i10) {
            return d.f93342c.g(i10);
        }

        @Override // kotlin.random.d
        public double h() {
            return d.f93342c.h();
        }

        @Override // kotlin.random.d
        public int i() {
            return d.f93342c.i();
        }

        @Override // kotlin.random.d
        public int j(int i10) {
            return d.f93342c.j(i10);
        }

        @Override // kotlin.random.d
        public int k(int i10, int i11) {
            return d.f93342c.k(i10, i11);
        }

        @Override // kotlin.random.d
        public long l() {
            return d.f93342c.l();
        }

        @Override // kotlin.random.d
        public long m(long j10) {
            return d.f93342c.m(j10);
        }

        @Override // kotlin.random.d
        public long n(long j10, long j11) {
            return d.f93342c.n(j10, j11);
        }

        private a() {
        }
    }

    public abstract int g(int i10);

    public double h() {
        return c.a(g(26), g(27));
    }

    public int i() {
        return g(32);
    }

    public int j(int i10) {
        return k(0, i10);
    }

    public int k(int i10, int i11) {
        int i12;
        int i13;
        int iG;
        e.c(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                iG = g(e.e(i14));
            } else {
                do {
                    i12 = i() >>> 1;
                    i13 = i12 % i14;
                } while ((i12 - i13) + (i14 - 1) < 0);
                iG = i13;
            }
            return i10 + iG;
        }
        while (true) {
            int i15 = i();
            if (i10 <= i15 && i15 < i11) {
                return i15;
            }
        }
    }

    public long l() {
        return (((long) i()) << 32) + ((long) i());
    }

    public long m(long j10) {
        return n(0L, j10);
    }

    public long n(long j10, long j11) {
        long jL;
        long j12;
        long jG;
        int i10;
        e.d(j10, j11);
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i11 = (int) j13;
                int i12 = (int) (j13 >>> 32);
                if (i11 != 0) {
                    i10 = g(e.e(i11));
                } else if (i12 == 1) {
                    i10 = i();
                } else {
                    jG = (((long) g(e.e(i12))) << 32) + (4294967295L & ((long) i()));
                }
                jG = ((long) i10) & 4294967295L;
            } else {
                do {
                    jL = l() >>> 1;
                    j12 = jL % j13;
                } while ((jL - j12) + (j13 - 1) < 0);
                jG = j12;
            }
            return j10 + jG;
        }
        while (true) {
            long jL2 = l();
            if (j10 <= jL2 && jL2 < j11) {
                return jL2;
            }
        }
    }
}
