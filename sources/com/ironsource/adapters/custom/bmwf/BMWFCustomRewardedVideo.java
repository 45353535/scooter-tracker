package com.ironsource.adapters.custom.bmwf;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo;
import io.bidmachine.AdPlacementConfig;
import java.lang.ref.WeakReference;
import md.c;
import md.d;

/* JADX INFO: loaded from: classes6.dex */
public class BMWFCustomRewardedVideo extends LevelPlayBaseRewardedVideo<BMWFCustomAdapter> {

    @Nullable
    private Listener listener;

    @Nullable
    private md.a rewardedAd;

    private static final class Listener implements c {

        @NonNull
        private final RewardedVideoAdListener rewardedVideoAdListener;

        @NonNull
        private final WeakReference<BMWFCustomRewardedVideo> wearBMWFCustomRewardedVideo;

        private void destroyAd() {
            BMWFCustomRewardedVideo bMWFCustomRewardedVideo = this.wearBMWFCustomRewardedVideo.get();
            if (bMWFCustomRewardedVideo != null) {
                bMWFCustomRewardedVideo.destroyAd();
            }
        }

        private Listener(@NonNull BMWFCustomRewardedVideo bMWFCustomRewardedVideo, @NonNull RewardedVideoAdListener rewardedVideoAdListener) {
            this.wearBMWFCustomRewardedVideo = new WeakReference<>(bMWFCustomRewardedVideo);
            this.rewardedVideoAdListener = rewardedVideoAdListener;
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(@NonNull md.a aVar) {
            this.rewardedVideoAdListener.onAdClicked();
        }

        @Override // io.bidmachine.AdFullScreenListener
        public void onAdClosed(@NonNull md.a aVar, boolean z10) {
            this.rewardedVideoAdListener.onAdEnded();
            this.rewardedVideoAdListener.onAdClosed();
            destroyAd();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(@NonNull md.a aVar) {
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(@NonNull md.a aVar) {
            this.rewardedVideoAdListener.onAdOpened();
            this.rewardedVideoAdListener.onAdStarted();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull md.a aVar, @NonNull ae.a aVar2) {
            this.rewardedVideoAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL, aVar2.e(), aVar2.g());
            destroyAd();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(@NonNull md.a aVar) {
            this.rewardedVideoAdListener.onAdLoadSuccess();
        }

        @Override // io.bidmachine.AdRewardedListener
        public void onAdRewarded(@NonNull md.a aVar) {
            this.rewardedVideoAdListener.onAdRewarded();
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull md.a aVar, @NonNull ae.a aVar2) {
            this.rewardedVideoAdListener.onAdShowFailed(aVar2.e(), aVar2.g());
        }
    }

    public BMWFCustomRewardedVideo(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(@NonNull AdData adData) {
        destroyAd();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(@NonNull AdData adData) {
        md.a aVar = this.rewardedAd;
        return aVar != null && aVar.canShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyAd() {
        this.listener = null;
        md.a aVar = this.rewardedAd;
        if (aVar != null) {
            aVar.setListener(null);
            this.rewardedAd.destroy();
            this.rewardedAd = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(@NonNull AdData adData, @NonNull Context context, @NonNull RewardedVideoAdListener rewardedVideoAdListener) {
        d.b bVar = (d.b) BMUtils.prepareAdRequest(new d.b(BMUtils.applyConfigParams(AdPlacementConfig.rewardedBuilder(), adData).build()), adData);
        this.listener = new Listener(rewardedVideoAdListener);
        md.a aVar = new md.a(context.getApplicationContext());
        this.rewardedAd = aVar;
        aVar.setListener(this.listener);
        this.rewardedAd.load((d) bVar.build());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(@NonNull AdData adData, @NonNull Activity activity, @NonNull RewardedVideoAdListener rewardedVideoAdListener) {
        if (this.rewardedAd == null || !isAdAvailable(adData)) {
            rewardedVideoAdListener.onAdShowFailed(1000, "RewardedAd is null or not available");
        } else {
            this.rewardedAd.show();
        }
    }
}
