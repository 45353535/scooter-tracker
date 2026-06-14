package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class em2 extends gm2 implements v20 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uu2 f110423f;

    public em2(long j10, yv0 yv0Var, y31 y31Var, uu2 uu2Var, ArrayList arrayList) {
        super(yv0Var, y31Var, uu2Var, arrayList);
        this.f110423f = uu2Var;
    }

    @Override // yads.v20
    public final long a(long j10, long j11) {
        return this.f110423f.c(j10, j11);
    }

    @Override // yads.v20
    public final long b(long j10, long j11) {
        return this.f110423f.b(j10, j11);
    }

    @Override // yads.gm2
    public final String c() {
        return null;
    }

    @Override // yads.gm2
    public final v20 d() {
        return this;
    }

    @Override // yads.gm2
    public final lj2 e() {
        return null;
    }

    @Override // yads.v20
    public final long a(long j10) {
        return this.f110423f.b(j10);
    }

    @Override // yads.v20
    public final long b() {
        return this.f110423f.f116782d;
    }

    @Override // yads.v20
    public final long c(long j10, long j11) {
        return this.f110423f.a(j10, j11);
    }

    @Override // yads.v20
    public final long d(long j10, long j11) {
        uu2 uu2Var = this.f110423f;
        if (uu2Var.f116784f != null) {
            return -9223372036854775807L;
        }
        long jA = uu2Var.a(j10, j11);
        long jA2 = uu2Var.a(j10);
        if (jA2 == -1) {
            jA2 = (int) (uu2Var.c((j11 - uu2Var.f116786h) + uu2Var.f116787i, j10) - uu2Var.a(j10, j11));
        }
        long j12 = jA2 + jA;
        return (uu2Var.b(j12, j10) + uu2Var.b(j12)) - uu2Var.f116787i;
    }

    @Override // yads.v20
    public final long e(long j10, long j11) {
        long jA = this.f110423f.a(j10);
        return jA != -1 ? jA : (int) (r0.c((j11 - r0.f116786h) + r0.f116787i, j10) - r0.a(j10, j11));
    }

    @Override // yads.v20
    public final boolean a() {
        return this.f110423f.b();
    }

    @Override // yads.v20
    public final long c(long j10) {
        return this.f110423f.a(j10);
    }

    @Override // yads.v20
    public final lj2 b(long j10) {
        return this.f110423f.a(j10, this);
    }
}
