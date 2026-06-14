package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes8.dex */
public final class zzars extends Thread {
    private final BlockingQueue zza;
    private final zzarr zzb;
    private final zzari zzc;
    private volatile boolean zzd = false;
    private final zzarp zze;

    public zzars(BlockingQueue blockingQueue, zzarr zzarrVar, zzari zzariVar, zzarp zzarpVar) {
        this.zza = blockingQueue;
        this.zzb = zzarrVar;
        this.zzc = zzariVar;
        this.zze = zzarpVar;
    }

    private void zzb() throws InterruptedException {
        zzary zzaryVar = (zzary) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaryVar.zze(3);
        try {
            try {
                zzaryVar.zzc("network-queue-take");
                zzaryVar.zzl();
                TrafficStats.setThreadStatsTag(zzaryVar.zzb());
                zzaru zzaruVarZza = this.zzb.zza(zzaryVar);
                zzaryVar.zzc("network-http-complete");
                if (zzaruVarZza.zze && zzaryVar.zzq()) {
                    zzaryVar.zzd("not-modified");
                    zzaryVar.zzw();
                } else {
                    zzase zzaseVarZzr = zzaryVar.zzr(zzaruVarZza);
                    zzaryVar.zzc("network-parse-complete");
                    zzarh zzarhVar = zzaseVarZzr.zzb;
                    if (zzarhVar != null) {
                        this.zzc.zzb(zzaryVar.zzi(), zzarhVar);
                        zzaryVar.zzc("network-cache-written");
                    }
                    zzaryVar.zzp();
                    this.zze.zza(zzaryVar, zzaseVarZzr, null);
                    zzaryVar.zzv(zzaseVarZzr);
                }
            } catch (zzash e10) {
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzaryVar, e10);
                zzaryVar.zzw();
            } catch (Exception e11) {
                zzask.zzd(e11, "Unhandled exception %s", e11.toString());
                zzash zzashVar = new zzash(e11);
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzaryVar, zzashVar);
                zzaryVar.zzw();
            }
            zzaryVar.zze(4);
        } catch (Throwable th2) {
            zzaryVar.zze(4);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzask.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
