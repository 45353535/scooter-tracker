package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            int i12 = zzc.zza;
            int i13 = parcel.readInt();
            zzc.zzc(parcel);
            zzb(i13 != 0);
        } else {
            if (i10 != 2) {
                return false;
            }
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            zzc.zzc(parcel);
            zzc(status);
        }
        parcel2.writeNoException();
        return true;
    }
}
