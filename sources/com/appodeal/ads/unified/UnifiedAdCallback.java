package com.appodeal.ads.unified;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnifiedAdCallback {
    public abstract void onAdClicked();

    public abstract void onAdClicked(@Nullable UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener);

    public abstract void onAdExpired();

    public abstract void onAdLoadFailed(@Nullable LoadingError loadingError);

    public abstract void onAdRevenueReceived(@Nullable ImpressionLevelData impressionLevelData);

    public abstract void onAdShowFailed(@Nullable ShowError showError);

    public abstract void onAdditionalInfoLoaded(@NonNull String str);

    public abstract void printError(@Nullable String str, @Nullable Object obj);
}
