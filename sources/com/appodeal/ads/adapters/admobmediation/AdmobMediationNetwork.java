package com.appodeal.ads.adapters.admobmediation;

import android.os.Bundle;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.adapters.admob.AdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admobmediation.banner.b;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.google.android.gms.ads.AdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\rH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000fH\u0016J\u0016\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/adapters/admobmediation/AdmobMediationNetwork;", "Lcom/appodeal/ads/adapters/admob/AdmobNetwork;", "builder", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "createBanner", "Lcom/appodeal/ads/unified/UnifiedBanner;", "Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobAdUnitParams;", "Lcom/google/android/gms/ads/AdRequest;", "createMrec", "Lcom/appodeal/ads/unified/UnifiedMrec;", "createRewarded", "Lcom/appodeal/ads/unified/UnifiedRewarded;", "createInterstitial", "Lcom/appodeal/ads/unified/UnifiedInterstitial;", "createNativeAd", "Lcom/appodeal/ads/unified/UnifiedNative;", "createAdRequestBuilder", "Lcom/google/android/gms/ads/AdRequest$Builder;", "adUnitData", "Lorg/json/JSONObject;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdmobMediationNetwork extends AdmobNetwork {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/adapters/admobmediation/AdmobMediationNetwork$builder;", "Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobNetwork$builder;", "<init>", "()V", "build", "Lcom/appodeal/ads/adapters/admobmediation/AdmobMediationNetwork;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends UnifiedAdmobNetwork.builder {
        public builder() {
            super("admob_mediation", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public AdmobMediationNetwork build() {
            return new AdmobMediationNetwork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdmobMediationNetwork(@NotNull AdNetworkBuilder builder2) {
        super(builder2);
        Intrinsics.checkNotNullParameter(builder2, "builder");
    }

    @Override // com.appodeal.ads.adapters.admob.AdmobNetwork, com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedBanner<UnifiedAdmobAdUnitParams<AdRequest>> createBanner() {
        return new b();
    }

    @Override // com.appodeal.ads.adapters.admob.AdmobNetwork, com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedInterstitial<UnifiedAdmobAdUnitParams<AdRequest>> createInterstitial() {
        return new com.appodeal.ads.adapters.admobmediation.interstitial.b();
    }

    @Override // com.appodeal.ads.adapters.admob.AdmobNetwork, com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedMrec<UnifiedAdmobAdUnitParams<AdRequest>> createMrec() {
        return new com.appodeal.ads.adapters.admobmediation.mrec.b();
    }

    @Override // com.appodeal.ads.adapters.admob.AdmobNetwork, com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedNative<UnifiedAdmobAdUnitParams<AdRequest>> createNativeAd() {
        return new com.appodeal.ads.adapters.admobmediation.native_ad.b();
    }

    @Override // com.appodeal.ads.adapters.admob.AdmobNetwork, com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedRewarded<UnifiedAdmobAdUnitParams<AdRequest>> createRewarded() {
        return new com.appodeal.ads.adapters.admobmediation.rewarded_video.b();
    }

    @Override // com.appodeal.ads.adapters.admob.AdmobNetwork, com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork
    @NotNull
    public AdRequest.Builder createAdRequestBuilder(@NotNull JSONObject adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        AdRequest.Builder builder2 = new AdRequest.Builder();
        Bundle bundle = new Bundle();
        double dOptDouble = adUnitData.optDouble("pricefloor");
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        bundle.putDouble("appodeal_pf", dOptDouble);
        String comparator = adUnitData.optString("comparator");
        Intrinsics.checkNotNullExpressionValue(comparator, "optString(...)");
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        bundle.putString("appodeal_pf_compare", comparator);
        builder2.addNetworkExtrasBundle(AppodealCustomEvent.class, bundle);
        return builder2;
    }
}
