package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class ph3 implements ou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f114679a;

    public ph3(View view) {
        this.f114679a = view;
    }

    @Override // yads.ou
    public final void a(td1 td1Var, qu quVar) {
        Context context = this.f114679a.getContext();
        yz1 yz1Var = quVar.f115163c;
        fu fuVar = new fu(context, yz1Var.f118467a.a(quVar.f115161a, td1Var, quVar.f115162b, yz1Var, quVar.f115164d, quVar.f115165e));
        Object obj = qy1.f115213c;
        wz1 wz1Var = new wz1(fuVar, py1.a());
        this.f114679a.setOnTouchListener(wz1Var);
        this.f114679a.setOnClickListener(wz1Var);
    }
}
