package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 implements s1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f24033c;

    public p0(v0 v0Var, String str, String str2) {
        this.f24033c = v0Var;
        this.f24031a = str;
        this.f24032b = str2;
    }

    @Override // s1.a
    public final void a() {
        v0 v0Var = this.f24033c;
        v0Var.f24051b.a(v0Var.f24052c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f24055f, v0Var.f24053d, v0Var.f24057h.f20988a));
        this.f24033c.d("onShowInstallStarted();");
    }

    @Override // s1.a
    public final void a(String str) {
        v0 v0Var = this.f24033c;
        v0Var.f24051b.m();
        v0Var.d("onInstallationFailed();");
        v0 v0Var2 = this.f24033c;
        v0Var2.f24057h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, this.f24031a, this.f24032b, v0Var2.f24053d);
    }
}
