package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbvo extends zzbct implements zzbvp {
    public zzbvo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            zze();
        } else if (i10 == 3) {
            String string = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(string);
        } else {
            if (i10 != 4) {
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
