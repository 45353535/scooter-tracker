package com.ironsource.adapters.moloco.banner;

import com.ironsource.Df;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ironsource/adapters/moloco/banner/MolocoBannerAdShowListener;", "Lcom/moloco/sdk/publisher/BannerAdShowListener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "<init>", "(Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", "onAdShowSuccess", "", "molocoAd", "Lcom/moloco/sdk/publisher/MolocoAd;", Df.f40644e, "molocoAdError", "Lcom/moloco/sdk/publisher/MolocoAdError;", Df.f40645f, "onAdHidden", "molocoadapter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MolocoBannerAdShowListener implements BannerAdShowListener {

    @NotNull
    private final BannerSmashListener mListener;

    public MolocoBannerAdShowListener(@NotNull BannerSmashListener mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mListener = mListener;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdClicked();
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(@NotNull MolocoAdError molocoAdError) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_SHOW_ERROR;
        IronLog.ADAPTER_CALLBACK.verbose("Failed to show, errorCode = " + errorType + ", errorMessage = " + molocoAdError.getDescription());
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdShown();
    }
}
