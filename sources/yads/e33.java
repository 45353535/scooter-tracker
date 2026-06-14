package yads;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class e33 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f110181a;

    public e33(TextView textView) {
        this.f110181a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            this.f110181a.setTextColor(((Number) animatedValue).intValue());
        }
    }
}
