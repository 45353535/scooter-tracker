package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.material.R;
import com.google.android.material.progressindicator.DrawingDelegate;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
final class LinearIndeterminateDisjointAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f27250k = {533, 567, 850, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f27251l = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Property f27252m = new Property<LinearIndeterminateDisjointAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.3
        @Override // android.util.Property
        public Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.h());
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f10) {
            linearIndeterminateDisjointAnimatorDelegate.l(f10.floatValue());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f27253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f27254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Interpolator[] f27255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BaseProgressIndicatorSpec f27256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f27259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Animatable2Compat.AnimationCallback f27260j;

    public LinearIndeterminateDisjointAnimatorDelegate(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f27257g = 0;
        this.f27260j = null;
        this.f27256f = linearProgressIndicatorSpec;
        this.f27255e = new Interpolator[]{AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float h() {
        return this.f27259i;
    }

    private void i() {
        if (this.f27253c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateDisjointAnimatorDelegate, Float>) f27252m, 0.0f, 1.0f);
            this.f27253c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f27256f.indeterminateAnimatorDurationScale * 1800.0f));
            this.f27253c.setInterpolator(null);
            this.f27253c.setRepeatCount(-1);
            this.f27253c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    linearIndeterminateDisjointAnimatorDelegate.f27257g = (linearIndeterminateDisjointAnimatorDelegate.f27257g + 1) % LinearIndeterminateDisjointAnimatorDelegate.this.f27256f.indicatorColors.length;
                    LinearIndeterminateDisjointAnimatorDelegate.this.f27258h = true;
                }
            });
        }
        if (this.f27254d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateDisjointAnimatorDelegate, Float>) f27252m, 1.0f);
            this.f27254d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f27256f.indeterminateAnimatorDurationScale * 1800.0f));
            this.f27254d.setInterpolator(null);
            this.f27254d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LinearIndeterminateDisjointAnimatorDelegate.this.cancelAnimatorImmediately();
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = linearIndeterminateDisjointAnimatorDelegate.f27260j;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(linearIndeterminateDisjointAnimatorDelegate.f27227a);
                    }
                }
            });
        }
    }

    private void j() {
        if (this.f27258h) {
            Iterator it = this.f27228b.iterator();
            while (it.hasNext()) {
                ((DrawingDelegate.ActiveIndicator) it.next()).f27217c = this.f27256f.indicatorColors[this.f27257g];
            }
            this.f27258h = false;
        }
    }

    private void m() {
        i();
        this.f27253c.setDuration((long) (this.f27256f.indeterminateAnimatorDurationScale * 1800.0f));
        this.f27254d.setDuration((long) (this.f27256f.indeterminateAnimatorDurationScale * 1800.0f));
    }

    private void n(int i10) {
        for (int i11 = 0; i11 < this.f27228b.size(); i11++) {
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) this.f27228b.get(i11);
            int[] iArr = f27251l;
            int i12 = i11 * 2;
            int i13 = iArr[i12];
            int[] iArr2 = f27250k;
            activeIndicator.f27215a = MathUtils.clamp(this.f27255e[i12].getInterpolation(a(i10, i13, iArr2[i12])), 0.0f, 1.0f);
            int i14 = i12 + 1;
            activeIndicator.f27216b = MathUtils.clamp(this.f27255e[i14].getInterpolation(a(i10, iArr[i14], iArr2[i14])), 0.0f, 1.0f);
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.f27253c;
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
        this.f27257g = 0;
        Iterator it = this.f27228b.iterator();
        while (it.hasNext()) {
            ((DrawingDelegate.ActiveIndicator) it.next()).f27217c = this.f27256f.indicatorColors[0];
        }
    }

    void l(float f10) {
        this.f27259i = f10;
        n((int) (f10 * 1800.0f));
        j();
        this.f27227a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f27260j = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.f27254d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        cancelAnimatorImmediately();
        if (this.f27227a.isVisible()) {
            this.f27254d.setFloatValues(this.f27259i, 1.0f);
            this.f27254d.setDuration((long) ((1.0f - this.f27259i) * 1800.0f));
            this.f27254d.start();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        i();
        k();
        this.f27253c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.f27260j = null;
    }
}
