package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i10, @NonNull IBinder iBinder, @NonNull Bundle bundle) throws RemoteException;

    void zzb(int i10, @NonNull Bundle bundle) throws RemoteException;

    void zzc(int i10, IBinder iBinder, zzj zzjVar) throws RemoteException;
}
