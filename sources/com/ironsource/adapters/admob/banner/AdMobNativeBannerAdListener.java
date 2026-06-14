package com.ironsource.adapters.admob.banner;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.ironsource.adapters.admob.AdMobAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class AdMobNativeBannerAdListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
    private final String mAdUnitId;
    private final WeakReference<AdMobBannerAdapter> mBannerAdapter;
    private final ISBannerSize mBannerSize;
    private final BannerSmashListener mListener;
    private final NativeTemplateType mTemplateType;

    AdMobNativeBannerAdListener(AdMobBannerAdapter adMobBannerAdapter, BannerSmashListener bannerSmashListener, String str, ISBannerSize iSBannerSize, NativeTemplateType nativeTemplateType) {
        this.mBannerAdapter = new WeakReference<>(adMobBannerAdapter);
        this.mListener = bannerSmashListener;
        this.mAdUnitId = str;
        this.mBannerSize = iSBannerSize;
        this.mTemplateType = nativeTemplateType;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdScreenDismissed();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        String str = loadAdError.getMessage() + "( " + loadAdError.getCode() + " ) ";
        if (loadAdError.getCause() != null) {
            str = str + " Caused by - " + loadAdError.getCause();
        }
        IronSourceError ironSourceError = AdMobAdapter.isNoFillError(loadAdError.getCode()) ? new IronSourceError(606, str) : ErrorBuilder.buildLoadFailedError(str);
        ironLog.error(str + str);
        this.mListener.onBannerAdLoadFailed(ironSourceError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdShown();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdScreenPresented();
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(@NotNull final NativeAd nativeAd) {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.banner.AdMobNativeBannerAdListener.1
            @Override // java.lang.Runnable
            public void run() {
                if (AdMobNativeBannerAdListener.this.mListener == null) {
                    IronLog.INTERNAL.verbose("listener is null");
                    return;
                }
                if (AdMobNativeBannerAdListener.this.mBannerAdapter == null || AdMobNativeBannerAdListener.this.mBannerAdapter.get() == null) {
                    IronLog.INTERNAL.verbose("adapter is null");
                    return;
                }
                AdMobNativeBannerViewHandler adMobNativeBannerViewHandler = new AdMobNativeBannerViewHandler(AdMobNativeBannerAdListener.this.mBannerSize, AdMobNativeBannerAdListener.this.mTemplateType, ContextProvider.getInstance().getApplicationContext());
                new AdMobNativeBannerViewBinder().bindView(nativeAd, adMobNativeBannerViewHandler.getNativeAdView(), AdMobNativeBannerAdListener.this.mTemplateType);
                ((AdMobBannerAdapter) AdMobNativeBannerAdListener.this.mBannerAdapter.get()).mAdUnitIdToNativeBannerAd.put(AdMobNativeBannerAdListener.this.mAdUnitId, nativeAd);
                AdMobNativeBannerAdListener.this.mListener.onBannerAdLoaded(adMobNativeBannerViewHandler.getNativeAdView(), adMobNativeBannerViewHandler.getLayoutParams());
            }
        });
    }
}
