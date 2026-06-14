package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements com.fyber.inneractive.sdk.factories.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f20528a;

    public f(g gVar) {
        this.f20528a = gVar;
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        this.f20528a.getClass();
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof a);
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final com.fyber.inneractive.sdk.interfaces.d a() {
        return new com.fyber.inneractive.sdk.dv.banner.c();
    }
}
