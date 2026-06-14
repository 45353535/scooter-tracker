package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcw extends zzbm implements zzcx {
    public zzcw() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        zze();
        return true;
    }
}
