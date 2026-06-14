package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import j$.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
final class zzd implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zze f31749a;

    public zzd(zze zzeVar) {
        Objects.requireNonNull(zzeVar);
        this.f31749a = zzeVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        zze zzeVar = this.f31749a;
        if (zzeVar.f31750a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i10 = zzc.zza;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            zzeVar.a().onMessageTriggered(2, bundle2);
        }
    }
}
