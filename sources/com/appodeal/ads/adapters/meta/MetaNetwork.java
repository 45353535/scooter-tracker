package com.appodeal.ads.adapters.meta;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.settings.AdSdkVersion;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MetaNetwork extends AdNetwork<c, b> {
    private static final g initializer = new g();

    public static class builder extends AdNetworkBuilder {
        public builder() {
            super("facebook", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public List<String> getAdActivities() {
            return new i();
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public MetaNetwork build() {
            return new MetaNetwork(this);
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @androidx.annotation.Nullable
    public static com.appodeal.ads.networking.LoadingError mapError(@androidx.annotation.Nullable com.facebook.ads.AdError r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            int r2 = r2.getErrorCode()
            r1 = 2009(0x7d9, float:2.815E-42)
            if (r2 == r1) goto L3d
            r1 = 2100(0x834, float:2.943E-42)
            if (r2 == r1) goto L3a
            r1 = 3001(0xbb9, float:4.205E-42)
            if (r2 == r1) goto L37
            r1 = 6002(0x1772, float:8.41E-42)
            if (r2 == r1) goto L3a
            r1 = 6003(0x1773, float:8.412E-42)
            if (r2 == r1) goto L3a
            r1 = 7001(0x1b59, float:9.81E-42)
            if (r2 == r1) goto L34
            r1 = 7002(0x1b5a, float:9.812E-42)
            if (r2 == r1) goto L34
            switch(r2) {
                case 1000: goto L31;
                case 1001: goto L37;
                case 1002: goto L37;
                default: goto L27;
            }
        L27:
            switch(r2) {
                case 2000: goto L37;
                case 2001: goto L37;
                case 2002: goto L37;
                default: goto L2a;
            }
        L2a:
            switch(r2) {
                case 7005: goto L34;
                case 7006: goto L34;
                case 7007: goto L2e;
                default: goto L2d;
            }
        L2d:
            return r0
        L2e:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.IncorrectAdunit
            return r2
        L31:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.ConnectionError
            return r2
        L34:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.InternalError
            return r2
        L37:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.NoFill
            return r2
        L3a:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.InvalidAssets
            return r2
        L3d:
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.TimeoutError
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.meta.MetaNetwork.mapError(com.facebook.ads.AdError):com.appodeal.ads.networking.LoadingError");
    }

    private void updateConsent(RestrictedData restrictedData) {
        if (restrictedData.isUserInCcpaScope()) {
            if (restrictedData.isUserHasConsent()) {
                AdSettings.setDataProcessingOptions(new String[0]);
            } else {
                AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
            }
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedBanner<b> createBanner() {
        return new com.appodeal.ads.adapters.meta.banner.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedInterstitial<b> createInterstitial() {
        return new com.appodeal.ads.adapters.meta.interstitial.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedMrec<b> createMrec() {
        return new com.appodeal.ads.adapters.meta.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedNative<b> createNativeAd() {
        return new com.appodeal.ads.adapters.meta.native_ad.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedRewarded<b> createRewarded() {
        return new com.appodeal.ads.adapters.meta.rewarded_video.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getRecommendedVersion() {
        return AdSdkVersion.BUILD;
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getVersion() {
        return AdSdkVersion.BUILD;
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return initializer.f12478c;
    }

    @Override // com.appodeal.ads.AdNetwork
    /* JADX INFO: renamed from: isSupportSmartBanners */
    public boolean getIsSupportSmartBanners() {
        return true;
    }

    private MetaNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public b getAdUnitParams(@NonNull ContextProvider contextProvider, @NonNull AdUnit adUnit, @NonNull AdNetworkMediationParams adNetworkMediationParams) {
        AdSettings.setMixedAudience(adNetworkMediationParams.getRestrictedData().isUserAgeRestricted());
        AdSettings.setTestMode(adNetworkMediationParams.isTestMode());
        if (adNetworkMediationParams.isTestMode()) {
            AdSettings.turnOnSDKDebugger(contextProvider.getApplicationContextOrNull());
            AdSettings.setTestAdType(AdSettings.TestAdType.DEFAULT);
        }
        updateConsent(adNetworkMediationParams.getRestrictedData());
        return new b(adUnit.getJsonData().getString("facebook_key"));
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public c getInitializeParams(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new c(jSONObject.optString("mediator"));
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NonNull ContextProvider contextProvider, @NonNull c cVar, @NonNull AdNetworkMediationParams adNetworkMediationParams, @NonNull AdNetworkInitializationListener adNetworkInitializationListener) {
        g gVar = initializer;
        if (gVar.f12478c) {
            adNetworkInitializationListener.onInitializationFinished();
            return;
        }
        AdSettings.setMixedAudience(adNetworkMediationParams.getRestrictedData().isUserAgeRestricted());
        AdSettings.setTestMode(adNetworkMediationParams.isTestMode());
        if (adNetworkMediationParams.isTestMode()) {
            AdSettings.turnOnSDKDebugger(contextProvider.getApplicationContextOrNull());
            AdSettings.setTestAdType(AdSettings.TestAdType.DEFAULT);
        }
        updateConsent(adNetworkMediationParams.getRestrictedData());
        gVar.b(contextProvider.getApplicationContext(), cVar.f12470a, new h(adNetworkInitializationListener));
    }
}
