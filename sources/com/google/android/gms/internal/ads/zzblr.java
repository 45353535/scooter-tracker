package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzblr extends zzbcs implements zzblt {
    zzblr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zze(zzblj zzbljVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzbljVar);
        zzda(1, parcelZza);
    }
}
