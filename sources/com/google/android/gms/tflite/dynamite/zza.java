package com.google.android.gms.tflite.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class zza extends com.google.android.gms.internal.tflite.zza implements zzc {
    zza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.ITfLiteDynamiteLoader");
    }

    @Override // com.google.android.gms.tflite.dynamite.zzc
    public final long zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(parcelZza, customerInfo);
        Parcel parcelZzb = zzb(2, parcelZza);
        long j10 = parcelZzb.readLong();
        parcelZzb.recycle();
        return j10;
    }

    @Override // com.google.android.gms.tflite.dynamite.zzc
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(parcelZza, customerInfo);
        Parcel parcelZzb = zzb(3, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.tflite.dynamite.zzc
    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.tflite.dynamite.internal.zzb zzbVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(parcelZza, zzbVar);
        Parcel parcelZzb = zzb(4, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iObjectWrapperAsInterface;
    }
}
