package com.mobilefuse.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.utils.AdErrorHelper;

/* JADX INFO: loaded from: classes10.dex */
public class StabilityHelper {
    public static void logAdErrorException(@NonNull Object obj, @NonNull Throwable th2, @Nullable ObservableConfig observableConfig, @NonNull AdError adError) {
        logException(obj.getClass(), th2);
        try {
            AdErrorHelper.onAdError(adError, observableConfig);
        } catch (Throwable unused) {
        }
    }

    public static void logAdRenderingException(@NonNull Object obj, @NonNull Throwable th2, @Nullable ObservableConfig observableConfig) {
        logException(obj.getClass(), th2);
        try {
            AdErrorHelper.onAdRenderingError(observableConfig);
        } catch (Throwable unused) {
        }
    }

    public static void logException(@NonNull Object obj, @NonNull Throwable th2) {
        logException(obj.getClass(), th2);
    }

    public static void logException(@NonNull Class<?> cls, @NonNull Throwable th2) {
        StabilityHelperBridge.logException(cls, th2);
    }
}
