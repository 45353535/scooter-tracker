package com.appodeal.ads.adapters.inmobi.interstitial;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends InterstitialAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedInterstitialCallback f12357a;

    public a(UnifiedInterstitialCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12357a = callback;
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        InMobiInterstitial interstitial = inMobiInterstitial;
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(map, "map");
        this.f12357a.onAdClicked();
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDismissed(InMobiInterstitial interstitial) {
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        this.f12357a.onAdClosed();
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayFailed(InMobiInterstitial interstitial) {
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        this.f12357a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback());
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayed(InMobiInterstitial interstitial, AdMetaInfo adMetaInfo) {
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
        this.f12357a.onAdShown();
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus requestStatus) {
        InMobiInterstitial interstitial = inMobiInterstitial;
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        this.f12357a.printError(requestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String(), requestStatus.getStatusCode());
        this.f12357a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        InMobiInterstitial interstitial = inMobiInterstitial;
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.inmobi.a.a(adMetaInfo);
        this.f12357a.onAdRevenueReceived(impressionLevelDataA);
        this.f12357a.onAdLoaded(impressionLevelDataA);
    }
}
