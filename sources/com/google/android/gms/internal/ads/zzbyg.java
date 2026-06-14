package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbyg extends zzbct implements zzbyh {
    public static zzbyh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof zzbyh ? (zzbyh) iInterfaceQueryLocalInterface : new zzbyf(iBinder);
    }
}
