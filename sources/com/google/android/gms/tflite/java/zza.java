package com.google.android.gms.tflite.java;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.internal.TfLiteJavaInitializerBase;
import org.tensorflow.lite.TensorFlowLite;

/* JADX INFO: loaded from: classes8.dex */
public final class zza extends TfLiteJavaInitializerBase {
    public zza(Context context) {
        super(context);
    }

    public final Task zza() {
        return super.zzb(TfLiteInitializationOptions.builder().setEnableAutomaticDownload(true).build());
    }

    @Override // com.google.android.gms.internal.tflite_java.zzi
    public final Task zzb(TfLiteInitializationOptions tfLiteInitializationOptions) {
        return super.zzb(TfLiteInitializationOptions.builder(tfLiteInitializationOptions).setEnableAutomaticDownload(true).build());
    }

    @Override // com.google.android.gms.internal.tflite_java.zzi
    protected final void zzc() {
        TensorFlowLite.a();
    }
}
