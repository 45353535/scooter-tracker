package vb;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import oa.e;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class h0 extends oa.e {

    private static final class a implements e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q9.j0 f106143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q9.d0 f106144b = new q9.d0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f106145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f106146d;

        public a(int i10, q9.j0 j0Var, int i11) {
            this.f106145c = i10;
            this.f106143a = j0Var;
            this.f106146d = i11;
        }

        private e.C1111e b(q9.d0 d0Var, long j10, long j11) {
            int iA;
            int iA2;
            int iG = d0Var.g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (d0Var.a() >= 188 && (iA2 = (iA = m0.a(d0Var.e(), d0Var.f(), iG)) + 188) <= iG) {
                long jC = m0.c(d0Var, iA, this.f106145c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f106143a.b(jC);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? e.C1111e.d(jB, j11) : e.C1111e.e(j11 + j13);
                    }
                    if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jB > j10) {
                        return e.C1111e.e(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB;
                }
                d0Var.W(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? e.C1111e.f(j14, j11 + j12) : e.C1111e.f96523d;
        }

        @Override // oa.e.f
        public e.C1111e a(oa.s sVar, long j10) {
            long position = sVar.getPosition();
            int iMin = (int) Math.min(this.f106146d, sVar.getLength() - position);
            this.f106144b.S(iMin);
            sVar.peekFully(this.f106144b.e(), 0, iMin);
            return b(this.f106144b, j10, position);
        }

        @Override // oa.e.f
        public void onSeekFinished() {
            this.f106144b.T(o0.f98842f);
        }
    }

    public h0(q9.j0 j0Var, long j10, long j11, int i10, int i11) {
        super(new e.b(), new a(i10, j0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
