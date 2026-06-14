package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface NetworkResponseHandler<T> {
    @Nullable
    T handle(@NonNull ResponseDataHolder responseDataHolder);
}
