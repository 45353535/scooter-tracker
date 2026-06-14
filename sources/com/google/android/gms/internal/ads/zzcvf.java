package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcvf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcvf(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
    }

    public static zzcvf zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzcvf(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return true == Boolean.valueOf(zzcvd.zza()).booleanValue() ? ((zzenk) this.zza).zzb() : ((zzepj) this.zzb).zzb();
    }
}
