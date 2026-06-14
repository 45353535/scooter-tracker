package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzc extends com.google.android.gms.internal.tflite.zza implements IInterface {
    zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLogger");
    }

    public final void zzd(int i10, ApplyValidatedConfigStatus applyValidatedConfigStatus) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        com.google.android.gms.internal.tflite.zzc.zza(parcelZza, applyValidatedConfigStatus);
        zzc(3, parcelZza);
    }

    public final void zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc(1, parcelZza);
    }

    public final void zzf(byte[] bArr, ValidationSettings validationSettings) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        com.google.android.gms.internal.tflite.zzc.zza(parcelZza, validationSettings);
        zzc(2, parcelZza);
    }
}
