package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzay extends zzb implements zzaz {
    public zzay() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static zzaz zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return iInterfaceQueryLocalInterface instanceof zzaz ? (zzaz) iInterfaceQueryLocalInterface : new zzax(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        int i13 = parcel.readInt();
        int i14 = parcel.readInt();
        zzc.zzd(parcel);
        Tile tileZzb = zzb(i12, i13, i14);
        parcel2.writeNoException();
        zzc.zzf(parcel2, tileZzb);
        return true;
    }
}
