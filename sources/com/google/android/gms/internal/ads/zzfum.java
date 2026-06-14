package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfum implements Runnable {
    final /* synthetic */ zzfur zza;

    zzfum(zzfur zzfurVar) {
        Objects.requireNonNull(zzfurVar);
        this.zza = zzfurVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}
