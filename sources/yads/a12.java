package yads;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class a12 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c12 f108515a;

    public a12(b12 b12Var) {
        this.f108515a = b12Var.a();
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        c12 c12Var = this.f108515a;
        if (c12Var != null) {
            c12Var.f109178a.f114874a.add(c12Var);
        }
    }

    @Override // yads.hf0
    public final void c() {
        c12 c12Var = this.f108515a;
        if (c12Var != null) {
            c12Var.f109178a.f114874a.remove(c12Var);
            c12Var.f109179b = null;
        }
    }

    public /* synthetic */ a12(r22 r22Var, ze3 ze3Var) {
        this(new b12(ze3Var, r22Var));
    }
}
