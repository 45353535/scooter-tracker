package io.bidmachine.ads.networks.vungle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class VungleRewardedAd extends h {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private Listener listener;

    @Nullable
    private RewardedAd rewardedAd;

    private static final class Listener extends VungleBaseAdListener<i> implements RewardedAdListener {
        Listener(@NonNull i iVar) {
            super(iVar);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(@NonNull BaseAd baseAd) {
            getCallback().onAdClosed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(@NonNull BaseAd baseAd) {
            getCallback().onAdLoaded();
        }

        @Override // com.vungle.ads.RewardedAdListener
        public void onAdRewarded(@NonNull BaseAd baseAd) {
            getCallback().onAdFinished();
        }
    }

    VungleRewardedAd() {
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setAdListener(null);
            this.rewardedAd = null;
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            iVar.onAdShowFailed(ae.a.i("Vungle rewarded object is null"));
        } else if (rewardedAd.canPlayAd().booleanValue()) {
            this.rewardedAd.play(contextProvider.getApplicationContext());
        } else {
            iVar.onAdShowFailed(ae.a.i("Can't play Vungle rewarded"));
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        VungleParams vungleParams = new VungleParams(kVar);
        if (vungleParams.isValid(iVar)) {
            this.listener = new Listener(iVar);
            RewardedAd rewardedAd = new RewardedAd(contextProvider.getApplicationContext(), vungleParams.placementId, new AdConfig());
            this.rewardedAd = rewardedAd;
            rewardedAd.setAdListener(this.listener);
            this.rewardedAd.load(vungleParams.markup);
        }
    }
}
