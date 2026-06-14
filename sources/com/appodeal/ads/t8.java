package com.appodeal.ads;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class t8 extends va {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14873e;

    public t8(Activity activity, boolean z10) {
        super(activity);
        this.f14873e = z10;
    }

    @Override // com.appodeal.ads.va
    public final boolean b() {
        return !this.f14873e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        if (childCount == 0) {
            super.onMeasure(i10, i11);
            return;
        }
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            if (this.f14873e) {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
            } else {
                measureChild(childAt, iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, 0));
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
            }
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + iMax, getPaddingBottom() + getPaddingTop() + iMax2);
    }
}
