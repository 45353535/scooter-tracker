package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbg extends com.google.android.gms.internal.maps.zzb implements zzbh {
    public zzbg() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzao zzaoVarZzb = com.google.android.gms.internal.maps.zzan.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzaoVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
