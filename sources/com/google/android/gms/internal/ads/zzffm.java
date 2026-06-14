package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
final class zzffm implements zzfls {
    private final zzfgj zza;

    public zzffm(zzfgj zzfgjVar) {
        this.zza = zzfgjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    public final ListenableFuture zza(zzflt zzfltVar) {
        zzffp zzffpVar = (zzffp) zzfltVar;
        return ((zzffl) this.zza).zzb(zzffpVar.zzb, zzffpVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    public final void zzb(zzfli zzfliVar) {
        zzfliVar.zza = ((zzffl) this.zza).zza();
    }
}
