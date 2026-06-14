package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q6 extends UnifiedInterstitialCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l7 f14298a;

    public q6(l7 l7Var) {
        this.f14298a = l7Var;
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdClicked() {
        z5 z5VarB = h6.b();
        l7 l7Var = this.f14298a;
        z5VarB.r((q7) l7Var.f14935a, l7Var, null, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAdCallback
    public final void onAdClosed() {
        z5 z5VarB = h6.b();
        l7 l7Var = this.f14298a;
        z5VarB.h0((q7) l7Var.f14935a, l7Var);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdExpired() {
        z5 z5VarB = h6.b();
        l7 l7Var = this.f14298a;
        z5VarB.i0((q7) l7Var.f14935a, l7Var);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAdCallback
    public final void onAdFinished() {
        z5 z5VarB = h6.b();
        l7 adObject = this.f14298a;
        q7 adRequest = (q7) adObject.f14935a;
        z5VarB.getClass();
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        z5VarB.Y(adRequest, adObject, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdLoadFailed(LoadingError loadingError) {
        z5 z5VarB = h6.b();
        l7 l7Var = this.f14298a;
        z5VarB.I((q7) l7Var.f14935a, l7Var, loadingError);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAdCallback
    public final void onAdLoaded() {
        onAdLoaded(null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdRevenueReceived(ImpressionLevelData impressionLevelData) {
        this.f14298a.f(impressionLevelData);
        z5 z5VarB = h6.b();
        l7 l7Var = this.f14298a;
        z5VarB.b0((q7) l7Var.f14935a, l7Var, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdShowFailed(ShowError showError) {
        z5 z5VarB = h6.b();
        l7 l7Var = this.f14298a;
        z5VarB.q((q7) l7Var.f14935a, l7Var, null, showError);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAdCallback
    public final void onAdShown() {
        z5 z5VarB = h6.b();
        l7 adObject = this.f14298a;
        q7 adRequest = (q7) adObject.f14935a;
        z5VarB.getClass();
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        z5VarB.e0(adRequest, adObject, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdditionalInfoLoaded(String str) {
        this.f14298a.f14937c.b(str);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void printError(String str, Object obj) {
        l7 l7Var = this.f14298a;
        ((q7) l7Var.f14935a).d(l7Var, str, obj);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAdCallback
    public final void onAdLoaded(ImpressionLevelData impressionLevelData) {
        this.f14298a.f(impressionLevelData);
        z5 z5VarB = h6.b();
        l7 l7Var = this.f14298a;
        z5VarB.k0((q7) l7Var.f14935a, l7Var);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        z5 z5VarB = h6.b();
        l7 l7Var = this.f14298a;
        z5VarB.r((q7) l7Var.f14935a, l7Var, null, unifiedAdCallbackClickTrackListener);
    }
}
