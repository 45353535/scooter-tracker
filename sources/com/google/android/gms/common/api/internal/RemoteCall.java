package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(@NonNull T t10, @NonNull U u10) throws RemoteException;
}
