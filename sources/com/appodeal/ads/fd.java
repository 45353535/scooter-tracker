package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fd extends UnifiedRewardedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd f13330a;

    public fd(vd vdVar) {
        this.f13330a = vdVar;
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdClicked() {
        we weVarB = af.b();
        vd vdVar = this.f13330a;
        weVarB.r((ce) vdVar.f14935a, vdVar, null, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAdCallback
    public final void onAdClosed() {
        we weVarB = af.b();
        vd vdVar = this.f13330a;
        weVarB.h0((ce) vdVar.f14935a, vdVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdExpired() {
        we weVarB = af.b();
        vd vdVar = this.f13330a;
        weVarB.i0((ce) vdVar.f14935a, vdVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAdCallback
    public final void onAdFinished() {
        we weVarB = af.b();
        vd adObject = this.f13330a;
        ce adRequest = (ce) adObject.f14935a;
        weVarB.getClass();
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        weVarB.Y(adRequest, adObject, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdLoadFailed(LoadingError loadingError) {
        we weVarB = af.b();
        vd vdVar = this.f13330a;
        weVarB.I((ce) vdVar.f14935a, vdVar, loadingError);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAdCallback
    public final void onAdLoaded() {
        onAdLoaded(null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdRevenueReceived(ImpressionLevelData impressionLevelData) {
        this.f13330a.f(impressionLevelData);
        we weVarB = af.b();
        vd vdVar = this.f13330a;
        weVarB.b0((ce) vdVar.f14935a, vdVar, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdShowFailed(ShowError showError) {
        we weVarB = af.b();
        vd vdVar = this.f13330a;
        weVarB.q((ce) vdVar.f14935a, vdVar, null, showError);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAdCallback
    public final void onAdShown() {
        we weVarB = af.b();
        vd adObject = this.f13330a;
        ce adRequest = (ce) adObject.f14935a;
        weVarB.getClass();
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        weVarB.e0(adRequest, adObject, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdditionalInfoLoaded(String str) {
        this.f13330a.f14937c.b(str);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void printError(String str, Object obj) {
        vd vdVar = this.f13330a;
        ((ce) vdVar.f14935a).d(vdVar, str, obj);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAdCallback
    public final void onAdLoaded(ImpressionLevelData impressionLevelData) {
        this.f13330a.f(impressionLevelData);
        we weVarB = af.b();
        vd vdVar = this.f13330a;
        weVarB.k0((ce) vdVar.f14935a, vdVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        we weVarB = af.b();
        vd vdVar = this.f13330a;
        weVarB.r((ce) vdVar.f14935a, vdVar, null, unifiedAdCallbackClickTrackListener);
    }
}
