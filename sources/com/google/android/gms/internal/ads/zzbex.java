package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public interface zzbex extends IInterface {
    com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, zzbfe zzbfeVar) throws RemoteException;

    @Nullable
    com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException;

    void zzh(boolean z10) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException;

    @Nullable
    String zzj() throws RemoteException;

    long zzk() throws RemoteException;

    void zzl(long j10) throws RemoteException;
}
