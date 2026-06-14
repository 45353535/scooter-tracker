package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jg.e0 f69174a = new jg.e0("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final jg.e0 f69175b = new jg.e0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
