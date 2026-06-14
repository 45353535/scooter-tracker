package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd extends com.google.android.gms.internal.tflite.zza implements IInterface {
    zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLoggerCreator");
    }

    public final zzc zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException {
        zzc zzcVar;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(parcelZza, customerInfo);
        Parcel parcelZzb = zzb(1, parcelZza);
        IBinder strongBinder = parcelZzb.readStrongBinder();
        if (strongBinder == null) {
            zzcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLogger");
            zzcVar = iInterfaceQueryLocalInterface instanceof zzc ? (zzc) iInterfaceQueryLocalInterface : new zzc(strongBinder);
        }
        parcelZzb.recycle();
        return zzcVar;
    }
}
