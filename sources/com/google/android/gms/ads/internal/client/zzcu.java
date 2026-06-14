package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzcu extends zzbct implements zzcv {
    public zzcu() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zze zzeVar = (zze) zzbcu.zzb(parcel, zze.CREATOR);
            zzbcu.zzh(parcel);
            zzb(zzeVar);
        } else if (i10 == 2) {
            zzc();
        } else if (i10 == 3) {
            zzd();
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
