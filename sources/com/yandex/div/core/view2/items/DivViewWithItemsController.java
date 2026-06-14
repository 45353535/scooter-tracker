package com.yandex.div.core.view2.items;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.items.DivViewWithItems;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.jp;
import k8.td;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J$\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItemsController;", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "(Lcom/yandex/div/core/view2/items/DivViewWithItems;)V", "changeCurrentItemByStep", "", "overflow", "", "step", "", "animated", "", "createStrategy", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "scrollByOffset", "offset", "scrollTo", "scrollToEnd", "scrollToStart", "setCurrentItem", FirebaseAnalytics.Param.INDEX, y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivViewWithItemsController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final DivViewWithItems view;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItemsController$Companion;", "", "()V", "TAG", "", "create", "Lcom/yandex/div/core/view2/items/DivViewWithItemsController;", "id", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/DivViewFacade;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "direction", "Lcom/yandex/div/core/view2/items/Direction;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ DivViewWithItemsController create$default(Companion companion, String str, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, Direction direction, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                direction = Direction.NEXT;
            }
            return companion.create(str, divViewFacade, expressionResolver, direction);
        }

        @Nullable
        public final DivViewWithItemsController create(@NotNull String id2, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver, @NotNull Direction direction) {
            View viewFindViewWithTag = view.getView().findViewWithTag(id2);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (viewFindViewWithTag == null) {
                return null;
            }
            DivViewWithItems viewForTests$div_release = DivViewWithItems.INSTANCE.getViewForTests$div_release();
            if (viewForTests$div_release == null) {
                if (viewFindViewWithTag instanceof DivRecyclerView) {
                    DivRecyclerView divRecyclerView = (DivRecyclerView) viewFindViewWithTag;
                    y0.e div = divRecyclerView.getDiv();
                    Intrinsics.checkNotNull(div);
                    int i10 = DivViewWithItems.Companion.WhenMappings.$EnumSwitchMapping$0[((td.e) div.d().C.evaluate(resolver)).ordinal()];
                    if (i10 == 1) {
                        viewForTests$div_release = new DivViewWithItems.Gallery(divRecyclerView, direction);
                    } else {
                        if (i10 != 2) {
                            throw new m();
                        }
                        viewForTests$div_release = new DivViewWithItems.PagingGallery(divRecyclerView, direction);
                    }
                } else {
                    viewForTests$div_release = viewFindViewWithTag instanceof DivPagerView ? new DivViewWithItems.Pager((DivPagerView) viewFindViewWithTag) : viewFindViewWithTag instanceof DivTabsLayout ? new DivViewWithItems.Tabs((DivTabsLayout) viewFindViewWithTag) : null;
                }
            }
            if (viewForTests$div_release == null) {
                return null;
            }
            return new DivViewWithItemsController(viewForTests$div_release, defaultConstructorMarker);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivViewWithItemsController(DivViewWithItems divViewWithItems, DefaultConstructorMarker defaultConstructorMarker) {
        this(divViewWithItems);
    }

    private final OverflowItemStrategy createStrategy(String overflow) {
        return OverflowItemStrategy.INSTANCE.create$div_release(overflow, this.view.getCurrentItem(), this.view.getItemCount(), this.view.getScrollRange(), this.view.getScrollOffset(), this.view.getMetrics());
    }

    public final void changeCurrentItemByStep(@Nullable String overflow, int step, boolean animated) {
        int iPreviousItem;
        OverflowItemStrategy overflowItemStrategyCreateStrategy = createStrategy(overflow);
        if (step > 0) {
            iPreviousItem = overflowItemStrategyCreateStrategy.nextItem(step);
        } else if (step >= 0) {
            return;
        } else {
            iPreviousItem = overflowItemStrategyCreateStrategy.previousItem(-step);
        }
        setCurrentItem(iPreviousItem, animated);
    }

    public final void scrollByOffset(@Nullable String overflow, int offset, boolean animated) {
        if (offset == 0) {
            return;
        }
        DivViewWithItems.scrollTo$default(this.view, createStrategy(overflow).positionAfterScrollBy(offset), null, animated, 2, null);
    }

    public final void scrollTo(int offset, boolean animated) {
        this.view.scrollTo(offset, jp.DP, animated);
    }

    public final void scrollToEnd(boolean animated) {
        this.view.scrollToTheEnd(animated);
    }

    public final void scrollToStart(boolean animated) {
        setCurrentItem(0, animated);
    }

    public final void setCurrentItem(int index, boolean animated) {
        if (animated) {
            this.view.setCurrentItem(index);
        } else {
            this.view.setCurrentItemNoAnimation(index);
        }
    }

    private DivViewWithItemsController(DivViewWithItems divViewWithItems) {
        this.view = divViewWithItems;
    }
}
