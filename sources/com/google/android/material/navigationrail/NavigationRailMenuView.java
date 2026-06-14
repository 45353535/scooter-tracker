package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f27097c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f27098d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final FrameLayout.LayoutParams f27099e0;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.f27097c0 = -1;
        this.f27098d0 = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f27099e0 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int p(int i10, int i11, int i12) {
        int iMax = i11 / Math.max(1, i12);
        int size = this.f27097c0;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i10);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    private int q(View view, int i10, int i11) {
        view.measure(i10, i11);
        if (view.getVisibility() != 8) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int r(int i10, int i11, int i12, View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 0);
        int childCount = getChildCount();
        int iQ = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (!(childAt instanceof NavigationBarItemView)) {
                int iQ2 = q(childAt, i10, iMakeMeasureSpec);
                i11 -= iQ2;
                iQ += iQ2;
            }
        }
        int iP = view == null ? p(i10, Math.max(i11, 0), i12) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() == 0) {
                i14++;
            }
            if ((childAt2 instanceof NavigationBarItemView) && childAt2 != view) {
                iQ += q(childAt2, i10, iP);
            }
        }
        return iQ + (Math.max(0, i14 - 1) * this.f27098d0);
    }

    private int s(int i10, int i11, int i12) {
        int iQ;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            iQ = q(childAt, i10, p(i10, i11, i12));
            i11 -= iQ;
            i12--;
        } else {
            iQ = 0;
        }
        return iQ + r(i10, i11, i12, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    protected NavigationBarItemView e(Context context) {
        return new NavigationRailItemView(context);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.f27097c0;
    }

    @Px
    public int getItemSpacing() {
        return this.f27098d0;
    }

    int getMenuGravity() {
        return this.f27099e0.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = 0;
        int measuredHeight = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                measuredHeight += childAt.getMeasuredHeight();
                i15++;
            }
        }
        int iMax = i15 <= 1 ? 0 : Math.max(0, Math.min((getMeasuredHeight() - measuredHeight) / (i15 - 1), this.f27098d0));
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight2 = childAt2.getMeasuredHeight();
                childAt2.layout(0, i17, i14, measuredHeight2 + i17);
                i17 += measuredHeight2 + iMax;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSizeAndState((currentVisibleContentItemCount <= 1 || !h(getLabelVisibilityMode(), currentVisibleContentItemCount)) ? r(i10, size, currentVisibleContentItemCount, null) : s(i10, size, currentVisibleContentItemCount), i11, 0));
    }

    public void setItemMinimumHeight(@Px int i10) {
        if (this.f27097c0 != i10) {
            this.f27097c0 = i10;
            requestLayout();
        }
    }

    public void setItemSpacing(@Px int i10) {
        if (this.f27098d0 != i10) {
            this.f27098d0 = i10;
            requestLayout();
        }
    }

    void setMenuGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = this.f27099e0;
        if (layoutParams.gravity != i10) {
            layoutParams.gravity = i10;
            setLayoutParams(layoutParams);
        }
    }
}
