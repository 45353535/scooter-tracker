package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f26769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f26770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f26771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f26773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f26774g;

    public ForegroundLinearLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f26769b;
        if (drawable != null) {
            if (this.f26774g) {
                this.f26774g = false;
                Rect rect = this.f26770c;
                Rect rect2 = this.f26771d;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f26773f) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f26772e, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f26769b;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f26769b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f26769b.setState(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f26769b;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f26772e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f26769b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f26774g = z10 | this.f26774g;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f26774g = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f26769b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f26769b);
            }
            this.f26769b = drawable;
            this.f26774g = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f26772e == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f26772e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= GravityCompat.START;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f26772e = i10;
            if (i10 == 119 && this.f26769b != null) {
                this.f26769b.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f26769b;
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26770c = new Rect();
        this.f26771d = new Rect();
        this.f26772e = 119;
        this.f26773f = true;
        this.f26774g = false;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.ForegroundLinearLayout, i10, 0, new int[0]);
        this.f26772e = typedArrayObtainStyledAttributes.getInt(R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.f26772e);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f26773f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
