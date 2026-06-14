package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Sb implements Rb, InterfaceC5331om, LocationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wb f76429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationClient f76430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5554xl f76431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ck f76432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f76433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f76434g;

    public Sb(@NotNull Context context, @NotNull Wb wb2, @NotNull LocationClient locationClient) {
        this.f76428a = context;
        this.f76429b = wb2;
        this.f76430c = locationClient;
        C4988bc c4988bc = new C4988bc();
        this.f76431d = new C5554xl(new C5364q5(c4988bc, C5468ua.k().p().getAskForPermissionStrategy()));
        this.f76432e = C5468ua.k().p();
        ((Zb) wb2).a(c4988bc, true);
        ((Zb) wb2).a(locationClient, true);
        this.f76433f = locationClient.getLastKnownExtractorProviderFactory();
        this.f76434g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5331om
    public final void a(@NotNull C5204jm c5204jm) {
        C5237l3 c5237l3 = c5204jm.f77563x;
        if (c5237l3 != null) {
            long j10 = c5237l3.f77641a;
            this.f76430c.updateCacheArguments(new CacheArguments(j10, ((long) 2) * j10));
        }
    }

    @NotNull
    public final C5554xl b() {
        return this.f76431d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f76433f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f76434g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f76431d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getSystemLocation() {
        return this.f76430c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getUserLocation() {
        return this.f76430c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void init() {
        this.f76430c.init(this.f76428a, this.f76431d, C5468ua.H.f78355d.c(), this.f76432e.e());
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceControllerF = this.f76432e.f();
        if (moduleLocationSourcesServiceControllerF != null) {
            moduleLocationSourcesServiceControllerF.init();
        } else {
            LocationClient locationClient = this.f76430c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f76430c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Zb) this.f76429b).a(this.f76432e.g());
        C5468ua.H.f78372u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
        ((Zb) this.f76429b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f76430c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f76430c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
        this.f76430c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void b(@NotNull Object obj) {
        ((Zb) this.f76429b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f76430c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f76430c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(@NotNull Object obj) {
        ((Zb) this.f76429b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(boolean z10) {
        ((Zb) this.f76429b).a(z10);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(@Nullable Location location) {
        this.f76430c.updateUserLocation(location);
    }
}
