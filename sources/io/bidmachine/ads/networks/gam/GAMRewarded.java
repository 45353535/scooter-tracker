package io.bidmachine.ads.networks.gam;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.LogConstants;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;

/* JADX INFO: loaded from: classes12.dex */
class GAMRewarded extends od.h {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @NonNull
    private final GAMNetwork gamNetwork;

    @Nullable
    private InternalGAMRewardedAd gamRewardedAd;

    @Nullable
    private Listener listener;

    private static final class Listener extends GAMFullscreenAdListener<InternalGAMRewardedAd> implements InternalGAMRewardedAdListener {

        @NonNull
        private final GAMRewarded gamRewarded;

        private Listener(@NonNull od.i iVar, @NonNull GAMRewarded gAMRewarded) {
            super(iVar);
            this.gamRewarded = gAMRewarded;
        }

        @Override // io.bidmachine.ads.networks.gam.GAMFullscreenAdListener
        public void onAdLoaded(@NonNull InternalGAMRewardedAd internalGAMRewardedAd) {
            this.gamRewarded.gamRewardedAd = internalGAMRewardedAd;
            super.onAdLoaded(internalGAMRewardedAd);
        }
    }

    protected GAMRewarded(@NonNull GAMNetwork gAMNetwork) {
        this.gamNetwork = gAMNetwork;
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        InternalGAMRewardedAd internalGAMRewardedAd = this.gamRewardedAd;
        if (internalGAMRewardedAd != null) {
            internalGAMRewardedAd.destroy();
            this.gamRewardedAd = null;
        }
    }

    @Override // od.b
    public void onShown() {
        super.onShown();
        InternalGAMRewardedAd internalGAMRewardedAd = this.gamRewardedAd;
        if (internalGAMRewardedAd != null) {
            internalGAMRewardedAd.onAdShown();
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull od.i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.onAdShowFailed(ae.a.i(LogConstants.MSG_ACTIVITY_IS_NULL));
            return;
        }
        InternalGAMRewardedAd internalGAMRewardedAd = this.gamRewardedAd;
        if (internalGAMRewardedAd == null) {
            iVar.onAdShowFailed(ae.a.i("InternalGAM rewarded object is null"));
            return;
        }
        if (internalGAMRewardedAd.isExpired()) {
            iVar.onAdShowFailed(ae.a.i("InternalGAM rewarded object is expired"));
            return;
        }
        if (!this.gamRewardedAd.isLoaded()) {
            iVar.onAdShowFailed(ae.a.i("InternalGAM rewarded object not loaded"));
            return;
        }
        Listener listener = this.listener;
        if (listener == null) {
            iVar.onAdShowFailed(ae.a.i("InternalGAM rewarded listener is null"));
        } else {
            this.gamRewardedAd.show(activity, listener);
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull od.i iVar, @NonNull od.j jVar, @NonNull od.k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        if (new GAMParams(kVar).isValid(iVar)) {
            Listener listener = new Listener(iVar, this);
            this.listener = listener;
            this.gamNetwork.loadRewarded(networkAdUnit, listener);
        }
    }
}
