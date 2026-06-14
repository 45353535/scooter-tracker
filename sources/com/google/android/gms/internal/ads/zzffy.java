package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zzffy {
    public static void zza(AtomicReference atomicReference, zzffx zzffxVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzffxVar.zza(obj);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
