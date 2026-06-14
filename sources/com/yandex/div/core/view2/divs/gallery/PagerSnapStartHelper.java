package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/PagerSnapStartHelper;", "Landroidx/recyclerview/widget/PagerSnapHelper;", "", "itemSpacing", "<init>", "(I)V", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/OrientationHelper;", "getVerticalHelper", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/OrientationHelper;", "getHorizontalHelper", "Landroid/view/View;", "targetView", "helper", "distanceToCenter", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;Landroidx/recyclerview/widget/OrientationHelper;)I", "manager", "velocityX", "velocityY", "findTargetSnapPosition", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;II)I", "", "calculateDistanceToFinalSnap", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)[I", "I", "getItemSpacing", "()I", "setItemSpacing", "_verticalHelper", "Landroidx/recyclerview/widget/OrientationHelper;", "_horizontalHelper", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PagerSnapStartHelper extends PagerSnapHelper {

    @Nullable
    private OrientationHelper _horizontalHelper;

    @Nullable
    private OrientationHelper _verticalHelper;
    private int itemSpacing;

    public PagerSnapStartHelper(int i10) {
        this.itemSpacing = i10;
    }

    private final int distanceToCenter(RecyclerView.LayoutManager layoutManager, View targetView, OrientationHelper helper) {
        float y10;
        int height;
        if (layoutManager.canScrollHorizontally()) {
            y10 = targetView.getX();
            height = targetView.getWidth() / 2;
        } else {
            y10 = targetView.getY();
            height = targetView.getHeight() / 2;
        }
        return ((int) (y10 + height)) - (layoutManager.getClipToPadding() ? helper.getStartAfterPadding() + (helper.getTotalSpace() / 2) : helper.getEnd() / 2);
    }

    private final OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this._horizontalHelper;
        if (orientationHelper != null) {
            if (!Intrinsics.areEqual(orientationHelper.getLayoutManager(), layoutManager)) {
                orientationHelper = null;
            }
            if (orientationHelper != null) {
                return orientationHelper;
            }
        }
        OrientationHelper orientationHelperCreateHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        this._horizontalHelper = orientationHelperCreateHorizontalHelper;
        return orientationHelperCreateHorizontalHelper;
    }

    private final OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this._verticalHelper;
        if (orientationHelper != null) {
            if (!Intrinsics.areEqual(orientationHelper.getLayoutManager(), layoutManager)) {
                orientationHelper = null;
            }
            if (orientationHelper != null) {
                return orientationHelper;
            }
        }
        OrientationHelper orientationHelperCreateVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        this._verticalHelper = orientationHelperCreateVerticalHelper;
        return orientationHelperCreateVerticalHelper;
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    @NotNull
    public int[] calculateDistanceToFinalSnap(@NotNull RecyclerView.LayoutManager layoutManager, @NotNull View targetView) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(layoutManager, targetView, getHorizontalHelper(layoutManager));
            return iArr;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(layoutManager, targetView, getVerticalHelper(layoutManager));
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(@NotNull RecyclerView.LayoutManager manager, int velocityX, int velocityY) {
        Intrinsics.checkNotNull(manager, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper");
        DivGalleryItemHelper divGalleryItemHelper = (DivGalleryItemHelper) manager;
        if (divGalleryItemHelper.getLayoutManagerOrientation() != 0) {
            velocityX = velocityY;
        } else if (manager.getLayoutDirection() != 0) {
            velocityX = -velocityX;
        }
        int iFirstCompletelyVisibleItemPosition = velocityX < 0 ? divGalleryItemHelper.firstCompletelyVisibleItemPosition() : divGalleryItemHelper.lastCompletelyVisibleItemPosition();
        if (iFirstCompletelyVisibleItemPosition != -1) {
            return iFirstCompletelyVisibleItemPosition;
        }
        int iFirstVisibleItemPosition = divGalleryItemHelper.firstVisibleItemPosition();
        int iLastVisibleItemPosition = divGalleryItemHelper.lastVisibleItemPosition();
        if (iLastVisibleItemPosition == iFirstVisibleItemPosition) {
            if (iLastVisibleItemPosition == -1) {
                return 0;
            }
        } else if (velocityX < 0) {
            return iFirstVisibleItemPosition;
        }
        return iLastVisibleItemPosition;
    }

    public final void setItemSpacing(int i10) {
        this.itemSpacing = i10;
    }
}
