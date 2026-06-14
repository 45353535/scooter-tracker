package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzaz extends zzat implements zzba {
    public zzaz() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzat
    protected final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        enforceNoDataAvail(parcel);
        zza(i12);
        return true;
    }
}
