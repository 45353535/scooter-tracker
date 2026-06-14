package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzct extends zzbm implements zzcu {
    public zzct() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
        zzbn.zzf(parcel);
        zzb(bundle);
        parcel2.writeNoException();
        return true;
    }
}
