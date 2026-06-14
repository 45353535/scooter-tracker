package com.google.android.material.progressindicator;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ScatterMapKt;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes9.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private static final FloatPropertyCompat D = new FloatPropertyCompat<DeterminateDrawable<?>>("indicatorLevel") { // from class: com.google.android.material.progressindicator.DeterminateDrawable.1
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(DeterminateDrawable<?> determinateDrawable) {
            return determinateDrawable.y() * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(DeterminateDrawable<?> determinateDrawable, float f10) {
            determinateDrawable.E(f10 / 10000.0f);
            determinateDrawable.A((int) f10);
        }
    };
    private TimeInterpolator A;
    private TimeInterpolator B;
    private TimeInterpolator C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private DrawingDelegate f27183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SpringForce f27184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final SpringAnimation f27185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final DrawingDelegate.ActiveIndicator f27186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f27187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f27188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ValueAnimator f27189y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ValueAnimator f27190z;

    DeterminateDrawable(Context context, final BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.f27188x = false;
        C(drawingDelegate);
        DrawingDelegate.ActiveIndicator activeIndicator = new DrawingDelegate.ActiveIndicator();
        this.f27186v = activeIndicator;
        activeIndicator.f27222h = true;
        SpringForce springForce = new SpringForce();
        this.f27184t = springForce;
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, (FloatPropertyCompat<DeterminateDrawable<S>>) D);
        this.f27185u = springAnimation;
        springAnimation.setSpring(springForce);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f27189y = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.progressindicator.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DeterminateDrawable.p(this.f27265b, baseProgressIndicatorSpec, valueAnimator2);
            }
        });
        if (baseProgressIndicatorSpec.hasWavyEffect(true) && baseProgressIndicatorSpec.waveSpeed != 0) {
            valueAnimator.start();
        }
        l(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(int i10) {
        if (this.f27193c.hasWavyEffect(true)) {
            z();
            float fW = w(i10);
            if (fW == this.f27187w) {
                if (this.f27190z.isRunning()) {
                    return;
                }
                B(fW);
                return;
            }
            if (this.f27190z.isRunning()) {
                this.f27190z.cancel();
            }
            this.f27187w = fW;
            if (fW == 1.0f) {
                this.A = this.B;
                this.f27190z.start();
            } else {
                this.A = this.C;
                this.f27190z.reverse();
            }
        }
    }

    private void B(float f10) {
        this.f27186v.f27219e = f10;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(float f10) {
        this.f27186v.f27216b = f10;
        invalidateSelf();
    }

    @NonNull
    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return u(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    @NonNull
    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return v(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    public static /* synthetic */ void p(DeterminateDrawable determinateDrawable, BaseProgressIndicatorSpec baseProgressIndicatorSpec, ValueAnimator valueAnimator) {
        determinateDrawable.getClass();
        if (baseProgressIndicatorSpec.hasWavyEffect(true) && baseProgressIndicatorSpec.waveSpeed != 0 && determinateDrawable.isVisible()) {
            determinateDrawable.invalidateSelf();
        }
    }

    static DeterminateDrawable u(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, CircularDrawingDelegate circularDrawingDelegate) {
        return new DeterminateDrawable(context, circularProgressIndicatorSpec, circularDrawingDelegate);
    }

    static DeterminateDrawable v(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, LinearDrawingDelegate linearDrawingDelegate) {
        return new DeterminateDrawable(context, linearProgressIndicatorSpec, linearDrawingDelegate);
    }

    private float w(int i10) {
        float f10 = i10;
        return (f10 < 1000.0f || f10 > 9000.0f) ? 0.0f : 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float y() {
        return this.f27186v.f27216b;
    }

    private void z() {
        if (this.f27190z != null) {
            return;
        }
        Context context = this.f27192b;
        int i10 = R.attr.motionEasingStandardInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        this.B = MotionUtils.resolveThemeInterpolator(context, i10, timeInterpolator);
        this.C = MotionUtils.resolveThemeInterpolator(this.f27192b, R.attr.motionEasingEmphasizedAccelerateInterpolator, timeInterpolator);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f27190z = valueAnimator;
        valueAnimator.setDuration(500L);
        this.f27190z.setFloatValues(0.0f, 1.0f);
        this.f27190z.setInterpolator(null);
        this.f27190z.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.progressindicator.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DeterminateDrawable determinateDrawable = this.f27264b;
                determinateDrawable.f27186v.f27219e = determinateDrawable.A.getInterpolation(determinateDrawable.f27190z.getAnimatedFraction());
            }
        });
    }

    void C(DrawingDelegate drawingDelegate) {
        this.f27183s = drawingDelegate;
    }

    void D(boolean z10) {
        if (z10 && !this.f27189y.isRunning()) {
            this.f27189y.start();
        } else {
            if (z10 || !this.f27189y.isRunning()) {
                return;
            }
            this.f27189y.cancel();
        }
    }

    void F(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    public void addSpringAnimationEndListener(@NonNull DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        this.f27185u.addEndListener(onAnimationEndListener);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f27207q)) {
            canvas.save();
            this.f27183s.h(canvas, getBounds(), h(), isShowing(), isHiding());
            this.f27186v.f27220f = i();
            this.f27205o.setStyle(Paint.Style.FILL);
            this.f27205o.setAntiAlias(true);
            DrawingDelegate.ActiveIndicator activeIndicator = this.f27186v;
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27193c;
            activeIndicator.f27217c = baseProgressIndicatorSpec.indicatorColors[0];
            int iClamp = baseProgressIndicatorSpec.indicatorTrackGapSize;
            if (iClamp > 0) {
                if (!(this.f27183s instanceof LinearDrawingDelegate)) {
                    iClamp = (int) ((iClamp * MathUtils.clamp(y(), 0.0f, 0.01f)) / 0.01f);
                }
                this.f27183s.d(canvas, this.f27205o, y(), 1.0f, this.f27193c.trackColor, getAlpha(), iClamp);
            } else {
                this.f27183s.d(canvas, this.f27205o, 0.0f, 1.0f, baseProgressIndicatorSpec.trackColor, getAlpha(), 0);
            }
            this.f27183s.c(canvas, this.f27205o, this.f27186v, getAlpha());
            this.f27183s.b(canvas, this.f27205o, this.f27193c.indicatorColors[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f27183s.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f27183s.f();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f27185u.skipToEnd();
        E(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    boolean o(boolean z10, boolean z11, boolean z12) {
        boolean zO = super.o(z10, z11, z12);
        float systemAnimatorDurationScale = this.f27194d.getSystemAnimatorDurationScale(this.f27192b.getContentResolver());
        if (systemAnimatorDurationScale == 0.0f) {
            this.f27188x = true;
            return zO;
        }
        this.f27188x = false;
        this.f27184t.setStiffness(50.0f / systemAnimatorDurationScale);
        return zO;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        float fW = w(i10);
        if (!this.f27188x) {
            this.f27185u.setStartValue(y() * 10000.0f);
            this.f27185u.animateToFinalPosition(i10);
            return true;
        }
        this.f27185u.skipToEnd();
        E(i10 / 10000.0f);
        B(fW);
        return true;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    public void removeSpringAnimationEndListener(@NonNull DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        this.f27185u.removeEndListener(onAnimationEndListener);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    DrawingDelegate x() {
        return this.f27183s;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11, boolean z12) {
        return super.setVisible(z10, z11, z12);
    }
}
