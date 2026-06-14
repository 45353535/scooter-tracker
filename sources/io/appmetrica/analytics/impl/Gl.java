package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class Gl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5111g6 fromModel(@NonNull Hl hl) {
        C5111g6 c5111g6 = new C5111g6();
        c5111g6.f77211a = (String) WrapUtils.getOrDefault(hl.f75877a, c5111g6.f77211a);
        c5111g6.f77212b = (String) WrapUtils.getOrDefault(hl.f75878b, c5111g6.f77212b);
        c5111g6.f77213c = ((Integer) WrapUtils.getOrDefault(hl.f75879c, Integer.valueOf(c5111g6.f77213c))).intValue();
        c5111g6.f77216f = ((Integer) WrapUtils.getOrDefault(hl.f75880d, Integer.valueOf(c5111g6.f77216f))).intValue();
        c5111g6.f77214d = (String) WrapUtils.getOrDefault(hl.f75881e, c5111g6.f77214d);
        c5111g6.f77215e = ((Boolean) WrapUtils.getOrDefault(hl.f75882f, Boolean.valueOf(c5111g6.f77215e))).booleanValue();
        return c5111g6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Hl a(@NonNull C5111g6 c5111g6) {
        throw new UnsupportedOperationException();
    }
}
