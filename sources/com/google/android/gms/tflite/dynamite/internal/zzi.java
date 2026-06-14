package com.google.android.gms.tflite.dynamite.internal;

import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes8.dex */
public final class zzi {
    private final DynamiteModule zza;
    private final int zzb;

    zzi(DynamiteModule dynamiteModule, int i10) {
        this.zza = dynamiteModule;
        this.zzb = i10;
    }

    public final int zza() {
        return this.zzb;
    }

    public final IBinder zzb(String str) throws DynamiteModule.LoadingException {
        return this.zza.instantiate(str);
    }
}
