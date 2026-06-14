package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: com.ironsource.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4420lf extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C4420lf f43565b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f43566a;

    /* JADX INFO: renamed from: com.ironsource.lf$a */
    private class a extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f43567a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        Handler a() {
            return this.f43567a;
        }

        void b() {
            this.f43567a = new Handler(getLooper());
        }
    }

    private C4420lf() {
        a aVar = new a(getClass().getSimpleName());
        this.f43566a = aVar;
        aVar.start();
        this.f43566a.b();
    }

    public static synchronized C4420lf a() {
        try {
            if (f43565b == null) {
                f43565b = new C4420lf();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f43565b;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f43566a;
        if (aVar == null) {
            return;
        }
        Handler handlerA = aVar.a();
        if (handlerA != null) {
            handlerA.post(runnable);
        }
    }
}
