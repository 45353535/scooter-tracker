package yads;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class wz1 implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fu f117652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qy1 f117653b;

    public wz1(fu fuVar, qy1 qy1Var) {
        this.f117652a = fuVar;
        this.f117653b = qy1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f117652a.f110912a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        qy1 qy1Var = this.f117653b;
        qy1Var.getClass();
        if ((view instanceof TextView) || (view instanceof pj2)) {
            qy1Var.a(view, motionEvent);
        }
        return this.f117652a.onTouch(view, motionEvent);
    }
}
