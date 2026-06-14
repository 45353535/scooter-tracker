package com.google.android.gms.tflite.dynamite;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* JADX INFO: loaded from: classes8.dex */
public interface zzc extends IInterface {
    long zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException;

    IObjectWrapper zze(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException;

    IObjectWrapper zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.tflite.dynamite.internal.zzb zzbVar) throws RemoteException;
}
