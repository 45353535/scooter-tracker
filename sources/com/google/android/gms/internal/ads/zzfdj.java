package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfdj implements zzikg {
    private final zzfdc zza;

    private zzfdj(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfdj zzc(zzfdc zzfdcVar) {
        return new zzfdj(zzfdcVar);
    }

    public static int zzd(zzfdc zzfdcVar) {
        return zzfdcVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzj());
    }
}
