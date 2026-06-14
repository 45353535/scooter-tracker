package com.google.android.gms.tflite.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd extends com.google.android.gms.internal.tflite.zza implements zzf {
    zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.ITfLiteLoggerCreator");
    }

    @Override // com.google.android.gms.tflite.dynamite.zzf
    public final IObjectWrapper zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(parcelZza, customerInfo);
        Parcel parcelZzb = zzb(3, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iObjectWrapperAsInterface;
    }
}
