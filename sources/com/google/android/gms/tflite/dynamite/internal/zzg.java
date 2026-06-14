package com.google.android.gms.tflite.dynamite.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zzg implements SuccessContinuation {
    public final /* synthetic */ zzh zza;
    public final /* synthetic */ TfLiteInitializationOptions zzb;

    public /* synthetic */ zzg(zzh zzhVar, TfLiteInitializationOptions tfLiteInitializationOptions) {
        this.zza = zzhVar;
        this.zzb = tfLiteInitializationOptions;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return zzh.zza(this.zza, this.zzb, (Void) obj);
    }
}
