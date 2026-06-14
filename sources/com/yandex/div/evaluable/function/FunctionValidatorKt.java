package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/evaluable/Function;", "", "Lcom/yandex/div/evaluable/EvaluableType;", "args", "withArgumentsValidation", "(Lcom/yandex/div/evaluable/Function;Ljava/util/List;)Lcom/yandex/div/evaluable/Function;", "", "name", "", "isMethod", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getFunctionArgumentsException", "(Ljava/lang/String;Ljava/util/List;Z)Ljava/lang/Exception;", "getMethodArgumentsException", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Exception;", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class FunctionValidatorKt {
    @NotNull
    public static final Exception getFunctionArgumentsException(@NotNull String name, @NotNull List<? extends EvaluableType> args, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        if (z10) {
            return getMethodArgumentsException(name, args);
        }
        if (args.isEmpty()) {
            return new EvaluableException("Function requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Function has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) args) + '.', null, 2, null);
    }

    public static /* synthetic */ Exception getFunctionArgumentsException$default(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return getFunctionArgumentsException(str, list, z10);
    }

    @NotNull
    public static final Exception getMethodArgumentsException(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.size() == 1) {
            return new EvaluableException("Method requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Method has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) args.subList(1, args.size())) + '.', null, 2, null);
    }

    @NotNull
    public static final Function withArgumentsValidation(@NotNull Function function, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Function.MatchResult matchResultMatchesArguments$div_evaluable = function.matchesArguments$div_evaluable(args);
        if (!(matchResultMatchesArguments$div_evaluable instanceof Function.MatchResult.Ok)) {
            if (matchResultMatchesArguments$div_evaluable instanceof Function.MatchResult.ArgCountMismatch) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(function.getHasVarArg$div_evaluable() ? "At least" : "Exactly");
                sb2.append(' ');
                sb2.append(((Function.MatchResult.ArgCountMismatch) matchResultMatchesArguments$div_evaluable).getExpected());
                sb2.append(" argument(s) expected.");
                throw new EvaluableException(sb2.toString(), null, 2, null);
            }
            if (!(matchResultMatchesArguments$div_evaluable instanceof Function.MatchResult.ArgTypeMismatch)) {
                throw new m();
            }
            if (!Intrinsics.areEqual(function.matchesArgumentsWithCast$div_evaluable(args), Function.MatchResult.Ok.INSTANCE)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Invalid argument type: expected ");
                Function.MatchResult.ArgTypeMismatch argTypeMismatch = (Function.MatchResult.ArgTypeMismatch) matchResultMatchesArguments$div_evaluable;
                sb3.append(argTypeMismatch.getExpected());
                sb3.append(", got ");
                sb3.append(argTypeMismatch.getActual());
                sb3.append('.');
                throw new EvaluableException(sb3.toString(), null, 2, null);
            }
        }
        return function;
    }
}
