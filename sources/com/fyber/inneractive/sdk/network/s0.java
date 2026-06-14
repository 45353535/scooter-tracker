package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f21371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f21373d;

    public s0(t0 t0Var, Object obj, Exception exc, boolean z10) {
        this.f21373d = t0Var;
        this.f21370a = obj;
        this.f21371b = exc;
        this.f21372c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21373d.f21375b.a(this.f21370a, this.f21371b, this.f21372c);
    }
}
