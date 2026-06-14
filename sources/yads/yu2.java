package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class yu2 extends zu2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f118385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f118386e;

    public yu2(lj2 lj2Var, long j10, long j11, long j12, long j13) {
        super(lj2Var, j10, j11);
        this.f118385d = j12;
        this.f118386e = j13;
    }

    public final lj2 b() {
        long j10 = this.f118386e;
        if (j10 <= 0) {
            return null;
        }
        return new lj2(null, this.f118385d, j10);
    }
}
