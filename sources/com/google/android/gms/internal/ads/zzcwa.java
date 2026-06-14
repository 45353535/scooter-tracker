package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcwa implements zzikg {
    private final zzcvx zza;

    private zzcwa(zzcvx zzcvxVar) {
        this.zza = zzcvxVar;
    }

    public static zzcwa zzc(zzcvx zzcvxVar) {
        return new zzcwa(zzcvxVar);
    }

    public static zzdeg zzd(zzcvx zzcvxVar) {
        return zzcvxVar.zza();
    }

    public final zzdeg zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
