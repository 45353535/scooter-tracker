package com.google.android.material.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScaledDrawableWrapper extends DrawableWrapperCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScaledDrawableWrapperState f26505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26506c;

    public ScaledDrawableWrapper(@NonNull Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f26505b = new ScaledDrawableWrapperState(a(drawable), i10, i11);
    }

    private Drawable.ConstantState a(Drawable drawable) {
        if (drawable != null) {
            return drawable.getConstantState();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        if (this.f26505b.d()) {
            return this.f26505b;
        }
        return null;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f26505b.f26509c;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26505b.f26508b;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f26506c && super.mutate() == this) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.mutate();
            }
            this.f26505b = new ScaledDrawableWrapperState(a(drawable), this.f26505b.f26508b, this.f26505b.f26509c);
            this.f26506c = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public void setDrawable(@Nullable Drawable drawable) {
        super.setDrawable(drawable);
        ScaledDrawableWrapperState scaledDrawableWrapperState = this.f26505b;
        if (scaledDrawableWrapperState != null) {
            scaledDrawableWrapperState.f26507a = a(drawable);
            this.f26506c = false;
        }
    }

    private static final class ScaledDrawableWrapperState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable.ConstantState f26507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f26509c;

        ScaledDrawableWrapperState(Drawable.ConstantState constantState, int i10, int i11) {
            this.f26507a = constantState;
            this.f26508b = i10;
            this.f26509c = i11;
        }

        boolean d() {
            return this.f26507a != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f26507a;
            if (constantState != null) {
                return constantState.getChangingConfigurations();
            }
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new ScaledDrawableWrapper(this.f26507a.newDrawable(), this.f26508b, this.f26509c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(@Nullable Resources resources) {
            return new ScaledDrawableWrapper(this.f26507a.newDrawable(resources), this.f26508b, this.f26509c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(@Nullable Resources resources, @Nullable Resources.Theme theme) {
            return new ScaledDrawableWrapper(this.f26507a.newDrawable(resources, theme), this.f26508b, this.f26509c);
        }
    }
}
