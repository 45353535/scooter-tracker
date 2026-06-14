package com.yandex.div.core.view2;

import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.y0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/DivValidator;", "Lcom/yandex/div/internal/core/DivVisitor;", "", "<init>", "()V", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "validate", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "data", "defaultVisit", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Boolean;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivValidator extends DivVisitor<Boolean> {
    public boolean validate(@NotNull y0 div, @NotNull ExpressionResolver resolver) {
        return visit(div, resolver).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public Boolean defaultVisit(@NotNull y0 data, @NotNull ExpressionResolver resolver) {
        return Boolean.TRUE;
    }
}
