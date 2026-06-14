package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f26486g = R.style.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaterialShapeDrawable f26487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26491f;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f26489d;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f26491f;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f26490e;
    }

    public int getDividerThickness() {
        return this.f26488c;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.f26491f : this.f26490e;
        if (z10) {
            width = getWidth();
            i10 = this.f26490e;
        } else {
            width = getWidth();
            i10 = this.f26491f;
        }
        this.f26487b.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f26487b.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f26488c;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i10) {
        if (this.f26489d != i10) {
            this.f26489d = i10;
            this.f26487b.setFillColor(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i10) {
        setDividerColor(ContextCompat.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.f26491f = i10;
    }

    public void setDividerInsetEndResource(@DimenRes int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(@Px int i10) {
        this.f26490e = i10;
    }

    public void setDividerInsetStartResource(@DimenRes int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(@Px int i10) {
        if (this.f26488c != i10) {
            this.f26488c = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f26486g;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f26487b = new MaterialShapeDrawable();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialDivider, i10, i11, new int[0]);
        this.f26488c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f26490e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f26491f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
