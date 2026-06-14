package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcpo implements zzikg {
    private final zzikp zza;

    private zzcpo(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcpo zza(zzikp zzikpVar) {
        return new zzcpo(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.util.zzbl(((zzcmj) this.zza).zza());
    }
}
