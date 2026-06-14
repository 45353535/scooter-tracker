package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcww implements zzikg {
    private final zzcwv zza;

    private zzcww(zzcwv zzcwvVar) {
        this.zza = zzcwvVar;
    }

    public static zzcww zzc(zzcwv zzcwvVar) {
        return new zzcww(zzcwvVar);
    }

    public static zzfir zzd(zzcwv zzcwvVar) {
        zzfir zzfirVarZzb = zzcwvVar.zzb();
        zziko.zzb(zzfirVarZzb);
        return zzfirVarZzb;
    }

    public final zzfir zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
