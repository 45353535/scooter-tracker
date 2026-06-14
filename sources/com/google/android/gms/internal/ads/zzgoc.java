package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgoc {
    private final zzgdh zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private long zzc = -1;
    private long zzd = -1;
    private Throwable zze = null;
    private final int zzf;

    zzgoc(int i10, zzgao zzgaoVar, zzgdh zzgdhVar) {
        this.zzf = i10;
        this.zza = zzgdhVar;
    }

    public final void zza() {
        if (this.zzb.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zzc = SystemClock.uptimeMillis();
    }

    public final void zzb(Throwable th2) {
        if (this.zzb.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zze = th2;
    }

    public final void zzc() {
        AtomicBoolean atomicBoolean = this.zzb;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zzd = SystemClock.uptimeMillis();
        this.zza.zzb(this.zzf - 1, atomicBoolean.get() ? this.zzd - this.zzc : -1L, this.zze, null);
    }
}
