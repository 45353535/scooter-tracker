package com.ironsource.adapters.bidmachine.banner;

import ae.a;
import android.widget.FrameLayout;
import com.ironsource.Df;
import com.ironsource.adapters.bidmachine.BidMachineAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8.c;
import u8.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ironsource/adapters/bidmachine/banner/BidMachineBannerAdListener;", "Lu8/c;", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "mListener", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/bidmachine/banner/BidMachineBannerAdapter;", "mAdapter", "Landroid/widget/FrameLayout$LayoutParams;", "mLayoutParams", "<init>", "(Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;Ljava/lang/ref/WeakReference;Landroid/widget/FrameLayout$LayoutParams;)V", "Lu8/f;", "ad", "", "onAdLoaded", "(Lu8/f;)V", "Lae/a;", "error", Df.f40641b, "(Lu8/f;Lae/a;)V", "onAdImpression", Df.f40644e, Df.f40645f, "onAdExpired", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "Ljava/lang/ref/WeakReference;", "Landroid/widget/FrameLayout$LayoutParams;", "bidmachineadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BidMachineBannerAdListener implements c {

    @NotNull
    private final WeakReference<BidMachineBannerAdapter> mAdapter;

    @NotNull
    private final FrameLayout.LayoutParams mLayoutParams;

    @NotNull
    private final BannerSmashListener mListener;

    public BidMachineBannerAdListener(@NotNull BannerSmashListener mListener, @NotNull WeakReference<BidMachineBannerAdapter> mAdapter, @NotNull FrameLayout.LayoutParams mLayoutParams) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        Intrinsics.checkNotNullParameter(mLayoutParams, "mLayoutParams");
        this.mListener = mListener;
        this.mAdapter = mAdapter;
        this.mLayoutParams = mLayoutParams;
    }

    @Override // io.bidmachine.AdListener
    public void onAdClicked(@NotNull f ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdClicked();
    }

    @Override // io.bidmachine.AdListener
    public void onAdExpired(@NotNull f ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // io.bidmachine.AdListener
    public void onAdImpression(@NotNull f ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdShown();
    }

    @Override // io.bidmachine.AdListener
    public void onAdLoadFailed(@NotNull f ad2, @NotNull a error) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + error.e() + ", errorMessage = " + error.g());
        this.mListener.onBannerAdLoadFailed(BidMachineAdapter.INSTANCE.getLoadErrorAndCheckNoFill(error, 606));
    }

    @Override // io.bidmachine.AdListener
    public void onAdLoaded(@NotNull f ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        zb.c auctionResult = ad2.getAuctionResult();
        String creativeId = auctionResult != null ? auctionResult.getCreativeId() : null;
        IronLog.ADAPTER_CALLBACK.verbose("creativeId = " + creativeId);
        BidMachineBannerAdapter bidMachineBannerAdapter = this.mAdapter.get();
        if (bidMachineBannerAdapter != null) {
            bidMachineBannerAdapter.setBannerView$bidmachineadapter_release(ad2);
        }
        if (creativeId == null || creativeId.length() == 0) {
            this.mListener.onBannerAdLoaded(ad2, this.mLayoutParams);
        } else {
            this.mListener.onBannerAdLoaded(ad2, this.mLayoutParams, MapsKt.mapOf(TuplesKt.to("creativeId", creativeId)));
        }
    }

    @Override // io.bidmachine.AdListener
    public void onAdShowFailed(@NotNull f ad2, @NotNull a error) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to show, errorCode = " + error.e() + ", errorMessage = " + error.g());
    }
}
