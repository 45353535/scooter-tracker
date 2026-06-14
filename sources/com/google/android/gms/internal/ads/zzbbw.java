package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbbw implements Runnable {
    final /* synthetic */ zzbbx zza;

    zzbbw(zzbbx zzbbxVar) {
        Objects.requireNonNull(zzbbxVar);
        this.zza = zzbbxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
