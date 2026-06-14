package com.ironsource.adapters.moloco.banner;

import android.widget.FrameLayout;
import com.ironsource.Df;
import com.ironsource.adapters.moloco.MolocoAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ironsource/adapters/moloco/banner/MolocoBannerAdLoadListener;", "Lcom/moloco/sdk/publisher/AdLoad$Listener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "mLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "mBannerAdView", "Lcom/moloco/sdk/publisher/Banner;", "<init>", "(Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;Landroid/widget/FrameLayout$LayoutParams;Lcom/moloco/sdk/publisher/Banner;)V", "onAdLoadSuccess", "", "molocoAd", "Lcom/moloco/sdk/publisher/MolocoAd;", Df.f40641b, "molocoAdError", "Lcom/moloco/sdk/publisher/MolocoAdError;", "molocoadapter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MolocoBannerAdLoadListener implements AdLoad.Listener {

    @Nullable
    private final Banner mBannerAdView;

    @NotNull
    private final FrameLayout.LayoutParams mLayoutParams;

    @NotNull
    private final BannerSmashListener mListener;

    public MolocoBannerAdLoadListener(@NotNull BannerSmashListener mListener, @NotNull FrameLayout.LayoutParams mLayoutParams, @Nullable Banner banner) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mLayoutParams, "mLayoutParams");
        this.mListener = mListener;
        this.mLayoutParams = mLayoutParams;
        this.mBannerAdView = banner;
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public void onAdLoadFailed(@NotNull MolocoAdError molocoAdError) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        int errorCode = MolocoAdError.ErrorType.AD_LOAD_FAILED.getErrorCode();
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + errorCode + ", errorMessage = " + molocoAdError.getDescription());
        this.mListener.onBannerAdLoadFailed(MolocoAdapter.INSTANCE.getLoadErrorAndCheckNoFill(molocoAdError, 606));
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public void onAdLoadSuccess(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdLoaded(this.mBannerAdView, this.mLayoutParams);
    }
}
