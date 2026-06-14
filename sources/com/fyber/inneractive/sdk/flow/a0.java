package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f20619a;

    public a0(b0 b0Var) {
        this.f20619a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f20619a;
        b0Var.getClass();
        IAlog.a("%sRe-enabling clicks, grace period has passed", IAlog.a(b0Var));
        b0 b0Var2 = this.f20619a;
        b0Var2.f20626f = true;
        b0Var2.f20627g = null;
    }
}
