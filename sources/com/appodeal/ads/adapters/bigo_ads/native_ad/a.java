package com.appodeal.ads.adapters.bigo_ads.native_ad;

import com.appodeal.ads.adapters.bigo_ads.BigoAdsNetwork;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedNativeCallback f12170a;

    public a(UnifiedNativeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12170a = callback;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        NativeAd ad3 = (NativeAd) ad2;
        Intrinsics.checkNotNullParameter(ad3, "ad");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.bigo_ads.unified.a.a(ad3.getBid());
        this.f12170a.onAdRevenueReceived(impressionLevelDataA);
        UnifiedNativeCallback callback = this.f12170a;
        Intrinsics.checkNotNullParameter(ad3, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String title = ad3.getTitle();
        if (title == null) {
            title = "";
        }
        String description = ad3.getDescription();
        if (description == null) {
            description = "";
        }
        String callToAction = ad3.getCallToAction();
        if (callToAction == null) {
            callToAction = "";
        }
        callback.onAdLoaded(new c(ad3, callback, title, description, callToAction), impressionLevelDataA);
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f12170a.printError(adError.getMessage(), Integer.valueOf(adError.getCode()));
        this.f12170a.onAdLoadFailed(BigoAdsNetwork.INSTANCE.mapError(adError));
    }
}
