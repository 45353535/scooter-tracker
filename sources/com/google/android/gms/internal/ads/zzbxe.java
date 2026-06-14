package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbxe extends zzbly {
    final /* synthetic */ zzbxf zza;

    /* synthetic */ zzbxe(zzbxf zzbxfVar, byte[] bArr) {
        Objects.requireNonNull(zzbxfVar);
        this.zza = zzbxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(zzblm zzblmVar) {
        zzbxf zzbxfVar = this.zza;
        zzbxfVar.zzd().onCustomFormatAdLoaded(zzbxfVar.zzc(zzblmVar));
    }
}
