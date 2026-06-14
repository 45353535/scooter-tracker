package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzw extends com.google.android.gms.internal.common.zzb implements zzx {
    public zzw() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static zzx zzg(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof zzx ? (zzx) iInterfaceQueryLocalInterface : new zzv(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            IObjectWrapper iObjectWrapperZzd = zzd();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zze(parcel2, iObjectWrapperZzd);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        }
        return true;
    }
}
