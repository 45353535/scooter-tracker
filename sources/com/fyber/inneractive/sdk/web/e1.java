package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes7.dex */
public final class e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f23961a;

    public e1(i1 i1Var) {
        this.f23961a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f23961a.f23971b;
        if (mVar != null) {
            mVar.getViewTreeObserver().addOnPreDrawListener(this.f23961a.K);
        }
    }
}
