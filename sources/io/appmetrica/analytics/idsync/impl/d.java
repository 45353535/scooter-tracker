package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f75399a;

    public d(@NotNull e eVar) {
        this.f75399a = eVar;
    }

    @NotNull
    public final byte[] a(@NotNull IdSyncConfig idSyncConfig) {
        return MessageNano.toByteArray(this.f75399a.fromModel(idSyncConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f75399a.fromModel((IdSyncConfig) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(@NotNull byte[] bArr) {
        return this.f75399a.toModel((o) MessageNano.mergeFrom(new o(), bArr));
    }
}
