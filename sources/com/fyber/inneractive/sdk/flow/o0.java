package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f20853a;

    public o0(p0 p0Var) {
        this.f20853a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        Runnable runnable = this.f20853a.f20858n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.post(runnable);
        }
        p0 p0Var = this.f20853a;
        v1 v1Var = p0Var.f20859o;
        if (v1Var != null) {
            v1Var.f23920e = null;
            p0Var.f20859o = null;
        }
    }
}
