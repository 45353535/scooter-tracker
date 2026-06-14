package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
public final class FadeProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f28446a = 1.0f;

    private static Animator a(final View view, final float f10, final float f11, final float f12, final float f13, final float f14) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.FadeProvider.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(TransitionUtils.m(f10, f11, f12, f13, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.FadeProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setAlpha(f14);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return a(view, 0.0f, alpha, 0.0f, this.f28446a, alpha);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return a(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    public float getIncomingEndThreshold() {
        return this.f28446a;
    }

    public void setIncomingEndThreshold(float f10) {
        this.f28446a = f10;
    }
}
