package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbqm extends zzbct implements zzbqn {
    public zzbqm() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbqn zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof zzbqn ? (zzbqn) iInterfaceQueryLocalInterface : new zzbql(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbqg.CREATOR);
        zzbcu.zzh(parcel);
        zzb(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
