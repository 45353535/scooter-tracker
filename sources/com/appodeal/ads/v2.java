package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v2 extends UnifiedNativeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d3 f15138a;

    public v2(d3 d3Var) {
        this.f15138a = d3Var;
    }

    public static final Unit a(v2 v2Var) {
        v2Var.onAdShown();
        return Unit.f93236a;
    }

    public static final Unit b(v2 v2Var, com.appodeal.ads.nativead.e eVar, ImpressionLevelData impressionLevelData) {
        d3 d3Var = v2Var.f15138a;
        d3Var.f13225r = eVar;
        d3Var.f(impressionLevelData);
        u uVarD = t1.d();
        d3 d3Var2 = v2Var.f15138a;
        uVarD.k0(d3Var2.f14935a, d3Var2);
        return Unit.f93236a;
    }

    public static final Unit c(v2 v2Var, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        v2Var.getClass();
        u uVarD = t1.d();
        d3 d3Var = v2Var.f15138a;
        uVarD.r(d3Var.f14935a, d3Var, d3Var.f13225r, unifiedAdCallbackClickTrackListener);
        return Unit.f93236a;
    }

    public static final Unit d(UnifiedNativeAd unifiedNativeAd, final v2 v2Var) {
        unifiedNativeAd.processClick(new Function1() { // from class: com.appodeal.ads.u2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v2.c(this.f14918b, (UnifiedAdCallbackClickTrackListener) obj);
            }
        });
        return Unit.f93236a;
    }

    public static final Unit e(v2 v2Var) {
        v2Var.onAdFinished();
        return Unit.f93236a;
    }

    public static final Unit f(v2 v2Var) {
        v2Var.getClass();
        u uVarD = t1.d();
        d3 d3Var = v2Var.f15138a;
        uVarD.I(d3Var.f14935a, d3Var, LoadingError.InvalidAssets);
        return Unit.f93236a;
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdClicked() {
        u uVarD = t1.d();
        d3 d3Var = this.f15138a;
        uVarD.r(d3Var.f14935a, d3Var, d3Var.f13225r, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdExpired() {
        u uVarD = t1.d();
        d3 d3Var = this.f15138a;
        uVarD.i0(d3Var.f14935a, d3Var);
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeCallback
    public final void onAdFinished() {
        u uVarD = t1.d();
        d3 d3Var = this.f15138a;
        uVarD.Y(d3Var.f14935a, d3Var, d3Var.f13225r);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdLoadFailed(LoadingError loadingError) {
        u uVarD = t1.d();
        d3 d3Var = this.f15138a;
        uVarD.I(d3Var.f14935a, d3Var, loadingError);
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeCallback
    public final void onAdLoaded(UnifiedNativeAd unifiedNativeAd) {
        Intrinsics.checkNotNullParameter(unifiedNativeAd, "unifiedNativeAd");
        onAdLoaded(unifiedNativeAd, null);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdRevenueReceived(ImpressionLevelData impressionLevelData) {
        this.f15138a.f(impressionLevelData);
        u uVarD = t1.d();
        d3 d3Var = this.f15138a;
        uVarD.b0(d3Var.f14935a, d3Var, d3Var.f13225r);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdShowFailed(ShowError showError) {
        u uVarD = t1.d();
        d3 d3Var = this.f15138a;
        uVarD.q(d3Var.f14935a, d3Var, d3Var.f13225r, showError);
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeCallback
    public final void onAdShown() {
        u uVarD = t1.d();
        d3 d3Var = this.f15138a;
        uVarD.e0(d3Var.f14935a, d3Var, d3Var.f13225r);
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdditionalInfoLoaded(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        x2 x2Var = this.f15138a.f14937c;
        if (x2Var != null) {
            x2Var.b(jsonString);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void printError(String str, Object obj) {
        d3 d3Var = this.f15138a;
        ((r3) d3Var.f14935a).d(d3Var, str, obj);
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeCallback
    public final void onAdLoaded(final UnifiedNativeAd unifiedNativeAd, final ImpressionLevelData impressionLevelData) {
        Intrinsics.checkNotNullParameter(unifiedNativeAd, "unifiedNativeAd");
        final com.appodeal.ads.nativead.e eVar = new com.appodeal.ads.nativead.e(unifiedNativeAd, this.f15138a, new Function0() { // from class: com.appodeal.ads.p2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v2.a(this.f14265b);
            }
        }, new Function0() { // from class: com.appodeal.ads.q2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v2.d(unifiedNativeAd, this);
            }
        }, new Function0() { // from class: com.appodeal.ads.r2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v2.e(this.f14315b);
            }
        });
        eVar.f((com.appodeal.ads.nativead.downloader.g) com.appodeal.ads.nativead.downloader.i.f13865a.getValue(), new Function0() { // from class: com.appodeal.ads.s2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v2.b(this.f14447b, eVar, impressionLevelData);
            }
        }, new Function0() { // from class: com.appodeal.ads.t2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v2.f(this.f14859b);
            }
        });
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallback
    public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        u uVarD = t1.d();
        d3 d3Var = this.f15138a;
        uVarD.r(d3Var.f14935a, d3Var, d3Var.f13225r, unifiedAdCallbackClickTrackListener);
    }
}
