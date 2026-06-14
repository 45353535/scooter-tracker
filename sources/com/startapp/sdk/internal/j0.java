package com.startapp.sdk.internal;

import java.lang.Thread;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f64740a;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            try {
            } catch (Throwable th3) {
                th3.printStackTrace();
                return;
            }
            if (vi.a(th2) != null) {
                if ("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n".equals(th2.getMessage())) {
                    try {
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f64740a;
                        if (uncaughtExceptionHandler != null) {
                            uncaughtExceptionHandler.uncaughtException(thread, th2);
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                        return;
                    }
                }
                g9.a(th2, h9.f64612g);
                th3.printStackTrace();
                return;
            }
            try {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f64740a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th2);
                }
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
        } catch (Throwable unused) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f64740a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th2);
            }
        }
    }
}
