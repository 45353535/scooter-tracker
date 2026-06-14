package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class qu1 extends xn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iu1 f115167b;

    public qu1(su1 su1Var, ze3 ze3Var, ju1 ju1Var, ju1 ju1Var2, ju1 ju1Var3, tu1 tu1Var, iu1 iu1Var) {
        super(su1Var);
        this.f115167b = iu1Var;
        iu1Var.f112150l = tu1Var;
        iu1Var.a(ze3Var);
        iu1Var.a(ju1Var);
        iu1Var.b(ju1Var2);
        iu1Var.c(ju1Var3);
    }

    @Override // yads.xn
    public final void a(String str) {
        this.f115167b.a(str);
    }

    public final void a(wu1 wu1Var) {
        this.f117908a.setHtmlWebViewListener(new lu1(this.f115167b));
    }
}
