package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzbdw implements Runnable {
    final /* synthetic */ zzbdx zza;

    zzbdw(zzbdx zzbdxVar) {
        Objects.requireNonNull(zzbdxVar);
        this.zza = zzbdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbdx zzbdxVar = this.zza;
        synchronized (zzbdxVar.zzf()) {
            if (zzbdxVar.zzg().get() && zzbdxVar.zzh()) {
                zzbdxVar.zzg().set(false);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzbdxVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbdy) it.next()).zza(false);
                    } catch (Exception e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                    }
                }
            } else {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
