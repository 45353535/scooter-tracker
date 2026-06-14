package com.appodeal.ads;

import android.view.View;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedMrecCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class df extends UnifiedMrecCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f13258a;

    public df(b bVar) {
        this.f13258a = bVar;
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdClicked() {
        fe feVarB = ve.b();
        b bVar = this.f13258a;
        feVarB.r((i) bVar.f14935a, bVar, null, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdExpired() {
        fe feVarB = ve.b();
        b bVar = this.f13258a;
        feVarB.i0((i) bVar.f14935a, bVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdLoadFailed(LoadingError loadingError) {
        fe feVarB = ve.b();
        b bVar = this.f13258a;
        feVarB.I((i) bVar.f14935a, bVar, loadingError);
    }

    @Override // com.appodeal.ads.unified.UnifiedMrecCallback
    public final void onAdLoaded(View view) {
        onAdLoaded(view, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdRevenueReceived(ImpressionLevelData impressionLevelData) {
        this.f13258a.f(impressionLevelData);
        fe feVarB = ve.b();
        b bVar = this.f13258a;
        feVarB.b0((i) bVar.f14935a, bVar, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdShowFailed(ShowError showError) {
        fe feVarB = ve.b();
        b bVar = this.f13258a;
        feVarB.q((i) bVar.f14935a, bVar, null, showError);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdditionalInfoLoaded(String str) {
        this.f13258a.f14937c.b(str);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void printError(String str, Object obj) {
        b bVar = this.f13258a;
        ((i) bVar.f14935a).d(bVar, str, obj);
    }

    @Override // com.appodeal.ads.unified.UnifiedMrecCallback
    public final void onAdLoaded(View view, ImpressionLevelData impressionLevelData) {
        this.f13258a.f(impressionLevelData);
        this.f13258a.f14458r = view;
        fe feVarB = ve.b();
        b bVar = this.f13258a;
        feVarB.k0((i) bVar.f14935a, bVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        fe feVarB = ve.b();
        b bVar = this.f13258a;
        feVarB.r((i) bVar.f14935a, bVar, null, unifiedAdCallbackClickTrackListener);
    }
}
