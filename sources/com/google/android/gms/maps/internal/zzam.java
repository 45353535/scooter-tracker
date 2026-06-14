package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzam extends com.google.android.gms.internal.maps.zzb implements zzan {
    public zzam() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) com.google.android.gms.internal.maps.zzc.zza(parcel, LatLng.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(latLng);
        parcel2.writeNoException();
        return true;
    }
}
