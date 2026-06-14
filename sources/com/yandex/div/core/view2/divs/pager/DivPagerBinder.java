package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.jk;
import k8.k8;
import k8.qk;
import k8.y0;
import kf.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013*\u0001\"\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BG\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001c\u001a\u00020\u001b*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001b*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\"*\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J9\u0010*\u001a\u00020\u001b*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020,*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b-\u0010.J/\u00104\u001a\u000203*\u00020/2\u0006\u0010\u0018\u001a\u00020\u00032\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001b00H\u0002¢\u0006\u0004\b4\u00105J\u001b\u00108\u001a\u00020\u001b*\u00020/2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020\u001b*\u00020/H\u0002¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020\u001b*\u00020\u00042\u0006\u0010<\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>J/\u0010@\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010BR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010CR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010H¨\u0006I"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$k;", "Lk8/jk;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "Lkf/a;", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/core/downloader/DivPatchCache;", "divPatchCache", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBinder", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "pagerIndicatorConnector", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "accessibilityStateProvider", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivViewCreator;Lkf/a;Lcom/yandex/div/core/downloader/DivPatchCache;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;Lcom/yandex/div/core/util/AccessibilityStateProvider;)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "div", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lcom/yandex/div/core/view2/BindingContext;Lk8/jk;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "bindInfiniteScroll", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lk8/jk;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "com/yandex/div/core/view2/divs/pager/DivPagerBinder$createInfiniteScrollListener$1", "createInfiniteScrollListener", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;)Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder$createInfiniteScrollListener$1;", "Landroid/util/SparseArray;", "", "pageTranslations", "Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", N6.G1, "applyDecorations", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lk8/jk;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/util/SparseArray;Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;)V", "", "isHorizontal", "(Lk8/jk;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Landroidx/viewpager2/widget/ViewPager2;", "Lkotlin/Function1;", "", "observer", "Lcom/yandex/div/core/Disposable;", "observeSizeChange", "(Landroidx/viewpager2/widget/ViewPager2;Lk8/jk;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "decoration", "setItemDecoration", "(Landroidx/viewpager2/widget/ViewPager2;Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V", "removeItemDecorations", "(Landroidx/viewpager2/widget/ViewPager2;)V", POBCoreNativeConstants.NATIVE_CONTEXT, "bindItemBuilder", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lcom/yandex/div/core/view2/BindingContext;Lk8/jk;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;Lk8/y0$k;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "Lcom/yandex/div/core/view2/DivViewCreator;", "Lkf/a;", "Lcom/yandex/div/core/downloader/DivPatchCache;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivPagerBinder extends DivViewBinder<y0.k, jk, DivPagerView> {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final a divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    @NotNull
    private final DivViewCreator viewCreator;

    /* JADX INFO: renamed from: com.yandex.div.core.view2.divs.pager.DivPagerBinder$observeSizeChange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0002JP\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"com/yandex/div/core/view2/divs/pager/DivPagerBinder$observeSizeChange$1", "Lcom/yandex/div/core/Disposable;", "Landroid/view/View$OnLayoutChangeListener;", "oldSize", "", "close", "", "getSize", "onLayoutChange", "v", "Landroid/view/View;", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewOnLayoutChangeListenerC49291 implements Disposable, View.OnLayoutChangeListener, AutoCloseable {
        final /* synthetic */ jk $div;
        final /* synthetic */ Function1<Object, Unit> $observer;
        final /* synthetic */ ViewPager2 $this_observeSizeChange;
        private int oldSize;

        ViewOnLayoutChangeListenerC49291(final ViewPager2 viewPager2, final Function1<Object, Unit> function1, jk jkVar) {
            this.$this_observeSizeChange = viewPager2;
            this.$observer = function1;
            this.$div = jkVar;
            viewPager2.addOnLayoutChangeListener(this);
            OneShotPreDrawListener.add(viewPager2, new Runnable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$observeSizeChange$1$special$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    int size = this.getSize();
                    function1.invoke(Integer.valueOf(size));
                    this.oldSize = size;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getSize() {
            return this.$this_observeSizeChange.getOrientation() == 0 ? this.$this_observeSizeChange.getWidth() : this.$this_observeSizeChange.getHeight();
        }

        @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
        public void close() {
            this.$this_observeSizeChange.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View v10, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            int size = getSize();
            if (this.oldSize != size) {
                this.oldSize = size;
                this.$observer.invoke(Integer.valueOf(size));
            } else if (this.$div.f88457u instanceof qk.d) {
                this.$this_observeSizeChange.requestTransform();
            }
        }
    }

    public DivPagerBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull a aVar, @NotNull DivPatchCache divPatchCache, @NotNull DivActionBinder divActionBinder, @NotNull PagerIndicatorConnector pagerIndicatorConnector, @NotNull AccessibilityStateProvider accessibilityStateProvider) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = aVar;
        this.divPatchCache = divPatchCache;
        this.divActionBinder = divActionBinder;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDecorations(DivPagerView divPagerView, jk jkVar, ExpressionResolver expressionResolver, SparseArray<Float> sparseArray, DivPagerAdapter divPagerAdapter) {
        DivPagerPaddingsHolder divPagerPaddingsHolder;
        int i10;
        DivPagerPageSizeProvider wrapContentPageSizeProvider;
        boolean z10;
        jk.c cVar;
        DivPagerPageSizeProvider divPagerPageSizeProvider;
        int i11;
        RecyclerView.ItemDecoration wrapContentPageSizeItemDecoration;
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        boolean zIsHorizontal = isHorizontal(jkVar, expressionResolver);
        divPagerView.setOrientation(!zIsHorizontal ? 1 : 0);
        divPagerAdapter.setCrossAxisAlignment((jk.c) jkVar.f88445i.evaluate(expressionResolver));
        if (ViewsKt.isActuallyLaidOut(divPagerView)) {
            DisplayMetrics displayMetrics = divPagerView.getResources().getDisplayMetrics();
            ViewPager2 viewPager = divPagerView.getViewPager();
            int width = zIsHorizontal ? viewPager.getWidth() : viewPager.getHeight();
            float pxF = BaseDivViewExtensionsKt.toPxF(jkVar.f88455s, displayMetrics, expressionResolver);
            boolean zBooleanValue = ((Boolean) jkVar.f88453q.evaluate(expressionResolver)).booleanValue();
            jk.c cVar2 = (jk.c) jkVar.D.evaluate(expressionResolver);
            DivPagerPaddingsHolder divPagerPaddingsHolder2 = new DivPagerPaddingsHolder(jkVar.p(), expressionResolver, divPagerView, displayMetrics, zIsHorizontal, cVar2);
            qk qkVar = jkVar.f88457u;
            if (qkVar instanceof qk.e) {
                PercentagePageSizeProvider percentagePageSizeProvider = new PercentagePageSizeProvider(((qk.e) qkVar).c(), expressionResolver, width, divPagerPaddingsHolder2, cVar2);
                divPagerPaddingsHolder = divPagerPaddingsHolder2;
                cVar = cVar2;
                z10 = zIsHorizontal ? 1 : 0;
                divPagerPageSizeProvider = percentagePageSizeProvider;
                i10 = width;
            } else {
                divPagerPaddingsHolder = divPagerPaddingsHolder2;
                i10 = width;
                if (qkVar instanceof qk.c) {
                    wrapContentPageSizeProvider = new NeighbourPageSizeProvider(((qk.c) qkVar).c(), expressionResolver, displayMetrics, i10, pxF, divPagerPaddingsHolder, cVar2);
                    cVar = cVar2;
                    z10 = zIsHorizontal ? 1 : 0;
                } else {
                    if (!(qkVar instanceof qk.d)) {
                        throw new m();
                    }
                    wrapContentPageSizeProvider = new WrapContentPageSizeProvider(recyclerView, zIsHorizontal, i10, divPagerPaddingsHolder, cVar2);
                    z10 = zIsHorizontal ? 1 : 0;
                    cVar = cVar2;
                    i10 = i10;
                }
                divPagerPageSizeProvider = wrapContentPageSizeProvider;
            }
            if (divPagerPageSizeProvider instanceof FixedPageSizeProvider) {
                int i12 = i10;
                FixedPageSizeProvider fixedPageSizeProvider = (FixedPageSizeProvider) divPagerPageSizeProvider;
                new FixedPageSizeOffScreenPagesController(divPagerView, i12, pxF, fixedPageSizeProvider, divPagerPaddingsHolder, zBooleanValue, divPagerAdapter);
                i11 = i12;
                wrapContentPageSizeItemDecoration = new FixedPageSizeItemDecoration(divPagerPaddingsHolder, fixedPageSizeProvider);
            } else {
                i11 = i10;
                new WrapContentPageSizeOffScreenPagesController(divPagerView, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, divPagerAdapter);
                wrapContentPageSizeItemDecoration = new WrapContentPageSizeItemDecoration(i11, divPagerPaddingsHolder, cVar);
            }
            setItemDecoration(divPagerView.getViewPager(), wrapContentPageSizeItemDecoration);
            jk.c cVar3 = cVar;
            int i13 = i11;
            divPagerView.setPageTransformer$div_release(new DivPagerPageTransformer(recyclerView, expressionResolver, sparseArray, i13, jkVar.f88462z, new DivPagerPageOffsetProvider(i13, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, zBooleanValue, divPagerAdapter, cVar3), z10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bind(final com.yandex.div.core.view2.divs.widgets.DivPagerView r19, com.yandex.div.core.view2.BindingContext r20, final k8.jk r21, com.yandex.div.core.state.DivStatePath r22) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.pager.DivPagerBinder.bind(com.yandex.div.core.view2.divs.widgets.DivPagerView, com.yandex.div.core.view2.BindingContext, k8.jk, com.yandex.div.core.state.DivStatePath):void");
    }

    private final void bindInfiniteScroll(final DivPagerView divPagerView, jk jkVar, ExpressionResolver expressionResolver) {
        View childAt = divPagerView.getViewPager().getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        final RecyclerView recyclerView = (RecyclerView) childAt;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        jkVar.f88453q.observeAndGet(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder.bindInfiniteScroll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                RecyclerView.Adapter adapter = divPagerView.getViewPager().getAdapter();
                DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
                if (divPagerAdapter != null) {
                    divPagerAdapter.setInfiniteScrollEnabled(z10);
                }
                if (!z10) {
                    RecyclerView.OnScrollListener onScrollListener = (RecyclerView.OnScrollListener) ref$ObjectRef.f93280b;
                    if (onScrollListener != null) {
                        recyclerView.removeOnScrollListener(onScrollListener);
                        return;
                    }
                    return;
                }
                RecyclerView.OnScrollListener onScrollListenerCreateInfiniteScrollListener = (RecyclerView.OnScrollListener) ref$ObjectRef.f93280b;
                if (onScrollListenerCreateInfiniteScrollListener == null) {
                    onScrollListenerCreateInfiniteScrollListener = this.createInfiniteScrollListener(divPagerView);
                    ref$ObjectRef.f93280b = onScrollListenerCreateInfiniteScrollListener;
                }
                recyclerView.addOnScrollListener(onScrollListenerCreateInfiniteScrollListener);
            }
        });
    }

    private final void bindItemBuilder(final DivPagerView divPagerView, final BindingContext bindingContext, jk jkVar) {
        final k8 k8Var = jkVar.f88454r;
        if (k8Var == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(k8Var, bindingContext.getExpressionResolver(), new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder.bindItemBuilder.1
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
                DivPagerAdapter divPagerAdapter = (DivPagerAdapter) divPagerView.getViewPager().getAdapter();
                if (divPagerAdapter != null) {
                    k8 k8Var2 = k8Var;
                    BindingContext bindingContext2 = bindingContext;
                    final DivPagerView divPagerView2 = divPagerView;
                    divPagerAdapter.setItems(DivCollectionExtensionsKt.build(k8Var2, bindingContext2.getExpressionResolver()));
                    DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange = divPagerView2.getPagerOnItemsCountChange();
                    if (pagerOnItemsCountChange != null) {
                        pagerOnItemsCountChange.onItemsUpdated();
                    }
                    RecyclerView recyclerView = divPagerView2.getRecyclerView();
                    if (recyclerView != null) {
                        recyclerView.scrollToPosition(divPagerAdapter.realItemPosition(divPagerView2.getCurrentItem$div_release()));
                    }
                    divPagerView2.getViewPager().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindItemBuilder$1$invoke$lambda$1$$inlined$doOnNextLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view.removeOnLayoutChangeListener(this);
                            divPagerView2.getViewPager().requestTransform();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1] */
    public final C49281 createInfiniteScrollListener(final DivPagerView divPagerView) {
        return new RecyclerView.OnScrollListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder.createInfiniteScrollListener.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                RecyclerView.Adapter adapter = divPagerView.getViewPager().getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition >= itemCount - 2 && dx > 0) {
                    recyclerView.scrollToPosition(2);
                } else {
                    if (iFindLastVisibleItemPosition > 1 || dx >= 0) {
                        return;
                    }
                    recyclerView.scrollToPosition(itemCount - 3);
                }
            }
        };
    }

    private final boolean isHorizontal(jk jkVar, ExpressionResolver expressionResolver) {
        return jkVar.f88460x.evaluate(expressionResolver) == jk.d.HORIZONTAL;
    }

    private final Disposable observeSizeChange(ViewPager2 viewPager2, jk jkVar, Function1<Object, Unit> function1) {
        return new ViewOnLayoutChangeListenerC49291(viewPager2, function1, jkVar);
    }

    private final void removeItemDecorations(ViewPager2 viewPager2) {
        int itemDecorationCount = viewPager2.getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            viewPager2.removeItemDecorationAt(i10);
        }
    }

    private final void setItemDecoration(ViewPager2 viewPager2, RecyclerView.ItemDecoration itemDecoration) {
        removeItemDecorations(viewPager2);
        viewPager2.addItemDecoration(itemDecoration);
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivPagerView view, @NotNull y0.k div, @NotNull DivStatePath path) {
        this.pagerIndicatorConnector.submitPager$div_release(view, div.d());
        y0.k div2 = view.getDiv();
        if (div != div2) {
            if (div2 != null) {
                view.setChangePageCallbackForOffScreenPages$div_release(null);
                removeItemDecorations(view.getViewPager());
                view.setPageTransformer$div_release(null);
            }
            this.baseBinder.bindView(context, view, div, div2);
            bind(view, context, div.d(), path);
            return;
        }
        final ViewPager2 viewPager = view.getViewPager();
        RecyclerView.Adapter adapter = viewPager.getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter == null) {
            return;
        }
        if (!divPagerAdapter.applyPatch(view.getRecyclerView(), this.divPatchCache, context)) {
            BaseDivViewExtensionsKt.bindStates(view, context, (DivBinder) this.divBinder.get());
            viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindView$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    viewPager.requestTransform();
                }
            });
        } else {
            DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange = view.getPagerOnItemsCountChange();
            if (pagerOnItemsCountChange != null) {
                pagerOnItemsCountChange.onItemsUpdated();
            }
        }
    }
}
