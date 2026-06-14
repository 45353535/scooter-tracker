package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5287n3 implements ProtobufConverter {
    @NonNull
    public final C5430sm a(@NonNull C5237l3 c5237l3) {
        C5430sm c5430sm = new C5430sm();
        c5430sm.f78247a = c5237l3.f77641a;
        return c5430sm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C5430sm c5430sm = new C5430sm();
        c5430sm.f78247a = ((C5237l3) obj).f77641a;
        return c5430sm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C5237l3(((C5430sm) obj).f78247a);
    }

    @NonNull
    public final C5237l3 a(@NonNull C5430sm c5430sm) {
        return new C5237l3(c5430sm.f78247a);
    }
}
