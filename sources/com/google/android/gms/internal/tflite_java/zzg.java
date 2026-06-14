package com.google.android.gms.internal.tflite_java;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;

/* JADX INFO: loaded from: classes8.dex */
final class zzg {
    private final Task zza;
    private final TfLiteInitializationOptions zzb;

    /* synthetic */ zzg(Task task, TfLiteInitializationOptions tfLiteInitializationOptions, zzh zzhVar) {
        this.zza = task;
        this.zzb = tfLiteInitializationOptions;
    }

    final Task zza(TfLiteInitializationOptions tfLiteInitializationOptions) {
        if (!tfLiteInitializationOptions.enableGpuDelegateSupport() || this.zzb.enableGpuDelegateSupport()) {
            return this.zza;
        }
        throw new IllegalStateException("TFLite has already been initialized without GPU delegate support");
    }
}
