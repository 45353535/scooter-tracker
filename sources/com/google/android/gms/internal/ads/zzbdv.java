package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbdv {

    @VisibleForTesting
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final boolean zza(zzbdu zzbduVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzbduVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzb(zzbdu zzbduVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzbdu zzbduVar2 = (zzbdu) it.next();
                    if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                        if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze() && !zzbduVar.equals(zzbduVar2) && zzbduVar2.zzc().equals(zzbduVar.zzc())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzbduVar.equals(zzbduVar2) && zzbduVar2.zzb().equals(zzbduVar.zzb())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(zzbdu zzbduVar) {
        synchronized (this.zzb) {
            try {
                List list = this.zzc;
                if (list.size() >= 10) {
                    int size = list.size();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 30);
                    sb2.append("Queue is full, current size = ");
                    sb2.append(size);
                    String string = sb2.toString();
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                    list.remove(0);
                }
                int i11 = this.zza;
                this.zza = i11 + 1;
                zzbduVar.zzk(i11);
                zzbduVar.zzh();
                list.add(zzbduVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
