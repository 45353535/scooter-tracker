package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f28417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f28418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f28419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f28420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28422f;

    public ScaleProvider() {
        this(true);
    }

    private static Animator a(final View view, float f10, float f11) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f10, scaleX * f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10 * scaleY, f11 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.ScaleProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f28421e ? a(view, this.f28419c, this.f28420d) : a(view, this.f28418b, this.f28417a);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f28422f) {
            return this.f28421e ? a(view, this.f28417a, this.f28418b) : a(view, this.f28420d, this.f28419c);
        }
        return null;
    }

    public float getIncomingEndScale() {
        return this.f28420d;
    }

    public float getIncomingStartScale() {
        return this.f28419c;
    }

    public float getOutgoingEndScale() {
        return this.f28418b;
    }

    public float getOutgoingStartScale() {
        return this.f28417a;
    }

    public boolean isGrowing() {
        return this.f28421e;
    }

    public boolean isScaleOnDisappear() {
        return this.f28422f;
    }

    public void setGrowing(boolean z10) {
        this.f28421e = z10;
    }

    public void setIncomingEndScale(float f10) {
        this.f28420d = f10;
    }

    public void setIncomingStartScale(float f10) {
        this.f28419c = f10;
    }

    public void setOutgoingEndScale(float f10) {
        this.f28418b = f10;
    }

    public void setOutgoingStartScale(float f10) {
        this.f28417a = f10;
    }

    public void setScaleOnDisappear(boolean z10) {
        this.f28422f = z10;
    }

    public ScaleProvider(boolean z10) {
        this.f28417a = 1.0f;
        this.f28418b = 1.1f;
        this.f28419c = 0.8f;
        this.f28420d = 1.0f;
        this.f28422f = true;
        this.f28421e = z10;
    }
}
