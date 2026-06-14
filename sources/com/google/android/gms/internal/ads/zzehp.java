package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzehp implements zzdct, zzdbi {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzehz zzd;

    public zzehp(zzehz zzehzVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzehzVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z10) {
        int i10;
        int iIntValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue() && !this.zzc.zzx()) {
            Object obj = zza;
            synchronized (obj) {
                i10 = zzb;
                iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhg)).intValue();
            }
            if (i10 < iIntValue) {
                this.zzd.zza(z10);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzb(true);
    }
}
