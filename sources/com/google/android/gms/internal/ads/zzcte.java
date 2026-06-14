package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcte implements zzbdy {
    private final ScheduledExecutorService zza;
    private final Clock zzb;

    @Nullable
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcte(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = scheduledExecutorService;
        this.zzb = clock;
        com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z10) {
        if (z10) {
            zzd();
        } else {
            zzc();
        }
    }

    public final synchronized void zzb(int i10, Runnable runnable) {
        this.zzf = runnable;
        long j10 = i10;
        this.zzd = this.zzb.elapsedRealtime() + j10;
        this.zzc = this.zza.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @VisibleForTesting
    final synchronized void zzc() {
        try {
            if (this.zzg) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.zze = -1L;
            } else {
                this.zzc.cancel(true);
                this.zze = this.zzd - this.zzb.elapsedRealtime();
            }
            this.zzg = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    final synchronized void zzd() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.zzg) {
                if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                    this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
                }
                this.zzg = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
