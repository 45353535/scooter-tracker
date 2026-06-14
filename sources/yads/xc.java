package yads;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class xc implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f117784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dialog f117785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc1 f117786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f117787d;

    public xc(ViewGroup viewGroup, Dialog dialog, vc1 vc1Var) {
        this.f117784a = viewGroup;
        this.f117785b = dialog;
        this.f117786c = vc1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f117787d = rawY;
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            float f10 = this.f117787d;
            if (rawY > f10) {
                this.f117784a.setTranslationY(rawY - f10);
            } else {
                this.f117784a.setTranslationY(0.0f);
            }
        } else if (rawY > this.f117787d) {
            this.f117786c.getClass();
            vc1.a(view);
            vf0.a(this.f117785b);
        }
        return true;
    }
}
