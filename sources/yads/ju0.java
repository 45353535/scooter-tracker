package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ju0 implements c82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu0 f112460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mu0 f112461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f112462c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f112463d = -1;

    public ju0(nu0 nu0Var, mu0 mu0Var) {
        this.f112460a = nu0Var;
        this.f112461b = mu0Var;
    }

    @Override // yads.c82
    public final nu2 a() {
        long j10 = this.f112462c;
        if (j10 != -1) {
            return new lu0(this.f112460a, j10);
        }
        throw new IllegalStateException();
    }

    @Override // yads.c82
    public final long a(yc0 yc0Var) {
        long j10 = this.f112463d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f112463d = -1L;
        return j11;
    }

    @Override // yads.c82
    public final void a(long j10) {
        long[] jArr = this.f112461b.f113609a;
        this.f112463d = jArr[w83.b(jArr, j10, true)];
    }
}
