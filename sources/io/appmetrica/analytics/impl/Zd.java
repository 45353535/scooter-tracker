package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Zd implements ServiceNetworkContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5264m5 f76746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76747b = new C5077eo().a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5529wl f76748c = new C5529wl();

    public Zd(@NotNull Context context) {
        this.f76746a = new C5264m5(new C5513w5(context), new C5476ui(C5468ua.k().h()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f76746a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final SimpleNetworkApi getNetworkApi() {
        return this.f76748c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C5468ua.H.A();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final String getUserAgent() {
        return this.f76747b;
    }
}
