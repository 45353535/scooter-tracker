package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdgl implements zzdel {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbN)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoq)).intValue();

    @VisibleForTesting
    public zzdgl() {
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final synchronized void zzdP(zzfjc zzfjcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbO)).booleanValue()) {
            try {
                zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
                this.zza = zzfiuVar.zzc;
                this.zzb = zzfiuVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
