package oa;

import android.support.v4.media.session.PlaybackStateCompat;
import oa.m0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f96504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f96505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f96506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f96507d;

    public static class a implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f96508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f96509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f96510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f96511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f96512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f96513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f96514g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f96508a = dVar;
            this.f96509b = j10;
            this.f96510c = j11;
            this.f96511d = j12;
            this.f96512e = j13;
            this.f96513f = j14;
            this.f96514g = j15;
        }

        public long f(long j10) {
            return this.f96508a.timeUsToTargetTime(j10);
        }

        @Override // oa.m0
        public long getDurationUs() {
            return this.f96509b;
        }

        @Override // oa.m0
        public m0.a getSeekPoints(long j10) {
            return new m0.a(new n0(j10, c.h(this.f96508a.timeUsToTargetTime(j10), this.f96510c, this.f96511d, this.f96512e, this.f96513f, this.f96514g)));
        }

        @Override // oa.m0
        public boolean isSeekable() {
            return true;
        }
    }

    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f96515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f96516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f96517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f96518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f96519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f96520f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f96521g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f96522h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f96515a = j10;
            this.f96516b = j11;
            this.f96518d = j12;
            this.f96519e = j13;
            this.f96520f = j14;
            this.f96521g = j15;
            this.f96517c = j16;
            this.f96522h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return q9.o0.q(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f96521g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f96520f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f96522h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f96515a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f96516b;
        }

        private void n() {
            this.f96522h = h(this.f96516b, this.f96518d, this.f96519e, this.f96520f, this.f96521g, this.f96517c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f96519e = j10;
            this.f96521g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f96518d = j10;
            this.f96520f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface d {
        long timeUsToTargetTime(long j10);
    }

    /* JADX INFO: renamed from: oa.e$e, reason: collision with other inner class name */
    public static final class C1111e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C1111e f96523d = new C1111e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f96524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f96525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f96526c;

        private C1111e(int i10, long j10, long j11) {
            this.f96524a = i10;
            this.f96525b = j10;
            this.f96526c = j11;
        }

        public static C1111e d(long j10, long j11) {
            return new C1111e(-1, j10, j11);
        }

        public static C1111e e(long j10) {
            return new C1111e(0, -9223372036854775807L, j10);
        }

        public static C1111e f(long j10, long j11) {
            return new C1111e(-2, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface f {
        C1111e a(s sVar, long j10);

        void onSeekFinished();
    }

    protected e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f96505b = fVar;
        this.f96507d = i10;
        this.f96504a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f96504a.f(j10), this.f96504a.f96510c, this.f96504a.f96511d, this.f96504a.f96512e, this.f96504a.f96513f, this.f96504a.f96514g);
    }

    public final m0 b() {
        return this.f96504a;
    }

    public int c(s sVar, l0 l0Var) {
        while (true) {
            c cVar = (c) q9.a.i(this.f96506c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f96507d) {
                e(false, j10);
                return g(sVar, j10, l0Var);
            }
            if (!i(sVar, jK)) {
                return g(sVar, jK, l0Var);
            }
            sVar.resetPeekPosition();
            C1111e c1111eA = this.f96505b.a(sVar, cVar.m());
            int i10 = c1111eA.f96524a;
            if (i10 == -3) {
                e(false, jK);
                return g(sVar, jK, l0Var);
            }
            if (i10 == -2) {
                cVar.p(c1111eA.f96525b, c1111eA.f96526c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(sVar, c1111eA.f96526c);
                    e(true, c1111eA.f96526c);
                    return g(sVar, c1111eA.f96526c, l0Var);
                }
                cVar.o(c1111eA.f96525b, c1111eA.f96526c);
            }
        }
    }

    public final boolean d() {
        return this.f96506c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f96506c = null;
        this.f96505b.onSeekFinished();
        f(z10, j10);
    }

    protected final int g(s sVar, long j10, l0 l0Var) {
        if (j10 == sVar.getPosition()) {
            return 0;
        }
        l0Var.f96583a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f96506c;
        if (cVar == null || cVar.l() != j10) {
            this.f96506c = a(j10);
        }
    }

    protected final boolean i(s sVar, long j10) {
        long position = j10 - sVar.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        sVar.skipFully((int) position);
        return true;
    }

    public static final class b implements d {
        @Override // oa.e.d
        public long timeUsToTargetTime(long j10) {
            return j10;
        }
    }

    protected void f(boolean z10, long j10) {
    }
}
