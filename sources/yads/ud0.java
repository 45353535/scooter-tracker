package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ud0 implements nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd0 f116617a;

    public ud0(vd0 vd0Var) {
        this.f116617a = vd0Var;
    }

    @Override // yads.nu2
    public final boolean b() {
        return true;
    }

    @Override // yads.nu2
    public final long c() {
        vd0 vd0Var = this.f116617a;
        return (vd0Var.f116970f * 1000000) / ((long) vd0Var.f116968d.f112920i);
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        vd0 vd0Var = this.f116617a;
        long j11 = (((long) vd0Var.f116968d.f112920i) * j10) / 1000000;
        long j12 = vd0Var.f116966b;
        long j13 = vd0Var.f116967c;
        int i10 = w83.f117341a;
        pu2 pu2Var = new pu2(j10, Math.max(j12, Math.min(((((j13 - j12) * j11) / vd0Var.f116970f) + j12) - 30000, j13 - 1)));
        return new lu2(pu2Var, pu2Var);
    }
}
