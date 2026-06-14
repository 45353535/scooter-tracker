package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends d0 {
    public f(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.f23660b == null) {
            this.f23660b = new com.fyber.inneractive.sdk.player.ui.i(context, new com.fyber.inneractive.sdk.player.ui.f(), this.f23661c, rVar, a());
        }
        return this.f23660b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final void b() {
        this.f23661c.getClass();
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        if (this.f23659a == null) {
            Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f23659a = new com.fyber.inneractive.sdk.player.controller.g(this.f23661c, this.f23660b, inneractiveAdSpot.getAdContent().f21038d, t0Var.f21037c, selectedUnitController instanceof u0 ? ((u0) selectedUnitController).isOverlayOutside() : false, IAConfigManager.O.f20305k || t0Var.f21040f, a());
        }
        return this.f23659a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final void a(com.fyber.inneractive.sdk.player.e eVar) {
        this.f23661c.getClass();
        eVar.a();
    }
}
