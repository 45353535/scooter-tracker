package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.t f20983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20984j;

    public t0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(s0Var, rVar);
        this.f20984j = false;
        this.f21036b = gVar;
        this.f21035a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        com.fyber.inneractive.sdk.config.t0 t0Var;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f21038d;
        if (s0Var == null || (t0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f20438f) == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config: %s or mUnitConfig.getVideo is null", IAlog.a(this), this.f21038d);
            return false;
        }
        UnitDisplayType unitDisplayType = t0Var.f20498j;
        return UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) || UnitDisplayType.REWARDED.equals(unitDisplayType) || UnitDisplayType.VERTICAL.equals(unitDisplayType);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        com.fyber.inneractive.sdk.player.n nVar;
        if (this.f21015g != null && c()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f21015g;
            v0Var.f24074y = true;
            v0Var.D = false;
            v0Var.f24051b.f21076h.remove(v0Var);
            v0Var.f24058i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.f21015g = null;
        }
        com.fyber.inneractive.sdk.player.t tVar = this.f20983i;
        if (tVar != null) {
            com.fyber.inneractive.sdk.player.b bVar = tVar.f23328a;
            if (bVar != null && (nVar = bVar.f21435b) != null) {
                nVar.f23260i = true;
                IAlog.a("IAMediaPlayerFlowManager: destroy", new Object[0]);
                nVar.a();
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar.f23318t.f20665b.a();
                if (bVarA != null) {
                    bVarA.destroy();
                }
                if (nVar.f23252a != null) {
                    IAlog.a("%s : destroy() : playerController being destroyed", com.fyber.inneractive.sdk.player.f.class.getSimpleName());
                    nVar.f23252a.a();
                    nVar.f23252a = null;
                }
                nVar.f23263l = null;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.f23318t;
                if (kVar != null) {
                    com.fyber.inneractive.sdk.flow.endcard.m mVar = kVar.f20665b;
                    Iterator it = mVar.f20700a.iterator();
                    while (it.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.endcard.b) it.next()).destroy();
                    }
                    mVar.f20700a.clear();
                    mVar.f20701b.clear();
                    mVar.f20702c = -1;
                }
                com.fyber.inneractive.sdk.player.ui.remote.g gVar = nVar.f23319u;
                if (gVar != null) {
                    gVar.f23408a.a();
                }
                com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = nVar.f23320v;
                if (bVar2 != null) {
                    bVar2.f20873a.a();
                    bVar2.a();
                    bVar2.f20877e = null;
                    bVar2.f20880h.clear();
                }
            }
            this.f20983i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f20983i != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return true;
    }
}
