package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzp implements zzjp {
    public final com.google.android.gms.internal.measurement.zzda zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzp(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzda zzdaVar) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzdaVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    public final void interceptEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            this.zza.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            zzic zzicVar = this.zzb.zza;
            if (zzicVar != null) {
                zzicVar.zzaV().zze().zzb("Event interceptor threw exception", e10);
            }
        }
    }
}
