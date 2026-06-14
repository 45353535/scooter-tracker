package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* JADX INFO: loaded from: classes7.dex */
public final class zzdr extends zzbcs implements zzdt {
    zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zztVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        boolean zZza = zzbcu.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
