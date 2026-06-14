package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class vk3 implements nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sk3 f117047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f117049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f117050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f117051e;

    public vk3(sk3 sk3Var, int i10, long j10, long j11) {
        this.f117047a = sk3Var;
        this.f117048b = i10;
        this.f117049c = j10;
        long j12 = (j11 - j10) / ((long) sk3Var.f115846c);
        this.f117050d = j12;
        this.f117051e = c(j12);
    }

    @Override // yads.nu2
    public final boolean b() {
        return true;
    }

    public final long c(long j10) {
        return w83.a(j10 * ((long) this.f117048b), 1000000L, this.f117047a.f115845b);
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        long j11 = (((long) this.f117047a.f115845b) * j10) / (((long) this.f117048b) * 1000000);
        long j12 = this.f117050d - 1;
        int i10 = w83.f117341a;
        long jMax = Math.max(0L, Math.min(j11, j12));
        long j13 = (((long) this.f117047a.f115846c) * jMax) + this.f117049c;
        long jC = c(jMax);
        pu2 pu2Var = new pu2(jC, j13);
        if (jC >= j10 || jMax == this.f117050d - 1) {
            return new lu2(pu2Var, pu2Var);
        }
        long j14 = jMax + 1;
        return new lu2(pu2Var, new pu2(c(j14), (((long) this.f117047a.f115846c) * j14) + this.f117049c));
    }

    @Override // yads.nu2
    public final long c() {
        return this.f117051e;
    }
}
