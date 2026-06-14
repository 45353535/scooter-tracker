package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vu2 extends uu2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f117207j;

    public vu2(lj2 lj2Var, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(lj2Var, j10, j11, j12, j13, list, j14, j15, j16);
        this.f117207j = list2;
    }

    @Override // yads.uu2
    public final long a(long j10) {
        return this.f117207j.size();
    }

    @Override // yads.uu2
    public final boolean b() {
        return true;
    }

    @Override // yads.uu2
    public final lj2 a(long j10, gm2 gm2Var) {
        return (lj2) this.f117207j.get((int) (j10 - this.f116782d));
    }
}
