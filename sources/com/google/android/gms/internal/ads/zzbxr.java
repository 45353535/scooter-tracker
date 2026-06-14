package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbxr extends zzbct implements zzbxs {
    public zzbxr() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbxs zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof zzbxs ? (zzbxs) iInterfaceQueryLocalInterface : new zzbxq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzh(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                zzi();
                parcel2.writeNoException();
                return true;
            case 3:
                zzj();
                parcel2.writeNoException();
                return true;
            case 4:
                zzk();
                parcel2.writeNoException();
                return true;
            case 5:
                zzl();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzo(bundle2);
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, bundle2);
                return true;
            case 7:
                zzp();
                parcel2.writeNoException();
                return true;
            case 8:
                zzq();
                parcel2.writeNoException();
                return true;
            case 9:
                zzs();
                parcel2.writeNoException();
                return true;
            case 10:
                zze();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzg = zzg();
                parcel2.writeNoException();
                int i12 = zzbcu.zza;
                parcel2.writeInt(zZzg ? 1 : 0);
                return true;
            case 12:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                Intent intent = (Intent) zzbcu.zzb(parcel, Intent.CREATOR);
                zzbcu.zzh(parcel);
                zzm(i13, i14, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzn(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 14:
                zzf();
                parcel2.writeNoException();
                return true;
            case 15:
                int i15 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                zzbcu.zzh(parcel);
                zzH(i15, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
