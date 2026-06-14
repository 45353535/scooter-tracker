package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes12.dex */
public final class Ee implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5555xm fromModel(@NonNull De de2) {
        C5555xm c5555xm = new C5555xm();
        c5555xm.f78564a = de2.f75670a;
        c5555xm.f78565b = de2.f75671b;
        return c5555xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C5555xm c5555xm = (C5555xm) obj;
        return new De(c5555xm.f78564a, c5555xm.f78565b);
    }

    @NonNull
    public final De a(@NonNull C5555xm c5555xm) {
        return new De(c5555xm.f78564a, c5555xm.f78565b);
    }
}
