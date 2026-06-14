package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbah implements Runnable {
    final /* synthetic */ zzbak zza;

    zzbah(zzbak zzbakVar) {
        Objects.requireNonNull(zzbakVar);
        this.zza = zzbakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
    }
}
