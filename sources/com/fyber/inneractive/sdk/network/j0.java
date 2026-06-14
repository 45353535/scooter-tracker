package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f21324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f21325b;

    public j0(l0 l0Var, t0 t0Var) {
        this.f21325b = l0Var;
        this.f21324a = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.e("retryNetworkRequest pre-execute - %s", this.f21324a.getClass().getName());
        this.f21325b.a(this.f21324a);
    }
}
