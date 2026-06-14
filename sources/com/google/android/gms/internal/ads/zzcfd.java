package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcfd implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcfi zzc;

    zzcfd(zzcfi zzcfiVar, int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
        Objects.requireNonNull(zzcfiVar);
        this.zzc = zzcfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfi zzcfiVar = this.zzc;
        if (zzcfiVar.zzt() != null) {
            zzcfiVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
