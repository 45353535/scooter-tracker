package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbxu extends zzbct implements zzbxv {
    public static zzbxv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof zzbxv ? (zzbxv) iInterfaceQueryLocalInterface : new zzbxt(iBinder);
    }
}
