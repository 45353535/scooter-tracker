package com.appodeal.ads.adapters.admob.native_ad;

import com.appodeal.ads.NativeMediaViewContentType;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003:\u0001\u0015B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/adapters/admob/native_ad/UnifiedAdmobNative;", "Lcom/google/android/gms/ads/AdRequest;", "AdRequestType", "Lcom/appodeal/ads/unified/UnifiedNative;", "Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobAdUnitParams;", "<init>", "()V", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "Lcom/appodeal/ads/unified/UnifiedNativeParams;", "adTypeParams", "adUnitParams", "Lcom/appodeal/ads/unified/UnifiedNativeCallback;", "callback", "", "load", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/unified/UnifiedNativeParams;Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobAdUnitParams;Lcom/appodeal/ads/unified/UnifiedNativeCallback;)V", "Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;", "createLoadListener", "(Lcom/appodeal/ads/unified/UnifiedNativeCallback;)Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;", "onDestroy", "com/appodeal/ads/adapters/admob/native_ad/a", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class UnifiedAdmobNative<AdRequestType extends AdRequest> extends UnifiedNative<UnifiedAdmobAdUnitParams<AdRequestType>> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void createLoadListener$lambda$0(UnifiedNativeCallback unifiedNativeCallback, NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        nativeAd.setOnPaidEventListener(new UnifiedAdRevenueListener(unifiedNativeCallback, nativeAd.getResponseInfo()));
        unifiedNativeCallback.onAdLoaded(UnifiedNativeAdExtKt.toUnifiedNativeAd(nativeAd));
    }

    @NotNull
    public NativeAd.OnNativeAdLoadedListener createLoadListener(@NotNull final UnifiedNativeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new NativeAd.OnNativeAdLoadedListener() { // from class: com.appodeal.ads.adapters.admob.native_ad.b
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                UnifiedAdmobNative.createLoadListener$lambda$0(callback, nativeAd);
            }
        };
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public void onDestroy() {
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public void load(@NotNull ContextProvider contextProvider, @NotNull UnifiedNativeParams adTypeParams, @NotNull UnifiedAdmobAdUnitParams<AdRequestType> adUnitParams, @NotNull UnifiedNativeCallback callback) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        NativeAdOptions.Builder mediaAspectRatio = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(false).setRequestMultipleImages(false).setMediaAspectRatio(2);
        Intrinsics.checkNotNullExpressionValue(mediaAspectRatio, "setMediaAspectRatio(...)");
        if (NativeMediaViewContentType.NoVideo != adTypeParams.getNativeMediaContentType()) {
            VideoOptions videoOptionsBuild = new VideoOptions.Builder().setStartMuted(adUnitParams.getIsMuted()).build();
            Intrinsics.checkNotNullExpressionValue(videoOptionsBuild, "build(...)");
            mediaAspectRatio.setVideoOptions(videoOptionsBuild);
        }
        AdLoader adLoaderBuild = new AdLoader.Builder(contextProvider.getApplicationContext(), adUnitParams.getKey()).forNativeAd(createLoadListener(callback)).withAdListener(new a(callback)).withNativeAdOptions(mediaAspectRatio.build()).build();
        Intrinsics.checkNotNullExpressionValue(adLoaderBuild, "build(...)");
        adLoaderBuild.loadAd(adUnitParams.getRequest());
    }
}
