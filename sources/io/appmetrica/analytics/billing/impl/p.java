package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f74985a;

    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull RemoteBillingConfig remoteBillingConfig) {
        return MessageNano.toByteArray(this.f74985a.fromModel(remoteBillingConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f74985a.fromModel((RemoteBillingConfig) obj));
    }

    public p(@NotNull r rVar) {
        this.f74985a = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(@NotNull byte[] bArr) {
        t tVar;
        try {
            tVar = (t) MessageNano.mergeFrom(new t(), bArr);
        } catch (Throwable unused) {
            tVar = new t();
        }
        return this.f74985a.toModel(tVar);
    }

    public /* synthetic */ p(r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new r(null, 1, null) : rVar);
    }
}
