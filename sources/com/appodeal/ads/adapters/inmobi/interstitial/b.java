package com.appodeal.ads.adapters.inmobi.interstitial;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.inmobi.ads.InMobiInterstitial;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InMobiInterstitial f12358a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedInterstitialParams adTypeParams = (UnifiedInterstitialParams) unifiedAdParams;
        com.appodeal.ads.adapters.inmobi.b adUnitParams2 = (com.appodeal.ads.adapters.inmobi.b) adUnitParams;
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        InMobiInterstitial inMobiInterstitial = new InMobiInterstitial(resumedActivity, adUnitParams2.f12349a, new a(callback));
        inMobiInterstitial.setExtras(adUnitParams2.f12350b);
        inMobiInterstitial.load();
        this.f12358a = inMobiInterstitial;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        this.f12358a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InMobiInterstitial inMobiInterstitial = this.f12358a;
        if (inMobiInterstitial == null || !inMobiInterstitial.isReady()) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            inMobiInterstitial.show();
        }
    }
}
