package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q0 implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo7820andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((CollectCollectors.EnumMapAccumulator) obj).c();
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
