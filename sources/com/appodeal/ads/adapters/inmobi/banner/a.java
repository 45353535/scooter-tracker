package com.appodeal.ads.adapters.inmobi.banner;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends BannerAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedBannerCallback f12351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pair f12352b;

    public a(UnifiedBannerCallback callback, Pair size) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f12351a = callback;
        this.f12352b = size;
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdClicked(InMobiBanner inMobiBanner, Map map) {
        InMobiBanner inMobiBanner2 = inMobiBanner;
        Intrinsics.checkNotNullParameter(inMobiBanner2, "inMobiBanner");
        this.f12351a.onAdClicked();
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus requestStatus) {
        InMobiBanner banner = inMobiBanner;
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        this.f12351a.printError(requestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String(), requestStatus.getStatusCode());
        this.f12351a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
        InMobiBanner banner = inMobiBanner;
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
        if (banner.getChildCount() == 0) {
            this.f12351a.onAdLoadFailed(LoadingError.InvalidAssets);
            return;
        }
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.inmobi.a.a(adMetaInfo);
        this.f12351a.onAdRevenueReceived(impressionLevelDataA);
        this.f12351a.onAdLoaded(banner, ((Number) this.f12352b.getSecond()).intValue(), impressionLevelDataA);
    }
}
