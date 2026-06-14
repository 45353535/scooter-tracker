package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes7.dex */
public class IAsmoothProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AccelerateDecelerateInterpolator f23812c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f23813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f23814b;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f23813a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f23814b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        try {
            ValueAnimator valueAnimator = this.f23813a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f23813a;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i10);
                this.f23813a = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(f23812c);
                this.f23813a.addUpdateListener(new h(this));
            } else {
                valueAnimator2.setIntValues(getProgress(), i10);
            }
            this.f23813a.start();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i10) {
        try {
            ValueAnimator valueAnimator = this.f23814b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f23814b;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i10);
                this.f23814b = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(f23812c);
                this.f23814b.addUpdateListener(new i(this));
            } else {
                valueAnimator2.setIntValues(getProgress(), i10);
            }
            this.f23814b.start();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
