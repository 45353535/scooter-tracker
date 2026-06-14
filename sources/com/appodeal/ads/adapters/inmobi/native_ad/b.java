package com.appodeal.ads.adapters.inmobi.native_ad;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.inmobi.ads.InMobiNative;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedNative {
    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedNativeParams adTypeParams = (UnifiedNativeParams) unifiedAdParams;
        com.appodeal.ads.adapters.inmobi.b adUnitParams2 = (com.appodeal.ads.adapters.inmobi.b) adUnitParams;
        UnifiedNativeCallback callback = (UnifiedNativeCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        InMobiNative inMobiNative = new InMobiNative(resumedActivity, adUnitParams2.f12349a, new a(callback));
        inMobiNative.setExtras(adUnitParams2.f12350b);
        inMobiNative.load();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
    }
}
