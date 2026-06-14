package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f28567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f28568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f28569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f28570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28572f;

    public ScaleProvider() {
        this(true);
    }

    private static Animator a(final View view, float f10, float f11) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f10, scaleX * f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10 * scaleY, f11 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.ScaleProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f28571e ? a(view, this.f28569c, this.f28570d) : a(view, this.f28568b, this.f28567a);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f28572f) {
            return this.f28571e ? a(view, this.f28567a, this.f28568b) : a(view, this.f28570d, this.f28569c);
        }
        return null;
    }

    public float getIncomingEndScale() {
        return this.f28570d;
    }

    public float getIncomingStartScale() {
        return this.f28569c;
    }

    public float getOutgoingEndScale() {
        return this.f28568b;
    }

    public float getOutgoingStartScale() {
        return this.f28567a;
    }

    public boolean isGrowing() {
        return this.f28571e;
    }

    public boolean isScaleOnDisappear() {
        return this.f28572f;
    }

    public void setGrowing(boolean z10) {
        this.f28571e = z10;
    }

    public void setIncomingEndScale(float f10) {
        this.f28570d = f10;
    }

    public void setIncomingStartScale(float f10) {
        this.f28569c = f10;
    }

    public void setOutgoingEndScale(float f10) {
        this.f28568b = f10;
    }

    public void setOutgoingStartScale(float f10) {
        this.f28567a = f10;
    }

    public void setScaleOnDisappear(boolean z10) {
        this.f28572f = z10;
    }

    public ScaleProvider(boolean z10) {
        this.f28567a = 1.0f;
        this.f28568b = 1.1f;
        this.f28569c = 0.8f;
        this.f28570d = 1.0f;
        this.f28572f = true;
        this.f28571e = z10;
    }
}
