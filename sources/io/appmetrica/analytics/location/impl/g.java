package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements LastKnownLocationExtractorProviderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LastKnownLocationExtractorProvider f78687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f78688b = new c("location-module-gpl");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f78689c = new v("network", new f(), "location-module-network");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f78690d = new v("gps", new e(), "location-module-gps");

    public g(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f78687a = lastKnownLocationExtractorProvider;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f78688b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f78690d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f78689c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f78687a;
    }
}
