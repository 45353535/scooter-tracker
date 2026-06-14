package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class hr implements b30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public er f111708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lt0 f111709b = new lt0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pr f111710c = pr.f114750a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b30 f111711d;

    @Override // yads.b30
    public final c30 a() {
        b30 b30Var = this.f111711d;
        return a(b30Var != null ? b30Var.a() : null, 0, 0);
    }

    public final ir b() {
        b30 b30Var = this.f111711d;
        return a(b30Var != null ? b30Var.a() : null, 1, -1000);
    }

    public final ir a(c30 c30Var, int i10, int i11) {
        er erVar = this.f111708a;
        erVar.getClass();
        gr grVar = c30Var == null ? null : new gr(erVar);
        this.f111709b.getClass();
        return new ir(erVar, c30Var, new nt0(), grVar, this.f111710c, i10);
    }
}
