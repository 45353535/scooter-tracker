package com.yandex.div.evaluable;

import com.taurusx.tax.f.y;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 .2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\b*\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/yandex/div/evaluable/Function;", "", "<init>", "()V", "", "Lcom/yandex/div/evaluable/EvaluableType;", "argTypes", "Lkotlin/Function2;", "", "matches", "Lcom/yandex/div/evaluable/Function$MatchResult;", "matchesArguments", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lcom/yandex/div/evaluable/Function$MatchResult;", "type", "canCastTo", "(Lcom/yandex/div/evaluable/EvaluableType;Lcom/yandex/div/evaluable/EvaluableType;)Z", "Lcom/yandex/div/evaluable/EvaluationContext;", "evaluationContext", "Lcom/yandex/div/evaluable/ExpressionContext;", "expressionContext", "args", "evaluate-ex6DHhM", "(Lcom/yandex/div/evaluable/EvaluationContext;Lcom/yandex/div/evaluable/Evaluable;Ljava/util/List;)Ljava/lang/Object;", "evaluate", "invoke-ex6DHhM", "invoke", "matchesArguments$div_evaluable", "(Ljava/util/List;)Lcom/yandex/div/evaluable/Function$MatchResult;", "matchesArgumentsWithCast$div_evaluable", "matchesArgumentsWithCast", "", "toString", "()Ljava/lang/String;", "getName", "name", "Lcom/yandex/div/evaluable/FunctionArgument;", "getDeclaredArgs", "()Ljava/util/List;", "declaredArgs", "getResultType", "()Lcom/yandex/div/evaluable/EvaluableType;", "resultType", "isPure", "()Z", "getHasVarArg$div_evaluable", "hasVarArg", y.f66058y, "MatchResult", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Function {

    @NotNull
    public static final Function STUB = new Function() { // from class: com.yandex.div.evaluable.Function$Companion$STUB$1

        @NotNull
        private final String name = "stub";

        @NotNull
        private final List<FunctionArgument> declaredArgs = CollectionsKt.emptyList();

        @NotNull
        private final EvaluableType resultType = EvaluableType.BOOLEAN;
        private final boolean isPure = true;

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        /* JADX INFO: renamed from: evaluate-ex6DHhM */
        protected Object mo7589evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
            Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
            Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
            Intrinsics.checkNotNullParameter(args, "args");
            return Boolean.TRUE;
        }

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        public List<FunctionArgument> getDeclaredArgs() {
            return this.declaredArgs;
        }

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        public EvaluableType getResultType() {
            return this.resultType;
        }

        @Override // com.yandex.div.evaluable.Function
        /* JADX INFO: renamed from: isPure, reason: from getter */
        public boolean getIsPure() {
            return this.isPure;
        }
    };

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/evaluable/Function$MatchResult;", "", "()V", "ArgCountMismatch", "ArgTypeMismatch", "Ok", "Lcom/yandex/div/evaluable/Function$MatchResult$ArgCountMismatch;", "Lcom/yandex/div/evaluable/Function$MatchResult$ArgTypeMismatch;", "Lcom/yandex/div/evaluable/Function$MatchResult$Ok;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class MatchResult {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/evaluable/Function$MatchResult$ArgCountMismatch;", "Lcom/yandex/div/evaluable/Function$MatchResult;", "expected", "", "(I)V", "getExpected", "()I", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ArgCountMismatch extends MatchResult {
            private final int expected;

            public ArgCountMismatch(int i10) {
                super(null);
                this.expected = i10;
            }

            public final int getExpected() {
                return this.expected;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div/evaluable/Function$MatchResult$ArgTypeMismatch;", "Lcom/yandex/div/evaluable/Function$MatchResult;", "expected", "Lcom/yandex/div/evaluable/EvaluableType;", "actual", "(Lcom/yandex/div/evaluable/EvaluableType;Lcom/yandex/div/evaluable/EvaluableType;)V", "getActual", "()Lcom/yandex/div/evaluable/EvaluableType;", "getExpected", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ArgTypeMismatch extends MatchResult {

            @NotNull
            private final EvaluableType actual;

            @NotNull
            private final EvaluableType expected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ArgTypeMismatch(@NotNull EvaluableType expected, @NotNull EvaluableType actual) {
                super(null);
                Intrinsics.checkNotNullParameter(expected, "expected");
                Intrinsics.checkNotNullParameter(actual, "actual");
                this.expected = expected;
                this.actual = actual;
            }

            @NotNull
            public final EvaluableType getActual() {
                return this.actual;
            }

            @NotNull
            public final EvaluableType getExpected() {
                return this.expected;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/evaluable/Function$MatchResult$Ok;", "Lcom/yandex/div/evaluable/Function$MatchResult;", "()V", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Ok extends MatchResult {

            @NotNull
            public static final Ok INSTANCE = new Ok();

            private Ok() {
                super(null);
            }
        }

        public /* synthetic */ MatchResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MatchResult() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluableType.values().length];
            try {
                iArr[EvaluableType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canCastTo(EvaluableType evaluableType, EvaluableType evaluableType2) {
        return evaluableType == EvaluableType.INTEGER && WhenMappings.$EnumSwitchMapping$0[evaluableType2.ordinal()] == 1;
    }

    private final MatchResult matchesArguments(List<? extends EvaluableType> argTypes, Function2<? super EvaluableType, ? super EvaluableType, Boolean> matches) {
        int size = getDeclaredArgs().size();
        int size2 = getHasVarArg$div_evaluable() ? Integer.MAX_VALUE : getDeclaredArgs().size();
        if (argTypes.size() < size || argTypes.size() > size2) {
            return new MatchResult.ArgCountMismatch(size);
        }
        int size3 = argTypes.size();
        for (int i10 = 0; i10 < size3; i10++) {
            EvaluableType type = getDeclaredArgs().get(g.j(i10, CollectionsKt.getLastIndex(getDeclaredArgs()))).getType();
            if (!matches.invoke(argTypes.get(i10), type).booleanValue()) {
                return new MatchResult.ArgTypeMismatch(type, argTypes.get(i10));
            }
        }
        return MatchResult.Ok.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    protected abstract Object mo7589evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args);

    @NotNull
    public abstract List<FunctionArgument> getDeclaredArgs();

    public final boolean getHasVarArg$div_evaluable() {
        FunctionArgument functionArgument = (FunctionArgument) CollectionsKt.lastOrNull((List) getDeclaredArgs());
        if (functionArgument != null) {
            return functionArgument.getIsVariadic();
        }
        return false;
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public abstract EvaluableType getResultType();

    @NotNull
    /* JADX INFO: renamed from: invoke-ex6DHhM, reason: not valid java name */
    public final Object m7618invokeex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        EvaluableType evaluableType;
        EvaluableType evaluableType2;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object objMo7589evaluateex6DHhM = mo7589evaluateex6DHhM(evaluationContext, expressionContext, args);
        EvaluableType.Companion companion = EvaluableType.INSTANCE;
        boolean z10 = objMo7589evaluateex6DHhM instanceof Long;
        if (z10) {
            evaluableType = EvaluableType.INTEGER;
        } else if (objMo7589evaluateex6DHhM instanceof Double) {
            evaluableType = EvaluableType.NUMBER;
        } else if (objMo7589evaluateex6DHhM instanceof Boolean) {
            evaluableType = EvaluableType.BOOLEAN;
        } else if (objMo7589evaluateex6DHhM instanceof String) {
            evaluableType = EvaluableType.STRING;
        } else if (objMo7589evaluateex6DHhM instanceof DateTime) {
            evaluableType = EvaluableType.DATETIME;
        } else if (objMo7589evaluateex6DHhM instanceof Color) {
            evaluableType = EvaluableType.COLOR;
        } else if (objMo7589evaluateex6DHhM instanceof Url) {
            evaluableType = EvaluableType.URL;
        } else if (objMo7589evaluateex6DHhM instanceof JSONObject) {
            evaluableType = EvaluableType.DICT;
        } else {
            if (!(objMo7589evaluateex6DHhM instanceof JSONArray)) {
                if (objMo7589evaluateex6DHhM == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to find type for ");
                Intrinsics.checkNotNull(objMo7589evaluateex6DHhM);
                sb2.append(objMo7589evaluateex6DHhM.getClass().getName());
                throw new EvaluableException(sb2.toString(), null, 2, null);
            }
            evaluableType = EvaluableType.ARRAY;
        }
        if (evaluableType == getResultType()) {
            return objMo7589evaluateex6DHhM;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Function ");
        sb3.append(this);
        sb3.append(" returned ");
        if (z10) {
            evaluableType2 = EvaluableType.INTEGER;
        } else if (objMo7589evaluateex6DHhM instanceof Double) {
            evaluableType2 = EvaluableType.NUMBER;
        } else if (objMo7589evaluateex6DHhM instanceof Boolean) {
            evaluableType2 = EvaluableType.BOOLEAN;
        } else if (objMo7589evaluateex6DHhM instanceof String) {
            evaluableType2 = EvaluableType.STRING;
        } else if (objMo7589evaluateex6DHhM instanceof DateTime) {
            evaluableType2 = EvaluableType.DATETIME;
        } else if (objMo7589evaluateex6DHhM instanceof Color) {
            evaluableType2 = EvaluableType.COLOR;
        } else if (objMo7589evaluateex6DHhM instanceof Url) {
            evaluableType2 = EvaluableType.URL;
        } else if (objMo7589evaluateex6DHhM instanceof JSONObject) {
            evaluableType2 = EvaluableType.DICT;
        } else {
            if (!(objMo7589evaluateex6DHhM instanceof JSONArray)) {
                if (objMo7589evaluateex6DHhM == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unable to find type for ");
                Intrinsics.checkNotNull(objMo7589evaluateex6DHhM);
                sb4.append(objMo7589evaluateex6DHhM.getClass().getName());
                throw new EvaluableException(sb4.toString(), null, 2, null);
            }
            evaluableType2 = EvaluableType.ARRAY;
        }
        sb3.append(evaluableType2);
        sb3.append(", but ");
        sb3.append(getResultType());
        sb3.append(" was expected.");
        throw new EvaluableException(sb3.toString(), null, 2, null);
    }

    /* JADX INFO: renamed from: isPure */
    public abstract boolean getIsPure();

    @NotNull
    public final MatchResult matchesArguments$div_evaluable(@NotNull List<? extends EvaluableType> argTypes) {
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        return matchesArguments(argTypes, new Function2<EvaluableType, EvaluableType, Boolean>() { // from class: com.yandex.div.evaluable.Function.matchesArguments.1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Boolean invoke(@NotNull EvaluableType type, @NotNull EvaluableType declaredType) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(declaredType, "declaredType");
                return Boolean.valueOf(type == declaredType);
            }
        });
    }

    @NotNull
    public final MatchResult matchesArgumentsWithCast$div_evaluable(@NotNull List<? extends EvaluableType> argTypes) {
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        return matchesArguments(argTypes, new Function2<EvaluableType, EvaluableType, Boolean>() { // from class: com.yandex.div.evaluable.Function$matchesArgumentsWithCast$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Boolean invoke(@NotNull EvaluableType type, @NotNull EvaluableType declaredType) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(declaredType, "declaredType");
                return Boolean.valueOf(type == declaredType || this.this$0.canCastTo(type, declaredType));
            }
        });
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(getDeclaredArgs(), null, getName() + '(', ")", 0, null, new Function1<FunctionArgument, CharSequence>() { // from class: com.yandex.div.evaluable.Function.toString.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull FunctionArgument arg) {
                Intrinsics.checkNotNullParameter(arg, "arg");
                if (!arg.getIsVariadic()) {
                    return arg.getType().toString();
                }
                return "vararg " + arg.getType();
            }
        }, 25, null);
    }
}
