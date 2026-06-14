package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements com.fyber.inneractive.sdk.web.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f20714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f20715b;

    public t(u uVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.f20715b = uVar;
        this.f20714a = aVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        this.f20715b.f20721h.set(false);
        this.f20715b.f20722i.a(iVar);
        this.f20714a.a();
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f20715b.f20721h.set(false);
        this.f20715b.f20722i.a(iVar, inneractiveInfrastructureError);
        this.f20714a.a(inneractiveInfrastructureError.description());
    }
}
