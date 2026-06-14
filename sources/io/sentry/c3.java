package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
final class c3 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c3 f83305a = new c3();

    private c3() {
    }

    public static /* synthetic */ Object c() {
        return null;
    }

    public static /* synthetic */ Object d() {
        return null;
    }

    public static f1 e() {
        return f83305a;
    }

    @Override // io.sentry.f1
    public void a() {
    }

    @Override // io.sentry.f1
    public void b(long j10) {
    }

    @Override // io.sentry.f1
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.f1
    public Future schedule(Runnable runnable, long j10) {
        return new FutureTask(new Callable() { // from class: io.sentry.b3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c3.d();
            }
        });
    }

    @Override // io.sentry.f1
    public Future submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.a3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c3.c();
            }
        });
    }
}
