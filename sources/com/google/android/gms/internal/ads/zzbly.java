package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbly extends zzbct implements zzblz {
    public zzbly() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static zzblz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzblz ? (zzblz) iInterfaceQueryLocalInterface : new zzblx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzblm zzblkVar;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzblkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzblkVar = iInterfaceQueryLocalInterface instanceof zzblm ? (zzblm) iInterfaceQueryLocalInterface : new zzblk(strongBinder);
        }
        zzbcu.zzh(parcel);
        zze(zzblkVar);
        parcel2.writeNoException();
        return true;
    }
}
