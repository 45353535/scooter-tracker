package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcfe implements Runnable {
    final /* synthetic */ zzcfi zza;

    zzcfe(zzcfi zzcfiVar) {
        Objects.requireNonNull(zzcfiVar);
        this.zza = zzcfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfi zzcfiVar = this.zza;
        if (zzcfiVar.zzt() != null) {
            zzcfiVar.zzt().zzd();
            zzcfiVar.zzt().zzh();
        }
    }
}
