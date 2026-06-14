package com.appodeal.ads.adapters.iab.mraid.unified;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements com.appodeal.ads.adapters.iab.utils.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2.c f12244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f12245b;

    public h(i iVar, e2.c cVar) {
        this.f12245b = iVar;
        this.f12244a = cVar;
    }

    @Override // com.appodeal.ads.adapters.iab.utils.d
    public final void a() {
        this.f12244a.d();
    }

    @Override // com.appodeal.ads.adapters.iab.utils.d
    public final void b() {
        this.f12244a.a();
    }

    @Override // com.appodeal.ads.adapters.iab.utils.d
    public final void a(com.appodeal.ads.adapters.iab.utils.c cVar) {
        this.f12245b.f12246a.onAdClicked(cVar);
    }
}
