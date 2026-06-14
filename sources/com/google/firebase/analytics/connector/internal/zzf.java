package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
final class zzf implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzg f31754a;

    public zzf(zzg zzgVar) {
        Objects.requireNonNull(zzgVar);
        this.f31754a = zzgVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        if (str == null || !zzc.zzc(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        this.f31754a.a().onMessageTriggered(3, bundle2);
    }
}
