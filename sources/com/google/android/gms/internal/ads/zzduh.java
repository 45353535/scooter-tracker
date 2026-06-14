package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;

/* JADX INFO: loaded from: classes8.dex */
public final class zzduh implements zzikg {
    private final zzikp zza;

    private zzduh(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzduh zza(zzikp zzikpVar) {
        return new zzduh(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbgj.zza.EnumC0335zza enumC0335zza = ((zzdaw) this.zza).zza().zzp.zza == 3 ? zzbgj.zza.EnumC0335zza.REWARDED_INTERSTITIAL : zzbgj.zza.EnumC0335zza.REWARD_BASED_VIDEO_AD;
        zziko.zzb(enumC0335zza);
        return enumC0335zza;
    }
}
