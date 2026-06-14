package com.fyber.inneractive.sdk.dv.banner;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.handler.e;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.x;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f20522a;

    public a(b bVar) {
        this.f20522a = bVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        InneractiveAdRequest inneractiveAdRequest = this.f20522a.f21035a;
        String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
        com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
        b bVar = this.f20522a;
        e.a(spotId, aVar, bVar.f21035a, (i) bVar.f21036b, loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        b bVar = this.f20522a;
        c cVar = bVar.f20519h;
        if (cVar != null) {
            cVar.w();
        } else {
            bVar.f20523j = true;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        b bVar = this.f20522a;
        com.fyber.inneractive.sdk.dv.c cVar = bVar.f20518g;
        if (cVar != null) {
            bVar.f20524k = true;
            cVar.g();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        i iVar;
        l0 l0Var;
        c cVar = this.f20522a.f20519h;
        if (cVar != null) {
            cVar.a(cVar.y(), false, Float.NaN, Float.NaN);
            x xVar = cVar.f20622b;
            if (xVar == null || (iVar = (i) ((b) xVar).f21036b) == null) {
                return;
            }
            b0.a(iVar);
            s0 s0Var = ((b) cVar.f20622b).f21038d;
            if (s0Var == null || (l0Var = ((r0) s0Var).f20435c) == null) {
                return;
            }
            b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, l0Var.f20420b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY);
        }
    }
}
