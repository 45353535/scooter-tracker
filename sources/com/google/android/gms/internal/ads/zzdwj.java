package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdwj implements zzikg {
    private final zzikp zza;

    private zzdwj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzdwj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdwj(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgzy zzgzyVarZzc = zzfmk.zzc();
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgd)).booleanValue() ? Collections.singleton(new zzdje(((zzdxc) this.zza).zzb(), zzgzyVarZzc)) : Collections.EMPTY_SET;
        zziko.zzb(setSingleton);
        return setSingleton;
    }
}
