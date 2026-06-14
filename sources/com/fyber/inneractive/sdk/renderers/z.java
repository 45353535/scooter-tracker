package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f23709a;

    public z(a0 a0Var) {
        this.f23709a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.f23709a;
        if (a0Var.f20622b != null && !a0Var.f23641m) {
            a0Var.f23641m = true;
            IAlog.a("%sTracking impression", IAlog.a(a0Var));
            com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) a0Var.f20622b);
            a0Var.f23642n = aVar;
            aVar.a(a0Var);
        }
        a0Var.G();
    }
}
