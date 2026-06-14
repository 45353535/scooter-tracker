package com.appodeal.ads.adapters.iab.mraid.rewarded_video;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.iab.mraid.unified.e;
import com.appodeal.ads.adapters.iab.mraid.unified.k;
import com.appodeal.ads.adapters.iab.mraid.unified.l;
import com.appodeal.ads.adapters.iab.mraid.unified.o;
import com.appodeal.ads.adapters.iab.unified.r;
import com.appodeal.ads.adapters.iab.unified.x;
import com.appodeal.ads.adapters.iab.utils.f;
import com.appodeal.ads.adapters.iab.utils.n;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.explorestack.iab.mraid.MraidActivity;
import eg.i;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedRewarded implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f12228a = new o(this);

    @Override // com.appodeal.ads.adapters.iab.mraid.unified.m
    public final void a(Context context, UnifiedAdParams unifiedAdParams, com.appodeal.ads.adapters.iab.mraid.unified.a aVar, UnifiedAdCallback unifiedAdCallback, String str) {
        x runnable = new x(context, str, aVar.f12229a, x.f12298j, new r(aVar), new a(this, (UnifiedRewardedParams) unifiedAdParams, (UnifiedRewardedCallback) unifiedAdCallback));
        Lazy lazy = n.f12324a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        i.d((CoroutineScope) n.f12325b.getValue(), null, null, new f(runnable, null), 3, null);
    }

    @Override // com.appodeal.ads.adapters.iab.mraid.unified.l
    public final e b(Context context, UnifiedFullscreenAdParams unifiedFullscreenAdParams, com.appodeal.ads.adapters.iab.mraid.unified.a aVar, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        return new k(context, (UnifiedRewardedCallback) unifiedFullscreenAdCallback, aVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        o oVar = this.f12228a;
        oVar.getClass();
        Context applicationContext = contextProvider.getApplicationContext();
        com.appodeal.ads.adapters.iab.mraid.unified.r.a(applicationContext, (UnifiedRewardedParams) unifiedAdParams, (com.appodeal.ads.adapters.iab.mraid.unified.a) adUnitParams, (UnifiedRewardedCallback) unifiedAdCallback, oVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onClicked() {
        super.onClicked();
        this.f12228a.onClicked();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        this.f12228a.onDestroy();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onFinished() {
        super.onFinished();
        this.f12228a.onFinished();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onPrepareToShow(Activity activity, UnifiedAdParams unifiedAdParams) {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        super.onPrepareToShow(activity, unifiedRewardedParams);
        this.f12228a.onPrepareToShow(activity, unifiedRewardedParams);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.appodeal.ads.adapters.iab.mraid.unified.l, com.appodeal.ads.unified.UnifiedFullscreenAd] */
    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        o oVar = this.f12228a;
        MraidActivity.h(activity, oVar.f12250b, oVar.f12249a.a());
    }

    @Override // com.appodeal.ads.adapters.iab.mraid.unified.l
    public final com.explorestack.iab.mraid.i a() {
        return com.explorestack.iab.mraid.i.Rewarded;
    }
}
