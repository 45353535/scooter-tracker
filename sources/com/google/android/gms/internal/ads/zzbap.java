package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbap implements Runnable {
    final /* synthetic */ zzbar zza;

    zzbap(zzbar zzbarVar) {
        Objects.requireNonNull(zzbarVar);
        this.zza = zzbarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}
