package com.appodeal.ads.adapters.mintegral.interstitial;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedInterstitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MBNewInterstitialHandler f12502a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedInterstitialParams adTypeParams = (UnifiedInterstitialParams) unifiedAdParams;
        com.appodeal.ads.adapters.mintegral.a adUnitParams2 = (com.appodeal.ads.adapters.mintegral.a) adUnitParams;
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MBNewInterstitialHandler mBNewInterstitialHandler = new MBNewInterstitialHandler(contextProvider.getApplicationContext(), adUnitParams2.f12492b, adUnitParams2.f12491a);
        mBNewInterstitialHandler.setInterstitialVideoListener(new a(callback));
        mBNewInterstitialHandler.playVideoMute(adUnitParams2.f12493c ? 1 : 2);
        mBNewInterstitialHandler.load();
        this.f12502a = mBNewInterstitialHandler;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        this.f12502a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback callback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MBNewInterstitialHandler mBNewInterstitialHandler = this.f12502a;
        if (mBNewInterstitialHandler == null || !mBNewInterstitialHandler.isReady()) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            mBNewInterstitialHandler.show();
        }
    }
}
