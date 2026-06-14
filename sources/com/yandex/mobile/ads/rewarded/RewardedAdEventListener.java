package com.yandex.mobile.ads.rewarded;

import androidx.annotation.MainThread;
import com.ironsource.Df;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/yandex/mobile/ads/rewarded/RewardedAdEventListener;", "", Df.f40645f, "", "onAdDismissed", "onAdFailedToShow", "adError", "Lcom/yandex/mobile/ads/common/AdError;", "onAdImpression", "impressionData", "Lcom/yandex/mobile/ads/common/ImpressionData;", "onAdShown", "onRewarded", "reward", "Lcom/yandex/mobile/ads/rewarded/Reward;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
public interface RewardedAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(@NotNull AdError adError);

    void onAdImpression(@Nullable ImpressionData impressionData);

    void onAdShown();

    void onRewarded(@NotNull Reward reward);
}
