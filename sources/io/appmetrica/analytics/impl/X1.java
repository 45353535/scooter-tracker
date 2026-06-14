package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class X1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f76650e = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ma f76651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5564y6 f76652b = C5186j4.l().n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5489v6 f76653c = new C5489v6();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fn f76654d = new Fn();

    public X1(C5389r6 c5389r6) {
        this.f76651a = c5389r6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        StackTraceElement[] stackTraceElementArrB;
        try {
            f76650e.set(true);
            Ma ma2 = this.f76651a;
            C5581yn c5581ynApply = this.f76653c.apply(thread);
            Fn fn = this.f76654d;
            Thread threadA = fn.f75798a.a();
            ArrayList arrayListA = fn.a(threadA, thread);
            if (thread != threadA) {
                try {
                    stackTraceElementArrB = fn.f75798a.b();
                    if (stackTraceElementArrB == null) {
                        try {
                            stackTraceElementArrB = threadA.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArrB = null;
                }
                arrayListA.add(0, (C5581yn) fn.f75799b.apply(threadA, stackTraceElementArrB));
            }
            ma2.a(th2, new V(c5581ynApply, arrayListA, this.f76652b.f78574a.a()));
        } catch (Throwable th3) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th3, th3.getMessage(), new Object[0]);
        }
    }
}
