package com.appodeal.ads.unified;

import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnifiedFullscreenAdCallback extends UnifiedAdCallback {
    public abstract void onAdClosed();

    public abstract void onAdFinished();

    public abstract void onAdLoaded();

    public abstract void onAdLoaded(@Nullable ImpressionLevelData impressionLevelData);

    public abstract void onAdShown();
}
