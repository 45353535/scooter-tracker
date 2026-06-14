package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class x20 implements v20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt f117684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f117685b;

    public x20(yt ytVar, long j10) {
        this.f117684a = ytVar;
        this.f117685b = j10;
    }

    @Override // yads.v20
    public final boolean a() {
        return true;
    }

    @Override // yads.v20
    public final long b() {
        return 0L;
    }

    @Override // yads.v20
    public final long c(long j10, long j11) {
        return 0L;
    }

    @Override // yads.v20
    public final long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // yads.v20
    public final long e(long j10, long j11) {
        return this.f117684a.f118373a;
    }

    @Override // yads.v20
    public final long a(long j10, long j11) {
        yt ytVar = this.f117684a;
        return w83.b(ytVar.f118377e, j10 + this.f117685b, true);
    }

    @Override // yads.v20
    public final long b(long j10, long j11) {
        return this.f117684a.f118376d[(int) j10];
    }

    @Override // yads.v20
    public final long c(long j10) {
        return this.f117684a.f118373a;
    }

    @Override // yads.v20
    public final lj2 b(long j10) {
        return new lj2(null, this.f117684a.f118375c[(int) j10], r1.f118374b[r7]);
    }

    @Override // yads.v20
    public final long a(long j10) {
        return this.f117684a.f118377e[(int) j10] - this.f117685b;
    }
}
