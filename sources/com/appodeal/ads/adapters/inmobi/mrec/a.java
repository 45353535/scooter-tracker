package com.appodeal.ads.adapters.inmobi.mrec;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends BannerAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedMrecCallback f12359a;

    public a(UnifiedMrecCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12359a = callback;
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdClicked(InMobiBanner inMobiBanner, Map map) {
        InMobiBanner mrec = inMobiBanner;
        Intrinsics.checkNotNullParameter(mrec, "mrec");
        this.f12359a.onAdClicked();
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus requestStatus) {
        InMobiBanner mrec = inMobiBanner;
        Intrinsics.checkNotNullParameter(mrec, "mrec");
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        this.f12359a.printError(requestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String(), requestStatus.getStatusCode());
        this.f12359a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
        InMobiBanner mrec = inMobiBanner;
        Intrinsics.checkNotNullParameter(mrec, "mrec");
        Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
        if (mrec.getChildCount() == 0) {
            this.f12359a.onAdLoadFailed(LoadingError.InvalidAssets);
            return;
        }
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.inmobi.a.a(adMetaInfo);
        this.f12359a.onAdRevenueReceived(impressionLevelDataA);
        this.f12359a.onAdLoaded(mrec, impressionLevelDataA);
    }
}
