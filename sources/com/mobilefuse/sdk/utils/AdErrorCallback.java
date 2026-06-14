package com.mobilefuse.sdk.utils;

import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.config.ObservableConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/mobilefuse/sdk/utils/AdErrorCallback;", "", "onError", "", "adError", "Lcom/mobilefuse/sdk/AdError;", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public interface AdErrorCallback {
    void onError(@NotNull AdError adError, @NotNull ObservableConfig observableConfig);
}
