package com.yandex.div.core.view2.divs.tabs;

import androidx.viewpager.widget.ViewPager;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import k8.as;
import k8.j1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsActiveStateTracker;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$ActiveTabClickListener;", "Lk8/j1;", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lcom/yandex/div/core/Div2Logger;", "div2Logger", "Lcom/yandex/div/core/state/TabsStateCache;", "tabsStateCache", "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "runtimeVisitor", "Lk8/as;", "div", "<init>", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/state/TabsStateCache;Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;Lk8/as;)V", "", C4240b4.i.L, "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "action", "tabPosition", "onActiveTabClicked", "(Lk8/j1;I)V", "Lcom/yandex/div/core/view2/BindingContext;", "Lcom/yandex/div/core/state/DivStatePath;", "Lcom/yandex/div/core/Div2Logger;", "Lcom/yandex/div/core/state/TabsStateCache;", "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "Lk8/as;", "getDiv", "()Lk8/as;", "setDiv", "(Lk8/as;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivTabsActiveStateTracker implements ViewPager.OnPageChangeListener, BaseDivTabbedCardUi.ActiveTabClickListener<j1> {

    @NotNull
    private final BindingContext context;

    @NotNull
    private as div;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final DivStatePath path;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TabsStateCache tabsStateCache;

    public DivTabsActiveStateTracker(@NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath, @NotNull Div2Logger div2Logger, @NotNull TabsStateCache tabsStateCache, @NotNull DivRuntimeVisitor divRuntimeVisitor, @NotNull as asVar) {
        this.context = bindingContext;
        this.path = divStatePath;
        this.div2Logger = div2Logger;
        this.tabsStateCache = tabsStateCache;
        this.runtimeVisitor = divRuntimeVisitor;
        this.div = asVar;
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
        this.tabsStateCache.putSelectedTab(this.context.getDivView().getDataTag().getId(), this.path.getFullPath$div_release(), position);
        this.runtimeVisitor.createAndAttachRuntimesToTabs(this.context.getDivView(), this.div, this.path, this.context.getExpressionResolver());
    }

    public final void setDiv(@NotNull as asVar) {
        this.div = asVar;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.ActiveTabClickListener
    public void onActiveTabClicked(@NotNull j1 action, int tabPosition) {
    }
}
