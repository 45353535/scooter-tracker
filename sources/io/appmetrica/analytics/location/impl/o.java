package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements LocationReceiverProviderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f78714a;

    public o(@NotNull q qVar) {
        this.f78714a = qVar;
    }

    @NotNull
    public final q a() {
        return this.f78714a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f78714a;
    }
}
