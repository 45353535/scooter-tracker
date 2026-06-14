package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5133h2 extends BaseProtobufStateSerializer {
    @NonNull
    public final C5107g2 a() {
        return new C5107g2();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final MessageNano defaultValue() {
        return new C5107g2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5107g2 toState(@NonNull byte[] bArr) throws IOException {
        return (C5107g2) MessageNano.mergeFrom(new C5107g2(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new C5107g2();
    }
}
