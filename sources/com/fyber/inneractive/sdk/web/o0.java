package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f24029b;

    public o0(v0 v0Var, String str) {
        this.f24029b = v0Var;
        this.f24028a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("injecting JS: %s", this.f24028a);
        try {
            String str = this.f24028a;
            if (str != null) {
                com.fyber.inneractive.sdk.util.q0.a(this.f24029b.f24050a, str);
            }
        } catch (Exception unused) {
            IAlog.a("Failed to inject JS", new Object[0]);
        }
    }
}
