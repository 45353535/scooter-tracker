package com.startapp.sdk.internal;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes11.dex */
public final class n8 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f64956a;

    public n8(String str) {
        super(str);
        this.f64956a = new Object();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        synchronized (this.f64956a) {
            this.f64956a.notifyAll();
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        synchronized (this.f64956a) {
            try {
                super.start();
                try {
                    this.f64956a.wait();
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
