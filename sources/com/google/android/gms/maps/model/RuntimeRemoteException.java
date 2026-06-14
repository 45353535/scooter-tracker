package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public final class RuntimeRemoteException extends RuntimeException {
    public RuntimeRemoteException(@NonNull RemoteException remoteException) {
        super(remoteException);
    }
}
