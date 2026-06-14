package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzay {
    private static volatile Handler zzb;
    private final zzjg zza;
    private final Runnable zzc;
    private volatile long zzd;

    zzay(zzjg zzjgVar) {
        Preconditions.checkNotNull(zzjgVar);
        this.zza = zzjgVar;
        this.zzc = new zzax(this, zzjgVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzay.class) {
            try {
                if (zzb == null) {
                    zzb = new com.google.android.gms.internal.measurement.zzcn(this.zza.zzaY().getMainLooper());
                }
                handler = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public abstract void zza();

    public final void zzb(long j10) {
        zzd();
        if (j10 >= 0) {
            zzjg zzjgVar = this.zza;
            this.zzd = zzjgVar.zzaZ().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j10)) {
                return;
            }
            zzjgVar.zzaV().zzb().zzb("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean zzc() {
        return this.zzd != 0;
    }

    final void zzd() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    final /* synthetic */ void zze(long j10) {
        this.zzd = 0L;
    }
}
