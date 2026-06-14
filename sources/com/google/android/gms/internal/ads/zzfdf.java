package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfdf implements zzikg {
    private final zzfdc zza;

    private zzfdf(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfdf zzc(zzfdc zzfdcVar) {
        return new zzfdf(zzfdcVar);
    }

    public static boolean zzd(zzfdc zzfdcVar) {
        return zzfdcVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzh());
    }
}
