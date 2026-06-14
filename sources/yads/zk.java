package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class zk extends Exception {
    public zk(long j10, long j11) {
        super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
    }
}
