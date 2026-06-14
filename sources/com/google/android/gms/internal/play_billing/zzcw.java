package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
final class zzcw implements Runnable {
    final Future zza;
    final zzcv zzb;

    zzcw(Future future, zzcv zzcvVar) {
        this.zza = future;
        this.zzb = zzcvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thZza;
        boolean z10 = true;
        boolean z11 = false;
        Future future = this.zza;
        if ((future instanceof zzdi) && (thZza = zzdj.zza((zzdi) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            if (!future.isDone()) {
                throw new IllegalStateException(zzbm.zzb("Future was expected to be done: %s", future));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = z10;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e10) {
            this.zzb.zza(e10.getCause());
        } catch (Throwable th3) {
            this.zzb.zza(th3);
        }
    }

    public final String toString() {
        zzbf zzbfVarZza = zzbh.zza(this);
        zzbfVarZza.zza(this.zzb);
        return zzbfVarZza.toString();
    }
}
