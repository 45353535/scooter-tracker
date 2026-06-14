package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes10.dex */
final class HandlerPoster extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f48060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f48062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f48063d;

    HandlerPoster(EventBus eventBus, Looper looper, int i10) {
        super(looper);
        this.f48062c = eventBus;
        this.f48061b = i10;
        this.f48060a = new PendingPostQueue();
    }

    void a(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f48060a.a(pendingPostA);
                if (!this.f48063d) {
                    this.f48063d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostA = this.f48060a.a();
                if (pendingPostA == null) {
                    synchronized (this) {
                        pendingPostA = this.f48060a.a();
                        if (pendingPostA == null) {
                            this.f48063d = false;
                            return;
                        }
                    }
                }
                this.f48062c.a(pendingPostA);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f48061b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f48063d = true;
        } catch (Throwable th2) {
            this.f48063d = false;
            throw th2;
        }
    }
}
