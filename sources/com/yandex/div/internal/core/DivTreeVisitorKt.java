package com.yandex.div.internal.core;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import k8.y0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/BindingContext;", "Lk8/y0;", "div", "Lcom/yandex/div/core/state/DivStatePath;", "path", "getChildContext", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;Lcom/yandex/div/core/state/DivStatePath;)Lcom/yandex/div/core/view2/BindingContext;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivTreeVisitorKt {
    @NotNull
    public static final BindingContext getChildContext(@NotNull BindingContext bindingContext, @NotNull y0 y0Var, @NotNull DivStatePath divStatePath) {
        return bindingContext.getFor(bindingContext.getDivView().getRuntimeStore().getOrCreateRuntime(divStatePath, y0Var, bindingContext.getExpressionResolver()).getExpressionResolver());
    }
}
