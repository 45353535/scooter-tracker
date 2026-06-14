package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(@NotNull C5622p c5622p) {
        O o10 = new O();
        o10.f78969a = c5622p.f79039a;
        Object[] array = c5622p.f79040b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o10.f78971c = (String[]) array;
        o10.f78970b = c5622p.f79041c;
        return o10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5622p toModel(@NotNull O o10) {
        return new C5622p(o10.f78969a, ArraysKt.toList(o10.f78971c), o10.f78970b);
    }
}
