package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Tb implements Rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Be f76498a = new Be();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bb f76499b = new Bb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5040dc f76500c = new C5040dc();

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(@Nullable Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void b(@NotNull Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f76499b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f76500c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final PermissionExtractor getPermissionExtractor() {
        return this.f76498a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getSystemLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getUserLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void init() {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(@NotNull Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(boolean z10) {
    }
}
