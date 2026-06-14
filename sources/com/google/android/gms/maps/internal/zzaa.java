package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzaa extends com.google.android.gms.internal.maps.zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzb();
        } else {
            if (i10 != 2) {
                return false;
            }
            com.google.android.gms.internal.maps.zzaa zzaaVarZzb = com.google.android.gms.internal.maps.zzz.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(zzaaVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
