package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p0 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((CollectCollectors.EnumMapAccumulator) obj).a((CollectCollectors.EnumMapAccumulator) obj2);
    }
}
