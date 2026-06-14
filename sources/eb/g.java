package eb;

import q9.d0;
import q9.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f69046b;

    private g(long j10, long j11) {
        this.f69045a = j10;
        this.f69046b = j11;
    }

    static g b(d0 d0Var, long j10, j0 j0Var) {
        long jC = c(d0Var, j10);
        return new g(jC, j0Var.b(jC));
    }

    static long c(d0 d0Var, long j10) {
        long jH = d0Var.H();
        if ((128 & jH) != 0) {
            return 8589934591L & ((((jH & 1) << 32) | d0Var.J()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // eb.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f69045a + ", playbackPositionUs= " + this.f69046b + " }";
    }
}
