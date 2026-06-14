package com.appodeal.ads.adapters.iab.vast.unified;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements com.appodeal.ads.adapters.iab.utils.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2.c f12334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f12335b;

    public a(b bVar, e2.c cVar) {
        this.f12335b = bVar;
        this.f12334a = cVar;
    }

    @Override // com.appodeal.ads.adapters.iab.utils.d
    public final void a() {
        this.f12334a.d();
    }

    @Override // com.appodeal.ads.adapters.iab.utils.d
    public final void b() {
        this.f12334a.a();
    }

    @Override // com.appodeal.ads.adapters.iab.utils.d
    public final void a(com.appodeal.ads.adapters.iab.utils.c cVar) {
        this.f12335b.f12336a.onAdClicked(cVar);
    }
}
