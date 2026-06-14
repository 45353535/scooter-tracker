package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes12.dex */
public final class Lm implements ProtobufConverter {
    @NonNull
    public final C5605zm a(@NonNull Km km) {
        C5605zm c5605zm = new C5605zm();
        c5605zm.f78662a = km.f76038a;
        return c5605zm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C5605zm c5605zm = new C5605zm();
        c5605zm.f78662a = ((Km) obj).f76038a;
        return c5605zm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new Km(((C5605zm) obj).f78662a);
    }

    @NonNull
    public final Km a(@NonNull C5605zm c5605zm) {
        return new Km(c5605zm.f78662a);
    }
}
