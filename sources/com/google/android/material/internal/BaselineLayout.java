package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public class BaselineLayout extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26680c;

    public BaselineLayout(Context context) {
        super(context, null, 0);
        this.f26679b = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f26679b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i12 - i10) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f26679b == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f26679b + paddingTop) - childAt.getBaseline();
                childAt.layout(i15, baseline, measuredWidth + i15, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        int iMax = 0;
        int paddingBottom = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        int iMax3 = -1;
        int iMax4 = -1;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    iMax3 = Math.max(iMax3, baseline);
                    iMax4 = Math.max(iMax4, childAt.getMeasuredHeight() - baseline);
                }
                iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                paddingBottom = Math.max(paddingBottom, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        if (iMax3 != -1) {
            if (this.f26680c) {
                paddingBottom = Math.max(paddingBottom, Math.max(iMax4, getPaddingBottom()) + iMax3);
            }
            this.f26679b = iMax3;
        }
        if (!this.f26680c) {
            paddingBottom = iMax + getPaddingBottom();
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax2, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean z10) {
        this.f26680c = z10;
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f26679b = -1;
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26679b = -1;
    }
}
