package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class zzczz {
    private final AtomicLong zza;

    zzczz(zzfjc zzfjcVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.zza = atomicLong;
        atomicLong.set(zzfjcVar.zza.zza.zzu.get());
    }

    public final long zza() {
        return this.zza.get();
    }

    public final void zzb(long j10) {
        this.zza.set(j10);
    }
}
