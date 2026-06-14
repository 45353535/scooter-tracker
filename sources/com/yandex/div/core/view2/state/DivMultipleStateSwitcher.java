package com.yandex.div.core.view2.state;

import android.view.View;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import k8.ea;
import k8.y0;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/view2/state/DivMultipleStateSwitcher;", "Lcom/yandex/div/core/view2/state/DivStateSwitcher;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "<init>", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/view2/DivBinder;)V", "Lk8/ea$c;", "state", "", "Lcom/yandex/div/core/state/DivStatePath;", "paths", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "switchStates", "(Lk8/ea$c;Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/core/view2/DivBinder;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivMultipleStateSwitcher implements DivStateSwitcher {

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final Div2View divView;

    public DivMultipleStateSwitcher(@NotNull Div2View div2View, @NotNull DivBinder divBinder) {
        this.divView = div2View;
        this.divBinder = divBinder;
    }

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    public void switchStates(@NotNull ea.c state, @NotNull List<DivStatePath> paths, @NotNull ExpressionResolver resolver) throws StateConflictException {
        View childAt = this.divView.getChildAt(0);
        y0 y0Var = state.f87215a;
        List<DivStatePath> listCompactPathList$div_release = DivPathUtils.INSTANCE.compactPathList$div_release(paths);
        ArrayList<DivStatePath> arrayList = new ArrayList();
        for (Object obj : listCompactPathList$div_release) {
            if (!((DivStatePath) obj).isRootPath()) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (DivStatePath divStatePath : arrayList) {
            Pair<DivStateLayout, y0.o> pairTryFindStateDivAndLayout$div_release = DivPathUtils.INSTANCE.tryFindStateDivAndLayout$div_release(childAt, state, divStatePath, resolver);
            if (pairTryFindStateDivAndLayout$div_release == null) {
                return;
            }
            DivStateLayout divStateLayoutComponent1 = pairTryFindStateDivAndLayout$div_release.component1();
            y0.o oVarComponent2 = pairTryFindStateDivAndLayout$div_release.component2();
            if (divStateLayoutComponent1 != null && !linkedHashSet.contains(divStateLayoutComponent1)) {
                DivStatePath path = divStateLayoutComponent1.getPath();
                if (path != null) {
                    divStatePath = path;
                }
                BindingContext bindingContext = divStateLayoutComponent1.getBindingContext();
                if (bindingContext == null) {
                    bindingContext = this.divView.getBindingContext();
                }
                this.divBinder.bind(bindingContext, divStateLayoutComponent1, oVarComponent2, divStatePath.parentState());
                linkedHashSet.add(divStateLayoutComponent1);
            }
        }
        if (linkedHashSet.isEmpty()) {
            this.divBinder.bind(this.divView.getBindingContext(), childAt, y0Var, DivStatePath.INSTANCE.fromState$div_release(state));
        }
        this.divBinder.attachIndicators$div_release();
    }
}
