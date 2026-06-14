package com.appodeal.ads.adapters.mintegral.native_ad;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.NativeMediaViewContentType;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.ironsource.Sd;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.MBNativeHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedNative {
    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedNativeParams adTypeParams = (UnifiedNativeParams) unifiedAdParams;
        com.appodeal.ads.adapters.mintegral.a adUnitParams2 = (com.appodeal.ads.adapters.mintegral.a) adUnitParams;
        UnifiedNativeCallback callback = (UnifiedNativeCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity != null) {
            Map<String, Object> nativeProperties = MBNativeHandler.getNativeProperties(adUnitParams2.f12492b, adUnitParams2.f12491a);
            Intrinsics.checkNotNullExpressionValue(nativeProperties, "getNativeProperties(...)");
            if (NativeMediaViewContentType.NoVideo != adTypeParams.getNativeMediaContentType()) {
                nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_WIDTH, Integer.valueOf(Sd.c.f41756d));
                nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_HEIGHT, Integer.valueOf(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED));
                nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
            } else {
                nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.FALSE);
            }
            MBridgeSDKFactory.getMBridgeSDK().preload(nativeProperties);
            MBNativeHandler mBNativeHandler = new MBNativeHandler(nativeProperties, resumedActivity);
            mBNativeHandler.setAdListener(new a(callback, mBNativeHandler));
            mBNativeHandler.load();
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
    }
}
