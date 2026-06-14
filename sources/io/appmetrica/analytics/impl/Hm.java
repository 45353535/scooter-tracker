package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Hm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5580ym fromModel(@NotNull Gm gm) {
        C5580ym c5580ym = new C5580ym();
        c5580ym.f78587a = gm.f75834a;
        return c5580ym;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Gm(((C5580ym) obj).f78587a);
    }

    @NotNull
    public final Gm a(@NotNull C5580ym c5580ym) {
        return new Gm(c5580ym.f78587a);
    }
}
