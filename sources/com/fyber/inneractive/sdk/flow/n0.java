package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f20771a;

    public n0(p0 p0Var) {
        this.f20771a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        com.fyber.inneractive.sdk.util.r.f23896b.post(this.f20771a.f20856l);
        p0 p0Var = this.f20771a;
        v1 v1Var = p0Var.f20857m;
        if (v1Var != null) {
            v1Var.f23920e = null;
            p0Var.f20857m = null;
        }
        p0Var.f20861q = false;
    }
}
