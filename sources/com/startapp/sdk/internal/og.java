package com.startapp.sdk.internal;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class og implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f65042a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f65043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f65044c;

    public og(Executor executor) {
        this.f65043b = executor;
    }

    public final synchronized void a() {
        Runnable runnable = (Runnable) ((ArrayDeque) this.f65042a).poll();
        this.f65044c = runnable;
        if (runnable != null) {
            this.f65043b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        ((ArrayDeque) this.f65042a).offer(new ng(this, runnable));
        if (this.f65044c == null) {
            a();
        }
    }
}
