package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f78932a = new c();

    @NotNull
    public final byte[] a(@NotNull a aVar) {
        return MessageNano.toByteArray(this.f78932a.fromModel(aVar));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f78932a.fromModel((a) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a toModel(@NotNull byte[] bArr) {
        return this.f78932a.toModel((f) MessageNano.mergeFrom(new f(), bArr));
    }
}
