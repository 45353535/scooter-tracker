package io.sentry;

import java.lang.Thread;

/* JADX INFO: loaded from: classes3.dex */
interface h9 {

    public static final class a implements h9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f83590a = new a();

        private a() {
        }

        static h9 c() {
            return f83590a;
        }

        @Override // io.sentry.h9
        public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.h9
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}
