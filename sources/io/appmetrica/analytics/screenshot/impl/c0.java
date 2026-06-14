package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P fromModel(@NotNull a0 a0Var) {
        P p10 = new P();
        p10.f78973a = a0Var.f78997a;
        p10.f78974b = a0Var.f78998b;
        return p10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P p10 = (P) obj;
        return new a0(p10.f78973a, p10.f78974b);
    }

    @NotNull
    public final a0 a(@NotNull P p10) {
        return new a0(p10.f78973a, p10.f78974b);
    }
}
