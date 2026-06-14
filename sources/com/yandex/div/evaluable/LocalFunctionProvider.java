package com.yandex.div.evaluable;

import com.yandex.div.evaluable.Function;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/evaluable/LocalFunctionProvider;", "Lcom/yandex/div/evaluable/FunctionProvider;", "", "Lcom/yandex/div/evaluable/Function;", "functions", "<init>", "(Ljava/util/List;)V", "", "name", "Lkotlin/Function1;", "Lcom/yandex/div/evaluable/Function$MatchResult;", "matcher", "findFunction", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/evaluable/Function;", "Lcom/yandex/div/evaluable/EvaluableType;", "args", "get", "(Ljava/lang/String;Ljava/util/List;)Lcom/yandex/div/evaluable/Function;", "getMethod", "Ljava/util/List;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalFunctionProvider implements FunctionProvider {

    @NotNull
    private final List<Function> functions;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalFunctionProvider(@NotNull List<? extends Function> functions) {
        Intrinsics.checkNotNullParameter(functions, "functions");
        this.functions = functions;
    }

    private final Function findFunction(String name, Function1<? super Function, ? extends Function.MatchResult> matcher) {
        List<Function> list = this.functions;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Function function = (Function) obj;
            if (Intrinsics.areEqual(function.getName(), name) && Intrinsics.areEqual(matcher.invoke(function), Function.MatchResult.Ok.INSTANCE)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (Function) arrayList.get(0);
        }
        throw new EvaluableException("Function " + arrayList.get(0) + " declared multiple times.", null, 2, null);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function get(@NotNull String name, @NotNull final List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Function functionFindFunction = findFunction(name, new Function1<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.get.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Function.MatchResult invoke(@NotNull Function findFunction) {
                Intrinsics.checkNotNullParameter(findFunction, "$this$findFunction");
                return findFunction.matchesArguments$div_evaluable(args);
            }
        });
        if (functionFindFunction != null) {
            return functionFindFunction;
        }
        Function functionFindFunction2 = findFunction(name, new Function1<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.get.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Function.MatchResult invoke(@NotNull Function findFunction) {
                Intrinsics.checkNotNullParameter(findFunction, "$this$findFunction");
                return findFunction.matchesArgumentsWithCast$div_evaluable(args);
            }
        });
        if (functionFindFunction2 != null) {
            return functionFindFunction2;
        }
        throw new MissingLocalFunctionException(name, args);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function getMethod(@NotNull String name, @NotNull final List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Function functionFindFunction = findFunction(name, new Function1<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.getMethod.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Function.MatchResult invoke(@NotNull Function findFunction) {
                Intrinsics.checkNotNullParameter(findFunction, "$this$findFunction");
                return findFunction.matchesArguments$div_evaluable(args);
            }
        });
        if (functionFindFunction != null) {
            return functionFindFunction;
        }
        Function functionFindFunction2 = findFunction(name, new Function1<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.getMethod.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Function.MatchResult invoke(@NotNull Function findFunction) {
                Intrinsics.checkNotNullParameter(findFunction, "$this$findFunction");
                return findFunction.matchesArgumentsWithCast$div_evaluable(args);
            }
        });
        if (functionFindFunction2 != null) {
            return functionFindFunction2;
        }
        throw new MissingLocalFunctionException(name, args);
    }
}
