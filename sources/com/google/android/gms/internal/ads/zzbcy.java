package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbcy extends zzbcs implements zzbda {
    zzbcy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString("GMA_SDK");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzf() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzg(int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzh(byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzi(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzj(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(7, parcelZza);
    }
}
