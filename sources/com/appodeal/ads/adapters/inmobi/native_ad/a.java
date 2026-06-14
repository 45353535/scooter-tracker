package com.appodeal.ads.adapters.inmobi.native_ad;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.utils.Log;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends NativeAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedNativeCallback f12361a;

    public a(UnifiedNativeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12361a = callback;
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdClicked(InMobiNative ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f12361a.onAdClicked();
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus requestStatus) {
        Intrinsics.checkNotNullParameter(inMobiNative, "native");
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        this.f12361a.printError(requestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String(), requestStatus.getStatusCode());
        this.f12361a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
        InMobiNative inMobiNative2 = inMobiNative;
        Intrinsics.checkNotNullParameter(inMobiNative2, "native");
        Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
        try {
            ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.inmobi.a.a(adMetaInfo);
            this.f12361a.onAdRevenueReceived(impressionLevelDataA);
            this.f12361a.onAdLoaded(d.a(inMobiNative2), impressionLevelDataA);
        } catch (Exception e10) {
            Log.log(e10);
            this.f12361a.onAdLoadFailed(LoadingError.InternalError);
        }
    }
}
