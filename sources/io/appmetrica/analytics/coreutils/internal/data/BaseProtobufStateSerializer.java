package io.appmetrica.analytics.coreutils.internal.data;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseProtobufStateSerializer<T extends MessageNano> implements ProtobufStateSerializer<T> {
    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public abstract T defaultValue();

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public byte[] toByteArray(@NonNull T t10) {
        return MessageNano.toByteArray(t10);
    }
}
