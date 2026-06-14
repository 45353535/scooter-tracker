package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: loaded from: classes8.dex */
public final class zzan implements zzth {
    private final zztk zza;

    private zzan(zztk zztkVar) {
        this.zza = zztkVar;
    }

    public static zzan zza(zztk zztkVar) {
        return new zzan(zztkVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzam((Application) this.zza.zzb());
    }
}
