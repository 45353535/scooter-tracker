package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5529wl implements SimpleNetworkApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CacheControlHttpsConnectionPerformer f78534a = new CacheControlHttpsConnectionPerformer(((El) C5468ua.k().A()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(@NotNull String str, @NotNull NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f78534a.performConnection(str, new C5262m3(networkClientWithCacheControl));
    }
}
