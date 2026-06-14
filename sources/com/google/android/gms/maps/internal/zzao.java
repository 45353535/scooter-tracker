package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzao extends com.google.android.gms.internal.maps.zzb implements zzap {
    public zzao() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
