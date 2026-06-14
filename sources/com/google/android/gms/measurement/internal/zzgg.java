package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgg extends com.google.android.gms.internal.measurement.zzbm implements zzgh {
    public zzgg() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, zzoq.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
        zze(zzoqVar);
        return true;
    }
}
