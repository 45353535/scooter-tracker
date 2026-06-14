package com.appodeal.ads;

import android.view.View;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedBannerCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class ue extends UnifiedBannerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cf f14952a;

    public ue(cf cfVar) {
        this.f14952a = cfVar;
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdClicked() {
        td tdVarC = ee.c();
        cf cfVar = this.f14952a;
        tdVarC.r((gf) cfVar.f14935a, cfVar, null, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdExpired() {
        td tdVarC = ee.c();
        cf cfVar = this.f14952a;
        tdVarC.i0((gf) cfVar.f14935a, cfVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdLoadFailed(LoadingError loadingError) {
        td tdVarC = ee.c();
        cf cfVar = this.f14952a;
        tdVarC.I((gf) cfVar.f14935a, cfVar, loadingError);
    }

    @Override // com.appodeal.ads.unified.UnifiedBannerCallback
    public final void onAdLoaded(View view, int i10) {
        onAdLoaded(view, i10, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdRevenueReceived(ImpressionLevelData impressionLevelData) {
        this.f14952a.f(impressionLevelData);
        td tdVarC = ee.c();
        cf cfVar = this.f14952a;
        tdVarC.b0((gf) cfVar.f14935a, cfVar, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdShowFailed(ShowError showError) {
        td tdVarC = ee.c();
        cf cfVar = this.f14952a;
        tdVarC.q((gf) cfVar.f14935a, cfVar, null, showError);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdditionalInfoLoaded(String str) {
        this.f14952a.f14937c.b(str);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void printError(String str, Object obj) {
        cf cfVar = this.f14952a;
        ((gf) cfVar.f14935a).d(cfVar, str, obj);
    }

    @Override // com.appodeal.ads.unified.UnifiedBannerCallback
    public final void onAdLoaded(View view, int i10, ImpressionLevelData impressionLevelData) {
        this.f14952a.f(impressionLevelData);
        cf cfVar = this.f14952a;
        cfVar.f14458r = view;
        cfVar.f13183s = i10;
        cfVar.f13184t = view.getResources().getConfiguration().orientation;
        td tdVarC = ee.c();
        cf cfVar2 = this.f14952a;
        tdVarC.k0((gf) cfVar2.f14935a, cfVar2);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        td tdVarC = ee.c();
        cf cfVar = this.f14952a;
        tdVarC.r((gf) cfVar.f14935a, cfVar, null, unifiedAdCallbackClickTrackListener);
    }
}
