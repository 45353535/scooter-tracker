package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class y22 implements b92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa f118065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a33 f118066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vu f118067c;

    public y22(xa xaVar, a33 a33Var, vu vuVar) {
        this.f118065a = xaVar;
        this.f118066b = a33Var;
        this.f118067c = vuVar;
    }

    @Override // yads.b92
    public final void a(String str) {
        xa xaVar = this.f118065a;
        a33 a33Var = this.f118066b;
        vu vuVar = this.f118067c;
        xaVar.getClass();
        ve2 ve2Var = new ve2(vuVar, a33Var, new zf1());
        if (str.length() > 0) {
            xa.f117750d.execute(new wa(str, ve2Var));
        }
    }
}
