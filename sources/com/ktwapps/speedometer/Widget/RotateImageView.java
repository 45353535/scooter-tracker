package com.ktwapps.speedometer.Widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes10.dex */
public class RotateImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ValueAnimator f46209c;

    public RotateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46208b = 0.0f;
        b();
    }

    private void b() {
        setLayerType(2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f46208b = fFloatValue;
        setRotation(fFloatValue);
    }

    public void d(float f10) {
        if (Math.abs(f10 - this.f46208b) < 0.1f) {
            return;
        }
        ValueAnimator valueAnimator = this.f46209c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f46209c.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f46208b, f10);
        this.f46209c = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        this.f46209c.setInterpolator(new LinearInterpolator());
        this.f46209c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z4.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f119183b.c(valueAnimator2);
            }
        });
        this.f46209c.start();
    }
}
