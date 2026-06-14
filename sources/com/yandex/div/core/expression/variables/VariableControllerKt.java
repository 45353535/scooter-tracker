package com.yandex.div.core.expression.variables;

import android.net.Uri;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.kw;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "wrapVariableValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/yandex/div/core/expression/variables/VariableController;", "Lk8/kw;", "divVariable", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "", "declare", "(Lcom/yandex/div/core/expression/variables/VariableController;Lk8/kw;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class VariableControllerKt {
    public static final void declare(@NotNull VariableController variableController, @NotNull kw kwVar, @NotNull ExpressionResolver expressionResolver, @NotNull ErrorCollector errorCollector) {
        try {
            variableController.declare(DivVariablesParserKt.toVariable(kwVar, expressionResolver));
        } catch (VariableDeclarationException e10) {
            errorCollector.logError(e10);
        }
    }

    @Nullable
    public static final Object wrapVariableValue(@Nullable Object obj) {
        return obj instanceof Uri ? Url.m7670boximpl(Url.m7671constructorimpl(obj.toString())) : obj;
    }
}
