package com.google.android.gms.tflite.client;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.dynamite.NativeInitializationHandle;

/* JADX INFO: loaded from: classes8.dex */
@KeepForSdk
public interface TfLiteClient extends OptionalModuleApi {

    @NonNull
    @KeepForSdk
    public static final TfLiteInitializationOptions DEFAULT_TFLITE_INITIALIZATION_OPTIONS = TfLiteInitializationOptions.builder().build();

    @NonNull
    @KeepForSdk
    Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle();

    @NonNull
    @KeepForSdk
    Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle(@NonNull TfLiteInitializationOptions tfLiteInitializationOptions);
}
