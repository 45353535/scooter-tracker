package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbzk extends zzbct implements zzbzl {
    public zzbzk() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbcu.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbcu.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i10 == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzbcu.zzh(parcel);
            zzf(zzbaVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzbcu.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbzu zzbzuVar = (zzbzu) zzbcu.zzb(parcel, zzbzu.CREATOR);
            zzbcu.zzh(parcel);
            zzg(parcelFileDescriptor2, zzbzuVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
