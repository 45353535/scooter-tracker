package com.ironsource.adapters.bidmachine.interstitial;

import com.ironsource.Df;
import com.ironsource.adapters.bidmachine.BidMachineAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import l9.a;
import l9.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ironsource/adapters/bidmachine/interstitial/BidMachineInterstitialAdListener;", "Ll9/c;", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/bidmachine/interstitial/BidMachineInterstitialAdapter;", "mAdapter", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "mListener", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "Ll9/a;", "interstitialAd", "", "onAdLoaded", "(Ll9/a;)V", "Lae/a;", "bmError", Df.f40641b, "(Ll9/a;Lae/a;)V", "onAdImpression", Df.f40644e, Df.f40645f, "", "finished", Df.f40646g, "(Ll9/a;Z)V", "onAdExpired", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "bidmachineadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BidMachineInterstitialAdListener implements c {

    @NotNull
    private final WeakReference<BidMachineInterstitialAdapter> mAdapter;

    @NotNull
    private final InterstitialSmashListener mListener;

    public BidMachineInterstitialAdListener(@NotNull WeakReference<BidMachineInterstitialAdapter> mAdapter, @NotNull InterstitialSmashListener mListener) {
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mAdapter = mAdapter;
        this.mListener = mListener;
    }

    @Override // io.bidmachine.AdListener
    public void onAdClicked(@NotNull a interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClicked();
    }

    @Override // io.bidmachine.AdFullScreenListener
    public void onAdClosed(@NotNull a interstitialAd, boolean finished) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClosed();
        BidMachineInterstitialAdapter bidMachineInterstitialAdapter = this.mAdapter.get();
        if (bidMachineInterstitialAdapter != null) {
            bidMachineInterstitialAdapter.destroyInterstitialAd$bidmachineadapter_release();
        }
    }

    @Override // io.bidmachine.AdListener
    public void onAdExpired(@NotNull a interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // io.bidmachine.AdListener
    public void onAdImpression(@NotNull a interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdOpened();
        this.mListener.onInterstitialAdShowSucceeded();
    }

    @Override // io.bidmachine.AdListener
    public void onAdLoadFailed(@NotNull a interstitialAd, @NotNull ae.a bmError) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        Intrinsics.checkNotNullParameter(bmError, "bmError");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + bmError.e() + ", errorMessage = " + bmError.g());
        BidMachineInterstitialAdapter bidMachineInterstitialAdapter = this.mAdapter.get();
        if (bidMachineInterstitialAdapter != null) {
            bidMachineInterstitialAdapter.setInterstitialAdAvailability$bidmachineadapter_release(false);
        }
        this.mListener.onInterstitialAdLoadFailed(BidMachineAdapter.INSTANCE.getLoadErrorAndCheckNoFill(bmError, 1158));
        BidMachineInterstitialAdapter bidMachineInterstitialAdapter2 = this.mAdapter.get();
        if (bidMachineInterstitialAdapter2 != null) {
            bidMachineInterstitialAdapter2.destroyInterstitialAd$bidmachineadapter_release();
        }
    }

    @Override // io.bidmachine.AdListener
    public void onAdLoaded(@NotNull a interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        zb.c auctionResult = interstitialAd.getAuctionResult();
        String creativeId = auctionResult != null ? auctionResult.getCreativeId() : null;
        IronLog.ADAPTER_CALLBACK.verbose("creativeId = " + creativeId);
        BidMachineInterstitialAdapter bidMachineInterstitialAdapter = this.mAdapter.get();
        if (bidMachineInterstitialAdapter != null) {
            bidMachineInterstitialAdapter.setInterstitialAd$bidmachineadapter_release(interstitialAd);
        }
        BidMachineInterstitialAdapter bidMachineInterstitialAdapter2 = this.mAdapter.get();
        if (bidMachineInterstitialAdapter2 != null) {
            bidMachineInterstitialAdapter2.setInterstitialAdAvailability$bidmachineadapter_release(true);
        }
        if (creativeId == null || creativeId.length() == 0) {
            this.mListener.onInterstitialAdReady();
        } else {
            this.mListener.onInterstitialAdReady(MapsKt.mapOf(TuplesKt.to("creativeId", creativeId)));
        }
    }

    @Override // io.bidmachine.AdListener
    public void onAdShowFailed(@NotNull a interstitialAd, @NotNull ae.a bmError) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        Intrinsics.checkNotNullParameter(bmError, "bmError");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + bmError.e() + ", errorMessage = " + bmError.g());
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", bmError.g()));
    }
}
