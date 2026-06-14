package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzduk implements com.google.android.gms.ads.internal.zzn {
    final /* synthetic */ zzduv zza;

    zzduk(zzduv zzduvVar) {
        Objects.requireNonNull(zzduvVar);
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdk() {
        this.zza.zzb().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdl() {
        this.zza.zzb().zzb();
    }
}
