package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005H\u0014J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0014¢\u0006\u0002\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/evaluable/function/LocalizedNumberDecimalFormat;", "Lcom/yandex/div/evaluable/function/AbsDecimalFormat;", "", "()V", "declaredArgs", "", "Lcom/yandex/div/evaluable/FunctionArgument;", "getDeclaredArgs", "()Ljava/util/List;", "name", "", "getName", "()Ljava/lang/String;", "format", "formatter", "Ljava/text/DecimalFormat;", "value", "getLocale", "Ljava/util/Locale;", "args", "", "getValue", "valueArgument", "(Ljava/lang/Object;)Ljava/lang/Double;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalizedNumberDecimalFormat extends AbsDecimalFormat<Double> {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;

    @NotNull
    public static final LocalizedNumberDecimalFormat INSTANCE = new LocalizedNumberDecimalFormat();

    @NotNull
    private static final String name = "decimalFormat";

    static {
        FunctionArgument functionArgument = new FunctionArgument(EvaluableType.NUMBER, false, 2, null);
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = CollectionsKt.listOf((Object[]) new FunctionArgument[]{functionArgument, new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null)});
    }

    private LocalizedNumberDecimalFormat() {
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public /* bridge */ /* synthetic */ String format(DecimalFormat decimalFormat, Number number) {
        return format(decimalFormat, number.doubleValue());
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    @NotNull
    protected Locale getLocale(@NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get(2);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Locale localeForLanguageTag = Locale.forLanguageTag((String) obj);
        Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "forLanguageTag(args[2] as String)");
        return localeForLanguageTag;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    protected String format(@NotNull DecimalFormat formatter, double value) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        String str = formatter.format(Float.valueOf((float) value));
        Intrinsics.checkNotNullExpressionValue(str, "formatter.format(value.toFloat())");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    @NotNull
    public Double getValue(@NotNull Object valueArgument) {
        Intrinsics.checkNotNullParameter(valueArgument, "valueArgument");
        return (Double) valueArgument;
    }
}
