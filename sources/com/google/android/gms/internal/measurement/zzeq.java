package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzeq implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzfb zzk;

    zzeq(zzfb zzfbVar, boolean z10) {
        Objects.requireNonNull(zzfbVar);
        this.zzk = zzfbVar;
        this.zzh = zzfbVar.zza.currentTimeMillis();
        this.zzi = zzfbVar.zza.elapsedRealtime();
        this.zzj = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzk.zzP()) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e10) {
            this.zzk.zzN(e10, false, this.zzj);
            zzb();
        }
    }

    abstract void zza() throws RemoteException;

    protected void zzb() {
    }
}
