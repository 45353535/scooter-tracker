package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class h22 implements na2, j43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i22 f111448a;

    public h22(i22 i22Var) {
        this.f111448a = i22Var;
    }

    @Override // yads.na2
    public final void a() {
        this.f111448a.f111843a.a();
    }

    @Override // yads.j43
    public final void a(long j10, long j11) {
        long jA = this.f111448a.f111847e.a() - j10;
        i22 i22Var = this.f111448a;
        long j12 = jA + i22Var.f111845c.f113910a;
        this.f111448a.f111843a.a(i22Var.f111846d.a(), j12);
    }
}
