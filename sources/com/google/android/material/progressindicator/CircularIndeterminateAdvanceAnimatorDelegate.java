package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes9.dex */
final class CircularIndeterminateAdvanceAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f27153k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f27154l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f27155m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Property f27156n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Property f27157o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f27158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f27159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FastOutSlowInInterpolator f27160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BaseProgressIndicatorSpec f27161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f27163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f27164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Animatable2Compat.AnimationCallback f27165j;

    static {
        Class<Float> cls = Float.class;
        f27156n = new Property<CircularIndeterminateAdvanceAnimatorDelegate, Float>(cls, "animationFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.3
            @Override // android.util.Property
            public Float get(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAdvanceAnimatorDelegate.i());
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate, Float f10) {
                circularIndeterminateAdvanceAnimatorDelegate.n(f10.floatValue());
            }
        };
        f27157o = new Property<CircularIndeterminateAdvanceAnimatorDelegate, Float>(cls, "completeEndFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.4
            @Override // android.util.Property
            public Float get(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAdvanceAnimatorDelegate.j());
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate, Float f10) {
                circularIndeterminateAdvanceAnimatorDelegate.o(f10.floatValue());
            }
        };
    }

    public CircularIndeterminateAdvanceAnimatorDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f27162g = 0;
        this.f27165j = null;
        this.f27161f = circularProgressIndicatorSpec;
        this.f27160e = new FastOutSlowInInterpolator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float i() {
        return this.f27163h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float j() {
        return this.f27164i;
    }

    private void k() {
        if (this.f27158c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<CircularIndeterminateAdvanceAnimatorDelegate, Float>) f27156n, 0.0f, 1.0f);
            this.f27158c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f27161f.indeterminateAnimatorDurationScale * 5400.0f));
            this.f27158c.setInterpolator(null);
            this.f27158c.setRepeatCount(-1);
            this.f27158c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = CircularIndeterminateAdvanceAnimatorDelegate.this;
                    circularIndeterminateAdvanceAnimatorDelegate.f27162g = (circularIndeterminateAdvanceAnimatorDelegate.f27162g + 4) % CircularIndeterminateAdvanceAnimatorDelegate.this.f27161f.indicatorColors.length;
                }
            });
        }
        if (this.f27159d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<CircularIndeterminateAdvanceAnimatorDelegate, Float>) f27157o, 0.0f, 1.0f);
            this.f27159d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f27161f.indeterminateAnimatorDurationScale * 333.0f));
            this.f27159d.setInterpolator(this.f27160e);
            this.f27159d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateAdvanceAnimatorDelegate.this.cancelAnimatorImmediately();
                    CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = CircularIndeterminateAdvanceAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = circularIndeterminateAdvanceAnimatorDelegate.f27165j;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(circularIndeterminateAdvanceAnimatorDelegate.f27227a);
                    }
                }
            });
        }
    }

    private void l(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float fA = a(i10, f27155m[i11], 333);
            if (fA > 0.0f && fA < 1.0f) {
                int i12 = i11 + this.f27162g;
                int[] iArr = this.f27161f.indicatorColors;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i13 = iArr[length];
                int i14 = iArr[length2];
                ((DrawingDelegate.ActiveIndicator) this.f27228b.get(0)).f27217c = ArgbEvaluatorCompat.getInstance().evaluate(this.f27160e.getInterpolation(fA), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(float f10) {
        this.f27164i = f10;
    }

    private void p() {
        k();
        this.f27158c.setDuration((long) (this.f27161f.indeterminateAnimatorDurationScale * 5400.0f));
        this.f27159d.setDuration((long) (this.f27161f.indeterminateAnimatorDurationScale * 333.0f));
    }

    private void q(int i10) {
        DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) this.f27228b.get(0);
        float f10 = this.f27163h;
        activeIndicator.f27215a = (f10 * 1520.0f) - 20.0f;
        activeIndicator.f27216b = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            activeIndicator.f27216b += this.f27160e.getInterpolation(a(i10, f27153k[i11], 667)) * 250.0f;
            activeIndicator.f27215a += this.f27160e.getInterpolation(a(i10, f27154l[i11], 667)) * 250.0f;
        }
        float f11 = activeIndicator.f27215a;
        float f12 = activeIndicator.f27216b;
        activeIndicator.f27215a = (f11 + ((f12 - f11) * this.f27164i)) / 360.0f;
        activeIndicator.f27216b = f12 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.f27158c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        p();
        m();
    }

    void m() {
        this.f27162g = 0;
        ((DrawingDelegate.ActiveIndicator) this.f27228b.get(0)).f27217c = this.f27161f.indicatorColors[0];
        this.f27164i = 0.0f;
    }

    void n(float f10) {
        this.f27163h = f10;
        int i10 = (int) (f10 * 5400.0f);
        q(i10);
        l(i10);
        this.f27227a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f27165j = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.f27159d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f27227a.isVisible()) {
            this.f27159d.start();
        } else {
            cancelAnimatorImmediately();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void startAnimator() {
        k();
        m();
        this.f27158c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.f27165j = null;
    }
}
