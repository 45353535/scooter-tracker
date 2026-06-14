package ga;

import ga.d1;

/* JADX INFO: loaded from: classes12.dex */
public interface c0 extends d1 {

    public interface a extends d1.a {
        void f(c0 c0Var);
    }

    @Override // ga.d1
    boolean a(io.bidmachine.media3.exoplayer.l1 l1Var);

    long b(long j10, u9.m0 m0Var);

    void c(a aVar, long j10);

    void discardBuffer(long j10, boolean z10);

    @Override // ga.d1
    long getBufferedPositionUs();

    @Override // ga.d1
    long getNextLoadPositionUs();

    m1 getTrackGroups();

    @Override // ga.d1
    boolean isLoading();

    long j(ja.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10);

    void maybeThrowPrepareError();

    long readDiscontinuity();

    @Override // ga.d1
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);
}
