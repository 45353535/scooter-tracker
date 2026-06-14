package com.google.android.gms.tflite.dynamite.acceleration;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes8.dex */
@KeepForSdk
public interface AccelerationServiceLogger {
    @KeepForSdk
    void logApplyValidatedConfig(int i10, @NonNull ApplyValidatedConfigStatus applyValidatedConfigStatus);

    @KeepForSdk
    void logGenerateBestConfigCounter();

    @KeepForSdk
    void logSelectBestConfigCounter();

    @KeepForSdk
    void logValidateConfigCounter();

    @KeepForSdk
    void logValidationResult(@NonNull byte[] bArr, @NonNull ValidationSettings validationSettings);
}
