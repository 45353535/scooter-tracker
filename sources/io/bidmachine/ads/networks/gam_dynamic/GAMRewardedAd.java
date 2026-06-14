package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;

/* JADX INFO: loaded from: classes12.dex */
class GAMRewardedAd extends GAMFullscreenAd {

    @Nullable
    @VisibleForTesting
    InternalRewardedAdListener listener;

    @VisibleForTesting
    static final class Listener extends GAMFullscreenAdListener<InternalRewardedAd> implements InternalRewardedAdListener {
        Listener(@NonNull od.i iVar, @NonNull GAMFullscreenAd gAMFullscreenAd) {
            super(iVar, gAMFullscreenAd);
        }
    }

    protected GAMRewardedAd(@NonNull GAMNetwork gAMNetwork) {
        super(gAMNetwork);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMFullscreenAd
    @Nullable
    protected InternalFullscreenAdPresentListener getPresentListener() {
        return this.listener;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMFullscreenAd, od.b
    public void onDestroy() {
        this.listener = null;
        super.onDestroy();
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull od.i iVar, @NonNull od.j jVar, @NonNull od.k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        Listener listener = new Listener(iVar, this);
        this.listener = listener;
        this.gamNetwork.loadRewarded(networkAdUnit, listener);
    }
}
