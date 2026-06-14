package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5352pi implements Za {
    @Override // io.appmetrica.analytics.impl.Za, io.appmetrica.analytics.impl.InterfaceC4961ab
    @NonNull
    public final Za a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NonNull
    public final Pa b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C5234l0 c5234l0) {
        return new Ec();
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NonNull
    public final Ya b(@NonNull ReporterConfig reporterConfig) {
        return new C5277mi();
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NonNull
    public final Pa a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C5234l0 c5234l0) {
        return new Ec();
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NonNull
    public final InterfaceC4987bb a(@NonNull AppMetricaConfig appMetricaConfig) {
        return new C5277mi();
    }
}
