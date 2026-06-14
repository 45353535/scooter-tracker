package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes11.dex */
public class AnimatingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AccelerateDecelerateInterpolator f64209c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ValueAnimator f64210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f64211b;

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f64211b = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f64210a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i10) {
        if (!this.f64211b) {
            super.setProgress(i10);
            return;
        }
        ValueAnimator valueAnimator = this.f64210a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i10) {
                return;
            }
        } else {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i10);
            this.f64210a = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(f64209c);
            this.f64210a.addUpdateListener(new a(this));
        }
        this.f64210a.setIntValues(getProgress(), i10);
        this.f64210a.start();
    }

    public final void a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f64210a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
