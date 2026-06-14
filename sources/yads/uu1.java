package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class uu1 extends nh3 {
    public uu1(su1 su1Var) {
        super(su1Var);
    }

    @Override // yads.nh3
    public final void a(gi giVar, qh3 qh3Var, Object obj) {
        su1 su1Var = (su1) b();
        if (su1Var == null) {
            return;
        }
        qh3Var.a(su1Var, giVar);
        qh3Var.a(giVar, new eu1(su1Var));
    }

    @Override // yads.nh3
    public final void b(View view, Object obj) {
        su1 su1Var = (su1) view;
        ai1 ai1Var = (ai1) obj;
        String str = ai1Var.f108693a;
        if (str != null && str.length() > 0) {
            su1Var.setAspectRatio(ai1Var.f108694b);
            su1Var.a(str, (ru1) null);
        }
    }

    @Override // yads.nh3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
