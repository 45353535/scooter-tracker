package com.appodeal.ads.unified;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/unified/UnifiedNativeCallback;", "Lcom/appodeal/ads/unified/UnifiedAdCallback;", "<init>", "()V", "onAdLoaded", "", "unifiedNativeAd", "Lcom/appodeal/ads/unified/UnifiedNativeAd;", "impressionLevelData", "Lcom/appodeal/ads/modules/common/internal/adunit/ImpressionLevelData;", "onAdShown", "onAdFinished", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class UnifiedNativeCallback extends UnifiedAdCallback {
    public abstract void onAdFinished();

    public abstract void onAdLoaded(@NotNull UnifiedNativeAd unifiedNativeAd);

    public abstract void onAdLoaded(@NotNull UnifiedNativeAd unifiedNativeAd, @Nullable ImpressionLevelData impressionLevelData);

    public abstract void onAdShown();
}
