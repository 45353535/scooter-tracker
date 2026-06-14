package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5040dc implements LocationReceiverProviderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5065ec f77012a = new C5065ec();

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    @NotNull
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f77012a;
    }
}
