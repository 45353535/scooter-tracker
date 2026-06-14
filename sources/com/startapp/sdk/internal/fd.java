package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class fd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ od f64503a;

    public fd(od odVar) {
        this.f64503a = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f64503a.f65018c.a()).execute(this.f64503a.f65035t);
    }
}
