package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes12.dex */
public final class Rf implements ProtobufStateStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f76352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f76353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f76354d;

    public Rf(@NonNull String str, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f76351a = str;
        this.f76352b = iBinaryDataHelper;
        this.f76353c = protobufStateSerializer;
        this.f76354d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f76352b.remove(this.f76351a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    @NonNull
    public final Object read() {
        try {
            byte[] bArr = this.f76352b.get(this.f76351a);
            if (bArr != null && bArr.length != 0) {
                return this.f76354d.toModel((MessageNano) this.f76353c.toState(bArr));
            }
            return this.f76354d.toModel((MessageNano) this.f76353c.defaultValue());
        } catch (Throwable unused) {
            return this.f76354d.toModel((MessageNano) this.f76353c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(@NonNull Object obj) {
        this.f76352b.insert(this.f76351a, this.f76353c.toByteArray((MessageNano) this.f76354d.fromModel(obj)));
    }
}
