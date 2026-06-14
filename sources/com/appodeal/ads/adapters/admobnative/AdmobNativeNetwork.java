package com.appodeal.ads.adapters.admobnative;

import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admobnative.banner.c;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedMrec;
import com.google.android.gms.ads.AdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\tH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/adapters/admobnative/AdmobNativeNetwork;", "Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobNetwork;", "Lcom/google/android/gms/ads/AdRequest;", "Lcom/google/android/gms/ads/AdRequest$Builder;", "builder", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "createBanner", "Lcom/appodeal/ads/unified/UnifiedBanner;", "Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobAdUnitParams;", "createMrec", "Lcom/appodeal/ads/unified/UnifiedMrec;", "createAdRequestBuilder", "adUnitData", "Lorg/json/JSONObject;", "createAdRequest", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdmobNativeNetwork extends UnifiedAdmobNetwork<AdRequest, AdRequest.Builder> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/adapters/admobnative/AdmobNativeNetwork$builder;", "Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobNetwork$builder;", "<init>", "()V", "build", "Lcom/appodeal/ads/adapters/admobnative/AdmobNativeNetwork;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends UnifiedAdmobNetwork.builder {
        public builder() {
            super("admob_native", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public AdmobNativeNetwork build() {
            return new AdmobNativeNetwork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdmobNativeNetwork(@NotNull AdNetworkBuilder builder2) {
        super(builder2);
        Intrinsics.checkNotNullParameter(builder2, "builder");
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedBanner<UnifiedAdmobAdUnitParams<AdRequest>> createBanner() {
        return new c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedMrec<UnifiedAdmobAdUnitParams<AdRequest>> createMrec() {
        return new com.appodeal.ads.adapters.admobnative.mrec.c();
    }

    @Override // com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork
    @NotNull
    public AdRequest createAdRequest(@NotNull AdRequest.Builder builder2) {
        Intrinsics.checkNotNullParameter(builder2, "builder");
        AdRequest adRequestBuild = builder2.build();
        Intrinsics.checkNotNullExpressionValue(adRequestBuild, "build(...)");
        return adRequestBuild;
    }

    @Override // com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork
    @NotNull
    public AdRequest.Builder createAdRequestBuilder(@NotNull JSONObject adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        return new AdRequest.Builder();
    }
}
