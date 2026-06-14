package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzehl implements zzgzl {
    final /* synthetic */ zzfmu zza;

    zzehl(zzehn zzehnVar, zzfmu zzfmuVar) {
        this.zza = zzfmuVar;
        Objects.requireNonNull(zzehnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        String strValueOf = String.valueOf(th2.getMessage());
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get offline signal database: ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error executing function on offline signal database: ".concat(strValueOf));
        }
    }
}
