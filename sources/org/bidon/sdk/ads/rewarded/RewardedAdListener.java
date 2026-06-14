package org.bidon.sdk.ads.rewarded;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.Ad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/ads/rewarded/RewardedAdListener;", "", "onUserRewarded", "", "ad", "Lorg/bidon/sdk/ads/Ad;", "reward", "Lorg/bidon/sdk/ads/rewarded/Reward;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RewardedAdListener {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onUserRewarded(@NotNull RewardedAdListener rewardedAdListener, @NotNull Ad ad2, @Nullable Reward reward) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
        }
    }

    void onUserRewarded(@NotNull Ad ad2, @Nullable Reward reward);
}
