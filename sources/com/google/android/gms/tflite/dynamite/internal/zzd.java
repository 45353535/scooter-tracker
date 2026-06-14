package com.google.android.gms.tflite.dynamite.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.apps.common.proguard.UsedByNative;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd {
    private final long zza;
    private final Object zzb;

    public zzd(long j10, Object obj, boolean z10) {
        this.zza = j10;
        this.zzb = obj;
    }

    @UsedByNative("NativeInitializationHandleInternal_gen.cc")
    Object getLogger() {
        return this.zzb;
    }

    @UsedByNative("NativeInitializationHandleInternal_gen.cc")
    @VisibleForTesting
    public long getTflApi() {
        return this.zza;
    }

    @UsedByNative("NativeInitializationHandleInternal_gen.cc")
    boolean shouldUseInitV2() {
        return false;
    }
}
