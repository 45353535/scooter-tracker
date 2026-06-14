package com.yandex.div.core.view2.divs.gallery;

import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.activity.s;
import androidx.recyclerview.widget.DivLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.GalleryState;
import com.yandex.div.core.state.UpdateStateScrollListener;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.ReleasingViewPool;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.widget.PaddingItemDecoration;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.k8;
import k8.td;
import k8.y0;
import kf.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B7\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0017*\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010$\u001a\u00020\u0017*\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u00020\u0017*\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\u0017*\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010\u001eJ#\u0010+\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010\u001cJ/\u0010-\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103¨\u00064"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$e;", "Lk8/td;", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "Lkf/a;", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/core/downloader/DivPatchCache;", "divPatchCache", "", "recyclerScrollInterceptionAngle", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivViewCreator;Lkf/a;Lcom/yandex/div/core/downloader/DivPatchCache;F)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "div", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;Lcom/yandex/div/core/view2/BindingContext;Lk8/td;Lcom/yandex/div/core/state/DivStatePath;)V", POBCoreNativeConstants.NATIVE_CONTEXT, "updateDecorations", "(Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;Lcom/yandex/div/core/view2/BindingContext;Lk8/td;)V", "resetAnimatorAndRestoreOnLayout", "(Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;)V", "", C4240b4.i.L, "offset", "Lcom/yandex/div/core/view2/divs/gallery/ScrollPosition;", "scrollPosition", "scrollToPositionInternal", "(Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;IILcom/yandex/div/core/view2/divs/gallery/ScrollPosition;)V", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "decoration", "setItemDecoration", "(Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V", "removeItemDecorations", "bindItemBuilder", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;Lk8/y0$e;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "Lcom/yandex/div/core/view2/DivViewCreator;", "Lkf/a;", "Lcom/yandex/div/core/downloader/DivPatchCache;", "F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivGalleryBinder extends DivViewBinder<y0.e, td, DivRecyclerView> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final a divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;
    private final float recyclerScrollInterceptionAngle;

    @NotNull
    private final DivViewCreator viewCreator;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[td.e.values().length];
            try {
                iArr[td.e.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[td.e.PAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivGalleryBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull a aVar, @NotNull DivPatchCache divPatchCache, float f10) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = aVar;
        this.divPatchCache = divPatchCache;
        this.recyclerScrollInterceptionAngle = f10;
    }

    private final void bind(final DivRecyclerView divRecyclerView, final BindingContext bindingContext, final td tdVar, DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bind$reusableObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                this.this$0.updateDecorations(divRecyclerView, bindingContext, tdVar);
            }
        };
        divRecyclerView.addSubscription(tdVar.f91303x.observe(expressionResolver, function1));
        divRecyclerView.addSubscription(tdVar.D.observe(expressionResolver, function1));
        divRecyclerView.addSubscription(tdVar.C.observe(expressionResolver, function1));
        divRecyclerView.addSubscription(tdVar.f91299t.observe(expressionResolver, function1));
        divRecyclerView.addSubscription(tdVar.f91305z.observe(expressionResolver, function1));
        Expression expression = tdVar.f91287h;
        if (expression != null) {
            divRecyclerView.addSubscription(expression.observe(expressionResolver, function1));
        }
        divRecyclerView.setRecycledViewPool(new ReleasingViewPool(bindingContext.getDivView().getReleaseViewVisitor$div_release()));
        divRecyclerView.setScrollingTouchSlop(1);
        divRecyclerView.setClipToPadding(false);
        divRecyclerView.setOverScrollMode(2);
        divRecyclerView.setAdapter(new DivGalleryAdapter(DivCollectionExtensionsKt.buildItems(tdVar, expressionResolver), bindingContext, (DivBinder) this.divBinder.get(), this.viewCreator, divStatePath));
        bindItemBuilder(divRecyclerView, bindingContext, tdVar);
        resetAnimatorAndRestoreOnLayout(divRecyclerView);
        updateDecorations(divRecyclerView, bindingContext, tdVar);
    }

    private final void bindItemBuilder(final DivRecyclerView divRecyclerView, final BindingContext bindingContext, td tdVar) {
        final k8 k8Var = tdVar.f91298s;
        if (k8Var == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(k8Var, bindingContext.getExpressionResolver(), new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder.bindItemBuilder.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivGalleryAdapter divGalleryAdapter = (DivGalleryAdapter) divRecyclerView.getAdapter();
                if (divGalleryAdapter != null) {
                    divGalleryAdapter.setItems(DivCollectionExtensionsKt.build(k8Var, bindingContext.getExpressionResolver()));
                }
            }
        });
    }

    private final void removeItemDecorations(DivRecyclerView divRecyclerView) {
        int itemDecorationCount = divRecyclerView.getItemDecorationCount();
        while (true) {
            itemDecorationCount--;
            if (-1 >= itemDecorationCount) {
                return;
            } else {
                divRecyclerView.removeItemDecorationAt(itemDecorationCount);
            }
        }
    }

    private final void resetAnimatorAndRestoreOnLayout(final DivRecyclerView divRecyclerView) {
        final RecyclerView.ItemAnimator itemAnimator = divRecyclerView.getItemAnimator();
        divRecyclerView.setItemAnimator(null);
        if (!ViewsKt.isActuallyLaidOut(divRecyclerView) || divRecyclerView.isLayoutRequested()) {
            divRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$resetAnimatorAndRestoreOnLayout$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    if (divRecyclerView.getItemAnimator() == null) {
                        divRecyclerView.setItemAnimator(itemAnimator);
                    }
                }
            });
        } else if (divRecyclerView.getItemAnimator() == null) {
            divRecyclerView.setItemAnimator(itemAnimator);
        }
    }

    private final void scrollToPositionInternal(DivRecyclerView divRecyclerView, int i10, int i11, ScrollPosition scrollPosition) {
        Object layoutManager = divRecyclerView.getLayoutManager();
        DivGalleryItemHelper divGalleryItemHelper = layoutManager instanceof DivGalleryItemHelper ? (DivGalleryItemHelper) layoutManager : null;
        if (divGalleryItemHelper == null) {
            return;
        }
        if (i11 == 0 && i10 == 0) {
            divGalleryItemHelper.instantScrollToPosition(i10, scrollPosition);
        } else {
            divGalleryItemHelper.instantScrollToPositionWithOffset(i10, i11, scrollPosition);
        }
    }

    private final void setItemDecoration(DivRecyclerView divRecyclerView, RecyclerView.ItemDecoration itemDecoration) {
        removeItemDecorations(divRecyclerView);
        divRecyclerView.addItemDecoration(itemDecoration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDecorations(DivRecyclerView divRecyclerView, BindingContext bindingContext, td tdVar) {
        int i10;
        PaddingItemDecoration paddingItemDecoration;
        int visibleItemIndex;
        DisplayMetrics displayMetrics = divRecyclerView.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int i11 = ((td.d) tdVar.f91303x.evaluate(expressionResolver)) == td.d.HORIZONTAL ? 0 : 1;
        boolean z10 = tdVar.D.evaluate(expressionResolver) == td.f.AUTO;
        divRecyclerView.setVerticalScrollBarEnabled(z10 && i11 == 1);
        divRecyclerView.setHorizontalScrollBarEnabled(z10 && i11 == 0);
        divRecyclerView.setScrollbarFadingEnabled(false);
        Expression expression = tdVar.f91287h;
        long jLongValue = expression != null ? ((Number) expression.evaluate(expressionResolver)).longValue() : 1L;
        divRecyclerView.setClipChildren(false);
        if (jLongValue == 1) {
            i10 = i11;
            paddingItemDecoration = new PaddingItemDecoration(0, BaseDivViewExtensionsKt.dpToPx((Long) tdVar.f91299t.evaluate(expressionResolver), displayMetrics), 0, 0, 0, 0, i10, 61, null);
        } else {
            i10 = i11;
            int iDpToPx = BaseDivViewExtensionsKt.dpToPx((Long) tdVar.f91299t.evaluate(expressionResolver), displayMetrics);
            Expression expression2 = tdVar.f91290k;
            if (expression2 == null) {
                expression2 = tdVar.f91299t;
            }
            paddingItemDecoration = new PaddingItemDecoration(0, iDpToPx, BaseDivViewExtensionsKt.dpToPx((Long) expression2.evaluate(expressionResolver), displayMetrics), 0, 0, 0, i10, 57, null);
        }
        int i12 = i10;
        setItemDecoration(divRecyclerView, paddingItemDecoration);
        td.e eVar = (td.e) tdVar.C.evaluate(expressionResolver);
        divRecyclerView.setScrollMode(eVar);
        int i13 = WhenMappings.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i13 == 1) {
            PagerSnapStartHelper pagerSnapStartHelper = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper != null) {
                pagerSnapStartHelper.attachToRecyclerView(null);
            }
        } else if (i13 == 2) {
            int iDpToPx2 = BaseDivViewExtensionsKt.dpToPx((Long) tdVar.f91299t.evaluate(expressionResolver), divRecyclerView.getResources().getDisplayMetrics());
            PagerSnapStartHelper pagerSnapStartHelper2 = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper2 != null) {
                pagerSnapStartHelper2.setItemSpacing(iDpToPx2);
            } else {
                pagerSnapStartHelper2 = new PagerSnapStartHelper(iDpToPx2);
                divRecyclerView.setPagerSnapStartHelper(pagerSnapStartHelper2);
            }
            pagerSnapStartHelper2.attachToRecyclerView(divRecyclerView);
        }
        DivGalleryItemHelper divLinearLayoutManager = jLongValue == 1 ? new DivLinearLayoutManager(bindingContext, divRecyclerView, tdVar, i12) : new DivGridLayoutManager(bindingContext, divRecyclerView, tdVar, i12);
        divRecyclerView.setLayoutManager(divLinearLayoutManager.toLayoutManager());
        divRecyclerView.setScrollInterceptionAngle(this.recyclerScrollInterceptionAngle);
        divRecyclerView.clearOnScrollListeners();
        DivViewState currentState = bindingContext.getDivView().getCurrentState();
        if (currentState != null) {
            String id2 = tdVar.getId();
            if (id2 == null) {
                id2 = String.valueOf(tdVar.hashCode());
            }
            DivViewState.BlockState blockState = currentState.getBlockState(id2);
            GalleryState galleryState = blockState instanceof GalleryState ? (GalleryState) blockState : null;
            if (galleryState != null) {
                visibleItemIndex = galleryState.getVisibleItemIndex();
            } else {
                long jLongValue2 = ((Number) tdVar.f91291l.evaluate(expressionResolver)).longValue();
                long j10 = jLongValue2 >> 31;
                if (j10 == 0 || j10 == -1) {
                    visibleItemIndex = (int) jLongValue2;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                    }
                    visibleItemIndex = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            scrollToPositionInternal(divRecyclerView, visibleItemIndex, galleryState != null ? galleryState.getScrollOffset() : visibleItemIndex != 0 ? 0 : i12 == 0 ? divRecyclerView.getPaddingStart() : divRecyclerView.getPaddingTop(), ScrollPositionKt.toScrollPosition(eVar));
            divRecyclerView.addOnScrollListener(new UpdateStateScrollListener(id2, currentState, divLinearLayoutManager));
        }
        divRecyclerView.addOnScrollListener(new DivGalleryScrollListener(bindingContext, divRecyclerView, divLinearLayoutManager, tdVar));
        divRecyclerView.setOnInterceptTouchEventListener(((Boolean) tdVar.f91305z.evaluate(expressionResolver)).booleanValue() ? ParentScrollRestrictor.INSTANCE : null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void bindView(@NotNull BindingContext context, @NotNull DivRecyclerView view, @NotNull y0.e div, @NotNull DivStatePath path) {
        DivRecyclerView divRecyclerView = s.a(view) ? view : null;
        y0.e div2 = divRecyclerView != null ? divRecyclerView.getDiv() : null;
        if (div != div2) {
            this.baseBinder.bindView(context, view, div, div2);
            bind(view, context, div.d(), path);
            return;
        }
        RecyclerView.Adapter adapter = view.getAdapter();
        DivGalleryAdapter divGalleryAdapter = adapter instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter : null;
        if (divGalleryAdapter == null) {
            return;
        }
        divGalleryAdapter.applyPatch(view, this.divPatchCache, context);
        BaseDivViewExtensionsKt.bindStates(view, context, (DivBinder) this.divBinder.get());
    }
}
