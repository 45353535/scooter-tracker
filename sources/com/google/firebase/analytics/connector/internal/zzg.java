package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class zzg implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AnalyticsConnector.AnalyticsConnectorListener f31755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppMeasurementSdk f31756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zzf f31757c;

    public zzg(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f31755a = analyticsConnectorListener;
        this.f31756b = appMeasurementSdk;
        zzf zzfVar = new zzf(this);
        this.f31757c = zzfVar;
        appMeasurementSdk.registerOnMeasurementEventListener(zzfVar);
    }

    final /* synthetic */ AnalyticsConnector.AnalyticsConnectorListener a() {
        return this.f31755a;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.f31755a;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
    }
}
