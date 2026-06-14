package com.yandex.div.core.view2.divs.pager;

import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.logging.Severity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R(\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/PagerSelectedActionsDispatcher;", "", "Lcom/yandex/div/core/view2/Div2View;", "divView", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", FirebaseAnalytics.Param.ITEMS, "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBinder", "<init>", "(Lcom/yandex/div/core/view2/Div2View;Ljava/util/List;Lcom/yandex/div/core/view2/divs/DivActionBinder;)V", "item", "", "dispatchSelectedActions", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "attach", "(Landroidx/viewpager2/widget/ViewPager2;)V", "detach", "Lcom/yandex/div/core/view2/Div2View;", "Ljava/util/List;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "<set-?>", "pageSelectionTracker", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "getPageSelectionTracker", "()Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "PageSelectionTracker", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PagerSelectedActionsDispatcher {

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final Div2View divView;

    @NotNull
    private final List<DivItemBuilderResult> items;

    @Nullable
    private ViewPager2.OnPageChangeCallback pageSelectionTracker;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/PagerSelectedActionsDispatcher$PageSelectionTracker;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lcom/yandex/div/core/view2/divs/pager/PagerSelectedActionsDispatcher;)V", "currentPage", "", "selectedPages", "Lkotlin/collections/ArrayDeque;", "onPageScrollStateChanged", "", "state", "onPageSelected", C4240b4.i.L, "trackSelectedPages", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PageSelectionTracker extends ViewPager2.OnPageChangeCallback {
        private int currentPage = -1;

        @NotNull
        private final ArrayDeque<Integer> selectedPages = new ArrayDeque<>();

        public PageSelectionTracker() {
        }

        private final void trackSelectedPages() {
            while (!this.selectedPages.isEmpty()) {
                int iIntValue = this.selectedPages.removeFirst().intValue();
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.DEBUG)) {
                    kLog.print(3, "Ya:PagerSelectedActionsTracker", "dispatch selected actions for page " + iIntValue);
                }
                PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher = PagerSelectedActionsDispatcher.this;
                pagerSelectedActionsDispatcher.dispatchSelectedActions((DivItemBuilderResult) pagerSelectedActionsDispatcher.items.get(iIntValue));
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int state) {
            if (state == 0) {
                trackSelectedPages();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.DEBUG)) {
                kLog.print(3, "Ya:PagerSelectedActionsTracker", "onPageSelected(" + position + ')');
            }
            if (this.currentPage == position) {
                return;
            }
            if (position != -1) {
                this.selectedPages.add(Integer.valueOf(position));
            }
            if (this.currentPage == -1) {
                trackSelectedPages();
            }
            this.currentPage = position;
        }
    }

    public PagerSelectedActionsDispatcher(@NotNull Div2View div2View, @NotNull List<DivItemBuilderResult> list, @NotNull DivActionBinder divActionBinder) {
        this.divView = div2View;
        this.items = list;
        this.divActionBinder = divActionBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchSelectedActions(final DivItemBuilderResult item) {
        final List listQ = item.getDiv().c().q();
        if (listQ != null) {
            this.divView.bulkActions$div_release(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.pager.PagerSelectedActionsDispatcher$dispatchSelectedActions$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DivActionBinder.handleActions$div_release$default(this.this$0.divActionBinder, this.this$0.divView, item.getExpressionResolver(), listQ, "selection", null, 16, null);
                }
            });
        }
    }

    public final void attach(@NotNull ViewPager2 viewPager) {
        PageSelectionTracker pageSelectionTracker = new PageSelectionTracker();
        viewPager.registerOnPageChangeCallback(pageSelectionTracker);
        this.pageSelectionTracker = pageSelectionTracker;
    }

    public final void detach(@NotNull ViewPager2 viewPager) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.pageSelectionTracker;
        if (onPageChangeCallback != null) {
            viewPager.unregisterOnPageChangeCallback(onPageChangeCallback);
        }
        this.pageSelectionTracker = null;
    }
}
