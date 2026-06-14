package com.my.target.nativeads.views;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class PromoCardSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f60413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OrientationHelper f60414c;

    public interface a {
        boolean isReachedEnd();

        boolean isReachedStart();
    }

    public PromoCardSnapHelper(int i10, a aVar) {
        this.f60412a = i10;
        this.f60413b = aVar;
    }

    public final boolean a(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        return layoutManager.canScrollHorizontally() ? i10 > 0 : i11 > 0;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @NonNull
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(layoutManager, view, a(layoutManager));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(@NonNull RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (this.f60413b.isReachedStart()) {
            return layoutManager.getChildAt(0);
        }
        if (this.f60413b.isReachedEnd()) {
            return layoutManager.getChildAt(childCount - 1);
        }
        OrientationHelper orientationHelperA = a(layoutManager);
        int startAfterPadding = orientationHelperA.getStartAfterPadding() + (orientationHelperA.getTotalSpace() / 2) + 1;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = layoutManager.getChildAt(i11);
            int iAbs = Math.abs((orientationHelperA.getDecoratedStart(childAt) + (orientationHelperA.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(@NonNull RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        OrientationHelper orientationHelperA = a(layoutManager);
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = layoutManager.getChildAt(i14);
            if (childAt != null) {
                int iA = a(layoutManager, childAt, orientationHelperA);
                if (iA <= 0 && iA > i13) {
                    view2 = childAt;
                    i13 = iA;
                }
                if (iA >= 0 && iA < i12) {
                    view = childAt;
                    i12 = iA;
                }
            }
        }
        boolean zA = a(layoutManager, i10, i11);
        if (zA && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!zA && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (zA) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (!zA ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public final int a(RecyclerView.LayoutManager layoutManager, View view, OrientationHelper orientationHelper) {
        int decoratedStart = (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
        return layoutManager.getPosition(view) == 0 ? decoratedStart - (this.f60412a / 2) : layoutManager.getItemCount() + (-1) == layoutManager.getPosition(view) ? decoratedStart + (this.f60412a / 2) : decoratedStart;
    }

    public final OrientationHelper a(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f60414c;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f60414c = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f60414c;
    }
}
