package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class ne implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hj f64962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f64963b;

    public ne(hj hjVar, String str) {
        this.f64962a = hjVar;
        this.f64963b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hj hjVar = this.f64962a;
        String str = this.f64963b;
        pe peVar = hjVar.f64652a;
        if (peVar != null) {
            peVar.a(str);
        }
    }
}
