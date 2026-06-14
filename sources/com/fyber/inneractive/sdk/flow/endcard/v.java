package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.flow.x0;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.k f20723h;

    public v(x0 x0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i10) {
        super(x0Var, cVar, i10);
        this.f20723h = cVar.f21178b;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new w(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.c, com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        return super.l() && ((w) f()).f20724c != null;
    }
}
