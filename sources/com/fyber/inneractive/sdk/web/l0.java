package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f24017a;

    public l0(m0 m0Var) {
        this.f24017a = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v0 v0Var = this.f24017a.f24025a;
        if (v0Var.f24074y) {
            return;
        }
        v0Var.e(v0Var.f24060k);
    }
}
