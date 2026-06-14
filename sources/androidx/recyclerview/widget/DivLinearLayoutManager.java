package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.core.view2.divs.gallery.ScrollPosition;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.HashSet;
import k8.td;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J7\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J7\u0010%\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010 J\u001b\u0010(\u001a\u00020\u00172\n\u0010'\u001a\u00060&R\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010'\u001a\u00060&R\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00172\u0006\u00100\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\u00172\u0006\u00100\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u00102J7\u00105\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010 J\u000f\u00106\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\tH\u0016¢\u0006\u0004\b9\u00107J\u000f\u0010:\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u00107J\u0019\u0010;\u001a\u0004\u0018\u00010\u00132\u0006\u00100\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u00107J\u000f\u0010@\u001a\u00020\tH\u0016¢\u0006\u0004\b@\u00107J\u001f\u0010C\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\t2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ'\u0010F\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010K\u001a\u00020J2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bK\u0010LJ#\u0010Q\u001a\u00020H2\b\u0010N\u001a\u0004\u0018\u00010M2\b\u0010P\u001a\u0004\u0018\u00010OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0019\u0010Q\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bQ\u0010TJ\u000f\u0010U\u001a\u00020HH\u0016¢\u0006\u0004\bU\u0010VR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010]\u001a\u0004\b^\u0010_R*\u0010b\u001a\u0012\u0012\u0004\u0012\u00020\u00130`j\b\u0012\u0004\u0012\u00020\u0013`a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006g"}, d2 = {"Landroidx/recyclerview/widget/DivLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Landroidx/recyclerview/widget/RecyclerView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lk8/td;", "div", "", "orientation", "<init>", "(Lcom/yandex/div/core/view2/BindingContext;Landroidx/recyclerview/widget/RecyclerView;Lk8/td;I)V", C4240b4.i.L, "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "getItemDiv", "(I)Lcom/yandex/div/internal/core/DivItemBuilderResult;", "toLayoutManager", "()Landroidx/recyclerview/widget/DivLinearLayoutManager;", "Landroid/view/View;", "child", "widthUsed", "heightUsed", "", "measureChild", "(Landroid/view/View;II)V", "measureChildWithMargins", "left", "top", "right", "bottom", "layoutDecorated", "(Landroid/view/View;IIII)V", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "onLayoutCompleted", "(Landroidx/recyclerview/widget/RecyclerView$State;)V", "layoutDecoratedWithMargins", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "recycler", "removeAndRecycleAllViews", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V", "onAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromWindow", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$Recycler;)V", "detachView", "(Landroid/view/View;)V", FirebaseAnalytics.Param.INDEX, "detachViewAt", "(I)V", "removeView", "removeViewAt", "superLayoutDecoratedWithMargins", "firstCompletelyVisibleItemPosition", "()I", "lastCompletelyVisibleItemPosition", "firstVisibleItemPosition", "lastVisibleItemPosition", "_getChildAt", "(I)Landroid/view/View;", "_getPosition", "(Landroid/view/View;)I", "width", "getLayoutManagerOrientation", "Lcom/yandex/div/core/view2/divs/gallery/ScrollPosition;", "scrollPosition", "instantScrollToPosition", "(ILcom/yandex/div/core/view2/divs/gallery/ScrollPosition;)V", "offset", "instantScrollToPositionWithOffset", "(IILcom/yandex/div/core/view2/divs/gallery/ScrollPosition;)V", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "lp", "", "checkLayoutParams", "(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z", "Landroid/content/Context;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Landroid/util/AttributeSet;", "attrs", "generateLayoutParams", "(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "generateDefaultLayoutParams", "()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "Landroidx/recyclerview/widget/RecyclerView;", "getView", "()Landroidx/recyclerview/widget/RecyclerView;", "Lk8/td;", "getDiv", "()Lk8/td;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "childrenToRelayout", "Ljava/util/HashSet;", "getChildrenToRelayout", "()Ljava/util/HashSet;", "DivRecyclerViewLayoutParams", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivLinearLayoutManager extends LinearLayoutManager implements DivGalleryItemHelper {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final HashSet<View> childrenToRelayout;

    @NotNull
    private final td div;

    @NotNull
    private final RecyclerView view;

    public /* synthetic */ DivLinearLayoutManager(BindingContext bindingContext, RecyclerView recyclerView, td tdVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bindingContext, recyclerView, tdVar, (i11 & 8) != 0 ? 0 : i10);
    }

    public /* bridge */ /* synthetic */ void _detachView(@NotNull View view) {
        DivGalleryItemHelper.CC.a(this, view);
    }

    public /* bridge */ /* synthetic */ void _detachViewAt(int i10) {
        DivGalleryItemHelper.CC.b(this, i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @Nullable
    public View _getChildAt(int index) {
        return getChildAt(index);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int _getPosition(@NotNull View child) {
        return getPosition(child);
    }

    public /* bridge */ /* synthetic */ void _layoutDecorated(@NotNull View view, int i10, int i11, int i12, int i13) {
        DivGalleryItemHelper.CC.c(this, view, i10, i11, i12, i13);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _layoutDecoratedWithMargins(@NotNull View view, int i10, int i11, int i12, int i13, boolean z10) {
        DivGalleryItemHelper.CC.d(this, view, i10, i11, i12, i13, z10);
    }

    public /* bridge */ /* synthetic */ void _onAttachedToWindow(@NotNull RecyclerView recyclerView) {
        DivGalleryItemHelper.CC.e(this, recyclerView);
    }

    public /* bridge */ /* synthetic */ void _onDetachedFromWindow(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.Recycler recycler) {
        DivGalleryItemHelper.CC.f(this, recyclerView, recycler);
    }

    public /* bridge */ /* synthetic */ void _onLayoutCompleted(@Nullable RecyclerView.State state) {
        DivGalleryItemHelper.CC.g(this, state);
    }

    public /* bridge */ /* synthetic */ void _removeAndRecycleAllViews(@NotNull RecyclerView.Recycler recycler) {
        DivGalleryItemHelper.CC.h(this, recycler);
    }

    public /* bridge */ /* synthetic */ void _removeView(@NotNull View view) {
        DivGalleryItemHelper.CC.i(this, view);
    }

    public /* bridge */ /* synthetic */ void _removeViewAt(int i10) {
        DivGalleryItemHelper.CC.j(this, i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ int calcScrollOffset(@NotNull View view) {
        return DivGalleryItemHelper.CC.k(this, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(@Nullable RecyclerView.LayoutParams lp) {
        return lp instanceof DivRecyclerViewLayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachView(@NotNull View child) {
        super.detachView(child);
        _detachView(child);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachViewAt(int index) {
        super.detachViewAt(index);
        _detachViewAt(index);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstCompletelyVisibleItemPosition() {
        return findFirstCompletelyVisibleItemPosition();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstVisibleItemPosition() {
        return findFirstVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new DivRecyclerViewLayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public RecyclerView.LayoutParams generateLayoutParams(@Nullable Context c10, @Nullable AttributeSet attrs) {
        return new DivRecyclerViewLayoutParams(c10, attrs);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    public /* bridge */ /* synthetic */ int getChildMeasureSpec(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        return DivGalleryItemHelper.CC.l(this, i10, i11, i12, i13, i14, z10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public td getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @Nullable
    public DivItemBuilderResult getItemDiv(int position) {
        RecyclerView.Adapter adapter = getView().getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
        return (DivItemBuilderResult) CollectionsKt.getOrNull(((DivGalleryAdapter) adapter).getVisibleItems(), position);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int getLayoutManagerOrientation() {
        return getOrientation();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public RecyclerView getView() {
        return this.view;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void instantScroll(int i10, @NotNull ScrollPosition scrollPosition, int i11) {
        DivGalleryItemHelper.CC.m(this, i10, scrollPosition, i11);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPosition(int position, @NotNull ScrollPosition scrollPosition) {
        DivGalleryItemHelper.CC.t(this, position, scrollPosition, 0, 4, null);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPositionWithOffset(int position, int offset, @NotNull ScrollPosition scrollPosition) {
        instantScroll(position, scrollPosition, offset);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastCompletelyVisibleItemPosition() {
        return findLastCompletelyVisibleItemPosition();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastVisibleItemPosition() {
        return findLastVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void layoutDecorated(@NotNull View child, int left, int top, int right, int bottom) {
        super.layoutDecorated(child, left, top, right, bottom);
        _layoutDecorated(child, left, top, right, bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void layoutDecoratedWithMargins(@NotNull View child, int left, int top, int right, int bottom) {
        DivGalleryItemHelper.CC.q(this, child, left, top, right, bottom, false, 32, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChild(@NotNull View child, int widthUsed, int heightUsed) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        DivRecyclerViewLayoutParams divRecyclerViewLayoutParams = (DivRecyclerViewLayoutParams) layoutParams;
        Rect itemDecorInsetsForChild = getView().getItemDecorInsetsForChild(child);
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + widthUsed + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).width, divRecyclerViewLayoutParams.getMaxWidth(), canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + heightUsed + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom, ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).height, divRecyclerViewLayoutParams.getMaxHeight(), canScrollVertically());
        if (shouldMeasureChild(child, childMeasureSpec, childMeasureSpec2, divRecyclerViewLayoutParams)) {
            child.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NotNull View child, int widthUsed, int heightUsed) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        DivRecyclerViewLayoutParams divRecyclerViewLayoutParams = (DivRecyclerViewLayoutParams) layoutParams;
        Rect itemDecorInsetsForChild = getView().getItemDecorInsetsForChild(child);
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).rightMargin + widthUsed + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).width, divRecyclerViewLayoutParams.getMaxWidth(), canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).topMargin + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).bottomMargin + heightUsed + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom, ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).height, divRecyclerViewLayoutParams.getMaxHeight(), canScrollVertically());
        if (shouldMeasureChild(child, childMeasureSpec, childMeasureSpec2, divRecyclerViewLayoutParams)) {
            child.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(@NotNull RecyclerView view) {
        super.onAttachedToWindow(view);
        _onAttachedToWindow(view);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(@NotNull RecyclerView view, @NotNull RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(view, recycler);
        _onDetachedFromWindow(view, recycler);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(@Nullable RecyclerView.State state) {
        _onLayoutCompleted(state);
        super.onLayoutCompleted(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeAndRecycleAllViews(@NotNull RecyclerView.Recycler recycler) {
        _removeAndRecycleAllViews(recycler);
        super.removeAndRecycleAllViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeView(@NotNull View child) {
        super.removeView(child);
        _removeView(child);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeViewAt(int index) {
        super.removeViewAt(index);
        _removeViewAt(index);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void superLayoutDecoratedWithMargins(@NotNull View child, int left, int top, int right, int bottom) {
        super.layoutDecoratedWithMargins(child, left, top, right, bottom);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public DivLinearLayoutManager toLayoutManager() {
        return this;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void trackVisibilityAction(@NotNull View view, boolean z10) {
        DivGalleryItemHelper.CC.n(this, view, z10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int width() {
        return getWidth();
    }

    public DivLinearLayoutManager(@NotNull BindingContext bindingContext, @NotNull RecyclerView recyclerView, @NotNull td tdVar, int i10) {
        super(recyclerView.getContext(), i10, false);
        this.bindingContext = bindingContext;
        this.view = recyclerView;
        this.div = tdVar;
        this.childrenToRelayout = new HashSet<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public RecyclerView.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams lp) {
        return lp instanceof DivRecyclerViewLayoutParams ? new DivRecyclerViewLayoutParams((DivRecyclerViewLayoutParams) lp) : lp instanceof RecyclerView.LayoutParams ? new DivRecyclerViewLayoutParams((RecyclerView.LayoutParams) lp) : lp instanceof DivLayoutParams ? new DivRecyclerViewLayoutParams((DivLayoutParams) lp) : lp instanceof ViewGroup.MarginLayoutParams ? new DivRecyclerViewLayoutParams((ViewGroup.MarginLayoutParams) lp) : new DivRecyclerViewLayoutParams(lp);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public HashSet<View> getChildrenToRelayout() {
        return this.childrenToRelayout;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nB\u0011\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB\u0011\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB\u0011\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0010B\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0002\u0010\u0011B\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/recyclerview/widget/DivLinearLayoutManager$DivRecyclerViewLayoutParams;", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "width", "", "height", "(II)V", "source", "Landroid/view/ViewGroup$MarginLayoutParams;", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)V", "(Landroidx/recyclerview/widget/DivLinearLayoutManager$DivRecyclerViewLayoutParams;)V", "Lcom/yandex/div/internal/widget/DivLayoutParams;", "(Lcom/yandex/div/internal/widget/DivLayoutParams;)V", "maxHeight", "getMaxHeight", "()I", "setMaxHeight", "(I)V", "maxWidth", "getMaxWidth", "setMaxWidth", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DivRecyclerViewLayoutParams extends RecyclerView.LayoutParams {
        private int maxHeight;
        private int maxWidth;

        public DivRecyclerViewLayoutParams(@Nullable Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
        }

        public final int getMaxHeight() {
            return this.maxHeight;
        }

        public final int getMaxWidth() {
            return this.maxWidth;
        }

        public final void setMaxHeight(int i10) {
            this.maxHeight = i10;
        }

        public final void setMaxWidth(int i10) {
            this.maxWidth = i10;
        }

        public DivRecyclerViewLayoutParams(int i10, int i11) {
            super(i10, i11);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@Nullable ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@Nullable RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@NotNull DivRecyclerViewLayoutParams divRecyclerViewLayoutParams) {
            super((RecyclerView.LayoutParams) divRecyclerViewLayoutParams);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
            this.maxHeight = divRecyclerViewLayoutParams.maxHeight;
            this.maxWidth = divRecyclerViewLayoutParams.maxWidth;
        }

        public DivRecyclerViewLayoutParams(@NotNull DivLayoutParams divLayoutParams) {
            super((ViewGroup.MarginLayoutParams) divLayoutParams);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
            this.maxHeight = divLayoutParams.getMaxHeight();
            this.maxWidth = divLayoutParams.getMaxWidth();
        }
    }
}
