package com.yandex.div.core.view2.state;

import android.view.View;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import k8.ea;
import k8.y0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/view2/state/DivJoinedStateSwitcher;", "Lcom/yandex/div/core/view2/state/DivStateSwitcher;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "<init>", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/view2/DivBinder;)V", "", "Lcom/yandex/div/core/state/DivStatePath;", "pathList", "rootPath", "findCommonPath", "(Ljava/util/List;Lcom/yandex/div/core/state/DivStatePath;)Lcom/yandex/div/core/state/DivStatePath;", "Lk8/ea$c;", "state", "paths", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "switchStates", "(Lk8/ea$c;Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/core/view2/DivBinder;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivJoinedStateSwitcher implements DivStateSwitcher {

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final Div2View divView;

    public DivJoinedStateSwitcher(@NotNull Div2View div2View, @NotNull DivBinder divBinder) {
        this.divView = div2View;
        this.divBinder = divBinder;
    }

    private final DivStatePath findCommonPath(List<DivStatePath> pathList, DivStatePath rootPath) {
        int size = pathList.size();
        if (size == 0) {
            return rootPath;
        }
        if (size == 1) {
            return (DivStatePath) CollectionsKt.first((List) pathList);
        }
        Iterator<T> it = pathList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            DivStatePath divStatePath = (DivStatePath) it.next();
            next = DivStatePath.INSTANCE.lowestCommonAncestor$div_release((DivStatePath) next, divStatePath);
            if (next == null) {
                next = rootPath;
            }
        }
        return (DivStatePath) next;
    }

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    public void switchStates(@NotNull ea.c state, @NotNull List<DivStatePath> paths, @NotNull ExpressionResolver resolver) throws StateConflictException {
        View childAt = this.divView.getChildAt(0);
        y0 y0Var = state.f87215a;
        DivStatePath divStatePathFromState$div_release = DivStatePath.INSTANCE.fromState$div_release(state);
        DivStatePath divStatePathFindCommonPath = findCommonPath(paths, divStatePathFromState$div_release);
        if (!divStatePathFindCommonPath.isRootPath()) {
            Pair<DivStateLayout, y0.o> pairTryFindStateDivAndLayout$div_release = DivPathUtils.INSTANCE.tryFindStateDivAndLayout$div_release(childAt, state, divStatePathFindCommonPath, resolver);
            if (pairTryFindStateDivAndLayout$div_release == null) {
                return;
            }
            DivStateLayout divStateLayoutComponent1 = pairTryFindStateDivAndLayout$div_release.component1();
            y0.o oVarComponent2 = pairTryFindStateDivAndLayout$div_release.component2();
            if (divStateLayoutComponent1 != null) {
                DivStatePath path = divStateLayoutComponent1.getPath();
                divStatePathFromState$div_release = path == null ? divStatePathFindCommonPath : path;
                y0Var = oVarComponent2;
                childAt = divStateLayoutComponent1;
            }
        }
        BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(childAt);
        if (bindingContext == null) {
            bindingContext = this.divView.getBindingContext();
        }
        this.divBinder.bind(bindingContext, childAt, y0Var, divStatePathFromState$div_release.parentState());
        this.divBinder.attachIndicators$div_release();
    }
}
