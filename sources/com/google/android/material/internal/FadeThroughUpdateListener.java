package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f26762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f26763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f26764d = new float[2];

    public FadeThroughUpdateListener(@Nullable View view, @Nullable View view2) {
        this.f26762b = view;
        this.f26763c = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        FadeThroughUtils.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f26764d);
        View view = this.f26762b;
        if (view != null) {
            view.setAlpha(this.f26764d[0]);
        }
        View view2 = this.f26763c;
        if (view2 != null) {
            view2.setAlpha(this.f26764d[1]);
        }
    }
}
