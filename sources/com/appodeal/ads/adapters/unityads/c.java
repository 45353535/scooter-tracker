package com.appodeal.ads.adapters.unityads;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements IUnityAdsShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedFullscreenAdCallback f12563a;

    public c(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        this.f12563a = unifiedFullscreenAdCallback;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String str) {
        this.f12563a.onAdClicked();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
            this.f12563a.onAdFinished();
        }
        this.f12563a.onAdClosed();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this.f12563a.printError(str2, unityAdsShowError);
        this.f12563a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(str2, Integer.valueOf(unityAdsShowError.ordinal())));
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String str) {
        this.f12563a.onAdShown();
    }
}
