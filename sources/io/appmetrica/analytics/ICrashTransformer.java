package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface ICrashTransformer {
    @Nullable
    Throwable process(@NonNull Throwable th2);
}
