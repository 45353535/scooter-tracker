package com.ironsource.adapters.custom.bmwf;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.BannerAdSize;
import u8.c;
import u8.d;
import u8.f;

/* JADX INFO: loaded from: classes6.dex */
public class BMWFCustomBanner extends LevelPlayBaseBanner<BMWFCustomAdapter> {

    @Nullable
    private f bannerView;

    @Nullable
    private Listener listener;

    private static final class Listener implements c {

        @NonNull
        private final BannerAdListener bannerAdListener;

        @NonNull
        private final BannerAdSize bannerAdSize;

        public Listener(@NonNull BannerAdSize bannerAdSize, @NonNull BannerAdListener bannerAdListener) {
            this.bannerAdSize = bannerAdSize;
            this.bannerAdListener = bannerAdListener;
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(@NonNull f fVar) {
            this.bannerAdListener.onAdClicked();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(@NonNull f fVar) {
            BMUtils.logCallbackError("Banner is expired");
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(@NonNull f fVar) {
            this.bannerAdListener.onAdOpened();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull f fVar, @NonNull ae.a aVar) {
            this.bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL, aVar.e(), aVar.g());
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(@NonNull f fVar) {
            this.bannerAdListener.onAdLoadSuccess(fVar, BMWFCustomBanner.createLayoutParams(fVar.getContext(), this.bannerAdSize));
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull f fVar, @NonNull ae.a aVar) {
            BMUtils.logCallbackError("Failed to show banner", aVar);
        }
    }

    public BMWFCustomBanner(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static FrameLayout.LayoutParams createLayoutParams(@NonNull Context context, @NonNull BannerAdSize bannerAdSize) {
        return new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, bannerAdSize.getWidth()), AdapterUtils.dpToPixels(context, bannerAdSize.getHeight()), 17);
    }

    @Nullable
    private static BannerAdSize map(@NonNull Context context, @NonNull ISBannerSize iSBannerSize) {
        if (iSBannerSize.isAdaptive()) {
            return BannerAdSize.adaptive(iSBannerSize.getWidth(), iSBannerSize.getHeight());
        }
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
                return BannerAdSize.MediumRectangle;
            case "SMART":
                return AdapterUtils.isLargeScreen(context) ? BannerAdSize.Leaderboard : BannerAdSize.Banner;
            case "BANNER":
                return BannerAdSize.Banner;
            default:
                return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void destroyAd(@NonNull AdData adData) {
        this.listener = null;
        f fVar = this.bannerView;
        if (fVar != null) {
            fVar.setListener(null);
            this.bannerView.destroy();
            this.bannerView = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(@NonNull AdData adData, @NonNull Activity activity, @NonNull ISBannerSize iSBannerSize, @NonNull BannerAdListener bannerAdListener) {
        BannerAdSize map = map(activity, iSBannerSize);
        if (map == null) {
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, ae.a.f4247q.g());
            return;
        }
        d.c cVar = (d.c) BMUtils.prepareAdRequest(new d.c(BMUtils.applyConfigParams(AdPlacementConfig.bannerBuilder(map), adData).build()), adData);
        this.listener = new Listener(map, bannerAdListener);
        f fVar = new f(activity.getApplicationContext());
        this.bannerView = fVar;
        fVar.setListener(this.listener);
        this.bannerView.load((d) cVar.build());
    }
}
