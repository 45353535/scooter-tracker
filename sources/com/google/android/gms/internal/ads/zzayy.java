package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzayy implements Runnable {
    final /* synthetic */ zzayz zza;

    zzayy(zzayz zzayzVar) {
        Objects.requireNonNull(zzayzVar);
        this.zza = zzayzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzayz zzayzVar = this.zza;
        synchronized (zzayzVar.zzp()) {
            if (zzayzVar.zzq()) {
                return;
            }
            zzayzVar.zzr(true);
            try {
                zzayzVar.zzn();
            } catch (Exception e10) {
                this.zza.zzo().zzc(2023, -1L, e10);
            }
            zzayz zzayzVar2 = this.zza;
            synchronized (zzayzVar2.zzp()) {
                zzayzVar2.zzr(false);
            }
        }
    }
}
