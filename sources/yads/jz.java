package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jz implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv1 f112518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hv1 f112519b;

    public jz(nv1 nv1Var, hv1 hv1Var) {
        this.f112518a = nv1Var;
        this.f112519b = hv1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        hv1 hv1Var = this.f112519b;
        if (hv1Var != null) {
            hv1Var.a();
            hv1Var.f111786f = false;
        }
        nv1 nv1Var = this.f112518a;
        if (nv1Var.f114058c) {
            nv1Var.a("first_click_on_controls");
            nv1Var.f114058c = false;
        }
    }

    public /* synthetic */ jz(nv1 nv1Var, hv1 hv1Var, int i10) {
        this(nv1Var, hv1Var);
    }
}
