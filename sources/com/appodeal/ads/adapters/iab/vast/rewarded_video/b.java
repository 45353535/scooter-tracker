package com.appodeal.ads.adapters.iab.vast.rewarded_video;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.iab.unified.x;
import com.appodeal.ads.adapters.iab.unified.z;
import com.appodeal.ads.adapters.iab.utils.f;
import com.appodeal.ads.adapters.iab.utils.n;
import com.appodeal.ads.adapters.iab.vast.unified.e;
import com.appodeal.ads.adapters.iab.vast.unified.g;
import com.appodeal.ads.adapters.iab.vast.unified.h;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import eg.i;
import f2.j;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedRewarded implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f12333a = new h(this);

    @Override // com.appodeal.ads.adapters.iab.vast.unified.g
    public final j a() {
        return j.Rewarded;
    }

    @Override // com.appodeal.ads.adapters.iab.vast.unified.g
    public final void d(Context context, UnifiedFullscreenAdParams unifiedFullscreenAdParams, e eVar, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, String str) {
        x runnable = new x(context, str, eVar.f12339a, x.f12298j, new z(eVar), new a(this, (UnifiedRewardedParams) unifiedFullscreenAdParams, (UnifiedRewardedCallback) unifiedFullscreenAdCallback));
        Lazy lazy = n.f12324a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        i.d((CoroutineScope) n.f12325b.getValue(), null, null, new f(runnable, null), 3, null);
    }

    @Override // com.appodeal.ads.adapters.iab.vast.unified.g
    public final com.appodeal.ads.adapters.iab.vast.unified.b g(UnifiedFullscreenAdParams unifiedFullscreenAdParams, e eVar, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        return new com.appodeal.ads.adapters.iab.vast.unified.f((UnifiedRewardedCallback) unifiedFullscreenAdCallback, eVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.appodeal.ads.adapters.iab.vast.unified.g, com.appodeal.ads.unified.UnifiedFullscreenAd] */
    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedAdCallback;
        h hVar = this.f12333a;
        hVar.getClass();
        e eVar = (e) adUnitParams;
        Context applicationContext = contextProvider.getApplicationContext();
        if (com.appodeal.ads.adapters.iab.utils.a.b(eVar.f12340b)) {
            hVar.j(applicationContext, unifiedRewardedParams, eVar, unifiedRewardedCallback);
        } else {
            hVar.f12346a.d(applicationContext, unifiedRewardedParams, eVar, unifiedRewardedCallback, eVar.f12341c);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        this.f12333a.onDestroy();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onPrepareToShow(Activity activity, UnifiedAdParams unifiedAdParams) {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        super.onPrepareToShow(activity, unifiedRewardedParams);
        this.f12333a.onPrepareToShow(activity, unifiedRewardedParams);
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        this.f12333a.show(activity, (UnifiedRewardedCallback) unifiedFullscreenAdCallback);
    }
}
