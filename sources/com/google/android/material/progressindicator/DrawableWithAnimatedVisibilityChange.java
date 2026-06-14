package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ScatterMapKt;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Property f27191r = new Property<DrawableWithAnimatedVisibilityChange, Float>(Float.class, "growFraction") { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.3
        @Override // android.util.Property
        public Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.h());
        }

        @Override // android.util.Property
        public void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f10) {
            drawableWithAnimatedVisibilityChange.l(f10.floatValue());
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f27192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final BaseProgressIndicatorSpec f27193c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ValueAnimator f27195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ValueAnimator f27196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f27199i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f27201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animatable2Compat.AnimationCallback f27202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f27204n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27206p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f27200j = -1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Paint f27205o = new Paint();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Rect f27207q = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    AnimatorDurationScaleProvider f27194d = new AnimatorDurationScaleProvider();

    DrawableWithAnimatedVisibilityChange(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.f27192b = context;
        this.f27193c = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    private void d(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f27203m;
        this.f27203m = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f27203m = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Animatable2Compat.AnimationCallback animationCallback = this.f27202l;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(this);
        }
        List list = this.f27201k;
        if (list == null || this.f27203m) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Animatable2Compat.AnimationCallback) it.next()).onAnimationEnd(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Animatable2Compat.AnimationCallback animationCallback = this.f27202l;
        if (animationCallback != null) {
            animationCallback.onAnimationStart(this);
        }
        List list = this.f27201k;
        if (list == null || this.f27203m) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Animatable2Compat.AnimationCallback) it.next()).onAnimationStart(this);
        }
    }

    private void g(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f27203m;
        this.f27203m = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f27203m = z10;
    }

    private boolean j() {
        return this instanceof DeterminateDrawable;
    }

    private void k() {
        if (this.f27195e == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<DrawableWithAnimatedVisibilityChange, Float>) f27191r, 0.0f, 1.0f);
            this.f27195e = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f27195e.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            n(this.f27195e);
        }
        if (this.f27196f == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<DrawableWithAnimatedVisibilityChange, Float>) f27191r, 1.0f, 0.0f);
            this.f27196f = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f27196f.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            m(this.f27196f);
        }
    }

    private void m(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f27196f;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f27196f = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                DrawableWithAnimatedVisibilityChange.this.e();
            }
        });
    }

    private void n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f27195e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f27195e = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                DrawableWithAnimatedVisibilityChange.this.f();
            }
        });
    }

    public void clearAnimationCallbacks() {
        this.f27201k.clear();
        this.f27201k = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f27206p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    float h() {
        if (this.f27193c.isShowAnimationEnabled() || this.f27193c.isHideAnimationEnabled()) {
            return (this.f27198h || this.f27197g) ? this.f27199i : this.f27204n;
        }
        return 1.0f;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    float i() {
        float f10 = this.f27200j;
        if (f10 > 0.0f) {
            return f10;
        }
        if (this.f27193c.hasWavyEffect(j()) && this.f27193c.waveSpeed != 0) {
            float systemAnimatorDurationScale = this.f27194d.getSystemAnimatorDurationScale(this.f27192b.getContentResolver());
            if (systemAnimatorDurationScale > 0.0f) {
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) r0)) / ((int) ((((j() ? this.f27193c.wavelengthDeterminate : this.f27193c.wavelengthIndeterminate) * 1000.0f) / this.f27193c.waveSpeed) * systemAnimatorDurationScale));
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.f27196f;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f27198h;
    }

    public boolean isRunning() {
        return isShowing() || isHiding();
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.f27195e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f27197g;
    }

    void l(float f10) {
        if (this.f27204n != f10) {
            this.f27204n = f10;
            invalidateSelf();
        }
    }

    boolean o(boolean z10, boolean z11, boolean z12) {
        k();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f27195e : this.f27196f;
        ValueAnimator valueAnimator2 = z10 ? this.f27196f : this.f27195e;
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z13 = !z10 || super.setVisible(z10, false);
        if (!(z10 ? this.f27193c.isShowAnimationEnabled() : this.f27193c.isHideAnimationEnabled())) {
            g(valueAnimator);
            return z13;
        }
        if (z11 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z13;
        }
        valueAnimator.resume();
        return z13;
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (this.f27201k == null) {
            this.f27201k = new ArrayList();
        }
        if (this.f27201k.contains(animationCallback)) {
            return;
        }
        this.f27201k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        this.f27206p = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f27205o.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return setVisible(z10, z11, true);
    }

    public void start() {
        o(true, true, false);
    }

    public void stop() {
        o(false, true, false);
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f27201k;
        if (list == null || !list.contains(animationCallback)) {
            return false;
        }
        this.f27201k.remove(animationCallback);
        if (!this.f27201k.isEmpty()) {
            return true;
        }
        this.f27201k = null;
        return true;
    }

    public boolean setVisible(boolean z10, boolean z11, boolean z12) {
        return o(z10, z11, z12 && this.f27194d.getSystemAnimatorDurationScale(this.f27192b.getContentResolver()) > 0.0f);
    }
}
