package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAsmoothProgressBar f23837a;

    public h(IAsmoothProgressBar iAsmoothProgressBar) {
        this.f23837a = iAsmoothProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
