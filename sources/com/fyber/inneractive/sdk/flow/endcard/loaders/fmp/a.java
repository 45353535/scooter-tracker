package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

import com.fyber.inneractive.sdk.flow.endcard.j;
import com.fyber.inneractive.sdk.flow.endcard.o;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f20690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f20691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b f20692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f20693d;

    public a(j jVar, x0 x0Var, com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar) {
        this.f20691b = jVar;
        this.f20690a = x0Var;
        this.f20692c = bVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar = this.f20692c;
        o oVar = this.f20693d;
        bVar.getClass();
        if (oVar != null) {
            IAlog.a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", oVar.i());
            bVar.f20676d.a(oVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a(String str) {
        this.f20692c.getClass();
        IAlog.a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
    }
}
