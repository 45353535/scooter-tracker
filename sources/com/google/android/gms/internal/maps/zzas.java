package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.FeatureStyle;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.maps.model.internal.IStyleFactory");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzr zzpVar;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureDelegate");
            zzpVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzp(strongBinder);
        }
        zzc.zzd(parcel);
        FeatureStyle featureStyleZzb = zzb(zzpVar);
        parcel2.writeNoException();
        zzc.zzf(parcel2, featureStyleZzb);
        return true;
    }
}
