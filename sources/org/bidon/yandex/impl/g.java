package org.bidon.yandex.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;

/* JADX INFO: loaded from: classes4.dex */
public interface g {
    void a(Context context, AdRequestConfiguration adRequestConfiguration, InterstitialAdLoadListener interstitialAdLoadListener);

    void b(Context context, AdRequestConfiguration adRequestConfiguration, RewardedAdLoadListener rewardedAdLoadListener);
}
