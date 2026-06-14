package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import zf.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/yandex/div/evaluable/function/ArrayInteger;", "Lcom/yandex/div/evaluable/function/ArrayFunction;", "()V", "evaluate", "", "evaluationContext", "Lcom/yandex/div/evaluable/EvaluationContext;", "expressionContext", "Lcom/yandex/div/evaluable/ExpressionContext;", "args", "", "evaluate-ex6DHhM", "(Lcom/yandex/div/evaluable/EvaluationContext;Lcom/yandex/div/evaluable/Evaluable;Ljava/util/List;)Ljava/lang/Object;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ArrayInteger extends ArrayFunction {
    public ArrayInteger() {
        super(EvaluableType.INTEGER);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    protected Object mo7589evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) throws JSONException {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), args, getIsMethod());
        if (objEvaluateArray instanceof Integer) {
            return Long.valueOf(((Number) objEvaluateArray).intValue());
        }
        if (objEvaluateArray instanceof Long) {
            return objEvaluateArray;
        }
        if (objEvaluateArray instanceof BigInteger) {
            ArrayFunctionsKt.throwArrayException$default(getName(), args, "Integer overflow.", false, 8, null);
            throw new g();
        }
        if (objEvaluateArray instanceof BigDecimal) {
            ArrayFunctionsKt.throwArrayException$default(getName(), args, "Cannot convert value to integer.", false, 8, null);
            throw new g();
        }
        if (!(objEvaluateArray instanceof Double)) {
            ArrayFunctionsKt.throwArrayWrongTypeException(getName(), args, getResultType(), objEvaluateArray, getIsMethod());
            return Unit.f93236a;
        }
        Number number = (Number) objEvaluateArray;
        if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
            ArrayFunctionsKt.throwArrayException$default(getName(), args, "Integer overflow.", false, 8, null);
            throw new g();
        }
        long jE = a.e(number.doubleValue());
        if (number.doubleValue() - jE == 0.0d) {
            return Long.valueOf(jE);
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), args, "Cannot convert value to integer.", false, 8, null);
        throw new g();
    }
}
