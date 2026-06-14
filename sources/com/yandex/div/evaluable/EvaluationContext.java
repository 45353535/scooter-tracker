package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/evaluable/EvaluationContext;", "", "variableProvider", "Lcom/yandex/div/evaluable/VariableProvider;", "storedValueProvider", "Lcom/yandex/div/evaluable/StoredValueProvider;", "functionProvider", "Lcom/yandex/div/evaluable/FunctionProvider;", "warningSender", "Lcom/yandex/div/evaluable/WarningSender;", "(Lcom/yandex/div/evaluable/VariableProvider;Lcom/yandex/div/evaluable/StoredValueProvider;Lcom/yandex/div/evaluable/FunctionProvider;Lcom/yandex/div/evaluable/WarningSender;)V", "getFunctionProvider", "()Lcom/yandex/div/evaluable/FunctionProvider;", "getStoredValueProvider", "()Lcom/yandex/div/evaluable/StoredValueProvider;", "getVariableProvider", "()Lcom/yandex/div/evaluable/VariableProvider;", "getWarningSender", "()Lcom/yandex/div/evaluable/WarningSender;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EvaluationContext {

    @NotNull
    private final FunctionProvider functionProvider;

    @NotNull
    private final StoredValueProvider storedValueProvider;

    @NotNull
    private final VariableProvider variableProvider;

    @NotNull
    private final WarningSender warningSender;

    public EvaluationContext(@NotNull VariableProvider variableProvider, @NotNull StoredValueProvider storedValueProvider, @NotNull FunctionProvider functionProvider, @NotNull WarningSender warningSender) {
        Intrinsics.checkNotNullParameter(variableProvider, "variableProvider");
        Intrinsics.checkNotNullParameter(storedValueProvider, "storedValueProvider");
        Intrinsics.checkNotNullParameter(functionProvider, "functionProvider");
        Intrinsics.checkNotNullParameter(warningSender, "warningSender");
        this.variableProvider = variableProvider;
        this.storedValueProvider = storedValueProvider;
        this.functionProvider = functionProvider;
        this.warningSender = warningSender;
    }

    @NotNull
    public final FunctionProvider getFunctionProvider() {
        return this.functionProvider;
    }

    @NotNull
    public final StoredValueProvider getStoredValueProvider() {
        return this.storedValueProvider;
    }

    @NotNull
    public final VariableProvider getVariableProvider() {
        return this.variableProvider;
    }

    @NotNull
    public final WarningSender getWarningSender() {
        return this.warningSender;
    }
}
