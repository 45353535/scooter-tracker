package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
final class zzhai implements Runnable {
    zzhak zza;

    zzhai(zzhak zzhakVar) {
        this.zza = zzhakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFutureZzf;
        zzhak zzhakVar = this.zza;
        if (zzhakVar == null || (listenableFutureZzf = zzhakVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (listenableFutureZzf.isDone()) {
            zzhakVar.zzk(listenableFutureZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzhakVar.zzx();
            zzhakVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb2.append("Timed out");
                        sb2.append(" (timeout delayed by ");
                        sb2.append(jAbs);
                        sb2.append(" ms after scheduled time)");
                        string = sb2.toString();
                    }
                } catch (Throwable th2) {
                    zzhakVar.zzb(new zzhaj(string, null));
                    throw th2;
                }
            }
            String string2 = listenableFutureZzf.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
            sb3.append(string);
            sb3.append(": ");
            sb3.append(string2);
            zzhakVar.zzb(new zzhaj(sb3.toString(), null));
        } finally {
            listenableFutureZzf.cancel(true);
        }
    }
}
