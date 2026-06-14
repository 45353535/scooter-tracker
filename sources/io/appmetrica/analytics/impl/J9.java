package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class J9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5480um fromModel(@Nullable I9 i92) {
        C5480um c5480um = new C5480um();
        if (i92 != null) {
            c5480um.f78398a = i92.f75928a;
        }
        return c5480um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new I9(((C5480um) obj).f78398a);
    }

    @NotNull
    public final I9 a(@NotNull C5480um c5480um) {
        return new I9(c5480um.f78398a);
    }
}
