package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbun implements InitializationCompleteCallback {
    final /* synthetic */ zzbqk zza;

    zzbun(zzbuu zzbuuVar, zzbqk zzbqkVar) {
        this.zza = zzbqkVar;
        Objects.requireNonNull(zzbuuVar);
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }
}
