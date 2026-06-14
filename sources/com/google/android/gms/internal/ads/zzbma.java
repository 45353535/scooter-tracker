package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbma extends zzbcs implements IInterface {
    zzbma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
    }

    public final void zze() throws RemoteException {
        zzda(2, zza());
    }
}
