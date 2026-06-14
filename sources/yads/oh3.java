package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class oh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh3 f114324a;

    public oh3(nh3 nh3Var) {
        this.f114324a = nh3Var;
    }

    public final void a() {
        View viewB = this.f114324a.b();
        if (viewB == null) {
            return;
        }
        this.f114324a.a(viewB);
    }

    public final void b(Object obj) {
        View viewB = this.f114324a.b();
        if (viewB == null) {
            return;
        }
        this.f114324a.b(viewB, obj);
        viewB.setVisibility(0);
    }

    public final void a(gi giVar, qh3 qh3Var, Object obj) {
        if (this.f114324a.b() == null) {
            return;
        }
        this.f114324a.a(giVar, qh3Var, obj);
    }

    public final boolean a(Object obj) {
        View viewB = this.f114324a.b();
        return viewB != null && this.f114324a.a(viewB, obj);
    }
}
