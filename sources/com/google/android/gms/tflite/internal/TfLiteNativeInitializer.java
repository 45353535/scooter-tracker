package com.google.android.gms.tflite.internal;

import android.content.Context;
import com.google.android.gms.internal.tflite_java.zzi;
import com.google.android.gms.internal.tflite_java.zzo;
import com.google.android.gms.tflite.dynamite.TfLiteDynamite;

/* JADX INFO: loaded from: classes8.dex */
public class TfLiteNativeInitializer extends zzi {
    public TfLiteNativeInitializer(Context context) {
        super(context, TfLiteDynamite.createDefaultExecutor(), zzo.CUSTOMER_3P_NATIVE_API);
    }

    @Override // com.google.android.gms.internal.tflite_java.zzi
    protected native void initializeNative(Object obj);
}
