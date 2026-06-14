package io.sentry.util.thread;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f84316a = Thread.currentThread().getId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f84317b = new c();

    private c() {
    }

    public static c d() {
        return f84317b;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return f(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    public String b() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Thread.currentThread().getId();
    }

    public boolean e(long j10) {
        return f84316a == j10;
    }

    public boolean f(Thread thread) {
        return e(thread.getId());
    }
}
