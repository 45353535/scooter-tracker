package com.yandex.div.core.util.inputfilter;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/util/inputfilter/ExpressionInputFilter;", "Lcom/yandex/div/core/util/inputfilter/BaseInputFilter;", "condition", "Lcom/yandex/div/json/expressions/Expression;", "", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "checkValue", "value", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExpressionInputFilter implements BaseInputFilter {

    @NotNull
    private final Expression<Boolean> condition;

    @NotNull
    private final ExpressionResolver resolver;

    public ExpressionInputFilter(@NotNull Expression<Boolean> expression, @NotNull ExpressionResolver expressionResolver) {
        this.condition = expression;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(@NotNull String value) {
        return this.condition.evaluate(this.resolver).booleanValue();
    }
}
