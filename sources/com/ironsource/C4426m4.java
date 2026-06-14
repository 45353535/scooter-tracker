package com.ironsource;

import java.lang.Thread;

/* JADX INFO: renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4426m4 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f43684a;

    C4426m4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f43684a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        C4445n4 c4445n4 = new C4445n4(th2);
        if (c4445n4.d()) {
            new M5(c4445n4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.f43684a.uncaughtException(thread, th2);
    }
}
