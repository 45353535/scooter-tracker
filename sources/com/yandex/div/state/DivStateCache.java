package com.yandex.div.state;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface DivStateCache {
    @Nullable
    @AnyThread
    String getRootState(@NonNull String str);

    @Nullable
    @AnyThread
    String getState(@NonNull String str, @NonNull String str2);

    @AnyThread
    void putRootState(@NonNull String str, @NonNull String str2);

    @AnyThread
    void putState(@NonNull String str, @NonNull String str2, @NonNull String str3);
}
