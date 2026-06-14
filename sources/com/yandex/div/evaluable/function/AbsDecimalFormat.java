package com.yandex.div.evaluable.function;

import com.taurusx.tax.f.y;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import java.lang.Number;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 **\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001*B\u0005¢\u0006\u0002\u0010\u0004J3\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H$J\u0015\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00020\rH$¢\u0006\u0002\u0010\"J=\u0010#\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0010\b\u0002\u0010%\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/yandex/div/evaluable/function/AbsDecimalFormat;", "T", "", "Lcom/yandex/div/evaluable/Function;", "()V", "isPure", "", "()Z", "resultType", "Lcom/yandex/div/evaluable/EvaluableType;", "getResultType", "()Lcom/yandex/div/evaluable/EvaluableType;", "evaluate", "", "evaluationContext", "Lcom/yandex/div/evaluable/EvaluationContext;", "expressionContext", "Lcom/yandex/div/evaluable/ExpressionContext;", "args", "", "evaluate-ex6DHhM", "(Lcom/yandex/div/evaluable/EvaluationContext;Lcom/yandex/div/evaluable/Evaluable;Ljava/util/List;)Ljava/lang/Object;", "format", "", "formatter", "Ljava/text/DecimalFormat;", "value", "(Ljava/text/DecimalFormat;Ljava/lang/Number;)Ljava/lang/String;", "formatCallReference", "isMethodCall", "getLocale", "Ljava/util/Locale;", "getValue", "valueArgument", "(Ljava/lang/Object;)Ljava/lang/Number;", "throwIllegalFormatException", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "throwIllegalFormatException-ec-iVKA", "(Lcom/yandex/div/evaluable/Evaluable;Ljava/util/List;Ljava/lang/Exception;)Ljava/lang/Void;", y.f66058y, "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbsDecimalFormat<T extends Number> extends Function {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<Character> SUPPORTED_FORMAT_SYMBOLS = SetsKt.setOf((Object[]) new Character[]{'#', '0', ',', '.'});

    @NotNull
    private final EvaluableType resultType = EvaluableType.STRING;
    private final boolean isPure = true;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/evaluable/function/AbsDecimalFormat$Companion;", "", "()V", "SUPPORTED_FORMAT_SYMBOLS", "", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final String formatCallReference(List<? extends Object> args, boolean isMethodCall) {
        return CollectionsKt.joinToString$default(CollectionsKt.drop(args, isMethodCall ? 1 : 0), null, getName() + '(', ")", 0, null, new Function1<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.AbsDecimalFormat$formatCallReference$callReference$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Object arg) {
                Intrinsics.checkNotNullParameter(arg, "arg");
                return EvaluableExceptionKt.toMessageFormat(arg);
            }
        }, 25, null);
    }

    /* JADX INFO: renamed from: throwIllegalFormatException-ec-iVKA, reason: not valid java name */
    private final Void m7619throwIllegalFormatExceptioneciVKA(Evaluable expressionContext, List<? extends Object> args, Exception cause) {
        throw new EvaluableException("Failed to evaluate [" + formatCallReference(args, expressionContext instanceof Evaluable.MethodCall) + "]. Incorrect format pattern.", cause);
    }

    /* JADX INFO: renamed from: throwIllegalFormatException-ec-iVKA$default, reason: not valid java name */
    static /* synthetic */ Void m7620throwIllegalFormatExceptioneciVKA$default(AbsDecimalFormat absDecimalFormat, Evaluable evaluable, List list, Exception exc, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throwIllegalFormatException-ec-iVKA");
        }
        if ((i10 & 4) != 0) {
            exc = null;
        }
        return absDecimalFormat.m7619throwIllegalFormatExceptioneciVKA(evaluable, list, exc);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    protected Object mo7589evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Number value = getValue(args.get(0));
        Object obj = args.get(1);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Locale locale = getLocale(args);
        if (str.length() == 0) {
            m7620throwIllegalFormatExceptioneciVKA$default(this, expressionContext, args, null, 4, null);
            throw new g();
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!SUPPORTED_FORMAT_SYMBOLS.contains(Character.valueOf(str.charAt(i10)))) {
                m7620throwIllegalFormatExceptioneciVKA$default(this, expressionContext, args, null, 4, null);
                throw new g();
            }
        }
        try {
            return format(new DecimalFormat(str, DecimalFormatSymbols.getInstance(locale)), value);
        } catch (Exception e10) {
            m7619throwIllegalFormatExceptioneciVKA(expressionContext, args, e10);
            throw new g();
        }
    }

    @NotNull
    protected abstract String format(@NotNull DecimalFormat formatter, @NotNull T value);

    @NotNull
    protected abstract Locale getLocale(@NotNull List<? extends Object> args);

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @NotNull
    protected abstract T getValue(@NotNull Object valueArgument);

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: isPure, reason: from getter */
    public boolean getIsPure() {
        return this.isPure;
    }
}
