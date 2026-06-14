package com.ironsource.adapters.admob.nativead;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.ironsource.adapters.admob.AdMobAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class AdMobNativeAdListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
    private final String mAdUnitId;
    private final WeakReference<AdMobNativeAdAdapter> mAdapter;
    private final NativeAdSmashListener mListener;

    AdMobNativeAdListener(AdMobNativeAdAdapter adMobNativeAdAdapter, String str, NativeAdSmashListener nativeAdSmashListener) {
        this.mAdapter = new WeakReference<>(adMobNativeAdAdapter);
        this.mAdUnitId = str;
        this.mListener = nativeAdSmashListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        NativeAdSmashListener nativeAdSmashListener = this.mListener;
        if (nativeAdSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            nativeAdSmashListener.onNativeAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
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
        ironLog.error("adapterError = " + str);
        this.mListener.onNativeAdLoadFailed(AdMobAdapter.isNoFillError(loadAdError.getCode()) ? new IronSourceError(706, str) : ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        NativeAdSmashListener nativeAdSmashListener = this.mListener;
        if (nativeAdSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            nativeAdSmashListener.onNativeAdShown();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(@NonNull NativeAd nativeAd) {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<AdMobNativeAdAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        this.mAdapter.get().mAd = new WeakReference<>(nativeAd);
        this.mListener.onNativeAdLoaded(new AdMobNativeAdData(nativeAd), new AdMobNativeAdViewBinder(nativeAd));
    }
}
