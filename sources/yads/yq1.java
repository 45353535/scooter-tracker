package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class yq1 implements iq2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iq2 f118325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f118326c;

    public yq1(iq2 iq2Var, long j10) {
        this.f118325b = iq2Var;
        this.f118326c = j10;
    }

    @Override // yads.iq2
    public final void a() {
        this.f118325b.a();
    }

    @Override // yads.iq2
    public final boolean c() {
        return this.f118325b.c();
    }

    @Override // yads.iq2
    public final int a(zv0 zv0Var, fa0 fa0Var, int i10) {
        int iA = this.f118325b.a(zv0Var, fa0Var, i10);
        if (iA == -4) {
            fa0Var.f110672f = Math.max(0L, fa0Var.f110672f + this.f118326c);
        }
        return iA;
    }

    @Override // yads.iq2
    public final int a(long j10) {
        return this.f118325b.a(j10 - this.f118326c);
    }
}
