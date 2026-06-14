package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdpi {
    private final zzdxz zza;

    zzdpi(zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }

    public final void zza(@Nullable View view, zzfir zzfirVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzos)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "hcp");
        zzdxyVarZza.zzc("hcp", str);
        zzdxyVarZza.zzb(zzfirVar);
        zzdxyVarZza.zzd();
    }
}
