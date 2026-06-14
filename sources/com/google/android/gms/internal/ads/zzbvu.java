package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbvu extends zzbct implements zzbvv {
    public zzbvu() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            zzbcu.zzh(parcel);
            zze(string);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(string2);
        } else {
            if (i10 != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcu.zzh(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
