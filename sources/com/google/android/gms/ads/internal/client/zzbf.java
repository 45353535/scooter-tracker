package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcs;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbf extends zzbcs implements zzbh {
    zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() throws RemoteException {
        zzda(1, zza());
    }
}
