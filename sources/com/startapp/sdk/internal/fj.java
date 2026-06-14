package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class fj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f64515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ek f64516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pe f64517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij f64518d;

    public fj(ij ijVar, String str, ek ekVar, pe peVar) {
        this.f64518d = ijVar;
        this.f64515a = str;
        this.f64516b = ekVar;
        this.f64517c = peVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ij ijVar = this.f64518d;
        ijVar.a(ijVar.f64723b, this.f64515a, this.f64516b, this.f64517c);
    }
}
