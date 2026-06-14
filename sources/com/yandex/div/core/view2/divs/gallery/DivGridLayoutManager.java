package com.yandex.div.core.view2.divs.gallery;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import java.util.HashSet;
import k8.ep;
import k8.f7;
import k8.td;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u0017J7\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J7\u0010.\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010%J\u001b\u00101\u001a\u00020#2\n\u00100\u001a\u00060/R\u00020\u0005H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00104J#\u00105\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00052\n\u00100\u001a\u00060/R\u00020\u0005H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020#2\u0006\u00109\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b<\u00108J\u0017\u0010=\u001a\u00020#2\u0006\u00109\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010;J7\u0010>\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b>\u0010%J\u000f\u0010?\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010\u0017J\u000f\u0010@\u001a\u00020\tH\u0016¢\u0006\u0004\b@\u0010\u0017J\u000f\u0010A\u001a\u00020\tH\u0016¢\u0006\u0004\bA\u0010\u0017J\u000f\u0010B\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010\u0017J\u0019\u0010C\u001a\u0004\u0018\u00010\u001d2\u0006\u00109\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\tH\u0016¢\u0006\u0004\bG\u0010\u0017J\u000f\u0010H\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u0010\u0017J\u001f\u0010K\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ'\u0010N\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bN\u0010OR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010XR*\u0010[\u001a\u0012\u0012\u0004\u0012\u00020\u001d0Yj\b\u0012\u0004\u0012\u00020\u001d`Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u0017R\u0014\u0010b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0017¨\u0006c"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Landroidx/recyclerview/widget/RecyclerView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lk8/td;", "div", "", "orientation", "<init>", "(Lcom/yandex/div/core/view2/BindingContext;Landroidx/recyclerview/widget/RecyclerView;Lk8/td;I)V", "alongOrientation", "spacingByOrientation", "(I)I", C4240b4.i.L, "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "getItemDiv", "(I)Lcom/yandex/div/internal/core/DivItemBuilderResult;", "toLayoutManager", "()Lcom/yandex/div/core/view2/divs/gallery/DivGridLayoutManager;", "getPaddingStart", "()I", "getPaddingEnd", "getPaddingLeft", "getPaddingTop", "getPaddingRight", "getPaddingBottom", "Landroid/view/View;", "child", "left", "top", "right", "bottom", "", "layoutDecorated", "(Landroid/view/View;IIII)V", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "onLayoutCompleted", "(Landroidx/recyclerview/widget/RecyclerView$State;)V", "Landroid/graphics/Rect;", "outRect", "calculateItemDecorationsForChild", "(Landroid/view/View;Landroid/graphics/Rect;)V", "layoutDecoratedWithMargins", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "recycler", "removeAndRecycleAllViews", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V", "onAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromWindow", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$Recycler;)V", "detachView", "(Landroid/view/View;)V", FirebaseAnalytics.Param.INDEX, "detachViewAt", "(I)V", "removeView", "removeViewAt", "superLayoutDecoratedWithMargins", "firstCompletelyVisibleItemPosition", "lastCompletelyVisibleItemPosition", "firstVisibleItemPosition", "lastVisibleItemPosition", "_getChildAt", "(I)Landroid/view/View;", "_getPosition", "(Landroid/view/View;)I", "width", "getLayoutManagerOrientation", "Lcom/yandex/div/core/view2/divs/gallery/ScrollPosition;", "scrollPosition", "instantScrollToPosition", "(ILcom/yandex/div/core/view2/divs/gallery/ScrollPosition;)V", "offset", "instantScrollToPositionWithOffset", "(IILcom/yandex/div/core/view2/divs/gallery/ScrollPosition;)V", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "Landroidx/recyclerview/widget/RecyclerView;", "getView", "()Landroidx/recyclerview/widget/RecyclerView;", "Lk8/td;", "getDiv", "()Lk8/td;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "childrenToRelayout", "Ljava/util/HashSet;", "getChildrenToRelayout", "()Ljava/util/HashSet;", "getItemSpacing", "itemSpacing", "getCrossSpacing", "crossSpacing", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements DivGalleryItemHelper {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final HashSet<View> childrenToRelayout;

    @NotNull
    private final td div;

    @NotNull
    private final RecyclerView view;

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGridLayoutManager(@NotNull BindingContext bindingContext, @NotNull RecyclerView recyclerView, @NotNull td tdVar, int i10) {
        int i11;
        Expression expression = tdVar.f91287h;
        if (expression != null) {
            long jLongValue = ((Number) expression.evaluate(bindingContext.getExpressionResolver())).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i11 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i11 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i11 = 1;
        }
        super(i11, i10);
        this.bindingContext = bindingContext;
        this.view = recyclerView;
        this.div = tdVar;
        this.childrenToRelayout = new HashSet<>();
    }

    private final int getCrossSpacing() {
        Expression expression = getDiv().f91290k;
        return expression != null ? BaseDivViewExtensionsKt.dpToPx(Long.valueOf(((Number) expression.evaluate(getBindingContext().getExpressionResolver())).longValue()), getView().getResources().getDisplayMetrics()) : getItemSpacing();
    }

    private final int getItemSpacing() {
        return BaseDivViewExtensionsKt.dpToPx((Long) getDiv().f91299t.evaluate(getBindingContext().getExpressionResolver()), getView().getResources().getDisplayMetrics());
    }

    private final int spacingByOrientation(int alongOrientation) {
        return alongOrientation == getOrientation() ? getItemSpacing() : getCrossSpacing();
    }

    public /* synthetic */ void _detachView(View view) {
        DivGalleryItemHelper.CC.a(this, view);
    }

    public /* synthetic */ void _detachViewAt(int i10) {
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

    public /* synthetic */ void _layoutDecorated(View view, int i10, int i11, int i12, int i13) {
        DivGalleryItemHelper.CC.c(this, view, i10, i11, i12, i13);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* synthetic */ void _layoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13, boolean z10) {
        DivGalleryItemHelper.CC.d(this, view, i10, i11, i12, i13, z10);
    }

    public /* synthetic */ void _onAttachedToWindow(RecyclerView recyclerView) {
        DivGalleryItemHelper.CC.e(this, recyclerView);
    }

    public /* synthetic */ void _onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        DivGalleryItemHelper.CC.f(this, recyclerView, recycler);
    }

    public /* synthetic */ void _onLayoutCompleted(RecyclerView.State state) {
        DivGalleryItemHelper.CC.g(this, state);
    }

    public /* synthetic */ void _removeAndRecycleAllViews(RecyclerView.Recycler recycler) {
        DivGalleryItemHelper.CC.h(this, recycler);
    }

    public /* synthetic */ void _removeView(View view) {
        DivGalleryItemHelper.CC.i(this, view);
    }

    public /* synthetic */ void _removeViewAt(int i10) {
        DivGalleryItemHelper.CC.j(this, i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* synthetic */ int calcScrollOffset(View view) {
        return DivGalleryItemHelper.CC.k(this, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void calculateItemDecorationsForChild(@NotNull View child, @NotNull Rect outRect) {
        DivItemBuilderResult itemDiv;
        super.calculateItemDecorationsForChild(child, outRect);
        int i_getPosition = _getPosition(child);
        if (i_getPosition == -1 || (itemDiv = getItemDiv(i_getPosition)) == null) {
            return;
        }
        f7 f7VarC = itemDiv.getDiv().c();
        boolean z10 = f7VarC.getHeight() instanceof ep.c;
        boolean z11 = f7VarC.getWidth() instanceof ep.c;
        int iSpacingByOrientation = 0;
        boolean z12 = getSpanCount() > 1;
        int iSpacingByOrientation2 = (z10 && z12) ? spacingByOrientation(1) / 2 : 0;
        if (z11 && z12) {
            iSpacingByOrientation = spacingByOrientation(0) / 2;
        }
        outRect.set(outRect.left - iSpacingByOrientation, outRect.top - iSpacingByOrientation2, outRect.right - iSpacingByOrientation, outRect.bottom - iSpacingByOrientation2);
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
        int[] iArr = new int[g.e(getItemCount(), getSpanCount())];
        findFirstCompletelyVisibleItemPositions(iArr);
        return ArraysKt.first(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstVisibleItemPosition() {
        int[] iArr = new int[g.e(getItemCount(), getSpanCount())];
        findFirstVisibleItemPositions(iArr);
        return ArraysKt.first(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public BindingContext getBindingContext() {
        return this.bindingContext;
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

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingBottom() {
        return super.getPaddingBottom() - (spacingByOrientation(1) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingEnd() {
        return super.getPaddingEnd() - (getItemSpacing() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingLeft() {
        return super.getPaddingLeft() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingRight() {
        return super.getPaddingRight() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingStart() {
        return super.getPaddingStart() - (getItemSpacing() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingTop() {
        return super.getPaddingTop() - (spacingByOrientation(1) / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public RecyclerView getView() {
        return this.view;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* synthetic */ void instantScroll(int i10, ScrollPosition scrollPosition, int i11) {
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
        int[] iArr = new int[g.e(getItemCount(), getSpanCount())];
        findLastCompletelyVisibleItemPositions(iArr);
        return ArraysKt.last(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastVisibleItemPosition() {
        int[] iArr = new int[g.e(getItemCount(), getSpanCount())];
        findLastVisibleItemPositions(iArr);
        return ArraysKt.last(iArr);
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
    public void onAttachedToWindow(@NotNull RecyclerView view) {
        super.onAttachedToWindow(view);
        _onAttachedToWindow(view);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(@NotNull RecyclerView view, @NotNull RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(view, recycler);
        _onDetachedFromWindow(view, recycler);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
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
    public DivGridLayoutManager toLayoutManager() {
        return this;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* synthetic */ void trackVisibilityAction(View view, boolean z10) {
        DivGalleryItemHelper.CC.n(this, view, z10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int width() {
        return getWidth();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public HashSet<View> getChildrenToRelayout() {
        return this.childrenToRelayout;
    }
}
