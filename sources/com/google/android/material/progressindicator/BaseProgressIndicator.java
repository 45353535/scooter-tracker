package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {
    public static final int HIDE_ESCAPE = 3;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f27121q = R.style.Widget_MaterialComponents_ProgressIndicator;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    BaseProgressIndicatorSpec f27122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f27126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f27127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f27128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    AnimatorDurationScaleProvider f27129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f27132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f27133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f27134n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Animatable2Compat.AnimationCallback f27135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Animatable2Compat.AnimationCallback f27136p;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface HideAnimationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ShowAnimationBehavior {
    }

    protected BaseProgressIndicator(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, f27121q), attributeSet, i10);
        this.f27128h = -1L;
        this.f27130j = false;
        this.f27131k = 4;
        this.f27133m = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                BaseProgressIndicator.this.k();
            }
        };
        this.f27134n = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.2
            @Override // java.lang.Runnable
            public void run() {
                BaseProgressIndicator.this.j();
                BaseProgressIndicator.this.f27128h = -1L;
            }
        };
        this.f27135o = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.3
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                BaseProgressIndicator.this.setIndeterminate(false);
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setProgressCompat(baseProgressIndicator.f27123c, BaseProgressIndicator.this.f27124d);
            }
        };
        this.f27136p = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.4
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                if (BaseProgressIndicator.this.f27130j) {
                    return;
                }
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.f27131k);
            }
        };
        Context context2 = getContext();
        this.f27122b = i(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.BaseProgressIndicator, i10, i11, new int[0]);
        this.f27126f = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_showDelay, -1);
        this.f27127g = Math.min(typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.f27129i = new AnimatorDurationScaleProvider();
        this.f27125e = true;
    }

    @Nullable
    private DrawingDelegate<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().s();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f27127g > 0) {
            this.f27128h = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean m() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    private void n() {
        o();
        if (getProgressDrawable() != null) {
            getProgressDrawable().registerAnimationCallback(this.f27136p);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(this.f27136p);
        }
    }

    private void p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(this.f27136p);
            getIndeterminateDrawable().r().unregisterAnimatorsCompleteCallback();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(this.f27136p);
        }
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f27122b.hideAnimationBehavior;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f27122b.indicatorColors;
    }

    @Px
    public int getIndicatorTrackGapSize() {
        return this.f27122b.indicatorTrackGapSize;
    }

    public int getShowAnimationBehavior() {
        return this.f27122b.showAnimationBehavior;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f27122b.trackColor;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.f27122b.trackCornerRadius;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f27122b.trackCornerRadiusFraction;
    }

    @Px
    public int getTrackThickness() {
        return this.f27122b.trackThickness;
    }

    @Px
    public int getWaveAmplitude() {
        return this.f27122b.waveAmplitude;
    }

    @Px
    public int getWaveSpeed() {
        return this.f27122b.waveSpeed;
    }

    @Px
    public int getWavelengthDeterminate() {
        return this.f27122b.wavelengthDeterminate;
    }

    @Px
    public int getWavelengthIndeterminate() {
        return this.f27122b.wavelengthIndeterminate;
    }

    protected void h(boolean z10) {
        if (this.f27125e) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(q(), false, z10);
        }
    }

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f27133m);
            return;
        }
        removeCallbacks(this.f27134n);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f27128h;
        int i10 = this.f27127g;
        if (jUptimeMillis >= i10) {
            this.f27134n.run();
        } else {
            postDelayed(this.f27134n, ((long) i10) - jUptimeMillis);
        }
    }

    abstract BaseProgressIndicatorSpec i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    void o() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().r().registerAnimatorsCompleteCallback(this.f27135o);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (q()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f27134n);
        removeCallbacks(this.f27133m);
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).hideNow();
        p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        try {
            DrawingDelegate<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        h(i10 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        h(false);
    }

    boolean q() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && l();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.f27129i = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f27194d = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f27194d = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f27122b.hideAnimationBehavior = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange != null) {
                drawableWithAnimatedVisibilityChange.hideNow();
            }
            super.setIndeterminate(z10);
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange2 != null) {
                drawableWithAnimatedVisibilityChange2.setVisible(q(), false, false);
            }
            if ((drawableWithAnimatedVisibilityChange2 instanceof IndeterminateDrawable) && q()) {
                ((IndeterminateDrawable) drawableWithAnimatedVisibilityChange2).r().startAnimator();
            }
            this.f27130j = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setIndeterminateAnimatorDurationScale(@FloatRange(from = 0.10000000149011612d, to = 10.0d) float f10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (baseProgressIndicatorSpec.indeterminateAnimatorDurationScale != f10) {
            baseProgressIndicatorSpec.indeterminateAnimatorDurationScale = f10;
            getIndeterminateDrawable().r().invalidateSpecValues();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable instanceof IndeterminateDrawable) {
            ((DrawableWithAnimatedVisibilityChange) drawable).hideNow();
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.f27132l) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.getColor(getContext(), androidx.appcompat.R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f27122b.indicatorColors = iArr;
        getIndeterminateDrawable().r().invalidateSpecValues();
        invalidate();
    }

    public void setIndicatorTrackGapSize(@Px int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (baseProgressIndicatorSpec.indicatorTrackGapSize != i10) {
            baseProgressIndicatorSpec.indicatorTrackGapSize = i10;
            baseProgressIndicatorSpec.c();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i10, false);
    }

    public void setProgressCompat(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f27123c = i10;
            this.f27124d = z10;
            this.f27130j = true;
            if (!getIndeterminateDrawable().isVisible() || this.f27129i.getSystemAnimatorDurationScale(getContext().getContentResolver()) == 0.0f) {
                this.f27135o.onAnimationEnd(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().r().requestCancelAnimatorAfterCurrentCycle();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (!(drawable instanceof DeterminateDrawable)) {
            if (this.f27132l) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.hideNow();
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.F(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f27122b.showAnimationBehavior = i10;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (baseProgressIndicatorSpec.trackColor != i10) {
            baseProgressIndicatorSpec.trackColor = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (baseProgressIndicatorSpec.trackCornerRadius != i10) {
            baseProgressIndicatorSpec.trackCornerRadius = Math.min(i10, baseProgressIndicatorSpec.trackThickness / 2);
            this.f27122b.useRelativeTrackCornerRadius = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(@FloatRange(from = 0.0d, to = 0.5d) float f10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (baseProgressIndicatorSpec.trackCornerRadiusFraction != f10) {
            baseProgressIndicatorSpec.trackCornerRadiusFraction = Math.min(f10, 0.5f);
            this.f27122b.useRelativeTrackCornerRadius = true;
            invalidate();
        }
    }

    public void setTrackThickness(@Px int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (baseProgressIndicatorSpec.trackThickness != i10) {
            baseProgressIndicatorSpec.trackThickness = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f27131k = i10;
    }

    public void setWaveAmplitude(@Px int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (baseProgressIndicatorSpec.waveAmplitude != i10) {
            baseProgressIndicatorSpec.waveAmplitude = Math.abs(i10);
            requestLayout();
        }
    }

    public void setWaveSpeed(@Px int i10) {
        this.f27122b.waveSpeed = i10;
        getProgressDrawable().D(this.f27122b.waveSpeed != 0);
    }

    public void setWavelength(@Px int i10) {
        setWavelengthDeterminate(i10);
        setWavelengthIndeterminate(i10);
    }

    public void setWavelengthDeterminate(@Px int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (baseProgressIndicatorSpec.wavelengthDeterminate != i10) {
            baseProgressIndicatorSpec.wavelengthDeterminate = Math.abs(i10);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(@Px int i10) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27122b;
        if (baseProgressIndicatorSpec.wavelengthIndeterminate != i10) {
            baseProgressIndicatorSpec.wavelengthIndeterminate = Math.abs(i10);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public void show() {
        if (this.f27126f <= 0) {
            this.f27133m.run();
        } else {
            removeCallbacks(this.f27133m);
            postDelayed(this.f27133m, this.f27126f);
        }
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
