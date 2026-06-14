package com.yandex.div.core.expression.variables;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.VariableProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u0003H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\bH&¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH&¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0016¢\u0006\u0004\b\"\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/variables/VariableController;", "Lcom/yandex/div/evaluable/VariableProvider;", "", "", "names", "", "invokeOnSubscription", "Lkotlin/Function1;", "Lcom/yandex/div/data/Variable;", "", "observer", "Lcom/yandex/div/core/Disposable;", "subscribeToVariablesChange", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "subscribeToVariablesUndeclared", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "name", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "subscribeToVariableChange", "(Ljava/lang/String;Lcom/yandex/div/core/view2/errors/ErrorCollector;ZLkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "getMutableVariable", "(Ljava/lang/String;)Lcom/yandex/div/data/Variable;", "variable", "declare", "(Lcom/yandex/div/data/Variable;)V", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "owner", "callback", "setOnAnyVariableChangeCallback", "(Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "cleanupSubscriptions", "()V", "restoreSubscriptions", "captureAll", "()Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface VariableController extends VariableProvider {
    @NotNull
    List<Variable> captureAll();

    void cleanupSubscriptions();

    void declare(@NotNull Variable variable);

    @Nullable
    Variable getMutableVariable(@NotNull String name);

    void restoreSubscriptions();

    void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver owner, @NotNull Function1<? super Variable, Unit> callback);

    @NotNull
    Disposable subscribeToVariableChange(@NotNull String name, @Nullable ErrorCollector errorCollector, boolean invokeOnSubscription, @NotNull Function1<? super Variable, Unit> observer);

    @NotNull
    Disposable subscribeToVariablesChange(@NotNull List<String> names, boolean invokeOnSubscription, @NotNull Function1<? super Variable, Unit> observer);

    @NotNull
    Disposable subscribeToVariablesUndeclared(@NotNull List<String> names, @NotNull Function1<? super Variable, Unit> observer);
}
