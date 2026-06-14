package yads;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class wc implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f117386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc1 f117387b;

    public wc(Dialog dialog, vc1 vc1Var) {
        this.f117386a = dialog;
        this.f117387b = vc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f117387b.getClass();
        vc1.a(view);
        vf0.a(this.f117386a);
    }
}
