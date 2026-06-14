package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread f82298b;

    ApplicationNotResponding(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) io.sentry.util.w.c(thread, "Thread must be provided.");
        this.f82298b = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    public Thread d() {
        return this.f82298b;
    }
}
