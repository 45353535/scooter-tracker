package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbfi implements zzbdy {
    final /* synthetic */ zzbfl zza;

    zzbfi(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z10) {
        if (z10) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
