package com.ironsource.adapters.moloco.interstitial;

import com.ironsource.Df;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ironsource/adapters/moloco/interstitial/MolocoInterstitialAdShowListener;", "Lcom/moloco/sdk/publisher/InterstitialAdShowListener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "mAdapter", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/moloco/interstitial/MolocoInterstitialAdapter;", "<init>", "(Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;Ljava/lang/ref/WeakReference;)V", "onAdShowSuccess", "", "molocoAd", "Lcom/moloco/sdk/publisher/MolocoAd;", Df.f40644e, "molocoAdError", "Lcom/moloco/sdk/publisher/MolocoAdError;", Df.f40645f, "onAdHidden", "molocoadapter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MolocoInterstitialAdShowListener implements InterstitialAdShowListener {

    @NotNull
    private final WeakReference<MolocoInterstitialAdapter> mAdapter;

    @NotNull
    private final InterstitialSmashListener mListener;

    public MolocoInterstitialAdShowListener(@NotNull InterstitialSmashListener mListener, @NotNull WeakReference<MolocoInterstitialAdapter> mAdapter) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        this.mListener = mListener;
        this.mAdapter = mAdapter;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClosed();
        MolocoInterstitialAdapter molocoInterstitialAdapter = this.mAdapter.get();
        if (molocoInterstitialAdapter != null) {
            molocoInterstitialAdapter.destroyInterstitialAd$molocoadapter_release();
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(@NotNull MolocoAdError molocoAdError) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_SHOW_ERROR;
        IronLog.ADAPTER_CALLBACK.verbose("Failed to show, errorCode = " + errorType + ", errorMessage = " + molocoAdError.getDescription());
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", molocoAdError.getDescription()));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdOpened();
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
