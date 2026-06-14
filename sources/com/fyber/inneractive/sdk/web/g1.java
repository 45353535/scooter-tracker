package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes7.dex */
public final class g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f23965a;

    public g1(i1 i1Var) {
        this.f23965a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        i1 i1Var = this.f23965a;
        if (i1Var.H == null || (eVar = i1Var.I) == null) {
            return;
        }
        eVar.c();
    }
}
