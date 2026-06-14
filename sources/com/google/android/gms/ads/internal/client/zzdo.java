package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcs;

/* JADX INFO: loaded from: classes7.dex */
public final class zzdo extends zzbcs implements zzdq {
    zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }
}
