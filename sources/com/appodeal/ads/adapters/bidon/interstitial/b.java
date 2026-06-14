package com.appodeal.ads.adapters.bidon.interstitial;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidon.c;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.ads.interstitial.InterstitialAd;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterstitialAd f12133a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedInterstitialParams adTypeParams = (UnifiedInterstitialParams) unifiedAdParams;
        c adUnitParams2 = (c) adUnitParams;
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
        InterstitialAd interstitialAd = new InterstitialAd(adUnitParams2.f12118b);
        this.f12133a = interstitialAd;
        interstitialAd.setInterstitialListener(new a(callback));
        interstitialAd.addExtra("ext", adUnitParams2.f12119c);
        interstitialAd.addExtra("mediator", "appodeal");
        BidonSdk.getSegment().setCustomAttributes(adUnitParams2.f12120d);
        interstitialAd.loadAd(resumedActivity, adUnitParams2.f12117a);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        InterstitialAd interstitialAd = this.f12133a;
        if (interstitialAd != null) {
            interstitialAd.destroyAd();
        }
        this.f12133a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationLoss(String str, double d10) {
        super.onMediationLoss(str, d10);
        InterstitialAd interstitialAd = this.f12133a;
        if (interstitialAd != null) {
            if (str == null) {
                str = "null";
            }
            interstitialAd.notifyLoss(str, d10);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationWin() {
        super.onMediationWin();
        InterstitialAd interstitialAd = this.f12133a;
        if (interstitialAd != null) {
            interstitialAd.notifyWin();
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onPrepareToShow(Activity activity, UnifiedAdParams unifiedAdParams) {
        UnifiedInterstitialParams adTypeParams = (UnifiedInterstitialParams) unifiedAdParams;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        super.onPrepareToShow(activity, adTypeParams);
        InterstitialAd interstitialAd = this.f12133a;
        if (interstitialAd != null) {
            interstitialAd.addExtra("appodeal_placement_id", adTypeParams.obtainPlacementId());
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterstitialAd interstitialAd = this.f12133a;
        if (interstitialAd == null) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            interstitialAd.showAd(activity);
        }
    }
}
