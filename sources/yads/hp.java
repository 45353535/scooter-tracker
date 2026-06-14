package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class hp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f111654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f111655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f111656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f111657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f111658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f111659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f111660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f111661h;

    public hp(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f111654a = j10;
        this.f111655b = j11;
        this.f111657d = j12;
        this.f111658e = j13;
        this.f111659f = j14;
        this.f111660g = j15;
        this.f111656c = j16;
        this.f111661h = a(j11, j12, j13, j14, j15, j16);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        long j17 = j16 / 20;
        int i10 = w83.f117341a;
        return Math.max(j13, Math.min(((j16 + j13) - j15) - j17, j14 - 1));
    }
}
