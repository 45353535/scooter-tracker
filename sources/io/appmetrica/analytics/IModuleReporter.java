package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface IModuleReporter {
    void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10);

    void reportEvent(@NonNull ModuleEvent moduleEvent);

    void sendEventsBuffer();

    void setSessionExtra(@NonNull String str, @Nullable byte[] bArr);
}
