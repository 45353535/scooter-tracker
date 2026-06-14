package io.bidmachine.ads.networks.meta_audience;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MetaAudienceRewarded extends h {

    @Nullable
    private Listener listener;

    @Nullable
    private RewardedVideoAd rewardedVideoAd;

    private static final class Listener extends BaseMetaAudienceListener<i> implements RewardedVideoAdListener {
        Listener(@NonNull i iVar) {
            super(iVar);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            getCallback().onAdLoaded();
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoClosed() {
            getCallback().onAdClosed();
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoCompleted() {
            getCallback().onAdFinished();
        }
    }

    MetaAudienceRewarded() {
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        RewardedVideoAd rewardedVideoAd = this.rewardedVideoAd;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
            this.rewardedVideoAd = null;
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        RewardedVideoAd rewardedVideoAd = this.rewardedVideoAd;
        if (rewardedVideoAd == null) {
            iVar.onAdShowFailed(ae.a.i("MetaAudience rewarded object is null"));
            return;
        }
        if (!rewardedVideoAd.isAdLoaded()) {
            iVar.onAdShowFailed(ae.a.i("MetaAudience rewarded object not loaded"));
        } else if (this.rewardedVideoAd.isAdInvalidated()) {
            iVar.onAdShowFailed(ae.a.i("MetaAudience rewarded object invalidated"));
        } else {
            this.rewardedVideoAd.show();
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        MetaAudienceParams metaAudienceParams = new MetaAudienceParams(kVar);
        if (metaAudienceParams.isValid(iVar)) {
            this.listener = new Listener(iVar);
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(contextProvider.getApplicationContext(), metaAudienceParams.placementId);
            this.rewardedVideoAd = rewardedVideoAd;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this.listener).withBid(metaAudienceParams.bidPayload).withFailOnCacheFailureEnabled(false).build());
        }
    }
}
