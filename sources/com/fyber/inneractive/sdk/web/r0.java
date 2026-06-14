package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f24037a;

    public r0(v0 v0Var) {
        this.f24037a = v0Var;
    }

    public final void a(boolean z10) {
        if (this.f24037a.f24070u.compareAndSet(false, true)) {
            this.f24037a.d("onCancelResult(" + z10 + ");");
            this.f24037a.f24071v.set(false);
        }
    }
}
