package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeqf {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdvp zzb;

    public zzeqf(zzdvp zzdvpVar) {
        this.zzb = zzdvpVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e10);
        }
    }

    public final zzbvs zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbvs) concurrentHashMap.get(str);
        }
        return null;
    }
}
