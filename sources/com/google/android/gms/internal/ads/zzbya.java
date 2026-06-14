package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbya extends zzbct implements zzbyb {
    public static zzbyb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterfaceQueryLocalInterface instanceof zzbyb ? (zzbyb) iInterfaceQueryLocalInterface : new zzbxz(iBinder);
    }
}
