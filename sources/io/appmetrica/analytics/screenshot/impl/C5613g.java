package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5613g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(@NotNull C5611e c5611e) {
        N n10 = new N();
        n10.f78967a = c5611e.f79006a;
        return n10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C5611e(((N) obj).f78967a);
    }

    @NotNull
    public final C5611e a(@NotNull N n10) {
        return new C5611e(n10.f78967a);
    }
}
