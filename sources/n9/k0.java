package n9;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95428b;

    public k0(Throwable th2, long j10) {
        super(th2);
        this.f95428b = j10;
    }

    public static k0 a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }

    public static k0 b(Exception exc, long j10) {
        return exc instanceof k0 ? (k0) exc : new k0(exc, j10);
    }
}
