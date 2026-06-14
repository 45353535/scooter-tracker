package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.v0 f21015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f21016h;

    public w(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
        this.f21016h = new v(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final com.fyber.inneractive.sdk.web.v0 a() {
        return this.f21015g;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        com.fyber.inneractive.sdk.web.v0 v0Var = this.f21015g;
        return v0Var != null && v0Var.f24061l;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void f() {
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.response.e eVar2;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
        if (!hVar.f21074f || (eVar = this.f21036b) == null || !eVar.a() || !hVar.n() || d() || (eVar2 = this.f21036b) == null) {
            return;
        }
        com.fyber.inneractive.sdk.ignite.m mVar = eVar2.H;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        if (mVar != mVar2) {
            IAlog.a("ignite webpage was not loaded yet, stopping the loading process", new Object[0]);
            com.fyber.inneractive.sdk.response.e eVar3 = this.f21036b;
            if (mVar2 == null) {
                eVar3.getClass();
            }
            eVar3.H = mVar2;
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f21015g;
            if (v0Var != null) {
                com.fyber.inneractive.sdk.web.n0 n0Var = v0Var.f24065p;
                if (n0Var != null) {
                    com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(n0Var);
                    v0Var.f24065p = null;
                }
                if (!v0Var.f24074y) {
                    v0Var.f24050a.stopLoading();
                }
                this.f21016h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, this.f21015g.f24060k, com.fyber.inneractive.sdk.ignite.j.WEBPAGE_NOT_LOADED_BEFORE_SHOW.a(), this.f21036b.H);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void a(String str) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        com.fyber.inneractive.sdk.response.e eVar2 = this.f21036b;
        if (eVar2 != null) {
            com.fyber.inneractive.sdk.ignite.m mVar3 = eVar2.H;
            mVar3.getClass();
            mVar = com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
            if (mVar3 != mVar) {
                com.fyber.inneractive.sdk.ignite.m mVar4 = this.f21036b.H;
                mVar4.getClass();
                if (mVar4 != com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP || isVideoAd()) {
                    mVar = this.f21036b.H;
                } else {
                    this.f21016h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_MODE_NOT_COMPATIBLE, null, null, null);
                }
            }
        } else {
            mVar = mVar2;
        }
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
        if (!hVar.f21074f || (eVar = this.f21036b) == null || !eVar.a() || !hVar.n()) {
            com.fyber.inneractive.sdk.response.e eVar3 = this.f21036b;
            if (eVar3 != null) {
                eVar3.H = mVar2;
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.response.e eVar4 = this.f21036b;
        String str2 = eVar4 != null ? eVar4.A : null;
        com.fyber.inneractive.sdk.web.w0 w0Var = new com.fyber.inneractive.sdk.web.w0();
        w0Var.f24077a = str2;
        w0Var.f24078b = mVar;
        w0Var.f24079c = str;
        w0Var.f24080d = this.f21037c;
        w0Var.f24081e = eVar4 != null ? eVar4.G : null;
        w0Var.f24082f = eVar4 != null ? eVar4.I : null;
        w0Var.f24083g = this.f21016h;
        com.fyber.inneractive.sdk.web.v0 v0Var = new com.fyber.inneractive.sdk.web.v0(w0Var);
        this.f21015g = v0Var;
        com.fyber.inneractive.sdk.config.global.features.q qVar = (com.fyber.inneractive.sdk.config.global.features.q) this.f21037c.a(com.fyber.inneractive.sdk.config.global.features.q.class);
        if (qVar == null || str2 == null) {
            return;
        }
        String strA = qVar.a("detail_url", "https://cdn2.inner-active.mobi/app-detail-page-v0/[BUNDLE_ID].html");
        v0Var.e(strA == null ? "" : strA.replace("[BUNDLE_ID]", str2));
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean a(boolean z10, com.fyber.inneractive.sdk.util.g gVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.response.e eVar = this.f21036b;
        if (eVar != null) {
            mVar = eVar.H;
        } else {
            mVar = com.fyber.inneractive.sdk.ignite.m.NONE;
        }
        if (z10 || mVar == null || mVar != com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP) {
            return false;
        }
        return gVar == com.fyber.inneractive.sdk.util.g.VIDEO_CTA || gVar == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD;
    }
}
