package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbqw extends zzbcs implements zzbqy {
    zzbqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zzf(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(2, parcelZza);
    }
}
