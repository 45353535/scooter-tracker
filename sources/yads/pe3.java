package yads;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class pe3 implements ou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r52 f114649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n10 f114650b;

    public pe3(r52 r52Var, n10 n10Var) {
        this.f114649a = r52Var;
        this.f114650b = n10Var;
    }

    @Override // yads.ou
    public final void a(td1 td1Var, qu quVar) {
        fu fuVar = new fu(this.f114649a.getContext(), new oe3(td1Var, quVar, this.f114650b));
        r52 r52Var = this.f114649a;
        r52Var.setOnTouchListener(fuVar);
        r52Var.setOnClickListener(fuVar);
        ImageView imageView = this.f114649a.f115323a.f114659b;
        if (imageView != null) {
            imageView.setOnTouchListener(fuVar);
            imageView.setOnClickListener(fuVar);
        }
    }
}
