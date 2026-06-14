package io.bidmachine.ads.networks.my_target;

import ae.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.models.IAdLoadingError;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MyTargetRewarded extends h {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private RewardedAd rewardedAd;

    private static final class Listener implements RewardedAd.RewardedAdListener {

        @NonNull
        private final i callback;

        Listener(@NonNull i iVar) {
            this.callback = iVar;
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onClick(@NonNull RewardedAd rewardedAd) {
            this.callback.onAdClicked();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDismiss(@NonNull RewardedAd rewardedAd) {
            this.callback.onAdClosed();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDisplay(@NonNull RewardedAd rewardedAd) {
            this.callback.onAdShown();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onFailedToShow(@NonNull RewardedAd rewardedAd) {
            this.callback.onAdShowFailed(a.i("Failed to show"));
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onLoad(@NonNull RewardedAd rewardedAd) {
            this.callback.onAdLoaded();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull RewardedAd rewardedAd) {
            this.callback.onAdLoadFailed(MyTargetAdapter.mapError(iAdLoadingError));
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onReward(@NonNull Reward reward, @NonNull RewardedAd rewardedAd) {
            this.callback.onAdFinished();
        }
    }

    MyTargetRewarded() {
    }

    @Override // od.b
    public void onDestroy() {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.destroy();
            this.rewardedAd = null;
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.show(contextProvider.getContext());
        } else {
            iVar.onAdShowFailed(a.i("MyTarget rewarded object is null"));
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        MyTargetParams myTargetParams = new MyTargetParams(kVar);
        if (myTargetParams.isValid(iVar)) {
            RewardedAd rewardedAd = new RewardedAd(myTargetParams.slotId.intValue(), contextProvider.getContext());
            this.rewardedAd = rewardedAd;
            rewardedAd.setListener(new Listener(iVar));
            MyTargetAdapter.updateTargeting(jVar, this.rewardedAd.getCustomParams());
            this.rewardedAd.loadFromBid(myTargetParams.bidId);
        }
    }
}
