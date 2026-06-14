package com.google.android.gms.tflite.dynamite;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzb extends com.google.android.gms.internal.tflite.zzb implements zzc {
    public static zzc zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tflite.dynamite.ITfLiteDynamiteLoader");
        return iInterfaceQueryLocalInterface instanceof zzc ? (zzc) iInterfaceQueryLocalInterface : new zza(iBinder);
    }
}
