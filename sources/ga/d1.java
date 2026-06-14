package ga;

/* JADX INFO: loaded from: classes12.dex */
public interface d1 {

    public interface a {
        void d(d1 d1Var);
    }

    boolean a(io.bidmachine.media3.exoplayer.l1 l1Var);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j10);
}
