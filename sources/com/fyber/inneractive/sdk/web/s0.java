package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f24045a;

    public s0(v0 v0Var) {
        this.f24045a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24045a.f24070u.compareAndSet(false, true)) {
            this.f24045a.d("onCancelResult(true);");
            this.f24045a.f24071v.set(false);
        }
    }
}
