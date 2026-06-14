package com.appodeal.ads.adapters.bidonmediation.interstitial;

import android.app.Activity;
import com.appodeal.ads.adapters.bidonmediation.AdmobFullscreenAdAuctionParams;
import com.appodeal.ads.adapters.bidonmediation.ext.AdValueExtKt;
import com.appodeal.ads.adapters.bidonmediation.ext.AdmobErrorExtKt;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/appodeal/ads/adapters/bidonmediation/interstitial/AdmobInterstitialImpl$load$requestListener$1", "Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;", "onAdFailedToLoad", "", "loadAdError", "Lcom/google/android/gms/ads/LoadAdError;", "onAdLoaded", "interstitialAd", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdmobInterstitialImpl$load$requestListener$1 extends InterstitialAdLoadCallback {
    final /* synthetic */ AdmobFullscreenAdAuctionParams $adParams;
    final /* synthetic */ AdmobInterstitialImpl this$0;

    public AdmobInterstitialImpl$load$requestListener$1(AdmobInterstitialImpl admobInterstitialImpl, AdmobFullscreenAdAuctionParams admobFullscreenAdAuctionParams) {
        this.this$0 = admobInterstitialImpl;
        this.$adParams = admobFullscreenAdAuctionParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdLoaded$lambda$5(InterstitialAd interstitialAd, final AdmobInterstitialImpl admobInterstitialImpl) {
        interstitialAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.appodeal.ads.adapters.bidonmediation.interstitial.b
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                AdmobInterstitialImpl$load$requestListener$1.onAdLoaded$lambda$5$lambda$1(admobInterstitialImpl, adValue);
            }
        });
        interstitialAd.setFullScreenContentCallback(admobInterstitialImpl.getFullScreenContentCallback.createCallback(admobInterstitialImpl, new Function0() { // from class: com.appodeal.ads.adapters.bidonmediation.interstitial.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return admobInterstitialImpl.getAd();
            }
        }, new Function0() { // from class: com.appodeal.ads.adapters.bidonmediation.interstitial.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdmobInterstitialImpl$load$requestListener$1.onAdLoaded$lambda$5$lambda$3(admobInterstitialImpl);
            }
        }));
        Ad ad2 = admobInterstitialImpl.getAd();
        if (ad2 != null) {
            admobInterstitialImpl.emitEvent(new AdEvent.Fill(ad2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdLoaded$lambda$5$lambda$1(AdmobInterstitialImpl admobInterstitialImpl, AdValue adValue) {
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Ad ad2 = admobInterstitialImpl.getAd();
        if (ad2 != null) {
            admobInterstitialImpl.emitEvent(new AdEvent.PaidRevenue(ad2, AdValueExtKt.asBidonAdValue(adValue)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAdLoaded$lambda$5$lambda$3(AdmobInterstitialImpl admobInterstitialImpl) {
        admobInterstitialImpl.interstitialAd = null;
        return Unit.f93236a;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
        LogExtKt.logInfo("AdmobInterstitial", "onAdFailedToLoad: " + loadAdError + ". " + this);
        this.this$0.emitEvent(new AdEvent.LoadFailed(AdmobErrorExtKt.asBidonError(loadAdError)));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(final InterstitialAd interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        ResponseInfo responseInfo = interstitialAd.getResponseInfo();
        Intrinsics.checkNotNullExpressionValue(responseInfo, "getResponseInfo(...)");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.admobmediation.a.a(responseInfo);
        LogExtKt.logInfo("AdmobInterstitial", "onAdLoaded with responseInfo: " + impressionLevelDataA + ".");
        if (impressionLevelDataA == null) {
            BidonError.NoFill noFill = new BidonError.NoFill(this.this$0.getDemandId());
            LogExtKt.logInfo("AdmobInterstitial", "onAdFailedToLoad: " + noFill + ". " + this);
            this.this$0.emitEvent(new AdEvent.LoadFailed(noFill));
            return;
        }
        LogExtKt.logInfo("AdmobInterstitial", "onAdLoaded: " + this);
        AdmobInterstitialImpl admobInterstitialImpl = this.this$0;
        Double ecpm = impressionLevelDataA.getEcpm();
        admobInterstitialImpl.setPrice(ecpm != null ? ecpm.doubleValue() : this.$adParams.getPrice());
        this.this$0.setDsp(impressionLevelDataA.getDemandSource());
        this.this$0.interstitialAd = interstitialAd;
        Activity activity = this.$adParams.getActivity();
        final AdmobInterstitialImpl admobInterstitialImpl2 = this.this$0;
        activity.runOnUiThread(new Runnable() { // from class: com.appodeal.ads.adapters.bidonmediation.interstitial.a
            @Override // java.lang.Runnable
            public final void run() {
                AdmobInterstitialImpl$load$requestListener$1.onAdLoaded$lambda$5(interstitialAd, admobInterstitialImpl2);
            }
        });
    }
}
