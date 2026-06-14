package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class mk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ok f64945a;

    public mk(ok okVar, long j10) {
        this.f64945a = okVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f64945a.f65048b.compareAndSet(false, true)) {
            ok okVar = this.f64945a;
            okVar.f65053g.a(okVar.f65049c);
            ok okVar2 = this.f64945a;
            ti tiVar = okVar2.f65050d;
            okVar2.f65051e.get();
            tiVar.a();
        }
    }
}
