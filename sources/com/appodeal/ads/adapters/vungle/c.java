package com.appodeal.ads.adapters.vungle;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AssetRequestError;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.NetworkTimeoutError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.WebViewRenderingProcessGone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c implements BaseAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedAdCallback f12599a;

    public c(UnifiedAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12599a = callback;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.f12599a.onAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f12599a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getCode()));
        if ((adError instanceof AdExpiredError) || (adError instanceof AdExpiredOnPlayError)) {
            this.f12599a.onAdExpired();
        } else if ((adError instanceof AdCantPlayWithoutWebView) || (adError instanceof WebViewRenderingProcessGone) || (adError instanceof WebViewRenderProcessUnresponsive)) {
            this.f12599a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(adError.getErrorMessage(), Integer.valueOf(adError.getCode())));
        } else {
            this.f12599a.onAdLoadFailed(adError instanceof NetworkUnreachable ? LoadingError.ConnectionError : adError instanceof NetworkTimeoutError ? LoadingError.TimeoutError : adError instanceof AssetRequestError ? LoadingError.InvalidAssets : adError instanceof SdkVersionTooLow ? LoadingError.SdkVersionNotSupported : LoadingError.NoFill);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f12599a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getCode()));
        if ((adError instanceof AdExpiredError) || (adError instanceof AdExpiredOnPlayError)) {
            this.f12599a.onAdExpired();
        } else {
            this.f12599a.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
    }
}
