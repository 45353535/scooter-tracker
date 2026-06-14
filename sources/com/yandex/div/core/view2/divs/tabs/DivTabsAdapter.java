package com.yandex.div.core.view2.divs.tabs;

import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.j1;
import k8.y0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001Bo\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J'\u0010'\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020/2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010.\u001a\u00020%¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020/2\u0006\u00102\u001a\u00020\u0003H\u0014¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020/¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020:¢\u0006\u0004\b;\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b\u000e\u0010?R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010ER\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010FR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\bK\u0010LR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010MR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010NR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010T\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u001b0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020S0U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0017\u0010Y\u001a\u00020X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R$\u0010b\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi;", "Lcom/yandex/div/core/view2/divs/tabs/DivSimpleTab;", "Landroid/view/ViewGroup;", "Lk8/j1;", "Lcom/yandex/div/internal/viewpool/ViewPool;", "viewPool", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$TabbedCardConfig;", "tabbedCardConfig", "Lcom/yandex/div/internal/widget/tabs/HeightCalculatorFactory;", "heightCalculatorFactory", "", "isDynamicHeight", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;", "textStyleProvider", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager;", "divTabsEventManager", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsActiveStateTracker;", "activeStateTracker", "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lcom/yandex/div/core/downloader/DivPatchCache;", "divPatchCache", "<init>", "(Lcom/yandex/div/internal/viewpool/ViewPool;Landroid/view/View;Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$TabbedCardConfig;Lcom/yandex/div/internal/widget/tabs/HeightCalculatorFactory;ZLcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;Lcom/yandex/div/core/view2/DivViewCreator;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager;Lcom/yandex/div/core/view2/divs/tabs/DivTabsActiveStateTracker;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/downloader/DivPatchCache;)V", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "tabNumber", "createItemView", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;I)Landroid/view/View;", FirebaseAnalytics.Param.INDEX, "getChildPath", "(I)Lcom/yandex/div/core/state/DivStatePath;", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$Input;", "data", "selectedTab", "", "setData", "(Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$Input;I)V", "tabView", "tab", "bindTabData", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/divs/tabs/DivSimpleTab;I)Landroid/view/ViewGroup;", "unbindTabData", "(Landroid/view/ViewGroup;)V", "notifyStateChanged", "()V", "Lk8/y0$q;", "applyPatch", "(Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/y0$q;)Lk8/y0$q;", "Landroid/view/View;", "Z", "()Z", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "Lcom/yandex/div/core/view2/DivViewCreator;", "Lcom/yandex/div/core/view2/DivBinder;", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager;", "getDivTabsEventManager", "()Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager;", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsActiveStateTracker;", "getActiveStateTracker", "()Lcom/yandex/div/core/view2/divs/tabs/DivTabsActiveStateTracker;", "Lcom/yandex/div/core/state/DivStatePath;", "Lcom/yandex/div/core/downloader/DivPatchCache;", "", "Lcom/yandex/div/core/view2/divs/tabs/TabModel;", "tabModels", "Ljava/util/Map;", "", "childStates", "", "childIds", "Ljava/util/List;", "Lcom/yandex/div/core/view2/divs/tabs/PagerController;", "pager", "Lcom/yandex/div/core/view2/divs/tabs/PagerController;", "getPager", "()Lcom/yandex/div/core/view2/divs/tabs/PagerController;", "value", "getStatePath", "()Lcom/yandex/div/core/state/DivStatePath;", "setStatePath", "(Lcom/yandex/div/core/state/DivStatePath;)V", "statePath", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivTabsAdapter extends BaseDivTabbedCardUi<DivSimpleTab, ViewGroup, j1> {

    @NotNull
    private final DivTabsActiveStateTracker activeStateTracker;

    @NotNull
    private BindingContext bindingContext;

    @NotNull
    private List<String> childIds;

    @NotNull
    private final Map<String, DivStatePath> childStates;

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivTabsEventManager divTabsEventManager;
    private final boolean isDynamicHeight;

    @NotNull
    private final PagerController pager;

    @NotNull
    private DivStatePath path;

    @NotNull
    private final Map<ViewGroup, TabModel> tabModels;

    @NotNull
    private final View view;

    @NotNull
    private final DivViewCreator viewCreator;

    public DivTabsAdapter(@NotNull ViewPool viewPool, @NotNull View view, @NotNull BaseDivTabbedCardUi.TabbedCardConfig tabbedCardConfig, @NotNull HeightCalculatorFactory heightCalculatorFactory, boolean z10, @NotNull BindingContext bindingContext, @NotNull TabTextStyleProvider tabTextStyleProvider, @NotNull DivViewCreator divViewCreator, @NotNull DivBinder divBinder, @NotNull DivTabsEventManager divTabsEventManager, @NotNull DivTabsActiveStateTracker divTabsActiveStateTracker, @NotNull DivStatePath divStatePath, @NotNull DivPatchCache divPatchCache) {
        super(viewPool, view, tabbedCardConfig, heightCalculatorFactory, tabTextStyleProvider, divTabsEventManager, divTabsEventManager, divTabsActiveStateTracker);
        this.view = view;
        this.isDynamicHeight = z10;
        this.bindingContext = bindingContext;
        this.viewCreator = divViewCreator;
        this.divBinder = divBinder;
        this.divTabsEventManager = divTabsEventManager;
        this.activeStateTracker = divTabsActiveStateTracker;
        this.path = divStatePath;
        this.divPatchCache = divPatchCache;
        this.tabModels = new LinkedHashMap();
        this.childStates = new LinkedHashMap();
        this.childIds = CollectionsKt.emptyList();
        this.pager = new PagerController(this.mPager);
    }

    private final View createItemView(y0 div, ExpressionResolver resolver, int tabNumber) {
        View viewCreate = this.viewCreator.create(div, resolver);
        viewCreate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.divBinder.bind(this.bindingContext, viewCreate, div, getChildPath(tabNumber));
        return viewCreate;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final DivStatePath getChildPath(int index) {
        Map<String, DivStatePath> map = this.childStates;
        String str = this.childIds.get(index);
        DivStatePath divStatePathAppendDiv = map.get(str);
        if (divStatePathAppendDiv == null) {
            divStatePathAppendDiv = this.path.appendDiv(this.childIds.get(index));
            map.put(str, divStatePathAppendDiv);
        }
        return divStatePathAppendDiv;
    }

    @Nullable
    public final y0.q applyPatch(@NotNull ExpressionResolver resolver, @NotNull y0.q div) {
        this.divPatchCache.getPatch(this.bindingContext.getDivView().getDataTag());
        return null;
    }

    @NotNull
    public final DivTabsActiveStateTracker getActiveStateTracker() {
        return this.activeStateTracker;
    }

    @NotNull
    public final DivTabsEventManager getDivTabsEventManager() {
        return this.divTabsEventManager;
    }

    @NotNull
    public final PagerController getPager() {
        return this.pager;
    }

    /* JADX INFO: renamed from: isDynamicHeight, reason: from getter */
    public final boolean getIsDynamicHeight() {
        return this.isDynamicHeight;
    }

    public final void notifyStateChanged() {
        for (Map.Entry<ViewGroup, TabModel> entry : this.tabModels.entrySet()) {
            ViewGroup key = entry.getKey();
            TabModel value = entry.getValue();
            this.divBinder.bind(this.bindingContext, value.getView(), value.getDiv(), getChildPath(value.getIndex()));
            key.requestLayout();
        }
    }

    public final void setBindingContext(@NotNull BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    public final void setData(@NotNull BaseDivTabbedCardUi.Input<DivSimpleTab> data, int selectedTab) {
        this.childIds = DivPathUtils.getIds$default(DivPathUtils.INSTANCE, data.getTabs(), new Function1<DivSimpleTab, y0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsAdapter.setData.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final y0 invoke(DivSimpleTab divSimpleTab) {
                return divSimpleTab.getItem().f86355a;
            }
        }, null, 2, null);
        super.setData(data, this.bindingContext.getExpressionResolver(), ReleasablesKt.getExpressionSubscriber(this.view));
        this.tabModels.clear();
        this.mPager.setCurrentItem(selectedTab, true);
    }

    public final void setStatePath(@NotNull DivStatePath divStatePath) {
        this.path = divStatePath;
        this.childStates.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    @NotNull
    public ViewGroup bindTabData(@NotNull ViewGroup tabView, @NotNull DivSimpleTab tab, int tabNumber) {
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(tabView, this.bindingContext.getDivView());
        y0 y0Var = tab.getItem().f86355a;
        View viewCreateItemView = createItemView(y0Var, this.bindingContext.getExpressionResolver(), tabNumber);
        this.tabModels.put(tabView, new TabModel(tabNumber, y0Var, viewCreateItemView));
        tabView.addView(viewCreateItemView);
        return tabView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    public void unbindTabData(@NotNull ViewGroup tabView) {
        this.tabModels.remove(tabView);
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(tabView, this.bindingContext.getDivView());
    }
}
