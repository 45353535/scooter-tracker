package com.google.android.material.loadingindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.loadingindicator.LoadingIndicatorDrawingDelegate;

/* JADX INFO: loaded from: classes9.dex */
class LoadingIndicatorAnimatorDelegate {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Property f26889i = new Property<LoadingIndicatorAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate.2
        @Override // android.util.Property
        public Float get(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
            return Float.valueOf(loadingIndicatorAnimatorDelegate.f());
        }

        @Override // android.util.Property
        public void set(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate, Float f10) {
            loadingIndicatorAnimatorDelegate.l(f10.floatValue());
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final FloatPropertyCompat f26890j = new FloatPropertyCompat<LoadingIndicatorAnimatorDelegate>("morphFactor") { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate.3
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
            return loadingIndicatorAnimatorDelegate.g();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate, float f10) {
            loadingIndicatorAnimatorDelegate.m(f10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f26892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f26893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f26894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SpringAnimation f26895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    LoadingIndicatorSpec f26896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LoadingIndicatorDrawable f26897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    LoadingIndicatorDrawingDelegate.IndicatorState f26898h = new LoadingIndicatorDrawingDelegate.IndicatorState();

    public LoadingIndicatorAnimatorDelegate(@NonNull LoadingIndicatorSpec loadingIndicatorSpec) {
        this.f26896f = loadingIndicatorSpec;
    }

    static /* synthetic */ int a(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
        int i10 = loadingIndicatorAnimatorDelegate.f26891a + 1;
        loadingIndicatorAnimatorDelegate.f26891a = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float f() {
        return this.f26892b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float g() {
        return this.f26893c;
    }

    private void i() {
        if (this.f26895e == null) {
            this.f26895e = new SpringAnimation(this, (FloatPropertyCompat<LoadingIndicatorAnimatorDelegate>) f26890j).setSpring(new SpringForce().setStiffness(200.0f).setDampingRatio(0.6f)).setMinimumVisibleChange(0.01f);
        }
        if (this.f26894d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LoadingIndicatorAnimatorDelegate, Float>) f26889i, 0.0f, 1.0f);
            this.f26894d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(650L);
            this.f26894d.setInterpolator(null);
            this.f26894d.setRepeatCount(-1);
            this.f26894d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LoadingIndicatorAnimatorDelegate.this.f26895e.animateToFinalPosition(LoadingIndicatorAnimatorDelegate.a(LoadingIndicatorAnimatorDelegate.this));
                }
            });
        }
    }

    private void o(int i10) {
        float f10 = this.f26891a - 1;
        float f11 = this.f26893c - f10;
        float f12 = i10 / 650.0f;
        if (f12 == 1.0f) {
            f12 = 0.0f;
        }
        this.f26898h.f26915c = (((f10 * 140.0f) + (f12 * 50.0f)) + (f11 * 90.0f)) % 360.0f;
    }

    private void p() {
        LoadingIndicatorDrawingDelegate.IndicatorState indicatorState = this.f26898h;
        indicatorState.f26914b = this.f26893c;
        int i10 = this.f26891a - 1;
        int[] iArr = this.f26896f.f26920e;
        int length = i10 % iArr.length;
        indicatorState.f26913a = ArgbEvaluatorCompat.getInstance().evaluate(MathUtils.clamp(this.f26893c - (this.f26891a - 1), 0.0f, 1.0f), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
    }

    void e() {
        ObjectAnimator objectAnimator = this.f26894d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        SpringAnimation springAnimation = this.f26895e;
        if (springAnimation != null) {
            springAnimation.skipToEnd();
        }
    }

    void h() {
        k();
    }

    protected void j(LoadingIndicatorDrawable loadingIndicatorDrawable) {
        this.f26897g = loadingIndicatorDrawable;
    }

    void k() {
        this.f26891a = 1;
        m(0.0f);
        this.f26898h.f26913a = this.f26896f.f26920e[0];
    }

    void l(float f10) {
        this.f26892b = f10;
        o((int) (f10 * 650.0f));
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.f26897g;
        if (loadingIndicatorDrawable != null) {
            loadingIndicatorDrawable.invalidateSelf();
        }
    }

    void m(float f10) {
        this.f26893c = f10;
        p();
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.f26897g;
        if (loadingIndicatorDrawable != null) {
            loadingIndicatorDrawable.invalidateSelf();
        }
    }

    void n() {
        i();
        k();
        this.f26895e.animateToFinalPosition(this.f26891a);
        this.f26894d.start();
    }
}
