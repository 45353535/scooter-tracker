package com.ironsource.adapters.bigo.banner;

import android.widget.FrameLayout;
import com.ironsource.Df;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.BannerAd;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ironsource/adapters/bigo/banner/BigoBannerAdListener;", "Lsg/bigo/ads/api/AdInteractionListener;", "Lsg/bigo/ads/api/AdLoadListener;", "Lsg/bigo/ads/api/BannerAd;", "mAdapter", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/bigo/banner/BigoBannerAdapter;", "mListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "mLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "(Ljava/lang/ref/WeakReference;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;Landroid/widget/FrameLayout$LayoutParams;)V", Df.f40645f, "", Df.f40646g, TelemetryAdLifecycleEvent.AD_ERROR, "error", "Lsg/bigo/ads/api/AdError;", "onAdImpression", "onAdLoaded", "ad", Df.f40642c, "onError", "bigoadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BigoBannerAdListener implements AdInteractionListener, AdLoadListener<BannerAd> {

    @NotNull
    private final WeakReference<BigoBannerAdapter> mAdapter;

    @NotNull
    private final FrameLayout.LayoutParams mLayoutParams;

    @NotNull
    private final BannerSmashListener mListener;

    public BigoBannerAdListener(@NotNull WeakReference<BigoBannerAdapter> mAdapter, @NotNull BannerSmashListener mListener, @NotNull FrameLayout.LayoutParams mLayoutParams) {
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mLayoutParams, "mLayoutParams");
        this.mAdapter = mAdapter;
        this.mListener = mListener;
        this.mLayoutParams = mLayoutParams;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdClicked();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdError(@NotNull AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to show, errorCode = " + error.getCode() + ", errorMessage = " + error.getMessage());
        this.mListener.onBannerAdLoadFailed(BigoAdapter.INSTANCE.getLoadError(error));
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdImpression() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdShown();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onError(@NotNull AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + error.getCode() + ", errorMessage = " + error.getMessage());
        this.mListener.onBannerAdLoadFailed(BigoAdapter.INSTANCE.getLoadError(error));
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onAdLoaded(@NotNull BannerAd ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdLoaded(ad2.adView(), this.mLayoutParams);
        BigoBannerAdapter bigoBannerAdapter = this.mAdapter.get();
        if (bigoBannerAdapter != null) {
            bigoBannerAdapter.setBannerView$bigoadapter_release(ad2);
        }
    }
}
