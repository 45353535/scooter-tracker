package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbqj extends zzbct implements zzbqk {
    public zzbqj() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbqk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof zzbqk ? (zzbqk) iInterfaceQueryLocalInterface : new zzbqi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            zze();
        } else {
            if (i10 != 3) {
                return false;
            }
            String string = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
