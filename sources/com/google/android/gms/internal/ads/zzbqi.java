package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbqi extends zzbcs implements zzbqk {
    zzbqi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(3, parcelZza);
    }
}
