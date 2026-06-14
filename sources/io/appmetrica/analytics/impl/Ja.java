package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface Ja extends Oc, H6, InterfaceC4961ab {
    @NonNull
    /* synthetic */ Za a();

    /* synthetic */ void a(int i10, @NonNull Bundle bundle);

    @Override // io.appmetrica.analytics.impl.Oc
    /* synthetic */ void a(@Nullable Location location);

    @WorkerThread
    void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig);

    @WorkerThread
    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    @WorkerThread
    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    @WorkerThread
    void a(@NonNull ReporterConfig reporterConfig);

    @WorkerThread
    void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list);

    @Override // io.appmetrica.analytics.impl.Oc
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Oc
    /* synthetic */ void a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Oc
    /* synthetic */ void a(boolean z10);

    @Override // io.appmetrica.analytics.impl.Oc
    /* synthetic */ void a(boolean z10, boolean z11);

    @WorkerThread
    void b(@NonNull AppMetricaConfig appMetricaConfig);

    @NonNull
    @WorkerThread
    Ya c(@NonNull ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.Oc
    /* synthetic */ void clearAppEnvironment();

    @NonNull
    @AnyThread
    C5063ea d();

    @Nullable
    @AnyThread
    String e();

    @Nullable
    @AnyThread
    Map<String, String> g();

    @NonNull
    @AnyThread
    AdvIdentifiersResult h();

    @Nullable
    @AnyThread
    C5371qc i();

    @Override // io.appmetrica.analytics.impl.Oc
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Oc
    /* synthetic */ void setDataSendingEnabled(boolean z10);

    @Override // io.appmetrica.analytics.impl.Oc
    /* synthetic */ void setUserProfileID(@Nullable String str);
}
