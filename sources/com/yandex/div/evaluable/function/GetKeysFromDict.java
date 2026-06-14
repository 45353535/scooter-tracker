package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/evaluable/function/GetKeysFromDict;", "Lcom/yandex/div/evaluable/Function;", "<init>", "()V", "Lcom/yandex/div/evaluable/EvaluationContext;", "evaluationContext", "Lcom/yandex/div/evaluable/ExpressionContext;", "expressionContext", "", "", "args", "evaluate-ex6DHhM", "(Lcom/yandex/div/evaluable/EvaluationContext;Lcom/yandex/div/evaluable/Evaluable;Ljava/util/List;)Ljava/lang/Object;", "evaluate", "Lcom/yandex/div/evaluable/FunctionArgument;", "declaredArgs", "Ljava/util/List;", "getDeclaredArgs", "()Ljava/util/List;", "Lcom/yandex/div/evaluable/EvaluableType;", "resultType", "Lcom/yandex/div/evaluable/EvaluableType;", "getResultType", "()Lcom/yandex/div/evaluable/EvaluableType;", "", "isPure", "Z", "()Z", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class GetKeysFromDict extends Function {
    private final boolean isPure;

    @NotNull
    private final List<FunctionArgument> declaredArgs = CollectionsKt.listOf(new FunctionArgument(EvaluableType.DICT, false, 2, null));

    @NotNull
    private final EvaluableType resultType = EvaluableType.ARRAY;

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    protected Object mo7589evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
        JSONArray jSONArray = new JSONArray();
        Iterator<String> itKeys = ((JSONObject) obj).keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "dict.keys()");
        while (itKeys.hasNext()) {
            jSONArray.put(itKeys.next());
        }
        return jSONArray;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
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
}
