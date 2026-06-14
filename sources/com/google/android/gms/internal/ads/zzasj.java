package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzasj {
    public static final boolean zza = zzask.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzasj() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzask.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j10) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzasi(str, j10, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzasi> list = this.zzb;
        long j10 = list.size() == 0 ? 0L : ((zzasi) list.get(list.size() - 1)).zzc - ((zzasi) list.get(0)).zzc;
        if (j10 > 0) {
            long j11 = ((zzasi) list.get(0)).zzc;
            zzask.zzb("(%-4d ms) %s", Long.valueOf(j10), str);
            for (zzasi zzasiVar : list) {
                long j12 = zzasiVar.zzc;
                zzask.zzb("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(zzasiVar.zzb), zzasiVar.zza);
                j11 = j12;
            }
        }
    }
}
