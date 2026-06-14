package com.ironsource.adapters.inmobi.interstitial;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.ironsource.Df;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J*\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J*\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\u001b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ironsource/adapters/inmobi/interstitial/InMobiInterstitialListener;", "Lcom/inmobi/ads/listeners/InterstitialAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "placementId", "", "<init>", "(Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;Ljava/lang/String;)V", "onAdLoadSucceeded", "", "inMobiInterstitial", "Lcom/inmobi/ads/InMobiInterstitial;", "adMetaInfo", "Lcom/inmobi/ads/AdMetaInfo;", Df.f40641b, "inMobiAdRequestStatus", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "onAdWillDisplay", "onAdDisplayed", "onAdImpression", "onAdDisplayFailed", Df.f40645f, "params", "", "", "onUserLeftApplication", "onRewardsUnlocked", "rewards", "onAdDismissed", "inmobiadapter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiInterstitialListener extends InterstitialAdEventListener {

    @NotNull
    private final InterstitialSmashListener listener;

    @NotNull
    private final String placementId;

    public InMobiInterstitialListener(@NotNull InterstitialSmashListener listener, @NotNull String placementId) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.listener = listener;
        this.placementId = placementId;
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        onAdClicked2(inMobiInterstitial, (Map<Object, ? extends Object>) map);
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDismissed(@NotNull InMobiInterstitial inMobiInterstitial) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "inMobiInterstitial");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId);
        this.listener.onInterstitialAdClosed();
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayFailed(@NotNull InMobiInterstitial inMobiInterstitial) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "inMobiInterstitial");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId);
        this.listener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(this.placementId, "Interstitial"));
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayed(@NotNull InMobiInterstitial inMobiInterstitial, @NotNull AdMetaInfo adMetaInfo) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "inMobiInterstitial");
        Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId);
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdWillDisplay(@NotNull InMobiInterstitial inMobiInterstitial) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "inMobiInterstitial");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId);
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onRewardsUnlocked(@NotNull InMobiInterstitial inMobiInterstitial, @Nullable Map<Object, ? extends Object> rewards) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "inMobiInterstitial");
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onUserLeftApplication(@NotNull InMobiInterstitial inMobiInterstitial) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "inMobiInterstitial");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId);
    }

    /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
    public void onAdClicked2(@NotNull InMobiInterstitial inMobiInterstitial, @Nullable Map<Object, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "inMobiInterstitial");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId);
        this.listener.onInterstitialAdClicked();
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(@NotNull InMobiInterstitial inMobiInterstitial) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "inMobiInterstitial");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId);
        this.listener.onInterstitialAdOpened();
        this.listener.onInterstitialAdShowSucceeded();
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(@NotNull InMobiInterstitial inMobiInterstitial, @NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "inMobiInterstitial");
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, "inMobiAdRequestStatus");
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.placementId);
        String str = inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String() + "( " + inMobiAdRequestStatus.getStatusCode() + " )";
        IronSourceError ironSourceError = inMobiAdRequestStatus.getStatusCode() == InMobiAdRequestStatus.StatusCode.NO_FILL ? new IronSourceError(1158, str) : ErrorBuilder.buildLoadFailedError(str);
        ironLog.error("adapterError = " + ironSourceError);
        this.listener.onInterstitialAdLoadFailed(ironSourceError);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(@NotNull InMobiInterstitial inMobiInterstitial, @NotNull AdMetaInfo adMetaInfo) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "inMobiInterstitial");
        Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
        String creativeID = adMetaInfo.getCreativeID();
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId + ", creativeId = " + creativeID);
        if (creativeID == null || creativeID.length() == 0) {
            this.listener.onInterstitialAdReady();
        } else {
            this.listener.onInterstitialAdReady(MapsKt.mapOf(TuplesKt.to("creativeId", creativeID)));
        }
    }
}
