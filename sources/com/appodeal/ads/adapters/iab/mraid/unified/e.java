package com.appodeal.ads.adapters.iab.mraid.unified;

import android.content.Context;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e extends i implements com.explorestack.iab.mraid.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12243d;

    public e(Context context, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, a aVar) {
        super(unifiedFullscreenAdCallback, aVar);
        this.f12243d = context;
    }

    @Override // com.explorestack.iab.mraid.c
    public final void a(com.explorestack.iab.mraid.b bVar, b2.b bVar2) {
        ((UnifiedFullscreenAdCallback) this.f12246a).printError(bVar2.d(), Integer.valueOf(bVar2.c()));
        ((UnifiedFullscreenAdCallback) this.f12246a).onAdLoadFailed(com.appodeal.ads.adapters.iab.utils.a.a(bVar2));
    }

    @Override // com.explorestack.iab.mraid.c
    public final void c(com.explorestack.iab.mraid.b bVar) {
        ((UnifiedFullscreenAdCallback) this.f12246a).onAdLoaded();
    }

    @Override // com.explorestack.iab.mraid.c
    public final void d(com.explorestack.iab.mraid.b bVar, b2.b bVar2) {
        ((UnifiedFullscreenAdCallback) this.f12246a).printError(bVar2.d(), Integer.valueOf(bVar2.c()));
        ((UnifiedFullscreenAdCallback) this.f12246a).onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(bVar2.d(), Integer.valueOf(bVar2.c())));
    }

    @Override // com.explorestack.iab.mraid.c
    public final void g(com.explorestack.iab.mraid.b bVar, String str, e2.c cVar) {
        Context context = this.f12243d;
        com.appodeal.ads.adapters.iab.utils.e eVar = this.f12248c;
        a aVar = this.f12247b;
        eVar.a(context, str, aVar.f12230b, aVar.f12235g, new h(this, cVar));
    }

    @Override // com.explorestack.iab.mraid.c
    public final void i(com.explorestack.iab.mraid.b bVar, String str) {
    }

    @Override // com.explorestack.iab.mraid.c
    public final void k(com.explorestack.iab.mraid.b bVar, b2.b bVar2) {
        ((UnifiedFullscreenAdCallback) this.f12246a).printError(bVar2.d(), Integer.valueOf(bVar2.c()));
        ((UnifiedFullscreenAdCallback) this.f12246a).onAdExpired();
    }

    @Override // com.explorestack.iab.mraid.c
    public final void l(com.explorestack.iab.mraid.b bVar) {
        ((UnifiedFullscreenAdCallback) this.f12246a).onAdShown();
    }

    @Override // com.explorestack.iab.mraid.c
    public void o(com.explorestack.iab.mraid.b bVar) {
        ((UnifiedFullscreenAdCallback) this.f12246a).onAdClosed();
    }
}
