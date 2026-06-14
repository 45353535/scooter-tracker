package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface Gd {
    void onAdInstanceDidBecomeVisible();

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToShow(@NotNull IronSourceError ironSourceError);

    void onRewardedAdShown();

    void onUserEarnedReward();
}
