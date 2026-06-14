package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes7.dex */
public final class o1 extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hh.b0 f21354g;

    public o1(l lVar, hh.b0 b0Var) {
        this.f21354g = b0Var;
        this.f21331d = lVar.f21331d;
        this.f21330c = lVar.f21330c;
        this.f21332e = lVar.f21332e;
        this.f21328a = lVar.f21328a;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        super.a();
        hh.b0 b0Var = this.f21354g;
        if (b0Var != null) {
            b0Var.close();
        }
    }
}
