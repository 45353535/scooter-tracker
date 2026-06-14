package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class hd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ od f64629a;

    public hd(od odVar) {
        this.f64629a = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f64629a.f65018c.a()).execute(this.f64629a.f65037v);
    }
}
