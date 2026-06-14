package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 implements s1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f24035a;

    public q0(v0 v0Var) {
        this.f24035a = v0Var;
    }

    @Override // s1.a
    public final void a() {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectSuccess", new Object[0]);
        v0 v0Var = this.f24035a;
        v0Var.f24051b.a(v0Var.f24052c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f24055f, v0Var.f24053d, v0Var.f24057h.f20988a));
        this.f24035a.d("onShowInstallStarted();");
    }

    @Override // s1.a
    public final void a(String str) {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectFailed: error: %s", str);
    }
}
