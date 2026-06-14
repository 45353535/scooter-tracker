package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbra extends zzbct implements zzbrb {
    public static zzbrb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof zzbrb ? (zzbrb) iInterfaceQueryLocalInterface : new zzbqz(iBinder);
    }
}
