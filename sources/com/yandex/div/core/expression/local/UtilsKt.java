package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"asImpl", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "getAsImpl", "(Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "variableController", "Lcom/yandex/div/core/expression/variables/VariableController;", "getVariableController", "(Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/expression/variables/VariableController;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class UtilsKt {
    @Nullable
    public static final ExpressionResolverImpl getAsImpl(@NotNull ExpressionResolver expressionResolver) {
        if (expressionResolver instanceof ExpressionResolverImpl) {
            return (ExpressionResolverImpl) expressionResolver;
        }
        return null;
    }

    @Nullable
    public static final VariableController getVariableController(@NotNull ExpressionResolver expressionResolver) {
        ExpressionResolverImpl asImpl = getAsImpl(expressionResolver);
        if (asImpl != null) {
            return asImpl.getVariableController();
        }
        return null;
    }
}
