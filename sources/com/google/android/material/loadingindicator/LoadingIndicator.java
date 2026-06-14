package com.google.android.material.loadingindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f26886d = R.style.Widget_Material3_LoadingIndicator;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LoadingIndicatorDrawable f26887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LoadingIndicatorSpec f26888c;

    public LoadingIndicator(@NonNull Context context) {
        this(context, null);
    }

    boolean a() {
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

    boolean b() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && a();
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @ColorInt
    public int getContainerColor() {
        return this.f26888c.f26921f;
    }

    @Px
    public int getContainerHeight() {
        return this.f26888c.f26919d;
    }

    @Px
    public int getContainerWidth() {
        return this.f26888c.f26918c;
    }

    @NonNull
    public LoadingIndicatorDrawable getDrawable() {
        return this.f26887b;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f26888c.f26920e;
    }

    @Px
    public int getIndicatorSize() {
        return this.f26888c.f26917b;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        this.f26887b.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        LoadingIndicatorDrawingDelegate loadingIndicatorDrawingDelegateB = this.f26887b.b();
        int iE = loadingIndicatorDrawingDelegateB.e() + getPaddingLeft() + getPaddingRight();
        int iD = loadingIndicatorDrawingDelegateB.d() + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(size, iE), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(iE, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, iD), 1073741824);
        } else if (mode2 == 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(iD, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f26887b.setBounds(0, 0, i10, i11);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.f26887b.setVisible(b(), false, i10 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f26887b.setVisible(b(), false, i10 == 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.f26887b.f26900b = animatorDurationScaleProvider;
    }

    public void setContainerColor(@ColorInt int i10) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f26888c;
        if (loadingIndicatorSpec.f26921f != i10) {
            loadingIndicatorSpec.f26921f = i10;
            invalidate();
        }
    }

    public void setContainerHeight(@Px int i10) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f26888c;
        if (loadingIndicatorSpec.f26919d != i10) {
            loadingIndicatorSpec.f26919d = i10;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(@Px int i10) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f26888c;
        if (loadingIndicatorSpec.f26918c != i10) {
            loadingIndicatorSpec.f26918c = i10;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.getColor(getContext(), androidx.appcompat.R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f26888c.f26920e = iArr;
        this.f26887b.a().h();
        invalidate();
    }

    public void setIndicatorSize(@Px int i10) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f26888c;
        if (loadingIndicatorSpec.f26917b != i10) {
            loadingIndicatorSpec.f26917b = i10;
            requestLayout();
            invalidate();
        }
    }

    public LoadingIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.loadingIndicatorStyle);
    }

    public LoadingIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, f26886d), attributeSet, i10);
        Context context2 = getContext();
        LoadingIndicatorDrawable loadingIndicatorDrawableCreate = LoadingIndicatorDrawable.create(context2, new LoadingIndicatorSpec(context2, attributeSet, i10));
        this.f26887b = loadingIndicatorDrawableCreate;
        loadingIndicatorDrawableCreate.setCallback(this);
        this.f26888c = loadingIndicatorDrawableCreate.b().f26910a;
        setAnimatorDurationScaleProvider(new AnimatorDurationScaleProvider());
    }
}
