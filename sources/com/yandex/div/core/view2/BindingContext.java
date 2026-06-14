package com.yandex.div.core.view2;

import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/view2/BindingContext;", "", "divView", "Lcom/yandex/div/core/view2/Div2View;", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "getDivView", "()Lcom/yandex/div/core/view2/Div2View;", "getExpressionResolver", "()Lcom/yandex/div/json/expressions/ExpressionResolver;", "getFor", "resolver", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BindingContext {

    @NotNull
    private final Div2View divView;

    @NotNull
    private final ExpressionResolver expressionResolver;

    public BindingContext(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        this.divView = div2View;
        this.expressionResolver = expressionResolver;
    }

    @NotNull
    public final Div2View getDivView() {
        return this.divView;
    }

    @NotNull
    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    @NotNull
    public final BindingContext getFor(@NotNull ExpressionResolver resolver) {
        return Intrinsics.areEqual(this.expressionResolver, resolver) ? this : new BindingContext(this.divView, resolver);
    }
}
