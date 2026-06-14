package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class a13 implements ap0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ap0 f108517c;

    public a13(long j10, ap0 ap0Var) {
        this.f108516b = j10;
        this.f108517c = ap0Var;
    }

    @Override // yads.ap0
    public final void a() {
        this.f108517c.a();
    }

    @Override // yads.ap0
    public final void a(nu2 nu2Var) {
        this.f108517c.a(new z03(this, nu2Var));
    }

    @Override // yads.ap0
    public final z43 a(int i10, int i11) {
        return this.f108517c.a(i10, i11);
    }
}
