package com.google.android.gms.tflite.dynamite;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zze extends com.google.android.gms.internal.tflite.zzb implements zzf {
    public static zzf zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tflite.dynamite.ITfLiteLoggerCreator");
        return iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zzd(iBinder);
    }
}
