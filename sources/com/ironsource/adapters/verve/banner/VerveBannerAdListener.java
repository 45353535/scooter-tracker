package com.ironsource.adapters.verve.banner;

import android.widget.FrameLayout;
import com.ironsource.Df;
import com.ironsource.adapters.verve.VerveAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.views.HyBidAdView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ironsource/adapters/verve/banner/VerveBannerAdListener;", "Lnet/pubnative/lite/sdk/views/HyBidAdView$Listener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "mAdapter", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/verve/banner/VerveBannerAdapter;", "mAdView", "Lnet/pubnative/lite/sdk/views/HyBidAdView;", "mLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "(Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;Ljava/lang/ref/WeakReference;Lnet/pubnative/lite/sdk/views/HyBidAdView;Landroid/widget/FrameLayout$LayoutParams;)V", "onAdClick", "", "onAdImpression", Df.f40641b, "error", "", "onAdLoaded", "verveadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VerveBannerAdListener implements HyBidAdView.Listener {

    @Nullable
    private final HyBidAdView mAdView;

    @NotNull
    private final WeakReference<VerveBannerAdapter> mAdapter;

    @NotNull
    private final FrameLayout.LayoutParams mLayoutParams;

    @NotNull
    private final BannerSmashListener mListener;

    public VerveBannerAdListener(@NotNull BannerSmashListener mListener, @NotNull WeakReference<VerveBannerAdapter> mAdapter, @Nullable HyBidAdView hyBidAdView, @NotNull FrameLayout.LayoutParams mLayoutParams) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        Intrinsics.checkNotNullParameter(mLayoutParams, "mLayoutParams");
        this.mListener = mListener;
        this.mAdapter = mAdapter;
        this.mAdView = hyBidAdView;
        this.mLayoutParams = mLayoutParams;
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView.Listener
    public void onAdClick() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdClicked();
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView.Listener
    public void onAdImpression() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdShown();
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView.Listener
    public void onAdLoadFailed(@Nullable Throwable error) {
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorMessage = " + (error != null ? error.getMessage() : null));
        this.mListener.onBannerAdLoadFailed(VerveAdapter.INSTANCE.getLoadError(error));
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView.Listener
    public void onAdLoaded() {
        VerveBannerAdapter verveBannerAdapter;
        IronLog.ADAPTER_CALLBACK.verbose();
        HyBidAdView hyBidAdView = this.mAdView;
        if (hyBidAdView != null && (verveBannerAdapter = this.mAdapter.get()) != null) {
            verveBannerAdapter.setBannerView$verveadapter_release(hyBidAdView);
        }
        this.mListener.onBannerAdLoaded(this.mAdView, this.mLayoutParams);
    }
}
