package com.yandex.div.core.expression.variables;

import c7.a;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0015\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001b\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J+\u0010%\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/div/core/expression/variables/VariableAndConstantController;", "Lcom/yandex/div/core/expression/variables/VariableController;", "delegate", "Lcom/yandex/div/core/expression/variables/ConstantsProvider;", "constants", "<init>", "(Lcom/yandex/div/core/expression/variables/VariableController;Lcom/yandex/div/core/expression/variables/ConstantsProvider;)V", "", "name", "", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "", "names", "", "invokeOnSubscription", "Lkotlin/Function1;", "Lcom/yandex/div/data/Variable;", "", "observer", "Lcom/yandex/div/core/Disposable;", "subscribeToVariablesChange", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "subscribeToVariablesUndeclared", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "subscribeToVariableChange", "(Ljava/lang/String;Lcom/yandex/div/core/view2/errors/ErrorCollector;ZLkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "getMutableVariable", "(Ljava/lang/String;)Lcom/yandex/div/data/Variable;", "variable", "declare", "(Lcom/yandex/div/data/Variable;)V", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "owner", "callback", "setOnAnyVariableChangeCallback", "(Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "cleanupSubscriptions", "()V", "restoreSubscriptions", "Lcom/yandex/div/core/expression/variables/VariableController;", "Lcom/yandex/div/core/expression/variables/ConstantsProvider;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VariableAndConstantController implements VariableController {

    @NotNull
    private final ConstantsProvider constants;

    @NotNull
    private final VariableController delegate;

    public VariableAndConstantController(@NotNull VariableController variableController, @NotNull ConstantsProvider constantsProvider) {
        this.delegate = variableController;
        this.constants = constantsProvider;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public /* synthetic */ List captureAll() {
        return a.a(this);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(@NotNull Variable variable) {
        this.delegate.declare(variable);
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @Nullable
    public Object get(@NotNull String name) {
        Object objWrapVariableValue = VariableControllerKt.wrapVariableValue(this.constants.get(name));
        return objWrapVariableValue == null ? this.delegate.get(name) : objWrapVariableValue;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @Nullable
    public Variable getMutableVariable(@NotNull String name) {
        return this.delegate.getMutableVariable(name);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver owner, @NotNull Function1<? super Variable, Unit> callback) {
        this.delegate.setOnAnyVariableChangeCallback(owner, callback);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariableChange(@NotNull String name, @Nullable ErrorCollector errorCollector, boolean invokeOnSubscription, @NotNull Function1<? super Variable, Unit> observer) {
        return this.delegate.subscribeToVariableChange(name, errorCollector, invokeOnSubscription, observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesChange(@NotNull List<String> names, boolean invokeOnSubscription, @NotNull Function1<? super Variable, Unit> observer) {
        return this.delegate.subscribeToVariablesChange(names, invokeOnSubscription, observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesUndeclared(@NotNull List<String> names, @NotNull Function1<? super Variable, Unit> observer) {
        return Disposable.NULL;
    }
}
