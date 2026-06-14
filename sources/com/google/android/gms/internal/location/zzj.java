package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzj extends zzb implements zzk {
    public zzj() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzg zzgVar = (zzg) zzc.zza(parcel, zzg.CREATOR);
            zzc.zzb(parcel);
            zzd(zzgVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
