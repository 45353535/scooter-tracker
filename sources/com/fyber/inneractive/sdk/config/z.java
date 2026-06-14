package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f20515a;

    public z(a0 a0Var) {
        this.f20515a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20515a.f20321a.K = new com.fyber.inneractive.sdk.measurement.e();
        a0 a0Var = this.f20515a;
        com.fyber.inneractive.sdk.measurement.e eVar = a0Var.f20321a.K;
        Context context = a0Var.f20322b;
        if (eVar.f21095a) {
            return;
        }
        eVar.f21095a = true;
        com.fyber.inneractive.sdk.util.r.f23896b.post(new com.fyber.inneractive.sdk.measurement.d(eVar, context));
    }
}
