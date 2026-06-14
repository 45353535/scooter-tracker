package com.appodeal.ads.adapters.bidonmediation.rewarded;

import android.app.Activity;
import com.appodeal.ads.adapters.bidonmediation.AdmobFullscreenAdAuctionParams;
import com.appodeal.ads.adapters.bidonmediation.ext.AdValueExtKt;
import com.appodeal.ads.adapters.bidonmediation.ext.AdmobErrorExtKt;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/appodeal/ads/adapters/bidonmediation/rewarded/AdmobRewardedImpl$load$requestListener$1", "Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;", "onAdFailedToLoad", "", "loadAdError", "Lcom/google/android/gms/ads/LoadAdError;", "onAdLoaded", "rewardedAd", "Lcom/google/android/gms/ads/rewarded/RewardedAd;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdmobRewardedImpl$load$requestListener$1 extends RewardedAdLoadCallback {
    final /* synthetic */ AdmobFullscreenAdAuctionParams $adParams;
    final /* synthetic */ AdmobRewardedImpl this$0;

    public AdmobRewardedImpl$load$requestListener$1(AdmobRewardedImpl admobRewardedImpl, AdmobFullscreenAdAuctionParams admobFullscreenAdAuctionParams) {
        this.this$0 = admobRewardedImpl;
        this.$adParams = admobFullscreenAdAuctionParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdLoaded$lambda$5(RewardedAd rewardedAd, final AdmobRewardedImpl admobRewardedImpl) {
        rewardedAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.appodeal.ads.adapters.bidonmediation.rewarded.c
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                AdmobRewardedImpl$load$requestListener$1.onAdLoaded$lambda$5$lambda$1(admobRewardedImpl, adValue);
            }
        });
        rewardedAd.setFullScreenContentCallback(admobRewardedImpl.getFullScreenContentCallback.createCallback(admobRewardedImpl, new Function0() { // from class: com.appodeal.ads.adapters.bidonmediation.rewarded.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return admobRewardedImpl.getAd();
            }
        }, new Function0() { // from class: com.appodeal.ads.adapters.bidonmediation.rewarded.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdmobRewardedImpl$load$requestListener$1.onAdLoaded$lambda$5$lambda$3(admobRewardedImpl);
            }
        }));
        Ad ad2 = admobRewardedImpl.getAd();
        if (ad2 != null) {
            admobRewardedImpl.emitEvent(new AdEvent.Fill(ad2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdLoaded$lambda$5$lambda$1(AdmobRewardedImpl admobRewardedImpl, AdValue adValue) {
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Ad ad2 = admobRewardedImpl.getAd();
        if (ad2 != null) {
            admobRewardedImpl.emitEvent(new AdEvent.PaidRevenue(ad2, AdValueExtKt.asBidonAdValue(adValue)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAdLoaded$lambda$5$lambda$3(AdmobRewardedImpl admobRewardedImpl) {
        admobRewardedImpl.rewardedAd = null;
        return Unit.f93236a;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
        LogExtKt.logInfo("AdmobRewarded", "onAdFailedToLoad: " + loadAdError + ". " + this);
        this.this$0.emitEvent(new AdEvent.LoadFailed(AdmobErrorExtKt.asBidonError(loadAdError)));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(final RewardedAd rewardedAd) {
        Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
        ResponseInfo responseInfo = rewardedAd.getResponseInfo();
        Intrinsics.checkNotNullExpressionValue(responseInfo, "getResponseInfo(...)");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.admobmediation.a.a(responseInfo);
        LogExtKt.logInfo("AdmobRewarded", "onAdLoaded with responseInfo: " + impressionLevelDataA + ".");
        if (impressionLevelDataA == null) {
            BidonError.NoFill noFill = new BidonError.NoFill(this.this$0.getDemandId());
            LogExtKt.logInfo("AdmobRewarded", "onAdFailedToLoad: " + noFill + ". " + this);
            this.this$0.emitEvent(new AdEvent.LoadFailed(noFill));
            return;
        }
        LogExtKt.logInfo("AdmobRewarded", "onAdLoaded. RewardedAd=" + rewardedAd + ", " + this);
        AdmobRewardedImpl admobRewardedImpl = this.this$0;
        Double ecpm = impressionLevelDataA.getEcpm();
        admobRewardedImpl.setPrice(ecpm != null ? ecpm.doubleValue() : this.$adParams.getPrice());
        this.this$0.setDsp(impressionLevelDataA.getDemandSource());
        this.this$0.rewardedAd = rewardedAd;
        Activity activity = this.$adParams.getActivity();
        final AdmobRewardedImpl admobRewardedImpl2 = this.this$0;
        activity.runOnUiThread(new Runnable() { // from class: com.appodeal.ads.adapters.bidonmediation.rewarded.b
            @Override // java.lang.Runnable
            public final void run() {
                AdmobRewardedImpl$load$requestListener$1.onAdLoaded$lambda$5(rewardedAd, admobRewardedImpl2);
            }
        });
    }
}
