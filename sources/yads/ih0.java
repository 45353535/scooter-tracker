package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class ih0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh0 f111990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kh0 f111991b;

    public ih0(hh0 hh0Var, kh0 kh0Var) {
        this.f111990a = hh0Var;
        this.f111991b = kh0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            this.f111990a.a(this.f111991b.f112705a, view);
        }
    }
}
