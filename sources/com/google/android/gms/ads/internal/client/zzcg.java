package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzcg extends zzbct implements zzch {
    public zzcg() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzea zzdyVar;
        if (i10 == 1) {
            String string = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzdyVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
                zzdyVar = iInterfaceQueryLocalInterface instanceof zzea ? (zzea) iInterfaceQueryLocalInterface : new zzdy(strongBinder);
            }
            zzbcu.zzh(parcel);
            zze(string, zzdyVar);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(string2);
        } else {
            if (i10 != 3) {
                return false;
            }
            String string3 = parcel.readString();
            zze zzeVar = (zze) zzbcu.zzb(parcel, zze.CREATOR);
            zzbcu.zzh(parcel);
            zzg(string3, zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
