package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: loaded from: classes9.dex */
public class CarouselSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f25851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RecyclerView f25852k;

    public CarouselSnapHelper() {
        this(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] c(RecyclerView.LayoutManager layoutManager, View view, boolean z10) {
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iD = d(view, (CarouselLayoutManager) layoutManager, z10);
        return layoutManager.canScrollHorizontally() ? new int[]{iD, 0} : layoutManager.canScrollVertically() ? new int[]{0, iD} : new int[]{0, 0};
    }

    private int d(View view, CarouselLayoutManager carouselLayoutManager, boolean z10) {
        return carouselLayoutManager.C(carouselLayoutManager.getPosition(view), z10);
    }

    private View e(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0 && (layoutManager instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = layoutManager.getChildAt(i11);
                int iAbs = Math.abs(carouselLayoutManager.C(layoutManager.getPosition(childAt), false));
                if (iAbs < i10) {
                    view = childAt;
                    i10 = iAbs;
                }
            }
        }
        return view;
    }

    private boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        return layoutManager.canScrollHorizontally() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.f25852k = recyclerView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        return c(layoutManager, view, false);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    protected RecyclerView.SmoothScroller createScroller(final RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.f25852k.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f10;
                    float f11;
                    if (layoutManager.canScrollVertically()) {
                        f10 = displayMetrics.densityDpi;
                        f11 = 50.0f;
                    } else {
                        f10 = displayMetrics.densityDpi;
                        f11 = 100.0f;
                    }
                    return f11 / f10;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    if (CarouselSnapHelper.this.f25852k != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] iArrC = carouselSnapHelper.c(carouselSnapHelper.f25852k.getLayoutManager(), view, true);
                        int i10 = iArrC[0];
                        int i11 = iArrC[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
                        if (iCalculateTimeForDeceleration > 0) {
                            action.update(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return e(layoutManager);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        int itemCount;
        if (!this.f25851j || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = layoutManager.getChildAt(i14);
            if (childAt != null) {
                int iD = d(childAt, (CarouselLayoutManager) layoutManager, false);
                if (iD <= 0 && iD > i13) {
                    view2 = childAt;
                    i13 = iD;
                }
                if (iD >= 0 && iD < i12) {
                    view = childAt;
                    i12 = iD;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(layoutManager, i10, i11);
        if (zIsForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (isReverseLayout(layoutManager) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public CarouselSnapHelper(boolean z10) {
        this.f25851j = z10;
    }
}
