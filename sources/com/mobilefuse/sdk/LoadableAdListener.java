package com.mobilefuse.sdk;

import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/mobilefuse/sdk/LoadableAdListener;", "", TelemetryAdLifecycleEvent.AD_ERROR, "", "error", "Lcom/mobilefuse/sdk/AdError;", "onAdExpired", "onAdLoaded", "onAdNotFilled", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public interface LoadableAdListener {
    void onAdError(@NotNull AdError error);

    void onAdExpired();

    void onAdLoaded();

    void onAdNotFilled();
}
