package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcs;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbz extends zzbcs implements zzcb {
    zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }
}
