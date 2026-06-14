package com.yandex.div.core.util.validator;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/util/validator/ExpressionValidator;", "Lcom/yandex/div/core/util/validator/BaseValidator;", "", "allowEmpty", "Lkotlin/Function0;", "calculateExpression", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "", "input", "validate", "(Ljava/lang/String;)Z", "Lkotlin/jvm/functions/Function0;", "getCalculateExpression", "()Lkotlin/jvm/functions/Function0;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExpressionValidator extends BaseValidator {

    @NotNull
    private final Function0<Boolean> calculateExpression;

    public ExpressionValidator(boolean z10, @NotNull Function0<Boolean> function0) {
        super(z10);
        this.calculateExpression = function0;
    }

    @Override // com.yandex.div.core.util.validator.BaseValidator
    public boolean validate(@NotNull String input) {
        return (getAllowEmpty() && input.length() == 0) || this.calculateExpression.invoke().booleanValue();
    }
}
