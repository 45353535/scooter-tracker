package com.ironsource.adapters.bidmachine.rewardedvideo;

import com.ironsource.Df;
import com.ironsource.adapters.bidmachine.BidMachineAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import md.a;
import md.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ironsource/adapters/bidmachine/rewardedvideo/BidMachineRewardedVideoAdListener;", "Lmd/c;", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "mListener", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/bidmachine/rewardedvideo/BidMachineRewardedVideoAdapter;", "mAdapter", "<init>", "(Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;Ljava/lang/ref/WeakReference;)V", "Lmd/a;", "ad", "", "onAdLoaded", "(Lmd/a;)V", "Lae/a;", "error", Df.f40641b, "(Lmd/a;Lae/a;)V", "onAdImpression", Df.f40644e, Df.f40645f, Df.f40648i, "", "finished", Df.f40646g, "(Lmd/a;Z)V", "onAdExpired", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "Ljava/lang/ref/WeakReference;", "bidmachineadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BidMachineRewardedVideoAdListener implements c {

    @NotNull
    private final WeakReference<BidMachineRewardedVideoAdapter> mAdapter;

    @NotNull
    private final RewardedVideoSmashListener mListener;

    public BidMachineRewardedVideoAdListener(@NotNull RewardedVideoSmashListener mListener, @NotNull WeakReference<BidMachineRewardedVideoAdapter> mAdapter) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        this.mListener = mListener;
        this.mAdapter = mAdapter;
    }

    @Override // io.bidmachine.AdListener
    public void onAdClicked(@NotNull a ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // io.bidmachine.AdFullScreenListener
    public void onAdClosed(@NotNull a ad2, boolean finished) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdEnded();
        this.mListener.onRewardedVideoAdClosed();
        BidMachineRewardedVideoAdapter bidMachineRewardedVideoAdapter = this.mAdapter.get();
        if (bidMachineRewardedVideoAdapter != null) {
            bidMachineRewardedVideoAdapter.destroyRewardedVideoAd$bidmachineadapter_release();
        }
    }

    @Override // io.bidmachine.AdListener
    public void onAdExpired(@NotNull a ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoLoadFailed(new IronSourceError(IronSourceError.ERROR_RV_EXPIRED_ADS, "ads are expired"));
    }

    @Override // io.bidmachine.AdListener
    public void onAdImpression(@NotNull a ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdOpened();
        this.mListener.onRewardedVideoAdStarted();
    }

    @Override // io.bidmachine.AdListener
    public void onAdLoadFailed(@NotNull a ad2, @NotNull ae.a error) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + error.e() + ", errorMessage = " + error.g());
        BidMachineRewardedVideoAdapter bidMachineRewardedVideoAdapter = this.mAdapter.get();
        if (bidMachineRewardedVideoAdapter != null) {
            bidMachineRewardedVideoAdapter.setRewardedVideoAdAvailability$bidmachineadapter_release(false);
        }
        this.mListener.onRewardedVideoLoadFailed(BidMachineAdapter.INSTANCE.getLoadErrorAndCheckNoFill(error, 1058));
        BidMachineRewardedVideoAdapter bidMachineRewardedVideoAdapter2 = this.mAdapter.get();
        if (bidMachineRewardedVideoAdapter2 != null) {
            bidMachineRewardedVideoAdapter2.destroyRewardedVideoAd$bidmachineadapter_release();
        }
    }

    @Override // io.bidmachine.AdListener
    public void onAdLoaded(@NotNull a ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        zb.c auctionResult = ad2.getAuctionResult();
        String creativeId = auctionResult != null ? auctionResult.getCreativeId() : null;
        IronLog.ADAPTER_CALLBACK.verbose("creativeId = " + creativeId);
        BidMachineRewardedVideoAdapter bidMachineRewardedVideoAdapter = this.mAdapter.get();
        if (bidMachineRewardedVideoAdapter != null) {
            bidMachineRewardedVideoAdapter.setRewardedVideoAd$bidmachineadapter_release(ad2);
        }
        BidMachineRewardedVideoAdapter bidMachineRewardedVideoAdapter2 = this.mAdapter.get();
        if (bidMachineRewardedVideoAdapter2 != null) {
            bidMachineRewardedVideoAdapter2.setRewardedVideoAdAvailability$bidmachineadapter_release(true);
        }
        if (creativeId == null || creativeId.length() == 0) {
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(true, MapsKt.mapOf(TuplesKt.to("creativeId", creativeId)));
        }
    }

    @Override // io.bidmachine.AdRewardedListener
    public void onAdRewarded(@NotNull a ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // io.bidmachine.AdListener
    public void onAdShowFailed(@NotNull a ad2, @NotNull ae.a error) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to show, errorCode = " + error.e() + " , errorMessage = " + error.g());
        IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, error.g());
        Intrinsics.checkNotNullExpressionValue(ironSourceErrorBuildShowFailedError, "buildShowFailedError(\n  …  error.message\n        )");
        this.mListener.onRewardedVideoAdShowFailed(ironSourceErrorBuildShowFailedError);
    }
}
