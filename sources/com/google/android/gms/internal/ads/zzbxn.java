package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbxn extends zzbct implements zzbxo {
    public static zzbxo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterfaceQueryLocalInterface instanceof zzbxo ? (zzbxo) iInterfaceQueryLocalInterface : new zzbxm(iBinder);
    }
}
