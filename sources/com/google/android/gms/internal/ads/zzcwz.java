package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcwz implements zzikg {
    private final zzcwv zza;

    private zzcwz(zzcwv zzcwvVar) {
        this.zza = zzcwvVar;
    }

    public static zzcwz zzc(zzcwv zzcwvVar) {
        return new zzcwz(zzcwvVar);
    }

    public static zzfjc zzd(zzcwv zzcwvVar) {
        zzfjc zzfjcVarZza = zzcwvVar.zza();
        zziko.zzb(zzfjcVarZza);
        return zzfjcVarZza;
    }

    public final zzfjc zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
