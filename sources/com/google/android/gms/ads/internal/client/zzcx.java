package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbtt;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzcx extends zzbct implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcy asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface : new zzcw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzfc liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzbcu.zzd(parcel2, liteSdkVersion);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzbtt adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzbcu.zze(parcel2, adapterCreator);
        }
        return true;
    }
}
