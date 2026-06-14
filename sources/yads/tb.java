package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class tb implements qh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1 f116150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu f116151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final td1 f116152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ni3 f116153d;

    public tb(yz1 yz1Var, pu puVar, td1 td1Var, ni3 ni3Var) {
        this.f116150a = yz1Var;
        this.f116151b = puVar;
        this.f116152c = td1Var;
        this.f116153d = ni3Var;
    }

    @Override // yads.qh3
    public final void a(gi giVar, ou ouVar) {
        td1 td1Var = giVar.f111216d;
        if (td1Var == null) {
            td1Var = this.f116152c;
        }
        pu puVar = this.f116151b;
        yz1 yz1Var = this.f116150a;
        puVar.getClass();
        if (!giVar.f111217e || td1Var == null) {
            return;
        }
        ouVar.a(td1Var, new qu(giVar, puVar.f114783a, yz1Var, puVar.f114784b, puVar.f114785c));
    }

    @Override // yads.qh3
    public final void a(View view, gi giVar) {
        if (view.getTag() == null) {
            ni3 ni3Var = this.f116153d;
            String str = giVar.f111213a;
            ni3Var.getClass();
            view.setTag(ni3.a(str));
        }
    }
}
