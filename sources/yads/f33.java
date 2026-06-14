package yads;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class f33 implements ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArgbEvaluator f110594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f110595c;

    public /* synthetic */ f33(int i10) {
        this(i10, new ArgbEvaluator());
    }

    @Override // yads.ze
    public final void a(View view) {
        TextView textView = (TextView) view;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.f110594b, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f110593a));
        this.f110595c = valueAnimatorOfObject;
        e33 e33Var = new e33(textView);
        if (valueAnimatorOfObject != null) {
            valueAnimatorOfObject.addUpdateListener(e33Var);
        }
        ValueAnimator valueAnimator = this.f110595c;
        if (valueAnimator != null) {
            valueAnimator.setDuration(500);
        }
        ValueAnimator valueAnimator2 = this.f110595c;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    @Override // yads.ze
    public final void cancel() {
        ValueAnimator valueAnimator = this.f110595c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f110595c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public f33(int i10, ArgbEvaluator argbEvaluator) {
        this.f110593a = i10;
        this.f110594b = argbEvaluator;
    }
}
