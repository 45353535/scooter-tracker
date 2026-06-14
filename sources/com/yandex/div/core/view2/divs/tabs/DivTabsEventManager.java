package com.yandex.div.core.view2.divs.tabs;

import androidx.viewpager.widget.ViewPager;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.logging.Severity;
import k8.as;
import k8.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 /2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001/B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001bJ\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$ActiveTabClickListener;", "Lk8/j1;", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "actionBinder", "Lcom/yandex/div/core/Div2Logger;", "div2Logger", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "visibilityActionTracker", "Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;", "tabLayout", "Lk8/as;", "div", "<init>", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/DivVisibilityActionTracker;Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;Lk8/as;)V", "", C4240b4.i.L, "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "onPageDisplayed", "action", "tabPosition", "onActiveTabClicked", "(Lk8/j1;I)V", "Lcom/yandex/div/core/view2/BindingContext;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lcom/yandex/div/core/Div2Logger;", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;", "Lk8/as;", "getDiv", "()Lk8/as;", "setDiv", "(Lk8/as;)V", "currentPagePosition", "I", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivTabsEventManager implements ViewPager.OnPageChangeListener, BaseDivTabbedCardUi.ActiveTabClickListener<j1> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final DivActionBinder actionBinder;

    @NotNull
    private final BindingContext context;
    private int currentPagePosition = -1;

    @NotNull
    private as div;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final DivTabsLayout tabLayout;

    @NotNull
    private final DivVisibilityActionTracker visibilityActionTracker;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager$Companion;", "", "()V", "NO_POSITION", "", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivTabsEventManager(@NotNull BindingContext bindingContext, @NotNull DivActionBinder divActionBinder, @NotNull Div2Logger div2Logger, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivTabsLayout divTabsLayout, @NotNull as asVar) {
        this.context = bindingContext;
        this.actionBinder = divActionBinder;
        this.div2Logger = div2Logger;
        this.visibilityActionTracker = divVisibilityActionTracker;
        this.tabLayout = divTabsLayout;
        this.div = asVar;
    }

    public final void onPageDisplayed(int position) {
        int i10 = this.currentPagePosition;
        if (position == i10) {
            return;
        }
        if (i10 != -1) {
            this.visibilityActionTracker.cancelTrackingViewsHierarchy(this.context, this.tabLayout, ((as.c) this.div.f86342q.get(i10)).f86355a);
            this.context.getDivView().unbindViewFromDiv$div_release(this.tabLayout);
        }
        as.c cVar = (as.c) this.div.f86342q.get(position);
        this.visibilityActionTracker.startTrackingViewsHierarchy(this.context, this.tabLayout, cVar.f86355a);
        this.context.getDivView().bindViewToDiv$div_release(this.tabLayout, cVar.f86355a);
        this.currentPagePosition = position;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        this.div2Logger.logTabPageChanged(this.context.getDivView(), position);
        onPageDisplayed(position);
    }

    public final void setDiv(@NotNull as asVar) {
        this.div = asVar;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.ActiveTabClickListener
    public void onActiveTabClicked(@NotNull j1 action, int tabPosition) {
        if (action.f88309e != null) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivTabsEventManager", "non-null menuItems ignored in title click action");
            }
        }
        this.div2Logger.logActiveTabTitleClick(this.context.getDivView(), this.context.getExpressionResolver(), tabPosition, action);
        DivActionBinder.handleAction$div_release$default(this.actionBinder, this.context.getDivView(), this.context.getExpressionResolver(), action, "click", null, null, 48, null);
    }
}
