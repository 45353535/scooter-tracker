package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements com.fyber.inneractive.sdk.web.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f20713a;

    public s(u uVar) {
        this.f20713a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        IAlog.a("%s End-Card loaded", this.f20713a.f20644a);
        this.f20713a.f20721h.set(false);
        u uVar = this.f20713a;
        uVar.getClass();
        boolean z10 = iVar != null;
        uVar.f20719f = z10;
        com.fyber.inneractive.sdk.web.m mVar = z10 ? iVar.f23971b : null;
        String str = IAConfigManager.O.H.f20225e;
        if (!uVar.f() || mVar == null || TextUtils.isEmpty(str)) {
            uVar.f20645b.m();
        } else {
            q0.a(mVar, str, uVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.f("%s End-Card failed to load!", this.f20713a.f20644a);
        this.f20713a.f20721h.set(false);
        u uVar = this.f20713a;
        uVar.f20719f = false;
        uVar.f20645b.a(inneractiveInfrastructureError);
    }
}
