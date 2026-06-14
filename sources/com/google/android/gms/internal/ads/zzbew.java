package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbew extends zzbct implements zzbex {
    public zzbew() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbex zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterfaceQueryLocalInterface instanceof zzbex ? (zzbex) iInterfaceQueryLocalInterface : new zzbev(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbfe zzbfcVar;
        switch (i10) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbx zzbxVarZze = zze();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbxVarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z10 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback") instanceof zzbfb;
                }
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbfcVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbfcVar = iInterfaceQueryLocalInterface instanceof zzbfe ? (zzbfe) iInterfaceQueryLocalInterface : new zzbfc(strongBinder2);
                }
                zzbcu.zzh(parcel);
                zzf(iObjectWrapperAsInterface, zzbfcVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzg = zzg();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzeaVarZzg);
                return true;
            case 6:
                boolean zZza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzh(zZza);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdt zzdtVarZzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzi(zzdtVarZzb);
                parcel2.writeNoException();
                return true;
            case 8:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 9:
                long jZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(jZzk);
                return true;
            case 10:
                long j10 = parcel.readLong();
                zzbcu.zzh(parcel);
                zzl(j10);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
