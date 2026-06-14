package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes12.dex */
public interface Za extends InterfaceC4961ab {
    @NonNull
    @WorkerThread
    Pa a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C5234l0 c5234l0);

    @Override // io.appmetrica.analytics.impl.InterfaceC4961ab
    @NonNull
    /* synthetic */ Za a();

    @NonNull
    InterfaceC4987bb a(@NonNull AppMetricaConfig appMetricaConfig);

    void a(@NonNull ReporterConfig reporterConfig);

    @NonNull
    @WorkerThread
    Pa b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C5234l0 c5234l0);

    @NonNull
    Ya b(@NonNull ReporterConfig reporterConfig);
}
