package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/evaluable/ExpressionContext;", "", "Lcom/yandex/div/evaluable/Evaluable;", "evaluable", "constructor-impl", "(Lcom/yandex/div/evaluable/Evaluable;)Lcom/yandex/div/evaluable/Evaluable;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ExpressionContext {
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static Evaluable m7617constructorimpl(@NotNull Evaluable evaluable) {
        Intrinsics.checkNotNullParameter(evaluable, "evaluable");
        return evaluable;
    }
}
