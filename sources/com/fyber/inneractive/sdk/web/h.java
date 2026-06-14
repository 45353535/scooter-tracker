package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g1 f23967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f23968c;

    public h(i iVar, String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        this.f23968c = iVar;
        this.f23967b = g1Var;
        this.f23966a = str;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return "open";
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        i iVar = this.f23968c;
        String str = this.f23966a;
        com.fyber.inneractive.sdk.util.g1 g1Var = this.f23967b;
        j1 j1Var = iVar.f23976g;
        if (j1Var != null) {
            com.fyber.inneractive.sdk.util.g0 g0Var = j1Var.a(str, g1Var).f23861a;
        }
    }

    public final String toString() {
        return "action: open url: " + this.f23966a;
    }
}
