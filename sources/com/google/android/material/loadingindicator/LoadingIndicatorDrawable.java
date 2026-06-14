package com.google.android.material.loadingindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.material.R;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes9.dex */
public final class LoadingIndicatorDrawable extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f26901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LoadingIndicatorSpec f26902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LoadingIndicatorDrawingDelegate f26903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LoadingIndicatorAnimatorDelegate f26904f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f26906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f26907i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    AnimatorDurationScaleProvider f26900b = new AnimatorDurationScaleProvider();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Paint f26905g = new Paint();

    LoadingIndicatorDrawable(Context context, LoadingIndicatorSpec loadingIndicatorSpec, LoadingIndicatorDrawingDelegate loadingIndicatorDrawingDelegate, LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
        this.f26901c = context;
        this.f26902d = loadingIndicatorSpec;
        this.f26903e = loadingIndicatorDrawingDelegate;
        this.f26904f = loadingIndicatorAnimatorDelegate;
        loadingIndicatorAnimatorDelegate.j(this);
        setAlpha(255);
    }

    private boolean c() {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f26900b;
        return animatorDurationScaleProvider != null && animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.f26901c.getContentResolver()) == 0.0f;
    }

    @NonNull
    public static LoadingIndicatorDrawable create(@NonNull Context context, @NonNull LoadingIndicatorSpec loadingIndicatorSpec) {
        LoadingIndicatorDrawable loadingIndicatorDrawable = new LoadingIndicatorDrawable(context, loadingIndicatorSpec, new LoadingIndicatorDrawingDelegate(loadingIndicatorSpec), new LoadingIndicatorAnimatorDelegate(loadingIndicatorSpec));
        loadingIndicatorDrawable.setStaticDummyDrawable(VectorDrawableCompat.create(context.getResources(), R.drawable.ic_mtrl_arrow_circle, null));
        return loadingIndicatorDrawable;
    }

    LoadingIndicatorAnimatorDelegate a() {
        return this.f26904f;
    }

    LoadingIndicatorDrawingDelegate b() {
        return this.f26903e;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (c() && (drawable = this.f26907i) != null) {
                drawable.setBounds(bounds);
                this.f26907i.setTint(this.f26902d.f26920e[0]);
                this.f26907i.draw(canvas);
            } else {
                canvas.save();
                this.f26903e.a(canvas, bounds);
                this.f26903e.b(canvas, this.f26905g, this.f26902d.f26921f, getAlpha());
                this.f26903e.c(canvas, this.f26905g, this.f26904f.f26898h, getAlpha());
                canvas.restore();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f26906h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f26903e.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26903e.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Drawable getStaticDummyDrawable() {
        return this.f26907i;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f26906h != i10) {
            this.f26906h = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f26905g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setStaticDummyDrawable(@Nullable Drawable drawable) {
        this.f26907i = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    @CanIgnoreReturnValue
    public boolean setVisible(boolean z10, boolean z11) {
        return setVisible(z10, z11, z10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @CanIgnoreReturnValue
    public boolean setVisible(boolean z10, boolean z11, boolean z12) {
        boolean visible = super.setVisible(z10, z11);
        this.f26904f.e();
        if (z10 && z12 && !c()) {
            this.f26904f.n();
        }
        return visible;
    }
}
