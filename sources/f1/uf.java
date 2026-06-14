package f1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uf {
    public static final String b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "STATE_ENDED" : "STATE_READY" : "STATE_BUFFERING" : "STATE_IDLE";
    }
}
