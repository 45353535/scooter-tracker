package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcuh implements zzikg {
    private final zzcue zza;

    private zzcuh(zzcue zzcueVar) {
        this.zza = zzcueVar;
    }

    public static zzcuh zzc(zzcue zzcueVar) {
        return new zzcuh(zzcueVar);
    }

    public static zzfis zzd(zzcue zzcueVar) {
        zzfis zzfisVarZzd = zzcueVar.zzd();
        zziko.zzb(zzfisVarZzd);
        return zzfisVarZzd;
    }

    public final zzfis zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
