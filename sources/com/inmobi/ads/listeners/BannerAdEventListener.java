package com.inmobi.ads.listeners;

import androidx.annotation.NonNull;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BannerAdEventListener extends AdEventListener<InMobiBanner> {
    public void onAdDismissed(@NonNull InMobiBanner inMobiBanner) {
    }

    public void onAdDisplayed(@NonNull InMobiBanner inMobiBanner) {
    }

    public void onAdFetchFailed(@NonNull InMobiBanner inMobiBanner, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onRewardsUnlocked(@NonNull InMobiBanner inMobiBanner, Map<Object, Object> map) {
    }

    public void onUserLeftApplication(@NonNull InMobiBanner inMobiBanner) {
    }
}
