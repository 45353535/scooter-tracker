package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes9.dex */
final class LinearIndeterminateContiguousAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Property f27242i = new Property<LinearIndeterminateContiguousAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.2
        @Override // android.util.Property
        public Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.h());
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f10) {
            linearIndeterminateContiguousAnimatorDelegate.l(f10.floatValue());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f27243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FastOutSlowInInterpolator f27244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BaseProgressIndicatorSpec f27245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f27248h;

    public LinearIndeterminateContiguousAnimatorDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f27246f = 1;
        this.f27245e = linearProgressIndicatorSpec;
        this.f27244d = new FastOutSlowInInterpolator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float h() {
        return this.f27248h;
    }

    private void i() {
        if (this.f27243c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateContiguousAnimatorDelegate, Float>) f27242i, 0.0f, 1.0f);
            this.f27243c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f27245e.indeterminateAnimatorDurationScale * 333.0f));
            this.f27243c.setInterpolator(null);
            this.f27243c.setRepeatCount(-1);
            this.f27243c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = LinearIndeterminateContiguousAnimatorDelegate.this;
                    linearIndeterminateContiguousAnimatorDelegate.f27246f = (linearIndeterminateContiguousAnimatorDelegate.f27246f + 1) % LinearIndeterminateContiguousAnimatorDelegate.this.f27245e.indicatorColors.length;
                    LinearIndeterminateContiguousAnimatorDelegate.this.f27247g = true;
                }
            });
        }
    }

    private void j() {
        if (!this.f27247g || ((DrawingDelegate.ActiveIndicator) this.f27228b.get(1)).f27216b >= 1.0f) {
            return;
        }
        ((DrawingDelegate.ActiveIndicator) this.f27228b.get(2)).f27217c = ((DrawingDelegate.ActiveIndicator) this.f27228b.get(1)).f27217c;
        ((DrawingDelegate.ActiveIndicator) this.f27228b.get(1)).f27217c = ((DrawingDelegate.ActiveIndicator) this.f27228b.get(0)).f27217c;
        ((DrawingDelegate.ActiveIndicator) this.f27228b.get(0)).f27217c = this.f27245e.indicatorColors[this.f27246f];
        this.f27247g = false;
    }

    private void m() {
        i();
        this.f27243c.setDuration((long) (this.f27245e.indeterminateAnimatorDurationScale * 333.0f));
    }

    private void n(int i10) {
        ((DrawingDelegate.ActiveIndicator) this.f27228b.get(0)).f27215a = 0.0f;
        float fA = a(i10, 0, 667);
        DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) this.f27228b.get(0);
        DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) this.f27228b.get(1);
        float interpolation = this.f27244d.getInterpolation(fA);
        activeIndicator2.f27215a = interpolation;
        activeIndicator.f27216b = interpolation;
        DrawingDelegate.ActiveIndicator activeIndicator3 = (DrawingDelegate.ActiveIndicator) this.f27228b.get(1);
        DrawingDelegate.ActiveIndicator activeIndicator4 = (DrawingDelegate.ActiveIndicator) this.f27228b.get(2);
        float interpolation2 = this.f27244d.getInterpolation(fA + 0.49925038f);
        activeIndicator4.f27215a = interpolation2;
        activeIndicator3.f27216b = interpolation2;
        ((DrawingDelegate.ActiveIndicator) this.f27228b.get(2)).f27216b = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.f27243c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        m();
        k();
    }

    void k() {
        this.f27247g = true;
        this.f27246f = 1;
        for (DrawingDelegate.ActiveIndicator activeIndicator : this.f27228b) {
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27245e;
            activeIndicator.f27217c = baseProgressIndicatorSpec.indicatorColors[0];
            activeIndicator.f27218d = baseProgressIndicatorSpec.indicatorTrackGapSize / 2;
        }
    }

    void l(float f10) {
        this.f27248h = f10;
        n((int) (f10 * 333.0f));
        j();
        this.f27227a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@Nullable Animatable2Compat.AnimationCallback animationCallback) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        i();
        k();
        this.f27243c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
    }
}
