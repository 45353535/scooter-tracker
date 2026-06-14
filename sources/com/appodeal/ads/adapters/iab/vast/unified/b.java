package com.appodeal.ads.adapters.iab.vast.unified;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.explorestack.iab.vast.activity.VastActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements f2.f, f2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedFullscreenAdCallback f12336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.appodeal.ads.adapters.iab.utils.e f12338c = new com.appodeal.ads.adapters.iab.utils.e();

    public b(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, e eVar) {
        this.f12336a = unifiedFullscreenAdCallback;
        this.f12337b = eVar;
    }

    @Override // f2.b
    public final void a(f2.e eVar, b2.b bVar) {
        this.f12336a.printError(bVar.d(), Integer.valueOf(bVar.c()));
        this.f12336a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(bVar.d(), Integer.valueOf(bVar.c())));
    }

    @Override // f2.f
    public final void b(f2.e eVar) {
        this.f12336a.onAdLoaded();
    }

    @Override // f2.b
    public final void d(VastActivity vastActivity, f2.e eVar, e2.c cVar, String str) {
        com.appodeal.ads.adapters.iab.utils.e eVar2 = this.f12338c;
        e eVar3 = this.f12337b;
        eVar2.a(vastActivity, str, eVar3.f12342d, eVar3.f12343e, new a(this, cVar));
    }

    @Override // f2.b
    public final void e(VastActivity vastActivity, f2.e eVar) {
        this.f12336a.onAdShown();
    }

    @Override // f2.b
    public final void f(VastActivity vastActivity, f2.e eVar, boolean z10) {
        if (z10) {
            this.f12336a.onAdFinished();
        }
        this.f12336a.onAdClosed();
    }

    @Override // f2.f
    public final void g(f2.e eVar, b2.b bVar) {
        this.f12336a.printError(bVar.d(), Integer.valueOf(bVar.c()));
        this.f12336a.onAdLoadFailed(com.appodeal.ads.adapters.iab.utils.a.a(bVar));
    }

    @Override // f2.b
    public final void c(VastActivity vastActivity, f2.e eVar) {
    }
}
