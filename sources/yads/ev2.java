package yads;

/* JADX INFO: loaded from: classes4.dex */
public interface ev2 {
    boolean continueLoading(long j10);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j10);
}
