package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbla extends zzbcs implements zzblc {
    zzbla(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zzc() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzda(3, parcelZza);
    }
}
