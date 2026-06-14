package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f74988a;

    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t fromModel(@NotNull RemoteBillingConfig remoteBillingConfig) {
        t tVar = new t();
        tVar.f74993a = remoteBillingConfig.getEnabled();
        BillingConfig config = remoteBillingConfig.getConfig();
        tVar.f74994b = config != null ? this.f74988a.fromModel(config) : null;
        return tVar;
    }

    public r(@NotNull g gVar) {
        this.f74988a = gVar;
    }

    public /* synthetic */ r(g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new g() : gVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(@NotNull t tVar) {
        boolean z10 = tVar.f74993a;
        g gVar = this.f74988a;
        s sVar = tVar.f74994b;
        gVar.getClass();
        return new RemoteBillingConfig(z10, new BillingConfig(sVar.f74990a, sVar.f74991b));
    }
}
