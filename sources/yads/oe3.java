package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class oe3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td1 f114283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qu f114284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n10 f114285c;

    public oe3(td1 td1Var, qu quVar, n10 n10Var) {
        this.f114283a = td1Var;
        this.f114284b = quVar;
        this.f114285c = n10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        td1 td1Var;
        n10 n10Var = this.f114285c;
        if (n10Var != null) {
            td1 td1Var2 = this.f114283a;
            td1Var = new td1(td1Var2.f116205a, td1Var2.f116206b, td1Var2.f116207c, n10Var.f113683f, td1Var2.f116209e);
        } else {
            td1Var = this.f114283a;
        }
        td1 td1Var3 = td1Var;
        qu quVar = this.f114284b;
        yz1 yz1Var = quVar.f115163c;
        yz1Var.f118467a.a(quVar.f115161a, td1Var3, quVar.f115162b, yz1Var, quVar.f115164d, quVar.f115165e).onClick(view);
    }
}
