package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbaj implements Runnable {
    final /* synthetic */ zzbak zza;

    zzbaj(zzbak zzbakVar) {
        Objects.requireNonNull(zzbakVar);
        this.zza = zzbakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbhe.zza(this.zza.zza);
    }
}
