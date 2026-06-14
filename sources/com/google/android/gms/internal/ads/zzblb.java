package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzblb extends zzbct implements zzblc {
    public zzblb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzblc zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof zzblc ? (zzblc) iInterfaceQueryLocalInterface : new zzbla(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzb(iObjectWrapperAsInterface);
        } else if (i10 == 2) {
            zzc();
        } else {
            if (i10 != 3) {
                return false;
            }
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzd(iObjectWrapperAsInterface2);
        }
        parcel2.writeNoException();
        return true;
    }
}
