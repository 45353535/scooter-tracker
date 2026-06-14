package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InneractiveAdRequest f21368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q0 f21369f;

    public s(InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.flow.o oVar) {
        super(rVar, str, oVar);
        this.f21368e = inneractiveAdRequest;
        q0 q0Var = new q0(new q(this), inneractiveAdRequest, rVar);
        this.f21369f = q0Var;
        q0Var.f21377d = new r(this);
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final void a() {
        this.f21344b = true;
        this.f21343a = null;
        this.f21369f.f21374a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final String b() {
        return this.f21369f.r();
    }
}
