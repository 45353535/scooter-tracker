package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5419sb implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Tc f78225a;

    public C5419sb() {
        this(new Tc(new Tn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NonNull Sn sn) {
        return MessageNano.toByteArray((MessageNano) this.f78225a.f76501a.fromModel(sn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5419sb(Tc tc2) {
        this.f78225a = tc2;
    }

    @NonNull
    public final Sn a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
