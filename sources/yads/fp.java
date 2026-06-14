package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class fp implements nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip f110819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f110820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f110821c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f110822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f110823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f110824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f110825g;

    public fp(ip ipVar, long j10, long j11, long j12, long j13, long j14) {
        this.f110819a = ipVar;
        this.f110820b = j10;
        this.f110822d = j11;
        this.f110823e = j12;
        this.f110824f = j13;
        this.f110825g = j14;
    }

    @Override // yads.nu2
    public final boolean b() {
        return true;
    }

    @Override // yads.nu2
    public final long c() {
        return this.f110820b;
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        pu2 pu2Var = new pu2(j10, hp.a(this.f110819a.a(j10), this.f110821c, this.f110822d, this.f110823e, this.f110824f, this.f110825g));
        return new lu2(pu2Var, pu2Var);
    }
}
