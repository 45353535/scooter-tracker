package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FadeThroughDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f26758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f26759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f26760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f26761d;

    private static class EmptyDrawable extends Drawable {
        private EmptyDrawable() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }

    public FadeThroughDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        Drawable drawableMutate = drawable != null ? drawable.getConstantState().newDrawable().mutate() : new EmptyDrawable();
        this.f26758a = drawableMutate;
        Drawable drawableMutate2 = drawable2 != null ? drawable2.getConstantState().newDrawable().mutate() : new EmptyDrawable();
        this.f26759b = drawableMutate2;
        int layoutDirection = drawable != null ? DrawableCompat.getLayoutDirection(drawable) : 3;
        int layoutDirection2 = drawable2 != null ? DrawableCompat.getLayoutDirection(drawable2) : 3;
        DrawableCompat.setLayoutDirection(drawableMutate, layoutDirection);
        DrawableCompat.setLayoutDirection(drawableMutate2, layoutDirection2);
        drawableMutate2.setAlpha(0);
        this.f26760c = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f26758a.draw(canvas);
        this.f26759b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f26758a.getIntrinsicHeight(), this.f26759b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f26758a.getIntrinsicWidth(), this.f26759b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f26758a.getMinimumHeight(), this.f26759b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f26758a.getMinimumWidth(), this.f26759b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f26758a.isStateful() || this.f26759b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f26761d <= 0.5f) {
            this.f26758a.setAlpha(i10);
            this.f26759b.setAlpha(0);
        } else {
            this.f26758a.setAlpha(0);
            this.f26759b.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f26758a.setBounds(i10, i11, i12, i13);
        this.f26759b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f26758a.setColorFilter(colorFilter);
        this.f26759b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        if (this.f26761d != f10) {
            this.f26761d = f10;
            FadeThroughUtils.a(f10, this.f26760c);
            this.f26758a.setAlpha((int) (this.f26760c[0] * 255.0f));
            this.f26759b.setAlpha((int) (this.f26760c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f26758a.setState(iArr) || this.f26759b.setState(iArr);
    }
}
