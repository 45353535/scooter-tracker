package com.ironsource.adapters.yandex.banner;

import android.widget.FrameLayout;
import com.ironsource.Df;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ironsource/adapters/yandex/banner/YandexBannerAdListener;", "Lcom/yandex/mobile/ads/banner/BannerAdEventListener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "mAdapter", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/yandex/banner/YandexBannerAdapter;", "mAdView", "Lcom/yandex/mobile/ads/banner/BannerAdView;", "mLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "(Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;Ljava/lang/ref/WeakReference;Lcom/yandex/mobile/ads/banner/BannerAdView;Landroid/widget/FrameLayout$LayoutParams;)V", Df.f40645f, "", "onAdFailedToLoad", "error", "Lcom/yandex/mobile/ads/common/AdRequestError;", "onAdLoaded", "onImpression", "impressionData", "Lcom/yandex/mobile/ads/common/ImpressionData;", "onLeftApplication", "onReturnedToApplication", "yandexadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YandexBannerAdListener implements BannerAdEventListener {

    @NotNull
    private final BannerAdView mAdView;

    @NotNull
    private final WeakReference<YandexBannerAdapter> mAdapter;

    @NotNull
    private final FrameLayout.LayoutParams mLayoutParams;

    @NotNull
    private final BannerSmashListener mListener;

    public YandexBannerAdListener(@NotNull BannerSmashListener mListener, @NotNull WeakReference<YandexBannerAdapter> mAdapter, @NotNull BannerAdView mAdView, @NotNull FrameLayout.LayoutParams mLayoutParams) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        Intrinsics.checkNotNullParameter(mAdView, "mAdView");
        Intrinsics.checkNotNullParameter(mLayoutParams, "mLayoutParams");
        this.mListener = mListener;
        this.mAdapter = mAdapter;
        this.mAdView = mAdView;
        this.mLayoutParams = mLayoutParams;
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdClicked();
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onAdFailedToLoad(@NotNull AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + error.getCode() + ", errorMessage = " + error.getDescription());
        this.mListener.onBannerAdLoadFailed(YandexAdapter.INSTANCE.getLoadErrorAndCheckNoFill(error, 606));
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onAdLoaded() {
        IronLog.ADAPTER_CALLBACK.verbose();
        YandexBannerAdapter yandexBannerAdapter = this.mAdapter.get();
        if (yandexBannerAdapter != null) {
            yandexBannerAdapter.setBannerView$yandexadapter_release(this.mAdView);
        }
        this.mListener.onBannerAdLoaded(this.mAdView, this.mLayoutParams);
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onImpression(@Nullable ImpressionData impressionData) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdShown();
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onLeftApplication() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdLeftApplication();
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onReturnedToApplication() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }
}
