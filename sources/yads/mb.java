package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class mb implements qh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1 f113369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu f113370b;

    public mb(yz1 yz1Var, pu puVar) {
        this.f113369a = yz1Var;
        this.f113370b = puVar;
    }

    @Override // yads.qh3
    public final void a(View view, gi giVar) {
    }

    @Override // yads.qh3
    public final void a(gi giVar, ou ouVar) {
        td1 td1Var = giVar.f111216d;
        pu puVar = this.f113370b;
        yz1 yz1Var = this.f113369a;
        puVar.getClass();
        if (!giVar.f111217e || td1Var == null) {
            return;
        }
        ouVar.a(td1Var, new qu(giVar, puVar.f114783a, yz1Var, puVar.f114784b, puVar.f114785c));
    }
}
