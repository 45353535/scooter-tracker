package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeyi implements zzfax {
    private final Context zza;
    private final Intent zzb;

    zzeyi(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzom)).booleanValue()) {
            return zzgzo.zza(new zzeyj(null));
        }
        boolean z10 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z10 = true;
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgzo.zza(new zzeyj(Boolean.valueOf(z10)));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 60;
    }
}
