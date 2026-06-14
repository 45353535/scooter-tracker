package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class UncaughtExceptionHandlers {

    @VisibleForTesting
    static final class Exiter implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final LazyLogger f31628c = new LazyLogger(Exiter.class);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runtime f31629b;

        Exiter(Runtime runtime) {
            this.f31629b = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            try {
                f31628c.a().log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th2);
            } catch (Throwable th3) {
                try {
                    System.err.println(th2.getMessage());
                    System.err.println(th3.getMessage());
                } finally {
                    this.f31629b.exit(1);
                }
            }
        }
    }

    public static Thread.UncaughtExceptionHandler systemExit() {
        return new Exiter(Runtime.getRuntime());
    }
}
