package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends SnapHelper {
    private RecyclerView lnr;
    private OrientationHelper qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private OrientationHelper f17127ud;

    private OrientationHelper ud(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f17127ud;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f17127ud = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f17127ud;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        this.lnr = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @NonNull
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = {0, 0};
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = qdl(view, ud(layoutManager));
            return iArr;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = qdl(view, qdl(layoutManager));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.lnr.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.qdl.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected int calculateTimeForScrolling(int i10) {
                    return Math.min(100, super.calculateTimeForScrolling(i10));
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    qdl qdlVar = qdl.this;
                    int[] iArrCalculateDistanceToFinalSnap = qdlVar.calculateDistanceToFinalSnap(qdlVar.lnr.getLayoutManager(), view);
                    int i10 = iArrCalculateDistanceToFinalSnap[0];
                    int i11 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
                    if (iCalculateTimeForDeceleration > 0) {
                        action.update(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(@NonNull RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
            return null;
        }
        OrientationHelper orientationHelperQdl = qdl(layoutManager);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayoutManager.getChildAt(i11);
            int iAbs = Math.abs(orientationHelperQdl.getDecoratedStart(childAt));
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        View viewFindSnapView = findSnapView(layoutManager);
        int i12 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = layoutManager.getPosition(viewFindSnapView);
        if (layoutManager.canScrollVertically()) {
            i12 = i11 < 0 ? position - 1 : position + 1;
        }
        return Math.min(layoutManager.getItemCount() - 1, Math.max(i12, 0));
    }

    private int qdl(View view, @NonNull OrientationHelper orientationHelper) {
        int decoratedStart = orientationHelper.getDecoratedStart(view);
        return decoratedStart >= orientationHelper.getStartAfterPadding() / 2 ? decoratedStart - orientationHelper.getStartAfterPadding() : decoratedStart;
    }

    private OrientationHelper qdl(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.qdl;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.qdl = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.qdl;
    }
}
