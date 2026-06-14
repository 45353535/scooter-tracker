package com.moloco.sdk.internal.unity_bridge;

import com.ironsource.Df;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;", "", "onAdLoadSuccess", "", "adUnitId", "", Df.f40641b, "error", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MolocoUnityLoadCallback {
    void onAdLoadFailed(@NotNull String adUnitId, @NotNull String error);

    void onAdLoadSuccess(@NotNull String adUnitId);
}
