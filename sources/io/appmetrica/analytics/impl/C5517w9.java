package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5517w9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5467u9 fromModel(@NonNull C5492v9 c5492v9) {
        C5467u9 c5467u9 = new C5467u9();
        String str = c5492v9.f78442a;
        if (str != null) {
            c5467u9.f78351a = str.getBytes();
        }
        return c5467u9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5492v9 toModel(@NonNull C5467u9 c5467u9) {
        return new C5492v9(new String(c5467u9.f78351a));
    }
}
