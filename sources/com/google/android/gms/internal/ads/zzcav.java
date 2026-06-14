package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcav extends zzbct implements zzcaw {
    public zzcav() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static zzcaw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return iInterfaceQueryLocalInterface instanceof zzcaw ? (zzcaw) iInterfaceQueryLocalInterface : new zzcau(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(iZzf);
        }
        return true;
    }
}
