package com.fyber.inneractive.sdk.dv.interstitial;

import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.google.android.gms.ads.AdListener;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f20542a;

    public e(g gVar) {
        this.f20542a = gVar;
    }

    public final void onAdFailedToLoad(int i10) {
        com.fyber.inneractive.sdk.dv.c cVar = this.f20542a.f20518g;
        if (cVar != null) {
            cVar.j();
            InneractiveAdRequest inneractiveAdRequest = this.f20542a.f21035a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
            g gVar = this.f20542a;
            com.fyber.inneractive.sdk.dv.handler.e.a(spotId, aVar, gVar.f21035a, (i) gVar.f21036b, String.format("errorCode - %d", Integer.valueOf(i10)));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        g gVar = this.f20542a;
        if (gVar.f20518g != null) {
            gVar.g();
            this.f20542a.f20518g.g();
        }
    }
}
