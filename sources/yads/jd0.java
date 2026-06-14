package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class jd0 implements ce1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f112300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f112301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f112302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f112303d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f112304e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f112306g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f112307h = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f112310k = 0.97f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f112309j = 1.03f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f112311l = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f112312m = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f112305f = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f112308i = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f112313n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f112314o = -9223372036854775807L;

    public jd0(long j10, long j11, float f10) {
        this.f112300a = j10;
        this.f112301b = j11;
        this.f112302c = f10;
    }

    public final void a() {
        long j10 = this.f112303d;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f112304e;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f112306g;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f112307h;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f112305f == j10) {
            return;
        }
        this.f112305f = j10;
        this.f112308i = j10;
        this.f112313n = -9223372036854775807L;
        this.f112314o = -9223372036854775807L;
        this.f112312m = -9223372036854775807L;
    }
}
