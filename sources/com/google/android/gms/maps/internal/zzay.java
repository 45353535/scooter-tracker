package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzay extends com.google.android.gms.internal.maps.zzb implements zzaz {
    public zzay() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        boolean zZzb = zzb();
        parcel2.writeNoException();
        int i12 = com.google.android.gms.internal.maps.zzc.zza;
        parcel2.writeInt(zZzb ? 1 : 0);
        return true;
    }
}
