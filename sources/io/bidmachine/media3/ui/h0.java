package io.bidmachine.media3.ui;

/* JADX INFO: loaded from: classes12.dex */
public interface h0 {

    public interface a {
        void p(h0 h0Var, long j10);

        void s(h0 h0Var, long j10);

        void v(h0 h0Var, long j10, boolean z10);
    }

    void a(a aVar);

    long getPreferredUpdateDelay();

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i10);

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
