package com.google.android.gms.tflite.java;

import android.content.Context;
import com.google.android.gms.tflite.internal.TfLiteNativeInitializer;
import org.tensorflow.lite.TensorFlowLite;

/* JADX INFO: loaded from: classes8.dex */
final class zzb extends TfLiteNativeInitializer {
    public zzb(Context context) {
        super(context);
    }

    @Override // com.google.android.gms.internal.tflite_java.zzi
    protected final void zzc() {
        TensorFlowLite.a();
    }
}
