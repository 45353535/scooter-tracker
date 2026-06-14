package com.google.android.gms.tflite.java;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;

/* JADX INFO: loaded from: classes8.dex */
public class TfLiteNative {
    private TfLiteNative() {
    }

    public static TfLiteClient getClient(Context context) {
        return new zzb(context).zze();
    }

    public static Task<Void> initialize(Context context) {
        return new zzb(context).zzb(TfLiteInitializationOptions.builder().setEnableAutomaticDownload(true).build());
    }

    public static Task<Void> initialize(Context context, TfLiteInitializationOptions tfLiteInitializationOptions) {
        return new zzb(context).zzb(TfLiteInitializationOptions.builder(tfLiteInitializationOptions).setEnableAutomaticDownload(true).build());
    }
}
