package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class V8 extends BaseProtobufStateSerializer {
    @NonNull
    public final B9 a() {
        return new B9();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final MessageNano defaultValue() {
        return new B9();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B9 toState(@NonNull byte[] bArr) throws IOException {
        return (B9) MessageNano.mergeFrom(new B9(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new B9();
    }
}
