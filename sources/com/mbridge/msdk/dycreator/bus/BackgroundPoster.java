package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
final class BackgroundPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f48037a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f48038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f48039c;

    BackgroundPoster(EventBus eventBus) {
        this.f48039c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f48037a.a(pendingPostA);
                if (!this.f48038b) {
                    this.f48038b = true;
                    EventBus.f48040n.execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA;
        while (true) {
            try {
                try {
                    pendingPostA = this.f48037a.a(1000);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f48038b = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f48038b = false;
                throw th2;
            }
            if (pendingPostA == null) {
                synchronized (this) {
                    pendingPostA = this.f48037a.a();
                    if (pendingPostA == null) {
                        this.f48038b = false;
                        this.f48038b = false;
                        return;
                    }
                    this.f48038b = false;
                    throw th2;
                }
            }
            this.f48039c.a(pendingPostA);
        }
    }
}
