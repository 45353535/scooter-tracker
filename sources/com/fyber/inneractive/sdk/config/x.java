package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.d1;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f20509a;

    public x(IAConfigManager iAConfigManager) {
        this.f20509a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(s sVar, o oVar) {
        if (oVar.a("dv_enabled_v3", 0, 0) == 1) {
            this.f20509a.G.a();
        }
        com.fyber.inneractive.sdk.network.f fVar = this.f20509a.I;
        fVar.getClass();
        int iA = IAConfigManager.O.f20315u.f20484b.a("send_events_batch_interval", 30, -1);
        int i10 = iA >= 0 ? iA : 30;
        String property = System.getProperty("fyber.marketplace.use_batch_interval");
        int i11 = (property == null || Boolean.getBoolean(property)) ? i10 : 0;
        fVar.f21309f = true;
        fVar.f21308e = i11;
        d1 d1Var = fVar.f21307d;
        if (d1Var != null && d1Var.hasMessages(12312329)) {
            fVar.f21307d.removeMessages(12312329);
        }
        long j10 = fVar.f21308e * 1000;
        d1 d1Var2 = fVar.f21307d;
        if (d1Var2 != null) {
            d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j10));
        }
    }
}
