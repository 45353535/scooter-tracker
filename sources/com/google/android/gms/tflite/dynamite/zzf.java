package com.google.android.gms.tflite.dynamite;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* JADX INFO: loaded from: classes8.dex */
public interface zzf extends IInterface {
    IObjectWrapper zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException;
}
