package vb;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import oa.e;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class z extends oa.e {

    private static final class b implements e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q9.j0 f106473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q9.d0 f106474b;

        private e.C1111e b(q9.d0 d0Var, long j10, long j11) {
            int iF = -1;
            int iF2 = -1;
            long j12 = -9223372036854775807L;
            while (d0Var.a() >= 4) {
                if (z.k(d0Var.e(), d0Var.f()) != 442) {
                    d0Var.X(1);
                } else {
                    d0Var.X(4);
                    long jL = a0.l(d0Var);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f106473a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? e.C1111e.d(jB, j11) : e.C1111e.e(j11 + ((long) iF2));
                        }
                        if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jB > j10) {
                            return e.C1111e.e(j11 + ((long) d0Var.f()));
                        }
                        iF2 = d0Var.f();
                        j12 = jB;
                    }
                    c(d0Var);
                    iF = d0Var.f();
                }
            }
            return j12 != -9223372036854775807L ? e.C1111e.f(j12, j11 + ((long) iF)) : e.C1111e.f96523d;
        }

        private static void c(q9.d0 d0Var) {
            int iK;
            int iG = d0Var.g();
            if (d0Var.a() < 10) {
                d0Var.W(iG);
                return;
            }
            d0Var.X(9);
            int iH = d0Var.H() & 7;
            if (d0Var.a() < iH) {
                d0Var.W(iG);
                return;
            }
            d0Var.X(iH);
            if (d0Var.a() < 4) {
                d0Var.W(iG);
                return;
            }
            if (z.k(d0Var.e(), d0Var.f()) == 443) {
                d0Var.X(4);
                int iP = d0Var.P();
                if (d0Var.a() < iP) {
                    d0Var.W(iG);
                    return;
                }
                d0Var.X(iP);
            }
            while (d0Var.a() >= 4 && (iK = z.k(d0Var.e(), d0Var.f())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                d0Var.X(4);
                if (d0Var.a() < 2) {
                    d0Var.W(iG);
                    return;
                }
                d0Var.W(Math.min(d0Var.g(), d0Var.f() + d0Var.P()));
            }
        }

        @Override // oa.e.f
        public e.C1111e a(oa.s sVar, long j10) {
            long position = sVar.getPosition();
            int iMin = (int) Math.min(20000L, sVar.getLength() - position);
            this.f106474b.S(iMin);
            sVar.peekFully(this.f106474b.e(), 0, iMin);
            return b(this.f106474b, j10, position);
        }

        @Override // oa.e.f
        public void onSeekFinished() {
            this.f106474b.T(o0.f98842f);
        }

        private b(q9.j0 j0Var) {
            this.f106473a = j0Var;
            this.f106474b = new q9.d0();
        }
    }

    public z(q9.j0 j0Var, long j10, long j11) {
        super(new e.b(), new b(j0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
