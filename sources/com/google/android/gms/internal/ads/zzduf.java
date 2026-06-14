package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzduf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzduf(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzduf zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzduf(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        int i10 = ((zzdaw) this.zzc).zza().zzp.zza;
        if (i10 != 0) {
            return i10 + (-1) != 0 ? ((zzepj) this.zzb).zzb() : ((zzepj) this.zza).zzb();
        }
        throw null;
    }
}
