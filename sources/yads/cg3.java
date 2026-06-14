package yads;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class cg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t52 f109400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bh2 f109401b;

    public cg3(t52 t52Var, bh2 bh2Var) {
        this.f109400a = t52Var;
        this.f109401b = bh2Var;
    }

    public final void a(r52 r52Var) {
        r52Var.f115324b.setVisibility(0);
        pf3 pf3Var = r52Var.f115323a;
        this.f109401b.getClass();
        pf3Var.f114658a.setVisibility(8);
        ImageView imageView = pf3Var.f114659b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.f109400a.a(r52Var.f115325c.f109755b);
    }
}
