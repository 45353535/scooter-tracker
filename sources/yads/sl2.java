package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class sl2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh3 f115865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e52 f115866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ql2 f115867c;

    public sl2(jh3 jh3Var, e52 e52Var, ql2 ql2Var) {
        this.f115865a = jh3Var;
        this.f115866b = e52Var;
        this.f115867c = ql2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r52 r52Var = (r52) this.f115865a.b();
        if (r52Var != null) {
            pl2 pl2Var = r52Var.f115325c.f109754a;
            this.f115867c.getClass();
            ql2.a(pl2Var);
            f52 f52Var = this.f115866b.f110209a;
            f52Var.a(f52Var.f110608g);
        }
    }
}
