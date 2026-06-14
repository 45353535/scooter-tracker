package com.appodeal.ads;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class vc extends va {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15159f;

    public vc(Context context) {
        super(context);
        this.f15158e = 0;
        this.f15159f = 0;
    }

    @Override // com.appodeal.ads.va, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (this.f15158e == 0 && this.f15159f == 0) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection());
                int i22 = i21 & 112;
                int i23 = this.f15158e;
                if (i23 != 0) {
                    i16 = i23 + paddingLeft;
                    int i24 = (i16 + measuredWidth) - paddingRight;
                    if (i24 > 0) {
                        i16 -= i24;
                    }
                    if (i16 < paddingLeft) {
                        i16 = paddingLeft;
                    }
                } else {
                    int i25 = absoluteGravity & 7;
                    if (i25 == 1) {
                        i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                        i15 = layoutParams.rightMargin;
                    } else if (i25 != 5) {
                        i16 = paddingLeft + layoutParams.leftMargin;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = layoutParams.rightMargin;
                    }
                    i16 = i14 - i15;
                }
                int i26 = this.f15159f;
                if (i26 != 0) {
                    i19 = layoutParams.topMargin + paddingTop + i26;
                    int i27 = (i19 + measuredHeight) - paddingBottom;
                    if (i27 > 0) {
                        i19 -= i27;
                    }
                    if (i19 < paddingTop) {
                        i19 = paddingTop;
                    }
                } else {
                    if (i22 == 16) {
                        i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    } else if (i22 == 48 || i22 != 80) {
                        int i28 = layoutParams.topMargin;
                        i19 = i28 + paddingTop;
                    } else {
                        i17 = paddingBottom - measuredHeight;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
            }
        }
    }
}
