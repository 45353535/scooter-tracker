package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfrh implements zzbdy {
    final /* synthetic */ zzfrj zza;

    zzfrh(zzfrj zzfrjVar) {
        Objects.requireNonNull(zzfrjVar);
        this.zza = zzfrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzz)).booleanValue()) {
            this.zza.zzj(z10);
        }
    }
}
