package com.appodeal.ads.adapters.iab.mraid.unified;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAd;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;
import com.explorestack.iab.mraid.MraidActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends UnifiedFullscreenAd implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedFullscreenAd f12249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.explorestack.iab.mraid.b f12250b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(l lVar) {
        this.f12249a = (UnifiedFullscreenAd) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.appodeal.ads.adapters.iab.mraid.unified.m, com.appodeal.ads.unified.UnifiedFullscreenAd] */
    @Override // com.appodeal.ads.adapters.iab.mraid.unified.n
    public final void a(Context context, UnifiedAdParams unifiedAdParams, a aVar, UnifiedAdCallback unifiedAdCallback, String str) {
        this.f12249a.a(context, (UnifiedFullscreenAdParams) unifiedAdParams, aVar, (UnifiedFullscreenAdCallback) unifiedAdCallback, str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.appodeal.ads.adapters.iab.mraid.unified.l, com.appodeal.ads.unified.UnifiedFullscreenAd] */
    @Override // com.appodeal.ads.adapters.iab.mraid.unified.n
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void c(Context context, UnifiedFullscreenAdParams unifiedFullscreenAdParams, a aVar, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        if (!com.appodeal.ads.adapters.iab.utils.a.b(aVar.f12232d)) {
            unifiedFullscreenAdCallback.onAdLoadFailed(LoadingError.IncorrectAdunit);
            return;
        }
        com.explorestack.iab.mraid.b bVarA = com.explorestack.iab.mraid.b.s().d(aVar.f12231c).e(aVar.f12236h ? b2.a.FullLoad : b2.a.Stream).j(aVar.f12237i).k(this.f12249a.b(context, unifiedFullscreenAdParams, aVar, unifiedFullscreenAdCallback)).g(aVar.f12240l).m(aVar.f12234f).a(context);
        this.f12250b = bVarA;
        bVarA.r(aVar.f12232d);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        Context applicationContext = contextProvider.getApplicationContext();
        r.a(applicationContext, (UnifiedFullscreenAdParams) unifiedAdParams, (a) adUnitParams, (UnifiedFullscreenAdCallback) unifiedAdCallback, this);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        com.explorestack.iab.mraid.b bVar = this.f12250b;
        if (bVar != null) {
            bVar.m();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.appodeal.ads.adapters.iab.mraid.unified.l, com.appodeal.ads.unified.UnifiedFullscreenAd] */
    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        MraidActivity.h(activity, this.f12250b, this.f12249a.a());
    }
}
