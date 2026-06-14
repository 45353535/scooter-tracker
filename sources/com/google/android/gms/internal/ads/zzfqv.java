package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfqv implements zzbdy {
    final /* synthetic */ zzfqw zza;

    zzfqv(zzfqw zzfqwVar) {
        Objects.requireNonNull(zzfqwVar);
        this.zza = zzfqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzz)).booleanValue()) {
            this.zza.zzl(z10);
        }
    }
}
