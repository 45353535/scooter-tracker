package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends a {
    public x(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.f23660b == null) {
            this.f23660b = new com.fyber.inneractive.sdk.player.ui.t(context, new com.fyber.inneractive.sdk.player.ui.h(), rVar);
        }
        return this.f23660b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f23659a;
        if (zVar != null) {
            return zVar;
        }
        this.f23659a = new com.fyber.inneractive.sdk.player.controller.c0(this.f23661c, (com.fyber.inneractive.sdk.player.ui.t) this.f23660b, com.fyber.inneractive.sdk.config.a.a(inneractiveAdSpot.getAdContent().b().f23735o), t0Var.f21037c);
        return super.a(inneractiveAdSpot, t0Var);
    }
}
