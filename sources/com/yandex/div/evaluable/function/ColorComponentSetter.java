package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B$\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0014ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lcom/yandex/div/evaluable/function/ColorComponentSetter;", "Lcom/yandex/div/evaluable/Function;", "Lkotlin/Function2;", "Lcom/yandex/div/evaluable/types/Color;", "", "componentSetter", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Lcom/yandex/div/evaluable/EvaluationContext;", "evaluationContext", "Lcom/yandex/div/evaluable/ExpressionContext;", "expressionContext", "", "", "args", "evaluate-ex6DHhM", "(Lcom/yandex/div/evaluable/EvaluationContext;Lcom/yandex/div/evaluable/Evaluable;Ljava/util/List;)Ljava/lang/Object;", "evaluate", "Lkotlin/jvm/functions/Function2;", "Lcom/yandex/div/evaluable/FunctionArgument;", "declaredArgs", "Ljava/util/List;", "getDeclaredArgs", "()Ljava/util/List;", "Lcom/yandex/div/evaluable/EvaluableType;", "resultType", "Lcom/yandex/div/evaluable/EvaluableType;", "getResultType", "()Lcom/yandex/div/evaluable/EvaluableType;", "", "isPure", "Z", "()Z", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ColorComponentSetter extends Function {

    @NotNull
    private final Function2<Color, Double, Color> componentSetter;

    @NotNull
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @NotNull
    private final EvaluableType resultType;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentSetter(@NotNull Function2<? super Color, ? super Double, Color> componentSetter) {
        Intrinsics.checkNotNullParameter(componentSetter, "componentSetter");
        this.componentSetter = componentSetter;
        EvaluableType evaluableType = EvaluableType.COLOR;
        this.declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.NUMBER, false, 2, null)});
        this.resultType = evaluableType;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    protected Object mo7589evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        int value = ((Color) obj).getValue();
        Object obj2 = args.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Double");
        Double d10 = (Double) obj2;
        d10.doubleValue();
        try {
            return Color.m7659boximpl(this.componentSetter.invoke(Color.m7659boximpl(value), d10).getValue());
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), CollectionsKt.listOf(Color.m7666toStringimpl(value), d10), "Value out of range 0..1.", null, 8, null);
            throw new g();
        }
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
