package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes9.dex */
final class CircularIndeterminateRetreatAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final TimeInterpolator f27168k = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f27169l = {0, 1500, 3000, 4500};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f27170m = {0.1f, 0.87f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Property f27171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Property f27172o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f27173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f27174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f27175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BaseProgressIndicatorSpec f27176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f27178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f27179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Animatable2Compat.AnimationCallback f27180j;

    static {
        Class<Float> cls = Float.class;
        f27171n = new Property<CircularIndeterminateRetreatAnimatorDelegate, Float>(cls, "animationFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate.3
            @Override // android.util.Property
            public Float get(CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateRetreatAnimatorDelegate.j());
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate, Float f10) {
                circularIndeterminateRetreatAnimatorDelegate.o(f10.floatValue());
            }
        };
        f27172o = new Property<CircularIndeterminateRetreatAnimatorDelegate, Float>(cls, "completeEndFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate.4
            @Override // android.util.Property
            public Float get(CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateRetreatAnimatorDelegate.k());
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate, Float f10) {
                circularIndeterminateRetreatAnimatorDelegate.p(f10.floatValue());
            }
        };
    }

    public CircularIndeterminateRetreatAnimatorDelegate(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f27177g = 0;
        this.f27180j = null;
        this.f27176f = circularProgressIndicatorSpec;
        this.f27175e = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingStandardInterpolator, f27168k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float j() {
        return this.f27178h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float k() {
        return this.f27179i;
    }

    private void l() {
        if (this.f27173c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<CircularIndeterminateRetreatAnimatorDelegate, Float>) f27171n, 0.0f, 1.0f);
            this.f27173c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f27176f.indeterminateAnimatorDurationScale * 6000.0f));
            this.f27173c.setInterpolator(null);
            this.f27173c.setRepeatCount(-1);
            this.f27173c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate = CircularIndeterminateRetreatAnimatorDelegate.this;
                    circularIndeterminateRetreatAnimatorDelegate.f27177g = (circularIndeterminateRetreatAnimatorDelegate.f27177g + CircularIndeterminateRetreatAnimatorDelegate.f27169l.length) % CircularIndeterminateRetreatAnimatorDelegate.this.f27176f.indicatorColors.length;
                }
            });
        }
        if (this.f27174d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<CircularIndeterminateRetreatAnimatorDelegate, Float>) f27172o, 0.0f, 1.0f);
            this.f27174d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f27176f.indeterminateAnimatorDurationScale * 500.0f));
            this.f27174d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateRetreatAnimatorDelegate.this.cancelAnimatorImmediately();
                    CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate = CircularIndeterminateRetreatAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = circularIndeterminateRetreatAnimatorDelegate.f27180j;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(circularIndeterminateRetreatAnimatorDelegate.f27227a);
                    }
                }
            });
        }
    }

    private void m(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f27169l;
            if (i11 >= iArr.length) {
                return;
            }
            float fA = a(i10, iArr[i11], 100);
            if (fA >= 0.0f && fA <= 1.0f) {
                int i12 = i11 + this.f27177g;
                int[] iArr2 = this.f27176f.indicatorColors;
                int length = i12 % iArr2.length;
                int length2 = (length + 1) % iArr2.length;
                int i13 = iArr2[length];
                int i14 = iArr2[length2];
                ((DrawingDelegate.ActiveIndicator) this.f27228b.get(0)).f27217c = ArgbEvaluatorCompat.getInstance().evaluate(this.f27175e.getInterpolation(fA), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(float f10) {
        this.f27179i = f10;
    }

    private void q() {
        l();
        this.f27173c.setDuration((long) (this.f27176f.indeterminateAnimatorDurationScale * 6000.0f));
        this.f27174d.setDuration((long) (this.f27176f.indeterminateAnimatorDurationScale * 500.0f));
    }

    private void r(int i10) {
        DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) this.f27228b.get(0);
        float f10 = this.f27178h * 1080.0f;
        float interpolation = 0.0f;
        for (int i11 : f27169l) {
            interpolation += this.f27175e.getInterpolation(a(i10, i11, 500)) * 90.0f;
        }
        activeIndicator.f27221g = f10 + interpolation;
        float interpolation2 = this.f27175e.getInterpolation(a(i10, 0, 3000)) - this.f27175e.getInterpolation(a(i10, 3000, 3000));
        activeIndicator.f27215a = 0.0f;
        float[] fArr = f27170m;
        float fLerp = MathUtils.lerp(fArr[0], fArr[1], interpolation2);
        activeIndicator.f27216b = fLerp;
        float f11 = this.f27179i;
        if (f11 > 0.0f) {
            activeIndicator.f27216b = fLerp * (1.0f - f11);
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.f27173c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        q();
        n();
    }

    void n() {
        this.f27177g = 0;
        ((DrawingDelegate.ActiveIndicator) this.f27228b.get(0)).f27217c = this.f27176f.indicatorColors[0];
        this.f27179i = 0.0f;
    }

    void o(float f10) {
        this.f27178h = f10;
        int i10 = (int) (f10 * 6000.0f);
        r(i10);
        m(i10);
        this.f27227a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f27180j = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.f27174d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f27227a.isVisible()) {
            this.f27174d.start();
        } else {
            cancelAnimatorImmediately();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void startAnimator() {
        l();
        n();
        this.f27173c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.f27180j = null;
    }
}
