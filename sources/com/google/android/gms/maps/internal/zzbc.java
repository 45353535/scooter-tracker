package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbc extends com.google.android.gms.internal.maps.zzb implements zzbd {
    public zzbc() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Location location = (Location) com.google.android.gms.internal.maps.zzc.zza(parcel, Location.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(location);
        parcel2.writeNoException();
        return true;
    }
}
