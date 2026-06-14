package pg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f98353a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final void a(long j10, long j11, long j12) {
        if (j11 < 0 || j12 > j10) {
            throw new IndexOutOfBoundsException("startIndex (" + j11 + ") and endIndex (" + j12 + ") are not within the range [0..size(" + j10 + "))");
        }
        if (j11 <= j12) {
            return;
        }
        throw new IllegalArgumentException("startIndex (" + j11 + ") > endIndex (" + j12 + ')');
    }

    public static final void b(long j10, long j11, long j12) {
        if (j11 < 0 || j11 > j10 || j10 - j11 < j12 || j12 < 0) {
            throw new IllegalArgumentException("offset (" + j11 + ") and byteCount (" + j12 + ") are not within the range [0..size(" + j10 + "))");
        }
    }

    public static final char[] c() {
        return f98353a;
    }
}
