package com.my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class j2 extends LinearSnapHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59935b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OrientationHelper f59940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OrientationHelper f59941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f59942i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59936c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f59937d = 60.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59938e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f59939f = -1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecelerateInterpolator f59934a = new DecelerateInterpolator(1.7f);

    public class a extends LinearSmoothScroller {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 60.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForDeceleration(int i10) {
            return (int) Math.ceil(((double) calculateTimeForScrolling(i10)) / 0.3d);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            RecyclerView recyclerView = j2.this.f59942i;
            if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                return;
            }
            j2 j2Var = j2.this;
            int[] iArrCalculateDistanceToFinalSnap = j2Var.calculateDistanceToFinalSnap(j2Var.f59942i.getLayoutManager(), view);
            int i10 = iArrCalculateDistanceToFinalSnap[0];
            int i11 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                action.update(i10, i11, iCalculateTimeForDeceleration, j2.this.f59934a);
            }
        }
    }

    public j2(int i10) {
        this.f59935b = i10;
    }

    public void a(int i10, Boolean bool) {
        if (this.f59935b != i10) {
            this.f59935b = i10;
            a(bool);
        }
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            this.f59942i = recyclerView;
        } else {
            this.f59942i = null;
        }
        try {
            super.attachToRecyclerView(recyclerView);
        } catch (Throwable unused) {
        }
    }

    public void b(int i10) {
        RecyclerView recyclerView;
        RecyclerView.SmoothScroller smoothScrollerCreateScroller;
        if (i10 == -1 || (recyclerView = this.f59942i) == null || recyclerView.getLayoutManager() == null || (smoothScrollerCreateScroller = createScroller(this.f59942i.getLayoutManager())) == null) {
            return;
        }
        smoothScrollerCreateScroller.setTargetPosition(i10);
        this.f59942i.getLayoutManager().startSmoothScroll(smoothScrollerCreateScroller);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int i10 = this.f59935b;
        if (i10 == 17) {
            return super.calculateDistanceToFinalSnap(layoutManager, view);
        }
        int[] iArr = new int[2];
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return iArr;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (i10 == 8388611) {
            iArr[0] = b(view, getHorizontalHelper(linearLayoutManager));
            return iArr;
        }
        iArr[0] = a(view, getHorizontalHelper(linearLayoutManager));
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateScrollDistance(int i10, int i11) {
        return super.calculateScrollDistance(i10, i11);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (recyclerView = this.f59942i) == null) {
            return null;
        }
        return new a(recyclerView.getContext());
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return a(layoutManager, true);
    }

    public final OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f59941h;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f59941h = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f59941h;
    }

    public final OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f59940g;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f59940g = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f59940g;
    }

    public void a(int i10) {
        a(i10, Boolean.TRUE);
    }

    public final View a(RecyclerView.LayoutManager layoutManager, boolean z10) {
        int i10 = this.f59935b;
        if (i10 == 17) {
            return a(layoutManager, getHorizontalHelper(layoutManager), 17, z10);
        }
        if (i10 == 48) {
            return a(layoutManager, getVerticalHelper(layoutManager), GravityCompat.START, z10);
        }
        if (i10 == 80) {
            return a(layoutManager, getVerticalHelper(layoutManager), GravityCompat.END, z10);
        }
        if (i10 == 8388611) {
            return a(layoutManager, getHorizontalHelper(layoutManager), GravityCompat.START, z10);
        }
        if (i10 != 8388613) {
            return null;
        }
        return a(layoutManager, getHorizontalHelper(layoutManager), GravityCompat.END, z10);
    }

    public final int b(View view, OrientationHelper orientationHelper) {
        int decoratedStart = orientationHelper.getDecoratedStart(view);
        return decoratedStart >= orientationHelper.getStartAfterPadding() / 2 ? decoratedStart - orientationHelper.getStartAfterPadding() : decoratedStart;
    }

    public final void a(Boolean bool) {
        RecyclerView.LayoutManager layoutManager;
        View viewA;
        RecyclerView recyclerView = this.f59942i;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || (viewA = a((layoutManager = this.f59942i.getLayoutManager()), false)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewA);
        if (bool.booleanValue()) {
            this.f59942i.smoothScrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
        } else {
            this.f59942i.scrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
        }
    }

    public final int a(View view, OrientationHelper orientationHelper) {
        int decoratedEnd = orientationHelper.getDecoratedEnd(view);
        if (decoratedEnd >= orientationHelper.getEnd() - ((orientationHelper.getEnd() - orientationHelper.getEndAfterPadding()) / 2)) {
            return orientationHelper.getDecoratedEnd(view) - orientationHelper.getEnd();
        }
        return decoratedEnd - orientationHelper.getEndAfterPadding();
    }

    public final View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i10, boolean z10) {
        int end;
        int iAbs;
        View view = null;
        if (layoutManager.getChildCount() != 0 && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (z10 && a(linearLayoutManager)) {
                return null;
            }
            if (layoutManager.getClipToPadding()) {
                end = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
            } else {
                end = orientationHelper.getEnd() / 2;
            }
            boolean z11 = i10 == 8388611;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < linearLayoutManager.getChildCount(); i12++) {
                View childAt = linearLayoutManager.getChildAt(i12);
                if (z11) {
                    iAbs = Math.abs(orientationHelper.getDecoratedStart(childAt));
                } else {
                    iAbs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - end);
                }
                if (iAbs < i11) {
                    view = childAt;
                    i11 = iAbs;
                }
            }
        }
        return view;
    }

    public final boolean a(LinearLayoutManager linearLayoutManager) {
        return ((linearLayoutManager.getReverseLayout() || this.f59935b != 8388611) && !(linearLayoutManager.getReverseLayout() && this.f59935b == 8388613) && ((linearLayoutManager.getReverseLayout() || this.f59935b != 48) && !(linearLayoutManager.getReverseLayout() && this.f59935b == 80))) ? this.f59935b == 17 ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 || linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 : linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 : linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }
}
