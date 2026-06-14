package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RippleDrawableCompat extends Drawable implements Shapeable, TintAwareDrawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RippleDrawableCompatState f27287b;

    static final class RippleDrawableCompatState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        MaterialShapeDrawable f27288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f27289b;

        public RippleDrawableCompatState(MaterialShapeDrawable materialShapeDrawable) {
            this.f27288a = materialShapeDrawable;
            this.f27289b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public RippleDrawableCompat newDrawable() {
            return new RippleDrawableCompat(new RippleDrawableCompatState(this));
        }

        public RippleDrawableCompatState(@NonNull RippleDrawableCompatState rippleDrawableCompatState) {
            this.f27288a = (MaterialShapeDrawable) rippleDrawableCompatState.f27288a.getConstantState().newDrawable();
            this.f27289b = rippleDrawableCompatState.f27289b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.f27287b;
        if (rippleDrawableCompatState.f27289b) {
            rippleDrawableCompatState.f27288a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f27287b;
    }

    @Nullable
    public SpringForce getCornerSpringForce() {
        return this.f27287b.f27288a.getCornerSpringForce();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f27287b.f27288a.getOpacity();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f27287b.f27288a.getShapeAppearanceModel();
    }

    @Nullable
    public StateListShapeAppearanceModel getStateListShapeAppearanceModel() {
        return this.f27287b.f27288a.getStateListShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f27287b.f27288a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f27287b.f27288a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zShouldDrawRippleCompat = RippleUtils.shouldDrawRippleCompat(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.f27287b;
        if (rippleDrawableCompatState.f27289b == zShouldDrawRippleCompat) {
            return zOnStateChange;
        }
        rippleDrawableCompatState.f27289b = zShouldDrawRippleCompat;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f27287b.f27288a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f27287b.f27288a.setColorFilter(colorFilter);
    }

    public void setCornerSpringForce(@NonNull SpringForce springForce) {
        this.f27287b.f27288a.setCornerSpringForce(springForce);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f27287b.f27288a.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setStateListShapeAppearanceModel(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.f27287b.f27288a.setStateListShapeAppearanceModel(stateListShapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i10) {
        this.f27287b.f27288a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f27287b.f27288a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f27287b.f27288a.setTintMode(mode);
    }

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        this(new RippleDrawableCompatState(new MaterialShapeDrawable(shapeAppearanceModel)));
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public RippleDrawableCompat mutate() {
        this.f27287b = new RippleDrawableCompatState(this.f27287b);
        return this;
    }

    private RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState) {
        this.f27287b = rippleDrawableCompatState;
    }
}
