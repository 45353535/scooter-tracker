package com.appodeal.ads.adapters.iab.mraid.unified;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedViewAd;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import com.appodeal.ads.unified.UnifiedViewAdParams;
import com.explorestack.iab.mraid.j;

/* JADX INFO: loaded from: classes6.dex */
public class p extends UnifiedViewAd implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedViewAd f12251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.explorestack.iab.mraid.j f12252b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(q qVar) {
        this.f12251a = (UnifiedViewAd) qVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.appodeal.ads.adapters.iab.mraid.unified.q, com.appodeal.ads.unified.UnifiedViewAd] */
    @Override // com.appodeal.ads.adapters.iab.mraid.unified.n
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void c(Context context, UnifiedViewAdParams unifiedViewAdParams, a aVar, UnifiedViewAdCallback unifiedViewAdCallback) {
        if (!com.appodeal.ads.adapters.iab.utils.a.b(aVar.f12232d)) {
            unifiedViewAdCallback.onAdLoadFailed(LoadingError.IncorrectAdunit);
            return;
        }
        com.explorestack.iab.mraid.j jVarC = new j.a().u(aVar.f12231c).v(aVar.f12236h ? b2.a.FullLoad : b2.a.Stream).A(aVar.f12237i).B(this.f12251a.i(unifiedViewAdParams, aVar, unifiedViewAdCallback)).D(aVar.f12234f).c(context);
        this.f12252b = jVarC;
        jVarC.l0(aVar.f12232d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.appodeal.ads.adapters.iab.mraid.unified.m, com.appodeal.ads.unified.UnifiedViewAd] */
    @Override // com.appodeal.ads.adapters.iab.mraid.unified.n
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void a(Context context, UnifiedViewAdParams unifiedViewAdParams, a aVar, UnifiedViewAdCallback unifiedViewAdCallback, String str) {
        this.f12251a.a(context, unifiedViewAdParams, aVar, unifiedViewAdCallback, str);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void onPrepareToShow(Activity activity, UnifiedViewAdParams unifiedViewAdParams) {
        super.onPrepareToShow(activity, unifiedViewAdParams);
        com.explorestack.iab.mraid.j jVar = this.f12252b;
        if (jVar != null) {
            jVar.r0(null);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        Context applicationContext = contextProvider.getApplicationContext();
        r.a(applicationContext, (UnifiedViewAdParams) unifiedAdParams, (a) adUnitParams, (UnifiedViewAdCallback) unifiedAdCallback, this);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        com.explorestack.iab.mraid.j jVar = this.f12252b;
        if (jVar != null) {
            jVar.U();
            this.f12252b = null;
        }
    }
}
