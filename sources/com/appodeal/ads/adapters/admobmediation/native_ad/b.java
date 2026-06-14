package com.appodeal.ads.adapters.admobmediation.native_ad;

import com.appodeal.ads.adapters.admob.native_ad.AdmobNative;
import com.appodeal.ads.adapters.admob.native_ad.UnifiedNativeAdExtKt;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AdmobNative {
    public static final void createLoadListener$lambda$0(UnifiedNativeCallback unifiedNativeCallback, NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        ResponseInfo responseInfo = nativeAd.getResponseInfo();
        ImpressionLevelData impressionLevelDataA = responseInfo != null ? com.appodeal.ads.adapters.admobmediation.a.a(responseInfo) : null;
        if (impressionLevelDataA != null) {
            nativeAd.setOnPaidEventListener(new UnifiedAdRevenueListener(unifiedNativeCallback, nativeAd.getResponseInfo()));
            unifiedNativeCallback.onAdLoaded(UnifiedNativeAdExtKt.toUnifiedNativeAd(nativeAd), impressionLevelDataA);
            return;
        }
        LoadingError error = LoadingError.NoFill;
        Intrinsics.checkNotNullParameter(unifiedNativeCallback, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        unifiedNativeCallback.printError("Admob Mediation - custom event price limit reached", Integer.valueOf(error.getCode()));
        unifiedNativeCallback.onAdLoadFailed(error);
    }

    @Override // com.appodeal.ads.adapters.admob.native_ad.UnifiedAdmobNative
    public final NativeAd.OnNativeAdLoadedListener createLoadListener(final UnifiedNativeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new NativeAd.OnNativeAdLoadedListener() { // from class: com.appodeal.ads.adapters.admobmediation.native_ad.a
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                b.createLoadListener$lambda$0(callback, nativeAd);
            }
        };
    }
}
