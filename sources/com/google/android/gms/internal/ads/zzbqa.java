package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbqa extends zzbpx {
    final /* synthetic */ zzcen zza;

    zzbqa(zzbqb zzbqbVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpy
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}
