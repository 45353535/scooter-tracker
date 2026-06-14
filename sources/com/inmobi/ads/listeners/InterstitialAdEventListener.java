package com.inmobi.ads.listeners;

import androidx.annotation.NonNull;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class InterstitialAdEventListener extends AdEventListener<InMobiInterstitial> {
    public void onAdDismissed(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayFailed(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
    }

    public void onAdFetchFailed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdWillDisplay(@NonNull InMobiInterstitial inMobiInterstitial) {
    }

    public void onRewardsUnlocked(@NonNull InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
    }

    public void onUserLeftApplication(@NonNull InMobiInterstitial inMobiInterstitial) {
    }
}
