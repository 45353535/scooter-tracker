package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbfd extends zzbct implements zzbfe {
    public zzbfd() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzc();
        } else if (i10 == 2) {
            zzd();
        } else if (i10 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcu.zzh(parcel);
            zze(zzeVar);
        } else if (i10 == 4) {
            zzf();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
