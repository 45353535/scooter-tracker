package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcbe extends zzbcs implements zzcbg {
    zzcbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
