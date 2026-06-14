package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.z f23659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.s f23660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.n f23661c;

    public d0(com.fyber.inneractive.sdk.player.t tVar) {
        this.f23661c = (com.fyber.inneractive.sdk.player.n) tVar.f23333f;
    }

    public abstract com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var);

    public abstract com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar);

    public String a() {
        t0 t0Var;
        com.fyber.inneractive.sdk.player.n nVar = this.f23661c;
        com.fyber.inneractive.sdk.response.e eVar = (nVar == null || (t0Var = nVar.f23253b) == null) ? null : t0Var.f21036b;
        if (eVar != null) {
            return eVar.F;
        }
        return null;
    }

    public abstract void a(com.fyber.inneractive.sdk.player.e eVar);

    public abstract void b();
}
