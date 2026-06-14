package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbqc implements Runnable {
    final /* synthetic */ zzbqf zza;

    zzbqc(zzbqf zzbqfVar) {
        Objects.requireNonNull(zzbqfVar);
        this.zza = zzbqfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
