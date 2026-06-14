package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.mraid.e f23962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f23963b;

    public f0(i0 i0Var, com.fyber.inneractive.sdk.mraid.e eVar) {
        this.f23963b = i0Var;
        this.f23962a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return this.f23962a.c();
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
        com.fyber.inneractive.sdk.mraid.e eVar = this.f23962a;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return this.f23962a.f21262a;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar = ((IAmraidWebViewController) this.f23963b).I;
        if (eVar != null) {
            eVar.a();
        }
        this.f23962a.a();
    }

    public final String toString() {
        return "action = " + this.f23962a.f21262a + " url = " + this.f23962a.c();
    }
}
