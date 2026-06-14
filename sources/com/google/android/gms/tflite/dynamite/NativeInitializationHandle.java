package com.google.android.gms.tflite.dynamite;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes8.dex */
@ShowFirstParty
@KeepForSdk
public class NativeInitializationHandle {
    private final Object zza;

    public NativeInitializationHandle(@NonNull Object obj) {
        this.zza = obj;
    }

    @NonNull
    @KeepForSdk
    public Object getInternal() {
        return this.zza;
    }
}
