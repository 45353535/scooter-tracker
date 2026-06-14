package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26768e;

    public FlowLayout(@NonNull Context context) {
        this(context, null);
    }

    private static int a(int i10, int i11, int i12) {
        return i11 != Integer.MIN_VALUE ? i11 != 1073741824 ? i12 : i10 : Math.min(i12, i10);
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        this.f26765b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.f26766c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_horizontalItemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected int getItemSpacing() {
        return this.f26766c;
    }

    protected int getLineSpacing() {
        return this.f26765b;
    }

    protected int getRowCount() {
        return this.f26768e;
    }

    public int getRowIndex(@NonNull View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean isSingleLine() {
        return this.f26767d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int marginEnd;
        int marginStart;
        boolean z11;
        if (getChildCount() == 0) {
            this.f26768e = 0;
            return;
        }
        boolean z12 = true;
        this.f26768e = 1;
        boolean z13 = getLayoutDirection() == 1;
        int paddingRight = z13 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z13 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = 0;
        int measuredWidth = paddingRight;
        int i15 = paddingTop;
        while (i14 < getChildCount()) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z11 = z12;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = measuredWidth + marginStart + childAt.getMeasuredWidth();
                int i16 = i12 - i10;
                int i17 = i16 - paddingLeft;
                z11 = z12;
                if (!this.f26767d && measuredWidth2 > i17) {
                    measuredWidth2 = paddingRight + marginStart + childAt.getMeasuredWidth();
                    i15 = paddingTop + this.f26765b;
                    this.f26768e++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f26768e - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z13) {
                    childAt.layout(i16 - measuredWidth2, i15, (i16 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i15, measuredWidth2, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.f26766c;
                paddingTop = measuredHeight;
            }
            i14++;
            z12 = z11;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i18 = paddingLeft2;
                if (paddingLeft2 + i12 + childAt.getMeasuredWidth() <= paddingRight || isSingleLine()) {
                    paddingLeft = i18;
                } else {
                    paddingLeft = getPaddingLeft();
                    i15 = this.f26765b + paddingTop;
                }
                int measuredWidth = paddingLeft + i12 + childAt.getMeasuredWidth();
                int measuredHeight = i15 + childAt.getMeasuredHeight();
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i12 + i13 + childAt.getMeasuredWidth() + this.f26766c;
                if (i17 == getChildCount() - 1) {
                    i16 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i16 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i10) {
        this.f26766c = i10;
    }

    protected void setLineSpacing(int i10) {
        this.f26765b = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f26767d = z10;
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26767d = false;
        b(context, attributeSet);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f26767d = false;
        b(context, attributeSet);
    }
}
