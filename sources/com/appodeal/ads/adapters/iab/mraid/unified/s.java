package com.appodeal.ads.adapters.iab.mraid.unified;

import android.content.Context;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.unified.UnifiedViewAdCallback;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s extends i implements com.explorestack.iab.mraid.k {
    public s(UnifiedViewAdCallback unifiedViewAdCallback, a aVar) {
        super(unifiedViewAdCallback, aVar);
    }

    @Override // com.explorestack.iab.mraid.k
    public final void b(com.explorestack.iab.mraid.j jVar) {
    }

    @Override // com.explorestack.iab.mraid.k
    public final void e(com.explorestack.iab.mraid.j jVar, b2.b bVar) {
        ((UnifiedViewAdCallback) this.f12246a).printError(bVar.d(), Integer.valueOf(bVar.c()));
        ((UnifiedViewAdCallback) this.f12246a).onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(bVar.d(), Integer.valueOf(bVar.c())));
    }

    @Override // com.explorestack.iab.mraid.k
    public final void f(com.explorestack.iab.mraid.j jVar, String str, e2.c cVar) {
        Context context = jVar.getContext();
        com.appodeal.ads.adapters.iab.utils.e eVar = this.f12248c;
        a aVar = this.f12247b;
        eVar.a(context, str, aVar.f12230b, aVar.f12235g, new h(this, cVar));
    }

    @Override // com.explorestack.iab.mraid.k
    public final void h(com.explorestack.iab.mraid.j jVar, String str) {
    }

    @Override // com.explorestack.iab.mraid.k
    public final void j(com.explorestack.iab.mraid.j jVar, b2.b bVar) {
        ((UnifiedViewAdCallback) this.f12246a).printError(bVar.d(), Integer.valueOf(bVar.c()));
        ((UnifiedViewAdCallback) this.f12246a).onAdExpired();
    }

    @Override // com.explorestack.iab.mraid.k
    public final void m(com.explorestack.iab.mraid.j jVar) {
    }

    @Override // com.explorestack.iab.mraid.k
    public final void p(com.explorestack.iab.mraid.j jVar) {
    }

    @Override // com.explorestack.iab.mraid.k
    public final void q(com.explorestack.iab.mraid.j jVar, b2.b bVar) {
        ((UnifiedViewAdCallback) this.f12246a).printError(bVar.d(), Integer.valueOf(bVar.c()));
        ((UnifiedViewAdCallback) this.f12246a).onAdLoadFailed(com.appodeal.ads.adapters.iab.utils.a.a(bVar));
    }
}
