package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.Set;
import k8.td;
import k8.y0;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.ranges.g;
import kotlin.sequences.k;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\t\b`\u0018\u0000 E2\u00020\u0001:\u0001EJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJA\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H&¢\u0006\u0004\b\"\u0010\u0016J+\u0010#\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J7\u0010(\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u0004\u0018\u00010\n2\u0006\u0010*\u001a\u00020\u0002H&¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b-\u0010'J!\u0010/\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u00100R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0018\u0010D\u001a\u00020\u0002*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006FÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;", "", "", C4240b4.i.L, "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "getItemDiv", "(I)Lcom/yandex/div/internal/core/DivItemBuilderResult;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "toLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Landroid/view/View;", "child", "left", "top", "right", "bottom", "", "isRelayoutingChildren", "", "_layoutDecoratedWithMargins", "(Landroid/view/View;IIIIZ)V", "firstCompletelyVisibleItemPosition", "()I", "lastCompletelyVisibleItemPosition", "firstVisibleItemPosition", "lastVisibleItemPosition", "width", "Lcom/yandex/div/core/view2/divs/gallery/ScrollPosition;", "scrollPosition", "instantScrollToPosition", "(ILcom/yandex/div/core/view2/divs/gallery/ScrollPosition;)V", "offset", "instantScrollToPositionWithOffset", "(IILcom/yandex/div/core/view2/divs/gallery/ScrollPosition;)V", "getLayoutManagerOrientation", "instantScroll", "(ILcom/yandex/div/core/view2/divs/gallery/ScrollPosition;I)V", "targetView", "calcScrollOffset", "(Landroid/view/View;)I", "superLayoutDecoratedWithMargins", "(Landroid/view/View;IIII)V", FirebaseAnalytics.Param.INDEX, "_getChildAt", "(I)Landroid/view/View;", "_getPosition", "clear", "trackVisibilityAction", "(Landroid/view/View;Z)V", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Landroidx/recyclerview/widget/RecyclerView;", "getView", "()Landroidx/recyclerview/widget/RecyclerView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lk8/td;", "getDiv", "()Lk8/td;", "div", "", "getChildrenToRelayout", "()Ljava/util/Set;", "childrenToRelayout", "isHorizontal", "()Z", "getScrollOffset", "scrollOffset", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivGalleryItemHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: renamed from: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        static {
            Companion companion = DivGalleryItemHelper.INSTANCE;
        }

        public static void a(DivGalleryItemHelper divGalleryItemHelper, View view) {
            divGalleryItemHelper.trackVisibilityAction(view, true);
        }

        public static void b(DivGalleryItemHelper divGalleryItemHelper, int i10) {
            View view_getChildAt = divGalleryItemHelper._getChildAt(i10);
            if (view_getChildAt == null) {
                return;
            }
            divGalleryItemHelper.trackVisibilityAction(view_getChildAt, true);
        }

        public static void c(DivGalleryItemHelper divGalleryItemHelper, View view, int i10, int i11, int i12, int i13) {
            u(divGalleryItemHelper, view, false, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void d(com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper r13, android.view.View r14, int r15, int r16, int r17, int r18, boolean r19) {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper.CC.d(com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper, android.view.View, int, int, int, int, boolean):void");
        }

        public static void e(DivGalleryItemHelper divGalleryItemHelper, RecyclerView recyclerView) {
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                u(divGalleryItemHelper, recyclerView.getChildAt(i10), false, 2, null);
            }
        }

        public static void f(DivGalleryItemHelper divGalleryItemHelper, RecyclerView recyclerView, RecyclerView.Recycler recycler) {
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                divGalleryItemHelper.trackVisibilityAction(recyclerView.getChildAt(i10), true);
            }
        }

        public static void g(DivGalleryItemHelper divGalleryItemHelper, RecyclerView.State state) {
            for (View view : divGalleryItemHelper.getChildrenToRelayout()) {
                divGalleryItemHelper._layoutDecoratedWithMargins(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
            }
            divGalleryItemHelper.getChildrenToRelayout().clear();
        }

        public static void h(DivGalleryItemHelper divGalleryItemHelper, RecyclerView.Recycler recycler) {
            RecyclerView view = divGalleryItemHelper.getView();
            int childCount = view.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                divGalleryItemHelper.trackVisibilityAction(view.getChildAt(i10), true);
            }
        }

        public static void i(DivGalleryItemHelper divGalleryItemHelper, View view) {
            divGalleryItemHelper.trackVisibilityAction(view, true);
        }

        public static void j(DivGalleryItemHelper divGalleryItemHelper, int i10) {
            View view_getChildAt = divGalleryItemHelper._getChildAt(i10);
            if (view_getChildAt == null) {
                return;
            }
            divGalleryItemHelper.trackVisibilityAction(view_getChildAt, true);
        }

        public static int k(DivGalleryItemHelper divGalleryItemHelper, View view) {
            return o(divGalleryItemHelper, view);
        }

        public static int l(DivGalleryItemHelper divGalleryItemHelper, int i10, int i11, int i12, int i13, int i14, boolean z10) {
            int iE = g.e(i10 - i12, 0);
            return (i13 < 0 || i13 > Integer.MAX_VALUE) ? i13 == -1 ? (z10 && i11 == 0) ? ViewsKt.makeUnspecifiedSpec() : View.MeasureSpec.makeMeasureSpec(iE, i11) : i13 == -2 ? i14 == Integer.MAX_VALUE ? ViewsKt.makeUnspecifiedSpec() : ViewsKt.makeAtMostSpec(i14) : i13 == -3 ? (i11 == Integer.MIN_VALUE || i11 == 1073741824) ? ViewsKt.makeAtMostSpec(Math.min(iE, i14)) : i14 == Integer.MAX_VALUE ? ViewsKt.makeUnspecifiedSpec() : ViewsKt.makeAtMostSpec(i14) : ViewsKt.makeUnspecifiedSpec() : ViewsKt.makeExactSpec(i13);
        }

        public static void m(final DivGalleryItemHelper divGalleryItemHelper, final int i10, final ScrollPosition scrollPosition, final int i11) {
            RecyclerView view = divGalleryItemHelper.getView();
            if (!com.yandex.div.core.util.ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper$instantScroll$$inlined$doOnActualLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view2.removeOnLayoutChangeListener(this);
                        if (i10 == 0) {
                            int i12 = (DivGalleryItemHelper.CC.p(divGalleryItemHelper) && com.yandex.div.core.util.ViewsKt.isLayoutRtl(divGalleryItemHelper.getView())) ? i11 : -i11;
                            divGalleryItemHelper.getView().scrollBy(i12, i12);
                            return;
                        }
                        divGalleryItemHelper.getView().scrollBy(-divGalleryItemHelper.getView().getScrollX(), -divGalleryItemHelper.getView().getScrollY());
                        RecyclerView.LayoutManager layoutManager = divGalleryItemHelper.getView().getLayoutManager();
                        View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i10) : null;
                        while (viewFindViewByPosition == null && (divGalleryItemHelper.getView().canScrollVertically(1) || divGalleryItemHelper.getView().canScrollHorizontally(1))) {
                            RecyclerView.LayoutManager layoutManager2 = divGalleryItemHelper.getView().getLayoutManager();
                            if (layoutManager2 != null) {
                                layoutManager2.requestLayout();
                            }
                            RecyclerView.LayoutManager layoutManager3 = divGalleryItemHelper.getView().getLayoutManager();
                            viewFindViewByPosition = layoutManager3 != null ? layoutManager3.findViewByPosition(i10) : null;
                            if (viewFindViewByPosition != null) {
                                break;
                            } else {
                                divGalleryItemHelper.getView().scrollBy(divGalleryItemHelper.getView().getWidth(), divGalleryItemHelper.getView().getHeight());
                            }
                        }
                        if (viewFindViewByPosition != null) {
                            int i13 = DivGalleryItemHelper.WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    return;
                                }
                                int iO = DivGalleryItemHelper.CC.o(divGalleryItemHelper, viewFindViewByPosition) - i11;
                                if (com.yandex.div.core.util.ViewsKt.isLayoutRtl(divGalleryItemHelper.getView())) {
                                    iO = -iO;
                                }
                                divGalleryItemHelper.getView().scrollBy(iO, iO);
                                return;
                            }
                            int[] iArr = {0, 0};
                            int[] iArr2 = {0, 0};
                            divGalleryItemHelper.getView().getLocationOnScreen(iArr2);
                            viewFindViewByPosition.getLocationOnScreen(iArr);
                            divGalleryItemHelper.getView().scrollBy(((viewFindViewByPosition.getWidth() - divGalleryItemHelper.getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((viewFindViewByPosition.getHeight() - divGalleryItemHelper.getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
                        }
                    }
                });
                return;
            }
            if (i10 == 0) {
                if (!p(divGalleryItemHelper) || !com.yandex.div.core.util.ViewsKt.isLayoutRtl(divGalleryItemHelper.getView())) {
                    i11 = -i11;
                }
                divGalleryItemHelper.getView().scrollBy(i11, i11);
                return;
            }
            divGalleryItemHelper.getView().scrollBy(-divGalleryItemHelper.getView().getScrollX(), -divGalleryItemHelper.getView().getScrollY());
            RecyclerView.LayoutManager layoutManager = divGalleryItemHelper.getView().getLayoutManager();
            View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i10) : null;
            while (viewFindViewByPosition == null && (divGalleryItemHelper.getView().canScrollVertically(1) || divGalleryItemHelper.getView().canScrollHorizontally(1))) {
                RecyclerView.LayoutManager layoutManager2 = divGalleryItemHelper.getView().getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.requestLayout();
                }
                RecyclerView.LayoutManager layoutManager3 = divGalleryItemHelper.getView().getLayoutManager();
                viewFindViewByPosition = layoutManager3 != null ? layoutManager3.findViewByPosition(i10) : null;
                if (viewFindViewByPosition != null) {
                    break;
                } else {
                    divGalleryItemHelper.getView().scrollBy(divGalleryItemHelper.getView().getWidth(), divGalleryItemHelper.getView().getHeight());
                }
            }
            if (viewFindViewByPosition != null) {
                int i12 = WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        return;
                    }
                    int iO = o(divGalleryItemHelper, viewFindViewByPosition) - i11;
                    if (com.yandex.div.core.util.ViewsKt.isLayoutRtl(divGalleryItemHelper.getView())) {
                        iO = -iO;
                    }
                    divGalleryItemHelper.getView().scrollBy(iO, iO);
                    return;
                }
                int[] iArr = {0, 0};
                int[] iArr2 = {0, 0};
                divGalleryItemHelper.getView().getLocationOnScreen(iArr2);
                viewFindViewByPosition.getLocationOnScreen(iArr);
                divGalleryItemHelper.getView().scrollBy(((viewFindViewByPosition.getWidth() - divGalleryItemHelper.getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((viewFindViewByPosition.getHeight() - divGalleryItemHelper.getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void n(DivGalleryItemHelper divGalleryItemHelper, View view, boolean z10) {
            View view2;
            BindingContext bindingContext;
            int i_getPosition = divGalleryItemHelper._getPosition(view);
            if (i_getPosition == -1) {
                return;
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (view2 = (View) k.I(ViewGroupKt.getChildren(viewGroup))) == 0) {
                return;
            }
            Div2View divView = divGalleryItemHelper.getBindingContext().getDivView();
            if (!z10) {
                DivItemBuilderResult itemDiv = divGalleryItemHelper.getItemDiv(i_getPosition);
                if (itemDiv == null) {
                    return;
                }
                divView.getDiv2Component().getVisibilityActionTracker().startTrackingViewsHierarchy(divGalleryItemHelper.getBindingContext().getFor(itemDiv.getExpressionResolver()), view2, itemDiv.getDiv());
                divView.bindViewToDiv$div_release(view2, itemDiv.getDiv());
                return;
            }
            y0 y0VarTakeBindingDiv$div_release = divView.takeBindingDiv$div_release(view2);
            if (y0VarTakeBindingDiv$div_release == null) {
                return;
            }
            DivHolderView divHolderView = view2 instanceof DivHolderView ? (DivHolderView) view2 : null;
            if (divHolderView == null || (bindingContext = divHolderView.getBindingContext()) == null) {
                return;
            }
            divView.getDiv2Component().getVisibilityActionTracker().cancelTrackingViewsHierarchy(bindingContext, view2, y0VarTakeBindingDiv$div_release);
            divView.unbindViewFromDiv$div_release(view2);
        }

        public static int o(DivGalleryItemHelper divGalleryItemHelper, View view) {
            int marginStart;
            int paddingStart;
            if (p(divGalleryItemHelper)) {
                int width = com.yandex.div.core.util.ViewsKt.isLayoutRtl(view) ? divGalleryItemHelper.getView().getWidth() - view.getRight() : view.getLeft();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                marginStart = width - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
                paddingStart = divGalleryItemHelper.getView().getPaddingStart();
            } else {
                int top = view.getTop();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                marginStart = top - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                paddingStart = divGalleryItemHelper.getView().getPaddingTop();
            }
            return marginStart - paddingStart;
        }

        public static boolean p(DivGalleryItemHelper divGalleryItemHelper) {
            return divGalleryItemHelper.getLayoutManagerOrientation() == 0;
        }

        public static /* synthetic */ void q(DivGalleryItemHelper divGalleryItemHelper, View view, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: _layoutDecoratedWithMargins");
            }
            if ((i14 & 32) != 0) {
                z10 = false;
            }
            divGalleryItemHelper._layoutDecoratedWithMargins(view, i10, i11, i12, i13, z10);
        }

        public static /* synthetic */ void t(DivGalleryItemHelper divGalleryItemHelper, int i10, ScrollPosition scrollPosition, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: instantScroll");
            }
            if ((i12 & 2) != 0) {
                scrollPosition = ScrollPosition.DEFAULT;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            divGalleryItemHelper.instantScroll(i10, scrollPosition, i11);
        }

        public static /* synthetic */ void u(DivGalleryItemHelper divGalleryItemHelper, View view, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityAction");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            divGalleryItemHelper.trackVisibilityAction(view, z10);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u0007*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\f\u001a\u00020\u0007*\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper$Companion;", "", "<init>", "()V", "", "totalSpace", "decoratedMeasurement", "Lk8/td$c;", "crossContentAlignment", "calculateOffset", "(IILk8/td$c;)I", "Lk8/y5;", "asCrossContentAlignment", "(Lk8/y5;)Lk8/td$c;", "Lk8/z5;", "(Lk8/z5;)Lk8/td$c;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[td.c.values().length];
                try {
                    iArr[td.c.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[td.c.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[td.c.END.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[y5.values().length];
                try {
                    iArr2[y5.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[y5.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[y5.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[y5.START.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[y5.END.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[z5.values().length];
                try {
                    iArr3[z5.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[z5.BASELINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[z5.CENTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[z5.BOTTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final td.c asCrossContentAlignment(y5 y5Var) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[y5Var.ordinal()];
            if (i10 == 1) {
                return td.c.START;
            }
            if (i10 == 2) {
                return td.c.CENTER;
            }
            if (i10 == 3) {
                return td.c.END;
            }
            if (i10 == 4) {
                return td.c.START;
            }
            if (i10 == 5) {
                return td.c.END;
            }
            throw new m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int calculateOffset(int totalSpace, int decoratedMeasurement, td.c crossContentAlignment) {
            int i10 = totalSpace - decoratedMeasurement;
            int i11 = WhenMappings.$EnumSwitchMapping$0[crossContentAlignment.ordinal()];
            if (i11 == 1) {
                return 0;
            }
            if (i11 == 2) {
                return i10 / 2;
            }
            if (i11 == 3) {
                return i10;
            }
            throw new m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final td.c asCrossContentAlignment(z5 z5Var) {
            int i10 = WhenMappings.$EnumSwitchMapping$2[z5Var.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return td.c.START;
            }
            if (i10 == 3) {
                return td.c.CENTER;
            }
            if (i10 == 4) {
                return td.c.END;
            }
            throw new m();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrollPosition.values().length];
            try {
                iArr[ScrollPosition.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollPosition.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    View _getChildAt(int index);

    int _getPosition(@NotNull View child);

    void _layoutDecoratedWithMargins(@NotNull View child, int left, int top, int right, int bottom, boolean isRelayoutingChildren);

    int calcScrollOffset(@NotNull View targetView);

    int firstCompletelyVisibleItemPosition();

    int firstVisibleItemPosition();

    @NotNull
    BindingContext getBindingContext();

    @NotNull
    Set<View> getChildrenToRelayout();

    @NotNull
    td getDiv();

    @Nullable
    DivItemBuilderResult getItemDiv(int position);

    int getLayoutManagerOrientation();

    @NotNull
    RecyclerView getView();

    void instantScroll(int position, @NotNull ScrollPosition scrollPosition, int offset);

    void instantScrollToPosition(int position, @NotNull ScrollPosition scrollPosition);

    void instantScrollToPositionWithOffset(int position, int offset, @NotNull ScrollPosition scrollPosition);

    int lastCompletelyVisibleItemPosition();

    int lastVisibleItemPosition();

    void superLayoutDecoratedWithMargins(@NotNull View child, int left, int top, int right, int bottom);

    @NotNull
    RecyclerView.LayoutManager toLayoutManager();

    void trackVisibilityAction(@NotNull View child, boolean clear);

    int width();
}
