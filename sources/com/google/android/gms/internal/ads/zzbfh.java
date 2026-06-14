package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbfh implements Runnable {
    final /* synthetic */ zzbfl zza;

    zzbfh(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
