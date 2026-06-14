package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ih1 extends f43 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rk1 f111992c;

    public ih1(rk1 rk1Var) {
        this.f111992c = rk1Var;
    }

    @Override // yads.f43
    public final int a() {
        return 1;
    }

    @Override // yads.f43
    public final int b() {
        return 1;
    }

    @Override // yads.f43
    public final int a(Object obj) {
        return obj == hh1.f111593f ? 0 : -1;
    }

    @Override // yads.f43
    public final c43 a(int i10, c43 c43Var, boolean z10) {
        c43Var.a(z10 ? 0 : null, z10 ? hh1.f111593f : null, 0, -9223372036854775807L, 0L, d6.f109796h, true);
        return c43Var;
    }

    @Override // yads.f43
    public final e43 a(int i10, e43 e43Var, long j10) {
        e43Var.a(e43.f110183s, this.f111992c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        e43Var.f110198m = true;
        return e43Var;
    }

    @Override // yads.f43
    public final Object a(int i10) {
        return hh1.f111593f;
    }
}
