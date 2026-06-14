package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzdtb implements zzgzl {
    final /* synthetic */ String zza;
    final /* synthetic */ zzboh zzb;

    zzdtb(zzdtk zzdtkVar, String str, zzboh zzbohVar) {
        this.zza = str;
        this.zzb = zzbohVar;
        Objects.requireNonNull(zzdtkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcjl) obj).zzac(this.zza, this.zzb);
    }
}
