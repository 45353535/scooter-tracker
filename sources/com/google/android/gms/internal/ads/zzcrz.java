package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcrz implements zzdbi {
    private final zzfiu zza;
    private final zzfjc zzb;
    private final zzfqg zzc;
    private final zzfqk zzd;

    public zzcrz(zzfjc zzfjcVar, zzfqk zzfqkVar, zzfqg zzfqgVar) {
        this.zzb = zzfjcVar;
        this.zzd = zzfqkVar;
        this.zzc = zzfqgVar;
        this.zza = zzfjcVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zza(this.zzc.zza(this.zzb, null, list), null);
    }
}
